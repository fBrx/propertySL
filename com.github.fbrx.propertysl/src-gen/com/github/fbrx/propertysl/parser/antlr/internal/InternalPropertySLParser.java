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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_COMMENT", "RULE_ID", "RULE_STRING", "RULE_LOCALE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'{'", "'}'", "'SUPPORTED_LOCALES'", "'='", "','", "'.'", "':'", "'default'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_LOCALE=7;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_COMMENT=4;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=8;
    public static final int RULE_WS=11;

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

                if ( (LA1_0==RULE_COMMENT||LA1_0==13) ) {
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
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:115:1: rulePackage returns [EObject current=null] : ( ( (lv_commentlines_0_0= RULE_COMMENT ) )* otherlv_1= 'package' ( (lv_name_2_0= ruleFQN ) ) otherlv_3= '{' ( (lv_supportedLocales_4_0= ruleSupportedLocales ) )? ( ( (lv_packages_5_0= rulePackage ) ) | ( (lv_properties_6_0= ruleProperty ) ) )* otherlv_7= '}' ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token lv_commentlines_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_supportedLocales_4_0 = null;

        EObject lv_packages_5_0 = null;

        EObject lv_properties_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:118:28: ( ( ( (lv_commentlines_0_0= RULE_COMMENT ) )* otherlv_1= 'package' ( (lv_name_2_0= ruleFQN ) ) otherlv_3= '{' ( (lv_supportedLocales_4_0= ruleSupportedLocales ) )? ( ( (lv_packages_5_0= rulePackage ) ) | ( (lv_properties_6_0= ruleProperty ) ) )* otherlv_7= '}' ) )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:119:1: ( ( (lv_commentlines_0_0= RULE_COMMENT ) )* otherlv_1= 'package' ( (lv_name_2_0= ruleFQN ) ) otherlv_3= '{' ( (lv_supportedLocales_4_0= ruleSupportedLocales ) )? ( ( (lv_packages_5_0= rulePackage ) ) | ( (lv_properties_6_0= ruleProperty ) ) )* otherlv_7= '}' )
            {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:119:1: ( ( (lv_commentlines_0_0= RULE_COMMENT ) )* otherlv_1= 'package' ( (lv_name_2_0= ruleFQN ) ) otherlv_3= '{' ( (lv_supportedLocales_4_0= ruleSupportedLocales ) )? ( ( (lv_packages_5_0= rulePackage ) ) | ( (lv_properties_6_0= ruleProperty ) ) )* otherlv_7= '}' )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:119:2: ( (lv_commentlines_0_0= RULE_COMMENT ) )* otherlv_1= 'package' ( (lv_name_2_0= ruleFQN ) ) otherlv_3= '{' ( (lv_supportedLocales_4_0= ruleSupportedLocales ) )? ( ( (lv_packages_5_0= rulePackage ) ) | ( (lv_properties_6_0= ruleProperty ) ) )* otherlv_7= '}'
            {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:119:2: ( (lv_commentlines_0_0= RULE_COMMENT ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_COMMENT) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:120:1: (lv_commentlines_0_0= RULE_COMMENT )
            	    {
            	    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:120:1: (lv_commentlines_0_0= RULE_COMMENT )
            	    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:121:3: lv_commentlines_0_0= RULE_COMMENT
            	    {
            	    lv_commentlines_0_0=(Token)match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_rulePackage218); 

            	    			newLeafNode(lv_commentlines_0_0, grammarAccess.getPackageAccess().getCommentlinesCOMMENTTerminalRuleCall_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getPackageRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"commentlines",
            	            		lv_commentlines_0_0, 
            	            		"COMMENT");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_rulePackage236); 

                	newLeafNode(otherlv_1, grammarAccess.getPackageAccess().getPackageKeyword_1());
                
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:141:1: ( (lv_name_2_0= ruleFQN ) )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:142:1: (lv_name_2_0= ruleFQN )
            {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:142:1: (lv_name_2_0= ruleFQN )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:143:3: lv_name_2_0= ruleFQN
            {
             
            	        newCompositeNode(grammarAccess.getPackageAccess().getNameFQNParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_rulePackage257);
            lv_name_2_0=ruleFQN();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPackageRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"FQN");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_rulePackage269); 

                	newLeafNode(otherlv_3, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3());
                
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:163:1: ( (lv_supportedLocales_4_0= ruleSupportedLocales ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:164:1: (lv_supportedLocales_4_0= ruleSupportedLocales )
                    {
                    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:164:1: (lv_supportedLocales_4_0= ruleSupportedLocales )
                    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:165:3: lv_supportedLocales_4_0= ruleSupportedLocales
                    {
                     
                    	        newCompositeNode(grammarAccess.getPackageAccess().getSupportedLocalesSupportedLocalesParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSupportedLocales_in_rulePackage290);
                    lv_supportedLocales_4_0=ruleSupportedLocales();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPackageRule());
                    	        }
                           		set(
                           			current, 
                           			"supportedLocales",
                            		lv_supportedLocales_4_0, 
                            		"SupportedLocales");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:181:3: ( ( (lv_packages_5_0= rulePackage ) ) | ( (lv_properties_6_0= ruleProperty ) ) )*
            loop4:
            do {
                int alt4=3;
                alt4 = dfa4.predict(input);
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
            	    	    
            	    pushFollow(FOLLOW_rulePackage_in_rulePackage313);
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
            	    	    
            	    pushFollow(FOLLOW_ruleProperty_in_rulePackage340);
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

            otherlv_7=(Token)match(input,15,FOLLOW_15_in_rulePackage354); 

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
            pushFollow(FOLLOW_ruleSupportedLocales_in_entryRuleSupportedLocales390);
            iv_ruleSupportedLocales=ruleSupportedLocales();

            state._fsp--;

             current =iv_ruleSupportedLocales; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSupportedLocales400); 

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
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:239:1: ruleSupportedLocales returns [EObject current=null] : (otherlv_0= 'SUPPORTED_LOCALES' otherlv_1= '=' otherlv_2= '{' ( (lv_locales_3_0= ruleDefaultableLocale ) ) (otherlv_4= ',' ( (lv_locales_5_0= ruleDefaultableLocale ) ) )* otherlv_6= '}' ) ;
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
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:242:28: ( (otherlv_0= 'SUPPORTED_LOCALES' otherlv_1= '=' otherlv_2= '{' ( (lv_locales_3_0= ruleDefaultableLocale ) ) (otherlv_4= ',' ( (lv_locales_5_0= ruleDefaultableLocale ) ) )* otherlv_6= '}' ) )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:243:1: (otherlv_0= 'SUPPORTED_LOCALES' otherlv_1= '=' otherlv_2= '{' ( (lv_locales_3_0= ruleDefaultableLocale ) ) (otherlv_4= ',' ( (lv_locales_5_0= ruleDefaultableLocale ) ) )* otherlv_6= '}' )
            {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:243:1: (otherlv_0= 'SUPPORTED_LOCALES' otherlv_1= '=' otherlv_2= '{' ( (lv_locales_3_0= ruleDefaultableLocale ) ) (otherlv_4= ',' ( (lv_locales_5_0= ruleDefaultableLocale ) ) )* otherlv_6= '}' )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:243:3: otherlv_0= 'SUPPORTED_LOCALES' otherlv_1= '=' otherlv_2= '{' ( (lv_locales_3_0= ruleDefaultableLocale ) ) (otherlv_4= ',' ( (lv_locales_5_0= ruleDefaultableLocale ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleSupportedLocales437); 

                	newLeafNode(otherlv_0, grammarAccess.getSupportedLocalesAccess().getSUPPORTED_LOCALESKeyword_0());
                
            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleSupportedLocales449); 

                	newLeafNode(otherlv_1, grammarAccess.getSupportedLocalesAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleSupportedLocales461); 

                	newLeafNode(otherlv_2, grammarAccess.getSupportedLocalesAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:255:1: ( (lv_locales_3_0= ruleDefaultableLocale ) )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:256:1: (lv_locales_3_0= ruleDefaultableLocale )
            {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:256:1: (lv_locales_3_0= ruleDefaultableLocale )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:257:3: lv_locales_3_0= ruleDefaultableLocale
            {
             
            	        newCompositeNode(grammarAccess.getSupportedLocalesAccess().getLocalesDefaultableLocaleParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleDefaultableLocale_in_ruleSupportedLocales482);
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

            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:273:2: (otherlv_4= ',' ( (lv_locales_5_0= ruleDefaultableLocale ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:273:4: otherlv_4= ',' ( (lv_locales_5_0= ruleDefaultableLocale ) )
            	    {
            	    otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleSupportedLocales495); 

            	        	newLeafNode(otherlv_4, grammarAccess.getSupportedLocalesAccess().getCommaKeyword_4_0());
            	        
            	    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:277:1: ( (lv_locales_5_0= ruleDefaultableLocale ) )
            	    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:278:1: (lv_locales_5_0= ruleDefaultableLocale )
            	    {
            	    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:278:1: (lv_locales_5_0= ruleDefaultableLocale )
            	    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:279:3: lv_locales_5_0= ruleDefaultableLocale
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSupportedLocalesAccess().getLocalesDefaultableLocaleParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDefaultableLocale_in_ruleSupportedLocales516);
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
            	    break loop5;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleSupportedLocales530); 

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
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN567);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN578); 

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
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN618); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:327:1: (kw= '.' this_ID_2= RULE_ID )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:328:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,19,FOLLOW_19_in_ruleFQN637); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN652); 

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
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty699);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty709); 

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
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:357:1: ruleProperty returns [EObject current=null] : ( ( (lv_commentlines_0_0= RULE_COMMENT ) )* ( (lv_key_1_0= rulePropertyKey ) ) otherlv_2= '=' ( (lv_value_3_0= ruleAbstractPropertyValue ) ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_commentlines_0_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_key_1_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:360:28: ( ( ( (lv_commentlines_0_0= RULE_COMMENT ) )* ( (lv_key_1_0= rulePropertyKey ) ) otherlv_2= '=' ( (lv_value_3_0= ruleAbstractPropertyValue ) ) ) )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:361:1: ( ( (lv_commentlines_0_0= RULE_COMMENT ) )* ( (lv_key_1_0= rulePropertyKey ) ) otherlv_2= '=' ( (lv_value_3_0= ruleAbstractPropertyValue ) ) )
            {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:361:1: ( ( (lv_commentlines_0_0= RULE_COMMENT ) )* ( (lv_key_1_0= rulePropertyKey ) ) otherlv_2= '=' ( (lv_value_3_0= ruleAbstractPropertyValue ) ) )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:361:2: ( (lv_commentlines_0_0= RULE_COMMENT ) )* ( (lv_key_1_0= rulePropertyKey ) ) otherlv_2= '=' ( (lv_value_3_0= ruleAbstractPropertyValue ) )
            {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:361:2: ( (lv_commentlines_0_0= RULE_COMMENT ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_COMMENT) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:362:1: (lv_commentlines_0_0= RULE_COMMENT )
            	    {
            	    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:362:1: (lv_commentlines_0_0= RULE_COMMENT )
            	    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:363:3: lv_commentlines_0_0= RULE_COMMENT
            	    {
            	    lv_commentlines_0_0=(Token)match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_ruleProperty751); 

            	    			newLeafNode(lv_commentlines_0_0, grammarAccess.getPropertyAccess().getCommentlinesCOMMENTTerminalRuleCall_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getPropertyRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"commentlines",
            	            		lv_commentlines_0_0, 
            	            		"COMMENT");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:379:3: ( (lv_key_1_0= rulePropertyKey ) )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:380:1: (lv_key_1_0= rulePropertyKey )
            {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:380:1: (lv_key_1_0= rulePropertyKey )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:381:3: lv_key_1_0= rulePropertyKey
            {
             
            	        newCompositeNode(grammarAccess.getPropertyAccess().getKeyPropertyKeyParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePropertyKey_in_ruleProperty778);
            lv_key_1_0=rulePropertyKey();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPropertyRule());
            	        }
                   		set(
                   			current, 
                   			"key",
                    		lv_key_1_0, 
                    		"PropertyKey");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleProperty790); 

                	newLeafNode(otherlv_2, grammarAccess.getPropertyAccess().getEqualsSignKeyword_2());
                
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:401:1: ( (lv_value_3_0= ruleAbstractPropertyValue ) )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:402:1: (lv_value_3_0= ruleAbstractPropertyValue )
            {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:402:1: (lv_value_3_0= ruleAbstractPropertyValue )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:403:3: lv_value_3_0= ruleAbstractPropertyValue
            {
             
            	        newCompositeNode(grammarAccess.getPropertyAccess().getValueAbstractPropertyValueParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAbstractPropertyValue_in_ruleProperty811);
            lv_value_3_0=ruleAbstractPropertyValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPropertyRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
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
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:427:1: entryRulePropertyKey returns [String current=null] : iv_rulePropertyKey= rulePropertyKey EOF ;
    public final String entryRulePropertyKey() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePropertyKey = null;


        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:428:2: (iv_rulePropertyKey= rulePropertyKey EOF )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:429:2: iv_rulePropertyKey= rulePropertyKey EOF
            {
             newCompositeNode(grammarAccess.getPropertyKeyRule()); 
            pushFollow(FOLLOW_rulePropertyKey_in_entryRulePropertyKey848);
            iv_rulePropertyKey=rulePropertyKey();

            state._fsp--;

             current =iv_rulePropertyKey.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyKey859); 

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
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:436:1: rulePropertyKey returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken rulePropertyKey() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:439:28: (this_ID_0= RULE_ID )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:440:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePropertyKey898); 

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
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:455:1: entryRuleAbstractPropertyValue returns [EObject current=null] : iv_ruleAbstractPropertyValue= ruleAbstractPropertyValue EOF ;
    public final EObject entryRuleAbstractPropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractPropertyValue = null;


        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:456:2: (iv_ruleAbstractPropertyValue= ruleAbstractPropertyValue EOF )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:457:2: iv_ruleAbstractPropertyValue= ruleAbstractPropertyValue EOF
            {
             newCompositeNode(grammarAccess.getAbstractPropertyValueRule()); 
            pushFollow(FOLLOW_ruleAbstractPropertyValue_in_entryRuleAbstractPropertyValue942);
            iv_ruleAbstractPropertyValue=ruleAbstractPropertyValue();

            state._fsp--;

             current =iv_ruleAbstractPropertyValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractPropertyValue952); 

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
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:464:1: ruleAbstractPropertyValue returns [EObject current=null] : (this_SimplePropertyValue_0= ruleSimplePropertyValue | this_ComplexPropertyValue_1= ruleComplexPropertyValue ) ;
    public final EObject ruleAbstractPropertyValue() throws RecognitionException {
        EObject current = null;

        EObject this_SimplePropertyValue_0 = null;

        EObject this_ComplexPropertyValue_1 = null;


         enterRule(); 
            
        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:467:28: ( (this_SimplePropertyValue_0= ruleSimplePropertyValue | this_ComplexPropertyValue_1= ruleComplexPropertyValue ) )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:468:1: (this_SimplePropertyValue_0= ruleSimplePropertyValue | this_ComplexPropertyValue_1= ruleComplexPropertyValue )
            {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:468:1: (this_SimplePropertyValue_0= ruleSimplePropertyValue | this_ComplexPropertyValue_1= ruleComplexPropertyValue )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==14) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:469:5: this_SimplePropertyValue_0= ruleSimplePropertyValue
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractPropertyValueAccess().getSimplePropertyValueParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSimplePropertyValue_in_ruleAbstractPropertyValue999);
                    this_SimplePropertyValue_0=ruleSimplePropertyValue();

                    state._fsp--;

                     
                            current = this_SimplePropertyValue_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:479:5: this_ComplexPropertyValue_1= ruleComplexPropertyValue
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractPropertyValueAccess().getComplexPropertyValueParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleComplexPropertyValue_in_ruleAbstractPropertyValue1026);
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
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:495:1: entryRuleSimplePropertyValue returns [EObject current=null] : iv_ruleSimplePropertyValue= ruleSimplePropertyValue EOF ;
    public final EObject entryRuleSimplePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimplePropertyValue = null;


        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:496:2: (iv_ruleSimplePropertyValue= ruleSimplePropertyValue EOF )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:497:2: iv_ruleSimplePropertyValue= ruleSimplePropertyValue EOF
            {
             newCompositeNode(grammarAccess.getSimplePropertyValueRule()); 
            pushFollow(FOLLOW_ruleSimplePropertyValue_in_entryRuleSimplePropertyValue1061);
            iv_ruleSimplePropertyValue=ruleSimplePropertyValue();

            state._fsp--;

             current =iv_ruleSimplePropertyValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimplePropertyValue1071); 

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
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:504:1: ruleSimplePropertyValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleSimplePropertyValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:507:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:508:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:508:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:509:1: (lv_value_0_0= RULE_STRING )
            {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:509:1: (lv_value_0_0= RULE_STRING )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:510:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSimplePropertyValue1112); 

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
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:534:1: entryRuleComplexPropertyValue returns [EObject current=null] : iv_ruleComplexPropertyValue= ruleComplexPropertyValue EOF ;
    public final EObject entryRuleComplexPropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexPropertyValue = null;


        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:535:2: (iv_ruleComplexPropertyValue= ruleComplexPropertyValue EOF )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:536:2: iv_ruleComplexPropertyValue= ruleComplexPropertyValue EOF
            {
             newCompositeNode(grammarAccess.getComplexPropertyValueRule()); 
            pushFollow(FOLLOW_ruleComplexPropertyValue_in_entryRuleComplexPropertyValue1152);
            iv_ruleComplexPropertyValue=ruleComplexPropertyValue();

            state._fsp--;

             current =iv_ruleComplexPropertyValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexPropertyValue1162); 

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
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:543:1: ruleComplexPropertyValue returns [EObject current=null] : (otherlv_0= '{' ( (lv_items_1_0= ruleComplexPropertyValueItem ) )+ otherlv_2= '}' ) ;
    public final EObject ruleComplexPropertyValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_items_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:546:28: ( (otherlv_0= '{' ( (lv_items_1_0= ruleComplexPropertyValueItem ) )+ otherlv_2= '}' ) )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:547:1: (otherlv_0= '{' ( (lv_items_1_0= ruleComplexPropertyValueItem ) )+ otherlv_2= '}' )
            {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:547:1: (otherlv_0= '{' ( (lv_items_1_0= ruleComplexPropertyValueItem ) )+ otherlv_2= '}' )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:547:3: otherlv_0= '{' ( (lv_items_1_0= ruleComplexPropertyValueItem ) )+ otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleComplexPropertyValue1199); 

                	newLeafNode(otherlv_0, grammarAccess.getComplexPropertyValueAccess().getLeftCurlyBracketKeyword_0());
                
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:551:1: ( (lv_items_1_0= ruleComplexPropertyValueItem ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_LOCALE) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:552:1: (lv_items_1_0= ruleComplexPropertyValueItem )
            	    {
            	    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:552:1: (lv_items_1_0= ruleComplexPropertyValueItem )
            	    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:553:3: lv_items_1_0= ruleComplexPropertyValueItem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComplexPropertyValueAccess().getItemsComplexPropertyValueItemParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleComplexPropertyValueItem_in_ruleComplexPropertyValue1220);
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
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleComplexPropertyValue1233); 

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
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:581:1: entryRuleComplexPropertyValueItem returns [EObject current=null] : iv_ruleComplexPropertyValueItem= ruleComplexPropertyValueItem EOF ;
    public final EObject entryRuleComplexPropertyValueItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexPropertyValueItem = null;


        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:582:2: (iv_ruleComplexPropertyValueItem= ruleComplexPropertyValueItem EOF )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:583:2: iv_ruleComplexPropertyValueItem= ruleComplexPropertyValueItem EOF
            {
             newCompositeNode(grammarAccess.getComplexPropertyValueItemRule()); 
            pushFollow(FOLLOW_ruleComplexPropertyValueItem_in_entryRuleComplexPropertyValueItem1269);
            iv_ruleComplexPropertyValueItem=ruleComplexPropertyValueItem();

            state._fsp--;

             current =iv_ruleComplexPropertyValueItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComplexPropertyValueItem1279); 

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
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:590:1: ruleComplexPropertyValueItem returns [EObject current=null] : ( ( (lv_lang_0_0= RULE_LOCALE ) ) otherlv_1= ':' ( (lv_value_2_0= ruleSimplePropertyValue ) ) ) ;
    public final EObject ruleComplexPropertyValueItem() throws RecognitionException {
        EObject current = null;

        Token lv_lang_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:593:28: ( ( ( (lv_lang_0_0= RULE_LOCALE ) ) otherlv_1= ':' ( (lv_value_2_0= ruleSimplePropertyValue ) ) ) )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:594:1: ( ( (lv_lang_0_0= RULE_LOCALE ) ) otherlv_1= ':' ( (lv_value_2_0= ruleSimplePropertyValue ) ) )
            {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:594:1: ( ( (lv_lang_0_0= RULE_LOCALE ) ) otherlv_1= ':' ( (lv_value_2_0= ruleSimplePropertyValue ) ) )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:594:2: ( (lv_lang_0_0= RULE_LOCALE ) ) otherlv_1= ':' ( (lv_value_2_0= ruleSimplePropertyValue ) )
            {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:594:2: ( (lv_lang_0_0= RULE_LOCALE ) )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:595:1: (lv_lang_0_0= RULE_LOCALE )
            {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:595:1: (lv_lang_0_0= RULE_LOCALE )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:596:3: lv_lang_0_0= RULE_LOCALE
            {
            lv_lang_0_0=(Token)match(input,RULE_LOCALE,FOLLOW_RULE_LOCALE_in_ruleComplexPropertyValueItem1321); 

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

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleComplexPropertyValueItem1338); 

                	newLeafNode(otherlv_1, grammarAccess.getComplexPropertyValueItemAccess().getColonKeyword_1());
                
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:616:1: ( (lv_value_2_0= ruleSimplePropertyValue ) )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:617:1: (lv_value_2_0= ruleSimplePropertyValue )
            {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:617:1: (lv_value_2_0= ruleSimplePropertyValue )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:618:3: lv_value_2_0= ruleSimplePropertyValue
            {
             
            	        newCompositeNode(grammarAccess.getComplexPropertyValueItemAccess().getValueSimplePropertyValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleSimplePropertyValue_in_ruleComplexPropertyValueItem1359);
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
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:642:1: entryRuleDefaultableLocale returns [EObject current=null] : iv_ruleDefaultableLocale= ruleDefaultableLocale EOF ;
    public final EObject entryRuleDefaultableLocale() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultableLocale = null;


        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:643:2: (iv_ruleDefaultableLocale= ruleDefaultableLocale EOF )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:644:2: iv_ruleDefaultableLocale= ruleDefaultableLocale EOF
            {
             newCompositeNode(grammarAccess.getDefaultableLocaleRule()); 
            pushFollow(FOLLOW_ruleDefaultableLocale_in_entryRuleDefaultableLocale1395);
            iv_ruleDefaultableLocale=ruleDefaultableLocale();

            state._fsp--;

             current =iv_ruleDefaultableLocale; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultableLocale1405); 

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
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:651:1: ruleDefaultableLocale returns [EObject current=null] : ( ( (lv_isDefault_0_0= 'default' ) )? ( (lv_lang_1_0= RULE_LOCALE ) ) ) ;
    public final EObject ruleDefaultableLocale() throws RecognitionException {
        EObject current = null;

        Token lv_isDefault_0_0=null;
        Token lv_lang_1_0=null;

         enterRule(); 
            
        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:654:28: ( ( ( (lv_isDefault_0_0= 'default' ) )? ( (lv_lang_1_0= RULE_LOCALE ) ) ) )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:655:1: ( ( (lv_isDefault_0_0= 'default' ) )? ( (lv_lang_1_0= RULE_LOCALE ) ) )
            {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:655:1: ( ( (lv_isDefault_0_0= 'default' ) )? ( (lv_lang_1_0= RULE_LOCALE ) ) )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:655:2: ( (lv_isDefault_0_0= 'default' ) )? ( (lv_lang_1_0= RULE_LOCALE ) )
            {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:655:2: ( (lv_isDefault_0_0= 'default' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:656:1: (lv_isDefault_0_0= 'default' )
                    {
                    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:656:1: (lv_isDefault_0_0= 'default' )
                    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:657:3: lv_isDefault_0_0= 'default'
                    {
                    lv_isDefault_0_0=(Token)match(input,21,FOLLOW_21_in_ruleDefaultableLocale1448); 

                            newLeafNode(lv_isDefault_0_0, grammarAccess.getDefaultableLocaleAccess().getIsDefaultDefaultKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDefaultableLocaleRule());
                    	        }
                           		setWithLastConsumed(current, "isDefault", true, "default");
                    	    

                    }


                    }
                    break;

            }

            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:670:3: ( (lv_lang_1_0= RULE_LOCALE ) )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:671:1: (lv_lang_1_0= RULE_LOCALE )
            {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:671:1: (lv_lang_1_0= RULE_LOCALE )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:672:3: lv_lang_1_0= RULE_LOCALE
            {
            lv_lang_1_0=(Token)match(input,RULE_LOCALE,FOLLOW_RULE_LOCALE_in_ruleDefaultableLocale1479); 

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


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\5\uffff";
    static final String DFA4_eofS =
        "\5\uffff";
    static final String DFA4_minS =
        "\1\4\1\uffff\1\4\2\uffff";
    static final String DFA4_maxS =
        "\1\17\1\uffff\1\15\2\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\3\1\uffff\1\1\1\2";
    static final String DFA4_specialS =
        "\5\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\2\1\4\7\uffff\1\3\1\uffff\1\1",
            "",
            "\1\2\1\4\7\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "()* loopback of 181:3: ( ( (lv_packages_5_0= rulePackage ) ) | ( (lv_properties_6_0= ruleProperty ) ) )*";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_ruleModel130 = new BitSet(new long[]{0x0000000000002012L});
    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_rulePackage218 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_13_in_rulePackage236 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleFQN_in_rulePackage257 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePackage269 = new BitSet(new long[]{0x000000000001A030L});
    public static final BitSet FOLLOW_ruleSupportedLocales_in_rulePackage290 = new BitSet(new long[]{0x000000000000A030L});
    public static final BitSet FOLLOW_rulePackage_in_rulePackage313 = new BitSet(new long[]{0x000000000000A030L});
    public static final BitSet FOLLOW_ruleProperty_in_rulePackage340 = new BitSet(new long[]{0x000000000000A030L});
    public static final BitSet FOLLOW_15_in_rulePackage354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSupportedLocales_in_entryRuleSupportedLocales390 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSupportedLocales400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleSupportedLocales437 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSupportedLocales449 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSupportedLocales461 = new BitSet(new long[]{0x0000000000200080L});
    public static final BitSet FOLLOW_ruleDefaultableLocale_in_ruleSupportedLocales482 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_18_in_ruleSupportedLocales495 = new BitSet(new long[]{0x0000000000200080L});
    public static final BitSet FOLLOW_ruleDefaultableLocale_in_ruleSupportedLocales516 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_15_in_ruleSupportedLocales530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN567 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN618 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleFQN637 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN652 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty699 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_ruleProperty751 = new BitSet(new long[]{0x000000000000A030L});
    public static final BitSet FOLLOW_rulePropertyKey_in_ruleProperty778 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleProperty790 = new BitSet(new long[]{0x0000000000004040L});
    public static final BitSet FOLLOW_ruleAbstractPropertyValue_in_ruleProperty811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyKey_in_entryRulePropertyKey848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyKey859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePropertyKey898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractPropertyValue_in_entryRuleAbstractPropertyValue942 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractPropertyValue952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimplePropertyValue_in_ruleAbstractPropertyValue999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexPropertyValue_in_ruleAbstractPropertyValue1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimplePropertyValue_in_entryRuleSimplePropertyValue1061 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimplePropertyValue1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSimplePropertyValue1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexPropertyValue_in_entryRuleComplexPropertyValue1152 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexPropertyValue1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleComplexPropertyValue1199 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleComplexPropertyValueItem_in_ruleComplexPropertyValue1220 = new BitSet(new long[]{0x0000000000008080L});
    public static final BitSet FOLLOW_15_in_ruleComplexPropertyValue1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComplexPropertyValueItem_in_entryRuleComplexPropertyValueItem1269 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComplexPropertyValueItem1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOCALE_in_ruleComplexPropertyValueItem1321 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleComplexPropertyValueItem1338 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleSimplePropertyValue_in_ruleComplexPropertyValueItem1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultableLocale_in_entryRuleDefaultableLocale1395 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultableLocale1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleDefaultableLocale1448 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_LOCALE_in_ruleDefaultableLocale1479 = new BitSet(new long[]{0x0000000000000002L});

}