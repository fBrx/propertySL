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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'de'", "'en'", "'package'", "'{'", "'}'", "'.'", "'='", "'DEFAULT_LOCALE'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

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

                if ( (LA1_0==13) ) {
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


    // $ANTLR start "entryRuleFQN"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:116:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:117:1: ( ruleFQN EOF )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:118:1: ruleFQN EOF
            {
             before(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN182);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFQNRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN189); 

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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:125:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:129:2: ( ( ( rule__FQN__Group__0 ) ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:130:1: ( ( rule__FQN__Group__0 ) )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:130:1: ( ( rule__FQN__Group__0 ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:131:1: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:132:1: ( rule__FQN__Group__0 )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:132:2: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_rule__FQN__Group__0_in_ruleFQN215);
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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:144:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:145:1: ( ruleProperty EOF )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:146:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty242);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty249); 

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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:153:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:157:2: ( ( ( rule__Property__Group__0 ) ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:158:1: ( ( rule__Property__Group__0 ) )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:158:1: ( ( rule__Property__Group__0 ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:159:1: ( rule__Property__Group__0 )
            {
             before(grammarAccess.getPropertyAccess().getGroup()); 
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:160:1: ( rule__Property__Group__0 )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:160:2: rule__Property__Group__0
            {
            pushFollow(FOLLOW_rule__Property__Group__0_in_ruleProperty275);
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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:172:1: entryRulePropertyKey : rulePropertyKey EOF ;
    public final void entryRulePropertyKey() throws RecognitionException {
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:173:1: ( rulePropertyKey EOF )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:174:1: rulePropertyKey EOF
            {
             before(grammarAccess.getPropertyKeyRule()); 
            pushFollow(FOLLOW_rulePropertyKey_in_entryRulePropertyKey302);
            rulePropertyKey();

            state._fsp--;

             after(grammarAccess.getPropertyKeyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyKey309); 

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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:181:1: rulePropertyKey : ( RULE_ID ) ;
    public final void rulePropertyKey() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:185:2: ( ( RULE_ID ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:186:1: ( RULE_ID )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:186:1: ( RULE_ID )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:187:1: RULE_ID
            {
             before(grammarAccess.getPropertyKeyAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePropertyKey335); 
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


    // $ANTLR start "entryRulePropertyValue"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:200:1: entryRulePropertyValue : rulePropertyValue EOF ;
    public final void entryRulePropertyValue() throws RecognitionException {
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:201:1: ( rulePropertyValue EOF )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:202:1: rulePropertyValue EOF
            {
             before(grammarAccess.getPropertyValueRule()); 
            pushFollow(FOLLOW_rulePropertyValue_in_entryRulePropertyValue361);
            rulePropertyValue();

            state._fsp--;

             after(grammarAccess.getPropertyValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyValue368); 

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
    // $ANTLR end "entryRulePropertyValue"


    // $ANTLR start "rulePropertyValue"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:209:1: rulePropertyValue : ( RULE_ID ) ;
    public final void rulePropertyValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:213:2: ( ( RULE_ID ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:214:1: ( RULE_ID )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:214:1: ( RULE_ID )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:215:1: RULE_ID
            {
             before(grammarAccess.getPropertyValueAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePropertyValue394); 
             after(grammarAccess.getPropertyValueAccess().getIDTerminalRuleCall()); 

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
    // $ANTLR end "rulePropertyValue"


    // $ANTLR start "entryRuleDefaultLocale"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:228:1: entryRuleDefaultLocale : ruleDefaultLocale EOF ;
    public final void entryRuleDefaultLocale() throws RecognitionException {
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:229:1: ( ruleDefaultLocale EOF )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:230:1: ruleDefaultLocale EOF
            {
             before(grammarAccess.getDefaultLocaleRule()); 
            pushFollow(FOLLOW_ruleDefaultLocale_in_entryRuleDefaultLocale420);
            ruleDefaultLocale();

            state._fsp--;

             after(grammarAccess.getDefaultLocaleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultLocale427); 

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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:237:1: ruleDefaultLocale : ( ( rule__DefaultLocale__Group__0 ) ) ;
    public final void ruleDefaultLocale() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:241:2: ( ( ( rule__DefaultLocale__Group__0 ) ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:242:1: ( ( rule__DefaultLocale__Group__0 ) )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:242:1: ( ( rule__DefaultLocale__Group__0 ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:243:1: ( rule__DefaultLocale__Group__0 )
            {
             before(grammarAccess.getDefaultLocaleAccess().getGroup()); 
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:244:1: ( rule__DefaultLocale__Group__0 )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:244:2: rule__DefaultLocale__Group__0
            {
            pushFollow(FOLLOW_rule__DefaultLocale__Group__0_in_ruleDefaultLocale453);
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


    // $ANTLR start "entryRuleLOCALE"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:256:1: entryRuleLOCALE : ruleLOCALE EOF ;
    public final void entryRuleLOCALE() throws RecognitionException {
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:257:1: ( ruleLOCALE EOF )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:258:1: ruleLOCALE EOF
            {
             before(grammarAccess.getLOCALERule()); 
            pushFollow(FOLLOW_ruleLOCALE_in_entryRuleLOCALE480);
            ruleLOCALE();

            state._fsp--;

             after(grammarAccess.getLOCALERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLOCALE487); 

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
    // $ANTLR end "entryRuleLOCALE"


    // $ANTLR start "ruleLOCALE"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:265:1: ruleLOCALE : ( ( rule__LOCALE__Alternatives ) ) ;
    public final void ruleLOCALE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:269:2: ( ( ( rule__LOCALE__Alternatives ) ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:270:1: ( ( rule__LOCALE__Alternatives ) )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:270:1: ( ( rule__LOCALE__Alternatives ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:271:1: ( rule__LOCALE__Alternatives )
            {
             before(grammarAccess.getLOCALEAccess().getAlternatives()); 
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:272:1: ( rule__LOCALE__Alternatives )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:272:2: rule__LOCALE__Alternatives
            {
            pushFollow(FOLLOW_rule__LOCALE__Alternatives_in_ruleLOCALE513);
            rule__LOCALE__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLOCALEAccess().getAlternatives()); 

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
    // $ANTLR end "ruleLOCALE"


    // $ANTLR start "rule__LOCALE__Alternatives"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:284:1: rule__LOCALE__Alternatives : ( ( 'de' ) | ( 'en' ) );
    public final void rule__LOCALE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:288:1: ( ( 'de' ) | ( 'en' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:289:1: ( 'de' )
                    {
                    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:289:1: ( 'de' )
                    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:290:1: 'de'
                    {
                     before(grammarAccess.getLOCALEAccess().getDeKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__LOCALE__Alternatives550); 
                     after(grammarAccess.getLOCALEAccess().getDeKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:297:6: ( 'en' )
                    {
                    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:297:6: ( 'en' )
                    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:298:1: 'en'
                    {
                     before(grammarAccess.getLOCALEAccess().getEnKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__LOCALE__Alternatives570); 
                     after(grammarAccess.getLOCALEAccess().getEnKeyword_1()); 

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
    // $ANTLR end "rule__LOCALE__Alternatives"


    // $ANTLR start "rule__Package__Group__0"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:312:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:316:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:317:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__0602);
            rule__Package__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__1_in_rule__Package__Group__0605);
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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:324:1: rule__Package__Group__0__Impl : ( 'package' ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:328:1: ( ( 'package' ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:329:1: ( 'package' )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:329:1: ( 'package' )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:330:1: 'package'
            {
             before(grammarAccess.getPackageAccess().getPackageKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Package__Group__0__Impl633); 
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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:343:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:347:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:348:2: rule__Package__Group__1__Impl rule__Package__Group__2
            {
            pushFollow(FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__1664);
            rule__Package__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__2_in_rule__Package__Group__1667);
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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:355:1: rule__Package__Group__1__Impl : ( ruleFQN ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:359:1: ( ( ruleFQN ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:360:1: ( ruleFQN )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:360:1: ( ruleFQN )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:361:1: ruleFQN
            {
             before(grammarAccess.getPackageAccess().getFQNParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Package__Group__1__Impl694);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getFQNParserRuleCall_1()); 

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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:372:1: rule__Package__Group__2 : rule__Package__Group__2__Impl rule__Package__Group__3 ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:376:1: ( rule__Package__Group__2__Impl rule__Package__Group__3 )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:377:2: rule__Package__Group__2__Impl rule__Package__Group__3
            {
            pushFollow(FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__2723);
            rule__Package__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__3_in_rule__Package__Group__2726);
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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:384:1: rule__Package__Group__2__Impl : ( '{' ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:388:1: ( ( '{' ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:389:1: ( '{' )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:389:1: ( '{' )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:390:1: '{'
            {
             before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Package__Group__2__Impl754); 
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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:403:1: rule__Package__Group__3 : rule__Package__Group__3__Impl rule__Package__Group__4 ;
    public final void rule__Package__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:407:1: ( rule__Package__Group__3__Impl rule__Package__Group__4 )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:408:2: rule__Package__Group__3__Impl rule__Package__Group__4
            {
            pushFollow(FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__3785);
            rule__Package__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__4_in_rule__Package__Group__3788);
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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:415:1: rule__Package__Group__3__Impl : ( ( ruleDefaultLocale )? ) ;
    public final void rule__Package__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:419:1: ( ( ( ruleDefaultLocale )? ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:420:1: ( ( ruleDefaultLocale )? )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:420:1: ( ( ruleDefaultLocale )? )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:421:1: ( ruleDefaultLocale )?
            {
             before(grammarAccess.getPackageAccess().getDefaultLocaleParserRuleCall_3()); 
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:422:1: ( ruleDefaultLocale )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:422:3: ruleDefaultLocale
                    {
                    pushFollow(FOLLOW_ruleDefaultLocale_in_rule__Package__Group__3__Impl816);
                    ruleDefaultLocale();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPackageAccess().getDefaultLocaleParserRuleCall_3()); 

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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:432:1: rule__Package__Group__4 : rule__Package__Group__4__Impl rule__Package__Group__5 ;
    public final void rule__Package__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:436:1: ( rule__Package__Group__4__Impl rule__Package__Group__5 )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:437:2: rule__Package__Group__4__Impl rule__Package__Group__5
            {
            pushFollow(FOLLOW_rule__Package__Group__4__Impl_in_rule__Package__Group__4847);
            rule__Package__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__5_in_rule__Package__Group__4850);
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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:444:1: rule__Package__Group__4__Impl : ( ( rulePackage )* ) ;
    public final void rule__Package__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:448:1: ( ( ( rulePackage )* ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:449:1: ( ( rulePackage )* )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:449:1: ( ( rulePackage )* )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:450:1: ( rulePackage )*
            {
             before(grammarAccess.getPackageAccess().getPackageParserRuleCall_4()); 
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:451:1: ( rulePackage )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:451:3: rulePackage
            	    {
            	    pushFollow(FOLLOW_rulePackage_in_rule__Package__Group__4__Impl878);
            	    rulePackage();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getPackageAccess().getPackageParserRuleCall_4()); 

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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:461:1: rule__Package__Group__5 : rule__Package__Group__5__Impl rule__Package__Group__6 ;
    public final void rule__Package__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:465:1: ( rule__Package__Group__5__Impl rule__Package__Group__6 )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:466:2: rule__Package__Group__5__Impl rule__Package__Group__6
            {
            pushFollow(FOLLOW_rule__Package__Group__5__Impl_in_rule__Package__Group__5909);
            rule__Package__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__6_in_rule__Package__Group__5912);
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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:473:1: rule__Package__Group__5__Impl : ( ( ruleProperty )* ) ;
    public final void rule__Package__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:477:1: ( ( ( ruleProperty )* ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:478:1: ( ( ruleProperty )* )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:478:1: ( ( ruleProperty )* )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:479:1: ( ruleProperty )*
            {
             before(grammarAccess.getPackageAccess().getPropertyParserRuleCall_5()); 
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:480:1: ( ruleProperty )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:480:3: ruleProperty
            	    {
            	    pushFollow(FOLLOW_ruleProperty_in_rule__Package__Group__5__Impl940);
            	    ruleProperty();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getPackageAccess().getPropertyParserRuleCall_5()); 

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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:490:1: rule__Package__Group__6 : rule__Package__Group__6__Impl ;
    public final void rule__Package__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:494:1: ( rule__Package__Group__6__Impl )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:495:2: rule__Package__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Package__Group__6__Impl_in_rule__Package__Group__6971);
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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:501:1: rule__Package__Group__6__Impl : ( '}' ) ;
    public final void rule__Package__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:505:1: ( ( '}' ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:506:1: ( '}' )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:506:1: ( '}' )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:507:1: '}'
            {
             before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_6()); 
            match(input,15,FOLLOW_15_in_rule__Package__Group__6__Impl999); 
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


    // $ANTLR start "rule__FQN__Group__0"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:534:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:538:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:539:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__01044);
            rule__FQN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__01047);
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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:546:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:550:1: ( ( RULE_ID ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:551:1: ( RULE_ID )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:551:1: ( RULE_ID )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:552:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl1074); 
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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:563:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:567:1: ( rule__FQN__Group__1__Impl )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:568:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__11103);
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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:574:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:578:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:579:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:579:1: ( ( rule__FQN__Group_1__0 )* )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:580:1: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:581:1: ( rule__FQN__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:581:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl1130);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:595:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:599:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:600:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__01165);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__01168);
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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:607:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:611:1: ( ( '.' ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:612:1: ( '.' )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:612:1: ( '.' )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:613:1: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,16,FOLLOW_16_in_rule__FQN__Group_1__0__Impl1196); 
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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:626:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:630:1: ( rule__FQN__Group_1__1__Impl )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:631:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__11227);
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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:637:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:641:1: ( ( RULE_ID ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:642:1: ( RULE_ID )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:642:1: ( RULE_ID )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:643:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl1254); 
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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:658:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:662:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:663:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__01287);
            rule__Property__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Property__Group__1_in_rule__Property__Group__01290);
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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:670:1: rule__Property__Group__0__Impl : ( rulePropertyKey ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:674:1: ( ( rulePropertyKey ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:675:1: ( rulePropertyKey )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:675:1: ( rulePropertyKey )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:676:1: rulePropertyKey
            {
             before(grammarAccess.getPropertyAccess().getPropertyKeyParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePropertyKey_in_rule__Property__Group__0__Impl1317);
            rulePropertyKey();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getPropertyKeyParserRuleCall_0()); 

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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:687:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:691:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:692:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__11346);
            rule__Property__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Property__Group__2_in_rule__Property__Group__11349);
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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:699:1: rule__Property__Group__1__Impl : ( '=' ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:703:1: ( ( '=' ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:704:1: ( '=' )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:704:1: ( '=' )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:705:1: '='
            {
             before(grammarAccess.getPropertyAccess().getEqualsSignKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__Property__Group__1__Impl1377); 
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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:718:1: rule__Property__Group__2 : rule__Property__Group__2__Impl ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:722:1: ( rule__Property__Group__2__Impl )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:723:2: rule__Property__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__21408);
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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:729:1: rule__Property__Group__2__Impl : ( rulePropertyValue ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:733:1: ( ( rulePropertyValue ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:734:1: ( rulePropertyValue )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:734:1: ( rulePropertyValue )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:735:1: rulePropertyValue
            {
             before(grammarAccess.getPropertyAccess().getPropertyValueParserRuleCall_2()); 
            pushFollow(FOLLOW_rulePropertyValue_in_rule__Property__Group__2__Impl1435);
            rulePropertyValue();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getPropertyValueParserRuleCall_2()); 

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


    // $ANTLR start "rule__DefaultLocale__Group__0"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:752:1: rule__DefaultLocale__Group__0 : rule__DefaultLocale__Group__0__Impl rule__DefaultLocale__Group__1 ;
    public final void rule__DefaultLocale__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:756:1: ( rule__DefaultLocale__Group__0__Impl rule__DefaultLocale__Group__1 )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:757:2: rule__DefaultLocale__Group__0__Impl rule__DefaultLocale__Group__1
            {
            pushFollow(FOLLOW_rule__DefaultLocale__Group__0__Impl_in_rule__DefaultLocale__Group__01470);
            rule__DefaultLocale__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DefaultLocale__Group__1_in_rule__DefaultLocale__Group__01473);
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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:764:1: rule__DefaultLocale__Group__0__Impl : ( 'DEFAULT_LOCALE' ) ;
    public final void rule__DefaultLocale__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:768:1: ( ( 'DEFAULT_LOCALE' ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:769:1: ( 'DEFAULT_LOCALE' )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:769:1: ( 'DEFAULT_LOCALE' )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:770:1: 'DEFAULT_LOCALE'
            {
             before(grammarAccess.getDefaultLocaleAccess().getDEFAULT_LOCALEKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__DefaultLocale__Group__0__Impl1501); 
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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:783:1: rule__DefaultLocale__Group__1 : rule__DefaultLocale__Group__1__Impl rule__DefaultLocale__Group__2 ;
    public final void rule__DefaultLocale__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:787:1: ( rule__DefaultLocale__Group__1__Impl rule__DefaultLocale__Group__2 )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:788:2: rule__DefaultLocale__Group__1__Impl rule__DefaultLocale__Group__2
            {
            pushFollow(FOLLOW_rule__DefaultLocale__Group__1__Impl_in_rule__DefaultLocale__Group__11532);
            rule__DefaultLocale__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DefaultLocale__Group__2_in_rule__DefaultLocale__Group__11535);
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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:795:1: rule__DefaultLocale__Group__1__Impl : ( '=' ) ;
    public final void rule__DefaultLocale__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:799:1: ( ( '=' ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:800:1: ( '=' )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:800:1: ( '=' )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:801:1: '='
            {
             before(grammarAccess.getDefaultLocaleAccess().getEqualsSignKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__DefaultLocale__Group__1__Impl1563); 
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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:814:1: rule__DefaultLocale__Group__2 : rule__DefaultLocale__Group__2__Impl ;
    public final void rule__DefaultLocale__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:818:1: ( rule__DefaultLocale__Group__2__Impl )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:819:2: rule__DefaultLocale__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DefaultLocale__Group__2__Impl_in_rule__DefaultLocale__Group__21594);
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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:825:1: rule__DefaultLocale__Group__2__Impl : ( ruleLOCALE ) ;
    public final void rule__DefaultLocale__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:829:1: ( ( ruleLOCALE ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:830:1: ( ruleLOCALE )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:830:1: ( ruleLOCALE )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:831:1: ruleLOCALE
            {
             before(grammarAccess.getDefaultLocaleAccess().getLOCALEParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleLOCALE_in_rule__DefaultLocale__Group__2__Impl1621);
            ruleLOCALE();

            state._fsp--;

             after(grammarAccess.getDefaultLocaleAccess().getLOCALEParserRuleCall_2()); 

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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:849:1: rule__Model__PackagesAssignment : ( rulePackage ) ;
    public final void rule__Model__PackagesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:853:1: ( ( rulePackage ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:854:1: ( rulePackage )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:854:1: ( rulePackage )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:855:1: rulePackage
            {
             before(grammarAccess.getModelAccess().getPackagesPackageParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePackage_in_rule__Model__PackagesAssignment1661);
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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PackagesAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__0_in_rulePackage155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0_in_ruleFQN215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0_in_ruleProperty275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyKey_in_entryRulePropertyKey302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyKey309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePropertyKey335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyValue_in_entryRulePropertyValue361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyValue368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePropertyValue394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultLocale_in_entryRuleDefaultLocale420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultLocale427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultLocale__Group__0_in_ruleDefaultLocale453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLOCALE_in_entryRuleLOCALE480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLOCALE487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LOCALE__Alternatives_in_ruleLOCALE513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__LOCALE__Alternatives550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__LOCALE__Alternatives570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__0602 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Package__Group__1_in_rule__Package__Group__0605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Package__Group__0__Impl633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__1664 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Package__Group__2_in_rule__Package__Group__1667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Package__Group__1__Impl694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__2723 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_rule__Package__Group__3_in_rule__Package__Group__2726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Package__Group__2__Impl754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__3785 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_rule__Package__Group__4_in_rule__Package__Group__3788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultLocale_in_rule__Package__Group__3__Impl816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__4__Impl_in_rule__Package__Group__4847 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_rule__Package__Group__5_in_rule__Package__Group__4850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_rule__Package__Group__4__Impl878 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Package__Group__5__Impl_in_rule__Package__Group__5909 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_rule__Package__Group__6_in_rule__Package__Group__5912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__Package__Group__5__Impl940 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Package__Group__6__Impl_in_rule__Package__Group__6971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Package__Group__6__Impl999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__01044 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__01047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl1074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__11103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl1130 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__01165 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__01168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__FQN__Group_1__0__Impl1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__11227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__01287 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Property__Group__1_in_rule__Property__Group__01290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyKey_in_rule__Property__Group__0__Impl1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__11346 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Property__Group__2_in_rule__Property__Group__11349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Property__Group__1__Impl1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__21408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyValue_in_rule__Property__Group__2__Impl1435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultLocale__Group__0__Impl_in_rule__DefaultLocale__Group__01470 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__DefaultLocale__Group__1_in_rule__DefaultLocale__Group__01473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__DefaultLocale__Group__0__Impl1501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultLocale__Group__1__Impl_in_rule__DefaultLocale__Group__11532 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__DefaultLocale__Group__2_in_rule__DefaultLocale__Group__11535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__DefaultLocale__Group__1__Impl1563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultLocale__Group__2__Impl_in_rule__DefaultLocale__Group__21594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLOCALE_in_rule__DefaultLocale__Group__2__Impl1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_rule__Model__PackagesAssignment1661 = new BitSet(new long[]{0x0000000000000002L});

}