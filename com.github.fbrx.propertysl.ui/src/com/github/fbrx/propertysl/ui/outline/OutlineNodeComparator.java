package com.github.fbrx.propertysl.ui.outline;

import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.actions.SortOutlineContribution.DefaultComparator;
import org.eclipse.xtext.ui.editor.outline.impl.EObjectNode;

import com.github.fbrx.propertysl.propertySL.Package;
import com.github.fbrx.propertysl.propertySL.Property;

public class OutlineNodeComparator extends DefaultComparator{

	@Override
	public int getCategory(IOutlineNode node) {
		if(node instanceof EObjectNode) {
			Class<?> instance = ((EObjectNode)node).getEClass().getInstanceClass();
			if(instance == Package.class)
				return 0;
			else if(instance == Property.class)
				return 10;
		}
		return super.getCategory(node);
	}
	
}
