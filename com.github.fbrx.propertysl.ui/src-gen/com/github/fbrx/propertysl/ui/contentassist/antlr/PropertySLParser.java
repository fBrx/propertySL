/*
* generated by Xtext
*/
package com.github.fbrx.propertysl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import com.github.fbrx.propertysl.services.PropertySLGrammarAccess;

public class PropertySLParser extends AbstractContentAssistParser {
	
	@Inject
	private PropertySLGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected com.github.fbrx.propertysl.ui.contentassist.antlr.internal.InternalPropertySLParser createParser() {
		com.github.fbrx.propertysl.ui.contentassist.antlr.internal.InternalPropertySLParser result = new com.github.fbrx.propertysl.ui.contentassist.antlr.internal.InternalPropertySLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getLOCALEAccess().getAlternatives(), "rule__LOCALE__Alternatives");
					put(grammarAccess.getPackageAccess().getGroup(), "rule__Package__Group__0");
					put(grammarAccess.getFQNAccess().getGroup(), "rule__FQN__Group__0");
					put(grammarAccess.getFQNAccess().getGroup_1(), "rule__FQN__Group_1__0");
					put(grammarAccess.getPropertyAccess().getGroup(), "rule__Property__Group__0");
					put(grammarAccess.getDefaultLocaleAccess().getGroup(), "rule__DefaultLocale__Group__0");
					put(grammarAccess.getModelAccess().getPackagesAssignment(), "rule__Model__PackagesAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			com.github.fbrx.propertysl.ui.contentassist.antlr.internal.InternalPropertySLParser typedParser = (com.github.fbrx.propertysl.ui.contentassist.antlr.internal.InternalPropertySLParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public PropertySLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(PropertySLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
