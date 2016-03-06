package org.pklose.espl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Flow'", "'{'", "'}'", "'Activity'", "'Successors'", "'['", "','", "']'", "'Calls'", "'Description'", "'BusinessRule'", "'type'", "'Input'", "'Output'", "'prim\\u00E4r'", "'obligatorisch'", "'mehrfach'", "'SourceSystem'", "'SystemEntit\\u00E4t'", "'Format'", "'Import'", "'.*'", "'Diagram'", "'Include'", "'Exclude'", "'with'", "'Enumeration'", "'.'", "'Entity'", "'Domain'", "'Description: '", "'Relation'", "':'", "'Field'", "'Decimal'", "'Money'", "'Text'", "'Boolean'", "'Int'", "'Enum'", "'BizToBiz'", "'SrcToBiz'", "'BizToOut'", "'1..N'", "'0..N'", "'1'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:69:2: (iv_ruleModel= ruleModel EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:70:2: iv_ruleModel= ruleModel EOF
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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:77:1: ruleModel returns [EObject current=null] : ( (lv_elements_0_0= ruleElement ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:80:28: ( ( (lv_elements_0_0= ruleElement ) ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:81:1: ( (lv_elements_0_0= ruleElement ) )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:81:1: ( (lv_elements_0_0= ruleElement ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:82:1: (lv_elements_0_0= ruleElement )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:82:1: (lv_elements_0_0= ruleElement )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:83:3: lv_elements_0_0= ruleElement
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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:107:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:108:2: (iv_ruleElement= ruleElement EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:109:2: iv_ruleElement= ruleElement EOF
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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:116:1: ruleElement returns [EObject current=null] : (this_EnumDeclaration_0= ruleEnumDeclaration | this_Diagram_1= ruleDiagram | this_Domain_2= ruleDomain | this_Flow_3= ruleFlow | this_BusinessRule_4= ruleBusinessRule | this_System_5= ruleSystem ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_EnumDeclaration_0 = null;

        EObject this_Diagram_1 = null;

        EObject this_Domain_2 = null;

        EObject this_Flow_3 = null;

        EObject this_BusinessRule_4 = null;

        EObject this_System_5 = null;


         enterRule(); 
            
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:119:28: ( (this_EnumDeclaration_0= ruleEnumDeclaration | this_Diagram_1= ruleDiagram | this_Domain_2= ruleDomain | this_Flow_3= ruleFlow | this_BusinessRule_4= ruleBusinessRule | this_System_5= ruleSystem ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:120:1: (this_EnumDeclaration_0= ruleEnumDeclaration | this_Diagram_1= ruleDiagram | this_Domain_2= ruleDomain | this_Flow_3= ruleFlow | this_BusinessRule_4= ruleBusinessRule | this_System_5= ruleSystem )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:120:1: (this_EnumDeclaration_0= ruleEnumDeclaration | this_Diagram_1= ruleDiagram | this_Domain_2= ruleDomain | this_Flow_3= ruleFlow | this_BusinessRule_4= ruleBusinessRule | this_System_5= ruleSystem )
            int alt1=6;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:121:5: this_EnumDeclaration_0= ruleEnumDeclaration
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
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:131:5: this_Diagram_1= ruleDiagram
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
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:141:5: this_Domain_2= ruleDomain
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
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:151:5: this_Flow_3= ruleFlow
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
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:161:5: this_BusinessRule_4= ruleBusinessRule
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getBusinessRuleParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleBusinessRule_in_ruleElement330);
                    this_BusinessRule_4=ruleBusinessRule();

                    state._fsp--;

                     
                            current = this_BusinessRule_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:171:5: this_System_5= ruleSystem
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getSystemParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleSystem_in_ruleElement357);
                    this_System_5=ruleSystem();

                    state._fsp--;

                     
                            current = this_System_5; 
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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:187:1: entryRuleFlow returns [EObject current=null] : iv_ruleFlow= ruleFlow EOF ;
    public final EObject entryRuleFlow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlow = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:188:2: (iv_ruleFlow= ruleFlow EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:189:2: iv_ruleFlow= ruleFlow EOF
            {
             newCompositeNode(grammarAccess.getFlowRule()); 
            pushFollow(FOLLOW_ruleFlow_in_entryRuleFlow392);
            iv_ruleFlow=ruleFlow();

            state._fsp--;

             current =iv_ruleFlow; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFlow402); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:196:1: ruleFlow returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'Flow' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_activities_4_0= ruleActivity ) )* otherlv_5= '}' ) ;
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
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:199:28: ( ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'Flow' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_activities_4_0= ruleActivity ) )* otherlv_5= '}' ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:200:1: ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'Flow' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_activities_4_0= ruleActivity ) )* otherlv_5= '}' )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:200:1: ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'Flow' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_activities_4_0= ruleActivity ) )* otherlv_5= '}' )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:200:2: ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'Flow' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_activities_4_0= ruleActivity ) )* otherlv_5= '}'
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:200:2: ( (lv_imports_0_0= ruleImport ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==31) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:201:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:201:1: (lv_imports_0_0= ruleImport )
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:202:3: lv_imports_0_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFlowAccess().getImportsImportParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleFlow448);
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

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleFlow461); 

                	newLeafNode(otherlv_1, grammarAccess.getFlowAccess().getFlowKeyword_1());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:222:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:223:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:223:1: (lv_name_2_0= RULE_ID )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:224:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFlow478); 

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

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleFlow495); 

                	newLeafNode(otherlv_3, grammarAccess.getFlowAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:244:1: ( (lv_activities_4_0= ruleActivity ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:245:1: (lv_activities_4_0= ruleActivity )
            	    {
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:245:1: (lv_activities_4_0= ruleActivity )
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:246:3: lv_activities_4_0= ruleActivity
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFlowAccess().getActivitiesActivityParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActivity_in_ruleFlow516);
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

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleFlow529); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:274:1: entryRuleActivity returns [EObject current=null] : iv_ruleActivity= ruleActivity EOF ;
    public final EObject entryRuleActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivity = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:275:2: (iv_ruleActivity= ruleActivity EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:276:2: iv_ruleActivity= ruleActivity EOF
            {
             newCompositeNode(grammarAccess.getActivityRule()); 
            pushFollow(FOLLOW_ruleActivity_in_entryRuleActivity565);
            iv_ruleActivity=ruleActivity();

            state._fsp--;

             current =iv_ruleActivity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivity575); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:283:1: ruleActivity returns [EObject current=null] : (otherlv_0= 'Activity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Successors' otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' )? (otherlv_9= 'Calls' ( ( ruleFQN ) ) )? otherlv_11= 'Description' ( (lv_description_12_0= RULE_STRING ) ) otherlv_13= '}' ) ;
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
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:286:28: ( (otherlv_0= 'Activity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Successors' otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' )? (otherlv_9= 'Calls' ( ( ruleFQN ) ) )? otherlv_11= 'Description' ( (lv_description_12_0= RULE_STRING ) ) otherlv_13= '}' ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:287:1: (otherlv_0= 'Activity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Successors' otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' )? (otherlv_9= 'Calls' ( ( ruleFQN ) ) )? otherlv_11= 'Description' ( (lv_description_12_0= RULE_STRING ) ) otherlv_13= '}' )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:287:1: (otherlv_0= 'Activity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Successors' otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' )? (otherlv_9= 'Calls' ( ( ruleFQN ) ) )? otherlv_11= 'Description' ( (lv_description_12_0= RULE_STRING ) ) otherlv_13= '}' )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:287:3: otherlv_0= 'Activity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Successors' otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' )? (otherlv_9= 'Calls' ( ( ruleFQN ) ) )? otherlv_11= 'Description' ( (lv_description_12_0= RULE_STRING ) ) otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleActivity612); 

                	newLeafNode(otherlv_0, grammarAccess.getActivityAccess().getActivityKeyword_0());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:291:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:292:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:292:1: (lv_name_1_0= RULE_ID )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:293:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActivity629); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleActivity646); 

                	newLeafNode(otherlv_2, grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:313:1: (otherlv_3= 'Successors' otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:313:3: otherlv_3= 'Successors' otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']'
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleActivity659); 

                        	newLeafNode(otherlv_3, grammarAccess.getActivityAccess().getSuccessorsKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleActivity671); 

                        	newLeafNode(otherlv_4, grammarAccess.getActivityAccess().getLeftSquareBracketKeyword_3_1());
                        
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:321:1: ( (otherlv_5= RULE_ID ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:322:1: (otherlv_5= RULE_ID )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:322:1: (otherlv_5= RULE_ID )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:323:3: otherlv_5= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getActivityRule());
                    	        }
                            
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActivity691); 

                    		newLeafNode(otherlv_5, grammarAccess.getActivityAccess().getSucessorsActivityCrossReference_3_2_0()); 
                    	

                    }


                    }

                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:334:2: (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==17) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:334:4: otherlv_6= ',' ( (otherlv_7= RULE_ID ) )
                    	    {
                    	    otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleActivity704); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getActivityAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:338:1: ( (otherlv_7= RULE_ID ) )
                    	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:339:1: (otherlv_7= RULE_ID )
                    	    {
                    	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:339:1: (otherlv_7= RULE_ID )
                    	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:340:3: otherlv_7= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getActivityRule());
                    	    	        }
                    	            
                    	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActivity724); 

                    	    		newLeafNode(otherlv_7, grammarAccess.getActivityAccess().getSucessorsActivityCrossReference_3_3_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleActivity738); 

                        	newLeafNode(otherlv_8, grammarAccess.getActivityAccess().getRightSquareBracketKeyword_3_4());
                        

                    }
                    break;

            }

            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:355:3: (otherlv_9= 'Calls' ( ( ruleFQN ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:355:5: otherlv_9= 'Calls' ( ( ruleFQN ) )
                    {
                    otherlv_9=(Token)match(input,19,FOLLOW_19_in_ruleActivity753); 

                        	newLeafNode(otherlv_9, grammarAccess.getActivityAccess().getCallsKeyword_4_0());
                        
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:359:1: ( ( ruleFQN ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:360:1: ( ruleFQN )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:360:1: ( ruleFQN )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:361:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getActivityRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getActivityAccess().getBusinessRuleBusinessRuleCrossReference_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleActivity776);
                    ruleFQN();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,20,FOLLOW_20_in_ruleActivity790); 

                	newLeafNode(otherlv_11, grammarAccess.getActivityAccess().getDescriptionKeyword_5());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:378:1: ( (lv_description_12_0= RULE_STRING ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:379:1: (lv_description_12_0= RULE_STRING )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:379:1: (lv_description_12_0= RULE_STRING )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:380:3: lv_description_12_0= RULE_STRING
            {
            lv_description_12_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActivity807); 

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

            otherlv_13=(Token)match(input,13,FOLLOW_13_in_ruleActivity824); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:408:1: entryRuleBusinessRule returns [EObject current=null] : iv_ruleBusinessRule= ruleBusinessRule EOF ;
    public final EObject entryRuleBusinessRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBusinessRule = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:409:2: (iv_ruleBusinessRule= ruleBusinessRule EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:410:2: iv_ruleBusinessRule= ruleBusinessRule EOF
            {
             newCompositeNode(grammarAccess.getBusinessRuleRule()); 
            pushFollow(FOLLOW_ruleBusinessRule_in_entryRuleBusinessRule860);
            iv_ruleBusinessRule=ruleBusinessRule();

            state._fsp--;

             current =iv_ruleBusinessRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBusinessRule870); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:417:1: ruleBusinessRule returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'BusinessRule' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'type' ( (lv_typ_4_0= ruleBREType ) ) otherlv_5= '{' otherlv_6= 'Input' otherlv_7= '[' ( (lv_systemInputs_8_0= ruleBreEntityInput ) ) (otherlv_9= ',' ( (lv_systemInputs_10_0= ruleBreEntityInput ) ) )* otherlv_11= ']' otherlv_12= 'Output' otherlv_13= '[' ( (lv_output_14_0= ruleBreOutPutReference ) ) otherlv_15= ']' otherlv_16= '}' ) ;
    public final EObject ruleBusinessRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        EObject lv_imports_0_0 = null;

        Enumerator lv_typ_4_0 = null;

        EObject lv_systemInputs_8_0 = null;

        EObject lv_systemInputs_10_0 = null;

        EObject lv_output_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:420:28: ( ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'BusinessRule' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'type' ( (lv_typ_4_0= ruleBREType ) ) otherlv_5= '{' otherlv_6= 'Input' otherlv_7= '[' ( (lv_systemInputs_8_0= ruleBreEntityInput ) ) (otherlv_9= ',' ( (lv_systemInputs_10_0= ruleBreEntityInput ) ) )* otherlv_11= ']' otherlv_12= 'Output' otherlv_13= '[' ( (lv_output_14_0= ruleBreOutPutReference ) ) otherlv_15= ']' otherlv_16= '}' ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:421:1: ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'BusinessRule' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'type' ( (lv_typ_4_0= ruleBREType ) ) otherlv_5= '{' otherlv_6= 'Input' otherlv_7= '[' ( (lv_systemInputs_8_0= ruleBreEntityInput ) ) (otherlv_9= ',' ( (lv_systemInputs_10_0= ruleBreEntityInput ) ) )* otherlv_11= ']' otherlv_12= 'Output' otherlv_13= '[' ( (lv_output_14_0= ruleBreOutPutReference ) ) otherlv_15= ']' otherlv_16= '}' )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:421:1: ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'BusinessRule' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'type' ( (lv_typ_4_0= ruleBREType ) ) otherlv_5= '{' otherlv_6= 'Input' otherlv_7= '[' ( (lv_systemInputs_8_0= ruleBreEntityInput ) ) (otherlv_9= ',' ( (lv_systemInputs_10_0= ruleBreEntityInput ) ) )* otherlv_11= ']' otherlv_12= 'Output' otherlv_13= '[' ( (lv_output_14_0= ruleBreOutPutReference ) ) otherlv_15= ']' otherlv_16= '}' )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:421:2: ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'BusinessRule' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'type' ( (lv_typ_4_0= ruleBREType ) ) otherlv_5= '{' otherlv_6= 'Input' otherlv_7= '[' ( (lv_systemInputs_8_0= ruleBreEntityInput ) ) (otherlv_9= ',' ( (lv_systemInputs_10_0= ruleBreEntityInput ) ) )* otherlv_11= ']' otherlv_12= 'Output' otherlv_13= '[' ( (lv_output_14_0= ruleBreOutPutReference ) ) otherlv_15= ']' otherlv_16= '}'
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:421:2: ( (lv_imports_0_0= ruleImport ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==31) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:422:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:422:1: (lv_imports_0_0= ruleImport )
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:423:3: lv_imports_0_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBusinessRuleAccess().getImportsImportParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleBusinessRule916);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBusinessRuleRule());
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
            	    break loop7;
                }
            } while (true);

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleBusinessRule929); 

                	newLeafNode(otherlv_1, grammarAccess.getBusinessRuleAccess().getBusinessRuleKeyword_1());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:443:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:444:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:444:1: (lv_name_2_0= RULE_ID )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:445:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBusinessRule946); 

            			newLeafNode(lv_name_2_0, grammarAccess.getBusinessRuleAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBusinessRuleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleBusinessRule963); 

                	newLeafNode(otherlv_3, grammarAccess.getBusinessRuleAccess().getTypeKeyword_3());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:465:1: ( (lv_typ_4_0= ruleBREType ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:466:1: (lv_typ_4_0= ruleBREType )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:466:1: (lv_typ_4_0= ruleBREType )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:467:3: lv_typ_4_0= ruleBREType
            {
             
            	        newCompositeNode(grammarAccess.getBusinessRuleAccess().getTypBRETypeEnumRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleBREType_in_ruleBusinessRule984);
            lv_typ_4_0=ruleBREType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBusinessRuleRule());
            	        }
                   		set(
                   			current, 
                   			"typ",
                    		lv_typ_4_0, 
                    		"BREType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleBusinessRule996); 

                	newLeafNode(otherlv_5, grammarAccess.getBusinessRuleAccess().getLeftCurlyBracketKeyword_5());
                
            otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleBusinessRule1008); 

                	newLeafNode(otherlv_6, grammarAccess.getBusinessRuleAccess().getInputKeyword_6());
                
            otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleBusinessRule1020); 

                	newLeafNode(otherlv_7, grammarAccess.getBusinessRuleAccess().getLeftSquareBracketKeyword_7());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:495:1: ( (lv_systemInputs_8_0= ruleBreEntityInput ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:496:1: (lv_systemInputs_8_0= ruleBreEntityInput )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:496:1: (lv_systemInputs_8_0= ruleBreEntityInput )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:497:3: lv_systemInputs_8_0= ruleBreEntityInput
            {
             
            	        newCompositeNode(grammarAccess.getBusinessRuleAccess().getSystemInputsBreEntityInputParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleBreEntityInput_in_ruleBusinessRule1041);
            lv_systemInputs_8_0=ruleBreEntityInput();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBusinessRuleRule());
            	        }
                   		add(
                   			current, 
                   			"systemInputs",
                    		lv_systemInputs_8_0, 
                    		"BreEntityInput");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:513:2: (otherlv_9= ',' ( (lv_systemInputs_10_0= ruleBreEntityInput ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:513:4: otherlv_9= ',' ( (lv_systemInputs_10_0= ruleBreEntityInput ) )
            	    {
            	    otherlv_9=(Token)match(input,17,FOLLOW_17_in_ruleBusinessRule1054); 

            	        	newLeafNode(otherlv_9, grammarAccess.getBusinessRuleAccess().getCommaKeyword_9_0());
            	        
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:517:1: ( (lv_systemInputs_10_0= ruleBreEntityInput ) )
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:518:1: (lv_systemInputs_10_0= ruleBreEntityInput )
            	    {
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:518:1: (lv_systemInputs_10_0= ruleBreEntityInput )
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:519:3: lv_systemInputs_10_0= ruleBreEntityInput
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBusinessRuleAccess().getSystemInputsBreEntityInputParserRuleCall_9_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBreEntityInput_in_ruleBusinessRule1075);
            	    lv_systemInputs_10_0=ruleBreEntityInput();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBusinessRuleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"systemInputs",
            	            		lv_systemInputs_10_0, 
            	            		"BreEntityInput");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_11=(Token)match(input,18,FOLLOW_18_in_ruleBusinessRule1089); 

                	newLeafNode(otherlv_11, grammarAccess.getBusinessRuleAccess().getRightSquareBracketKeyword_10());
                
            otherlv_12=(Token)match(input,24,FOLLOW_24_in_ruleBusinessRule1101); 

                	newLeafNode(otherlv_12, grammarAccess.getBusinessRuleAccess().getOutputKeyword_11());
                
            otherlv_13=(Token)match(input,16,FOLLOW_16_in_ruleBusinessRule1113); 

                	newLeafNode(otherlv_13, grammarAccess.getBusinessRuleAccess().getLeftSquareBracketKeyword_12());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:547:1: ( (lv_output_14_0= ruleBreOutPutReference ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:548:1: (lv_output_14_0= ruleBreOutPutReference )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:548:1: (lv_output_14_0= ruleBreOutPutReference )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:549:3: lv_output_14_0= ruleBreOutPutReference
            {
             
            	        newCompositeNode(grammarAccess.getBusinessRuleAccess().getOutputBreOutPutReferenceParserRuleCall_13_0()); 
            	    
            pushFollow(FOLLOW_ruleBreOutPutReference_in_ruleBusinessRule1134);
            lv_output_14_0=ruleBreOutPutReference();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBusinessRuleRule());
            	        }
                   		set(
                   			current, 
                   			"output",
                    		lv_output_14_0, 
                    		"BreOutPutReference");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_15=(Token)match(input,18,FOLLOW_18_in_ruleBusinessRule1146); 

                	newLeafNode(otherlv_15, grammarAccess.getBusinessRuleAccess().getRightSquareBracketKeyword_14());
                
            otherlv_16=(Token)match(input,13,FOLLOW_13_in_ruleBusinessRule1158); 

                	newLeafNode(otherlv_16, grammarAccess.getBusinessRuleAccess().getRightCurlyBracketKeyword_15());
                

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


    // $ANTLR start "entryRuleBreOutPutReference"
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:583:1: entryRuleBreOutPutReference returns [EObject current=null] : iv_ruleBreOutPutReference= ruleBreOutPutReference EOF ;
    public final EObject entryRuleBreOutPutReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBreOutPutReference = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:584:2: (iv_ruleBreOutPutReference= ruleBreOutPutReference EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:585:2: iv_ruleBreOutPutReference= ruleBreOutPutReference EOF
            {
             newCompositeNode(grammarAccess.getBreOutPutReferenceRule()); 
            pushFollow(FOLLOW_ruleBreOutPutReference_in_entryRuleBreOutPutReference1196);
            iv_ruleBreOutPutReference=ruleBreOutPutReference();

            state._fsp--;

             current =iv_ruleBreOutPutReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBreOutPutReference1206); 

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
    // $ANTLR end "entryRuleBreOutPutReference"


    // $ANTLR start "ruleBreOutPutReference"
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:592:1: ruleBreOutPutReference returns [EObject current=null] : ( ( ruleFQN ) ) ;
    public final EObject ruleBreOutPutReference() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:595:28: ( ( ( ruleFQN ) ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:596:1: ( ( ruleFQN ) )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:596:1: ( ( ruleFQN ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:597:1: ( ruleFQN )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:597:1: ( ruleFQN )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:598:3: ruleFQN
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getBreOutPutReferenceRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getBreOutPutReferenceAccess().getOutputModelElementCrossReference_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleBreOutPutReference1253);
            ruleFQN();

            state._fsp--;

             
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
    // $ANTLR end "ruleBreOutPutReference"


    // $ANTLR start "entryRuleBreEntityInput"
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:619:1: entryRuleBreEntityInput returns [EObject current=null] : iv_ruleBreEntityInput= ruleBreEntityInput EOF ;
    public final EObject entryRuleBreEntityInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBreEntityInput = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:620:2: (iv_ruleBreEntityInput= ruleBreEntityInput EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:621:2: iv_ruleBreEntityInput= ruleBreEntityInput EOF
            {
             newCompositeNode(grammarAccess.getBreEntityInputRule()); 
            pushFollow(FOLLOW_ruleBreEntityInput_in_entryRuleBreEntityInput1288);
            iv_ruleBreEntityInput=ruleBreEntityInput();

            state._fsp--;

             current =iv_ruleBreEntityInput; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBreEntityInput1298); 

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
    // $ANTLR end "entryRuleBreEntityInput"


    // $ANTLR start "ruleBreEntityInput"
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:628:1: ruleBreEntityInput returns [EObject current=null] : ( ( ( ruleFQN ) ) ( (lv_configuration_1_0= ruleEntityConfiguration ) ) ) ;
    public final EObject ruleBreEntityInput() throws RecognitionException {
        EObject current = null;

        EObject lv_configuration_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:631:28: ( ( ( ( ruleFQN ) ) ( (lv_configuration_1_0= ruleEntityConfiguration ) ) ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:632:1: ( ( ( ruleFQN ) ) ( (lv_configuration_1_0= ruleEntityConfiguration ) ) )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:632:1: ( ( ( ruleFQN ) ) ( (lv_configuration_1_0= ruleEntityConfiguration ) ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:632:2: ( ( ruleFQN ) ) ( (lv_configuration_1_0= ruleEntityConfiguration ) )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:632:2: ( ( ruleFQN ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:633:1: ( ruleFQN )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:633:1: ( ruleFQN )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:634:3: ruleFQN
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getBreEntityInputRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getBreEntityInputAccess().getInputElementModelElementCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleBreEntityInput1346);
            ruleFQN();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:647:2: ( (lv_configuration_1_0= ruleEntityConfiguration ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:648:1: (lv_configuration_1_0= ruleEntityConfiguration )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:648:1: (lv_configuration_1_0= ruleEntityConfiguration )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:649:3: lv_configuration_1_0= ruleEntityConfiguration
            {
             
            	        newCompositeNode(grammarAccess.getBreEntityInputAccess().getConfigurationEntityConfigurationParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEntityConfiguration_in_ruleBreEntityInput1367);
            lv_configuration_1_0=ruleEntityConfiguration();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBreEntityInputRule());
            	        }
                   		add(
                   			current, 
                   			"configuration",
                    		lv_configuration_1_0, 
                    		"EntityConfiguration");
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
    // $ANTLR end "ruleBreEntityInput"


    // $ANTLR start "entryRuleEntityConfiguration"
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:673:1: entryRuleEntityConfiguration returns [EObject current=null] : iv_ruleEntityConfiguration= ruleEntityConfiguration EOF ;
    public final EObject entryRuleEntityConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityConfiguration = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:674:2: (iv_ruleEntityConfiguration= ruleEntityConfiguration EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:675:2: iv_ruleEntityConfiguration= ruleEntityConfiguration EOF
            {
             newCompositeNode(grammarAccess.getEntityConfigurationRule()); 
            pushFollow(FOLLOW_ruleEntityConfiguration_in_entryRuleEntityConfiguration1403);
            iv_ruleEntityConfiguration=ruleEntityConfiguration();

            state._fsp--;

             current =iv_ruleEntityConfiguration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityConfiguration1413); 

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
    // $ANTLR end "entryRuleEntityConfiguration"


    // $ANTLR start "ruleEntityConfiguration"
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:682:1: ruleEntityConfiguration returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= '{' ( (lv_primary_2_0= 'prim\\u00E4r' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_obligatory_3_0= 'obligatorisch' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_multiple_4_0= 'mehrfach' ) )? otherlv_5= '}' ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleEntityConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_primary_2_0=null;
        Token lv_obligatory_3_0=null;
        Token lv_multiple_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:685:28: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= '{' ( (lv_primary_2_0= 'prim\\u00E4r' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_obligatory_3_0= 'obligatorisch' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_multiple_4_0= 'mehrfach' ) )? otherlv_5= '}' ) ) ) ) )+ {...}?) ) ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:686:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= '{' ( (lv_primary_2_0= 'prim\\u00E4r' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_obligatory_3_0= 'obligatorisch' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_multiple_4_0= 'mehrfach' ) )? otherlv_5= '}' ) ) ) ) )+ {...}?) ) )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:686:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= '{' ( (lv_primary_2_0= 'prim\\u00E4r' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_obligatory_3_0= 'obligatorisch' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_multiple_4_0= 'mehrfach' ) )? otherlv_5= '}' ) ) ) ) )+ {...}?) ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:688:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= '{' ( (lv_primary_2_0= 'prim\\u00E4r' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_obligatory_3_0= 'obligatorisch' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_multiple_4_0= 'mehrfach' ) )? otherlv_5= '}' ) ) ) ) )+ {...}?) )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:688:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= '{' ( (lv_primary_2_0= 'prim\\u00E4r' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_obligatory_3_0= 'obligatorisch' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_multiple_4_0= 'mehrfach' ) )? otherlv_5= '}' ) ) ) ) )+ {...}?) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:689:2: ( ( ({...}? => ( ({...}? => (otherlv_1= '{' ( (lv_primary_2_0= 'prim\\u00E4r' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_obligatory_3_0= 'obligatorisch' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_multiple_4_0= 'mehrfach' ) )? otherlv_5= '}' ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getEntityConfigurationAccess().getUnorderedGroup());
            	
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:692:2: ( ( ({...}? => ( ({...}? => (otherlv_1= '{' ( (lv_primary_2_0= 'prim\\u00E4r' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_obligatory_3_0= 'obligatorisch' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_multiple_4_0= 'mehrfach' ) )? otherlv_5= '}' ) ) ) ) )+ {...}?)
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:693:3: ( ({...}? => ( ({...}? => (otherlv_1= '{' ( (lv_primary_2_0= 'prim\\u00E4r' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_obligatory_3_0= 'obligatorisch' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_multiple_4_0= 'mehrfach' ) )? otherlv_5= '}' ) ) ) ) )+ {...}?
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:693:3: ( ({...}? => ( ({...}? => (otherlv_1= '{' ( (lv_primary_2_0= 'prim\\u00E4r' ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_obligatory_3_0= 'obligatorisch' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_multiple_4_0= 'mehrfach' ) )? otherlv_5= '}' ) ) ) ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=4;
                int LA11_0 = input.LA(1);

                if ( LA11_0 ==12 && getUnorderedGroupHelper().canSelect(grammarAccess.getEntityConfigurationAccess().getUnorderedGroup(), 0) ) {
                    alt11=1;
                }
                else if ( LA11_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getEntityConfigurationAccess().getUnorderedGroup(), 1) ) {
                    alt11=2;
                }
                else if ( (LA11_0==13||LA11_0==27) && getUnorderedGroupHelper().canSelect(grammarAccess.getEntityConfigurationAccess().getUnorderedGroup(), 2) ) {
                    alt11=3;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:695:4: ({...}? => ( ({...}? => (otherlv_1= '{' ( (lv_primary_2_0= 'prim\\u00E4r' ) )? ) ) ) )
            	    {
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:695:4: ({...}? => ( ({...}? => (otherlv_1= '{' ( (lv_primary_2_0= 'prim\\u00E4r' ) )? ) ) ) )
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:696:5: {...}? => ( ({...}? => (otherlv_1= '{' ( (lv_primary_2_0= 'prim\\u00E4r' ) )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEntityConfigurationAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEntityConfiguration", "getUnorderedGroupHelper().canSelect(grammarAccess.getEntityConfigurationAccess().getUnorderedGroup(), 0)");
            	    }
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:696:114: ( ({...}? => (otherlv_1= '{' ( (lv_primary_2_0= 'prim\\u00E4r' ) )? ) ) )
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:697:6: ({...}? => (otherlv_1= '{' ( (lv_primary_2_0= 'prim\\u00E4r' ) )? ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEntityConfigurationAccess().getUnorderedGroup(), 0);
            	    	 				
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:700:6: ({...}? => (otherlv_1= '{' ( (lv_primary_2_0= 'prim\\u00E4r' ) )? ) )
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:700:7: {...}? => (otherlv_1= '{' ( (lv_primary_2_0= 'prim\\u00E4r' ) )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEntityConfiguration", "true");
            	    }
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:700:16: (otherlv_1= '{' ( (lv_primary_2_0= 'prim\\u00E4r' ) )? )
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:700:18: otherlv_1= '{' ( (lv_primary_2_0= 'prim\\u00E4r' ) )?
            	    {
            	    otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleEntityConfiguration1495); 

            	        	newLeafNode(otherlv_1, grammarAccess.getEntityConfigurationAccess().getLeftCurlyBracketKeyword_0_0());
            	        
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:704:1: ( (lv_primary_2_0= 'prim\\u00E4r' ) )?
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==25) ) {
            	        alt9=1;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:705:1: (lv_primary_2_0= 'prim\\u00E4r' )
            	            {
            	            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:705:1: (lv_primary_2_0= 'prim\\u00E4r' )
            	            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:706:3: lv_primary_2_0= 'prim\\u00E4r'
            	            {
            	            lv_primary_2_0=(Token)match(input,25,FOLLOW_25_in_ruleEntityConfiguration1513); 

            	                    newLeafNode(lv_primary_2_0, grammarAccess.getEntityConfigurationAccess().getPrimaryPrimärKeyword_0_1_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getEntityConfigurationRule());
            	            	        }
            	                   		setWithLastConsumed(current, "primary", true, "prim\u00E4r");
            	            	    

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEntityConfigurationAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:726:4: ({...}? => ( ({...}? => ( (lv_obligatory_3_0= 'obligatorisch' ) ) ) ) )
            	    {
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:726:4: ({...}? => ( ({...}? => ( (lv_obligatory_3_0= 'obligatorisch' ) ) ) ) )
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:727:5: {...}? => ( ({...}? => ( (lv_obligatory_3_0= 'obligatorisch' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEntityConfigurationAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEntityConfiguration", "getUnorderedGroupHelper().canSelect(grammarAccess.getEntityConfigurationAccess().getUnorderedGroup(), 1)");
            	    }
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:727:114: ( ({...}? => ( (lv_obligatory_3_0= 'obligatorisch' ) ) ) )
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:728:6: ({...}? => ( (lv_obligatory_3_0= 'obligatorisch' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEntityConfigurationAccess().getUnorderedGroup(), 1);
            	    	 				
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:731:6: ({...}? => ( (lv_obligatory_3_0= 'obligatorisch' ) ) )
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:731:7: {...}? => ( (lv_obligatory_3_0= 'obligatorisch' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEntityConfiguration", "true");
            	    }
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:731:16: ( (lv_obligatory_3_0= 'obligatorisch' ) )
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:732:1: (lv_obligatory_3_0= 'obligatorisch' )
            	    {
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:732:1: (lv_obligatory_3_0= 'obligatorisch' )
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:733:3: lv_obligatory_3_0= 'obligatorisch'
            	    {
            	    lv_obligatory_3_0=(Token)match(input,26,FOLLOW_26_in_ruleEntityConfiguration1600); 

            	            newLeafNode(lv_obligatory_3_0, grammarAccess.getEntityConfigurationAccess().getObligatoryObligatorischKeyword_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getEntityConfigurationRule());
            	    	        }
            	           		setWithLastConsumed(current, "obligatory", true, "obligatorisch");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEntityConfigurationAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:753:4: ({...}? => ( ({...}? => ( ( (lv_multiple_4_0= 'mehrfach' ) )? otherlv_5= '}' ) ) ) )
            	    {
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:753:4: ({...}? => ( ({...}? => ( ( (lv_multiple_4_0= 'mehrfach' ) )? otherlv_5= '}' ) ) ) )
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:754:5: {...}? => ( ({...}? => ( ( (lv_multiple_4_0= 'mehrfach' ) )? otherlv_5= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEntityConfigurationAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEntityConfiguration", "getUnorderedGroupHelper().canSelect(grammarAccess.getEntityConfigurationAccess().getUnorderedGroup(), 2)");
            	    }
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:754:114: ( ({...}? => ( ( (lv_multiple_4_0= 'mehrfach' ) )? otherlv_5= '}' ) ) )
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:755:6: ({...}? => ( ( (lv_multiple_4_0= 'mehrfach' ) )? otherlv_5= '}' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEntityConfigurationAccess().getUnorderedGroup(), 2);
            	    	 				
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:758:6: ({...}? => ( ( (lv_multiple_4_0= 'mehrfach' ) )? otherlv_5= '}' ) )
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:758:7: {...}? => ( ( (lv_multiple_4_0= 'mehrfach' ) )? otherlv_5= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEntityConfiguration", "true");
            	    }
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:758:16: ( ( (lv_multiple_4_0= 'mehrfach' ) )? otherlv_5= '}' )
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:758:17: ( (lv_multiple_4_0= 'mehrfach' ) )? otherlv_5= '}'
            	    {
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:758:17: ( (lv_multiple_4_0= 'mehrfach' ) )?
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==27) ) {
            	        alt10=1;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:759:1: (lv_multiple_4_0= 'mehrfach' )
            	            {
            	            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:759:1: (lv_multiple_4_0= 'mehrfach' )
            	            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:760:3: lv_multiple_4_0= 'mehrfach'
            	            {
            	            lv_multiple_4_0=(Token)match(input,27,FOLLOW_27_in_ruleEntityConfiguration1686); 

            	                    newLeafNode(lv_multiple_4_0, grammarAccess.getEntityConfigurationAccess().getMultipleMehrfachKeyword_2_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getEntityConfigurationRule());
            	            	        }
            	                   		setWithLastConsumed(current, "multiple", true, "mehrfach");
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleEntityConfiguration1712); 

            	        	newLeafNode(otherlv_5, grammarAccess.getEntityConfigurationAccess().getRightCurlyBracketKeyword_2_1());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEntityConfigurationAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getEntityConfigurationAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleEntityConfiguration", "getUnorderedGroupHelper().canLeave(grammarAccess.getEntityConfigurationAccess().getUnorderedGroup())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getEntityConfigurationAccess().getUnorderedGroup());
            	

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
    // $ANTLR end "ruleEntityConfiguration"


    // $ANTLR start "entryRuleSystem"
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:800:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:801:2: (iv_ruleSystem= ruleSystem EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:802:2: iv_ruleSystem= ruleSystem EOF
            {
             newCompositeNode(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_ruleSystem_in_entryRuleSystem1794);
            iv_ruleSystem=ruleSystem();

            state._fsp--;

             current =iv_ruleSystem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSystem1804); 

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
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:809:1: ruleSystem returns [EObject current=null] : (otherlv_0= 'SourceSystem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_srcEntities_3_0= ruleSystemEntity ) ) otherlv_4= '}' ) ;
    public final EObject ruleSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_srcEntities_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:812:28: ( (otherlv_0= 'SourceSystem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_srcEntities_3_0= ruleSystemEntity ) ) otherlv_4= '}' ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:813:1: (otherlv_0= 'SourceSystem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_srcEntities_3_0= ruleSystemEntity ) ) otherlv_4= '}' )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:813:1: (otherlv_0= 'SourceSystem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_srcEntities_3_0= ruleSystemEntity ) ) otherlv_4= '}' )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:813:3: otherlv_0= 'SourceSystem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_srcEntities_3_0= ruleSystemEntity ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleSystem1841); 

                	newLeafNode(otherlv_0, grammarAccess.getSystemAccess().getSourceSystemKeyword_0());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:817:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:818:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:818:1: (lv_name_1_0= RULE_ID )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:819:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSystem1858); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSystemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleSystem1875); 

                	newLeafNode(otherlv_2, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:839:1: ( (lv_srcEntities_3_0= ruleSystemEntity ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:840:1: (lv_srcEntities_3_0= ruleSystemEntity )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:840:1: (lv_srcEntities_3_0= ruleSystemEntity )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:841:3: lv_srcEntities_3_0= ruleSystemEntity
            {
             
            	        newCompositeNode(grammarAccess.getSystemAccess().getSrcEntitiesSystemEntityParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSystemEntity_in_ruleSystem1896);
            lv_srcEntities_3_0=ruleSystemEntity();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSystemRule());
            	        }
                   		add(
                   			current, 
                   			"srcEntities",
                    		lv_srcEntities_3_0, 
                    		"SystemEntity");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleSystem1908); 

                	newLeafNode(otherlv_4, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleSystemEntity"
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:869:1: entryRuleSystemEntity returns [EObject current=null] : iv_ruleSystemEntity= ruleSystemEntity EOF ;
    public final EObject entryRuleSystemEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemEntity = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:870:2: (iv_ruleSystemEntity= ruleSystemEntity EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:871:2: iv_ruleSystemEntity= ruleSystemEntity EOF
            {
             newCompositeNode(grammarAccess.getSystemEntityRule()); 
            pushFollow(FOLLOW_ruleSystemEntity_in_entryRuleSystemEntity1944);
            iv_ruleSystemEntity=ruleSystemEntity();

            state._fsp--;

             current =iv_ruleSystemEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSystemEntity1954); 

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
    // $ANTLR end "entryRuleSystemEntity"


    // $ANTLR start "ruleSystemEntity"
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:878:1: ruleSystemEntity returns [EObject current=null] : (otherlv_0= 'SystemEntit\\u00E4t' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Format' ( (lv_format_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleSystemEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_format_3_0=null;

         enterRule(); 
            
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:881:28: ( (otherlv_0= 'SystemEntit\\u00E4t' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Format' ( (lv_format_3_0= RULE_STRING ) ) ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:882:1: (otherlv_0= 'SystemEntit\\u00E4t' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Format' ( (lv_format_3_0= RULE_STRING ) ) )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:882:1: (otherlv_0= 'SystemEntit\\u00E4t' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Format' ( (lv_format_3_0= RULE_STRING ) ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:882:3: otherlv_0= 'SystemEntit\\u00E4t' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Format' ( (lv_format_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleSystemEntity1991); 

                	newLeafNode(otherlv_0, grammarAccess.getSystemEntityAccess().getSystemEntitätKeyword_0());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:886:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:887:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:887:1: (lv_name_1_0= RULE_ID )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:888:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSystemEntity2008); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSystemEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSystemEntityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleSystemEntity2025); 

                	newLeafNode(otherlv_2, grammarAccess.getSystemEntityAccess().getFormatKeyword_2());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:908:1: ( (lv_format_3_0= RULE_STRING ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:909:1: (lv_format_3_0= RULE_STRING )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:909:1: (lv_format_3_0= RULE_STRING )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:910:3: lv_format_3_0= RULE_STRING
            {
            lv_format_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSystemEntity2042); 

            			newLeafNode(lv_format_3_0, grammarAccess.getSystemEntityAccess().getFormatSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSystemEntityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"format",
                    		lv_format_3_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleSystemEntity"


    // $ANTLR start "entryRuleImport"
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:934:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:935:2: (iv_ruleImport= ruleImport EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:936:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport2083);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport2093); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:943:1: ruleImport returns [EObject current=null] : (otherlv_0= 'Import' ( (lv_importedNamespace_1_0= ruleFqnWithWildCard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:946:28: ( (otherlv_0= 'Import' ( (lv_importedNamespace_1_0= ruleFqnWithWildCard ) ) ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:947:1: (otherlv_0= 'Import' ( (lv_importedNamespace_1_0= ruleFqnWithWildCard ) ) )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:947:1: (otherlv_0= 'Import' ( (lv_importedNamespace_1_0= ruleFqnWithWildCard ) ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:947:3: otherlv_0= 'Import' ( (lv_importedNamespace_1_0= ruleFqnWithWildCard ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleImport2130); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:951:1: ( (lv_importedNamespace_1_0= ruleFqnWithWildCard ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:952:1: (lv_importedNamespace_1_0= ruleFqnWithWildCard )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:952:1: (lv_importedNamespace_1_0= ruleFqnWithWildCard )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:953:3: lv_importedNamespace_1_0= ruleFqnWithWildCard
            {
             
            	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceFqnWithWildCardParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFqnWithWildCard_in_ruleImport2151);
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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:977:1: entryRuleFqnWithWildCard returns [String current=null] : iv_ruleFqnWithWildCard= ruleFqnWithWildCard EOF ;
    public final String entryRuleFqnWithWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFqnWithWildCard = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:978:2: (iv_ruleFqnWithWildCard= ruleFqnWithWildCard EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:979:2: iv_ruleFqnWithWildCard= ruleFqnWithWildCard EOF
            {
             newCompositeNode(grammarAccess.getFqnWithWildCardRule()); 
            pushFollow(FOLLOW_ruleFqnWithWildCard_in_entryRuleFqnWithWildCard2188);
            iv_ruleFqnWithWildCard=ruleFqnWithWildCard();

            state._fsp--;

             current =iv_ruleFqnWithWildCard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFqnWithWildCard2199); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:986:1: ruleFqnWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FQN_0= ruleFQN (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleFqnWithWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FQN_0 = null;


         enterRule(); 
            
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:989:28: ( (this_FQN_0= ruleFQN (kw= '.*' )? ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:990:1: (this_FQN_0= ruleFQN (kw= '.*' )? )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:990:1: (this_FQN_0= ruleFQN (kw= '.*' )? )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:991:5: this_FQN_0= ruleFQN (kw= '.*' )?
            {
             
                    newCompositeNode(grammarAccess.getFqnWithWildCardAccess().getFQNParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleFQN_in_ruleFqnWithWildCard2246);
            this_FQN_0=ruleFQN();

            state._fsp--;


            		current.merge(this_FQN_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1001:1: (kw= '.*' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==32) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1002:2: kw= '.*'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleFqnWithWildCard2265); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1015:1: entryRuleDiagram returns [EObject current=null] : iv_ruleDiagram= ruleDiagram EOF ;
    public final EObject entryRuleDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiagram = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1016:2: (iv_ruleDiagram= ruleDiagram EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1017:2: iv_ruleDiagram= ruleDiagram EOF
            {
             newCompositeNode(grammarAccess.getDiagramRule()); 
            pushFollow(FOLLOW_ruleDiagram_in_entryRuleDiagram2307);
            iv_ruleDiagram=ruleDiagram();

            state._fsp--;

             current =iv_ruleDiagram; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDiagram2317); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1024:1: ruleDiagram returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'Diagram' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_includes_4_0= ruleInclude ) )* otherlv_5= '}' ) ;
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
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1027:28: ( ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'Diagram' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_includes_4_0= ruleInclude ) )* otherlv_5= '}' ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1028:1: ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'Diagram' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_includes_4_0= ruleInclude ) )* otherlv_5= '}' )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1028:1: ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'Diagram' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_includes_4_0= ruleInclude ) )* otherlv_5= '}' )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1028:2: ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'Diagram' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_includes_4_0= ruleInclude ) )* otherlv_5= '}'
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1028:2: ( (lv_imports_0_0= ruleImport ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==31) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1029:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1029:1: (lv_imports_0_0= ruleImport )
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1030:3: lv_imports_0_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDiagramAccess().getImportsImportParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleDiagram2363);
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
            	    break loop13;
                }
            } while (true);

            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleDiagram2376); 

                	newLeafNode(otherlv_1, grammarAccess.getDiagramAccess().getDiagramKeyword_1());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1050:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1051:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1051:1: (lv_name_2_0= RULE_ID )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1052:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDiagram2393); 

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

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleDiagram2410); 

                	newLeafNode(otherlv_3, grammarAccess.getDiagramAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1072:1: ( (lv_includes_4_0= ruleInclude ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=34 && LA14_0<=35)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1073:1: (lv_includes_4_0= ruleInclude )
            	    {
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1073:1: (lv_includes_4_0= ruleInclude )
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1074:3: lv_includes_4_0= ruleInclude
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDiagramAccess().getIncludesIncludeParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInclude_in_ruleDiagram2431);
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
            	    break loop14;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleDiagram2444); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1102:1: entryRuleInclude returns [EObject current=null] : iv_ruleInclude= ruleInclude EOF ;
    public final EObject entryRuleInclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInclude = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1103:2: (iv_ruleInclude= ruleInclude EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1104:2: iv_ruleInclude= ruleInclude EOF
            {
             newCompositeNode(grammarAccess.getIncludeRule()); 
            pushFollow(FOLLOW_ruleInclude_in_entryRuleInclude2480);
            iv_ruleInclude=ruleInclude();

            state._fsp--;

             current =iv_ruleInclude; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInclude2490); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1111:1: ruleInclude returns [EObject current=null] : ( ( ( (lv_include_0_1= 'Include' | lv_include_0_2= 'Exclude' ) ) ) ( ( ruleFQN ) ) (otherlv_2= 'with' otherlv_3= '{' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' ) ) ;
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
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1114:28: ( ( ( ( (lv_include_0_1= 'Include' | lv_include_0_2= 'Exclude' ) ) ) ( ( ruleFQN ) ) (otherlv_2= 'with' otherlv_3= '{' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' ) ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1115:1: ( ( ( (lv_include_0_1= 'Include' | lv_include_0_2= 'Exclude' ) ) ) ( ( ruleFQN ) ) (otherlv_2= 'with' otherlv_3= '{' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' ) )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1115:1: ( ( ( (lv_include_0_1= 'Include' | lv_include_0_2= 'Exclude' ) ) ) ( ( ruleFQN ) ) (otherlv_2= 'with' otherlv_3= '{' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1115:2: ( ( (lv_include_0_1= 'Include' | lv_include_0_2= 'Exclude' ) ) ) ( ( ruleFQN ) ) (otherlv_2= 'with' otherlv_3= '{' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1115:2: ( ( (lv_include_0_1= 'Include' | lv_include_0_2= 'Exclude' ) ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1116:1: ( (lv_include_0_1= 'Include' | lv_include_0_2= 'Exclude' ) )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1116:1: ( (lv_include_0_1= 'Include' | lv_include_0_2= 'Exclude' ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1117:1: (lv_include_0_1= 'Include' | lv_include_0_2= 'Exclude' )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1117:1: (lv_include_0_1= 'Include' | lv_include_0_2= 'Exclude' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==34) ) {
                alt15=1;
            }
            else if ( (LA15_0==35) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1118:3: lv_include_0_1= 'Include'
                    {
                    lv_include_0_1=(Token)match(input,34,FOLLOW_34_in_ruleInclude2535); 

                            newLeafNode(lv_include_0_1, grammarAccess.getIncludeAccess().getIncludeIncludeKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIncludeRule());
                    	        }
                           		setWithLastConsumed(current, "include", lv_include_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1130:8: lv_include_0_2= 'Exclude'
                    {
                    lv_include_0_2=(Token)match(input,35,FOLLOW_35_in_ruleInclude2564); 

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

            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1145:2: ( ( ruleFQN ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1146:1: ( ruleFQN )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1146:1: ( ruleFQN )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1147:3: ruleFQN
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIncludeRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getIncludeAccess().getEntityEntityCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleInclude2603);
            ruleFQN();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1160:2: (otherlv_2= 'with' otherlv_3= '{' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1160:4: otherlv_2= 'with' otherlv_3= '{' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}'
            {
            otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleInclude2616); 

                	newLeafNode(otherlv_2, grammarAccess.getIncludeAccess().getWithKeyword_2_0());
                
            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleInclude2628); 

                	newLeafNode(otherlv_3, grammarAccess.getIncludeAccess().getLeftCurlyBracketKeyword_2_1());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1168:1: ( (otherlv_4= RULE_ID ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1169:1: (otherlv_4= RULE_ID )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1169:1: (otherlv_4= RULE_ID )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1170:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIncludeRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInclude2648); 

            		newLeafNode(otherlv_4, grammarAccess.getIncludeAccess().getFieldsPropertyCrossReference_2_2_0()); 
            	

            }


            }

            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1181:2: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==17) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1181:4: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleInclude2661); 

            	        	newLeafNode(otherlv_5, grammarAccess.getIncludeAccess().getCommaKeyword_2_3_0());
            	        
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1185:1: ( (otherlv_6= RULE_ID ) )
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1186:1: (otherlv_6= RULE_ID )
            	    {
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1186:1: (otherlv_6= RULE_ID )
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1187:3: otherlv_6= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getIncludeRule());
            	    	        }
            	            
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInclude2681); 

            	    		newLeafNode(otherlv_6, grammarAccess.getIncludeAccess().getFieldsPropertyCrossReference_2_3_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleInclude2695); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1210:1: entryRuleEnumDeclaration returns [EObject current=null] : iv_ruleEnumDeclaration= ruleEnumDeclaration EOF ;
    public final EObject entryRuleEnumDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumDeclaration = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1211:2: (iv_ruleEnumDeclaration= ruleEnumDeclaration EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1212:2: iv_ruleEnumDeclaration= ruleEnumDeclaration EOF
            {
             newCompositeNode(grammarAccess.getEnumDeclarationRule()); 
            pushFollow(FOLLOW_ruleEnumDeclaration_in_entryRuleEnumDeclaration2732);
            iv_ruleEnumDeclaration=ruleEnumDeclaration();

            state._fsp--;

             current =iv_ruleEnumDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumDeclaration2742); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1219:1: ruleEnumDeclaration returns [EObject current=null] : (otherlv_0= 'Enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' this_ID_5= RULE_ID )* otherlv_6= '}' ) ;
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
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1222:28: ( (otherlv_0= 'Enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' this_ID_5= RULE_ID )* otherlv_6= '}' ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1223:1: (otherlv_0= 'Enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' this_ID_5= RULE_ID )* otherlv_6= '}' )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1223:1: (otherlv_0= 'Enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' this_ID_5= RULE_ID )* otherlv_6= '}' )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1223:3: otherlv_0= 'Enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' this_ID_5= RULE_ID )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleEnumDeclaration2779); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumDeclarationAccess().getEnumerationKeyword_0());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1227:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1228:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1228:1: (lv_name_1_0= RULE_ID )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1229:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumDeclaration2796); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleEnumDeclaration2813); 

                	newLeafNode(otherlv_2, grammarAccess.getEnumDeclarationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1249:1: ( (lv_values_3_0= RULE_ID ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1250:1: (lv_values_3_0= RULE_ID )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1250:1: (lv_values_3_0= RULE_ID )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1251:3: lv_values_3_0= RULE_ID
            {
            lv_values_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumDeclaration2830); 

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

            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1267:2: (otherlv_4= ',' this_ID_5= RULE_ID )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==17) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1267:4: otherlv_4= ',' this_ID_5= RULE_ID
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleEnumDeclaration2848); 

            	        	newLeafNode(otherlv_4, grammarAccess.getEnumDeclarationAccess().getCommaKeyword_4_0());
            	        
            	    this_ID_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumDeclaration2859); 
            	     
            	        newLeafNode(this_ID_5, grammarAccess.getEnumDeclarationAccess().getIDTerminalRuleCall_4_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleEnumDeclaration2872); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1287:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1288:2: (iv_ruleFQN= ruleFQN EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1289:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN2909);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN2920); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1296:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1299:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1300:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1300:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1300:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN2960); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1307:1: (kw= '.' this_ID_2= RULE_ID )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==38) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1308:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,38,FOLLOW_38_in_ruleFQN2979); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN2994); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1328:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1329:2: (iv_ruleEntity= ruleEntity EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1330:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity3041);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity3051); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1337:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_properties_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1340:28: ( (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1341:1: (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1341:1: (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1341:3: otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleEntity3088); 

                	newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1345:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1346:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1346:1: (lv_name_1_0= RULE_ID )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1347:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity3105); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleEntity3122); 

                	newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1367:1: ( (lv_properties_3_0= ruleProperty ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==42||LA19_0==44) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1368:1: (lv_properties_3_0= ruleProperty )
            	    {
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1368:1: (lv_properties_3_0= ruleProperty )
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1369:3: lv_properties_3_0= ruleProperty
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getPropertiesPropertyParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProperty_in_ruleEntity3143);
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
            	    break loop19;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleEntity3156); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1397:1: entryRuleDomain returns [EObject current=null] : iv_ruleDomain= ruleDomain EOF ;
    public final EObject entryRuleDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomain = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1398:2: (iv_ruleDomain= ruleDomain EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1399:2: iv_ruleDomain= ruleDomain EOF
            {
             newCompositeNode(grammarAccess.getDomainRule()); 
            pushFollow(FOLLOW_ruleDomain_in_entryRuleDomain3192);
            iv_ruleDomain=ruleDomain();

            state._fsp--;

             current =iv_ruleDomain; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomain3202); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1406:1: ruleDomain returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'Domain' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'Description: ' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= '{' ( (lv_entities_6_0= ruleEntity ) )+ otherlv_7= '}' ) ;
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
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1409:28: ( ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'Domain' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'Description: ' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= '{' ( (lv_entities_6_0= ruleEntity ) )+ otherlv_7= '}' ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1410:1: ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'Domain' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'Description: ' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= '{' ( (lv_entities_6_0= ruleEntity ) )+ otherlv_7= '}' )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1410:1: ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'Domain' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'Description: ' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= '{' ( (lv_entities_6_0= ruleEntity ) )+ otherlv_7= '}' )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1410:2: ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'Domain' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'Description: ' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= '{' ( (lv_entities_6_0= ruleEntity ) )+ otherlv_7= '}'
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1410:2: ( (lv_imports_0_0= ruleImport ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==31) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1411:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1411:1: (lv_imports_0_0= ruleImport )
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1412:3: lv_imports_0_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDomainAccess().getImportsImportParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleDomain3248);
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
            	    break loop20;
                }
            } while (true);

            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleDomain3261); 

                	newLeafNode(otherlv_1, grammarAccess.getDomainAccess().getDomainKeyword_1());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1432:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1433:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1433:1: (lv_name_2_0= RULE_ID )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1434:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDomain3278); 

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

            otherlv_3=(Token)match(input,41,FOLLOW_41_in_ruleDomain3295); 

                	newLeafNode(otherlv_3, grammarAccess.getDomainAccess().getDescriptionKeyword_3());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1454:1: ( (lv_description_4_0= RULE_STRING ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1455:1: (lv_description_4_0= RULE_STRING )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1455:1: (lv_description_4_0= RULE_STRING )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1456:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDomain3312); 

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

            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleDomain3329); 

                	newLeafNode(otherlv_5, grammarAccess.getDomainAccess().getLeftCurlyBracketKeyword_5());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1476:1: ( (lv_entities_6_0= ruleEntity ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==39) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1477:1: (lv_entities_6_0= ruleEntity )
            	    {
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1477:1: (lv_entities_6_0= ruleEntity )
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1478:3: lv_entities_6_0= ruleEntity
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDomainAccess().getEntitiesEntityParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEntity_in_ruleDomain3350);
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
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleDomain3363); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1506:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1507:2: (iv_ruleProperty= ruleProperty EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1508:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty3399);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty3409); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1515:1: ruleProperty returns [EObject current=null] : (this_Field_0= ruleField | this_Association_1= ruleAssociation ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        EObject this_Field_0 = null;

        EObject this_Association_1 = null;


         enterRule(); 
            
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1518:28: ( (this_Field_0= ruleField | this_Association_1= ruleAssociation ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1519:1: (this_Field_0= ruleField | this_Association_1= ruleAssociation )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1519:1: (this_Field_0= ruleField | this_Association_1= ruleAssociation )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==44) ) {
                alt22=1;
            }
            else if ( (LA22_0==42) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1520:5: this_Field_0= ruleField
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyAccess().getFieldParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleField_in_ruleProperty3456);
                    this_Field_0=ruleField();

                    state._fsp--;

                     
                            current = this_Field_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1530:5: this_Association_1= ruleAssociation
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyAccess().getAssociationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAssociation_in_ruleProperty3483);
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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1546:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1547:2: (iv_ruleAssociation= ruleAssociation EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1548:2: iv_ruleAssociation= ruleAssociation EOF
            {
             newCompositeNode(grammarAccess.getAssociationRule()); 
            pushFollow(FOLLOW_ruleAssociation_in_entryRuleAssociation3518);
            iv_ruleAssociation=ruleAssociation();

            state._fsp--;

             current =iv_ruleAssociation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssociation3528); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1555:1: ruleAssociation returns [EObject current=null] : (otherlv_0= 'Relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleFQN ) ) ( (lv_multiplicity_4_0= ruleMultiplicty ) ) ) ;
    public final EObject ruleAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_multiplicity_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1558:28: ( (otherlv_0= 'Relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleFQN ) ) ( (lv_multiplicity_4_0= ruleMultiplicty ) ) ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1559:1: (otherlv_0= 'Relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleFQN ) ) ( (lv_multiplicity_4_0= ruleMultiplicty ) ) )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1559:1: (otherlv_0= 'Relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleFQN ) ) ( (lv_multiplicity_4_0= ruleMultiplicty ) ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1559:3: otherlv_0= 'Relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleFQN ) ) ( (lv_multiplicity_4_0= ruleMultiplicty ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleAssociation3565); 

                	newLeafNode(otherlv_0, grammarAccess.getAssociationAccess().getRelationKeyword_0());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1563:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1564:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1564:1: (lv_name_1_0= RULE_ID )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1565:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssociation3582); 

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

            otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleAssociation3599); 

                	newLeafNode(otherlv_2, grammarAccess.getAssociationAccess().getColonKeyword_2());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1585:1: ( ( ruleFQN ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1586:1: ( ruleFQN )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1586:1: ( ruleFQN )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1587:3: ruleFQN
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAssociationRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAssociationAccess().getTypeEntityCrossReference_3_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleAssociation3622);
            ruleFQN();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1600:2: ( (lv_multiplicity_4_0= ruleMultiplicty ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1601:1: (lv_multiplicity_4_0= ruleMultiplicty )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1601:1: (lv_multiplicity_4_0= ruleMultiplicty )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1602:3: lv_multiplicity_4_0= ruleMultiplicty
            {
             
            	        newCompositeNode(grammarAccess.getAssociationAccess().getMultiplicityMultiplictyEnumRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleMultiplicty_in_ruleAssociation3643);
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


    // $ANTLR start "entryRuleField"
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1626:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1627:2: (iv_ruleField= ruleField EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1628:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField3679);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField3689); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1635:1: ruleField returns [EObject current=null] : (otherlv_0= 'Field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_literal_3_0= ruleLiteral ) ) ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_literal_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1638:28: ( (otherlv_0= 'Field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_literal_3_0= ruleLiteral ) ) ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1639:1: (otherlv_0= 'Field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_literal_3_0= ruleLiteral ) ) )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1639:1: (otherlv_0= 'Field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_literal_3_0= ruleLiteral ) ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1639:3: otherlv_0= 'Field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_literal_3_0= ruleLiteral ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleField3726); 

                	newLeafNode(otherlv_0, grammarAccess.getFieldAccess().getFieldKeyword_0());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1643:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1644:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1644:1: (lv_name_1_0= RULE_ID )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1645:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleField3743); 

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

            otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleField3760); 

                	newLeafNode(otherlv_2, grammarAccess.getFieldAccess().getColonKeyword_2());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1665:1: ( (lv_literal_3_0= ruleLiteral ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1666:1: (lv_literal_3_0= ruleLiteral )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1666:1: (lv_literal_3_0= ruleLiteral )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1667:3: lv_literal_3_0= ruleLiteral
            {
             
            	        newCompositeNode(grammarAccess.getFieldAccess().getLiteralLiteralParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleLiteral_in_ruleField3781);
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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1691:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1692:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1693:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral3817);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral3827); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1700:1: ruleLiteral returns [EObject current=null] : ( ( () ( (lv_name_1_0= 'Decimal' ) ) ) | ( () ( (lv_name_3_0= 'Money' ) ) ) | ( () ( (lv_name_5_0= 'Text' ) ) ) | ( () ( (lv_name_7_0= 'Boolean' ) ) ) | ( () ( (lv_name_9_0= 'Int' ) ) ) | this_Enum_10= ruleEnum ) ;
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
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1703:28: ( ( ( () ( (lv_name_1_0= 'Decimal' ) ) ) | ( () ( (lv_name_3_0= 'Money' ) ) ) | ( () ( (lv_name_5_0= 'Text' ) ) ) | ( () ( (lv_name_7_0= 'Boolean' ) ) ) | ( () ( (lv_name_9_0= 'Int' ) ) ) | this_Enum_10= ruleEnum ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1704:1: ( ( () ( (lv_name_1_0= 'Decimal' ) ) ) | ( () ( (lv_name_3_0= 'Money' ) ) ) | ( () ( (lv_name_5_0= 'Text' ) ) ) | ( () ( (lv_name_7_0= 'Boolean' ) ) ) | ( () ( (lv_name_9_0= 'Int' ) ) ) | this_Enum_10= ruleEnum )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1704:1: ( ( () ( (lv_name_1_0= 'Decimal' ) ) ) | ( () ( (lv_name_3_0= 'Money' ) ) ) | ( () ( (lv_name_5_0= 'Text' ) ) ) | ( () ( (lv_name_7_0= 'Boolean' ) ) ) | ( () ( (lv_name_9_0= 'Int' ) ) ) | this_Enum_10= ruleEnum )
            int alt23=6;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt23=1;
                }
                break;
            case 46:
                {
                alt23=2;
                }
                break;
            case 47:
                {
                alt23=3;
                }
                break;
            case 48:
                {
                alt23=4;
                }
                break;
            case 49:
                {
                alt23=5;
                }
                break;
            case 50:
                {
                alt23=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1704:2: ( () ( (lv_name_1_0= 'Decimal' ) ) )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1704:2: ( () ( (lv_name_1_0= 'Decimal' ) ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1704:3: () ( (lv_name_1_0= 'Decimal' ) )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1704:3: ()
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1705:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLiteralAccess().getLiteralAction_0_0(),
                                current);
                        

                    }

                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1710:2: ( (lv_name_1_0= 'Decimal' ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1711:1: (lv_name_1_0= 'Decimal' )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1711:1: (lv_name_1_0= 'Decimal' )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1712:3: lv_name_1_0= 'Decimal'
                    {
                    lv_name_1_0=(Token)match(input,45,FOLLOW_45_in_ruleLiteral3880); 

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
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1726:6: ( () ( (lv_name_3_0= 'Money' ) ) )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1726:6: ( () ( (lv_name_3_0= 'Money' ) ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1726:7: () ( (lv_name_3_0= 'Money' ) )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1726:7: ()
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1727:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLiteralAccess().getLiteralAction_1_0(),
                                current);
                        

                    }

                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1732:2: ( (lv_name_3_0= 'Money' ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1733:1: (lv_name_3_0= 'Money' )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1733:1: (lv_name_3_0= 'Money' )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1734:3: lv_name_3_0= 'Money'
                    {
                    lv_name_3_0=(Token)match(input,46,FOLLOW_46_in_ruleLiteral3928); 

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
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1748:6: ( () ( (lv_name_5_0= 'Text' ) ) )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1748:6: ( () ( (lv_name_5_0= 'Text' ) ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1748:7: () ( (lv_name_5_0= 'Text' ) )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1748:7: ()
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1749:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLiteralAccess().getLiteralAction_2_0(),
                                current);
                        

                    }

                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1754:2: ( (lv_name_5_0= 'Text' ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1755:1: (lv_name_5_0= 'Text' )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1755:1: (lv_name_5_0= 'Text' )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1756:3: lv_name_5_0= 'Text'
                    {
                    lv_name_5_0=(Token)match(input,47,FOLLOW_47_in_ruleLiteral3976); 

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
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1770:6: ( () ( (lv_name_7_0= 'Boolean' ) ) )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1770:6: ( () ( (lv_name_7_0= 'Boolean' ) ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1770:7: () ( (lv_name_7_0= 'Boolean' ) )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1770:7: ()
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1771:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLiteralAccess().getLiteralAction_3_0(),
                                current);
                        

                    }

                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1776:2: ( (lv_name_7_0= 'Boolean' ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1777:1: (lv_name_7_0= 'Boolean' )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1777:1: (lv_name_7_0= 'Boolean' )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1778:3: lv_name_7_0= 'Boolean'
                    {
                    lv_name_7_0=(Token)match(input,48,FOLLOW_48_in_ruleLiteral4024); 

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
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1792:6: ( () ( (lv_name_9_0= 'Int' ) ) )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1792:6: ( () ( (lv_name_9_0= 'Int' ) ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1792:7: () ( (lv_name_9_0= 'Int' ) )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1792:7: ()
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1793:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLiteralAccess().getLiteralAction_4_0(),
                                current);
                        

                    }

                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1798:2: ( (lv_name_9_0= 'Int' ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1799:1: (lv_name_9_0= 'Int' )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1799:1: (lv_name_9_0= 'Int' )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1800:3: lv_name_9_0= 'Int'
                    {
                    lv_name_9_0=(Token)match(input,49,FOLLOW_49_in_ruleLiteral4072); 

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
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1815:5: this_Enum_10= ruleEnum
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getEnumParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleEnum_in_ruleLiteral4114);
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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1831:1: entryRuleEnum returns [EObject current=null] : iv_ruleEnum= ruleEnum EOF ;
    public final EObject entryRuleEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnum = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1832:2: (iv_ruleEnum= ruleEnum EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1833:2: iv_ruleEnum= ruleEnum EOF
            {
             newCompositeNode(grammarAccess.getEnumRule()); 
            pushFollow(FOLLOW_ruleEnum_in_entryRuleEnum4149);
            iv_ruleEnum=ruleEnum();

            state._fsp--;

             current =iv_ruleEnum; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnum4159); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1840:1: ruleEnum returns [EObject current=null] : (otherlv_0= 'Enum' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1843:28: ( (otherlv_0= 'Enum' ( (otherlv_1= RULE_ID ) ) ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1844:1: (otherlv_0= 'Enum' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1844:1: (otherlv_0= 'Enum' ( (otherlv_1= RULE_ID ) ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1844:3: otherlv_0= 'Enum' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50_in_ruleEnum4196); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumAccess().getEnumKeyword_0());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1848:1: ( (otherlv_1= RULE_ID ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1849:1: (otherlv_1= RULE_ID )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1849:1: (otherlv_1= RULE_ID )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1850:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnum4216); 

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


    // $ANTLR start "ruleBREType"
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1871:1: ruleBREType returns [Enumerator current=null] : ( (enumLiteral_0= 'BizToBiz' ) | (enumLiteral_1= 'SrcToBiz' ) | (enumLiteral_2= 'BizToOut' ) ) ;
    public final Enumerator ruleBREType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1873:28: ( ( (enumLiteral_0= 'BizToBiz' ) | (enumLiteral_1= 'SrcToBiz' ) | (enumLiteral_2= 'BizToOut' ) ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1874:1: ( (enumLiteral_0= 'BizToBiz' ) | (enumLiteral_1= 'SrcToBiz' ) | (enumLiteral_2= 'BizToOut' ) )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1874:1: ( (enumLiteral_0= 'BizToBiz' ) | (enumLiteral_1= 'SrcToBiz' ) | (enumLiteral_2= 'BizToOut' ) )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt24=1;
                }
                break;
            case 52:
                {
                alt24=2;
                }
                break;
            case 53:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1874:2: (enumLiteral_0= 'BizToBiz' )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1874:2: (enumLiteral_0= 'BizToBiz' )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1874:4: enumLiteral_0= 'BizToBiz'
                    {
                    enumLiteral_0=(Token)match(input,51,FOLLOW_51_in_ruleBREType4268); 

                            current = grammarAccess.getBRETypeAccess().getBizToBizEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getBRETypeAccess().getBizToBizEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1880:6: (enumLiteral_1= 'SrcToBiz' )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1880:6: (enumLiteral_1= 'SrcToBiz' )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1880:8: enumLiteral_1= 'SrcToBiz'
                    {
                    enumLiteral_1=(Token)match(input,52,FOLLOW_52_in_ruleBREType4285); 

                            current = grammarAccess.getBRETypeAccess().getSrcToBizEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getBRETypeAccess().getSrcToBizEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1886:6: (enumLiteral_2= 'BizToOut' )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1886:6: (enumLiteral_2= 'BizToOut' )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1886:8: enumLiteral_2= 'BizToOut'
                    {
                    enumLiteral_2=(Token)match(input,53,FOLLOW_53_in_ruleBREType4302); 

                            current = grammarAccess.getBRETypeAccess().getBizToOutEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getBRETypeAccess().getBizToOutEnumLiteralDeclaration_2()); 
                        

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
    // $ANTLR end "ruleBREType"


    // $ANTLR start "ruleMultiplicty"
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1896:1: ruleMultiplicty returns [Enumerator current=null] : ( (enumLiteral_0= '1..N' ) | (enumLiteral_1= '0..N' ) | (enumLiteral_2= '1' ) ) ;
    public final Enumerator ruleMultiplicty() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1898:28: ( ( (enumLiteral_0= '1..N' ) | (enumLiteral_1= '0..N' ) | (enumLiteral_2= '1' ) ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1899:1: ( (enumLiteral_0= '1..N' ) | (enumLiteral_1= '0..N' ) | (enumLiteral_2= '1' ) )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1899:1: ( (enumLiteral_0= '1..N' ) | (enumLiteral_1= '0..N' ) | (enumLiteral_2= '1' ) )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt25=1;
                }
                break;
            case 55:
                {
                alt25=2;
                }
                break;
            case 56:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1899:2: (enumLiteral_0= '1..N' )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1899:2: (enumLiteral_0= '1..N' )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1899:4: enumLiteral_0= '1..N'
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_54_in_ruleMultiplicty4347); 

                            current = grammarAccess.getMultiplictyAccess().getOneToManyEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getMultiplictyAccess().getOneToManyEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1905:6: (enumLiteral_1= '0..N' )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1905:6: (enumLiteral_1= '0..N' )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1905:8: enumLiteral_1= '0..N'
                    {
                    enumLiteral_1=(Token)match(input,55,FOLLOW_55_in_ruleMultiplicty4364); 

                            current = grammarAccess.getMultiplictyAccess().getZeroToManyEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getMultiplictyAccess().getZeroToManyEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1911:6: (enumLiteral_2= '1' )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1911:6: (enumLiteral_2= '1' )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1911:8: enumLiteral_2= '1'
                    {
                    enumLiteral_2=(Token)match(input,56,FOLLOW_56_in_ruleMultiplicty4381); 

                            current = grammarAccess.getMultiplictyAccess().getOneToOneEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getMultiplictyAccess().getOneToOneEnumLiteralDeclaration_2()); 
                        

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

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String DFA1_eotS =
        "\14\uffff";
    static final String DFA1_eofS =
        "\14\uffff";
    static final String DFA1_minS =
        "\1\13\1\uffff\1\4\5\uffff\1\13\1\4\2\13";
    static final String DFA1_maxS =
        "\1\50\1\uffff\1\4\5\uffff\1\50\1\4\2\50";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\1\3\1\4\1\5\1\6\4\uffff";
    static final String DFA1_specialS =
        "\14\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\5\11\uffff\1\6\6\uffff\1\7\2\uffff\1\2\1\uffff\1\3\3\uffff\1\1\2\uffff\1\4",
            "",
            "\1\10",
            "",
            "",
            "",
            "",
            "",
            "\1\5\11\uffff\1\6\11\uffff\1\2\1\12\1\3\4\uffff\1\11\1\uffff\1\4",
            "\1\13",
            "\1\5\11\uffff\1\6\11\uffff\1\2\1\uffff\1\3\6\uffff\1\4",
            "\1\5\11\uffff\1\6\11\uffff\1\2\1\12\1\3\4\uffff\1\11\1\uffff\1\4"
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
            return "120:1: (this_EnumDeclaration_0= ruleEnumDeclaration | this_Diagram_1= ruleDiagram | this_Domain_2= ruleDomain | this_Flow_3= ruleFlow | this_BusinessRule_4= ruleBusinessRule | this_System_5= ruleSystem )";
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
    public static final BitSet FOLLOW_ruleSystem_in_ruleElement357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFlow_in_entryRuleFlow392 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFlow402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleFlow448 = new BitSet(new long[]{0x0000000080000800L});
    public static final BitSet FOLLOW_11_in_ruleFlow461 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFlow478 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFlow495 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_ruleActivity_in_ruleFlow516 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleFlow529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_entryRuleActivity565 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivity575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleActivity612 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActivity629 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleActivity646 = new BitSet(new long[]{0x0000000000188000L});
    public static final BitSet FOLLOW_15_in_ruleActivity659 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleActivity671 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActivity691 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleActivity704 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActivity724 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_ruleActivity738 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleActivity753 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleActivity776 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleActivity790 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActivity807 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleActivity824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessRule_in_entryRuleBusinessRule860 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBusinessRule870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleBusinessRule916 = new BitSet(new long[]{0x0000000080200800L});
    public static final BitSet FOLLOW_21_in_ruleBusinessRule929 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBusinessRule946 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleBusinessRule963 = new BitSet(new long[]{0x0038000000000000L});
    public static final BitSet FOLLOW_ruleBREType_in_ruleBusinessRule984 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleBusinessRule996 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleBusinessRule1008 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleBusinessRule1020 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleBreEntityInput_in_ruleBusinessRule1041 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleBusinessRule1054 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleBreEntityInput_in_ruleBusinessRule1075 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_ruleBusinessRule1089 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleBusinessRule1101 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleBusinessRule1113 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleBreOutPutReference_in_ruleBusinessRule1134 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleBusinessRule1146 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleBusinessRule1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreOutPutReference_in_entryRuleBreOutPutReference1196 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBreOutPutReference1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleBreOutPutReference1253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreEntityInput_in_entryRuleBreEntityInput1288 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBreEntityInput1298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleBreEntityInput1346 = new BitSet(new long[]{0x000000000C003000L});
    public static final BitSet FOLLOW_ruleEntityConfiguration_in_ruleBreEntityInput1367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityConfiguration_in_entryRuleEntityConfiguration1403 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityConfiguration1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleEntityConfiguration1495 = new BitSet(new long[]{0x000000000E003002L});
    public static final BitSet FOLLOW_25_in_ruleEntityConfiguration1513 = new BitSet(new long[]{0x000000000C003002L});
    public static final BitSet FOLLOW_26_in_ruleEntityConfiguration1600 = new BitSet(new long[]{0x000000000C003002L});
    public static final BitSet FOLLOW_27_in_ruleEntityConfiguration1686 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEntityConfiguration1712 = new BitSet(new long[]{0x000000000C003002L});
    public static final BitSet FOLLOW_ruleSystem_in_entryRuleSystem1794 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystem1804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleSystem1841 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSystem1858 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSystem1875 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ruleSystemEntity_in_ruleSystem1896 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSystem1908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystemEntity_in_entryRuleSystemEntity1944 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystemEntity1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleSystemEntity1991 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSystemEntity2008 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleSystemEntity2025 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSystemEntity2042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport2083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport2093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleImport2130 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFqnWithWildCard_in_ruleImport2151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFqnWithWildCard_in_entryRuleFqnWithWildCard2188 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFqnWithWildCard2199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleFqnWithWildCard2246 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleFqnWithWildCard2265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiagram_in_entryRuleDiagram2307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDiagram2317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleDiagram2363 = new BitSet(new long[]{0x0000000280000800L});
    public static final BitSet FOLLOW_33_in_ruleDiagram2376 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDiagram2393 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDiagram2410 = new BitSet(new long[]{0x0000000C00002000L});
    public static final BitSet FOLLOW_ruleInclude_in_ruleDiagram2431 = new BitSet(new long[]{0x0000000C00002000L});
    public static final BitSet FOLLOW_13_in_ruleDiagram2444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_entryRuleInclude2480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInclude2490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleInclude2535 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_35_in_ruleInclude2564 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleInclude2603 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleInclude2616 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInclude2628 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInclude2648 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_17_in_ruleInclude2661 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInclude2681 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_13_in_ruleInclude2695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDeclaration_in_entryRuleEnumDeclaration2732 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumDeclaration2742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleEnumDeclaration2779 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumDeclaration2796 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEnumDeclaration2813 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumDeclaration2830 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_17_in_ruleEnumDeclaration2848 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumDeclaration2859 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_13_in_ruleEnumDeclaration2872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN2909 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN2920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN2960 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleFQN2979 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN2994 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity3041 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity3051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleEntity3088 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity3105 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEntity3122 = new BitSet(new long[]{0x0000140000002000L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleEntity3143 = new BitSet(new long[]{0x0000140000002000L});
    public static final BitSet FOLLOW_13_in_ruleEntity3156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomain_in_entryRuleDomain3192 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomain3202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleDomain3248 = new BitSet(new long[]{0x0000010080000800L});
    public static final BitSet FOLLOW_40_in_ruleDomain3261 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDomain3278 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleDomain3295 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDomain3312 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDomain3329 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleDomain3350 = new BitSet(new long[]{0x0000008000002000L});
    public static final BitSet FOLLOW_13_in_ruleDomain3363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty3399 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty3409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_ruleProperty3456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociation_in_ruleProperty3483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociation_in_entryRuleAssociation3518 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssociation3528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleAssociation3565 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssociation3582 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleAssociation3599 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleAssociation3622 = new BitSet(new long[]{0x01C0000000000000L});
    public static final BitSet FOLLOW_ruleMultiplicty_in_ruleAssociation3643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField3679 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField3689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleField3726 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleField3743 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleField3760 = new BitSet(new long[]{0x0007E00000000000L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleField3781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral3817 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral3827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleLiteral3880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleLiteral3928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleLiteral3976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleLiteral4024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleLiteral4072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_ruleLiteral4114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_entryRuleEnum4149 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnum4159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleEnum4196 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnum4216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleBREType4268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleBREType4285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleBREType4302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleMultiplicty4347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleMultiplicty4364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleMultiplicty4381 = new BitSet(new long[]{0x0000000000000002L});

}
