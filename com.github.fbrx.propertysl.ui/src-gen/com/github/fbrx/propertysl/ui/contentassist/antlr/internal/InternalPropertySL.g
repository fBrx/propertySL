/*
* generated by Xtext
*/
grammar InternalPropertySL;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package com.github.fbrx.propertysl.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package com.github.fbrx.propertysl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import com.github.fbrx.propertysl.services.PropertySLGrammarAccess;

}

@parser::members {
 
 	private PropertySLGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(PropertySLGrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }
    
    @Override
    protected String getValueForTokenName(String tokenName) {
    	return tokenName;
    }

}




// Entry rule entryRuleModel
entryRuleModel 
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getModelAccess().getPackagesAssignment()); }
(rule__Model__PackagesAssignment)*
{ after(grammarAccess.getModelAccess().getPackagesAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRulePackage
entryRulePackage 
:
{ before(grammarAccess.getPackageRule()); }
	 rulePackage
{ after(grammarAccess.getPackageRule()); } 
	 EOF 
;

// Rule Package
rulePackage
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getPackageAccess().getGroup()); }
(rule__Package__Group__0)
{ after(grammarAccess.getPackageAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleFQN
entryRuleFQN 
:
{ before(grammarAccess.getFQNRule()); }
	 ruleFQN
{ after(grammarAccess.getFQNRule()); } 
	 EOF 
;

// Rule FQN
ruleFQN
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getFQNAccess().getGroup()); }
(rule__FQN__Group__0)
{ after(grammarAccess.getFQNAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleProperty
entryRuleProperty 
:
{ before(grammarAccess.getPropertyRule()); }
	 ruleProperty
{ after(grammarAccess.getPropertyRule()); } 
	 EOF 
;

// Rule Property
ruleProperty
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getPropertyAccess().getGroup()); }
(rule__Property__Group__0)
{ after(grammarAccess.getPropertyAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRulePropertyKey
entryRulePropertyKey 
:
{ before(grammarAccess.getPropertyKeyRule()); }
	 rulePropertyKey
{ after(grammarAccess.getPropertyKeyRule()); } 
	 EOF 
;

// Rule PropertyKey
rulePropertyKey
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getPropertyKeyAccess().getIDTerminalRuleCall()); }
	RULE_ID
{ after(grammarAccess.getPropertyKeyAccess().getIDTerminalRuleCall()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleAbstractPropertyValue
entryRuleAbstractPropertyValue 
:
{ before(grammarAccess.getAbstractPropertyValueRule()); }
	 ruleAbstractPropertyValue
{ after(grammarAccess.getAbstractPropertyValueRule()); } 
	 EOF 
;

// Rule AbstractPropertyValue
ruleAbstractPropertyValue
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getAbstractPropertyValueAccess().getAlternatives()); }
(rule__AbstractPropertyValue__Alternatives)
{ after(grammarAccess.getAbstractPropertyValueAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleSimplePropertyValue
entryRuleSimplePropertyValue 
:
{ before(grammarAccess.getSimplePropertyValueRule()); }
	 ruleSimplePropertyValue
{ after(grammarAccess.getSimplePropertyValueRule()); } 
	 EOF 
;

// Rule SimplePropertyValue
ruleSimplePropertyValue
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getSimplePropertyValueAccess().getValueAssignment()); }
(rule__SimplePropertyValue__ValueAssignment)
{ after(grammarAccess.getSimplePropertyValueAccess().getValueAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleComplexPropertyValue
entryRuleComplexPropertyValue 
:
{ before(grammarAccess.getComplexPropertyValueRule()); }
	 ruleComplexPropertyValue
{ after(grammarAccess.getComplexPropertyValueRule()); } 
	 EOF 
;

// Rule ComplexPropertyValue
ruleComplexPropertyValue
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getComplexPropertyValueAccess().getGroup()); }
(rule__ComplexPropertyValue__Group__0)
{ after(grammarAccess.getComplexPropertyValueAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleComplexPropertyValueItem
entryRuleComplexPropertyValueItem 
:
{ before(grammarAccess.getComplexPropertyValueItemRule()); }
	 ruleComplexPropertyValueItem
{ after(grammarAccess.getComplexPropertyValueItemRule()); } 
	 EOF 
;

// Rule ComplexPropertyValueItem
ruleComplexPropertyValueItem
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getComplexPropertyValueItemAccess().getGroup()); }
(rule__ComplexPropertyValueItem__Group__0)
{ after(grammarAccess.getComplexPropertyValueItemAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleDefaultLocale
entryRuleDefaultLocale 
:
{ before(grammarAccess.getDefaultLocaleRule()); }
	 ruleDefaultLocale
{ after(grammarAccess.getDefaultLocaleRule()); } 
	 EOF 
;

// Rule DefaultLocale
ruleDefaultLocale
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getDefaultLocaleAccess().getGroup()); }
(rule__DefaultLocale__Group__0)
{ after(grammarAccess.getDefaultLocaleAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}




rule__AbstractPropertyValue__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAbstractPropertyValueAccess().getSimplePropertyValueParserRuleCall_0()); }
	ruleSimplePropertyValue
{ after(grammarAccess.getAbstractPropertyValueAccess().getSimplePropertyValueParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getAbstractPropertyValueAccess().getComplexPropertyValueParserRuleCall_1()); }
	ruleComplexPropertyValue
{ after(grammarAccess.getAbstractPropertyValueAccess().getComplexPropertyValueParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__Package__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Package__Group__0__Impl
	rule__Package__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Package__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPackageAccess().getPackageKeyword_0()); }

	'package' 

{ after(grammarAccess.getPackageAccess().getPackageKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Package__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Package__Group__1__Impl
	rule__Package__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Package__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPackageAccess().getNameAssignment_1()); }
(rule__Package__NameAssignment_1)
{ after(grammarAccess.getPackageAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Package__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Package__Group__2__Impl
	rule__Package__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Package__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Package__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Package__Group__3__Impl
	rule__Package__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Package__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPackageAccess().getDefaultLocaleAssignment_3()); }
(rule__Package__DefaultLocaleAssignment_3)?
{ after(grammarAccess.getPackageAccess().getDefaultLocaleAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Package__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Package__Group__4__Impl
	rule__Package__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Package__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPackageAccess().getPackagesAssignment_4()); }
(rule__Package__PackagesAssignment_4)*
{ after(grammarAccess.getPackageAccess().getPackagesAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Package__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Package__Group__5__Impl
	rule__Package__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Package__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPackageAccess().getPropertiesAssignment_5()); }
(rule__Package__PropertiesAssignment_5)*
{ after(grammarAccess.getPackageAccess().getPropertiesAssignment_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Package__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Package__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Package__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_6()); }

	'}' 

{ after(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}
















rule__FQN__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FQN__Group__0__Impl
	rule__FQN__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FQN__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
{ after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__FQN__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FQN__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FQN__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFQNAccess().getGroup_1()); }
(rule__FQN__Group_1__0)*
{ after(grammarAccess.getFQNAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__FQN__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FQN__Group_1__0__Impl
	rule__FQN__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FQN__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); }

	'.' 

{ after(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__FQN__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__FQN__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FQN__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); }
	RULE_ID
{ after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Property__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Property__Group__0__Impl
	rule__Property__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyAccess().getKeyAssignment_0()); }
(rule__Property__KeyAssignment_0)
{ after(grammarAccess.getPropertyAccess().getKeyAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Property__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Property__Group__1__Impl
	rule__Property__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyAccess().getEqualsSignKeyword_1()); }

	'=' 

{ after(grammarAccess.getPropertyAccess().getEqualsSignKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Property__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Property__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyAccess().getValueAssignment_2()); }
(rule__Property__ValueAssignment_2)
{ after(grammarAccess.getPropertyAccess().getValueAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__ComplexPropertyValue__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComplexPropertyValue__Group__0__Impl
	rule__ComplexPropertyValue__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComplexPropertyValue__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComplexPropertyValueAccess().getLeftCurlyBracketKeyword_0()); }

	'{' 

{ after(grammarAccess.getComplexPropertyValueAccess().getLeftCurlyBracketKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComplexPropertyValue__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComplexPropertyValue__Group__1__Impl
	rule__ComplexPropertyValue__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ComplexPropertyValue__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getComplexPropertyValueAccess().getItemsAssignment_1()); }
(rule__ComplexPropertyValue__ItemsAssignment_1)
{ after(grammarAccess.getComplexPropertyValueAccess().getItemsAssignment_1()); }
)
(
{ before(grammarAccess.getComplexPropertyValueAccess().getItemsAssignment_1()); }
(rule__ComplexPropertyValue__ItemsAssignment_1)*
{ after(grammarAccess.getComplexPropertyValueAccess().getItemsAssignment_1()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComplexPropertyValue__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComplexPropertyValue__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComplexPropertyValue__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComplexPropertyValueAccess().getRightCurlyBracketKeyword_2()); }

	'}' 

{ after(grammarAccess.getComplexPropertyValueAccess().getRightCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__ComplexPropertyValueItem__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComplexPropertyValueItem__Group__0__Impl
	rule__ComplexPropertyValueItem__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ComplexPropertyValueItem__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComplexPropertyValueItemAccess().getLangAssignment_0()); }
(rule__ComplexPropertyValueItem__LangAssignment_0)
{ after(grammarAccess.getComplexPropertyValueItemAccess().getLangAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComplexPropertyValueItem__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComplexPropertyValueItem__Group__1__Impl
	rule__ComplexPropertyValueItem__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ComplexPropertyValueItem__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComplexPropertyValueItemAccess().getColonKeyword_1()); }

	':' 

{ after(grammarAccess.getComplexPropertyValueItemAccess().getColonKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ComplexPropertyValueItem__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ComplexPropertyValueItem__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ComplexPropertyValueItem__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComplexPropertyValueItemAccess().getValueAssignment_2()); }
(rule__ComplexPropertyValueItem__ValueAssignment_2)
{ after(grammarAccess.getComplexPropertyValueItemAccess().getValueAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__DefaultLocale__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DefaultLocale__Group__0__Impl
	rule__DefaultLocale__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DefaultLocale__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDefaultLocaleAccess().getDEFAULT_LOCALEKeyword_0()); }

	'DEFAULT_LOCALE' 

{ after(grammarAccess.getDefaultLocaleAccess().getDEFAULT_LOCALEKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DefaultLocale__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DefaultLocale__Group__1__Impl
	rule__DefaultLocale__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DefaultLocale__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDefaultLocaleAccess().getEqualsSignKeyword_1()); }

	'=' 

{ after(grammarAccess.getDefaultLocaleAccess().getEqualsSignKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DefaultLocale__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DefaultLocale__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DefaultLocale__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDefaultLocaleAccess().getLangAssignment_2()); }
(rule__DefaultLocale__LangAssignment_2)
{ after(grammarAccess.getDefaultLocaleAccess().getLangAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}









rule__Model__PackagesAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getPackagesPackageParserRuleCall_0()); }
	rulePackage{ after(grammarAccess.getModelAccess().getPackagesPackageParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Package__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPackageAccess().getNameFQNParserRuleCall_1_0()); }
	ruleFQN{ after(grammarAccess.getPackageAccess().getNameFQNParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Package__DefaultLocaleAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPackageAccess().getDefaultLocaleDefaultLocaleParserRuleCall_3_0()); }
	ruleDefaultLocale{ after(grammarAccess.getPackageAccess().getDefaultLocaleDefaultLocaleParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Package__PackagesAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPackageAccess().getPackagesPackageParserRuleCall_4_0()); }
	rulePackage{ after(grammarAccess.getPackageAccess().getPackagesPackageParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Package__PropertiesAssignment_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPackageAccess().getPropertiesPropertyParserRuleCall_5_0()); }
	ruleProperty{ after(grammarAccess.getPackageAccess().getPropertiesPropertyParserRuleCall_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Property__KeyAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyAccess().getKeyPropertyKeyParserRuleCall_0_0()); }
	rulePropertyKey{ after(grammarAccess.getPropertyAccess().getKeyPropertyKeyParserRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Property__ValueAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyAccess().getValueAbstractPropertyValueParserRuleCall_2_0()); }
	ruleAbstractPropertyValue{ after(grammarAccess.getPropertyAccess().getValueAbstractPropertyValueParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__SimplePropertyValue__ValueAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSimplePropertyValueAccess().getValueSTRINGTerminalRuleCall_0()); }
	RULE_STRING{ after(grammarAccess.getSimplePropertyValueAccess().getValueSTRINGTerminalRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ComplexPropertyValue__ItemsAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComplexPropertyValueAccess().getItemsComplexPropertyValueItemParserRuleCall_1_0()); }
	ruleComplexPropertyValueItem{ after(grammarAccess.getComplexPropertyValueAccess().getItemsComplexPropertyValueItemParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ComplexPropertyValueItem__LangAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComplexPropertyValueItemAccess().getLangLOCALETerminalRuleCall_0_0()); }
	RULE_LOCALE{ after(grammarAccess.getComplexPropertyValueItemAccess().getLangLOCALETerminalRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ComplexPropertyValueItem__ValueAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComplexPropertyValueItemAccess().getValueSimplePropertyValueParserRuleCall_2_0()); }
	ruleSimplePropertyValue{ after(grammarAccess.getComplexPropertyValueItemAccess().getValueSimplePropertyValueParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__DefaultLocale__LangAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDefaultLocaleAccess().getLangLOCALETerminalRuleCall_2_0()); }
	RULE_LOCALE{ after(grammarAccess.getDefaultLocaleAccess().getLangLOCALETerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_LOCALE : 'a'..'z' 'a'..'z';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


