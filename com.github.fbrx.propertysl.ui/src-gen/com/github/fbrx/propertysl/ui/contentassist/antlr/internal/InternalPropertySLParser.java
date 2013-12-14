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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'de'", "'en'", "'package'", "'{'", "'}'", "'='", "'DEFAULT_LOCALE'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
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


    // $ANTLR start "entryRuleProperty"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:116:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:117:1: ( ruleProperty EOF )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:118:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty182);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty189); 

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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:125:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:129:2: ( ( ( rule__Property__Group__0 ) ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:130:1: ( ( rule__Property__Group__0 ) )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:130:1: ( ( rule__Property__Group__0 ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:131:1: ( rule__Property__Group__0 )
            {
             before(grammarAccess.getPropertyAccess().getGroup()); 
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:132:1: ( rule__Property__Group__0 )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:132:2: rule__Property__Group__0
            {
            pushFollow(FOLLOW_rule__Property__Group__0_in_ruleProperty215);
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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:144:1: entryRulePropertyKey : rulePropertyKey EOF ;
    public final void entryRulePropertyKey() throws RecognitionException {
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:145:1: ( rulePropertyKey EOF )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:146:1: rulePropertyKey EOF
            {
             before(grammarAccess.getPropertyKeyRule()); 
            pushFollow(FOLLOW_rulePropertyKey_in_entryRulePropertyKey242);
            rulePropertyKey();

            state._fsp--;

             after(grammarAccess.getPropertyKeyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyKey249); 

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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:153:1: rulePropertyKey : ( RULE_ID ) ;
    public final void rulePropertyKey() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:157:2: ( ( RULE_ID ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:158:1: ( RULE_ID )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:158:1: ( RULE_ID )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:159:1: RULE_ID
            {
             before(grammarAccess.getPropertyKeyAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePropertyKey275); 
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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:172:1: entryRulePropertyValue : rulePropertyValue EOF ;
    public final void entryRulePropertyValue() throws RecognitionException {
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:173:1: ( rulePropertyValue EOF )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:174:1: rulePropertyValue EOF
            {
             before(grammarAccess.getPropertyValueRule()); 
            pushFollow(FOLLOW_rulePropertyValue_in_entryRulePropertyValue301);
            rulePropertyValue();

            state._fsp--;

             after(grammarAccess.getPropertyValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyValue308); 

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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:181:1: rulePropertyValue : ( RULE_ID ) ;
    public final void rulePropertyValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:185:2: ( ( RULE_ID ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:186:1: ( RULE_ID )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:186:1: ( RULE_ID )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:187:1: RULE_ID
            {
             before(grammarAccess.getPropertyValueAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePropertyValue334); 
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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:200:1: entryRuleDefaultLocale : ruleDefaultLocale EOF ;
    public final void entryRuleDefaultLocale() throws RecognitionException {
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:201:1: ( ruleDefaultLocale EOF )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:202:1: ruleDefaultLocale EOF
            {
             before(grammarAccess.getDefaultLocaleRule()); 
            pushFollow(FOLLOW_ruleDefaultLocale_in_entryRuleDefaultLocale360);
            ruleDefaultLocale();

            state._fsp--;

             after(grammarAccess.getDefaultLocaleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultLocale367); 

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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:209:1: ruleDefaultLocale : ( ( rule__DefaultLocale__Group__0 ) ) ;
    public final void ruleDefaultLocale() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:213:2: ( ( ( rule__DefaultLocale__Group__0 ) ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:214:1: ( ( rule__DefaultLocale__Group__0 ) )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:214:1: ( ( rule__DefaultLocale__Group__0 ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:215:1: ( rule__DefaultLocale__Group__0 )
            {
             before(grammarAccess.getDefaultLocaleAccess().getGroup()); 
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:216:1: ( rule__DefaultLocale__Group__0 )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:216:2: rule__DefaultLocale__Group__0
            {
            pushFollow(FOLLOW_rule__DefaultLocale__Group__0_in_ruleDefaultLocale393);
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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:228:1: entryRuleLOCALE : ruleLOCALE EOF ;
    public final void entryRuleLOCALE() throws RecognitionException {
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:229:1: ( ruleLOCALE EOF )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:230:1: ruleLOCALE EOF
            {
             before(grammarAccess.getLOCALERule()); 
            pushFollow(FOLLOW_ruleLOCALE_in_entryRuleLOCALE420);
            ruleLOCALE();

            state._fsp--;

             after(grammarAccess.getLOCALERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLOCALE427); 

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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:237:1: ruleLOCALE : ( ( rule__LOCALE__Alternatives ) ) ;
    public final void ruleLOCALE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:241:2: ( ( ( rule__LOCALE__Alternatives ) ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:242:1: ( ( rule__LOCALE__Alternatives ) )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:242:1: ( ( rule__LOCALE__Alternatives ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:243:1: ( rule__LOCALE__Alternatives )
            {
             before(grammarAccess.getLOCALEAccess().getAlternatives()); 
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:244:1: ( rule__LOCALE__Alternatives )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:244:2: rule__LOCALE__Alternatives
            {
            pushFollow(FOLLOW_rule__LOCALE__Alternatives_in_ruleLOCALE453);
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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:256:1: rule__LOCALE__Alternatives : ( ( 'de' ) | ( 'en' ) );
    public final void rule__LOCALE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:260:1: ( ( 'de' ) | ( 'en' ) )
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
                    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:261:1: ( 'de' )
                    {
                    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:261:1: ( 'de' )
                    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:262:1: 'de'
                    {
                     before(grammarAccess.getLOCALEAccess().getDeKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__LOCALE__Alternatives490); 
                     after(grammarAccess.getLOCALEAccess().getDeKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:269:6: ( 'en' )
                    {
                    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:269:6: ( 'en' )
                    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:270:1: 'en'
                    {
                     before(grammarAccess.getLOCALEAccess().getEnKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__LOCALE__Alternatives510); 
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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:284:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:288:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:289:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__0542);
            rule__Package__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__1_in_rule__Package__Group__0545);
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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:296:1: rule__Package__Group__0__Impl : ( 'package' ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:300:1: ( ( 'package' ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:301:1: ( 'package' )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:301:1: ( 'package' )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:302:1: 'package'
            {
             before(grammarAccess.getPackageAccess().getPackageKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Package__Group__0__Impl573); 
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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:315:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:319:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:320:2: rule__Package__Group__1__Impl rule__Package__Group__2
            {
            pushFollow(FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__1604);
            rule__Package__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__2_in_rule__Package__Group__1607);
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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:327:1: rule__Package__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:331:1: ( ( RULE_ID ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:332:1: ( RULE_ID )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:332:1: ( RULE_ID )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:333:1: RULE_ID
            {
             before(grammarAccess.getPackageAccess().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Package__Group__1__Impl634); 
             after(grammarAccess.getPackageAccess().getIDTerminalRuleCall_1()); 

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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:344:1: rule__Package__Group__2 : rule__Package__Group__2__Impl rule__Package__Group__3 ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:348:1: ( rule__Package__Group__2__Impl rule__Package__Group__3 )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:349:2: rule__Package__Group__2__Impl rule__Package__Group__3
            {
            pushFollow(FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__2663);
            rule__Package__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__3_in_rule__Package__Group__2666);
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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:356:1: rule__Package__Group__2__Impl : ( '{' ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:360:1: ( ( '{' ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:361:1: ( '{' )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:361:1: ( '{' )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:362:1: '{'
            {
             before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Package__Group__2__Impl694); 
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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:375:1: rule__Package__Group__3 : rule__Package__Group__3__Impl rule__Package__Group__4 ;
    public final void rule__Package__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:379:1: ( rule__Package__Group__3__Impl rule__Package__Group__4 )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:380:2: rule__Package__Group__3__Impl rule__Package__Group__4
            {
            pushFollow(FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__3725);
            rule__Package__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__4_in_rule__Package__Group__3728);
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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:387:1: rule__Package__Group__3__Impl : ( ( ruleDefaultLocale )? ) ;
    public final void rule__Package__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:391:1: ( ( ( ruleDefaultLocale )? ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:392:1: ( ( ruleDefaultLocale )? )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:392:1: ( ( ruleDefaultLocale )? )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:393:1: ( ruleDefaultLocale )?
            {
             before(grammarAccess.getPackageAccess().getDefaultLocaleParserRuleCall_3()); 
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:394:1: ( ruleDefaultLocale )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:394:3: ruleDefaultLocale
                    {
                    pushFollow(FOLLOW_ruleDefaultLocale_in_rule__Package__Group__3__Impl756);
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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:404:1: rule__Package__Group__4 : rule__Package__Group__4__Impl rule__Package__Group__5 ;
    public final void rule__Package__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:408:1: ( rule__Package__Group__4__Impl rule__Package__Group__5 )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:409:2: rule__Package__Group__4__Impl rule__Package__Group__5
            {
            pushFollow(FOLLOW_rule__Package__Group__4__Impl_in_rule__Package__Group__4787);
            rule__Package__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Package__Group__5_in_rule__Package__Group__4790);
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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:416:1: rule__Package__Group__4__Impl : ( ( ruleProperty )* ) ;
    public final void rule__Package__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:420:1: ( ( ( ruleProperty )* ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:421:1: ( ( ruleProperty )* )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:421:1: ( ( ruleProperty )* )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:422:1: ( ruleProperty )*
            {
             before(grammarAccess.getPackageAccess().getPropertyParserRuleCall_4()); 
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:423:1: ( ruleProperty )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:423:3: ruleProperty
            	    {
            	    pushFollow(FOLLOW_ruleProperty_in_rule__Package__Group__4__Impl818);
            	    ruleProperty();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getPackageAccess().getPropertyParserRuleCall_4()); 

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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:433:1: rule__Package__Group__5 : rule__Package__Group__5__Impl ;
    public final void rule__Package__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:437:1: ( rule__Package__Group__5__Impl )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:438:2: rule__Package__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Package__Group__5__Impl_in_rule__Package__Group__5849);
            rule__Package__Group__5__Impl();

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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:444:1: rule__Package__Group__5__Impl : ( '}' ) ;
    public final void rule__Package__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:448:1: ( ( '}' ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:449:1: ( '}' )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:449:1: ( '}' )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:450:1: '}'
            {
             before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_15_in_rule__Package__Group__5__Impl877); 
             after(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_5()); 

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


    // $ANTLR start "rule__Property__Group__0"
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:475:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:479:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:480:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__0920);
            rule__Property__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Property__Group__1_in_rule__Property__Group__0923);
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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:487:1: rule__Property__Group__0__Impl : ( rulePropertyKey ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:491:1: ( ( rulePropertyKey ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:492:1: ( rulePropertyKey )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:492:1: ( rulePropertyKey )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:493:1: rulePropertyKey
            {
             before(grammarAccess.getPropertyAccess().getPropertyKeyParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePropertyKey_in_rule__Property__Group__0__Impl950);
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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:504:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:508:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:509:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__1979);
            rule__Property__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Property__Group__2_in_rule__Property__Group__1982);
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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:516:1: rule__Property__Group__1__Impl : ( '=' ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:520:1: ( ( '=' ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:521:1: ( '=' )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:521:1: ( '=' )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:522:1: '='
            {
             before(grammarAccess.getPropertyAccess().getEqualsSignKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__Property__Group__1__Impl1010); 
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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:535:1: rule__Property__Group__2 : rule__Property__Group__2__Impl ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:539:1: ( rule__Property__Group__2__Impl )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:540:2: rule__Property__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__21041);
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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:546:1: rule__Property__Group__2__Impl : ( rulePropertyValue ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:550:1: ( ( rulePropertyValue ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:551:1: ( rulePropertyValue )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:551:1: ( rulePropertyValue )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:552:1: rulePropertyValue
            {
             before(grammarAccess.getPropertyAccess().getPropertyValueParserRuleCall_2()); 
            pushFollow(FOLLOW_rulePropertyValue_in_rule__Property__Group__2__Impl1068);
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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:569:1: rule__DefaultLocale__Group__0 : rule__DefaultLocale__Group__0__Impl rule__DefaultLocale__Group__1 ;
    public final void rule__DefaultLocale__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:573:1: ( rule__DefaultLocale__Group__0__Impl rule__DefaultLocale__Group__1 )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:574:2: rule__DefaultLocale__Group__0__Impl rule__DefaultLocale__Group__1
            {
            pushFollow(FOLLOW_rule__DefaultLocale__Group__0__Impl_in_rule__DefaultLocale__Group__01103);
            rule__DefaultLocale__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DefaultLocale__Group__1_in_rule__DefaultLocale__Group__01106);
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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:581:1: rule__DefaultLocale__Group__0__Impl : ( 'DEFAULT_LOCALE' ) ;
    public final void rule__DefaultLocale__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:585:1: ( ( 'DEFAULT_LOCALE' ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:586:1: ( 'DEFAULT_LOCALE' )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:586:1: ( 'DEFAULT_LOCALE' )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:587:1: 'DEFAULT_LOCALE'
            {
             before(grammarAccess.getDefaultLocaleAccess().getDEFAULT_LOCALEKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__DefaultLocale__Group__0__Impl1134); 
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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:600:1: rule__DefaultLocale__Group__1 : rule__DefaultLocale__Group__1__Impl rule__DefaultLocale__Group__2 ;
    public final void rule__DefaultLocale__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:604:1: ( rule__DefaultLocale__Group__1__Impl rule__DefaultLocale__Group__2 )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:605:2: rule__DefaultLocale__Group__1__Impl rule__DefaultLocale__Group__2
            {
            pushFollow(FOLLOW_rule__DefaultLocale__Group__1__Impl_in_rule__DefaultLocale__Group__11165);
            rule__DefaultLocale__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DefaultLocale__Group__2_in_rule__DefaultLocale__Group__11168);
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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:612:1: rule__DefaultLocale__Group__1__Impl : ( '=' ) ;
    public final void rule__DefaultLocale__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:616:1: ( ( '=' ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:617:1: ( '=' )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:617:1: ( '=' )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:618:1: '='
            {
             before(grammarAccess.getDefaultLocaleAccess().getEqualsSignKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__DefaultLocale__Group__1__Impl1196); 
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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:631:1: rule__DefaultLocale__Group__2 : rule__DefaultLocale__Group__2__Impl ;
    public final void rule__DefaultLocale__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:635:1: ( rule__DefaultLocale__Group__2__Impl )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:636:2: rule__DefaultLocale__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DefaultLocale__Group__2__Impl_in_rule__DefaultLocale__Group__21227);
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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:642:1: rule__DefaultLocale__Group__2__Impl : ( ruleLOCALE ) ;
    public final void rule__DefaultLocale__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:646:1: ( ( ruleLOCALE ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:647:1: ( ruleLOCALE )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:647:1: ( ruleLOCALE )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:648:1: ruleLOCALE
            {
             before(grammarAccess.getDefaultLocaleAccess().getLOCALEParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleLOCALE_in_rule__DefaultLocale__Group__2__Impl1254);
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
    // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:666:1: rule__Model__PackagesAssignment : ( rulePackage ) ;
    public final void rule__Model__PackagesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:670:1: ( ( rulePackage ) )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:671:1: ( rulePackage )
            {
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:671:1: ( rulePackage )
            // ../com.github.fbrx.propertysl.ui/src-gen/com/github/fbrx/propertysl/ui/contentassist/antlr/internal/InternalPropertySL.g:672:1: rulePackage
            {
             before(grammarAccess.getModelAccess().getPackagesPackageParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePackage_in_rule__Model__PackagesAssignment1294);
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
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0_in_ruleProperty215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyKey_in_entryRulePropertyKey242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyKey249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePropertyKey275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyValue_in_entryRulePropertyValue301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyValue308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePropertyValue334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultLocale_in_entryRuleDefaultLocale360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultLocale367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultLocale__Group__0_in_ruleDefaultLocale393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLOCALE_in_entryRuleLOCALE420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLOCALE427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LOCALE__Alternatives_in_ruleLOCALE453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__LOCALE__Alternatives490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__LOCALE__Alternatives510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__0542 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Package__Group__1_in_rule__Package__Group__0545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Package__Group__0__Impl573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__1604 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Package__Group__2_in_rule__Package__Group__1607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Package__Group__1__Impl634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__2663 = new BitSet(new long[]{0x0000000000028010L});
    public static final BitSet FOLLOW_rule__Package__Group__3_in_rule__Package__Group__2666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Package__Group__2__Impl694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__3__Impl_in_rule__Package__Group__3725 = new BitSet(new long[]{0x0000000000028010L});
    public static final BitSet FOLLOW_rule__Package__Group__4_in_rule__Package__Group__3728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultLocale_in_rule__Package__Group__3__Impl756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__4__Impl_in_rule__Package__Group__4787 = new BitSet(new long[]{0x0000000000028010L});
    public static final BitSet FOLLOW_rule__Package__Group__5_in_rule__Package__Group__4790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__Package__Group__4__Impl818 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Package__Group__5__Impl_in_rule__Package__Group__5849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Package__Group__5__Impl877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__0920 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Property__Group__1_in_rule__Property__Group__0923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyKey_in_rule__Property__Group__0__Impl950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__1979 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Property__Group__2_in_rule__Property__Group__1982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Property__Group__1__Impl1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__21041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyValue_in_rule__Property__Group__2__Impl1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultLocale__Group__0__Impl_in_rule__DefaultLocale__Group__01103 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__DefaultLocale__Group__1_in_rule__DefaultLocale__Group__01106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__DefaultLocale__Group__0__Impl1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultLocale__Group__1__Impl_in_rule__DefaultLocale__Group__11165 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__DefaultLocale__Group__2_in_rule__DefaultLocale__Group__11168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__DefaultLocale__Group__1__Impl1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultLocale__Group__2__Impl_in_rule__DefaultLocale__Group__21227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLOCALE_in_rule__DefaultLocale__Group__2__Impl1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_rule__Model__PackagesAssignment1294 = new BitSet(new long[]{0x0000000000000002L});

}