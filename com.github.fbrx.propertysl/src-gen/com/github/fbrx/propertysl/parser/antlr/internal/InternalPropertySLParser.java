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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'{'", "'}'", "'.'", "'='", "'DEFAULT_LOCALE'", "'de'", "'en'"
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

        AntlrDatatypeRuleToken lv_packages_0_0 = null;


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

                if ( (LA1_0==11) ) {
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
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:106:1: entryRulePackage returns [String current=null] : iv_rulePackage= rulePackage EOF ;
    public final String entryRulePackage() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePackage = null;


        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:107:2: (iv_rulePackage= rulePackage EOF )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:108:2: iv_rulePackage= rulePackage EOF
            {
             newCompositeNode(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_rulePackage_in_entryRulePackage167);
            iv_rulePackage=rulePackage();

            state._fsp--;

             current =iv_rulePackage.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage178); 

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
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:115:1: rulePackage returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'package' this_FQN_1= ruleFQN kw= '{' (this_DefaultLocale_3= ruleDefaultLocale )? (this_Package_4= rulePackage )* (this_Property_5= ruleProperty )* kw= '}' ) ;
    public final AntlrDatatypeRuleToken rulePackage() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FQN_1 = null;

        AntlrDatatypeRuleToken this_DefaultLocale_3 = null;

        AntlrDatatypeRuleToken this_Package_4 = null;

        AntlrDatatypeRuleToken this_Property_5 = null;


         enterRule(); 
            
        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:118:28: ( (kw= 'package' this_FQN_1= ruleFQN kw= '{' (this_DefaultLocale_3= ruleDefaultLocale )? (this_Package_4= rulePackage )* (this_Property_5= ruleProperty )* kw= '}' ) )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:119:1: (kw= 'package' this_FQN_1= ruleFQN kw= '{' (this_DefaultLocale_3= ruleDefaultLocale )? (this_Package_4= rulePackage )* (this_Property_5= ruleProperty )* kw= '}' )
            {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:119:1: (kw= 'package' this_FQN_1= ruleFQN kw= '{' (this_DefaultLocale_3= ruleDefaultLocale )? (this_Package_4= rulePackage )* (this_Property_5= ruleProperty )* kw= '}' )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:120:2: kw= 'package' this_FQN_1= ruleFQN kw= '{' (this_DefaultLocale_3= ruleDefaultLocale )? (this_Package_4= rulePackage )* (this_Property_5= ruleProperty )* kw= '}'
            {
            kw=(Token)match(input,11,FOLLOW_11_in_rulePackage216); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getPackageAccess().getPackageKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getPackageAccess().getFQNParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleFQN_in_rulePackage238);
            this_FQN_1=ruleFQN();

            state._fsp--;


            		current.merge(this_FQN_1);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,12,FOLLOW_12_in_rulePackage256); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2()); 
                
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:142:1: (this_DefaultLocale_3= ruleDefaultLocale )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:143:5: this_DefaultLocale_3= ruleDefaultLocale
                    {
                     
                            newCompositeNode(grammarAccess.getPackageAccess().getDefaultLocaleParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleDefaultLocale_in_rulePackage279);
                    this_DefaultLocale_3=ruleDefaultLocale();

                    state._fsp--;


                    		current.merge(this_DefaultLocale_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:153:3: (this_Package_4= rulePackage )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==11) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:154:5: this_Package_4= rulePackage
            	    {
            	     
            	            newCompositeNode(grammarAccess.getPackageAccess().getPackageParserRuleCall_4()); 
            	        
            	    pushFollow(FOLLOW_rulePackage_in_rulePackage309);
            	    this_Package_4=rulePackage();

            	    state._fsp--;


            	    		current.merge(this_Package_4);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:164:3: (this_Property_5= ruleProperty )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:165:5: this_Property_5= ruleProperty
            	    {
            	     
            	            newCompositeNode(grammarAccess.getPackageAccess().getPropertyParserRuleCall_5()); 
            	        
            	    pushFollow(FOLLOW_ruleProperty_in_rulePackage339);
            	    this_Property_5=ruleProperty();

            	    state._fsp--;


            	    		current.merge(this_Property_5);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            kw=(Token)match(input,13,FOLLOW_13_in_rulePackage359); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_6()); 
                

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


    // $ANTLR start "entryRuleFQN"
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:189:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:190:2: (iv_ruleFQN= ruleFQN EOF )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:191:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN400);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN411); 

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
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:198:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:201:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:202:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:202:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:202:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN451); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:209:1: (kw= '.' this_ID_2= RULE_ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:210:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,14,FOLLOW_14_in_ruleFQN470); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN485); 

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
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:230:1: entryRuleProperty returns [String current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final String entryRuleProperty() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProperty = null;


        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:231:2: (iv_ruleProperty= ruleProperty EOF )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:232:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty533);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty544); 

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
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:239:1: ruleProperty returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_PropertyKey_0= rulePropertyKey kw= '=' this_PropertyValue_2= rulePropertyValue ) ;
    public final AntlrDatatypeRuleToken ruleProperty() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_PropertyKey_0 = null;

        AntlrDatatypeRuleToken this_PropertyValue_2 = null;


         enterRule(); 
            
        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:242:28: ( (this_PropertyKey_0= rulePropertyKey kw= '=' this_PropertyValue_2= rulePropertyValue ) )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:243:1: (this_PropertyKey_0= rulePropertyKey kw= '=' this_PropertyValue_2= rulePropertyValue )
            {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:243:1: (this_PropertyKey_0= rulePropertyKey kw= '=' this_PropertyValue_2= rulePropertyValue )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:244:5: this_PropertyKey_0= rulePropertyKey kw= '=' this_PropertyValue_2= rulePropertyValue
            {
             
                    newCompositeNode(grammarAccess.getPropertyAccess().getPropertyKeyParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePropertyKey_in_ruleProperty591);
            this_PropertyKey_0=rulePropertyKey();

            state._fsp--;


            		current.merge(this_PropertyKey_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,15,FOLLOW_15_in_ruleProperty609); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getPropertyAccess().getEqualsSignKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getPropertyAccess().getPropertyValueParserRuleCall_2()); 
                
            pushFollow(FOLLOW_rulePropertyValue_in_ruleProperty631);
            this_PropertyValue_2=rulePropertyValue();

            state._fsp--;


            		current.merge(this_PropertyValue_2);
                
             
                    afterParserOrEnumRuleCall();
                

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
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:279:1: entryRulePropertyKey returns [String current=null] : iv_rulePropertyKey= rulePropertyKey EOF ;
    public final String entryRulePropertyKey() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePropertyKey = null;


        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:280:2: (iv_rulePropertyKey= rulePropertyKey EOF )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:281:2: iv_rulePropertyKey= rulePropertyKey EOF
            {
             newCompositeNode(grammarAccess.getPropertyKeyRule()); 
            pushFollow(FOLLOW_rulePropertyKey_in_entryRulePropertyKey677);
            iv_rulePropertyKey=rulePropertyKey();

            state._fsp--;

             current =iv_rulePropertyKey.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyKey688); 

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
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:288:1: rulePropertyKey returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken rulePropertyKey() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:291:28: (this_ID_0= RULE_ID )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:292:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePropertyKey727); 

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


    // $ANTLR start "entryRulePropertyValue"
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:307:1: entryRulePropertyValue returns [String current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final String entryRulePropertyValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePropertyValue = null;


        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:308:2: (iv_rulePropertyValue= rulePropertyValue EOF )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:309:2: iv_rulePropertyValue= rulePropertyValue EOF
            {
             newCompositeNode(grammarAccess.getPropertyValueRule()); 
            pushFollow(FOLLOW_rulePropertyValue_in_entryRulePropertyValue772);
            iv_rulePropertyValue=rulePropertyValue();

            state._fsp--;

             current =iv_rulePropertyValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyValue783); 

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
    // $ANTLR end "entryRulePropertyValue"


    // $ANTLR start "rulePropertyValue"
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:316:1: rulePropertyValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken rulePropertyValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:319:28: (this_ID_0= RULE_ID )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:320:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePropertyValue822); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getPropertyValueAccess().getIDTerminalRuleCall()); 
                

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
    // $ANTLR end "rulePropertyValue"


    // $ANTLR start "entryRuleDefaultLocale"
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:335:1: entryRuleDefaultLocale returns [String current=null] : iv_ruleDefaultLocale= ruleDefaultLocale EOF ;
    public final String entryRuleDefaultLocale() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDefaultLocale = null;


        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:336:2: (iv_ruleDefaultLocale= ruleDefaultLocale EOF )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:337:2: iv_ruleDefaultLocale= ruleDefaultLocale EOF
            {
             newCompositeNode(grammarAccess.getDefaultLocaleRule()); 
            pushFollow(FOLLOW_ruleDefaultLocale_in_entryRuleDefaultLocale867);
            iv_ruleDefaultLocale=ruleDefaultLocale();

            state._fsp--;

             current =iv_ruleDefaultLocale.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultLocale878); 

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
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:344:1: ruleDefaultLocale returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'DEFAULT_LOCALE' kw= '=' this_LOCALE_2= ruleLOCALE ) ;
    public final AntlrDatatypeRuleToken ruleDefaultLocale() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_LOCALE_2 = null;


         enterRule(); 
            
        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:347:28: ( (kw= 'DEFAULT_LOCALE' kw= '=' this_LOCALE_2= ruleLOCALE ) )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:348:1: (kw= 'DEFAULT_LOCALE' kw= '=' this_LOCALE_2= ruleLOCALE )
            {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:348:1: (kw= 'DEFAULT_LOCALE' kw= '=' this_LOCALE_2= ruleLOCALE )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:349:2: kw= 'DEFAULT_LOCALE' kw= '=' this_LOCALE_2= ruleLOCALE
            {
            kw=(Token)match(input,16,FOLLOW_16_in_ruleDefaultLocale916); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDefaultLocaleAccess().getDEFAULT_LOCALEKeyword_0()); 
                
            kw=(Token)match(input,15,FOLLOW_15_in_ruleDefaultLocale929); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDefaultLocaleAccess().getEqualsSignKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getDefaultLocaleAccess().getLOCALEParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleLOCALE_in_ruleDefaultLocale951);
            this_LOCALE_2=ruleLOCALE();

            state._fsp--;


            		current.merge(this_LOCALE_2);
                
             
                    afterParserOrEnumRuleCall();
                

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


    // $ANTLR start "entryRuleLOCALE"
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:379:1: entryRuleLOCALE returns [String current=null] : iv_ruleLOCALE= ruleLOCALE EOF ;
    public final String entryRuleLOCALE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLOCALE = null;


        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:380:2: (iv_ruleLOCALE= ruleLOCALE EOF )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:381:2: iv_ruleLOCALE= ruleLOCALE EOF
            {
             newCompositeNode(grammarAccess.getLOCALERule()); 
            pushFollow(FOLLOW_ruleLOCALE_in_entryRuleLOCALE997);
            iv_ruleLOCALE=ruleLOCALE();

            state._fsp--;

             current =iv_ruleLOCALE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLOCALE1008); 

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
    // $ANTLR end "entryRuleLOCALE"


    // $ANTLR start "ruleLOCALE"
    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:388:1: ruleLOCALE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'de' | kw= 'en' ) ;
    public final AntlrDatatypeRuleToken ruleLOCALE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:391:28: ( (kw= 'de' | kw= 'en' ) )
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:392:1: (kw= 'de' | kw= 'en' )
            {
            // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:392:1: (kw= 'de' | kw= 'en' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            else if ( (LA6_0==18) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:393:2: kw= 'de'
                    {
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleLOCALE1046); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLOCALEAccess().getDeKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.fbrx.propertysl/src-gen/com/github/fbrx/propertysl/parser/antlr/internal/InternalPropertySL.g:400:2: kw= 'en'
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleLOCALE1065); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLOCALEAccess().getEnKeyword_1()); 
                        

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
    // $ANTLR end "ruleLOCALE"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_ruleModel130 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rulePackage216 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_rulePackage238 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePackage256 = new BitSet(new long[]{0x0000000000012810L});
    public static final BitSet FOLLOW_ruleDefaultLocale_in_rulePackage279 = new BitSet(new long[]{0x0000000000002810L});
    public static final BitSet FOLLOW_rulePackage_in_rulePackage309 = new BitSet(new long[]{0x0000000000002810L});
    public static final BitSet FOLLOW_ruleProperty_in_rulePackage339 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_13_in_rulePackage359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN400 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN451 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleFQN470 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN485 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty533 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyKey_in_ruleProperty591 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleProperty609 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePropertyValue_in_ruleProperty631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyKey_in_entryRulePropertyKey677 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyKey688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePropertyKey727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyValue_in_entryRulePropertyValue772 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyValue783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePropertyValue822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultLocale_in_entryRuleDefaultLocale867 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultLocale878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleDefaultLocale916 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDefaultLocale929 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_ruleLOCALE_in_ruleDefaultLocale951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLOCALE_in_entryRuleLOCALE997 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLOCALE1008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleLOCALE1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleLOCALE1065 = new BitSet(new long[]{0x0000000000000002L});

}