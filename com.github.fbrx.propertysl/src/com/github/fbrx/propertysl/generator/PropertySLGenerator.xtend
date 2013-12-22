/*
 * generated by Xtext
 */
package com.github.fbrx.propertysl.generator

import com.github.fbrx.propertysl.propertySL.ComplexPropertyValue
import com.github.fbrx.propertysl.propertySL.ComplexPropertyValueItem
import com.github.fbrx.propertysl.propertySL.DefaultableLocale
import com.github.fbrx.propertysl.propertySL.Package
import com.github.fbrx.propertysl.propertySL.Property
import com.github.fbrx.propertysl.propertySL.SimplePropertyValue
import com.google.inject.Inject
import java.text.SimpleDateFormat
import java.util.Date
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.naming.IQualifiedNameProvider

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class PropertySLGenerator implements IGenerator {
	
	@Inject extension IQualifiedNameProvider
	
	@Inject extension IEObjectDocumentationProvider
	 
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		for(pkg : resource.allContents.toIterable.filter(Package)){
			if(pkg.properties != null && pkg.properties.size > 0){
				
				if(pkg.supportedLocales != null){
					for(locale : pkg.supportedLocales.locales){
						fsa.generateFile(
							pkg.fullyQualifiedName.toString(".") + "_" + locale.lang + ".properties",
							pkg.compile(locale)
						)
						
						if(locale.isDefault)
							fsa.generateFile(
								pkg.fullyQualifiedName.toString(".") + ".properties",
								pkg.compile(locale)
							)
					}
				}else{
					fsa.generateFile(
						pkg.fullyQualifiedName.toString(".") + ".properties",
						pkg.compile(null)
					)
				}
			}
		}
	}

	def dispatch compile(Package pkg, DefaultableLocale locale)'''
		####
		##  package : «pkg.fullyQualifiedName»
		«IF locale == null»
			##  locale  : default locale
		«ELSEIF locale.isDefault»
			##  locale  : «locale.lang» (default)
		«ELSE»
			##  locale  : «locale.lang»
		«ENDIF»
		##
		##  generated by propertySL (https://github.com/fBrx/propertySL) on «new SimpleDateFormat("yyyy-MM-dd @ HH:mm:ss").format(new Date())»
		####
		
		####
		«renderComment(pkg.documentation)»
		####
		
		«FOR p:pkg.properties»
			«p.compile(locale)»
		«ENDFOR»
	'''
	
	def dispatch compile(Property prop, DefaultableLocale dl)'''
		«IF checkIfValueExistsForLang(prop, dl)»
			«renderComment(prop.documentation)»
			«prop.eContainer.fullyQualifiedName».«prop.key» = «prop.value.compile(dl)»
		«ENDIF»
	'''
	
	def renderComment(String comment)'''
		«IF comment != null»
			«var result = comment.replaceAll("\r\n", "\r\n#\t")»
			#	«result»
		«ENDIF»
	'''
	
	
	def dispatch compile(SimplePropertyValue spv, DefaultableLocale dl)'''
		«spv.value»
	'''

	def dispatch compile(ComplexPropertyValue cpv, DefaultableLocale dl)'''
		«val item = cpv.items.filter[it.lang.equals(dl.lang)].head»
		«IF item != null»
			«item.value.value»		
		«ENDIF»
	'''
	
	def dispatch compile(EObject o, DefaultableLocale dl)'''
		«o.toString»
	'''
	
	def boolean checkIfValueExistsForLang(Property prop, DefaultableLocale locale){
		if(prop.value instanceof SimplePropertyValue && (locale == null || locale.isDefault))
			return true
			
		else if(prop.value instanceof ComplexPropertyValue){
			if(locale == null)
				return false
			else{
				for(ComplexPropertyValueItem item : (prop.value as ComplexPropertyValue).items){
					if(item.lang.equals(locale.lang))
						return true
				}
			}
		}
		
		return false;
	}	
			
}
