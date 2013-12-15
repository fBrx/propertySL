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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPropertySLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LOCALE", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'{'", "'}'", "'SUPPORTED_LOCALES'", "'='", "','", "'.'", "':'", "'DEFAULT_LOCALE'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_LOCALE=4;
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
    public String getGrammarFileName() { return "../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g"; }



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



    // $ANTLR start "entryRuleModel"
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:76:1: ruleModel returns [EObject current=null] : ( (lv_packages_0_0= rulePackage ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_packages_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:79:28: ( ( (lv_packages_0_0= rulePackage ) )* )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:80:1: ( (lv_packages_0_0= rulePackage ) )*
            {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:80:1: ( (lv_packages_0_0= rulePackage ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:81:1: (lv_packages_0_0= rulePackage )
            	    {
            	    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:81:1: (lv_packages_0_0= rulePackage )
            	    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:82:3: lv_packages_0_0= rulePackage
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getPackagesPackageParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePackage_in_ruleModel130);
            	    lv_packages_0_0=rulePackage();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"packages",
            	            		lv_packages_0_0, 
            	            		"Package");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePackage"
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:106:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:107:2: (iv_rulePackage= rulePackage EOF )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:108:2: iv_rulePackage= rulePackage EOF
            {
             newCompositeNode(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_rulePackage_in_entryRulePackage166);
            iv_rulePackage=rulePackage();

            state._fsp--;

             current =iv_rulePackage; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage176); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:115:1: rulePackage returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '{' ( (lv_supportedLocales_3_0= ruleSupportedLocales ) )? ( (lv_defaultLocale_4_0= ruleDefaultLocale ) )? ( ( (lv_packages_5_0= rulePackage ) ) | ( (lv_properties_6_0= ruleProperty ) ) )* otherlv_7= '}' ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_supportedLocales_3_0 = null;

        EObject lv_defaultLocale_4_0 = null;

        EObject lv_packages_5_0 = null;

        EObject lv_properties_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:118:28: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '{' ( (lv_supportedLocales_3_0= ruleSupportedLocales ) )? ( (lv_defaultLocale_4_0= ruleDefaultLocale ) )? ( ( (lv_packages_5_0= rulePackage ) ) | ( (lv_properties_6_0= ruleProperty ) ) )* otherlv_7= '}' ) )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:119:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '{' ( (lv_supportedLocales_3_0= ruleSupportedLocales ) )? ( (lv_defaultLocale_4_0= ruleDefaultLocale ) )? ( ( (lv_packages_5_0= rulePackage ) ) | ( (lv_properties_6_0= ruleProperty ) ) )* otherlv_7= '}' )
            {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:119:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '{' ( (lv_supportedLocales_3_0= ruleSupportedLocales ) )? ( (lv_defaultLocale_4_0= ruleDefaultLocale ) )? ( ( (lv_packages_5_0= rulePackage ) ) | ( (lv_properties_6_0= ruleProperty ) ) )* otherlv_7= '}' )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:119:3: otherlv_0= 'package' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '{' ( (lv_supportedLocales_3_0= ruleSupportedLocales ) )? ( (lv_defaultLocale_4_0= ruleDefaultLocale ) )? ( ( (lv_packages_5_0= rulePackage ) ) | ( (lv_properties_6_0= ruleProperty ) ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_rulePackage213); 

                	newLeafNode(otherlv_0, grammarAccess.getPackageAccess().getPackageKeyword_0());
                
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:123:1: ( (lv_name_1_0= ruleFQN ) )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:124:1: (lv_name_1_0= ruleFQN )
            {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:124:1: (lv_name_1_0= ruleFQN )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:125:3: lv_name_1_0= ruleFQN
            {
             
            	        newCompositeNode(grammarAccess.getPackageAccess().getNameFQNParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_rulePackage234);
            lv_name_1_0=ruleFQN();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPackageRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"FQN");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_rulePackage246); 

                	newLeafNode(otherlv_2, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:145:1: ( (lv_supportedLocales_3_0= ruleSupportedLocales ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:146:1: (lv_supportedLocales_3_0= ruleSupportedLocales )
                    {
                    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:146:1: (lv_supportedLocales_3_0= ruleSupportedLocales )
                    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:147:3: lv_supportedLocales_3_0= ruleSupportedLocales
                    {
                     
                    	        newCompositeNode(grammarAccess.getPackageAccess().getSupportedLocalesSupportedLocalesParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSupportedLocales_in_rulePackage267);
                    lv_supportedLocales_3_0=ruleSupportedLocales();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPackageRule());
                    	        }
                           		set(
                           			current, 
                           			"supportedLocales",
                            		lv_supportedLocales_3_0, 
                            		"SupportedLocales");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:163:3: ( (lv_defaultLocale_4_0= ruleDefaultLocale ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:164:1: (lv_defaultLocale_4_0= ruleDefaultLocale )
                    {
                    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:164:1: (lv_defaultLocale_4_0= ruleDefaultLocale )
                    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:165:3: lv_defaultLocale_4_0= ruleDefaultLocale
                    {
                     
                    	        newCompositeNode(grammarAccess.getPackageAccess().getDefaultLocaleDefaultLocaleParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDefaultLocale_in_rulePackage289);
                    lv_defaultLocale_4_0=ruleDefaultLocale();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPackageRule());
                    	        }
                           		set(
                           			current, 
                           			"defaultLocale",
                            		lv_defaultLocale_4_0, 
                            		"DefaultLocale");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:181:3: ( ( (lv_packages_5_0= rulePackage ) ) | ( (lv_properties_6_0= ruleProperty ) ) )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==12) ) {
                    alt4=1;
                }
                else if ( (LA4_0==RULE_ID) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:181:4: ( (lv_packages_5_0= rulePackage ) )
            	    {
            	    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:181:4: ( (lv_packages_5_0= rulePackage ) )
            	    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:182:1: (lv_packages_5_0= rulePackage )
            	    {
            	    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:182:1: (lv_packages_5_0= rulePackage )
            	    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:183:3: lv_packages_5_0= rulePackage
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPackageAccess().getPackagesPackageParserRuleCall_5_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePackage_in_rulePackage312);
            	    lv_packages_5_0=rulePackage();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPackageRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"packages",
            	            		lv_packages_5_0, 
            	            		"Package");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:200:6: ( (lv_properties_6_0= ruleProperty ) )
            	    {
            	    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:200:6: ( (lv_properties_6_0= ruleProperty ) )
            	    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:201:1: (lv_properties_6_0= ruleProperty )
            	    {
            	    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:201:1: (lv_properties_6_0= ruleProperty )
            	    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:202:3: lv_properties_6_0= ruleProperty
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPackageAccess().getPropertiesPropertyParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProperty_in_rulePackage339);
            	    lv_properties_6_0=ruleProperty();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPackageRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"properties",
            	            		lv_properties_6_0, 
            	            		"Property");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_7=(Token)match(input,14,FOLLOW_14_in_rulePackage353); 

                	newLeafNode(otherlv_7, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleSupportedLocales"
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:230:1: entryRuleSupportedLocales returns [EObject current=null] : iv_ruleSupportedLocales= ruleSupportedLocales EOF ;
    public final EObject entryRuleSupportedLocales() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSupportedLocales = null;


        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:231:2: (iv_ruleSupportedLocales= ruleSupportedLocales EOF )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:232:2: iv_ruleSupportedLocales= ruleSupportedLocales EOF
            {
             newCompositeNode(grammarAccess.getSupportedLocalesRule()); 
            pushFollow(FOLLOW_ruleSupportedLocales_in_entryRuleSupportedLocales389);
            iv_ruleSupportedLocales=ruleSupportedLocales();

            state._fsp--;

             current =iv_ruleSupportedLocales; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSupportedLocales399); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSupportedLocales"


    // $ANTLR start "ruleSupportedLocales"
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:239:1: ruleSupportedLocales returns [EObject current=null] : (otherlv_0= 'SUPPORTED_LOCALES' otherlv_1= '=' otherlv_2= '{' ( (lv_locales_3_0= RULE_LOCALE ) ) (otherlv_4= ',' ( (lv_locales_5_0= RULE_LOCALE ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleSupportedLocales() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_locales_3_0=null;
        Token otherlv_4=null;
        Token lv_locales_5_0=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:242:28: ( (otherlv_0= 'SUPPORTED_LOCALES' otherlv_1= '=' otherlv_2= '{' ( (lv_locales_3_0= RULE_LOCALE ) ) (otherlv_4= ',' ( (lv_locales_5_0= RULE_LOCALE ) ) )* otherlv_6= '}' ) )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:243:1: (otherlv_0= 'SUPPORTED_LOCALES' otherlv_1= '=' otherlv_2= '{' ( (lv_locales_3_0= RULE_LOCALE ) ) (otherlv_4= ',' ( (lv_locales_5_0= RULE_LOCALE ) ) )* otherlv_6= '}' )
            {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:243:1: (otherlv_0= 'SUPPORTED_LOCALES' otherlv_1= '=' otherlv_2= '{' ( (lv_locales_3_0= RULE_LOCALE ) ) (otherlv_4= ',' ( (lv_locales_5_0= RULE_LOCALE ) ) )* otherlv_6= '}' )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:243:3: otherlv_0= 'SUPPORTED_LOCALES' otherlv_1= '=' otherlv_2= '{' ( (lv_locales_3_0= RULE_LOCALE ) ) (otherlv_4= ',' ( (lv_locales_5_0= RULE_LOCALE ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSupportedLocales436); 

                	newLeafNode(otherlv_0, grammarAccess.getSupportedLocalesAccess().getSUPPORTED_LOCALESKeyword_0());
                
            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleSupportedLocales448); 

                	newLeafNode(otherlv_1, grammarAccess.getSupportedLocalesAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleSupportedLocales460); 

                	newLeafNode(otherlv_2, grammarAccess.getSupportedLocalesAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:255:1: ( (lv_locales_3_0= RULE_LOCALE ) )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:256:1: (lv_locales_3_0= RULE_LOCALE )
            {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:256:1: (lv_locales_3_0= RULE_LOCALE )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:257:3: lv_locales_3_0= RULE_LOCALE
            {
            lv_locales_3_0=(Token)match(input,RULE_LOCALE,FOLLOW_RULE_LOCALE_in_ruleSupportedLocales477); 

            			newLeafNode(lv_locales_3_0, grammarAccess.getSupportedLocalesAccess().getLocalesLOCALETerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSupportedLocalesRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"locales",
                    		lv_locales_3_0, 
                    		"LOCALE");
            	    

            }


            }

            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:273:2: (otherlv_4= ',' ( (lv_locales_5_0= RULE_LOCALE ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:273:4: otherlv_4= ',' ( (lv_locales_5_0= RULE_LOCALE ) )
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleSupportedLocales495); 

            	        	newLeafNode(otherlv_4, grammarAccess.getSupportedLocalesAccess().getCommaKeyword_4_0());
            	        
            	    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:277:1: ( (lv_locales_5_0= RULE_LOCALE ) )
            	    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:278:1: (lv_locales_5_0= RULE_LOCALE )
            	    {
            	    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:278:1: (lv_locales_5_0= RULE_LOCALE )
            	    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:279:3: lv_locales_5_0= RULE_LOCALE
            	    {
            	    lv_locales_5_0=(Token)match(input,RULE_LOCALE,FOLLOW_RULE_LOCALE_in_ruleSupportedLocales512); 

            	    			newLeafNode(lv_locales_5_0, grammarAccess.getSupportedLocalesAccess().getLocalesLOCALETerminalRuleCall_4_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSupportedLocalesRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"locales",
            	            		lv_locales_5_0, 
            	            		"LOCALE");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleSupportedLocales531); 

                	newLeafNode(otherlv_6, grammarAccess.getSupportedLocalesAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSupportedLocales"


    // $ANTLR start "entryRuleFQN"
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:307:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:308:2: (iv_ruleFQN= ruleFQN EOF )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:309:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN568);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN579); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:316:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:319:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:320:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:320:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:320:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN619); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:327:1: (kw= '.' this_ID_2= RULE_ID )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:328:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,18,FOLLOW_18_in_ruleFQN638); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN653); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleProperty"
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:348:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:349:2: (iv_ruleProperty= ruleProperty EOF )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:350:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty700);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty710); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:357:1: ruleProperty returns [EObject current=null] : ( ( (lv_key_0_0= rulePropertyKey ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAbstractPropertyValue ) ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:360:28: ( ( ( (lv_key_0_0= rulePropertyKey ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAbstractPropertyValue ) ) ) )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:361:1: ( ( (lv_key_0_0= rulePropertyKey ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAbstractPropertyValue ) ) )
            {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:361:1: ( ( (lv_key_0_0= rulePropertyKey ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAbstractPropertyValue ) ) )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:361:2: ( (lv_key_0_0= rulePropertyKey ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAbstractPropertyValue ) )
            {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:361:2: ( (lv_key_0_0= rulePropertyKey ) )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:362:1: (lv_key_0_0= rulePropertyKey )
            {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:362:1: (lv_key_0_0= rulePropertyKey )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:363:3: lv_key_0_0= rulePropertyKey
            {
             
            	        newCompositeNode(grammarAccess.getPropertyAccess().getKeyPropertyKeyParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulePropertyKey_in_ruleProperty756);
            lv_key_0_0=rulePropertyKey();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPropertyRule());
            	        }
                   		set(
                   			current, 
                   			"key",
                    		lv_key_0_0, 
                    		"PropertyKey");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleProperty768); 

                	newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getEqualsSignKeyword_1());
                
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:383:1: ( (lv_value_2_0= ruleAbstractPropertyValue ) )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:384:1: (lv_value_2_0= ruleAbstractPropertyValue )
            {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:384:1: (lv_value_2_0= ruleAbstractPropertyValue )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:385:3: lv_value_2_0= ruleAbstractPropertyValue
            {
             
            	        newCompositeNode(grammarAccess.getPropertyAccess().getValueAbstractPropertyValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAbstractPropertyValue_in_ruleProperty789);
            lv_value_2_0=ruleAbstractPropertyValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPropertyRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"AbstractPropertyValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRulePropertyKey"
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:409:1: entryRulePropertyKey returns [String current=null] : iv_rulePropertyKey= rulePropertyKey EOF ;
    public final String entryRulePropertyKey() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePropertyKey = null;


        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:410:2: (iv_rulePropertyKey= rulePropertyKey EOF )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:411:2: iv_rulePropertyKey= rulePropertyKey EOF
            {
             newCompositeNode(grammarAccess.getPropertyKeyRule()); 
            pushFollow(FOLLOW_rulePropertyKey_in_entryRulePropertyKey826);
            iv_rulePropertyKey=rulePropertyKey();

            state._fsp--;

             current =iv_rulePropertyKey.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyKey837); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyKey"


    // $ANTLR start "rulePropertyKey"
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:418:1: rulePropertyKey returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken rulePropertyKey() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:421:28: (this_ID_0= RULE_ID )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:422:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePropertyKey876); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getPropertyKeyAccess().getIDTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyKey"


    // $ANTLR start "entryRuleAbstractPropertyValue"
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:437:1: entryRuleAbstractPropertyValue returns [EObject current=null] : iv_ruleAbstractPropertyValue= ruleAbstractPropertyValue EOF ;
    public final EObject entryRuleAbstractPropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractPropertyValue = null;


        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:438:2: (iv_ruleAbstractPropertyValue= ruleAbstractPropertyValue EOF )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:439:2: iv_ruleAbstractPropertyValue= ruleAbstractPropertyValue EOF
            {
             newCompositeNode(grammarAccess.getAbstractPropertyValueRule()); 
            pushFollow(FOLLOW_ruleAbstractPropertyValue_in_entryRuleAbstractPropertyValue920);
            iv_ruleAbstractPropertyValue=ruleAbstractPropertyValue();

            state._fsp--;

             current =iv_ruleAbstractPropertyValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractPropertyValue930); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractPropertyValue"


    // $ANTLR start "ruleAbstractPropertyValue"
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:446:1: ruleAbstractPropertyValue returns [EObject current=null] : (this_SimplePropertyValue_0= ruleSimplePropertyValue | this_ComplexPropertyValue_1= ruleComplexPropertyValue ) ;
    public final EObject ruleAbstractPropertyValue() throws RecognitionException {
        EObject current = null;

        EObject this_SimplePropertyValue_0 = null;

        EObject this_ComplexPropertyValue_1 = null;


         enterRule(); 
            
        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:449:28: ( (this_SimplePropertyValue_0= ruleSimplePropertyValue | this_ComplexPropertyValue_1= ruleComplexPropertyValue ) )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:450:1: (this_SimplePropertyValue_0= ruleSimplePropertyValue | this_ComplexPropertyValue_1= ruleComplexPropertyValue )
            {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:450:1: (this_SimplePropertyValue_0= ruleSimplePropertyValue | this_ComplexPropertyValue_1= ruleComplexPropertyValue )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==13) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:451:5: this_SimplePropertyValue_0= ruleSimplePropertyValue
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractPropertyValueAccess().getSimplePropertyValueParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSimplePropertyValue_in_ruleAbstractPropertyValue977);
                    this_SimplePropertyValue_0=ruleSimplePropertyValue();

                    state._fsp--;

                     
                            current = this_SimplePropertyValue_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:461:5: this_ComplexPropertyValue_1= ruleComplexPropertyValue
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractPropertyValueAccess().getComplexPropertyValueParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleComplexPropertyValue_in_ruleAbstractPropertyValue1004);
                    this_ComplexPropertyValue_1=ruleComplexPropertyValue();

                    state._fsp--;

                     
                            current = this_ComplexPropertyValue_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractPropertyValue"


    // $ANTLR start "entryRuleSimplePropertyValue"
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:477:1: entryRuleSimplePropertyValue returns [EObject current=null] : iv_ruleSimplePropertyValue= ruleSimplePropertyValue EOF ;
    public final EObject entryRuleSimplePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimplePropertyValue = null;


        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:478:2: (iv_ruleSimplePropertyValue= ruleSimplePropertyValue EOF )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:479:2: iv_ruleSimplePropertyValue= ruleSimplePropertyValue EOF
            {
             newCompositeNode(grammarAccess.getSimplePropertyValueRule()); 
            pushFollow(FOLLOW_ruleSimplePropertyValue_in_entryRuleSimplePropertyValue1039);
            iv_ruleSimplePropertyValue=ruleSimplePropertyValue();

            state._fsp--;

             current =iv_ruleSimplePropertyValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimplePropertyValue1049); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimplePropertyValue"


    // $ANTLR start "ruleSimplePropertyValue"
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:486:1: ruleSimplePropertyValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleSimplePropertyValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:489:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:490:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:490:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:491:1: (lv_value_0_0= RULE_STRING )
            {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:491:1: (lv_value_0_0= RULE_STRING )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:492:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSimplePropertyValue1090); 

            			newLeafNode(lv_value_0_0, grammarAccess.getSimplePropertyValueAccess().getValueSTRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSimplePropertyValueRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"STRING");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimplePropertyValue"


    // $ANTLR start "entryRuleComplexPropertyValue"
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:516:1: entryRuleComplexPropertyValue returns [EObject current=null] : iv_ruleComplexPropertyValue= ruleComplexPropertyValue EOF ;
    public final EObject entryRuleComplexPropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexPropertyValue = null;


        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:517:2: (iv_ruleComplexPropertyValue= ruleComplexPropertyValue EOF )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:518:2: iv_ruleComplexPropertyValue= ruleComplexPropertyValue EOF
            {
             newCompositeNode(grammarAccess.getComplexPropertyValueRule()); 
            pushFollow(FOLLOW_ruleComplexPropertyValue_in_entryRuleComplexPropertyValue1130);
            iv_ruleComplexPropertyValue=ruleComplexPropertyValue();

            state._fsp--;

             current =iv_ruleComplexPropertyValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexPropertyValue1140); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComplexPropertyValue"


    // $ANTLR start "ruleComplexPropertyValue"
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:525:1: ruleComplexPropertyValue returns [EObject current=null] : (otherlv_0= '{' ( (lv_items_1_0= ruleComplexPropertyValueItem ) )+ otherlv_2= '}' ) ;
    public final EObject ruleComplexPropertyValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_items_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:528:28: ( (otherlv_0= '{' ( (lv_items_1_0= ruleComplexPropertyValueItem ) )+ otherlv_2= '}' ) )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:529:1: (otherlv_0= '{' ( (lv_items_1_0= ruleComplexPropertyValueItem ) )+ otherlv_2= '}' )
            {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:529:1: (otherlv_0= '{' ( (lv_items_1_0= ruleComplexPropertyValueItem ) )+ otherlv_2= '}' )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:529:3: otherlv_0= '{' ( (lv_items_1_0= ruleComplexPropertyValueItem ) )+ otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleComplexPropertyValue1177); 

                	newLeafNode(otherlv_0, grammarAccess.getComplexPropertyValueAccess().getLeftCurlyBracketKeyword_0());
                
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:533:1: ( (lv_items_1_0= ruleComplexPropertyValueItem ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_LOCALE) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:534:1: (lv_items_1_0= ruleComplexPropertyValueItem )
            	    {
            	    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:534:1: (lv_items_1_0= ruleComplexPropertyValueItem )
            	    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:535:3: lv_items_1_0= ruleComplexPropertyValueItem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComplexPropertyValueAccess().getItemsComplexPropertyValueItemParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleComplexPropertyValueItem_in_ruleComplexPropertyValue1198);
            	    lv_items_1_0=ruleComplexPropertyValueItem();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComplexPropertyValueRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"items",
            	            		lv_items_1_0, 
            	            		"ComplexPropertyValueItem");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleComplexPropertyValue1211); 

                	newLeafNode(otherlv_2, grammarAccess.getComplexPropertyValueAccess().getRightCurlyBracketKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComplexPropertyValue"


    // $ANTLR start "entryRuleComplexPropertyValueItem"
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:563:1: entryRuleComplexPropertyValueItem returns [EObject current=null] : iv_ruleComplexPropertyValueItem= ruleComplexPropertyValueItem EOF ;
    public final EObject entryRuleComplexPropertyValueItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexPropertyValueItem = null;


        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:564:2: (iv_ruleComplexPropertyValueItem= ruleComplexPropertyValueItem EOF )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:565:2: iv_ruleComplexPropertyValueItem= ruleComplexPropertyValueItem EOF
            {
             newCompositeNode(grammarAccess.getComplexPropertyValueItemRule()); 
            pushFollow(FOLLOW_ruleComplexPropertyValueItem_in_entryRuleComplexPropertyValueItem1247);
            iv_ruleComplexPropertyValueItem=ruleComplexPropertyValueItem();

            state._fsp--;

             current =iv_ruleComplexPropertyValueItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexPropertyValueItem1257); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComplexPropertyValueItem"


    // $ANTLR start "ruleComplexPropertyValueItem"
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:572:1: ruleComplexPropertyValueItem returns [EObject current=null] : ( ( (lv_lang_0_0= RULE_LOCALE ) ) otherlv_1= ':' ( (lv_value_2_0= ruleSimplePropertyValue ) ) ) ;
    public final EObject ruleComplexPropertyValueItem() throws RecognitionException {
        EObject current = null;

        Token lv_lang_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:575:28: ( ( ( (lv_lang_0_0= RULE_LOCALE ) ) otherlv_1= ':' ( (lv_value_2_0= ruleSimplePropertyValue ) ) ) )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:576:1: ( ( (lv_lang_0_0= RULE_LOCALE ) ) otherlv_1= ':' ( (lv_value_2_0= ruleSimplePropertyValue ) ) )
            {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:576:1: ( ( (lv_lang_0_0= RULE_LOCALE ) ) otherlv_1= ':' ( (lv_value_2_0= ruleSimplePropertyValue ) ) )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:576:2: ( (lv_lang_0_0= RULE_LOCALE ) ) otherlv_1= ':' ( (lv_value_2_0= ruleSimplePropertyValue ) )
            {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:576:2: ( (lv_lang_0_0= RULE_LOCALE ) )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:577:1: (lv_lang_0_0= RULE_LOCALE )
            {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:577:1: (lv_lang_0_0= RULE_LOCALE )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:578:3: lv_lang_0_0= RULE_LOCALE
            {
            lv_lang_0_0=(Token)match(input,RULE_LOCALE,FOLLOW_RULE_LOCALE_in_ruleComplexPropertyValueItem1299); 

            			newLeafNode(lv_lang_0_0, grammarAccess.getComplexPropertyValueItemAccess().getLangLOCALETerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getComplexPropertyValueItemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"lang",
                    		lv_lang_0_0, 
                    		"LOCALE");
            	    

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleComplexPropertyValueItem1316); 

                	newLeafNode(otherlv_1, grammarAccess.getComplexPropertyValueItemAccess().getColonKeyword_1());
                
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:598:1: ( (lv_value_2_0= ruleSimplePropertyValue ) )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:599:1: (lv_value_2_0= ruleSimplePropertyValue )
            {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:599:1: (lv_value_2_0= ruleSimplePropertyValue )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:600:3: lv_value_2_0= ruleSimplePropertyValue
            {
             
            	        newCompositeNode(grammarAccess.getComplexPropertyValueItemAccess().getValueSimplePropertyValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSimplePropertyValue_in_ruleComplexPropertyValueItem1337);
            lv_value_2_0=ruleSimplePropertyValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getComplexPropertyValueItemRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"SimplePropertyValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComplexPropertyValueItem"


    // $ANTLR start "entryRuleDefaultLocale"
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:624:1: entryRuleDefaultLocale returns [EObject current=null] : iv_ruleDefaultLocale= ruleDefaultLocale EOF ;
    public final EObject entryRuleDefaultLocale() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultLocale = null;


        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:625:2: (iv_ruleDefaultLocale= ruleDefaultLocale EOF )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:626:2: iv_ruleDefaultLocale= ruleDefaultLocale EOF
            {
             newCompositeNode(grammarAccess.getDefaultLocaleRule()); 
            pushFollow(FOLLOW_ruleDefaultLocale_in_entryRuleDefaultLocale1373);
            iv_ruleDefaultLocale=ruleDefaultLocale();

            state._fsp--;

             current =iv_ruleDefaultLocale; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultLocale1383); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefaultLocale"


    // $ANTLR start "ruleDefaultLocale"
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:633:1: ruleDefaultLocale returns [EObject current=null] : (otherlv_0= 'DEFAULT_LOCALE' otherlv_1= '=' ( (lv_lang_2_0= RULE_LOCALE ) ) ) ;
    public final EObject ruleDefaultLocale() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_lang_2_0=null;

         enterRule(); 
            
        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:636:28: ( (otherlv_0= 'DEFAULT_LOCALE' otherlv_1= '=' ( (lv_lang_2_0= RULE_LOCALE ) ) ) )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:637:1: (otherlv_0= 'DEFAULT_LOCALE' otherlv_1= '=' ( (lv_lang_2_0= RULE_LOCALE ) ) )
            {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:637:1: (otherlv_0= 'DEFAULT_LOCALE' otherlv_1= '=' ( (lv_lang_2_0= RULE_LOCALE ) ) )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:637:3: otherlv_0= 'DEFAULT_LOCALE' otherlv_1= '=' ( (lv_lang_2_0= RULE_LOCALE ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleDefaultLocale1420); 

                	newLeafNode(otherlv_0, grammarAccess.getDefaultLocaleAccess().getDEFAULT_LOCALEKeyword_0());
                
            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleDefaultLocale1432); 

                	newLeafNode(otherlv_1, grammarAccess.getDefaultLocaleAccess().getEqualsSignKeyword_1());
                
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:645:1: ( (lv_lang_2_0= RULE_LOCALE ) )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:646:1: (lv_lang_2_0= RULE_LOCALE )
            {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:646:1: (lv_lang_2_0= RULE_LOCALE )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:647:3: lv_lang_2_0= RULE_LOCALE
            {
            lv_lang_2_0=(Token)match(input,RULE_LOCALE,FOLLOW_RULE_LOCALE_in_ruleDefaultLocale1449); 

            			newLeafNode(lv_lang_2_0, grammarAccess.getDefaultLocaleAccess().getLangLOCALETerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDefaultLocaleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"lang",
                    		lv_lang_2_0, 
                    		"LOCALE");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefaultLocale"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_ruleModel130 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rulePackage213 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_rulePackage234 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePackage246 = new BitSet(new long[]{0x000000000010D020L});
    public static final BitSet FOLLOW_ruleSupportedLocales_in_rulePackage267 = new BitSet(new long[]{0x0000000000105020L});
    public static final BitSet FOLLOW_ruleDefaultLocale_in_rulePackage289 = new BitSet(new long[]{0x0000000000005020L});
    public static final BitSet FOLLOW_rulePackage_in_rulePackage312 = new BitSet(new long[]{0x0000000000005020L});
    public static final BitSet FOLLOW_ruleProperty_in_rulePackage339 = new BitSet(new long[]{0x0000000000005020L});
    public static final BitSet FOLLOW_14_in_rulePackage353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSupportedLocales_in_entryRuleSupportedLocales389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSupportedLocales399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSupportedLocales436 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSupportedLocales448 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSupportedLocales460 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LOCALE_in_ruleSupportedLocales477 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_17_in_ruleSupportedLocales495 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LOCALE_in_ruleSupportedLocales512 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_14_in_ruleSupportedLocales531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN568 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN619 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleFQN638 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN653 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty700 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyKey_in_ruleProperty756 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleProperty768 = new BitSet(new long[]{0x0000000000002040L});
    public static final BitSet FOLLOW_ruleAbstractPropertyValue_in_ruleProperty789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyKey_in_entryRulePropertyKey826 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyKey837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePropertyKey876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractPropertyValue_in_entryRuleAbstractPropertyValue920 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractPropertyValue930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimplePropertyValue_in_ruleAbstractPropertyValue977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexPropertyValue_in_ruleAbstractPropertyValue1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimplePropertyValue_in_entryRuleSimplePropertyValue1039 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimplePropertyValue1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSimplePropertyValue1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexPropertyValue_in_entryRuleComplexPropertyValue1130 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexPropertyValue1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleComplexPropertyValue1177 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleComplexPropertyValueItem_in_ruleComplexPropertyValue1198 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_ruleComplexPropertyValue1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexPropertyValueItem_in_entryRuleComplexPropertyValueItem1247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexPropertyValueItem1257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOCALE_in_ruleComplexPropertyValueItem1299 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleComplexPropertyValueItem1316 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleSimplePropertyValue_in_ruleComplexPropertyValueItem1337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultLocale_in_entryRuleDefaultLocale1373 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultLocale1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleDefaultLocale1420 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDefaultLocale1432 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LOCALE_in_ruleDefaultLocale1449 = new BitSet(new long[]{0x0000000000000002L});

}