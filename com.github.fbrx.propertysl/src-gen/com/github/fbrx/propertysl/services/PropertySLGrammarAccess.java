/*
* generated by Xtext
*/
package com.github.fbrx.propertysl.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class PropertySLGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Model");
		private final Assignment cPackagesAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cPackagesPackageParserRuleCall_0 = (RuleCall)cPackagesAssignment.eContents().get(0);
		
		//Model:
		//	packages+=Package*;
		public ParserRule getRule() { return rule; }

		//packages+=Package*
		public Assignment getPackagesAssignment() { return cPackagesAssignment; }

		//Package
		public RuleCall getPackagesPackageParserRuleCall_0() { return cPackagesPackageParserRuleCall_0; }
	}

	public class PackageElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Package");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPackageKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameFQNParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cSupportedLocalesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSupportedLocalesSupportedLocalesParserRuleCall_3_0 = (RuleCall)cSupportedLocalesAssignment_3.eContents().get(0);
		private final Alternatives cAlternatives_4 = (Alternatives)cGroup.eContents().get(4);
		private final Assignment cPackagesAssignment_4_0 = (Assignment)cAlternatives_4.eContents().get(0);
		private final RuleCall cPackagesPackageParserRuleCall_4_0_0 = (RuleCall)cPackagesAssignment_4_0.eContents().get(0);
		private final Assignment cPropertiesAssignment_4_1 = (Assignment)cAlternatives_4.eContents().get(1);
		private final RuleCall cPropertiesPropertyParserRuleCall_4_1_0 = (RuleCall)cPropertiesAssignment_4_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Package:
		//	"package" name=FQN "{" supportedLocales=SupportedLocales? (packages+=Package | properties+=Property)* "}";
		public ParserRule getRule() { return rule; }

		//"package" name=FQN "{" supportedLocales=SupportedLocales? (packages+=Package | properties+=Property)* "}"
		public Group getGroup() { return cGroup; }

		//"package"
		public Keyword getPackageKeyword_0() { return cPackageKeyword_0; }

		//name=FQN
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//FQN
		public RuleCall getNameFQNParserRuleCall_1_0() { return cNameFQNParserRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//supportedLocales=SupportedLocales?
		public Assignment getSupportedLocalesAssignment_3() { return cSupportedLocalesAssignment_3; }

		//SupportedLocales
		public RuleCall getSupportedLocalesSupportedLocalesParserRuleCall_3_0() { return cSupportedLocalesSupportedLocalesParserRuleCall_3_0; }

		//(packages+=Package | properties+=Property)*
		public Alternatives getAlternatives_4() { return cAlternatives_4; }

		//packages+=Package
		public Assignment getPackagesAssignment_4_0() { return cPackagesAssignment_4_0; }

		//Package
		public RuleCall getPackagesPackageParserRuleCall_4_0_0() { return cPackagesPackageParserRuleCall_4_0_0; }

		//properties+=Property
		public Assignment getPropertiesAssignment_4_1() { return cPropertiesAssignment_4_1; }

		//Property
		public RuleCall getPropertiesPropertyParserRuleCall_4_1_0() { return cPropertiesPropertyParserRuleCall_4_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}

	public class SupportedLocalesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "SupportedLocales");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSUPPORTED_LOCALESKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cEqualsSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cLocalesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cLocalesDefaultableLocaleParserRuleCall_3_0 = (RuleCall)cLocalesAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cCommaKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cLocalesAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cLocalesDefaultableLocaleParserRuleCall_4_1_0 = (RuleCall)cLocalesAssignment_4_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//SupportedLocales:
		//	"SUPPORTED_LOCALES" "=" "{" locales+=DefaultableLocale ("," locales+=DefaultableLocale)* "}";
		public ParserRule getRule() { return rule; }

		//"SUPPORTED_LOCALES" "=" "{" locales+=DefaultableLocale ("," locales+=DefaultableLocale)* "}"
		public Group getGroup() { return cGroup; }

		//"SUPPORTED_LOCALES"
		public Keyword getSUPPORTED_LOCALESKeyword_0() { return cSUPPORTED_LOCALESKeyword_0; }

		//"="
		public Keyword getEqualsSignKeyword_1() { return cEqualsSignKeyword_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//locales+=DefaultableLocale
		public Assignment getLocalesAssignment_3() { return cLocalesAssignment_3; }

		//DefaultableLocale
		public RuleCall getLocalesDefaultableLocaleParserRuleCall_3_0() { return cLocalesDefaultableLocaleParserRuleCall_3_0; }

		//("," locales+=DefaultableLocale)*
		public Group getGroup_4() { return cGroup_4; }

		//","
		public Keyword getCommaKeyword_4_0() { return cCommaKeyword_4_0; }

		//locales+=DefaultableLocale
		public Assignment getLocalesAssignment_4_1() { return cLocalesAssignment_4_1; }

		//DefaultableLocale
		public RuleCall getLocalesDefaultableLocaleParserRuleCall_4_1_0() { return cLocalesDefaultableLocaleParserRuleCall_4_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}

	public class FQNElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "FQN");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//FQN:
		//	ID ("." ID)*;
		public ParserRule getRule() { return rule; }

		//ID ("." ID)*
		public Group getGroup() { return cGroup; }

		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }

		//("." ID)*
		public Group getGroup_1() { return cGroup_1; }

		//"."
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}

	public class PropertyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Property");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cKeyAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cKeyPropertyKeyParserRuleCall_0_0 = (RuleCall)cKeyAssignment_0.eContents().get(0);
		private final Keyword cEqualsSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValueAbstractPropertyValueParserRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		
		//Property:
		//	key=PropertyKey "=" value=AbstractPropertyValue;
		public ParserRule getRule() { return rule; }

		//key=PropertyKey "=" value=AbstractPropertyValue
		public Group getGroup() { return cGroup; }

		//key=PropertyKey
		public Assignment getKeyAssignment_0() { return cKeyAssignment_0; }

		//PropertyKey
		public RuleCall getKeyPropertyKeyParserRuleCall_0_0() { return cKeyPropertyKeyParserRuleCall_0_0; }

		//"="
		public Keyword getEqualsSignKeyword_1() { return cEqualsSignKeyword_1; }

		//value=AbstractPropertyValue
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }

		//AbstractPropertyValue
		public RuleCall getValueAbstractPropertyValueParserRuleCall_2_0() { return cValueAbstractPropertyValueParserRuleCall_2_0; }
	}

	public class PropertyKeyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "PropertyKey");
		private final RuleCall cIDTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//PropertyKey:
		//	ID;
		public ParserRule getRule() { return rule; }

		//ID
		public RuleCall getIDTerminalRuleCall() { return cIDTerminalRuleCall; }
	}

	public class AbstractPropertyValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AbstractPropertyValue");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSimplePropertyValueParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cComplexPropertyValueParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//AbstractPropertyValue:
		//	SimplePropertyValue | ComplexPropertyValue;
		public ParserRule getRule() { return rule; }

		//SimplePropertyValue | ComplexPropertyValue
		public Alternatives getAlternatives() { return cAlternatives; }

		//SimplePropertyValue
		public RuleCall getSimplePropertyValueParserRuleCall_0() { return cSimplePropertyValueParserRuleCall_0; }

		//ComplexPropertyValue
		public RuleCall getComplexPropertyValueParserRuleCall_1() { return cComplexPropertyValueParserRuleCall_1; }
	}

	public class SimplePropertyValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "SimplePropertyValue");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueSTRINGTerminalRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//SimplePropertyValue:
		//	value=STRING;
		public ParserRule getRule() { return rule; }

		//value=STRING
		public Assignment getValueAssignment() { return cValueAssignment; }

		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_0() { return cValueSTRINGTerminalRuleCall_0; }
	}

	public class ComplexPropertyValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ComplexPropertyValue");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cItemsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cItemsComplexPropertyValueItemParserRuleCall_1_0 = (RuleCall)cItemsAssignment_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//ComplexPropertyValue:
		//	"{" items+=ComplexPropertyValueItem+ "}";
		public ParserRule getRule() { return rule; }

		//"{" items+=ComplexPropertyValueItem+ "}"
		public Group getGroup() { return cGroup; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_0() { return cLeftCurlyBracketKeyword_0; }

		//items+=ComplexPropertyValueItem+
		public Assignment getItemsAssignment_1() { return cItemsAssignment_1; }

		//ComplexPropertyValueItem
		public RuleCall getItemsComplexPropertyValueItemParserRuleCall_1_0() { return cItemsComplexPropertyValueItemParserRuleCall_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_2() { return cRightCurlyBracketKeyword_2; }
	}

	public class ComplexPropertyValueItemElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ComplexPropertyValueItem");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cLangAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cLangLOCALETerminalRuleCall_0_0 = (RuleCall)cLangAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValueSimplePropertyValueParserRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		
		//ComplexPropertyValueItem:
		//	lang=LOCALE ":" value=SimplePropertyValue;
		public ParserRule getRule() { return rule; }

		//lang=LOCALE ":" value=SimplePropertyValue
		public Group getGroup() { return cGroup; }

		//lang=LOCALE
		public Assignment getLangAssignment_0() { return cLangAssignment_0; }

		//LOCALE
		public RuleCall getLangLOCALETerminalRuleCall_0_0() { return cLangLOCALETerminalRuleCall_0_0; }

		//":"
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }

		//value=SimplePropertyValue
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }

		//SimplePropertyValue
		public RuleCall getValueSimplePropertyValueParserRuleCall_2_0() { return cValueSimplePropertyValueParserRuleCall_2_0; }
	}

	public class DefaultableLocaleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "DefaultableLocale");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cIsDefaultAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cIsDefaultDefaultKeyword_0_0 = (Keyword)cIsDefaultAssignment_0.eContents().get(0);
		private final Assignment cLangAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cLangLOCALETerminalRuleCall_1_0 = (RuleCall)cLangAssignment_1.eContents().get(0);
		
		//DefaultableLocale:
		//	isDefault?="default"? lang=LOCALE;
		public ParserRule getRule() { return rule; }

		//isDefault?="default"? lang=LOCALE
		public Group getGroup() { return cGroup; }

		//isDefault?="default"?
		public Assignment getIsDefaultAssignment_0() { return cIsDefaultAssignment_0; }

		//"default"
		public Keyword getIsDefaultDefaultKeyword_0_0() { return cIsDefaultDefaultKeyword_0_0; }

		//lang=LOCALE
		public Assignment getLangAssignment_1() { return cLangAssignment_1; }

		//LOCALE
		public RuleCall getLangLOCALETerminalRuleCall_1_0() { return cLangLOCALETerminalRuleCall_1_0; }
	}
	
	
	private ModelElements pModel;
	private PackageElements pPackage;
	private SupportedLocalesElements pSupportedLocales;
	private FQNElements pFQN;
	private PropertyElements pProperty;
	private PropertyKeyElements pPropertyKey;
	private AbstractPropertyValueElements pAbstractPropertyValue;
	private SimplePropertyValueElements pSimplePropertyValue;
	private ComplexPropertyValueElements pComplexPropertyValue;
	private ComplexPropertyValueItemElements pComplexPropertyValueItem;
	private DefaultableLocaleElements pDefaultableLocale;
	private TerminalRule tLOCALE;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public PropertySLGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("com.github.fbrx.propertysl.PropertySL".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	packages+=Package*;
	public ModelElements getModelAccess() {
		return (pModel != null) ? pModel : (pModel = new ModelElements());
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}

	//Package:
	//	"package" name=FQN "{" supportedLocales=SupportedLocales? (packages+=Package | properties+=Property)* "}";
	public PackageElements getPackageAccess() {
		return (pPackage != null) ? pPackage : (pPackage = new PackageElements());
	}
	
	public ParserRule getPackageRule() {
		return getPackageAccess().getRule();
	}

	//SupportedLocales:
	//	"SUPPORTED_LOCALES" "=" "{" locales+=DefaultableLocale ("," locales+=DefaultableLocale)* "}";
	public SupportedLocalesElements getSupportedLocalesAccess() {
		return (pSupportedLocales != null) ? pSupportedLocales : (pSupportedLocales = new SupportedLocalesElements());
	}
	
	public ParserRule getSupportedLocalesRule() {
		return getSupportedLocalesAccess().getRule();
	}

	//FQN:
	//	ID ("." ID)*;
	public FQNElements getFQNAccess() {
		return (pFQN != null) ? pFQN : (pFQN = new FQNElements());
	}
	
	public ParserRule getFQNRule() {
		return getFQNAccess().getRule();
	}

	//Property:
	//	key=PropertyKey "=" value=AbstractPropertyValue;
	public PropertyElements getPropertyAccess() {
		return (pProperty != null) ? pProperty : (pProperty = new PropertyElements());
	}
	
	public ParserRule getPropertyRule() {
		return getPropertyAccess().getRule();
	}

	//PropertyKey:
	//	ID;
	public PropertyKeyElements getPropertyKeyAccess() {
		return (pPropertyKey != null) ? pPropertyKey : (pPropertyKey = new PropertyKeyElements());
	}
	
	public ParserRule getPropertyKeyRule() {
		return getPropertyKeyAccess().getRule();
	}

	//AbstractPropertyValue:
	//	SimplePropertyValue | ComplexPropertyValue;
	public AbstractPropertyValueElements getAbstractPropertyValueAccess() {
		return (pAbstractPropertyValue != null) ? pAbstractPropertyValue : (pAbstractPropertyValue = new AbstractPropertyValueElements());
	}
	
	public ParserRule getAbstractPropertyValueRule() {
		return getAbstractPropertyValueAccess().getRule();
	}

	//SimplePropertyValue:
	//	value=STRING;
	public SimplePropertyValueElements getSimplePropertyValueAccess() {
		return (pSimplePropertyValue != null) ? pSimplePropertyValue : (pSimplePropertyValue = new SimplePropertyValueElements());
	}
	
	public ParserRule getSimplePropertyValueRule() {
		return getSimplePropertyValueAccess().getRule();
	}

	//ComplexPropertyValue:
	//	"{" items+=ComplexPropertyValueItem+ "}";
	public ComplexPropertyValueElements getComplexPropertyValueAccess() {
		return (pComplexPropertyValue != null) ? pComplexPropertyValue : (pComplexPropertyValue = new ComplexPropertyValueElements());
	}
	
	public ParserRule getComplexPropertyValueRule() {
		return getComplexPropertyValueAccess().getRule();
	}

	//ComplexPropertyValueItem:
	//	lang=LOCALE ":" value=SimplePropertyValue;
	public ComplexPropertyValueItemElements getComplexPropertyValueItemAccess() {
		return (pComplexPropertyValueItem != null) ? pComplexPropertyValueItem : (pComplexPropertyValueItem = new ComplexPropertyValueItemElements());
	}
	
	public ParserRule getComplexPropertyValueItemRule() {
		return getComplexPropertyValueItemAccess().getRule();
	}

	//DefaultableLocale:
	//	isDefault?="default"? lang=LOCALE;
	public DefaultableLocaleElements getDefaultableLocaleAccess() {
		return (pDefaultableLocale != null) ? pDefaultableLocale : (pDefaultableLocale = new DefaultableLocaleElements());
	}
	
	public ParserRule getDefaultableLocaleRule() {
		return getDefaultableLocaleAccess().getRule();
	}

	//terminal LOCALE:
	//	"a".."z" "a".."z" ("_" "A".."Z" "A".."Z")?;
	public TerminalRule getLOCALERule() {
		return (tLOCALE != null) ? tLOCALE : (tLOCALE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "LOCALE"));
	} 

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
