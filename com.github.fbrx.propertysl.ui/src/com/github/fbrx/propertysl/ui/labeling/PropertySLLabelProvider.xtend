/*
* generated by Xtext
*/
package com.github.fbrx.propertysl.ui.labeling

import com.github.fbrx.propertysl.propertySL.DefaultLocale
import com.github.fbrx.propertysl.propertySL.Package
import com.github.fbrx.propertysl.propertySL.Property
import com.github.fbrx.propertysl.propertySL.SimplePropertyValue
import com.google.inject.Inject
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider
import org.eclipse.xtext.ui.PluginImageHelper
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider
import com.github.fbrx.propertysl.propertySL.ComplexPropertyValueItem

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#labelProvider
 */
class PropertySLLabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	PluginImageHelper imgHelper

	@Inject
	new(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	def text(Package pkg){
		pkg.name
	}
	
	def text(ComplexPropertyValueItem item){
		item.lang + " : " + item.value.value
	}
	
	def text(DefaultLocale dl){
		'DEFAULT_LOCALE' + " : " + dl.lang 
	}
	
	def text(Property prop){
		if(prop.value instanceof SimplePropertyValue){
			prop.key + " : " + (prop.value as SimplePropertyValue).value
		}
	}
	
	def image(DefaultLocale dl){
		return imgHelper.getImage("cog.png");
	}
	
	def image(Package pkg){
		return imgHelper.getImage("list_2.png");
	}
	
	def image(Property prop){
		return imgHelper.getImage("pen_1.png");
	}

 	override protected handleImageError(Object[] params, Throwable e) {
		super.handleImageError(params, e)
	}

}
