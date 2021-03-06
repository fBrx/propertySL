/*
* generated by Xtext
*/
package com.github.fbrx.propertysl.ui.outline

import com.github.fbrx.propertysl.propertySL.ComplexPropertyValue
import com.github.fbrx.propertysl.propertySL.ComplexPropertyValueItem
import com.github.fbrx.propertysl.propertySL.Model
import com.github.fbrx.propertysl.propertySL.Package
import com.github.fbrx.propertysl.propertySL.Property
import com.github.fbrx.propertysl.propertySL.SimplePropertyValue
import com.github.fbrx.propertysl.propertySL.SupportedLocales
import org.eclipse.xtext.ui.editor.outline.IOutlineNode
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider
import org.eclipse.xtext.ui.editor.outline.impl.DocumentRootNode

/**
 * Customization of the default outline structure.
 *
 * see http://www.eclipse.org/Xtext/documentation.html#outline
 */
class PropertySLOutlineTreeProvider extends DefaultOutlineTreeProvider {

	def _createChildren(DocumentRootNode parentNode, Model model) {
		for(Package pkg : model.packages){
			createNode(parentNode, pkg);
		}
	}
	
	def _createChildren(IOutlineNode parentNode, Property prop) {
		if(prop.value instanceof ComplexPropertyValue){
			val cProp = (prop.value as ComplexPropertyValue)
			for(ComplexPropertyValueItem item : cProp.items){
				createNode(parentNode, item);
			}
			
		}
	}
	
	def protected _isLeaf(ComplexPropertyValueItem valueItem) {
		true
	}
	
	def protected _isLeaf(SupportedLocales valueItem) {
		true
	}
	
	def protected _isLeaf(Property prop) {
		if(prop.value instanceof SimplePropertyValue)
			true
		else
			false
	}

}
