package org.pklose.espl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.pklose.espl.services.EsplmGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEsplmParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Flow'", "'{'", "'}'", "'Activity'", "'Successors'", "'['", "','", "']'", "'Calls'", "'Description'", "'BusinessRule'", "'Import'", "'.*'", "'Diagram'", "'Include'", "'Exclude'", "'with'", "'Enumeration'", "'.'", "'Entity'", "'Domain'", "'Description: '", "'Relation'", "':'", "'1..N'", "'0..N'", "'1'", "'1..0'", "'Field'", "'Decimal'", "'Money'", "'Text'", "'Boolean'", "'Int'", "'Enum'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalEsplmParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEsplmParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEsplmParser.tokenNames; }
    public String getGrammarFileName() { return "../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g"; }



     	private EsplmGrammarAccess grammarAccess;
     	
        public InternalEsplmParser(TokenStream input, EsplmGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected EsplmGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:69:2: iv_ruleModel= ruleModel EOF
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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:76:1: ruleModel returns [EObject current=null] : ( (lv_elements_0_0= ruleElement ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:79:28: ( ( (lv_elements_0_0= ruleElement ) ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:80:1: ( (lv_elements_0_0= ruleElement ) )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:80:1: ( (lv_elements_0_0= ruleElement ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:81:1: (lv_elements_0_0= ruleElement )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:81:1: (lv_elements_0_0= ruleElement )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:82:3: lv_elements_0_0= ruleElement
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getElementsElementParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleElement_in_ruleModel130);
            lv_elements_0_0=ruleElement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		add(
                   			current, 
                   			"elements",
                    		lv_elements_0_0, 
                    		"Element");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleElement"
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:106:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:107:2: (iv_ruleElement= ruleElement EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:108:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement165);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement175); 

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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:115:1: ruleElement returns [EObject current=null] : (this_EnumDeclaration_0= ruleEnumDeclaration | this_Diagram_1= ruleDiagram | this_Domain_2= ruleDomain | this_Flow_3= ruleFlow | this_BusinessRule_4= ruleBusinessRule ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_EnumDeclaration_0 = null;

        EObject this_Diagram_1 = null;

        EObject this_Domain_2 = null;

        EObject this_Flow_3 = null;

        EObject this_BusinessRule_4 = null;


         enterRule(); 
            
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:118:28: ( (this_EnumDeclaration_0= ruleEnumDeclaration | this_Diagram_1= ruleDiagram | this_Domain_2= ruleDomain | this_Flow_3= ruleFlow | this_BusinessRule_4= ruleBusinessRule ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:119:1: (this_EnumDeclaration_0= ruleEnumDeclaration | this_Diagram_1= ruleDiagram | this_Domain_2= ruleDomain | this_Flow_3= ruleFlow | this_BusinessRule_4= ruleBusinessRule )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:119:1: (this_EnumDeclaration_0= ruleEnumDeclaration | this_Diagram_1= ruleDiagram | this_Domain_2= ruleDomain | this_Flow_3= ruleFlow | this_BusinessRule_4= ruleBusinessRule )
            int alt1=5;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:120:5: this_EnumDeclaration_0= ruleEnumDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getEnumDeclarationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleEnumDeclaration_in_ruleElement222);
                    this_EnumDeclaration_0=ruleEnumDeclaration();

                    state._fsp--;

                     
                            current = this_EnumDeclaration_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:130:5: this_Diagram_1= ruleDiagram
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getDiagramParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDiagram_in_ruleElement249);
                    this_Diagram_1=ruleDiagram();

                    state._fsp--;

                     
                            current = this_Diagram_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:140:5: this_Domain_2= ruleDomain
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getDomainParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleDomain_in_ruleElement276);
                    this_Domain_2=ruleDomain();

                    state._fsp--;

                     
                            current = this_Domain_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:150:5: this_Flow_3= ruleFlow
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getFlowParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleFlow_in_ruleElement303);
                    this_Flow_3=ruleFlow();

                    state._fsp--;

                     
                            current = this_Flow_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:160:5: this_BusinessRule_4= ruleBusinessRule
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getBusinessRuleParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleBusinessRule_in_ruleElement330);
                    this_BusinessRule_4=ruleBusinessRule();

                    state._fsp--;

                     
                            current = this_BusinessRule_4; 
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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleFlow"
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:176:1: entryRuleFlow returns [EObject current=null] : iv_ruleFlow= ruleFlow EOF ;
    public final EObject entryRuleFlow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlow = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:177:2: (iv_ruleFlow= ruleFlow EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:178:2: iv_ruleFlow= ruleFlow EOF
            {
             newCompositeNode(grammarAccess.getFlowRule()); 
            pushFollow(FOLLOW_ruleFlow_in_entryRuleFlow365);
            iv_ruleFlow=ruleFlow();

            state._fsp--;

             current =iv_ruleFlow; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFlow375); 

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
    // $ANTLR end "entryRuleFlow"


    // $ANTLR start "ruleFlow"
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:185:1: ruleFlow returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'Flow' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_activities_4_0= ruleActivity ) )* otherlv_5= '}' ) ;
    public final EObject ruleFlow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_imports_0_0 = null;

        EObject lv_activities_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:188:28: ( ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'Flow' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_activities_4_0= ruleActivity ) )* otherlv_5= '}' ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:189:1: ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'Flow' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_activities_4_0= ruleActivity ) )* otherlv_5= '}' )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:189:1: ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'Flow' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_activities_4_0= ruleActivity ) )* otherlv_5= '}' )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:189:2: ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'Flow' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_activities_4_0= ruleActivity ) )* otherlv_5= '}'
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:189:2: ( (lv_imports_0_0= ruleImport ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==22) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:190:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:190:1: (lv_imports_0_0= ruleImport )
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:191:3: lv_imports_0_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFlowAccess().getImportsImportParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleFlow421);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFlowRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_0_0, 
            	            		"Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleFlow434); 

                	newLeafNode(otherlv_1, grammarAccess.getFlowAccess().getFlowKeyword_1());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:211:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:212:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:212:1: (lv_name_2_0= RULE_ID )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:213:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFlow451); 

            			newLeafNode(lv_name_2_0, grammarAccess.getFlowAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFlowRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleFlow468); 

                	newLeafNode(otherlv_3, grammarAccess.getFlowAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:233:1: ( (lv_activities_4_0= ruleActivity ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:234:1: (lv_activities_4_0= ruleActivity )
            	    {
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:234:1: (lv_activities_4_0= ruleActivity )
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:235:3: lv_activities_4_0= ruleActivity
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFlowAccess().getActivitiesActivityParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActivity_in_ruleFlow489);
            	    lv_activities_4_0=ruleActivity();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFlowRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"activities",
            	            		lv_activities_4_0, 
            	            		"Activity");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleFlow502); 

                	newLeafNode(otherlv_5, grammarAccess.getFlowAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleFlow"


    // $ANTLR start "entryRuleActivity"
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:263:1: entryRuleActivity returns [EObject current=null] : iv_ruleActivity= ruleActivity EOF ;
    public final EObject entryRuleActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivity = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:264:2: (iv_ruleActivity= ruleActivity EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:265:2: iv_ruleActivity= ruleActivity EOF
            {
             newCompositeNode(grammarAccess.getActivityRule()); 
            pushFollow(FOLLOW_ruleActivity_in_entryRuleActivity538);
            iv_ruleActivity=ruleActivity();

            state._fsp--;

             current =iv_ruleActivity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivity548); 

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
    // $ANTLR end "entryRuleActivity"


    // $ANTLR start "ruleActivity"
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:272:1: ruleActivity returns [EObject current=null] : (otherlv_0= 'Activity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Successors' otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' )? (otherlv_9= 'Calls' ( ( ruleFQN ) ) )? otherlv_11= 'Description' ( (lv_description_12_0= RULE_STRING ) ) otherlv_13= '}' ) ;
    public final EObject ruleActivity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token lv_description_12_0=null;
        Token otherlv_13=null;

         enterRule(); 
            
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:275:28: ( (otherlv_0= 'Activity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Successors' otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' )? (otherlv_9= 'Calls' ( ( ruleFQN ) ) )? otherlv_11= 'Description' ( (lv_description_12_0= RULE_STRING ) ) otherlv_13= '}' ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:276:1: (otherlv_0= 'Activity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Successors' otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' )? (otherlv_9= 'Calls' ( ( ruleFQN ) ) )? otherlv_11= 'Description' ( (lv_description_12_0= RULE_STRING ) ) otherlv_13= '}' )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:276:1: (otherlv_0= 'Activity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Successors' otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' )? (otherlv_9= 'Calls' ( ( ruleFQN ) ) )? otherlv_11= 'Description' ( (lv_description_12_0= RULE_STRING ) ) otherlv_13= '}' )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:276:3: otherlv_0= 'Activity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Successors' otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' )? (otherlv_9= 'Calls' ( ( ruleFQN ) ) )? otherlv_11= 'Description' ( (lv_description_12_0= RULE_STRING ) ) otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleActivity585); 

                	newLeafNode(otherlv_0, grammarAccess.getActivityAccess().getActivityKeyword_0());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:280:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:281:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:281:1: (lv_name_1_0= RULE_ID )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:282:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActivity602); 

            			newLeafNode(lv_name_1_0, grammarAccess.getActivityAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActivityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleActivity619); 

                	newLeafNode(otherlv_2, grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:302:1: (otherlv_3= 'Successors' otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:302:3: otherlv_3= 'Successors' otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']'
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleActivity632); 

                        	newLeafNode(otherlv_3, grammarAccess.getActivityAccess().getSuccessorsKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleActivity644); 

                        	newLeafNode(otherlv_4, grammarAccess.getActivityAccess().getLeftSquareBracketKeyword_3_1());
                        
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:310:1: ( (otherlv_5= RULE_ID ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:311:1: (otherlv_5= RULE_ID )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:311:1: (otherlv_5= RULE_ID )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:312:3: otherlv_5= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getActivityRule());
                    	        }
                            
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActivity664); 

                    		newLeafNode(otherlv_5, grammarAccess.getActivityAccess().getSucessorsActivityCrossReference_3_2_0()); 
                    	

                    }


                    }

                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:323:2: (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==17) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:323:4: otherlv_6= ',' ( (otherlv_7= RULE_ID ) )
                    	    {
                    	    otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleActivity677); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getActivityAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:327:1: ( (otherlv_7= RULE_ID ) )
                    	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:328:1: (otherlv_7= RULE_ID )
                    	    {
                    	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:328:1: (otherlv_7= RULE_ID )
                    	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:329:3: otherlv_7= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getActivityRule());
                    	    	        }
                    	            
                    	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActivity697); 

                    	    		newLeafNode(otherlv_7, grammarAccess.getActivityAccess().getSucessorsActivityCrossReference_3_3_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleActivity711); 

                        	newLeafNode(otherlv_8, grammarAccess.getActivityAccess().getRightSquareBracketKeyword_3_4());
                        

                    }
                    break;

            }

            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:344:3: (otherlv_9= 'Calls' ( ( ruleFQN ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:344:5: otherlv_9= 'Calls' ( ( ruleFQN ) )
                    {
                    otherlv_9=(Token)match(input,19,FOLLOW_19_in_ruleActivity726); 

                        	newLeafNode(otherlv_9, grammarAccess.getActivityAccess().getCallsKeyword_4_0());
                        
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:348:1: ( ( ruleFQN ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:349:1: ( ruleFQN )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:349:1: ( ruleFQN )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:350:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getActivityRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getActivityAccess().getBusinessRuleBusinessRuleCrossReference_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleActivity749);
                    ruleFQN();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,20,FOLLOW_20_in_ruleActivity763); 

                	newLeafNode(otherlv_11, grammarAccess.getActivityAccess().getDescriptionKeyword_5());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:367:1: ( (lv_description_12_0= RULE_STRING ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:368:1: (lv_description_12_0= RULE_STRING )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:368:1: (lv_description_12_0= RULE_STRING )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:369:3: lv_description_12_0= RULE_STRING
            {
            lv_description_12_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActivity780); 

            			newLeafNode(lv_description_12_0, grammarAccess.getActivityAccess().getDescriptionSTRINGTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActivityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_12_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_13=(Token)match(input,13,FOLLOW_13_in_ruleActivity797); 

                	newLeafNode(otherlv_13, grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleActivity"


    // $ANTLR start "entryRuleBusinessRule"
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:397:1: entryRuleBusinessRule returns [EObject current=null] : iv_ruleBusinessRule= ruleBusinessRule EOF ;
    public final EObject entryRuleBusinessRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBusinessRule = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:398:2: (iv_ruleBusinessRule= ruleBusinessRule EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:399:2: iv_ruleBusinessRule= ruleBusinessRule EOF
            {
             newCompositeNode(grammarAccess.getBusinessRuleRule()); 
            pushFollow(FOLLOW_ruleBusinessRule_in_entryRuleBusinessRule833);
            iv_ruleBusinessRule=ruleBusinessRule();

            state._fsp--;

             current =iv_ruleBusinessRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBusinessRule843); 

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
    // $ANTLR end "entryRuleBusinessRule"


    // $ANTLR start "ruleBusinessRule"
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:406:1: ruleBusinessRule returns [EObject current=null] : (otherlv_0= 'BusinessRule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) ;
    public final EObject ruleBusinessRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:409:28: ( (otherlv_0= 'BusinessRule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:410:1: (otherlv_0= 'BusinessRule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:410:1: (otherlv_0= 'BusinessRule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:410:3: otherlv_0= 'BusinessRule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleBusinessRule880); 

                	newLeafNode(otherlv_0, grammarAccess.getBusinessRuleAccess().getBusinessRuleKeyword_0());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:414:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:415:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:415:1: (lv_name_1_0= RULE_ID )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:416:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBusinessRule897); 

            			newLeafNode(lv_name_1_0, grammarAccess.getBusinessRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBusinessRuleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleBusinessRule914); 

                	newLeafNode(otherlv_2, grammarAccess.getBusinessRuleAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleBusinessRule926); 

                	newLeafNode(otherlv_3, grammarAccess.getBusinessRuleAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleBusinessRule"


    // $ANTLR start "entryRuleImport"
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:448:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:449:2: (iv_ruleImport= ruleImport EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:450:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport962);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport972); 

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:457:1: ruleImport returns [EObject current=null] : (otherlv_0= 'Import' ( (lv_importedNamespace_1_0= ruleFqnWithWildCard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:460:28: ( (otherlv_0= 'Import' ( (lv_importedNamespace_1_0= ruleFqnWithWildCard ) ) ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:461:1: (otherlv_0= 'Import' ( (lv_importedNamespace_1_0= ruleFqnWithWildCard ) ) )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:461:1: (otherlv_0= 'Import' ( (lv_importedNamespace_1_0= ruleFqnWithWildCard ) ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:461:3: otherlv_0= 'Import' ( (lv_importedNamespace_1_0= ruleFqnWithWildCard ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleImport1009); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:465:1: ( (lv_importedNamespace_1_0= ruleFqnWithWildCard ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:466:1: (lv_importedNamespace_1_0= ruleFqnWithWildCard )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:466:1: (lv_importedNamespace_1_0= ruleFqnWithWildCard )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:467:3: lv_importedNamespace_1_0= ruleFqnWithWildCard
            {
             
            	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceFqnWithWildCardParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFqnWithWildCard_in_ruleImport1030);
            lv_importedNamespace_1_0=ruleFqnWithWildCard();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImportRule());
            	        }
                   		set(
                   			current, 
                   			"importedNamespace",
                    		lv_importedNamespace_1_0, 
                    		"FqnWithWildCard");
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleFqnWithWildCard"
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:491:1: entryRuleFqnWithWildCard returns [String current=null] : iv_ruleFqnWithWildCard= ruleFqnWithWildCard EOF ;
    public final String entryRuleFqnWithWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFqnWithWildCard = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:492:2: (iv_ruleFqnWithWildCard= ruleFqnWithWildCard EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:493:2: iv_ruleFqnWithWildCard= ruleFqnWithWildCard EOF
            {
             newCompositeNode(grammarAccess.getFqnWithWildCardRule()); 
            pushFollow(FOLLOW_ruleFqnWithWildCard_in_entryRuleFqnWithWildCard1067);
            iv_ruleFqnWithWildCard=ruleFqnWithWildCard();

            state._fsp--;

             current =iv_ruleFqnWithWildCard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFqnWithWildCard1078); 

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
    // $ANTLR end "entryRuleFqnWithWildCard"


    // $ANTLR start "ruleFqnWithWildCard"
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:500:1: ruleFqnWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FQN_0= ruleFQN (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleFqnWithWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FQN_0 = null;


         enterRule(); 
            
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:503:28: ( (this_FQN_0= ruleFQN (kw= '.*' )? ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:504:1: (this_FQN_0= ruleFQN (kw= '.*' )? )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:504:1: (this_FQN_0= ruleFQN (kw= '.*' )? )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:505:5: this_FQN_0= ruleFQN (kw= '.*' )?
            {
             
                    newCompositeNode(grammarAccess.getFqnWithWildCardAccess().getFQNParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleFQN_in_ruleFqnWithWildCard1125);
            this_FQN_0=ruleFQN();

            state._fsp--;


            		current.merge(this_FQN_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:515:1: (kw= '.*' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:516:2: kw= '.*'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleFqnWithWildCard1144); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFqnWithWildCardAccess().getFullStopAsteriskKeyword_1()); 
                        

                    }
                    break;

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
    // $ANTLR end "ruleFqnWithWildCard"


    // $ANTLR start "entryRuleDiagram"
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:529:1: entryRuleDiagram returns [EObject current=null] : iv_ruleDiagram= ruleDiagram EOF ;
    public final EObject entryRuleDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiagram = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:530:2: (iv_ruleDiagram= ruleDiagram EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:531:2: iv_ruleDiagram= ruleDiagram EOF
            {
             newCompositeNode(grammarAccess.getDiagramRule()); 
            pushFollow(FOLLOW_ruleDiagram_in_entryRuleDiagram1186);
            iv_ruleDiagram=ruleDiagram();

            state._fsp--;

             current =iv_ruleDiagram; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDiagram1196); 

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
    // $ANTLR end "entryRuleDiagram"


    // $ANTLR start "ruleDiagram"
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:538:1: ruleDiagram returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'Diagram' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_includes_4_0= ruleInclude ) )* otherlv_5= '}' ) ;
    public final EObject ruleDiagram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_imports_0_0 = null;

        EObject lv_includes_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:541:28: ( ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'Diagram' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_includes_4_0= ruleInclude ) )* otherlv_5= '}' ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:542:1: ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'Diagram' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_includes_4_0= ruleInclude ) )* otherlv_5= '}' )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:542:1: ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'Diagram' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_includes_4_0= ruleInclude ) )* otherlv_5= '}' )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:542:2: ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'Diagram' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_includes_4_0= ruleInclude ) )* otherlv_5= '}'
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:542:2: ( (lv_imports_0_0= ruleImport ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:543:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:543:1: (lv_imports_0_0= ruleImport )
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:544:3: lv_imports_0_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDiagramAccess().getImportsImportParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleDiagram1242);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDiagramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_0_0, 
            	            		"Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleDiagram1255); 

                	newLeafNode(otherlv_1, grammarAccess.getDiagramAccess().getDiagramKeyword_1());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:564:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:565:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:565:1: (lv_name_2_0= RULE_ID )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:566:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDiagram1272); 

            			newLeafNode(lv_name_2_0, grammarAccess.getDiagramAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDiagramRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleDiagram1289); 

                	newLeafNode(otherlv_3, grammarAccess.getDiagramAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:586:1: ( (lv_includes_4_0= ruleInclude ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=25 && LA9_0<=26)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:587:1: (lv_includes_4_0= ruleInclude )
            	    {
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:587:1: (lv_includes_4_0= ruleInclude )
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:588:3: lv_includes_4_0= ruleInclude
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDiagramAccess().getIncludesIncludeParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInclude_in_ruleDiagram1310);
            	    lv_includes_4_0=ruleInclude();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDiagramRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"includes",
            	            		lv_includes_4_0, 
            	            		"Include");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleDiagram1323); 

                	newLeafNode(otherlv_5, grammarAccess.getDiagramAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleDiagram"


    // $ANTLR start "entryRuleInclude"
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:616:1: entryRuleInclude returns [EObject current=null] : iv_ruleInclude= ruleInclude EOF ;
    public final EObject entryRuleInclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInclude = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:617:2: (iv_ruleInclude= ruleInclude EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:618:2: iv_ruleInclude= ruleInclude EOF
            {
             newCompositeNode(grammarAccess.getIncludeRule()); 
            pushFollow(FOLLOW_ruleInclude_in_entryRuleInclude1359);
            iv_ruleInclude=ruleInclude();

            state._fsp--;

             current =iv_ruleInclude; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInclude1369); 

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
    // $ANTLR end "entryRuleInclude"


    // $ANTLR start "ruleInclude"
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:625:1: ruleInclude returns [EObject current=null] : ( ( ( (lv_include_0_1= 'Include' | lv_include_0_2= 'Exclude' ) ) ) ( ( ruleFQN ) ) (otherlv_2= 'with' otherlv_3= '{' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' ) ) ;
    public final EObject ruleInclude() throws RecognitionException {
        EObject current = null;

        Token lv_include_0_1=null;
        Token lv_include_0_2=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:628:28: ( ( ( ( (lv_include_0_1= 'Include' | lv_include_0_2= 'Exclude' ) ) ) ( ( ruleFQN ) ) (otherlv_2= 'with' otherlv_3= '{' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' ) ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:629:1: ( ( ( (lv_include_0_1= 'Include' | lv_include_0_2= 'Exclude' ) ) ) ( ( ruleFQN ) ) (otherlv_2= 'with' otherlv_3= '{' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' ) )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:629:1: ( ( ( (lv_include_0_1= 'Include' | lv_include_0_2= 'Exclude' ) ) ) ( ( ruleFQN ) ) (otherlv_2= 'with' otherlv_3= '{' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:629:2: ( ( (lv_include_0_1= 'Include' | lv_include_0_2= 'Exclude' ) ) ) ( ( ruleFQN ) ) (otherlv_2= 'with' otherlv_3= '{' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:629:2: ( ( (lv_include_0_1= 'Include' | lv_include_0_2= 'Exclude' ) ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:630:1: ( (lv_include_0_1= 'Include' | lv_include_0_2= 'Exclude' ) )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:630:1: ( (lv_include_0_1= 'Include' | lv_include_0_2= 'Exclude' ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:631:1: (lv_include_0_1= 'Include' | lv_include_0_2= 'Exclude' )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:631:1: (lv_include_0_1= 'Include' | lv_include_0_2= 'Exclude' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            else if ( (LA10_0==26) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:632:3: lv_include_0_1= 'Include'
                    {
                    lv_include_0_1=(Token)match(input,25,FOLLOW_25_in_ruleInclude1414); 

                            newLeafNode(lv_include_0_1, grammarAccess.getIncludeAccess().getIncludeIncludeKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIncludeRule());
                    	        }
                           		setWithLastConsumed(current, "include", lv_include_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:644:8: lv_include_0_2= 'Exclude'
                    {
                    lv_include_0_2=(Token)match(input,26,FOLLOW_26_in_ruleInclude1443); 

                            newLeafNode(lv_include_0_2, grammarAccess.getIncludeAccess().getIncludeExcludeKeyword_0_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIncludeRule());
                    	        }
                           		setWithLastConsumed(current, "include", lv_include_0_2, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:659:2: ( ( ruleFQN ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:660:1: ( ruleFQN )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:660:1: ( ruleFQN )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:661:3: ruleFQN
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIncludeRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getIncludeAccess().getEntityEntityCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleInclude1482);
            ruleFQN();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:674:2: (otherlv_2= 'with' otherlv_3= '{' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:674:4: otherlv_2= 'with' otherlv_3= '{' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}'
            {
            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleInclude1495); 

                	newLeafNode(otherlv_2, grammarAccess.getIncludeAccess().getWithKeyword_2_0());
                
            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleInclude1507); 

                	newLeafNode(otherlv_3, grammarAccess.getIncludeAccess().getLeftCurlyBracketKeyword_2_1());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:682:1: ( (otherlv_4= RULE_ID ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:683:1: (otherlv_4= RULE_ID )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:683:1: (otherlv_4= RULE_ID )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:684:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIncludeRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInclude1527); 

            		newLeafNode(otherlv_4, grammarAccess.getIncludeAccess().getFieldsPropertyCrossReference_2_2_0()); 
            	

            }


            }

            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:695:2: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==17) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:695:4: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleInclude1540); 

            	        	newLeafNode(otherlv_5, grammarAccess.getIncludeAccess().getCommaKeyword_2_3_0());
            	        
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:699:1: ( (otherlv_6= RULE_ID ) )
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:700:1: (otherlv_6= RULE_ID )
            	    {
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:700:1: (otherlv_6= RULE_ID )
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:701:3: otherlv_6= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getIncludeRule());
            	    	        }
            	            
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInclude1560); 

            	    		newLeafNode(otherlv_6, grammarAccess.getIncludeAccess().getFieldsPropertyCrossReference_2_3_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleInclude1574); 

                	newLeafNode(otherlv_7, grammarAccess.getIncludeAccess().getRightCurlyBracketKeyword_2_4());
                

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
    // $ANTLR end "ruleInclude"


    // $ANTLR start "entryRuleEnumDeclaration"
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:724:1: entryRuleEnumDeclaration returns [EObject current=null] : iv_ruleEnumDeclaration= ruleEnumDeclaration EOF ;
    public final EObject entryRuleEnumDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumDeclaration = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:725:2: (iv_ruleEnumDeclaration= ruleEnumDeclaration EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:726:2: iv_ruleEnumDeclaration= ruleEnumDeclaration EOF
            {
             newCompositeNode(grammarAccess.getEnumDeclarationRule()); 
            pushFollow(FOLLOW_ruleEnumDeclaration_in_entryRuleEnumDeclaration1611);
            iv_ruleEnumDeclaration=ruleEnumDeclaration();

            state._fsp--;

             current =iv_ruleEnumDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumDeclaration1621); 

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
    // $ANTLR end "entryRuleEnumDeclaration"


    // $ANTLR start "ruleEnumDeclaration"
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:733:1: ruleEnumDeclaration returns [EObject current=null] : (otherlv_0= 'Enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' this_ID_5= RULE_ID )* otherlv_6= '}' ) ;
    public final EObject ruleEnumDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_values_3_0=null;
        Token otherlv_4=null;
        Token this_ID_5=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:736:28: ( (otherlv_0= 'Enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' this_ID_5= RULE_ID )* otherlv_6= '}' ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:737:1: (otherlv_0= 'Enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' this_ID_5= RULE_ID )* otherlv_6= '}' )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:737:1: (otherlv_0= 'Enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' this_ID_5= RULE_ID )* otherlv_6= '}' )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:737:3: otherlv_0= 'Enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' this_ID_5= RULE_ID )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleEnumDeclaration1658); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumDeclarationAccess().getEnumerationKeyword_0());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:741:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:742:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:742:1: (lv_name_1_0= RULE_ID )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:743:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumDeclaration1675); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEnumDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumDeclarationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleEnumDeclaration1692); 

                	newLeafNode(otherlv_2, grammarAccess.getEnumDeclarationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:763:1: ( (lv_values_3_0= RULE_ID ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:764:1: (lv_values_3_0= RULE_ID )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:764:1: (lv_values_3_0= RULE_ID )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:765:3: lv_values_3_0= RULE_ID
            {
            lv_values_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumDeclaration1709); 

            			newLeafNode(lv_values_3_0, grammarAccess.getEnumDeclarationAccess().getValuesIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumDeclarationRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"values",
                    		lv_values_3_0, 
                    		"ID");
            	    

            }


            }

            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:781:2: (otherlv_4= ',' this_ID_5= RULE_ID )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==17) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:781:4: otherlv_4= ',' this_ID_5= RULE_ID
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleEnumDeclaration1727); 

            	        	newLeafNode(otherlv_4, grammarAccess.getEnumDeclarationAccess().getCommaKeyword_4_0());
            	        
            	    this_ID_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumDeclaration1738); 
            	     
            	        newLeafNode(this_ID_5, grammarAccess.getEnumDeclarationAccess().getIDTerminalRuleCall_4_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleEnumDeclaration1751); 

                	newLeafNode(otherlv_6, grammarAccess.getEnumDeclarationAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleEnumDeclaration"


    // $ANTLR start "entryRuleFQN"
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:801:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:802:2: (iv_ruleFQN= ruleFQN EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:803:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN1788);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN1799); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:810:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:813:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:814:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:814:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:814:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN1839); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:821:1: (kw= '.' this_ID_2= RULE_ID )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==29) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:822:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,29,FOLLOW_29_in_ruleFQN1858); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN1873); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop13;
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


    // $ANTLR start "entryRuleEntity"
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:842:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:843:2: (iv_ruleEntity= ruleEntity EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:844:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity1920);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity1930); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:851:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_properties_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:854:28: ( (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:855:1: (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:855:1: (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:855:3: otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleEntity1967); 

                	newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:859:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:860:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:860:1: (lv_name_1_0= RULE_ID )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:861:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity1984); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEntityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleEntity2001); 

                	newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:881:1: ( (lv_properties_3_0= ruleProperty ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==33||LA14_0==39) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:882:1: (lv_properties_3_0= ruleProperty )
            	    {
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:882:1: (lv_properties_3_0= ruleProperty )
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:883:3: lv_properties_3_0= ruleProperty
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getPropertiesPropertyParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProperty_in_ruleEntity2022);
            	    lv_properties_3_0=ruleProperty();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"properties",
            	            		lv_properties_3_0, 
            	            		"Property");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleEntity2035); 

                	newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleDomain"
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:911:1: entryRuleDomain returns [EObject current=null] : iv_ruleDomain= ruleDomain EOF ;
    public final EObject entryRuleDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomain = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:912:2: (iv_ruleDomain= ruleDomain EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:913:2: iv_ruleDomain= ruleDomain EOF
            {
             newCompositeNode(grammarAccess.getDomainRule()); 
            pushFollow(FOLLOW_ruleDomain_in_entryRuleDomain2071);
            iv_ruleDomain=ruleDomain();

            state._fsp--;

             current =iv_ruleDomain; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomain2081); 

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
    // $ANTLR end "entryRuleDomain"


    // $ANTLR start "ruleDomain"
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:920:1: ruleDomain returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'Domain' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'Description: ' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= '{' ( (lv_entities_6_0= ruleEntity ) )+ otherlv_7= '}' ) ;
    public final EObject ruleDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_imports_0_0 = null;

        EObject lv_entities_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:923:28: ( ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'Domain' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'Description: ' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= '{' ( (lv_entities_6_0= ruleEntity ) )+ otherlv_7= '}' ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:924:1: ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'Domain' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'Description: ' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= '{' ( (lv_entities_6_0= ruleEntity ) )+ otherlv_7= '}' )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:924:1: ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'Domain' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'Description: ' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= '{' ( (lv_entities_6_0= ruleEntity ) )+ otherlv_7= '}' )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:924:2: ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'Domain' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'Description: ' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= '{' ( (lv_entities_6_0= ruleEntity ) )+ otherlv_7= '}'
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:924:2: ( (lv_imports_0_0= ruleImport ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==22) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:925:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:925:1: (lv_imports_0_0= ruleImport )
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:926:3: lv_imports_0_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDomainAccess().getImportsImportParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleDomain2127);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDomainRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_0_0, 
            	            		"Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleDomain2140); 

                	newLeafNode(otherlv_1, grammarAccess.getDomainAccess().getDomainKeyword_1());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:946:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:947:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:947:1: (lv_name_2_0= RULE_ID )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:948:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDomain2157); 

            			newLeafNode(lv_name_2_0, grammarAccess.getDomainAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDomainRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleDomain2174); 

                	newLeafNode(otherlv_3, grammarAccess.getDomainAccess().getDescriptionKeyword_3());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:968:1: ( (lv_description_4_0= RULE_STRING ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:969:1: (lv_description_4_0= RULE_STRING )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:969:1: (lv_description_4_0= RULE_STRING )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:970:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDomain2191); 

            			newLeafNode(lv_description_4_0, grammarAccess.getDomainAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDomainRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleDomain2208); 

                	newLeafNode(otherlv_5, grammarAccess.getDomainAccess().getLeftCurlyBracketKeyword_5());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:990:1: ( (lv_entities_6_0= ruleEntity ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==30) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:991:1: (lv_entities_6_0= ruleEntity )
            	    {
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:991:1: (lv_entities_6_0= ruleEntity )
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:992:3: lv_entities_6_0= ruleEntity
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDomainAccess().getEntitiesEntityParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEntity_in_ruleDomain2229);
            	    lv_entities_6_0=ruleEntity();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDomainRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"entities",
            	            		lv_entities_6_0, 
            	            		"Entity");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleDomain2242); 

                	newLeafNode(otherlv_7, grammarAccess.getDomainAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleDomain"


    // $ANTLR start "entryRuleProperty"
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1020:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1021:2: (iv_ruleProperty= ruleProperty EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1022:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty2278);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty2288); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1029:1: ruleProperty returns [EObject current=null] : (this_Field_0= ruleField | this_Association_1= ruleAssociation ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        EObject this_Field_0 = null;

        EObject this_Association_1 = null;


         enterRule(); 
            
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1032:28: ( (this_Field_0= ruleField | this_Association_1= ruleAssociation ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1033:1: (this_Field_0= ruleField | this_Association_1= ruleAssociation )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1033:1: (this_Field_0= ruleField | this_Association_1= ruleAssociation )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==39) ) {
                alt17=1;
            }
            else if ( (LA17_0==33) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1034:5: this_Field_0= ruleField
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyAccess().getFieldParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleField_in_ruleProperty2335);
                    this_Field_0=ruleField();

                    state._fsp--;

                     
                            current = this_Field_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1044:5: this_Association_1= ruleAssociation
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyAccess().getAssociationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAssociation_in_ruleProperty2362);
                    this_Association_1=ruleAssociation();

                    state._fsp--;

                     
                            current = this_Association_1; 
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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleAssociation"
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1060:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1061:2: (iv_ruleAssociation= ruleAssociation EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1062:2: iv_ruleAssociation= ruleAssociation EOF
            {
             newCompositeNode(grammarAccess.getAssociationRule()); 
            pushFollow(FOLLOW_ruleAssociation_in_entryRuleAssociation2397);
            iv_ruleAssociation=ruleAssociation();

            state._fsp--;

             current =iv_ruleAssociation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssociation2407); 

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
    // $ANTLR end "entryRuleAssociation"


    // $ANTLR start "ruleAssociation"
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1069:1: ruleAssociation returns [EObject current=null] : (otherlv_0= 'Relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleFQN ) ) ( (lv_multiplicity_4_0= ruleMultiplicty ) ) ) ;
    public final EObject ruleAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_multiplicity_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1072:28: ( (otherlv_0= 'Relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleFQN ) ) ( (lv_multiplicity_4_0= ruleMultiplicty ) ) ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1073:1: (otherlv_0= 'Relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleFQN ) ) ( (lv_multiplicity_4_0= ruleMultiplicty ) ) )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1073:1: (otherlv_0= 'Relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleFQN ) ) ( (lv_multiplicity_4_0= ruleMultiplicty ) ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1073:3: otherlv_0= 'Relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleFQN ) ) ( (lv_multiplicity_4_0= ruleMultiplicty ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleAssociation2444); 

                	newLeafNode(otherlv_0, grammarAccess.getAssociationAccess().getRelationKeyword_0());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1077:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1078:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1078:1: (lv_name_1_0= RULE_ID )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1079:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssociation2461); 

            			newLeafNode(lv_name_1_0, grammarAccess.getAssociationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAssociationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleAssociation2478); 

                	newLeafNode(otherlv_2, grammarAccess.getAssociationAccess().getColonKeyword_2());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1099:1: ( ( ruleFQN ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1100:1: ( ruleFQN )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1100:1: ( ruleFQN )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1101:3: ruleFQN
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAssociationRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAssociationAccess().getTypeEntityCrossReference_3_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleAssociation2501);
            ruleFQN();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1114:2: ( (lv_multiplicity_4_0= ruleMultiplicty ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1115:1: (lv_multiplicity_4_0= ruleMultiplicty )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1115:1: (lv_multiplicity_4_0= ruleMultiplicty )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1116:3: lv_multiplicity_4_0= ruleMultiplicty
            {
             
            	        newCompositeNode(grammarAccess.getAssociationAccess().getMultiplicityMultiplictyParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleMultiplicty_in_ruleAssociation2522);
            lv_multiplicity_4_0=ruleMultiplicty();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssociationRule());
            	        }
                   		set(
                   			current, 
                   			"multiplicity",
                    		lv_multiplicity_4_0, 
                    		"Multiplicty");
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
    // $ANTLR end "ruleAssociation"


    // $ANTLR start "entryRuleMultiplicty"
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1140:1: entryRuleMultiplicty returns [EObject current=null] : iv_ruleMultiplicty= ruleMultiplicty EOF ;
    public final EObject entryRuleMultiplicty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicty = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1141:2: (iv_ruleMultiplicty= ruleMultiplicty EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1142:2: iv_ruleMultiplicty= ruleMultiplicty EOF
            {
             newCompositeNode(grammarAccess.getMultiplictyRule()); 
            pushFollow(FOLLOW_ruleMultiplicty_in_entryRuleMultiplicty2558);
            iv_ruleMultiplicty=ruleMultiplicty();

            state._fsp--;

             current =iv_ruleMultiplicty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicty2568); 

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
    // $ANTLR end "entryRuleMultiplicty"


    // $ANTLR start "ruleMultiplicty"
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1149:1: ruleMultiplicty returns [EObject current=null] : ( ( () ( (lv_name_1_0= '1..N' ) ) ) | ( () ( (lv_name_3_0= '0..N' ) ) ) | ( () ( (lv_name_5_0= '1' ) ) ) | ( () ( (lv_name_7_0= '1..0' ) ) ) ) ;
    public final EObject ruleMultiplicty() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_name_3_0=null;
        Token lv_name_5_0=null;
        Token lv_name_7_0=null;

         enterRule(); 
            
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1152:28: ( ( ( () ( (lv_name_1_0= '1..N' ) ) ) | ( () ( (lv_name_3_0= '0..N' ) ) ) | ( () ( (lv_name_5_0= '1' ) ) ) | ( () ( (lv_name_7_0= '1..0' ) ) ) ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1153:1: ( ( () ( (lv_name_1_0= '1..N' ) ) ) | ( () ( (lv_name_3_0= '0..N' ) ) ) | ( () ( (lv_name_5_0= '1' ) ) ) | ( () ( (lv_name_7_0= '1..0' ) ) ) )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1153:1: ( ( () ( (lv_name_1_0= '1..N' ) ) ) | ( () ( (lv_name_3_0= '0..N' ) ) ) | ( () ( (lv_name_5_0= '1' ) ) ) | ( () ( (lv_name_7_0= '1..0' ) ) ) )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt18=1;
                }
                break;
            case 36:
                {
                alt18=2;
                }
                break;
            case 37:
                {
                alt18=3;
                }
                break;
            case 38:
                {
                alt18=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1153:2: ( () ( (lv_name_1_0= '1..N' ) ) )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1153:2: ( () ( (lv_name_1_0= '1..N' ) ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1153:3: () ( (lv_name_1_0= '1..N' ) )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1153:3: ()
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1154:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getMultiplictyAccess().getMultiplictyAction_0_0(),
                                current);
                        

                    }

                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1159:2: ( (lv_name_1_0= '1..N' ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1160:1: (lv_name_1_0= '1..N' )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1160:1: (lv_name_1_0= '1..N' )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1161:3: lv_name_1_0= '1..N'
                    {
                    lv_name_1_0=(Token)match(input,35,FOLLOW_35_in_ruleMultiplicty2621); 

                            newLeafNode(lv_name_1_0, grammarAccess.getMultiplictyAccess().getName1NKeyword_0_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiplictyRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_1_0, "1..N");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1175:6: ( () ( (lv_name_3_0= '0..N' ) ) )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1175:6: ( () ( (lv_name_3_0= '0..N' ) ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1175:7: () ( (lv_name_3_0= '0..N' ) )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1175:7: ()
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1176:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getMultiplictyAccess().getMultiplictyAction_1_0(),
                                current);
                        

                    }

                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1181:2: ( (lv_name_3_0= '0..N' ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1182:1: (lv_name_3_0= '0..N' )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1182:1: (lv_name_3_0= '0..N' )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1183:3: lv_name_3_0= '0..N'
                    {
                    lv_name_3_0=(Token)match(input,36,FOLLOW_36_in_ruleMultiplicty2669); 

                            newLeafNode(lv_name_3_0, grammarAccess.getMultiplictyAccess().getName0NKeyword_1_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiplictyRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_3_0, "0..N");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1197:6: ( () ( (lv_name_5_0= '1' ) ) )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1197:6: ( () ( (lv_name_5_0= '1' ) ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1197:7: () ( (lv_name_5_0= '1' ) )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1197:7: ()
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1198:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getMultiplictyAccess().getMultiplictyAction_2_0(),
                                current);
                        

                    }

                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1203:2: ( (lv_name_5_0= '1' ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1204:1: (lv_name_5_0= '1' )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1204:1: (lv_name_5_0= '1' )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1205:3: lv_name_5_0= '1'
                    {
                    lv_name_5_0=(Token)match(input,37,FOLLOW_37_in_ruleMultiplicty2717); 

                            newLeafNode(lv_name_5_0, grammarAccess.getMultiplictyAccess().getName1Keyword_2_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiplictyRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_5_0, "1");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1219:6: ( () ( (lv_name_7_0= '1..0' ) ) )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1219:6: ( () ( (lv_name_7_0= '1..0' ) ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1219:7: () ( (lv_name_7_0= '1..0' ) )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1219:7: ()
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1220:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getMultiplictyAccess().getMultiplictyAction_3_0(),
                                current);
                        

                    }

                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1225:2: ( (lv_name_7_0= '1..0' ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1226:1: (lv_name_7_0= '1..0' )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1226:1: (lv_name_7_0= '1..0' )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1227:3: lv_name_7_0= '1..0'
                    {
                    lv_name_7_0=(Token)match(input,38,FOLLOW_38_in_ruleMultiplicty2765); 

                            newLeafNode(lv_name_7_0, grammarAccess.getMultiplictyAccess().getName10Keyword_3_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiplictyRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_7_0, "1..0");
                    	    

                    }


                    }


                    }


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
    // $ANTLR end "ruleMultiplicty"


    // $ANTLR start "entryRuleField"
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1248:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1249:2: (iv_ruleField= ruleField EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1250:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField2815);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField2825); 

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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1257:1: ruleField returns [EObject current=null] : (otherlv_0= 'Field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_literal_3_0= ruleLiteral ) ) ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_literal_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1260:28: ( (otherlv_0= 'Field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_literal_3_0= ruleLiteral ) ) ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1261:1: (otherlv_0= 'Field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_literal_3_0= ruleLiteral ) ) )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1261:1: (otherlv_0= 'Field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_literal_3_0= ruleLiteral ) ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1261:3: otherlv_0= 'Field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_literal_3_0= ruleLiteral ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleField2862); 

                	newLeafNode(otherlv_0, grammarAccess.getFieldAccess().getFieldKeyword_0());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1265:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1266:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1266:1: (lv_name_1_0= RULE_ID )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1267:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleField2879); 

            			newLeafNode(lv_name_1_0, grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFieldRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleField2896); 

                	newLeafNode(otherlv_2, grammarAccess.getFieldAccess().getColonKeyword_2());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1287:1: ( (lv_literal_3_0= ruleLiteral ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1288:1: (lv_literal_3_0= ruleLiteral )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1288:1: (lv_literal_3_0= ruleLiteral )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1289:3: lv_literal_3_0= ruleLiteral
            {
             
            	        newCompositeNode(grammarAccess.getFieldAccess().getLiteralLiteralParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleLiteral_in_ruleField2917);
            lv_literal_3_0=ruleLiteral();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFieldRule());
            	        }
                   		set(
                   			current, 
                   			"literal",
                    		lv_literal_3_0, 
                    		"Literal");
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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleLiteral"
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1313:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1314:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1315:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral2953);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral2963); 

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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1322:1: ruleLiteral returns [EObject current=null] : ( ( () ( (lv_name_1_0= 'Decimal' ) ) ) | ( () ( (lv_name_3_0= 'Money' ) ) ) | ( () ( (lv_name_5_0= 'Text' ) ) ) | ( () ( (lv_name_7_0= 'Boolean' ) ) ) | ( () ( (lv_name_9_0= 'Int' ) ) ) | this_Enum_10= ruleEnum ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_name_3_0=null;
        Token lv_name_5_0=null;
        Token lv_name_7_0=null;
        Token lv_name_9_0=null;
        EObject this_Enum_10 = null;


         enterRule(); 
            
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1325:28: ( ( ( () ( (lv_name_1_0= 'Decimal' ) ) ) | ( () ( (lv_name_3_0= 'Money' ) ) ) | ( () ( (lv_name_5_0= 'Text' ) ) ) | ( () ( (lv_name_7_0= 'Boolean' ) ) ) | ( () ( (lv_name_9_0= 'Int' ) ) ) | this_Enum_10= ruleEnum ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1326:1: ( ( () ( (lv_name_1_0= 'Decimal' ) ) ) | ( () ( (lv_name_3_0= 'Money' ) ) ) | ( () ( (lv_name_5_0= 'Text' ) ) ) | ( () ( (lv_name_7_0= 'Boolean' ) ) ) | ( () ( (lv_name_9_0= 'Int' ) ) ) | this_Enum_10= ruleEnum )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1326:1: ( ( () ( (lv_name_1_0= 'Decimal' ) ) ) | ( () ( (lv_name_3_0= 'Money' ) ) ) | ( () ( (lv_name_5_0= 'Text' ) ) ) | ( () ( (lv_name_7_0= 'Boolean' ) ) ) | ( () ( (lv_name_9_0= 'Int' ) ) ) | this_Enum_10= ruleEnum )
            int alt19=6;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt19=1;
                }
                break;
            case 41:
                {
                alt19=2;
                }
                break;
            case 42:
                {
                alt19=3;
                }
                break;
            case 43:
                {
                alt19=4;
                }
                break;
            case 44:
                {
                alt19=5;
                }
                break;
            case 45:
                {
                alt19=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1326:2: ( () ( (lv_name_1_0= 'Decimal' ) ) )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1326:2: ( () ( (lv_name_1_0= 'Decimal' ) ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1326:3: () ( (lv_name_1_0= 'Decimal' ) )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1326:3: ()
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1327:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLiteralAccess().getLiteralAction_0_0(),
                                current);
                        

                    }

                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1332:2: ( (lv_name_1_0= 'Decimal' ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1333:1: (lv_name_1_0= 'Decimal' )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1333:1: (lv_name_1_0= 'Decimal' )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1334:3: lv_name_1_0= 'Decimal'
                    {
                    lv_name_1_0=(Token)match(input,40,FOLLOW_40_in_ruleLiteral3016); 

                            newLeafNode(lv_name_1_0, grammarAccess.getLiteralAccess().getNameDecimalKeyword_0_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_1_0, "Decimal");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1348:6: ( () ( (lv_name_3_0= 'Money' ) ) )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1348:6: ( () ( (lv_name_3_0= 'Money' ) ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1348:7: () ( (lv_name_3_0= 'Money' ) )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1348:7: ()
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1349:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLiteralAccess().getLiteralAction_1_0(),
                                current);
                        

                    }

                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1354:2: ( (lv_name_3_0= 'Money' ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1355:1: (lv_name_3_0= 'Money' )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1355:1: (lv_name_3_0= 'Money' )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1356:3: lv_name_3_0= 'Money'
                    {
                    lv_name_3_0=(Token)match(input,41,FOLLOW_41_in_ruleLiteral3064); 

                            newLeafNode(lv_name_3_0, grammarAccess.getLiteralAccess().getNameMoneyKeyword_1_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_3_0, "Money");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1370:6: ( () ( (lv_name_5_0= 'Text' ) ) )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1370:6: ( () ( (lv_name_5_0= 'Text' ) ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1370:7: () ( (lv_name_5_0= 'Text' ) )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1370:7: ()
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1371:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLiteralAccess().getLiteralAction_2_0(),
                                current);
                        

                    }

                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1376:2: ( (lv_name_5_0= 'Text' ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1377:1: (lv_name_5_0= 'Text' )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1377:1: (lv_name_5_0= 'Text' )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1378:3: lv_name_5_0= 'Text'
                    {
                    lv_name_5_0=(Token)match(input,42,FOLLOW_42_in_ruleLiteral3112); 

                            newLeafNode(lv_name_5_0, grammarAccess.getLiteralAccess().getNameTextKeyword_2_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_5_0, "Text");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1392:6: ( () ( (lv_name_7_0= 'Boolean' ) ) )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1392:6: ( () ( (lv_name_7_0= 'Boolean' ) ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1392:7: () ( (lv_name_7_0= 'Boolean' ) )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1392:7: ()
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1393:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLiteralAccess().getLiteralAction_3_0(),
                                current);
                        

                    }

                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1398:2: ( (lv_name_7_0= 'Boolean' ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1399:1: (lv_name_7_0= 'Boolean' )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1399:1: (lv_name_7_0= 'Boolean' )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1400:3: lv_name_7_0= 'Boolean'
                    {
                    lv_name_7_0=(Token)match(input,43,FOLLOW_43_in_ruleLiteral3160); 

                            newLeafNode(lv_name_7_0, grammarAccess.getLiteralAccess().getNameBooleanKeyword_3_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_7_0, "Boolean");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1414:6: ( () ( (lv_name_9_0= 'Int' ) ) )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1414:6: ( () ( (lv_name_9_0= 'Int' ) ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1414:7: () ( (lv_name_9_0= 'Int' ) )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1414:7: ()
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1415:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLiteralAccess().getLiteralAction_4_0(),
                                current);
                        

                    }

                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1420:2: ( (lv_name_9_0= 'Int' ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1421:1: (lv_name_9_0= 'Int' )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1421:1: (lv_name_9_0= 'Int' )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1422:3: lv_name_9_0= 'Int'
                    {
                    lv_name_9_0=(Token)match(input,44,FOLLOW_44_in_ruleLiteral3208); 

                            newLeafNode(lv_name_9_0, grammarAccess.getLiteralAccess().getNameIntKeyword_4_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_9_0, "Int");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1437:5: this_Enum_10= ruleEnum
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getEnumParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleEnum_in_ruleLiteral3250);
                    this_Enum_10=ruleEnum();

                    state._fsp--;

                     
                            current = this_Enum_10; 
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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleEnum"
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1453:1: entryRuleEnum returns [EObject current=null] : iv_ruleEnum= ruleEnum EOF ;
    public final EObject entryRuleEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnum = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1454:2: (iv_ruleEnum= ruleEnum EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1455:2: iv_ruleEnum= ruleEnum EOF
            {
             newCompositeNode(grammarAccess.getEnumRule()); 
            pushFollow(FOLLOW_ruleEnum_in_entryRuleEnum3285);
            iv_ruleEnum=ruleEnum();

            state._fsp--;

             current =iv_ruleEnum; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnum3295); 

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
    // $ANTLR end "entryRuleEnum"


    // $ANTLR start "ruleEnum"
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1462:1: ruleEnum returns [EObject current=null] : (otherlv_0= 'Enum' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1465:28: ( (otherlv_0= 'Enum' ( (otherlv_1= RULE_ID ) ) ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1466:1: (otherlv_0= 'Enum' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1466:1: (otherlv_0= 'Enum' ( (otherlv_1= RULE_ID ) ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1466:3: otherlv_0= 'Enum' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleEnum3332); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumAccess().getEnumKeyword_0());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1470:1: ( (otherlv_1= RULE_ID ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1471:1: (otherlv_1= RULE_ID )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1471:1: (otherlv_1= RULE_ID )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1472:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnum3352); 

            		newLeafNode(otherlv_1, grammarAccess.getEnumAccess().getTypeEnumDeclarationCrossReference_1_0()); 
            	

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
    // $ANTLR end "ruleEnum"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String DFA1_eotS =
        "\13\uffff";
    static final String DFA1_eofS =
        "\13\uffff";
    static final String DFA1_minS =
        "\1\13\1\uffff\1\4\4\uffff\1\13\1\4\2\13";
    static final String DFA1_maxS =
        "\1\37\1\uffff\1\4\4\uffff\1\37\1\4\2\37";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\1\3\1\4\1\5\4\uffff";
    static final String DFA1_specialS =
        "\13\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\5\11\uffff\1\6\1\2\1\uffff\1\3\3\uffff\1\1\2\uffff\1\4",
            "",
            "\1\7",
            "",
            "",
            "",
            "",
            "\1\5\12\uffff\1\2\1\11\1\3\4\uffff\1\10\1\uffff\1\4",
            "\1\12",
            "\1\5\12\uffff\1\2\1\uffff\1\3\6\uffff\1\4",
            "\1\5\12\uffff\1\2\1\11\1\3\4\uffff\1\10\1\uffff\1\4"
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "119:1: (this_EnumDeclaration_0= ruleEnumDeclaration | this_Diagram_1= ruleDiagram | this_Domain_2= ruleDomain | this_Flow_3= ruleFlow | this_BusinessRule_4= ruleBusinessRule )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_ruleModel130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDeclaration_in_ruleElement222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiagram_in_ruleElement249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomain_in_ruleElement276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFlow_in_ruleElement303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessRule_in_ruleElement330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFlow_in_entryRuleFlow365 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFlow375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleFlow421 = new BitSet(new long[]{0x0000000000400800L});
    public static final BitSet FOLLOW_11_in_ruleFlow434 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFlow451 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFlow468 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_ruleActivity_in_ruleFlow489 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleFlow502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_entryRuleActivity538 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivity548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleActivity585 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActivity602 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleActivity619 = new BitSet(new long[]{0x0000000000188000L});
    public static final BitSet FOLLOW_15_in_ruleActivity632 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleActivity644 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActivity664 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleActivity677 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActivity697 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_ruleActivity711 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleActivity726 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleActivity749 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleActivity763 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActivity780 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleActivity797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessRule_in_entryRuleBusinessRule833 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBusinessRule843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleBusinessRule880 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBusinessRule897 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleBusinessRule914 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleBusinessRule926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleImport1009 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFqnWithWildCard_in_ruleImport1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFqnWithWildCard_in_entryRuleFqnWithWildCard1067 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFqnWithWildCard1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleFqnWithWildCard1125 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleFqnWithWildCard1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiagram_in_entryRuleDiagram1186 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDiagram1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleDiagram1242 = new BitSet(new long[]{0x0000000001400800L});
    public static final BitSet FOLLOW_24_in_ruleDiagram1255 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDiagram1272 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDiagram1289 = new BitSet(new long[]{0x0000000006002000L});
    public static final BitSet FOLLOW_ruleInclude_in_ruleDiagram1310 = new BitSet(new long[]{0x0000000006002000L});
    public static final BitSet FOLLOW_13_in_ruleDiagram1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_entryRuleInclude1359 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInclude1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleInclude1414 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_26_in_ruleInclude1443 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleInclude1482 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleInclude1495 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInclude1507 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInclude1527 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_17_in_ruleInclude1540 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInclude1560 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_13_in_ruleInclude1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDeclaration_in_entryRuleEnumDeclaration1611 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumDeclaration1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleEnumDeclaration1658 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumDeclaration1675 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEnumDeclaration1692 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumDeclaration1709 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_17_in_ruleEnumDeclaration1727 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumDeclaration1738 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_13_in_ruleEnumDeclaration1751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN1788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN1839 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleFQN1858 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN1873 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity1920 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity1930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleEntity1967 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity1984 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEntity2001 = new BitSet(new long[]{0x0000008200002000L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleEntity2022 = new BitSet(new long[]{0x0000008200002000L});
    public static final BitSet FOLLOW_13_in_ruleEntity2035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomain_in_entryRuleDomain2071 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomain2081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleDomain2127 = new BitSet(new long[]{0x0000000080400800L});
    public static final BitSet FOLLOW_31_in_ruleDomain2140 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDomain2157 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleDomain2174 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDomain2191 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDomain2208 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleDomain2229 = new BitSet(new long[]{0x0000000040002000L});
    public static final BitSet FOLLOW_13_in_ruleDomain2242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty2278 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty2288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_ruleProperty2335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociation_in_ruleProperty2362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociation_in_entryRuleAssociation2397 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssociation2407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleAssociation2444 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssociation2461 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleAssociation2478 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleAssociation2501 = new BitSet(new long[]{0x0000007800000000L});
    public static final BitSet FOLLOW_ruleMultiplicty_in_ruleAssociation2522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicty_in_entryRuleMultiplicty2558 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicty2568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleMultiplicty2621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleMultiplicty2669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleMultiplicty2717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleMultiplicty2765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField2815 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField2825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleField2862 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleField2879 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleField2896 = new BitSet(new long[]{0x00003F0000000000L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleField2917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral2953 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral2963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleLiteral3016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleLiteral3064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleLiteral3112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleLiteral3160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleLiteral3208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_ruleLiteral3250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_entryRuleEnum3285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnum3295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleEnum3332 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnum3352 = new BitSet(new long[]{0x0000000000000002L});

}