/*
 * generated by Xtext
 */
package com.github.fbrx.propertysl.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.outline.impl.OutlineFilterAndSorter.IComparator;

import com.github.fbrx.propertysl.ui.outline.OutlineNodeComparator;

/**
 * Use this class to register components to be used within the IDE.
 */
public class PropertySLUiModule extends com.github.fbrx.propertysl.ui.AbstractPropertySLUiModule {
	public PropertySLUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	@Override
	public Class<? extends IComparator> bindOutlineFilterAndSorter$IComparator() {
		return OutlineNodeComparator.class;
	}
}
