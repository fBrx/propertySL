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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPropertySLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_LOCALE", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'{'", "'}'", "'SUPPORTED_LOCALES'", "'='", "','", "'.'", "':'", "'DEFAULT_LOCALE'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_LOCALE=5;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=7;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalPropertySLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPropertySLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPropertySLParser.tokenNames; }
    public String getGrammarFileName() { return "../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g"; }


     
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




    // $ANTLR start "entryRuleModel"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:61:1: ( ruleModel EOF )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:69:1: ruleModel : ( ( rule__Model__PackagesAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:73:2: ( ( ( rule__Model__PackagesAssignment )* ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:74:1: ( ( rule__Model__PackagesAssignment )* )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:74:1: ( ( rule__Model__PackagesAssignment )* )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:75:1: ( rule__Model__PackagesAssignment )*
            {
             before(grammarAccess.getModelAccess().getPackagesAssignment()); 
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:76:1: ( rule__Model__PackagesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:76:2: rule__Model__PackagesAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__PackagesAssignment_in_ruleModel94);
            	    rule__Model__PackagesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getPackagesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePackage"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:88:1: entryRulePackage : rulePackage EOF ;
    public final void entryRulePackage() throws RecognitionException {
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:89:1: ( rulePackage EOF )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:90:1: rulePackage EOF
            {
             before(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_rulePackage_in_entryRulePackage122);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getPackageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:97:1: rulePackage : ( ( rule__Package__Group__0 ) ) ;
    public final void rulePackage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:101:2: ( ( ( rule__Package__Group__0 ) ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:102:1: ( ( rule__Package__Group__0 ) )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:102:1: ( ( rule__Package__Group__0 ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:103:1: ( rule__Package__Group__0 )
            {
             before(grammarAccess.getPackageAccess().getGroup()); 
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:104:1: ( rule__Package__Group__0 )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:104:2: rule__Package__Group__0
            {
            pushFollow(FOLLOW_rule__Package__Group__0_in_rulePackage155);
            rule__Package__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleSupportedLocales"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:116:1: entryRuleSupportedLocales : ruleSupportedLocales EOF ;
    public final void entryRuleSupportedLocales() throws RecognitionException {
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:117:1: ( ruleSupportedLocales EOF )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:118:1: ruleSupportedLocales EOF
            {
             before(grammarAccess.getSupportedLocalesRule()); 
            pushFollow(FOLLOW_ruleSupportedLocales_in_entryRuleSupportedLocales182);
            ruleSupportedLocales();

            state._fsp--;

             after(grammarAccess.getSupportedLocalesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSupportedLocales189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSupportedLocales"


    // $ANTLR start "ruleSupportedLocales"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:125:1: ruleSupportedLocales : ( ( rule__SupportedLocales__Group__0 ) ) ;
    public final void ruleSupportedLocales() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:129:2: ( ( ( rule__SupportedLocales__Group__0 ) ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:130:1: ( ( rule__SupportedLocales__Group__0 ) )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:130:1: ( ( rule__SupportedLocales__Group__0 ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:131:1: ( rule__SupportedLocales__Group__0 )
            {
             before(grammarAccess.getSupportedLocalesAccess().getGroup()); 
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:132:1: ( rule__SupportedLocales__Group__0 )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:132:2: rule__SupportedLocales__Group__0
            {
            pushFollow(FOLLOW_rule__SupportedLocales__Group__0_in_ruleSupportedLocales215);
            rule__SupportedLocales__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSupportedLocalesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSupportedLocales"


    // $ANTLR start "entryRuleFQN"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:144:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:145:1: ( ruleFQN EOF )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:146:1: ruleFQN EOF
            {
             before(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN242);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFQNRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN249); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:153:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:157:2: ( ( ( rule__FQN__Group__0 ) ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:158:1: ( ( rule__FQN__Group__0 ) )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:158:1: ( ( rule__FQN__Group__0 ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:159:1: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:160:1: ( rule__FQN__Group__0 )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:160:2: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_rule__FQN__Group__0_in_ruleFQN275);
            rule__FQN__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFQNAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleProperty"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:172:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:173:1: ( ruleProperty EOF )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:174:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty302);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty309); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:181:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:185:2: ( ( ( rule__Property__Group__0 ) ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:186:1: ( ( rule__Property__Group__0 ) )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:186:1: ( ( rule__Property__Group__0 ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:187:1: ( rule__Property__Group__0 )
            {
             before(grammarAccess.getPropertyAccess().getGroup()); 
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:188:1: ( rule__Property__Group__0 )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:188:2: rule__Property__Group__0
            {
            pushFollow(FOLLOW_rule__Property__Group__0_in_ruleProperty335);
            rule__Property__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRulePropertyKey"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:200:1: entryRulePropertyKey : rulePropertyKey EOF ;
    public final void entryRulePropertyKey() throws RecognitionException {
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:201:1: ( rulePropertyKey EOF )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:202:1: rulePropertyKey EOF
            {
             before(grammarAccess.getPropertyKeyRule()); 
            pushFollow(FOLLOW_rulePropertyKey_in_entryRulePropertyKey362);
            rulePropertyKey();

            state._fsp--;

             after(grammarAccess.getPropertyKeyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyKey369); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePropertyKey"


    // $ANTLR start "rulePropertyKey"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:209:1: rulePropertyKey : ( RULE_ID ) ;
    public final void rulePropertyKey() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:213:2: ( ( RULE_ID ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:214:1: ( RULE_ID )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:214:1: ( RULE_ID )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:215:1: RULE_ID
            {
             before(grammarAccess.getPropertyKeyAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePropertyKey395); 
             after(grammarAccess.getPropertyKeyAccess().getIDTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyKey"


    // $ANTLR start "entryRuleAbstractPropertyValue"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:228:1: entryRuleAbstractPropertyValue : ruleAbstractPropertyValue EOF ;
    public final void entryRuleAbstractPropertyValue() throws RecognitionException {
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:229:1: ( ruleAbstractPropertyValue EOF )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:230:1: ruleAbstractPropertyValue EOF
            {
             before(grammarAccess.getAbstractPropertyValueRule()); 
            pushFollow(FOLLOW_ruleAbstractPropertyValue_in_entryRuleAbstractPropertyValue421);
            ruleAbstractPropertyValue();

            state._fsp--;

             after(grammarAccess.getAbstractPropertyValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractPropertyValue428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractPropertyValue"


    // $ANTLR start "ruleAbstractPropertyValue"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:237:1: ruleAbstractPropertyValue : ( ( rule__AbstractPropertyValue__Alternatives ) ) ;
    public final void ruleAbstractPropertyValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:241:2: ( ( ( rule__AbstractPropertyValue__Alternatives ) ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:242:1: ( ( rule__AbstractPropertyValue__Alternatives ) )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:242:1: ( ( rule__AbstractPropertyValue__Alternatives ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:243:1: ( rule__AbstractPropertyValue__Alternatives )
            {
             before(grammarAccess.getAbstractPropertyValueAccess().getAlternatives()); 
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:244:1: ( rule__AbstractPropertyValue__Alternatives )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:244:2: rule__AbstractPropertyValue__Alternatives
            {
            pushFollow(FOLLOW_rule__AbstractPropertyValue__Alternatives_in_ruleAbstractPropertyValue454);
            rule__AbstractPropertyValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractPropertyValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractPropertyValue"


    // $ANTLR start "entryRuleSimplePropertyValue"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:256:1: entryRuleSimplePropertyValue : ruleSimplePropertyValue EOF ;
    public final void entryRuleSimplePropertyValue() throws RecognitionException {
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:257:1: ( ruleSimplePropertyValue EOF )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:258:1: ruleSimplePropertyValue EOF
            {
             before(grammarAccess.getSimplePropertyValueRule()); 
            pushFollow(FOLLOW_ruleSimplePropertyValue_in_entryRuleSimplePropertyValue481);
            ruleSimplePropertyValue();

            state._fsp--;

             after(grammarAccess.getSimplePropertyValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimplePropertyValue488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSimplePropertyValue"


    // $ANTLR start "ruleSimplePropertyValue"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:265:1: ruleSimplePropertyValue : ( ( rule__SimplePropertyValue__ValueAssignment ) ) ;
    public final void ruleSimplePropertyValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:269:2: ( ( ( rule__SimplePropertyValue__ValueAssignment ) ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:270:1: ( ( rule__SimplePropertyValue__ValueAssignment ) )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:270:1: ( ( rule__SimplePropertyValue__ValueAssignment ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:271:1: ( rule__SimplePropertyValue__ValueAssignment )
            {
             before(grammarAccess.getSimplePropertyValueAccess().getValueAssignment()); 
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:272:1: ( rule__SimplePropertyValue__ValueAssignment )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:272:2: rule__SimplePropertyValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__SimplePropertyValue__ValueAssignment_in_ruleSimplePropertyValue514);
            rule__SimplePropertyValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSimplePropertyValueAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimplePropertyValue"


    // $ANTLR start "entryRuleComplexPropertyValue"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:284:1: entryRuleComplexPropertyValue : ruleComplexPropertyValue EOF ;
    public final void entryRuleComplexPropertyValue() throws RecognitionException {
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:285:1: ( ruleComplexPropertyValue EOF )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:286:1: ruleComplexPropertyValue EOF
            {
             before(grammarAccess.getComplexPropertyValueRule()); 
            pushFollow(FOLLOW_ruleComplexPropertyValue_in_entryRuleComplexPropertyValue541);
            ruleComplexPropertyValue();

            state._fsp--;

             after(grammarAccess.getComplexPropertyValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexPropertyValue548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComplexPropertyValue"


    // $ANTLR start "ruleComplexPropertyValue"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:293:1: ruleComplexPropertyValue : ( ( rule__ComplexPropertyValue__Group__0 ) ) ;
    public final void ruleComplexPropertyValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:297:2: ( ( ( rule__ComplexPropertyValue__Group__0 ) ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:298:1: ( ( rule__ComplexPropertyValue__Group__0 ) )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:298:1: ( ( rule__ComplexPropertyValue__Group__0 ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:299:1: ( rule__ComplexPropertyValue__Group__0 )
            {
             before(grammarAccess.getComplexPropertyValueAccess().getGroup()); 
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:300:1: ( rule__ComplexPropertyValue__Group__0 )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:300:2: rule__ComplexPropertyValue__Group__0
            {
            pushFollow(FOLLOW_rule__ComplexPropertyValue__Group__0_in_ruleComplexPropertyValue574);
            rule__ComplexPropertyValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComplexPropertyValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComplexPropertyValue"


    // $ANTLR start "entryRuleComplexPropertyValueItem"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:312:1: entryRuleComplexPropertyValueItem : ruleComplexPropertyValueItem EOF ;
    public final void entryRuleComplexPropertyValueItem() throws RecognitionException {
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:313:1: ( ruleComplexPropertyValueItem EOF )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:314:1: ruleComplexPropertyValueItem EOF
            {
             before(grammarAccess.getComplexPropertyValueItemRule()); 
            pushFollow(FOLLOW_ruleComplexPropertyValueItem_in_entryRuleComplexPropertyValueItem601);
            ruleComplexPropertyValueItem();

            state._fsp--;

             after(grammarAccess.getComplexPropertyValueItemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexPropertyValueItem608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComplexPropertyValueItem"


    // $ANTLR start "ruleComplexPropertyValueItem"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:321:1: ruleComplexPropertyValueItem : ( ( rule__ComplexPropertyValueItem__Group__0 ) ) ;
    public final void ruleComplexPropertyValueItem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:325:2: ( ( ( rule__ComplexPropertyValueItem__Group__0 ) ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:326:1: ( ( rule__ComplexPropertyValueItem__Group__0 ) )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:326:1: ( ( rule__ComplexPropertyValueItem__Group__0 ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:327:1: ( rule__ComplexPropertyValueItem__Group__0 )
            {
             before(grammarAccess.getComplexPropertyValueItemAccess().getGroup()); 
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:328:1: ( rule__ComplexPropertyValueItem__Group__0 )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:328:2: rule__ComplexPropertyValueItem__Group__0
            {
            pushFollow(FOLLOW_rule__ComplexPropertyValueItem__Group__0_in_ruleComplexPropertyValueItem634);
            rule__ComplexPropertyValueItem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComplexPropertyValueItemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComplexPropertyValueItem"


    // $ANTLR start "entryRuleDefaultLocale"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:340:1: entryRuleDefaultLocale : ruleDefaultLocale EOF ;
    public final void entryRuleDefaultLocale() throws RecognitionException {
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:341:1: ( ruleDefaultLocale EOF )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:342:1: ruleDefaultLocale EOF
            {
             before(grammarAccess.getDefaultLocaleRule()); 
            pushFollow(FOLLOW_ruleDefaultLocale_in_entryRuleDefaultLocale661);
            ruleDefaultLocale();

            state._fsp--;

             after(grammarAccess.getDefaultLocaleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultLocale668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefaultLocale"


    // $ANTLR start "ruleDefaultLocale"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:349:1: ruleDefaultLocale : ( ( rule__DefaultLocale__Group__0 ) ) ;
    public final void ruleDefaultLocale() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:353:2: ( ( ( rule__DefaultLocale__Group__0 ) ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:354:1: ( ( rule__DefaultLocale__Group__0 ) )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:354:1: ( ( rule__DefaultLocale__Group__0 ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:355:1: ( rule__DefaultLocale__Group__0 )
            {
             before(grammarAccess.getDefaultLocaleAccess().getGroup()); 
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:356:1: ( rule__DefaultLocale__Group__0 )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:356:2: rule__DefaultLocale__Group__0
            {
            pushFollow(FOLLOW_rule__DefaultLocale__Group__0_in_ruleDefaultLocale694);
            rule__DefaultLocale__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefaultLocaleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefaultLocale"


    // $ANTLR start "rule__Package__Alternatives_5"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:368:1: rule__Package__Alternatives_5 : ( ( ( rule__Package__PackagesAssignment_5_0 ) ) | ( ( rule__Package__PropertiesAssignment_5_1 ) ) );
    public final void rule__Package__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:372:1: ( ( ( rule__Package__PackagesAssignment_5_0 ) ) | ( ( rule__Package__PropertiesAssignment_5_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:373:1: ( ( rule__Package__PackagesAssignment_5_0 ) )
                    {
                    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:373:1: ( ( rule__Package__PackagesAssignment_5_0 ) )
                    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:374:1: ( rule__Package__PackagesAssignment_5_0 )
                    {
                     before(grammarAccess.getPackageAccess().getPackagesAssignment_5_0()); 
                    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:375:1: ( rule__Package__PackagesAssignment_5_0 )
                    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:375:2: rule__Package__PackagesAssignment_5_0
                    {
                    pushFollow(FOLLOW_rule__Package__PackagesAssignment_5_0_in_rule__Package__Alternatives_5730);
                    rule__Package__PackagesAssignment_5_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPackageAccess().getPackagesAssignment_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:379:6: ( ( rule__Package__PropertiesAssignment_5_1 ) )
                    {
                    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:379:6: ( ( rule__Package__PropertiesAssignment_5_1 ) )
                    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:380:1: ( rule__Package__PropertiesAssignment_5_1 )
                    {
                     before(grammarAccess.getPackageAccess().getPropertiesAssignment_5_1()); 
                    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:381:1: ( rule__Package__PropertiesAssignment_5_1 )
                    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:381:2: rule__Package__PropertiesAssignment_5_1
                    {
                    pushFollow(FOLLOW_rule__Package__PropertiesAssignment_5_1_in_rule__Package__Alternatives_5748);
                    rule__Package__PropertiesAssignment_5_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPackageAccess().getPropertiesAssignment_5_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Alternatives_5"


    // $ANTLR start "rule__AbstractPropertyValue__Alternatives"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:390:1: rule__AbstractPropertyValue__Alternatives : ( ( ruleSimplePropertyValue ) | ( ruleComplexPropertyValue ) );
    public final void rule__AbstractPropertyValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:394:1: ( ( ruleSimplePropertyValue ) | ( ruleComplexPropertyValue ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==13) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:395:1: ( ruleSimplePropertyValue )
                    {
                    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:395:1: ( ruleSimplePropertyValue )
                    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:396:1: ruleSimplePropertyValue
                    {
                     before(grammarAccess.getAbstractPropertyValueAccess().getSimplePropertyValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSimplePropertyValue_in_rule__AbstractPropertyValue__Alternatives781);
                    ruleSimplePropertyValue();

                    state._fsp--;

                     after(grammarAccess.getAbstractPropertyValueAccess().getSimplePropertyValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:401:6: ( ruleComplexPropertyValue )
                    {
                    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:401:6: ( ruleComplexPropertyValue )
                    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:402:1: ruleComplexPropertyValue
                    {
                     before(grammarAccess.getAbstractPropertyValueAccess().getComplexPropertyValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleComplexPropertyValue_in_rule__AbstractPropertyValue__Alternatives798);
                    ruleComplexPropertyValue();

                    state._fsp--;

                     after(grammarAccess.getAbstractPropertyValueAccess().getComplexPropertyValueParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractPropertyValue__Alternatives"


    // $ANTLR start "rule__Package__Group__0"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:414:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:418:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:419:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__0828);
            rule__Package__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__1_in_rule__Package__Group__0831);
            rule__Package__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__0"


    // $ANTLR start "rule__Package__Group__0__Impl"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:426:1: rule__Package__Group__0__Impl : ( 'package' ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:430:1: ( ( 'package' ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:431:1: ( 'package' )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:431:1: ( 'package' )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:432:1: 'package'
            {
             before(grammarAccess.getPackageAccess().getPackageKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Package__Group__0__Impl859); 
             after(grammarAccess.getPackageAccess().getPackageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__0__Impl"


    // $ANTLR start "rule__Package__Group__1"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:445:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:449:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:450:2: rule__Package__Group__1__Impl rule__Package__Group__2
            {
            pushFollow(FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__1890);
            rule__Package__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__2_in_rule__Package__Group__1893);
            rule__Package__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__1"


    // $ANTLR start "rule__Package__Group__1__Impl"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:457:1: rule__Package__Group__1__Impl : ( ( rule__Package__NameAssignment_1 ) ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:461:1: ( ( ( rule__Package__NameAssignment_1 ) ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:462:1: ( ( rule__Package__NameAssignment_1 ) )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:462:1: ( ( rule__Package__NameAssignment_1 ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:463:1: ( rule__Package__NameAssignment_1 )
            {
             before(grammarAccess.getPackageAccess().getNameAssignment_1()); 
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:464:1: ( rule__Package__NameAssignment_1 )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:464:2: rule__Package__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Package__NameAssignment_1_in_rule__Package__Group__1__Impl920);
            rule__Package__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__1__Impl"


    // $ANTLR start "rule__Package__Group__2"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:474:1: rule__Package__Group__2 : rule__Package__Group__2__Impl rule__Package__Group__3 ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:478:1: ( rule__Package__Group__2__Impl rule__Package__Group__3 )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:479:2: rule__Package__Group__2__Impl rule__Package__Group__3
            {
            pushFollow(FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__2950);
            rule__Package__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__3_in_rule__Package__Group__2953);
            rule__Package__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__2"


    // $ANTLR start "rule__Package__Group__2__Impl"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:486:1: rule__Package__Group__2__Impl : ( '{' ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:490:1: ( ( '{' ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:491:1: ( '{' )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:491:1: ( '{' )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:492:1: '{'
            {
             before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__Package__Group__2__Impl981); 
             after(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__2__Impl"


    // $ANTLR start "rule__Package__Group__3"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:505:1: rule__Package__Group__3 : rule__Package__Group__3__Impl rule__Package__Group__4 ;
    public final void rule__Package__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:509:1: ( rule__Package__Group__3__Impl rule__Package__Group__4 )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:510:2: rule__Package__Group__3__Impl rule__Package__Group__4
            {
            pushFollow(FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__31012);
            rule__Package__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__4_in_rule__Package__Group__31015);
            rule__Package__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__3"


    // $ANTLR start "rule__Package__Group__3__Impl"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:517:1: rule__Package__Group__3__Impl : ( ( rule__Package__SupportedLocalesAssignment_3 )? ) ;
    public final void rule__Package__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:521:1: ( ( ( rule__Package__SupportedLocalesAssignment_3 )? ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:522:1: ( ( rule__Package__SupportedLocalesAssignment_3 )? )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:522:1: ( ( rule__Package__SupportedLocalesAssignment_3 )? )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:523:1: ( rule__Package__SupportedLocalesAssignment_3 )?
            {
             before(grammarAccess.getPackageAccess().getSupportedLocalesAssignment_3()); 
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:524:1: ( rule__Package__SupportedLocalesAssignment_3 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:524:2: rule__Package__SupportedLocalesAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Package__SupportedLocalesAssignment_3_in_rule__Package__Group__3__Impl1042);
                    rule__Package__SupportedLocalesAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPackageAccess().getSupportedLocalesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__3__Impl"


    // $ANTLR start "rule__Package__Group__4"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:534:1: rule__Package__Group__4 : rule__Package__Group__4__Impl rule__Package__Group__5 ;
    public final void rule__Package__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:538:1: ( rule__Package__Group__4__Impl rule__Package__Group__5 )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:539:2: rule__Package__Group__4__Impl rule__Package__Group__5
            {
            pushFollow(FOLLOW_rule__Package__Group__4__Impl_in_rule__Package__Group__41073);
            rule__Package__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__5_in_rule__Package__Group__41076);
            rule__Package__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__4"


    // $ANTLR start "rule__Package__Group__4__Impl"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:546:1: rule__Package__Group__4__Impl : ( ( rule__Package__DefaultLocaleAssignment_4 )? ) ;
    public final void rule__Package__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:550:1: ( ( ( rule__Package__DefaultLocaleAssignment_4 )? ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:551:1: ( ( rule__Package__DefaultLocaleAssignment_4 )? )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:551:1: ( ( rule__Package__DefaultLocaleAssignment_4 )? )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:552:1: ( rule__Package__DefaultLocaleAssignment_4 )?
            {
             before(grammarAccess.getPackageAccess().getDefaultLocaleAssignment_4()); 
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:553:1: ( rule__Package__DefaultLocaleAssignment_4 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:553:2: rule__Package__DefaultLocaleAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Package__DefaultLocaleAssignment_4_in_rule__Package__Group__4__Impl1103);
                    rule__Package__DefaultLocaleAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPackageAccess().getDefaultLocaleAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__4__Impl"


    // $ANTLR start "rule__Package__Group__5"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:563:1: rule__Package__Group__5 : rule__Package__Group__5__Impl rule__Package__Group__6 ;
    public final void rule__Package__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:567:1: ( rule__Package__Group__5__Impl rule__Package__Group__6 )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:568:2: rule__Package__Group__5__Impl rule__Package__Group__6
            {
            pushFollow(FOLLOW_rule__Package__Group__5__Impl_in_rule__Package__Group__51134);
            rule__Package__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__6_in_rule__Package__Group__51137);
            rule__Package__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__5"


    // $ANTLR start "rule__Package__Group__5__Impl"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:575:1: rule__Package__Group__5__Impl : ( ( rule__Package__Alternatives_5 )* ) ;
    public final void rule__Package__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:579:1: ( ( ( rule__Package__Alternatives_5 )* ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:580:1: ( ( rule__Package__Alternatives_5 )* )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:580:1: ( ( rule__Package__Alternatives_5 )* )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:581:1: ( rule__Package__Alternatives_5 )*
            {
             before(grammarAccess.getPackageAccess().getAlternatives_5()); 
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:582:1: ( rule__Package__Alternatives_5 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||LA6_0==12) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:582:2: rule__Package__Alternatives_5
            	    {
            	    pushFollow(FOLLOW_rule__Package__Alternatives_5_in_rule__Package__Group__5__Impl1164);
            	    rule__Package__Alternatives_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getPackageAccess().getAlternatives_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__5__Impl"


    // $ANTLR start "rule__Package__Group__6"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:592:1: rule__Package__Group__6 : rule__Package__Group__6__Impl ;
    public final void rule__Package__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:596:1: ( rule__Package__Group__6__Impl )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:597:2: rule__Package__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Package__Group__6__Impl_in_rule__Package__Group__61195);
            rule__Package__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__6"


    // $ANTLR start "rule__Package__Group__6__Impl"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:603:1: rule__Package__Group__6__Impl : ( '}' ) ;
    public final void rule__Package__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:607:1: ( ( '}' ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:608:1: ( '}' )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:608:1: ( '}' )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:609:1: '}'
            {
             before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_14_in_rule__Package__Group__6__Impl1223); 
             after(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__6__Impl"


    // $ANTLR start "rule__SupportedLocales__Group__0"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:636:1: rule__SupportedLocales__Group__0 : rule__SupportedLocales__Group__0__Impl rule__SupportedLocales__Group__1 ;
    public final void rule__SupportedLocales__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:640:1: ( rule__SupportedLocales__Group__0__Impl rule__SupportedLocales__Group__1 )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:641:2: rule__SupportedLocales__Group__0__Impl rule__SupportedLocales__Group__1
            {
            pushFollow(FOLLOW_rule__SupportedLocales__Group__0__Impl_in_rule__SupportedLocales__Group__01268);
            rule__SupportedLocales__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SupportedLocales__Group__1_in_rule__SupportedLocales__Group__01271);
            rule__SupportedLocales__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SupportedLocales__Group__0"


    // $ANTLR start "rule__SupportedLocales__Group__0__Impl"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:648:1: rule__SupportedLocales__Group__0__Impl : ( 'SUPPORTED_LOCALES' ) ;
    public final void rule__SupportedLocales__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:652:1: ( ( 'SUPPORTED_LOCALES' ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:653:1: ( 'SUPPORTED_LOCALES' )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:653:1: ( 'SUPPORTED_LOCALES' )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:654:1: 'SUPPORTED_LOCALES'
            {
             before(grammarAccess.getSupportedLocalesAccess().getSUPPORTED_LOCALESKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__SupportedLocales__Group__0__Impl1299); 
             after(grammarAccess.getSupportedLocalesAccess().getSUPPORTED_LOCALESKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SupportedLocales__Group__0__Impl"


    // $ANTLR start "rule__SupportedLocales__Group__1"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:667:1: rule__SupportedLocales__Group__1 : rule__SupportedLocales__Group__1__Impl rule__SupportedLocales__Group__2 ;
    public final void rule__SupportedLocales__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:671:1: ( rule__SupportedLocales__Group__1__Impl rule__SupportedLocales__Group__2 )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:672:2: rule__SupportedLocales__Group__1__Impl rule__SupportedLocales__Group__2
            {
            pushFollow(FOLLOW_rule__SupportedLocales__Group__1__Impl_in_rule__SupportedLocales__Group__11330);
            rule__SupportedLocales__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SupportedLocales__Group__2_in_rule__SupportedLocales__Group__11333);
            rule__SupportedLocales__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SupportedLocales__Group__1"


    // $ANTLR start "rule__SupportedLocales__Group__1__Impl"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:679:1: rule__SupportedLocales__Group__1__Impl : ( '=' ) ;
    public final void rule__SupportedLocales__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:683:1: ( ( '=' ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:684:1: ( '=' )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:684:1: ( '=' )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:685:1: '='
            {
             before(grammarAccess.getSupportedLocalesAccess().getEqualsSignKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__SupportedLocales__Group__1__Impl1361); 
             after(grammarAccess.getSupportedLocalesAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SupportedLocales__Group__1__Impl"


    // $ANTLR start "rule__SupportedLocales__Group__2"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:698:1: rule__SupportedLocales__Group__2 : rule__SupportedLocales__Group__2__Impl rule__SupportedLocales__Group__3 ;
    public final void rule__SupportedLocales__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:702:1: ( rule__SupportedLocales__Group__2__Impl rule__SupportedLocales__Group__3 )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:703:2: rule__SupportedLocales__Group__2__Impl rule__SupportedLocales__Group__3
            {
            pushFollow(FOLLOW_rule__SupportedLocales__Group__2__Impl_in_rule__SupportedLocales__Group__21392);
            rule__SupportedLocales__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SupportedLocales__Group__3_in_rule__SupportedLocales__Group__21395);
            rule__SupportedLocales__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SupportedLocales__Group__2"


    // $ANTLR start "rule__SupportedLocales__Group__2__Impl"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:710:1: rule__SupportedLocales__Group__2__Impl : ( '{' ) ;
    public final void rule__SupportedLocales__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:714:1: ( ( '{' ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:715:1: ( '{' )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:715:1: ( '{' )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:716:1: '{'
            {
             before(grammarAccess.getSupportedLocalesAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__SupportedLocales__Group__2__Impl1423); 
             after(grammarAccess.getSupportedLocalesAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SupportedLocales__Group__2__Impl"


    // $ANTLR start "rule__SupportedLocales__Group__3"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:729:1: rule__SupportedLocales__Group__3 : rule__SupportedLocales__Group__3__Impl rule__SupportedLocales__Group__4 ;
    public final void rule__SupportedLocales__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:733:1: ( rule__SupportedLocales__Group__3__Impl rule__SupportedLocales__Group__4 )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:734:2: rule__SupportedLocales__Group__3__Impl rule__SupportedLocales__Group__4
            {
            pushFollow(FOLLOW_rule__SupportedLocales__Group__3__Impl_in_rule__SupportedLocales__Group__31454);
            rule__SupportedLocales__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SupportedLocales__Group__4_in_rule__SupportedLocales__Group__31457);
            rule__SupportedLocales__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SupportedLocales__Group__3"


    // $ANTLR start "rule__SupportedLocales__Group__3__Impl"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:741:1: rule__SupportedLocales__Group__3__Impl : ( ( rule__SupportedLocales__LocalesAssignment_3 ) ) ;
    public final void rule__SupportedLocales__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:745:1: ( ( ( rule__SupportedLocales__LocalesAssignment_3 ) ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:746:1: ( ( rule__SupportedLocales__LocalesAssignment_3 ) )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:746:1: ( ( rule__SupportedLocales__LocalesAssignment_3 ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:747:1: ( rule__SupportedLocales__LocalesAssignment_3 )
            {
             before(grammarAccess.getSupportedLocalesAccess().getLocalesAssignment_3()); 
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:748:1: ( rule__SupportedLocales__LocalesAssignment_3 )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:748:2: rule__SupportedLocales__LocalesAssignment_3
            {
            pushFollow(FOLLOW_rule__SupportedLocales__LocalesAssignment_3_in_rule__SupportedLocales__Group__3__Impl1484);
            rule__SupportedLocales__LocalesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSupportedLocalesAccess().getLocalesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SupportedLocales__Group__3__Impl"


    // $ANTLR start "rule__SupportedLocales__Group__4"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:758:1: rule__SupportedLocales__Group__4 : rule__SupportedLocales__Group__4__Impl rule__SupportedLocales__Group__5 ;
    public final void rule__SupportedLocales__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:762:1: ( rule__SupportedLocales__Group__4__Impl rule__SupportedLocales__Group__5 )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:763:2: rule__SupportedLocales__Group__4__Impl rule__SupportedLocales__Group__5
            {
            pushFollow(FOLLOW_rule__SupportedLocales__Group__4__Impl_in_rule__SupportedLocales__Group__41514);
            rule__SupportedLocales__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SupportedLocales__Group__5_in_rule__SupportedLocales__Group__41517);
            rule__SupportedLocales__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SupportedLocales__Group__4"


    // $ANTLR start "rule__SupportedLocales__Group__4__Impl"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:770:1: rule__SupportedLocales__Group__4__Impl : ( ( rule__SupportedLocales__Group_4__0 )* ) ;
    public final void rule__SupportedLocales__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:774:1: ( ( ( rule__SupportedLocales__Group_4__0 )* ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:775:1: ( ( rule__SupportedLocales__Group_4__0 )* )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:775:1: ( ( rule__SupportedLocales__Group_4__0 )* )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:776:1: ( rule__SupportedLocales__Group_4__0 )*
            {
             before(grammarAccess.getSupportedLocalesAccess().getGroup_4()); 
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:777:1: ( rule__SupportedLocales__Group_4__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:777:2: rule__SupportedLocales__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__SupportedLocales__Group_4__0_in_rule__SupportedLocales__Group__4__Impl1544);
            	    rule__SupportedLocales__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getSupportedLocalesAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SupportedLocales__Group__4__Impl"


    // $ANTLR start "rule__SupportedLocales__Group__5"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:787:1: rule__SupportedLocales__Group__5 : rule__SupportedLocales__Group__5__Impl ;
    public final void rule__SupportedLocales__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:791:1: ( rule__SupportedLocales__Group__5__Impl )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:792:2: rule__SupportedLocales__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__SupportedLocales__Group__5__Impl_in_rule__SupportedLocales__Group__51575);
            rule__SupportedLocales__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SupportedLocales__Group__5"


    // $ANTLR start "rule__SupportedLocales__Group__5__Impl"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:798:1: rule__SupportedLocales__Group__5__Impl : ( '}' ) ;
    public final void rule__SupportedLocales__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:802:1: ( ( '}' ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:803:1: ( '}' )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:803:1: ( '}' )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:804:1: '}'
            {
             before(grammarAccess.getSupportedLocalesAccess().getRightCurlyBracketKeyword_5()); 
            match(input,14,FOLLOW_14_in_rule__SupportedLocales__Group__5__Impl1603); 
             after(grammarAccess.getSupportedLocalesAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SupportedLocales__Group__5__Impl"


    // $ANTLR start "rule__SupportedLocales__Group_4__0"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:829:1: rule__SupportedLocales__Group_4__0 : rule__SupportedLocales__Group_4__0__Impl rule__SupportedLocales__Group_4__1 ;
    public final void rule__SupportedLocales__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:833:1: ( rule__SupportedLocales__Group_4__0__Impl rule__SupportedLocales__Group_4__1 )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:834:2: rule__SupportedLocales__Group_4__0__Impl rule__SupportedLocales__Group_4__1
            {
            pushFollow(FOLLOW_rule__SupportedLocales__Group_4__0__Impl_in_rule__SupportedLocales__Group_4__01646);
            rule__SupportedLocales__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SupportedLocales__Group_4__1_in_rule__SupportedLocales__Group_4__01649);
            rule__SupportedLocales__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SupportedLocales__Group_4__0"


    // $ANTLR start "rule__SupportedLocales__Group_4__0__Impl"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:841:1: rule__SupportedLocales__Group_4__0__Impl : ( ',' ) ;
    public final void rule__SupportedLocales__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:845:1: ( ( ',' ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:846:1: ( ',' )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:846:1: ( ',' )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:847:1: ','
            {
             before(grammarAccess.getSupportedLocalesAccess().getCommaKeyword_4_0()); 
            match(input,17,FOLLOW_17_in_rule__SupportedLocales__Group_4__0__Impl1677); 
             after(grammarAccess.getSupportedLocalesAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SupportedLocales__Group_4__0__Impl"


    // $ANTLR start "rule__SupportedLocales__Group_4__1"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:860:1: rule__SupportedLocales__Group_4__1 : rule__SupportedLocales__Group_4__1__Impl ;
    public final void rule__SupportedLocales__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:864:1: ( rule__SupportedLocales__Group_4__1__Impl )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:865:2: rule__SupportedLocales__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__SupportedLocales__Group_4__1__Impl_in_rule__SupportedLocales__Group_4__11708);
            rule__SupportedLocales__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SupportedLocales__Group_4__1"


    // $ANTLR start "rule__SupportedLocales__Group_4__1__Impl"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:871:1: rule__SupportedLocales__Group_4__1__Impl : ( ( rule__SupportedLocales__LocalesAssignment_4_1 ) ) ;
    public final void rule__SupportedLocales__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:875:1: ( ( ( rule__SupportedLocales__LocalesAssignment_4_1 ) ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:876:1: ( ( rule__SupportedLocales__LocalesAssignment_4_1 ) )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:876:1: ( ( rule__SupportedLocales__LocalesAssignment_4_1 ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:877:1: ( rule__SupportedLocales__LocalesAssignment_4_1 )
            {
             before(grammarAccess.getSupportedLocalesAccess().getLocalesAssignment_4_1()); 
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:878:1: ( rule__SupportedLocales__LocalesAssignment_4_1 )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:878:2: rule__SupportedLocales__LocalesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__SupportedLocales__LocalesAssignment_4_1_in_rule__SupportedLocales__Group_4__1__Impl1735);
            rule__SupportedLocales__LocalesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSupportedLocalesAccess().getLocalesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SupportedLocales__Group_4__1__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:892:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:896:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:897:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__01769);
            rule__FQN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__01772);
            rule__FQN__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__0"


    // $ANTLR start "rule__FQN__Group__0__Impl"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:904:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:908:1: ( ( RULE_ID ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:909:1: ( RULE_ID )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:909:1: ( RULE_ID )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:910:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl1799); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__0__Impl"


    // $ANTLR start "rule__FQN__Group__1"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:921:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:925:1: ( rule__FQN__Group__1__Impl )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:926:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__11828);
            rule__FQN__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__1"


    // $ANTLR start "rule__FQN__Group__1__Impl"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:932:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:936:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:937:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:937:1: ( ( rule__FQN__Group_1__0 )* )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:938:1: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:939:1: ( rule__FQN__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:939:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl1855);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getFQNAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__1__Impl"


    // $ANTLR start "rule__FQN__Group_1__0"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:953:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:957:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:958:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__01890);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__01893);
            rule__FQN__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__0"


    // $ANTLR start "rule__FQN__Group_1__0__Impl"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:965:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:969:1: ( ( '.' ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:970:1: ( '.' )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:970:1: ( '.' )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:971:1: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,18,FOLLOW_18_in_rule__FQN__Group_1__0__Impl1921); 
             after(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__0__Impl"


    // $ANTLR start "rule__FQN__Group_1__1"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:984:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:988:1: ( rule__FQN__Group_1__1__Impl )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:989:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__11952);
            rule__FQN__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__1"


    // $ANTLR start "rule__FQN__Group_1__1__Impl"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:995:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:999:1: ( ( RULE_ID ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1000:1: ( RULE_ID )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1000:1: ( RULE_ID )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1001:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl1979); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__1__Impl"


    // $ANTLR start "rule__Property__Group__0"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1016:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1020:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1021:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__02012);
            rule__Property__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Property__Group__1_in_rule__Property__Group__02015);
            rule__Property__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__0"


    // $ANTLR start "rule__Property__Group__0__Impl"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1028:1: rule__Property__Group__0__Impl : ( ( rule__Property__KeyAssignment_0 ) ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1032:1: ( ( ( rule__Property__KeyAssignment_0 ) ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1033:1: ( ( rule__Property__KeyAssignment_0 ) )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1033:1: ( ( rule__Property__KeyAssignment_0 ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1034:1: ( rule__Property__KeyAssignment_0 )
            {
             before(grammarAccess.getPropertyAccess().getKeyAssignment_0()); 
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1035:1: ( rule__Property__KeyAssignment_0 )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1035:2: rule__Property__KeyAssignment_0
            {
            pushFollow(FOLLOW_rule__Property__KeyAssignment_0_in_rule__Property__Group__0__Impl2042);
            rule__Property__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__0__Impl"


    // $ANTLR start "rule__Property__Group__1"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1045:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1049:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1050:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__12072);
            rule__Property__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Property__Group__2_in_rule__Property__Group__12075);
            rule__Property__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__1"


    // $ANTLR start "rule__Property__Group__1__Impl"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1057:1: rule__Property__Group__1__Impl : ( '=' ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1061:1: ( ( '=' ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1062:1: ( '=' )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1062:1: ( '=' )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1063:1: '='
            {
             before(grammarAccess.getPropertyAccess().getEqualsSignKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__Property__Group__1__Impl2103); 
             after(grammarAccess.getPropertyAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__1__Impl"


    // $ANTLR start "rule__Property__Group__2"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1076:1: rule__Property__Group__2 : rule__Property__Group__2__Impl ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1080:1: ( rule__Property__Group__2__Impl )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1081:2: rule__Property__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__22134);
            rule__Property__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__2"


    // $ANTLR start "rule__Property__Group__2__Impl"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1087:1: rule__Property__Group__2__Impl : ( ( rule__Property__ValueAssignment_2 ) ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1091:1: ( ( ( rule__Property__ValueAssignment_2 ) ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1092:1: ( ( rule__Property__ValueAssignment_2 ) )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1092:1: ( ( rule__Property__ValueAssignment_2 ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1093:1: ( rule__Property__ValueAssignment_2 )
            {
             before(grammarAccess.getPropertyAccess().getValueAssignment_2()); 
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1094:1: ( rule__Property__ValueAssignment_2 )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1094:2: rule__Property__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Property__ValueAssignment_2_in_rule__Property__Group__2__Impl2161);
            rule__Property__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__2__Impl"


    // $ANTLR start "rule__ComplexPropertyValue__Group__0"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1110:1: rule__ComplexPropertyValue__Group__0 : rule__ComplexPropertyValue__Group__0__Impl rule__ComplexPropertyValue__Group__1 ;
    public final void rule__ComplexPropertyValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1114:1: ( rule__ComplexPropertyValue__Group__0__Impl rule__ComplexPropertyValue__Group__1 )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1115:2: rule__ComplexPropertyValue__Group__0__Impl rule__ComplexPropertyValue__Group__1
            {
            pushFollow(FOLLOW_rule__ComplexPropertyValue__Group__0__Impl_in_rule__ComplexPropertyValue__Group__02197);
            rule__ComplexPropertyValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexPropertyValue__Group__1_in_rule__ComplexPropertyValue__Group__02200);
            rule__ComplexPropertyValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexPropertyValue__Group__0"


    // $ANTLR start "rule__ComplexPropertyValue__Group__0__Impl"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1122:1: rule__ComplexPropertyValue__Group__0__Impl : ( '{' ) ;
    public final void rule__ComplexPropertyValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1126:1: ( ( '{' ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1127:1: ( '{' )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1127:1: ( '{' )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1128:1: '{'
            {
             before(grammarAccess.getComplexPropertyValueAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__ComplexPropertyValue__Group__0__Impl2228); 
             after(grammarAccess.getComplexPropertyValueAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexPropertyValue__Group__0__Impl"


    // $ANTLR start "rule__ComplexPropertyValue__Group__1"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1141:1: rule__ComplexPropertyValue__Group__1 : rule__ComplexPropertyValue__Group__1__Impl rule__ComplexPropertyValue__Group__2 ;
    public final void rule__ComplexPropertyValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1145:1: ( rule__ComplexPropertyValue__Group__1__Impl rule__ComplexPropertyValue__Group__2 )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1146:2: rule__ComplexPropertyValue__Group__1__Impl rule__ComplexPropertyValue__Group__2
            {
            pushFollow(FOLLOW_rule__ComplexPropertyValue__Group__1__Impl_in_rule__ComplexPropertyValue__Group__12259);
            rule__ComplexPropertyValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexPropertyValue__Group__2_in_rule__ComplexPropertyValue__Group__12262);
            rule__ComplexPropertyValue__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexPropertyValue__Group__1"


    // $ANTLR start "rule__ComplexPropertyValue__Group__1__Impl"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1153:1: rule__ComplexPropertyValue__Group__1__Impl : ( ( ( rule__ComplexPropertyValue__ItemsAssignment_1 ) ) ( ( rule__ComplexPropertyValue__ItemsAssignment_1 )* ) ) ;
    public final void rule__ComplexPropertyValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1157:1: ( ( ( ( rule__ComplexPropertyValue__ItemsAssignment_1 ) ) ( ( rule__ComplexPropertyValue__ItemsAssignment_1 )* ) ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1158:1: ( ( ( rule__ComplexPropertyValue__ItemsAssignment_1 ) ) ( ( rule__ComplexPropertyValue__ItemsAssignment_1 )* ) )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1158:1: ( ( ( rule__ComplexPropertyValue__ItemsAssignment_1 ) ) ( ( rule__ComplexPropertyValue__ItemsAssignment_1 )* ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1159:1: ( ( rule__ComplexPropertyValue__ItemsAssignment_1 ) ) ( ( rule__ComplexPropertyValue__ItemsAssignment_1 )* )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1159:1: ( ( rule__ComplexPropertyValue__ItemsAssignment_1 ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1160:1: ( rule__ComplexPropertyValue__ItemsAssignment_1 )
            {
             before(grammarAccess.getComplexPropertyValueAccess().getItemsAssignment_1()); 
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1161:1: ( rule__ComplexPropertyValue__ItemsAssignment_1 )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1161:2: rule__ComplexPropertyValue__ItemsAssignment_1
            {
            pushFollow(FOLLOW_rule__ComplexPropertyValue__ItemsAssignment_1_in_rule__ComplexPropertyValue__Group__1__Impl2291);
            rule__ComplexPropertyValue__ItemsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComplexPropertyValueAccess().getItemsAssignment_1()); 

            }

            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1164:1: ( ( rule__ComplexPropertyValue__ItemsAssignment_1 )* )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1165:1: ( rule__ComplexPropertyValue__ItemsAssignment_1 )*
            {
             before(grammarAccess.getComplexPropertyValueAccess().getItemsAssignment_1()); 
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1166:1: ( rule__ComplexPropertyValue__ItemsAssignment_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_LOCALE) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1166:2: rule__ComplexPropertyValue__ItemsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__ComplexPropertyValue__ItemsAssignment_1_in_rule__ComplexPropertyValue__Group__1__Impl2303);
            	    rule__ComplexPropertyValue__ItemsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getComplexPropertyValueAccess().getItemsAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexPropertyValue__Group__1__Impl"


    // $ANTLR start "rule__ComplexPropertyValue__Group__2"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1177:1: rule__ComplexPropertyValue__Group__2 : rule__ComplexPropertyValue__Group__2__Impl ;
    public final void rule__ComplexPropertyValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1181:1: ( rule__ComplexPropertyValue__Group__2__Impl )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1182:2: rule__ComplexPropertyValue__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ComplexPropertyValue__Group__2__Impl_in_rule__ComplexPropertyValue__Group__22336);
            rule__ComplexPropertyValue__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexPropertyValue__Group__2"


    // $ANTLR start "rule__ComplexPropertyValue__Group__2__Impl"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1188:1: rule__ComplexPropertyValue__Group__2__Impl : ( '}' ) ;
    public final void rule__ComplexPropertyValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1192:1: ( ( '}' ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1193:1: ( '}' )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1193:1: ( '}' )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1194:1: '}'
            {
             before(grammarAccess.getComplexPropertyValueAccess().getRightCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__ComplexPropertyValue__Group__2__Impl2364); 
             after(grammarAccess.getComplexPropertyValueAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexPropertyValue__Group__2__Impl"


    // $ANTLR start "rule__ComplexPropertyValueItem__Group__0"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1213:1: rule__ComplexPropertyValueItem__Group__0 : rule__ComplexPropertyValueItem__Group__0__Impl rule__ComplexPropertyValueItem__Group__1 ;
    public final void rule__ComplexPropertyValueItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1217:1: ( rule__ComplexPropertyValueItem__Group__0__Impl rule__ComplexPropertyValueItem__Group__1 )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1218:2: rule__ComplexPropertyValueItem__Group__0__Impl rule__ComplexPropertyValueItem__Group__1
            {
            pushFollow(FOLLOW_rule__ComplexPropertyValueItem__Group__0__Impl_in_rule__ComplexPropertyValueItem__Group__02401);
            rule__ComplexPropertyValueItem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexPropertyValueItem__Group__1_in_rule__ComplexPropertyValueItem__Group__02404);
            rule__ComplexPropertyValueItem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexPropertyValueItem__Group__0"


    // $ANTLR start "rule__ComplexPropertyValueItem__Group__0__Impl"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1225:1: rule__ComplexPropertyValueItem__Group__0__Impl : ( ( rule__ComplexPropertyValueItem__LangAssignment_0 ) ) ;
    public final void rule__ComplexPropertyValueItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1229:1: ( ( ( rule__ComplexPropertyValueItem__LangAssignment_0 ) ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1230:1: ( ( rule__ComplexPropertyValueItem__LangAssignment_0 ) )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1230:1: ( ( rule__ComplexPropertyValueItem__LangAssignment_0 ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1231:1: ( rule__ComplexPropertyValueItem__LangAssignment_0 )
            {
             before(grammarAccess.getComplexPropertyValueItemAccess().getLangAssignment_0()); 
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1232:1: ( rule__ComplexPropertyValueItem__LangAssignment_0 )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1232:2: rule__ComplexPropertyValueItem__LangAssignment_0
            {
            pushFollow(FOLLOW_rule__ComplexPropertyValueItem__LangAssignment_0_in_rule__ComplexPropertyValueItem__Group__0__Impl2431);
            rule__ComplexPropertyValueItem__LangAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getComplexPropertyValueItemAccess().getLangAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexPropertyValueItem__Group__0__Impl"


    // $ANTLR start "rule__ComplexPropertyValueItem__Group__1"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1242:1: rule__ComplexPropertyValueItem__Group__1 : rule__ComplexPropertyValueItem__Group__1__Impl rule__ComplexPropertyValueItem__Group__2 ;
    public final void rule__ComplexPropertyValueItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1246:1: ( rule__ComplexPropertyValueItem__Group__1__Impl rule__ComplexPropertyValueItem__Group__2 )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1247:2: rule__ComplexPropertyValueItem__Group__1__Impl rule__ComplexPropertyValueItem__Group__2
            {
            pushFollow(FOLLOW_rule__ComplexPropertyValueItem__Group__1__Impl_in_rule__ComplexPropertyValueItem__Group__12461);
            rule__ComplexPropertyValueItem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ComplexPropertyValueItem__Group__2_in_rule__ComplexPropertyValueItem__Group__12464);
            rule__ComplexPropertyValueItem__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexPropertyValueItem__Group__1"


    // $ANTLR start "rule__ComplexPropertyValueItem__Group__1__Impl"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1254:1: rule__ComplexPropertyValueItem__Group__1__Impl : ( ':' ) ;
    public final void rule__ComplexPropertyValueItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1258:1: ( ( ':' ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1259:1: ( ':' )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1259:1: ( ':' )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1260:1: ':'
            {
             before(grammarAccess.getComplexPropertyValueItemAccess().getColonKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__ComplexPropertyValueItem__Group__1__Impl2492); 
             after(grammarAccess.getComplexPropertyValueItemAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexPropertyValueItem__Group__1__Impl"


    // $ANTLR start "rule__ComplexPropertyValueItem__Group__2"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1273:1: rule__ComplexPropertyValueItem__Group__2 : rule__ComplexPropertyValueItem__Group__2__Impl ;
    public final void rule__ComplexPropertyValueItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1277:1: ( rule__ComplexPropertyValueItem__Group__2__Impl )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1278:2: rule__ComplexPropertyValueItem__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ComplexPropertyValueItem__Group__2__Impl_in_rule__ComplexPropertyValueItem__Group__22523);
            rule__ComplexPropertyValueItem__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexPropertyValueItem__Group__2"


    // $ANTLR start "rule__ComplexPropertyValueItem__Group__2__Impl"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1284:1: rule__ComplexPropertyValueItem__Group__2__Impl : ( ( rule__ComplexPropertyValueItem__ValueAssignment_2 ) ) ;
    public final void rule__ComplexPropertyValueItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1288:1: ( ( ( rule__ComplexPropertyValueItem__ValueAssignment_2 ) ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1289:1: ( ( rule__ComplexPropertyValueItem__ValueAssignment_2 ) )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1289:1: ( ( rule__ComplexPropertyValueItem__ValueAssignment_2 ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1290:1: ( rule__ComplexPropertyValueItem__ValueAssignment_2 )
            {
             before(grammarAccess.getComplexPropertyValueItemAccess().getValueAssignment_2()); 
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1291:1: ( rule__ComplexPropertyValueItem__ValueAssignment_2 )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1291:2: rule__ComplexPropertyValueItem__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__ComplexPropertyValueItem__ValueAssignment_2_in_rule__ComplexPropertyValueItem__Group__2__Impl2550);
            rule__ComplexPropertyValueItem__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getComplexPropertyValueItemAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexPropertyValueItem__Group__2__Impl"


    // $ANTLR start "rule__DefaultLocale__Group__0"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1307:1: rule__DefaultLocale__Group__0 : rule__DefaultLocale__Group__0__Impl rule__DefaultLocale__Group__1 ;
    public final void rule__DefaultLocale__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1311:1: ( rule__DefaultLocale__Group__0__Impl rule__DefaultLocale__Group__1 )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1312:2: rule__DefaultLocale__Group__0__Impl rule__DefaultLocale__Group__1
            {
            pushFollow(FOLLOW_rule__DefaultLocale__Group__0__Impl_in_rule__DefaultLocale__Group__02586);
            rule__DefaultLocale__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DefaultLocale__Group__1_in_rule__DefaultLocale__Group__02589);
            rule__DefaultLocale__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultLocale__Group__0"


    // $ANTLR start "rule__DefaultLocale__Group__0__Impl"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1319:1: rule__DefaultLocale__Group__0__Impl : ( 'DEFAULT_LOCALE' ) ;
    public final void rule__DefaultLocale__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1323:1: ( ( 'DEFAULT_LOCALE' ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1324:1: ( 'DEFAULT_LOCALE' )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1324:1: ( 'DEFAULT_LOCALE' )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1325:1: 'DEFAULT_LOCALE'
            {
             before(grammarAccess.getDefaultLocaleAccess().getDEFAULT_LOCALEKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__DefaultLocale__Group__0__Impl2617); 
             after(grammarAccess.getDefaultLocaleAccess().getDEFAULT_LOCALEKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultLocale__Group__0__Impl"


    // $ANTLR start "rule__DefaultLocale__Group__1"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1338:1: rule__DefaultLocale__Group__1 : rule__DefaultLocale__Group__1__Impl rule__DefaultLocale__Group__2 ;
    public final void rule__DefaultLocale__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1342:1: ( rule__DefaultLocale__Group__1__Impl rule__DefaultLocale__Group__2 )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1343:2: rule__DefaultLocale__Group__1__Impl rule__DefaultLocale__Group__2
            {
            pushFollow(FOLLOW_rule__DefaultLocale__Group__1__Impl_in_rule__DefaultLocale__Group__12648);
            rule__DefaultLocale__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DefaultLocale__Group__2_in_rule__DefaultLocale__Group__12651);
            rule__DefaultLocale__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultLocale__Group__1"


    // $ANTLR start "rule__DefaultLocale__Group__1__Impl"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1350:1: rule__DefaultLocale__Group__1__Impl : ( '=' ) ;
    public final void rule__DefaultLocale__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1354:1: ( ( '=' ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1355:1: ( '=' )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1355:1: ( '=' )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1356:1: '='
            {
             before(grammarAccess.getDefaultLocaleAccess().getEqualsSignKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__DefaultLocale__Group__1__Impl2679); 
             after(grammarAccess.getDefaultLocaleAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultLocale__Group__1__Impl"


    // $ANTLR start "rule__DefaultLocale__Group__2"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1369:1: rule__DefaultLocale__Group__2 : rule__DefaultLocale__Group__2__Impl ;
    public final void rule__DefaultLocale__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1373:1: ( rule__DefaultLocale__Group__2__Impl )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1374:2: rule__DefaultLocale__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DefaultLocale__Group__2__Impl_in_rule__DefaultLocale__Group__22710);
            rule__DefaultLocale__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultLocale__Group__2"


    // $ANTLR start "rule__DefaultLocale__Group__2__Impl"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1380:1: rule__DefaultLocale__Group__2__Impl : ( ( rule__DefaultLocale__LangAssignment_2 ) ) ;
    public final void rule__DefaultLocale__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1384:1: ( ( ( rule__DefaultLocale__LangAssignment_2 ) ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1385:1: ( ( rule__DefaultLocale__LangAssignment_2 ) )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1385:1: ( ( rule__DefaultLocale__LangAssignment_2 ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1386:1: ( rule__DefaultLocale__LangAssignment_2 )
            {
             before(grammarAccess.getDefaultLocaleAccess().getLangAssignment_2()); 
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1387:1: ( rule__DefaultLocale__LangAssignment_2 )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1387:2: rule__DefaultLocale__LangAssignment_2
            {
            pushFollow(FOLLOW_rule__DefaultLocale__LangAssignment_2_in_rule__DefaultLocale__Group__2__Impl2737);
            rule__DefaultLocale__LangAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDefaultLocaleAccess().getLangAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultLocale__Group__2__Impl"


    // $ANTLR start "rule__Model__PackagesAssignment"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1404:1: rule__Model__PackagesAssignment : ( rulePackage ) ;
    public final void rule__Model__PackagesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1408:1: ( ( rulePackage ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1409:1: ( rulePackage )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1409:1: ( rulePackage )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1410:1: rulePackage
            {
             before(grammarAccess.getModelAccess().getPackagesPackageParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePackage_in_rule__Model__PackagesAssignment2778);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPackagesPackageParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__PackagesAssignment"


    // $ANTLR start "rule__Package__NameAssignment_1"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1419:1: rule__Package__NameAssignment_1 : ( ruleFQN ) ;
    public final void rule__Package__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1423:1: ( ( ruleFQN ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1424:1: ( ruleFQN )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1424:1: ( ruleFQN )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1425:1: ruleFQN
            {
             before(grammarAccess.getPackageAccess().getNameFQNParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Package__NameAssignment_12809);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getNameFQNParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__NameAssignment_1"


    // $ANTLR start "rule__Package__SupportedLocalesAssignment_3"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1434:1: rule__Package__SupportedLocalesAssignment_3 : ( ruleSupportedLocales ) ;
    public final void rule__Package__SupportedLocalesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1438:1: ( ( ruleSupportedLocales ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1439:1: ( ruleSupportedLocales )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1439:1: ( ruleSupportedLocales )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1440:1: ruleSupportedLocales
            {
             before(grammarAccess.getPackageAccess().getSupportedLocalesSupportedLocalesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleSupportedLocales_in_rule__Package__SupportedLocalesAssignment_32840);
            ruleSupportedLocales();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getSupportedLocalesSupportedLocalesParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__SupportedLocalesAssignment_3"


    // $ANTLR start "rule__Package__DefaultLocaleAssignment_4"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1449:1: rule__Package__DefaultLocaleAssignment_4 : ( ruleDefaultLocale ) ;
    public final void rule__Package__DefaultLocaleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1453:1: ( ( ruleDefaultLocale ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1454:1: ( ruleDefaultLocale )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1454:1: ( ruleDefaultLocale )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1455:1: ruleDefaultLocale
            {
             before(grammarAccess.getPackageAccess().getDefaultLocaleDefaultLocaleParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleDefaultLocale_in_rule__Package__DefaultLocaleAssignment_42871);
            ruleDefaultLocale();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getDefaultLocaleDefaultLocaleParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__DefaultLocaleAssignment_4"


    // $ANTLR start "rule__Package__PackagesAssignment_5_0"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1464:1: rule__Package__PackagesAssignment_5_0 : ( rulePackage ) ;
    public final void rule__Package__PackagesAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1468:1: ( ( rulePackage ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1469:1: ( rulePackage )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1469:1: ( rulePackage )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1470:1: rulePackage
            {
             before(grammarAccess.getPackageAccess().getPackagesPackageParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_rulePackage_in_rule__Package__PackagesAssignment_5_02902);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getPackagesPackageParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__PackagesAssignment_5_0"


    // $ANTLR start "rule__Package__PropertiesAssignment_5_1"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1479:1: rule__Package__PropertiesAssignment_5_1 : ( ruleProperty ) ;
    public final void rule__Package__PropertiesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1483:1: ( ( ruleProperty ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1484:1: ( ruleProperty )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1484:1: ( ruleProperty )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1485:1: ruleProperty
            {
             before(grammarAccess.getPackageAccess().getPropertiesPropertyParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleProperty_in_rule__Package__PropertiesAssignment_5_12933);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getPropertiesPropertyParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__PropertiesAssignment_5_1"


    // $ANTLR start "rule__SupportedLocales__LocalesAssignment_3"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1494:1: rule__SupportedLocales__LocalesAssignment_3 : ( RULE_LOCALE ) ;
    public final void rule__SupportedLocales__LocalesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1498:1: ( ( RULE_LOCALE ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1499:1: ( RULE_LOCALE )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1499:1: ( RULE_LOCALE )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1500:1: RULE_LOCALE
            {
             before(grammarAccess.getSupportedLocalesAccess().getLocalesLOCALETerminalRuleCall_3_0()); 
            match(input,RULE_LOCALE,FOLLOW_RULE_LOCALE_in_rule__SupportedLocales__LocalesAssignment_32964); 
             after(grammarAccess.getSupportedLocalesAccess().getLocalesLOCALETerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SupportedLocales__LocalesAssignment_3"


    // $ANTLR start "rule__SupportedLocales__LocalesAssignment_4_1"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1509:1: rule__SupportedLocales__LocalesAssignment_4_1 : ( RULE_LOCALE ) ;
    public final void rule__SupportedLocales__LocalesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1513:1: ( ( RULE_LOCALE ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1514:1: ( RULE_LOCALE )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1514:1: ( RULE_LOCALE )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1515:1: RULE_LOCALE
            {
             before(grammarAccess.getSupportedLocalesAccess().getLocalesLOCALETerminalRuleCall_4_1_0()); 
            match(input,RULE_LOCALE,FOLLOW_RULE_LOCALE_in_rule__SupportedLocales__LocalesAssignment_4_12995); 
             after(grammarAccess.getSupportedLocalesAccess().getLocalesLOCALETerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SupportedLocales__LocalesAssignment_4_1"


    // $ANTLR start "rule__Property__KeyAssignment_0"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1524:1: rule__Property__KeyAssignment_0 : ( rulePropertyKey ) ;
    public final void rule__Property__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1528:1: ( ( rulePropertyKey ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1529:1: ( rulePropertyKey )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1529:1: ( rulePropertyKey )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1530:1: rulePropertyKey
            {
             before(grammarAccess.getPropertyAccess().getKeyPropertyKeyParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePropertyKey_in_rule__Property__KeyAssignment_03026);
            rulePropertyKey();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getKeyPropertyKeyParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__KeyAssignment_0"


    // $ANTLR start "rule__Property__ValueAssignment_2"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1539:1: rule__Property__ValueAssignment_2 : ( ruleAbstractPropertyValue ) ;
    public final void rule__Property__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1543:1: ( ( ruleAbstractPropertyValue ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1544:1: ( ruleAbstractPropertyValue )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1544:1: ( ruleAbstractPropertyValue )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1545:1: ruleAbstractPropertyValue
            {
             before(grammarAccess.getPropertyAccess().getValueAbstractPropertyValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAbstractPropertyValue_in_rule__Property__ValueAssignment_23057);
            ruleAbstractPropertyValue();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getValueAbstractPropertyValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__ValueAssignment_2"


    // $ANTLR start "rule__SimplePropertyValue__ValueAssignment"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1554:1: rule__SimplePropertyValue__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__SimplePropertyValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1558:1: ( ( RULE_STRING ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1559:1: ( RULE_STRING )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1559:1: ( RULE_STRING )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1560:1: RULE_STRING
            {
             before(grammarAccess.getSimplePropertyValueAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SimplePropertyValue__ValueAssignment3088); 
             after(grammarAccess.getSimplePropertyValueAccess().getValueSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimplePropertyValue__ValueAssignment"


    // $ANTLR start "rule__ComplexPropertyValue__ItemsAssignment_1"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1569:1: rule__ComplexPropertyValue__ItemsAssignment_1 : ( ruleComplexPropertyValueItem ) ;
    public final void rule__ComplexPropertyValue__ItemsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1573:1: ( ( ruleComplexPropertyValueItem ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1574:1: ( ruleComplexPropertyValueItem )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1574:1: ( ruleComplexPropertyValueItem )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1575:1: ruleComplexPropertyValueItem
            {
             before(grammarAccess.getComplexPropertyValueAccess().getItemsComplexPropertyValueItemParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleComplexPropertyValueItem_in_rule__ComplexPropertyValue__ItemsAssignment_13119);
            ruleComplexPropertyValueItem();

            state._fsp--;

             after(grammarAccess.getComplexPropertyValueAccess().getItemsComplexPropertyValueItemParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexPropertyValue__ItemsAssignment_1"


    // $ANTLR start "rule__ComplexPropertyValueItem__LangAssignment_0"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1584:1: rule__ComplexPropertyValueItem__LangAssignment_0 : ( RULE_LOCALE ) ;
    public final void rule__ComplexPropertyValueItem__LangAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1588:1: ( ( RULE_LOCALE ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1589:1: ( RULE_LOCALE )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1589:1: ( RULE_LOCALE )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1590:1: RULE_LOCALE
            {
             before(grammarAccess.getComplexPropertyValueItemAccess().getLangLOCALETerminalRuleCall_0_0()); 
            match(input,RULE_LOCALE,FOLLOW_RULE_LOCALE_in_rule__ComplexPropertyValueItem__LangAssignment_03150); 
             after(grammarAccess.getComplexPropertyValueItemAccess().getLangLOCALETerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexPropertyValueItem__LangAssignment_0"


    // $ANTLR start "rule__ComplexPropertyValueItem__ValueAssignment_2"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1599:1: rule__ComplexPropertyValueItem__ValueAssignment_2 : ( ruleSimplePropertyValue ) ;
    public final void rule__ComplexPropertyValueItem__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1603:1: ( ( ruleSimplePropertyValue ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1604:1: ( ruleSimplePropertyValue )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1604:1: ( ruleSimplePropertyValue )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1605:1: ruleSimplePropertyValue
            {
             before(grammarAccess.getComplexPropertyValueItemAccess().getValueSimplePropertyValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleSimplePropertyValue_in_rule__ComplexPropertyValueItem__ValueAssignment_23181);
            ruleSimplePropertyValue();

            state._fsp--;

             after(grammarAccess.getComplexPropertyValueItemAccess().getValueSimplePropertyValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexPropertyValueItem__ValueAssignment_2"


    // $ANTLR start "rule__DefaultLocale__LangAssignment_2"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1614:1: rule__DefaultLocale__LangAssignment_2 : ( RULE_LOCALE ) ;
    public final void rule__DefaultLocale__LangAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1618:1: ( ( RULE_LOCALE ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1619:1: ( RULE_LOCALE )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1619:1: ( RULE_LOCALE )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:1620:1: RULE_LOCALE
            {
             before(grammarAccess.getDefaultLocaleAccess().getLangLOCALETerminalRuleCall_2_0()); 
            match(input,RULE_LOCALE,FOLLOW_RULE_LOCALE_in_rule__DefaultLocale__LangAssignment_23212); 
             after(grammarAccess.getDefaultLocaleAccess().getLangLOCALETerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultLocale__LangAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PackagesAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__0_in_rulePackage155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSupportedLocales_in_entryRuleSupportedLocales182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSupportedLocales189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SupportedLocales__Group__0_in_ruleSupportedLocales215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0_in_ruleFQN275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0_in_ruleProperty335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyKey_in_entryRulePropertyKey362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyKey369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePropertyKey395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractPropertyValue_in_entryRuleAbstractPropertyValue421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractPropertyValue428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractPropertyValue__Alternatives_in_ruleAbstractPropertyValue454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimplePropertyValue_in_entryRuleSimplePropertyValue481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimplePropertyValue488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimplePropertyValue__ValueAssignment_in_ruleSimplePropertyValue514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexPropertyValue_in_entryRuleComplexPropertyValue541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexPropertyValue548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexPropertyValue__Group__0_in_ruleComplexPropertyValue574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexPropertyValueItem_in_entryRuleComplexPropertyValueItem601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexPropertyValueItem608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexPropertyValueItem__Group__0_in_ruleComplexPropertyValueItem634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultLocale_in_entryRuleDefaultLocale661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultLocale668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultLocale__Group__0_in_ruleDefaultLocale694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__PackagesAssignment_5_0_in_rule__Package__Alternatives_5730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__PropertiesAssignment_5_1_in_rule__Package__Alternatives_5748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimplePropertyValue_in_rule__AbstractPropertyValue__Alternatives781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexPropertyValue_in_rule__AbstractPropertyValue__Alternatives798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__0828 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Package__Group__1_in_rule__Package__Group__0831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Package__Group__0__Impl859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__1890 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Package__Group__2_in_rule__Package__Group__1893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__NameAssignment_1_in_rule__Package__Group__1__Impl920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__2950 = new BitSet(new long[]{0x000000000010D010L});
    public static final BitSet FOLLOW_rule__Package__Group__3_in_rule__Package__Group__2953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Package__Group__2__Impl981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__31012 = new BitSet(new long[]{0x000000000010D010L});
    public static final BitSet FOLLOW_rule__Package__Group__4_in_rule__Package__Group__31015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__SupportedLocalesAssignment_3_in_rule__Package__Group__3__Impl1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__4__Impl_in_rule__Package__Group__41073 = new BitSet(new long[]{0x000000000010D010L});
    public static final BitSet FOLLOW_rule__Package__Group__5_in_rule__Package__Group__41076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__DefaultLocaleAssignment_4_in_rule__Package__Group__4__Impl1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__5__Impl_in_rule__Package__Group__51134 = new BitSet(new long[]{0x000000000010D010L});
    public static final BitSet FOLLOW_rule__Package__Group__6_in_rule__Package__Group__51137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Alternatives_5_in_rule__Package__Group__5__Impl1164 = new BitSet(new long[]{0x0000000000001012L});
    public static final BitSet FOLLOW_rule__Package__Group__6__Impl_in_rule__Package__Group__61195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Package__Group__6__Impl1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SupportedLocales__Group__0__Impl_in_rule__SupportedLocales__Group__01268 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__SupportedLocales__Group__1_in_rule__SupportedLocales__Group__01271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__SupportedLocales__Group__0__Impl1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SupportedLocales__Group__1__Impl_in_rule__SupportedLocales__Group__11330 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__SupportedLocales__Group__2_in_rule__SupportedLocales__Group__11333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__SupportedLocales__Group__1__Impl1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SupportedLocales__Group__2__Impl_in_rule__SupportedLocales__Group__21392 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SupportedLocales__Group__3_in_rule__SupportedLocales__Group__21395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__SupportedLocales__Group__2__Impl1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SupportedLocales__Group__3__Impl_in_rule__SupportedLocales__Group__31454 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_rule__SupportedLocales__Group__4_in_rule__SupportedLocales__Group__31457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SupportedLocales__LocalesAssignment_3_in_rule__SupportedLocales__Group__3__Impl1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SupportedLocales__Group__4__Impl_in_rule__SupportedLocales__Group__41514 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_rule__SupportedLocales__Group__5_in_rule__SupportedLocales__Group__41517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SupportedLocales__Group_4__0_in_rule__SupportedLocales__Group__4__Impl1544 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__SupportedLocales__Group__5__Impl_in_rule__SupportedLocales__Group__51575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SupportedLocales__Group__5__Impl1603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SupportedLocales__Group_4__0__Impl_in_rule__SupportedLocales__Group_4__01646 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SupportedLocales__Group_4__1_in_rule__SupportedLocales__Group_4__01649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__SupportedLocales__Group_4__0__Impl1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SupportedLocales__Group_4__1__Impl_in_rule__SupportedLocales__Group_4__11708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SupportedLocales__LocalesAssignment_4_1_in_rule__SupportedLocales__Group_4__1__Impl1735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__01769 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__01772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__11828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl1855 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__01890 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__01893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__FQN__Group_1__0__Impl1921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__11952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl1979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__02012 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Property__Group__1_in_rule__Property__Group__02015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__KeyAssignment_0_in_rule__Property__Group__0__Impl2042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__12072 = new BitSet(new long[]{0x0000000000002040L});
    public static final BitSet FOLLOW_rule__Property__Group__2_in_rule__Property__Group__12075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Property__Group__1__Impl2103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__22134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__ValueAssignment_2_in_rule__Property__Group__2__Impl2161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexPropertyValue__Group__0__Impl_in_rule__ComplexPropertyValue__Group__02197 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ComplexPropertyValue__Group__1_in_rule__ComplexPropertyValue__Group__02200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ComplexPropertyValue__Group__0__Impl2228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexPropertyValue__Group__1__Impl_in_rule__ComplexPropertyValue__Group__12259 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__ComplexPropertyValue__Group__2_in_rule__ComplexPropertyValue__Group__12262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexPropertyValue__ItemsAssignment_1_in_rule__ComplexPropertyValue__Group__1__Impl2291 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__ComplexPropertyValue__ItemsAssignment_1_in_rule__ComplexPropertyValue__Group__1__Impl2303 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__ComplexPropertyValue__Group__2__Impl_in_rule__ComplexPropertyValue__Group__22336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ComplexPropertyValue__Group__2__Impl2364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexPropertyValueItem__Group__0__Impl_in_rule__ComplexPropertyValueItem__Group__02401 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__ComplexPropertyValueItem__Group__1_in_rule__ComplexPropertyValueItem__Group__02404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexPropertyValueItem__LangAssignment_0_in_rule__ComplexPropertyValueItem__Group__0__Impl2431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexPropertyValueItem__Group__1__Impl_in_rule__ComplexPropertyValueItem__Group__12461 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ComplexPropertyValueItem__Group__2_in_rule__ComplexPropertyValueItem__Group__12464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ComplexPropertyValueItem__Group__1__Impl2492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexPropertyValueItem__Group__2__Impl_in_rule__ComplexPropertyValueItem__Group__22523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ComplexPropertyValueItem__ValueAssignment_2_in_rule__ComplexPropertyValueItem__Group__2__Impl2550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultLocale__Group__0__Impl_in_rule__DefaultLocale__Group__02586 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__DefaultLocale__Group__1_in_rule__DefaultLocale__Group__02589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__DefaultLocale__Group__0__Impl2617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultLocale__Group__1__Impl_in_rule__DefaultLocale__Group__12648 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DefaultLocale__Group__2_in_rule__DefaultLocale__Group__12651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__DefaultLocale__Group__1__Impl2679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultLocale__Group__2__Impl_in_rule__DefaultLocale__Group__22710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultLocale__LangAssignment_2_in_rule__DefaultLocale__Group__2__Impl2737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_rule__Model__PackagesAssignment2778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Package__NameAssignment_12809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSupportedLocales_in_rule__Package__SupportedLocalesAssignment_32840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultLocale_in_rule__Package__DefaultLocaleAssignment_42871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_rule__Package__PackagesAssignment_5_02902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__Package__PropertiesAssignment_5_12933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOCALE_in_rule__SupportedLocales__LocalesAssignment_32964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOCALE_in_rule__SupportedLocales__LocalesAssignment_4_12995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyKey_in_rule__Property__KeyAssignment_03026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractPropertyValue_in_rule__Property__ValueAssignment_23057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SimplePropertyValue__ValueAssignment3088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexPropertyValueItem_in_rule__ComplexPropertyValue__ItemsAssignment_13119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOCALE_in_rule__ComplexPropertyValueItem__LangAssignment_03150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimplePropertyValue_in_rule__ComplexPropertyValueItem__ValueAssignment_23181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOCALE_in_rule__DefaultLocale__LangAssignment_23212 = new BitSet(new long[]{0x0000000000000002L});

}