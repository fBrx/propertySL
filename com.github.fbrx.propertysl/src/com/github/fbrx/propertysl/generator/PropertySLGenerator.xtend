/*
 * generated by Xtext
 */
package com.github.fbrx.propertysl.generator

import com.google.inject.Inject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.naming.IQualifiedNameProvider
import com.github.fbrx.propertysl.propertySL.Package
import com.github.fbrx.propertysl.propertySL.SimplePropertyValue
import com.github.fbrx.propertysl.propertySL.ComplexPropertyValue
import com.github.fbrx.propertysl.propertySL.DefaultableLocale
import com.github.fbrx.propertysl.propertySL.AbstractPropertyValue
import com.github.fbrx.propertysl.propertySL.ComplexPropertyValueItem
import java.text.SimpleDateFormat
import java.text.DateFormat
import java.util.Date

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class PropertySLGenerator implements IGenerator {
	
	@Inject extension IQualifiedNameProvider
	 
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

	def compile(Package pkg, DefaultableLocale locale)'''
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
		
		«IF pkg.commentlines != null && pkg.commentlines.size > 0»
			####
			«FOR l : pkg.commentlines»
				##  «l.substring(1).trim»
			«ENDFOR»
			####
		«ENDIF»
		
		«FOR p:pkg.properties»
			«p.compile(locale)»
		«ENDFOR»
	'''
	
	def compile(com.github.fbrx.propertysl.propertySL.Property prop, DefaultableLocale dl)'''
		«IF checkIfValueExistsForLang(prop, dl)»
			«IF prop.commentlines != null && prop.commentlines.size > 0»
				«FOR l : prop.commentlines»
					#### «l.substring(1).trim»
				«ENDFOR»
			«ENDIF»
			«prop.eContainer.fullyQualifiedName».«prop.key» = «prop.value.compile(dl)»
		«ENDIF»
	'''
	
	def compile(AbstractPropertyValue pv, DefaultableLocale dl){
		if(pv instanceof SimplePropertyValue){
			(pv as SimplePropertyValue).compile(dl)
		}else if(pv instanceof ComplexPropertyValue){
			(pv as ComplexPropertyValue).compile(dl)
		}
	}

	def compile(SimplePropertyValue spv, DefaultableLocale dl)'''
		«spv.value»
	'''

	def compile(ComplexPropertyValue spv, DefaultableLocale dl)'''
		«val item = spv.items.filter[it.lang.equals(dl.lang)].head»
		«IF item != null»
			«item.value.value»		
		«ENDIF»
	'''
	
	def boolean checkIfValueExistsForLang(com.github.fbrx.propertysl.propertySL.Property prop, DefaultableLocale locale){
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
