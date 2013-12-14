/*
* generated by Xtext
*/
grammar InternalPropertySL;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package com.github.fbrx.propertysl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package com.github.fbrx.propertysl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.github.fbrx.propertysl.services.PropertySLGrammarAccess;

}

@parser::members {

 	private PropertySLGrammarAccess grammarAccess;
 	
    public InternalPropertySLParser(TokenStream input, PropertySLGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Model";	
   	}
   	
   	@Override
   	protected PropertySLGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	 iv_ruleModel=ruleModel 
	 { $current=$iv_ruleModel.current; } 
	 EOF 
;

// Rule Model
ruleModel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getPackagesPackageParserRuleCall_0()); 
	    }
		lv_packages_0_0=rulePackage		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"packages",
        		lv_packages_0_0, 
        		"Package");
	        afterParserOrEnumRuleCall();
	    }

)
)*
;





// Entry rule entryRulePackage
entryRulePackage returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getPackageRule()); } 
	 iv_rulePackage=rulePackage 
	 { $current=$iv_rulePackage.current.getText(); }  
	 EOF 
;

// Rule Package
rulePackage returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='package' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getPackageAccess().getPackageKeyword_0()); 
    }

    { 
        newCompositeNode(grammarAccess.getPackageAccess().getFQNParserRuleCall_1()); 
    }
    this_FQN_1=ruleFQN    {
		$current.merge(this_FQN_1);
    }

    { 
        afterParserOrEnumRuleCall();
    }

	kw='{' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2()); 
    }
(
    { 
        newCompositeNode(grammarAccess.getPackageAccess().getDefaultLocaleParserRuleCall_3()); 
    }
    this_DefaultLocale_3=ruleDefaultLocale    {
		$current.merge(this_DefaultLocale_3);
    }

    { 
        afterParserOrEnumRuleCall();
    }
)?(
    { 
        newCompositeNode(grammarAccess.getPackageAccess().getPackageParserRuleCall_4()); 
    }
    this_Package_4=rulePackage    {
		$current.merge(this_Package_4);
    }

    { 
        afterParserOrEnumRuleCall();
    }
)*(
    { 
        newCompositeNode(grammarAccess.getPackageAccess().getPropertyParserRuleCall_5()); 
    }
    this_Property_5=ruleProperty    {
		$current.merge(this_Property_5);
    }

    { 
        afterParserOrEnumRuleCall();
    }
)*
	kw='}' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_6()); 
    }
)
    ;





// Entry rule entryRuleFQN
entryRuleFQN returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getFQNRule()); } 
	 iv_ruleFQN=ruleFQN 
	 { $current=$iv_ruleFQN.current.getText(); }  
	 EOF 
;

// Rule FQN
ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_ID_0=RULE_ID    {
		$current.merge(this_ID_0);
    }

    { 
    newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
    }
(
	kw='.' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
    }
    this_ID_2=RULE_ID    {
		$current.merge(this_ID_2);
    }

    { 
    newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
    }
)*)
    ;





// Entry rule entryRuleProperty
entryRuleProperty returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getPropertyRule()); } 
	 iv_ruleProperty=ruleProperty 
	 { $current=$iv_ruleProperty.current.getText(); }  
	 EOF 
;

// Rule Property
ruleProperty returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getPropertyAccess().getPropertyKeyParserRuleCall_0()); 
    }
    this_PropertyKey_0=rulePropertyKey    {
		$current.merge(this_PropertyKey_0);
    }

    { 
        afterParserOrEnumRuleCall();
    }

	kw='=' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getPropertyAccess().getEqualsSignKeyword_1()); 
    }

    { 
        newCompositeNode(grammarAccess.getPropertyAccess().getPropertyValueParserRuleCall_2()); 
    }
    this_PropertyValue_2=rulePropertyValue    {
		$current.merge(this_PropertyValue_2);
    }

    { 
        afterParserOrEnumRuleCall();
    }
)
    ;





// Entry rule entryRulePropertyKey
entryRulePropertyKey returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getPropertyKeyRule()); } 
	 iv_rulePropertyKey=rulePropertyKey 
	 { $current=$iv_rulePropertyKey.current.getText(); }  
	 EOF 
;

// Rule PropertyKey
rulePropertyKey returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
    this_ID_0=RULE_ID    {
		$current.merge(this_ID_0);
    }

    { 
    newLeafNode(this_ID_0, grammarAccess.getPropertyKeyAccess().getIDTerminalRuleCall()); 
    }

    ;





// Entry rule entryRulePropertyValue
entryRulePropertyValue returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getPropertyValueRule()); } 
	 iv_rulePropertyValue=rulePropertyValue 
	 { $current=$iv_rulePropertyValue.current.getText(); }  
	 EOF 
;

// Rule PropertyValue
rulePropertyValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
    this_ID_0=RULE_ID    {
		$current.merge(this_ID_0);
    }

    { 
    newLeafNode(this_ID_0, grammarAccess.getPropertyValueAccess().getIDTerminalRuleCall()); 
    }

    ;





// Entry rule entryRuleDefaultLocale
entryRuleDefaultLocale returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getDefaultLocaleRule()); } 
	 iv_ruleDefaultLocale=ruleDefaultLocale 
	 { $current=$iv_ruleDefaultLocale.current.getText(); }  
	 EOF 
;

// Rule DefaultLocale
ruleDefaultLocale returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='DEFAULT_LOCALE' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getDefaultLocaleAccess().getDEFAULT_LOCALEKeyword_0()); 
    }

	kw='=' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getDefaultLocaleAccess().getEqualsSignKeyword_1()); 
    }

    { 
        newCompositeNode(grammarAccess.getDefaultLocaleAccess().getLOCALEParserRuleCall_2()); 
    }
    this_LOCALE_2=ruleLOCALE    {
		$current.merge(this_LOCALE_2);
    }

    { 
        afterParserOrEnumRuleCall();
    }
)
    ;





// Entry rule entryRuleLOCALE
entryRuleLOCALE returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getLOCALERule()); } 
	 iv_ruleLOCALE=ruleLOCALE 
	 { $current=$iv_ruleLOCALE.current.getText(); }  
	 EOF 
;

// Rule LOCALE
ruleLOCALE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='de' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getLOCALEAccess().getDeKeyword_0()); 
    }

    |
	kw='en' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getLOCALEAccess().getEnKeyword_1()); 
    }
)
    ;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


