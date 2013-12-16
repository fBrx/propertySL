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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_LOCALE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'{'", "'}'", "'SUPPORTED_LOCALES'", "'='", "','", "'.'", "':'", "'default'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_LOCALE=6;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__19=19;
    public static final int RULE_STRING=5;
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
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:115:1: rulePackage returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '{' ( (lv_supportedLocales_3_0= ruleSupportedLocales ) )? ( ( (lv_packages_4_0= rulePackage ) ) | ( (lv_properties_5_0= ruleProperty ) ) )* otherlv_6= '}' ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_supportedLocales_3_0 = null;

        EObject lv_packages_4_0 = null;

        EObject lv_properties_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:118:28: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '{' ( (lv_supportedLocales_3_0= ruleSupportedLocales ) )? ( ( (lv_packages_4_0= rulePackage ) ) | ( (lv_properties_5_0= ruleProperty ) ) )* otherlv_6= '}' ) )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:119:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '{' ( (lv_supportedLocales_3_0= ruleSupportedLocales ) )? ( ( (lv_packages_4_0= rulePackage ) ) | ( (lv_properties_5_0= ruleProperty ) ) )* otherlv_6= '}' )
            {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:119:1: (otherlv_0= 'package' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '{' ( (lv_supportedLocales_3_0= ruleSupportedLocales ) )? ( ( (lv_packages_4_0= rulePackage ) ) | ( (lv_properties_5_0= ruleProperty ) ) )* otherlv_6= '}' )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:119:3: otherlv_0= 'package' ( (lv_name_1_0= ruleFQN ) ) otherlv_2= '{' ( (lv_supportedLocales_3_0= ruleSupportedLocales ) )? ( ( (lv_packages_4_0= rulePackage ) ) | ( (lv_properties_5_0= ruleProperty ) ) )* otherlv_6= '}'
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

            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:163:3: ( ( (lv_packages_4_0= rulePackage ) ) | ( (lv_properties_5_0= ruleProperty ) ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }
                else if ( (LA3_0==RULE_ID) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:163:4: ( (lv_packages_4_0= rulePackage ) )
            	    {
            	    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:163:4: ( (lv_packages_4_0= rulePackage ) )
            	    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:164:1: (lv_packages_4_0= rulePackage )
            	    {
            	    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:164:1: (lv_packages_4_0= rulePackage )
            	    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:165:3: lv_packages_4_0= rulePackage
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPackageAccess().getPackagesPackageParserRuleCall_4_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePackage_in_rulePackage290);
            	    lv_packages_4_0=rulePackage();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPackageRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"packages",
            	            		lv_packages_4_0, 
            	            		"Package");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:182:6: ( (lv_properties_5_0= ruleProperty ) )
            	    {
            	    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:182:6: ( (lv_properties_5_0= ruleProperty ) )
            	    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:183:1: (lv_properties_5_0= ruleProperty )
            	    {
            	    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:183:1: (lv_properties_5_0= ruleProperty )
            	    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:184:3: lv_properties_5_0= ruleProperty
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPackageAccess().getPropertiesPropertyParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProperty_in_rulePackage317);
            	    lv_properties_5_0=ruleProperty();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPackageRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"properties",
            	            		lv_properties_5_0, 
            	            		"Property");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_rulePackage331); 

                	newLeafNode(otherlv_6, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_5());
                

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
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:212:1: entryRuleSupportedLocales returns [EObject current=null] : iv_ruleSupportedLocales= ruleSupportedLocales EOF ;
    public final EObject entryRuleSupportedLocales() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSupportedLocales = null;


        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:213:2: (iv_ruleSupportedLocales= ruleSupportedLocales EOF )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:214:2: iv_ruleSupportedLocales= ruleSupportedLocales EOF
            {
             newCompositeNode(grammarAccess.getSupportedLocalesRule()); 
            pushFollow(FOLLOW_ruleSupportedLocales_in_entryRuleSupportedLocales367);
            iv_ruleSupportedLocales=ruleSupportedLocales();

            state._fsp--;

             current =iv_ruleSupportedLocales; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSupportedLocales377); 

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
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:221:1: ruleSupportedLocales returns [EObject current=null] : (otherlv_0= 'SUPPORTED_LOCALES' otherlv_1= '=' otherlv_2= '{' ( (lv_locales_3_0= ruleDefaultableLocale ) ) (otherlv_4= ',' ( (lv_locales_5_0= ruleDefaultableLocale ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleSupportedLocales() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_locales_3_0 = null;

        EObject lv_locales_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:224:28: ( (otherlv_0= 'SUPPORTED_LOCALES' otherlv_1= '=' otherlv_2= '{' ( (lv_locales_3_0= ruleDefaultableLocale ) ) (otherlv_4= ',' ( (lv_locales_5_0= ruleDefaultableLocale ) ) )* otherlv_6= '}' ) )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:225:1: (otherlv_0= 'SUPPORTED_LOCALES' otherlv_1= '=' otherlv_2= '{' ( (lv_locales_3_0= ruleDefaultableLocale ) ) (otherlv_4= ',' ( (lv_locales_5_0= ruleDefaultableLocale ) ) )* otherlv_6= '}' )
            {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:225:1: (otherlv_0= 'SUPPORTED_LOCALES' otherlv_1= '=' otherlv_2= '{' ( (lv_locales_3_0= ruleDefaultableLocale ) ) (otherlv_4= ',' ( (lv_locales_5_0= ruleDefaultableLocale ) ) )* otherlv_6= '}' )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:225:3: otherlv_0= 'SUPPORTED_LOCALES' otherlv_1= '=' otherlv_2= '{' ( (lv_locales_3_0= ruleDefaultableLocale ) ) (otherlv_4= ',' ( (lv_locales_5_0= ruleDefaultableLocale ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSupportedLocales414); 

                	newLeafNode(otherlv_0, grammarAccess.getSupportedLocalesAccess().getSUPPORTED_LOCALESKeyword_0());
                
            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleSupportedLocales426); 

                	newLeafNode(otherlv_1, grammarAccess.getSupportedLocalesAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleSupportedLocales438); 

                	newLeafNode(otherlv_2, grammarAccess.getSupportedLocalesAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:237:1: ( (lv_locales_3_0= ruleDefaultableLocale ) )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:238:1: (lv_locales_3_0= ruleDefaultableLocale )
            {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:238:1: (lv_locales_3_0= ruleDefaultableLocale )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:239:3: lv_locales_3_0= ruleDefaultableLocale
            {
             
            	        newCompositeNode(grammarAccess.getSupportedLocalesAccess().getLocalesDefaultableLocaleParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleDefaultableLocale_in_ruleSupportedLocales459);
            lv_locales_3_0=ruleDefaultableLocale();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSupportedLocalesRule());
            	        }
                   		add(
                   			current, 
                   			"locales",
                    		lv_locales_3_0, 
                    		"DefaultableLocale");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:255:2: (otherlv_4= ',' ( (lv_locales_5_0= ruleDefaultableLocale ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:255:4: otherlv_4= ',' ( (lv_locales_5_0= ruleDefaultableLocale ) )
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleSupportedLocales472); 

            	        	newLeafNode(otherlv_4, grammarAccess.getSupportedLocalesAccess().getCommaKeyword_4_0());
            	        
            	    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:259:1: ( (lv_locales_5_0= ruleDefaultableLocale ) )
            	    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:260:1: (lv_locales_5_0= ruleDefaultableLocale )
            	    {
            	    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:260:1: (lv_locales_5_0= ruleDefaultableLocale )
            	    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:261:3: lv_locales_5_0= ruleDefaultableLocale
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSupportedLocalesAccess().getLocalesDefaultableLocaleParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDefaultableLocale_in_ruleSupportedLocales493);
            	    lv_locales_5_0=ruleDefaultableLocale();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSupportedLocalesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"locales",
            	            		lv_locales_5_0, 
            	            		"DefaultableLocale");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleSupportedLocales507); 

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
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:289:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:290:2: (iv_ruleFQN= ruleFQN EOF )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:291:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN544);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN555); 

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
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:298:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:301:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:302:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:302:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:302:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN595); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:309:1: (kw= '.' this_ID_2= RULE_ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:310:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,18,FOLLOW_18_in_ruleFQN614); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN629); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop5;
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
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:330:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:331:2: (iv_ruleProperty= ruleProperty EOF )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:332:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty676);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty686); 

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
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:339:1: ruleProperty returns [EObject current=null] : ( ( (lv_key_0_0= rulePropertyKey ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAbstractPropertyValue ) ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:342:28: ( ( ( (lv_key_0_0= rulePropertyKey ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAbstractPropertyValue ) ) ) )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:343:1: ( ( (lv_key_0_0= rulePropertyKey ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAbstractPropertyValue ) ) )
            {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:343:1: ( ( (lv_key_0_0= rulePropertyKey ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAbstractPropertyValue ) ) )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:343:2: ( (lv_key_0_0= rulePropertyKey ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAbstractPropertyValue ) )
            {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:343:2: ( (lv_key_0_0= rulePropertyKey ) )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:344:1: (lv_key_0_0= rulePropertyKey )
            {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:344:1: (lv_key_0_0= rulePropertyKey )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:345:3: lv_key_0_0= rulePropertyKey
            {
             
            	        newCompositeNode(grammarAccess.getPropertyAccess().getKeyPropertyKeyParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulePropertyKey_in_ruleProperty732);
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

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleProperty744); 

                	newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getEqualsSignKeyword_1());
                
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:365:1: ( (lv_value_2_0= ruleAbstractPropertyValue ) )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:366:1: (lv_value_2_0= ruleAbstractPropertyValue )
            {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:366:1: (lv_value_2_0= ruleAbstractPropertyValue )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:367:3: lv_value_2_0= ruleAbstractPropertyValue
            {
             
            	        newCompositeNode(grammarAccess.getPropertyAccess().getValueAbstractPropertyValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAbstractPropertyValue_in_ruleProperty765);
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
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:391:1: entryRulePropertyKey returns [String current=null] : iv_rulePropertyKey= rulePropertyKey EOF ;
    public final String entryRulePropertyKey() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePropertyKey = null;


        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:392:2: (iv_rulePropertyKey= rulePropertyKey EOF )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:393:2: iv_rulePropertyKey= rulePropertyKey EOF
            {
             newCompositeNode(grammarAccess.getPropertyKeyRule()); 
            pushFollow(FOLLOW_rulePropertyKey_in_entryRulePropertyKey802);
            iv_rulePropertyKey=rulePropertyKey();

            state._fsp--;

             current =iv_rulePropertyKey.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyKey813); 

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
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:400:1: rulePropertyKey returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken rulePropertyKey() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:403:28: (this_ID_0= RULE_ID )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:404:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePropertyKey852); 

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
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:419:1: entryRuleAbstractPropertyValue returns [EObject current=null] : iv_ruleAbstractPropertyValue= ruleAbstractPropertyValue EOF ;
    public final EObject entryRuleAbstractPropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractPropertyValue = null;


        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:420:2: (iv_ruleAbstractPropertyValue= ruleAbstractPropertyValue EOF )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:421:2: iv_ruleAbstractPropertyValue= ruleAbstractPropertyValue EOF
            {
             newCompositeNode(grammarAccess.getAbstractPropertyValueRule()); 
            pushFollow(FOLLOW_ruleAbstractPropertyValue_in_entryRuleAbstractPropertyValue896);
            iv_ruleAbstractPropertyValue=ruleAbstractPropertyValue();

            state._fsp--;

             current =iv_ruleAbstractPropertyValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractPropertyValue906); 

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
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:428:1: ruleAbstractPropertyValue returns [EObject current=null] : (this_SimplePropertyValue_0= ruleSimplePropertyValue | this_ComplexPropertyValue_1= ruleComplexPropertyValue ) ;
    public final EObject ruleAbstractPropertyValue() throws RecognitionException {
        EObject current = null;

        EObject this_SimplePropertyValue_0 = null;

        EObject this_ComplexPropertyValue_1 = null;


         enterRule(); 
            
        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:431:28: ( (this_SimplePropertyValue_0= ruleSimplePropertyValue | this_ComplexPropertyValue_1= ruleComplexPropertyValue ) )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:432:1: (this_SimplePropertyValue_0= ruleSimplePropertyValue | this_ComplexPropertyValue_1= ruleComplexPropertyValue )
            {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:432:1: (this_SimplePropertyValue_0= ruleSimplePropertyValue | this_ComplexPropertyValue_1= ruleComplexPropertyValue )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==13) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:433:5: this_SimplePropertyValue_0= ruleSimplePropertyValue
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractPropertyValueAccess().getSimplePropertyValueParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSimplePropertyValue_in_ruleAbstractPropertyValue953);
                    this_SimplePropertyValue_0=ruleSimplePropertyValue();

                    state._fsp--;

                     
                            current = this_SimplePropertyValue_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:443:5: this_ComplexPropertyValue_1= ruleComplexPropertyValue
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractPropertyValueAccess().getComplexPropertyValueParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleComplexPropertyValue_in_ruleAbstractPropertyValue980);
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
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:459:1: entryRuleSimplePropertyValue returns [EObject current=null] : iv_ruleSimplePropertyValue= ruleSimplePropertyValue EOF ;
    public final EObject entryRuleSimplePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimplePropertyValue = null;


        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:460:2: (iv_ruleSimplePropertyValue= ruleSimplePropertyValue EOF )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:461:2: iv_ruleSimplePropertyValue= ruleSimplePropertyValue EOF
            {
             newCompositeNode(grammarAccess.getSimplePropertyValueRule()); 
            pushFollow(FOLLOW_ruleSimplePropertyValue_in_entryRuleSimplePropertyValue1015);
            iv_ruleSimplePropertyValue=ruleSimplePropertyValue();

            state._fsp--;

             current =iv_ruleSimplePropertyValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimplePropertyValue1025); 

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
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:468:1: ruleSimplePropertyValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleSimplePropertyValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:471:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:472:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:472:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:473:1: (lv_value_0_0= RULE_STRING )
            {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:473:1: (lv_value_0_0= RULE_STRING )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:474:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSimplePropertyValue1066); 

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
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:498:1: entryRuleComplexPropertyValue returns [EObject current=null] : iv_ruleComplexPropertyValue= ruleComplexPropertyValue EOF ;
    public final EObject entryRuleComplexPropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexPropertyValue = null;


        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:499:2: (iv_ruleComplexPropertyValue= ruleComplexPropertyValue EOF )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:500:2: iv_ruleComplexPropertyValue= ruleComplexPropertyValue EOF
            {
             newCompositeNode(grammarAccess.getComplexPropertyValueRule()); 
            pushFollow(FOLLOW_ruleComplexPropertyValue_in_entryRuleComplexPropertyValue1106);
            iv_ruleComplexPropertyValue=ruleComplexPropertyValue();

            state._fsp--;

             current =iv_ruleComplexPropertyValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexPropertyValue1116); 

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
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:507:1: ruleComplexPropertyValue returns [EObject current=null] : (otherlv_0= '{' ( (lv_items_1_0= ruleComplexPropertyValueItem ) )+ otherlv_2= '}' ) ;
    public final EObject ruleComplexPropertyValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_items_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:510:28: ( (otherlv_0= '{' ( (lv_items_1_0= ruleComplexPropertyValueItem ) )+ otherlv_2= '}' ) )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:511:1: (otherlv_0= '{' ( (lv_items_1_0= ruleComplexPropertyValueItem ) )+ otherlv_2= '}' )
            {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:511:1: (otherlv_0= '{' ( (lv_items_1_0= ruleComplexPropertyValueItem ) )+ otherlv_2= '}' )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:511:3: otherlv_0= '{' ( (lv_items_1_0= ruleComplexPropertyValueItem ) )+ otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleComplexPropertyValue1153); 

                	newLeafNode(otherlv_0, grammarAccess.getComplexPropertyValueAccess().getLeftCurlyBracketKeyword_0());
                
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:515:1: ( (lv_items_1_0= ruleComplexPropertyValueItem ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_LOCALE) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:516:1: (lv_items_1_0= ruleComplexPropertyValueItem )
            	    {
            	    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:516:1: (lv_items_1_0= ruleComplexPropertyValueItem )
            	    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:517:3: lv_items_1_0= ruleComplexPropertyValueItem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComplexPropertyValueAccess().getItemsComplexPropertyValueItemParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleComplexPropertyValueItem_in_ruleComplexPropertyValue1174);
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
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleComplexPropertyValue1187); 

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
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:545:1: entryRuleComplexPropertyValueItem returns [EObject current=null] : iv_ruleComplexPropertyValueItem= ruleComplexPropertyValueItem EOF ;
    public final EObject entryRuleComplexPropertyValueItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexPropertyValueItem = null;


        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:546:2: (iv_ruleComplexPropertyValueItem= ruleComplexPropertyValueItem EOF )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:547:2: iv_ruleComplexPropertyValueItem= ruleComplexPropertyValueItem EOF
            {
             newCompositeNode(grammarAccess.getComplexPropertyValueItemRule()); 
            pushFollow(FOLLOW_ruleComplexPropertyValueItem_in_entryRuleComplexPropertyValueItem1223);
            iv_ruleComplexPropertyValueItem=ruleComplexPropertyValueItem();

            state._fsp--;

             current =iv_ruleComplexPropertyValueItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexPropertyValueItem1233); 

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
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:554:1: ruleComplexPropertyValueItem returns [EObject current=null] : ( ( (lv_lang_0_0= RULE_LOCALE ) ) otherlv_1= ':' ( (lv_value_2_0= ruleSimplePropertyValue ) ) ) ;
    public final EObject ruleComplexPropertyValueItem() throws RecognitionException {
        EObject current = null;

        Token lv_lang_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:557:28: ( ( ( (lv_lang_0_0= RULE_LOCALE ) ) otherlv_1= ':' ( (lv_value_2_0= ruleSimplePropertyValue ) ) ) )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:558:1: ( ( (lv_lang_0_0= RULE_LOCALE ) ) otherlv_1= ':' ( (lv_value_2_0= ruleSimplePropertyValue ) ) )
            {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:558:1: ( ( (lv_lang_0_0= RULE_LOCALE ) ) otherlv_1= ':' ( (lv_value_2_0= ruleSimplePropertyValue ) ) )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:558:2: ( (lv_lang_0_0= RULE_LOCALE ) ) otherlv_1= ':' ( (lv_value_2_0= ruleSimplePropertyValue ) )
            {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:558:2: ( (lv_lang_0_0= RULE_LOCALE ) )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:559:1: (lv_lang_0_0= RULE_LOCALE )
            {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:559:1: (lv_lang_0_0= RULE_LOCALE )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:560:3: lv_lang_0_0= RULE_LOCALE
            {
            lv_lang_0_0=(Token)match(input,RULE_LOCALE,FOLLOW_RULE_LOCALE_in_ruleComplexPropertyValueItem1275); 

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

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleComplexPropertyValueItem1292); 

                	newLeafNode(otherlv_1, grammarAccess.getComplexPropertyValueItemAccess().getColonKeyword_1());
                
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:580:1: ( (lv_value_2_0= ruleSimplePropertyValue ) )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:581:1: (lv_value_2_0= ruleSimplePropertyValue )
            {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:581:1: (lv_value_2_0= ruleSimplePropertyValue )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:582:3: lv_value_2_0= ruleSimplePropertyValue
            {
             
            	        newCompositeNode(grammarAccess.getComplexPropertyValueItemAccess().getValueSimplePropertyValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSimplePropertyValue_in_ruleComplexPropertyValueItem1313);
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


    // $ANTLR start "entryRuleDefaultableLocale"
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:606:1: entryRuleDefaultableLocale returns [EObject current=null] : iv_ruleDefaultableLocale= ruleDefaultableLocale EOF ;
    public final EObject entryRuleDefaultableLocale() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultableLocale = null;


        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:607:2: (iv_ruleDefaultableLocale= ruleDefaultableLocale EOF )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:608:2: iv_ruleDefaultableLocale= ruleDefaultableLocale EOF
            {
             newCompositeNode(grammarAccess.getDefaultableLocaleRule()); 
            pushFollow(FOLLOW_ruleDefaultableLocale_in_entryRuleDefaultableLocale1349);
            iv_ruleDefaultableLocale=ruleDefaultableLocale();

            state._fsp--;

             current =iv_ruleDefaultableLocale; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultableLocale1359); 

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
    // $ANTLR end "entryRuleDefaultableLocale"


    // $ANTLR start "ruleDefaultableLocale"
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:615:1: ruleDefaultableLocale returns [EObject current=null] : ( ( (lv_isDefault_0_0= 'default' ) )? ( (lv_lang_1_0= RULE_LOCALE ) ) ) ;
    public final EObject ruleDefaultableLocale() throws RecognitionException {
        EObject current = null;

        Token lv_isDefault_0_0=null;
        Token lv_lang_1_0=null;

         enterRule(); 
            
        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:618:28: ( ( ( (lv_isDefault_0_0= 'default' ) )? ( (lv_lang_1_0= RULE_LOCALE ) ) ) )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:619:1: ( ( (lv_isDefault_0_0= 'default' ) )? ( (lv_lang_1_0= RULE_LOCALE ) ) )
            {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:619:1: ( ( (lv_isDefault_0_0= 'default' ) )? ( (lv_lang_1_0= RULE_LOCALE ) ) )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:619:2: ( (lv_isDefault_0_0= 'default' ) )? ( (lv_lang_1_0= RULE_LOCALE ) )
            {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:619:2: ( (lv_isDefault_0_0= 'default' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:620:1: (lv_isDefault_0_0= 'default' )
                    {
                    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:620:1: (lv_isDefault_0_0= 'default' )
                    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:621:3: lv_isDefault_0_0= 'default'
                    {
                    lv_isDefault_0_0=(Token)match(input,20,FOLLOW_20_in_ruleDefaultableLocale1402); 

                            newLeafNode(lv_isDefault_0_0, grammarAccess.getDefaultableLocaleAccess().getIsDefaultDefaultKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDefaultableLocaleRule());
                    	        }
                           		setWithLastConsumed(current, "isDefault", true, "default");
                    	    

                    }


                    }
                    break;

            }

            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:634:3: ( (lv_lang_1_0= RULE_LOCALE ) )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:635:1: (lv_lang_1_0= RULE_LOCALE )
            {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:635:1: (lv_lang_1_0= RULE_LOCALE )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:636:3: lv_lang_1_0= RULE_LOCALE
            {
            lv_lang_1_0=(Token)match(input,RULE_LOCALE,FOLLOW_RULE_LOCALE_in_ruleDefaultableLocale1433); 

            			newLeafNode(lv_lang_1_0, grammarAccess.getDefaultableLocaleAccess().getLangLOCALETerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDefaultableLocaleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"lang",
                    		lv_lang_1_0, 
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
    // $ANTLR end "ruleDefaultableLocale"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_ruleModel130 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rulePackage213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_rulePackage234 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePackage246 = new BitSet(new long[]{0x000000000000D010L});
    public static final BitSet FOLLOW_ruleSupportedLocales_in_rulePackage267 = new BitSet(new long[]{0x0000000000005010L});
    public static final BitSet FOLLOW_rulePackage_in_rulePackage290 = new BitSet(new long[]{0x0000000000005010L});
    public static final BitSet FOLLOW_ruleProperty_in_rulePackage317 = new BitSet(new long[]{0x0000000000005010L});
    public static final BitSet FOLLOW_14_in_rulePackage331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSupportedLocales_in_entryRuleSupportedLocales367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSupportedLocales377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSupportedLocales414 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSupportedLocales426 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSupportedLocales438 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_ruleDefaultableLocale_in_ruleSupportedLocales459 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_17_in_ruleSupportedLocales472 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_ruleDefaultableLocale_in_ruleSupportedLocales493 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_14_in_ruleSupportedLocales507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN544 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN595 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleFQN614 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN629 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty676 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyKey_in_ruleProperty732 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleProperty744 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_ruleAbstractPropertyValue_in_ruleProperty765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyKey_in_entryRulePropertyKey802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyKey813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePropertyKey852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractPropertyValue_in_entryRuleAbstractPropertyValue896 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractPropertyValue906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimplePropertyValue_in_ruleAbstractPropertyValue953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexPropertyValue_in_ruleAbstractPropertyValue980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimplePropertyValue_in_entryRuleSimplePropertyValue1015 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimplePropertyValue1025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSimplePropertyValue1066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexPropertyValue_in_entryRuleComplexPropertyValue1106 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexPropertyValue1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleComplexPropertyValue1153 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleComplexPropertyValueItem_in_ruleComplexPropertyValue1174 = new BitSet(new long[]{0x0000000000004040L});
    public static final BitSet FOLLOW_14_in_ruleComplexPropertyValue1187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexPropertyValueItem_in_entryRuleComplexPropertyValueItem1223 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexPropertyValueItem1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOCALE_in_ruleComplexPropertyValueItem1275 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleComplexPropertyValueItem1292 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleSimplePropertyValue_in_ruleComplexPropertyValueItem1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultableLocale_in_entryRuleDefaultableLocale1349 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultableLocale1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleDefaultableLocale1402 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_LOCALE_in_ruleDefaultableLocale1433 = new BitSet(new long[]{0x0000000000000002L});

}