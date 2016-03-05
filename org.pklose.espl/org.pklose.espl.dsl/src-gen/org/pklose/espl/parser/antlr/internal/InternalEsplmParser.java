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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Flow'", "'{'", "'}'", "'Activity'", "'Successors'", "'['", "','", "']'", "'Calls'", "'Description'", "'BusinessRule'", "'type'", "'Input'", "'Output'", "'prim\\u00E4r'", "'='", "'obligatorisch'", "'mehrfach'", "'join Pfad'", "'Pfad'", "'SourceSystem'", "'SystemEntit\\u00E4t'", "'Format'", "'Import'", "'.*'", "'Diagram'", "'Include'", "'Exclude'", "'with'", "'Enumeration'", "'.'", "'Entity'", "'Domain'", "'Description: '", "'Relation'", "':'", "'Field'", "'Decimal'", "'Money'", "'Text'", "'Boolean'", "'Int'", "'Enum'", "'J'", "'F'", "'BizToBiz'", "'SrcToBiz'", "'BizToOut'", "'1..N'", "'0..N'", "'1'"
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
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
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
    public static final int T__59=59;
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

                if ( (LA2_0==34) ) {
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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:417:1: ruleBusinessRule returns [EObject current=null] : ( ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'BusinessRule' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'type' ( (lv_typ_4_0= ruleBREType ) ) otherlv_5= '{' otherlv_6= 'Input' otherlv_7= '[' ( ( (lv_systemInputs_8_1= ruleBreSystemEntityInput | lv_systemInputs_8_2= ruleBreEntityInput ) ) )* otherlv_9= ']' otherlv_10= 'Output' otherlv_11= '[' ( ( ruleFQN ) ) ) | ( ( ( ruleFQN ) ) otherlv_14= ']' otherlv_15= '}' ) ) ;
    public final EObject ruleBusinessRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_imports_0_0 = null;

        Enumerator lv_typ_4_0 = null;

        EObject lv_systemInputs_8_1 = null;

        EObject lv_systemInputs_8_2 = null;


         enterRule(); 
            
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:420:28: ( ( ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'BusinessRule' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'type' ( (lv_typ_4_0= ruleBREType ) ) otherlv_5= '{' otherlv_6= 'Input' otherlv_7= '[' ( ( (lv_systemInputs_8_1= ruleBreSystemEntityInput | lv_systemInputs_8_2= ruleBreEntityInput ) ) )* otherlv_9= ']' otherlv_10= 'Output' otherlv_11= '[' ( ( ruleFQN ) ) ) | ( ( ( ruleFQN ) ) otherlv_14= ']' otherlv_15= '}' ) ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:421:1: ( ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'BusinessRule' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'type' ( (lv_typ_4_0= ruleBREType ) ) otherlv_5= '{' otherlv_6= 'Input' otherlv_7= '[' ( ( (lv_systemInputs_8_1= ruleBreSystemEntityInput | lv_systemInputs_8_2= ruleBreEntityInput ) ) )* otherlv_9= ']' otherlv_10= 'Output' otherlv_11= '[' ( ( ruleFQN ) ) ) | ( ( ( ruleFQN ) ) otherlv_14= ']' otherlv_15= '}' ) )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:421:1: ( ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'BusinessRule' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'type' ( (lv_typ_4_0= ruleBREType ) ) otherlv_5= '{' otherlv_6= 'Input' otherlv_7= '[' ( ( (lv_systemInputs_8_1= ruleBreSystemEntityInput | lv_systemInputs_8_2= ruleBreEntityInput ) ) )* otherlv_9= ']' otherlv_10= 'Output' otherlv_11= '[' ( ( ruleFQN ) ) ) | ( ( ( ruleFQN ) ) otherlv_14= ']' otherlv_15= '}' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21||LA10_0==34) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:421:2: ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'BusinessRule' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'type' ( (lv_typ_4_0= ruleBREType ) ) otherlv_5= '{' otherlv_6= 'Input' otherlv_7= '[' ( ( (lv_systemInputs_8_1= ruleBreSystemEntityInput | lv_systemInputs_8_2= ruleBreEntityInput ) ) )* otherlv_9= ']' otherlv_10= 'Output' otherlv_11= '[' ( ( ruleFQN ) ) )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:421:2: ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'BusinessRule' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'type' ( (lv_typ_4_0= ruleBREType ) ) otherlv_5= '{' otherlv_6= 'Input' otherlv_7= '[' ( ( (lv_systemInputs_8_1= ruleBreSystemEntityInput | lv_systemInputs_8_2= ruleBreEntityInput ) ) )* otherlv_9= ']' otherlv_10= 'Output' otherlv_11= '[' ( ( ruleFQN ) ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:421:3: ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'BusinessRule' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'type' ( (lv_typ_4_0= ruleBREType ) ) otherlv_5= '{' otherlv_6= 'Input' otherlv_7= '[' ( ( (lv_systemInputs_8_1= ruleBreSystemEntityInput | lv_systemInputs_8_2= ruleBreEntityInput ) ) )* otherlv_9= ']' otherlv_10= 'Output' otherlv_11= '[' ( ( ruleFQN ) )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:421:3: ( (lv_imports_0_0= ruleImport ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==34) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:422:1: (lv_imports_0_0= ruleImport )
                    	    {
                    	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:422:1: (lv_imports_0_0= ruleImport )
                    	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:423:3: lv_imports_0_0= ruleImport
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getBusinessRuleAccess().getImportsImportParserRuleCall_0_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleImport_in_ruleBusinessRule917);
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

                    otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleBusinessRule930); 

                        	newLeafNode(otherlv_1, grammarAccess.getBusinessRuleAccess().getBusinessRuleKeyword_0_1());
                        
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:443:1: ( (lv_name_2_0= RULE_ID ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:444:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:444:1: (lv_name_2_0= RULE_ID )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:445:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBusinessRule947); 

                    			newLeafNode(lv_name_2_0, grammarAccess.getBusinessRuleAccess().getNameIDTerminalRuleCall_0_2_0()); 
                    		

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

                    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleBusinessRule964); 

                        	newLeafNode(otherlv_3, grammarAccess.getBusinessRuleAccess().getTypeKeyword_0_3());
                        
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:465:1: ( (lv_typ_4_0= ruleBREType ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:466:1: (lv_typ_4_0= ruleBREType )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:466:1: (lv_typ_4_0= ruleBREType )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:467:3: lv_typ_4_0= ruleBREType
                    {
                     
                    	        newCompositeNode(grammarAccess.getBusinessRuleAccess().getTypBRETypeEnumRuleCall_0_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBREType_in_ruleBusinessRule985);
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

                    otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleBusinessRule997); 

                        	newLeafNode(otherlv_5, grammarAccess.getBusinessRuleAccess().getLeftCurlyBracketKeyword_0_5());
                        
                    otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleBusinessRule1009); 

                        	newLeafNode(otherlv_6, grammarAccess.getBusinessRuleAccess().getInputKeyword_0_6());
                        
                    otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleBusinessRule1021); 

                        	newLeafNode(otherlv_7, grammarAccess.getBusinessRuleAccess().getLeftSquareBracketKeyword_0_7());
                        
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:495:1: ( ( (lv_systemInputs_8_1= ruleBreSystemEntityInput | lv_systemInputs_8_2= ruleBreEntityInput ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_ID) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:496:1: ( (lv_systemInputs_8_1= ruleBreSystemEntityInput | lv_systemInputs_8_2= ruleBreEntityInput ) )
                    	    {
                    	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:496:1: ( (lv_systemInputs_8_1= ruleBreSystemEntityInput | lv_systemInputs_8_2= ruleBreEntityInput ) )
                    	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:497:1: (lv_systemInputs_8_1= ruleBreSystemEntityInput | lv_systemInputs_8_2= ruleBreEntityInput )
                    	    {
                    	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:497:1: (lv_systemInputs_8_1= ruleBreSystemEntityInput | lv_systemInputs_8_2= ruleBreEntityInput )
                    	    int alt8=2;
                    	    alt8 = dfa8.predict(input);
                    	    switch (alt8) {
                    	        case 1 :
                    	            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:498:3: lv_systemInputs_8_1= ruleBreSystemEntityInput
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getBusinessRuleAccess().getSystemInputsBreSystemEntityInputParserRuleCall_0_8_0_0()); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleBreSystemEntityInput_in_ruleBusinessRule1044);
                    	            lv_systemInputs_8_1=ruleBreSystemEntityInput();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = createModelElementForParent(grammarAccess.getBusinessRuleRule());
                    	            	        }
                    	                   		add(
                    	                   			current, 
                    	                   			"systemInputs",
                    	                    		lv_systemInputs_8_1, 
                    	                    		"BreSystemEntityInput");
                    	            	        afterParserOrEnumRuleCall();
                    	            	    

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:513:8: lv_systemInputs_8_2= ruleBreEntityInput
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getBusinessRuleAccess().getSystemInputsBreEntityInputParserRuleCall_0_8_0_1()); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleBreEntityInput_in_ruleBusinessRule1063);
                    	            lv_systemInputs_8_2=ruleBreEntityInput();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = createModelElementForParent(grammarAccess.getBusinessRuleRule());
                    	            	        }
                    	                   		add(
                    	                   			current, 
                    	                   			"systemInputs",
                    	                    		lv_systemInputs_8_2, 
                    	                    		"BreEntityInput");
                    	            	        afterParserOrEnumRuleCall();
                    	            	    

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleBusinessRule1079); 

                        	newLeafNode(otherlv_9, grammarAccess.getBusinessRuleAccess().getRightSquareBracketKeyword_0_9());
                        
                    otherlv_10=(Token)match(input,24,FOLLOW_24_in_ruleBusinessRule1091); 

                        	newLeafNode(otherlv_10, grammarAccess.getBusinessRuleAccess().getOutputKeyword_0_10());
                        
                    otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleBusinessRule1103); 

                        	newLeafNode(otherlv_11, grammarAccess.getBusinessRuleAccess().getLeftSquareBracketKeyword_0_11());
                        
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:543:1: ( ( ruleFQN ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:544:1: ( ruleFQN )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:544:1: ( ruleFQN )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:545:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getBusinessRuleRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getBusinessRuleAccess().getOutputEntityCrossReference_0_12_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleBusinessRule1126);
                    ruleFQN();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:559:6: ( ( ( ruleFQN ) ) otherlv_14= ']' otherlv_15= '}' )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:559:6: ( ( ( ruleFQN ) ) otherlv_14= ']' otherlv_15= '}' )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:559:7: ( ( ruleFQN ) ) otherlv_14= ']' otherlv_15= '}'
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:559:7: ( ( ruleFQN ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:560:1: ( ruleFQN )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:560:1: ( ruleFQN )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:561:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getBusinessRuleRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getBusinessRuleAccess().getOutputSystemEntityCrossReference_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleBusinessRule1157);
                    ruleFQN();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_14=(Token)match(input,18,FOLLOW_18_in_ruleBusinessRule1169); 

                        	newLeafNode(otherlv_14, grammarAccess.getBusinessRuleAccess().getRightSquareBracketKeyword_1_1());
                        
                    otherlv_15=(Token)match(input,13,FOLLOW_13_in_ruleBusinessRule1181); 

                        	newLeafNode(otherlv_15, grammarAccess.getBusinessRuleAccess().getRightCurlyBracketKeyword_1_2());
                        

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
    // $ANTLR end "ruleBusinessRule"


    // $ANTLR start "entryRuleBreSystemEntityInput"
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:590:1: entryRuleBreSystemEntityInput returns [EObject current=null] : iv_ruleBreSystemEntityInput= ruleBreSystemEntityInput EOF ;
    public final EObject entryRuleBreSystemEntityInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBreSystemEntityInput = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:591:2: (iv_ruleBreSystemEntityInput= ruleBreSystemEntityInput EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:592:2: iv_ruleBreSystemEntityInput= ruleBreSystemEntityInput EOF
            {
             newCompositeNode(grammarAccess.getBreSystemEntityInputRule()); 
            pushFollow(FOLLOW_ruleBreSystemEntityInput_in_entryRuleBreSystemEntityInput1218);
            iv_ruleBreSystemEntityInput=ruleBreSystemEntityInput();

            state._fsp--;

             current =iv_ruleBreSystemEntityInput; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBreSystemEntityInput1228); 

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
    // $ANTLR end "entryRuleBreSystemEntityInput"


    // $ANTLR start "ruleBreSystemEntityInput"
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:599:1: ruleBreSystemEntityInput returns [EObject current=null] : ( ( ( ruleFQN ) ) ( (lv_configuration_1_0= ruleSystemEntityConfiguration ) ) ) ;
    public final EObject ruleBreSystemEntityInput() throws RecognitionException {
        EObject current = null;

        EObject lv_configuration_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:602:28: ( ( ( ( ruleFQN ) ) ( (lv_configuration_1_0= ruleSystemEntityConfiguration ) ) ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:603:1: ( ( ( ruleFQN ) ) ( (lv_configuration_1_0= ruleSystemEntityConfiguration ) ) )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:603:1: ( ( ( ruleFQN ) ) ( (lv_configuration_1_0= ruleSystemEntityConfiguration ) ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:603:2: ( ( ruleFQN ) ) ( (lv_configuration_1_0= ruleSystemEntityConfiguration ) )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:603:2: ( ( ruleFQN ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:604:1: ( ruleFQN )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:604:1: ( ruleFQN )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:605:3: ruleFQN
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getBreSystemEntityInputRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getBreSystemEntityInputAccess().getInputElementSystemEntityCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleBreSystemEntityInput1276);
            ruleFQN();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:618:2: ( (lv_configuration_1_0= ruleSystemEntityConfiguration ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:619:1: (lv_configuration_1_0= ruleSystemEntityConfiguration )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:619:1: (lv_configuration_1_0= ruleSystemEntityConfiguration )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:620:3: lv_configuration_1_0= ruleSystemEntityConfiguration
            {
             
            	        newCompositeNode(grammarAccess.getBreSystemEntityInputAccess().getConfigurationSystemEntityConfigurationParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSystemEntityConfiguration_in_ruleBreSystemEntityInput1297);
            lv_configuration_1_0=ruleSystemEntityConfiguration();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBreSystemEntityInputRule());
            	        }
                   		add(
                   			current, 
                   			"configuration",
                    		lv_configuration_1_0, 
                    		"SystemEntityConfiguration");
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
    // $ANTLR end "ruleBreSystemEntityInput"


    // $ANTLR start "entryRuleBreEntityInput"
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:644:1: entryRuleBreEntityInput returns [EObject current=null] : iv_ruleBreEntityInput= ruleBreEntityInput EOF ;
    public final EObject entryRuleBreEntityInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBreEntityInput = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:645:2: (iv_ruleBreEntityInput= ruleBreEntityInput EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:646:2: iv_ruleBreEntityInput= ruleBreEntityInput EOF
            {
             newCompositeNode(grammarAccess.getBreEntityInputRule()); 
            pushFollow(FOLLOW_ruleBreEntityInput_in_entryRuleBreEntityInput1333);
            iv_ruleBreEntityInput=ruleBreEntityInput();

            state._fsp--;

             current =iv_ruleBreEntityInput; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBreEntityInput1343); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:653:1: ruleBreEntityInput returns [EObject current=null] : ( ( ( ruleFQN ) ) ( (lv_configuration_1_0= ruleEntityConfiguration ) ) ) ;
    public final EObject ruleBreEntityInput() throws RecognitionException {
        EObject current = null;

        EObject lv_configuration_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:656:28: ( ( ( ( ruleFQN ) ) ( (lv_configuration_1_0= ruleEntityConfiguration ) ) ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:657:1: ( ( ( ruleFQN ) ) ( (lv_configuration_1_0= ruleEntityConfiguration ) ) )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:657:1: ( ( ( ruleFQN ) ) ( (lv_configuration_1_0= ruleEntityConfiguration ) ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:657:2: ( ( ruleFQN ) ) ( (lv_configuration_1_0= ruleEntityConfiguration ) )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:657:2: ( ( ruleFQN ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:658:1: ( ruleFQN )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:658:1: ( ruleFQN )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:659:3: ruleFQN
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getBreEntityInputRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getBreEntityInputAccess().getInputElementEntityCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleBreEntityInput1391);
            ruleFQN();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:672:2: ( (lv_configuration_1_0= ruleEntityConfiguration ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:673:1: (lv_configuration_1_0= ruleEntityConfiguration )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:673:1: (lv_configuration_1_0= ruleEntityConfiguration )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:674:3: lv_configuration_1_0= ruleEntityConfiguration
            {
             
            	        newCompositeNode(grammarAccess.getBreEntityInputAccess().getConfigurationEntityConfigurationParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEntityConfiguration_in_ruleBreEntityInput1412);
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


    // $ANTLR start "entryRuleSystemEntityConfiguration"
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:698:1: entryRuleSystemEntityConfiguration returns [EObject current=null] : iv_ruleSystemEntityConfiguration= ruleSystemEntityConfiguration EOF ;
    public final EObject entryRuleSystemEntityConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemEntityConfiguration = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:699:2: (iv_ruleSystemEntityConfiguration= ruleSystemEntityConfiguration EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:700:2: iv_ruleSystemEntityConfiguration= ruleSystemEntityConfiguration EOF
            {
             newCompositeNode(grammarAccess.getSystemEntityConfigurationRule()); 
            pushFollow(FOLLOW_ruleSystemEntityConfiguration_in_entryRuleSystemEntityConfiguration1448);
            iv_ruleSystemEntityConfiguration=ruleSystemEntityConfiguration();

            state._fsp--;

             current =iv_ruleSystemEntityConfiguration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSystemEntityConfiguration1458); 

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
    // $ANTLR end "entryRuleSystemEntityConfiguration"


    // $ANTLR start "ruleSystemEntityConfiguration"
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:707:1: ruleSystemEntityConfiguration returns [EObject current=null] : ( () otherlv_1= '{' otherlv_2= 'prim\\u00E4r' otherlv_3= '=' ( (lv_primary_4_0= ruleBoolean ) ) otherlv_5= ',' otherlv_6= 'obligatorisch' otherlv_7= '=' ( (lv_obligatorisch_8_0= ruleBoolean ) ) otherlv_9= ',' otherlv_10= 'mehrfach' otherlv_11= '=' ( (lv_multiple_12_0= ruleBoolean ) ) (otherlv_13= ',' otherlv_14= 'join Pfad' otherlv_15= '=' ( (lv_joinCriteria_16_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleSystemEntityConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_joinCriteria_16_0=null;
        Enumerator lv_primary_4_0 = null;

        Enumerator lv_obligatorisch_8_0 = null;

        Enumerator lv_multiple_12_0 = null;


         enterRule(); 
            
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:710:28: ( ( () otherlv_1= '{' otherlv_2= 'prim\\u00E4r' otherlv_3= '=' ( (lv_primary_4_0= ruleBoolean ) ) otherlv_5= ',' otherlv_6= 'obligatorisch' otherlv_7= '=' ( (lv_obligatorisch_8_0= ruleBoolean ) ) otherlv_9= ',' otherlv_10= 'mehrfach' otherlv_11= '=' ( (lv_multiple_12_0= ruleBoolean ) ) (otherlv_13= ',' otherlv_14= 'join Pfad' otherlv_15= '=' ( (lv_joinCriteria_16_0= RULE_STRING ) ) )? ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:711:1: ( () otherlv_1= '{' otherlv_2= 'prim\\u00E4r' otherlv_3= '=' ( (lv_primary_4_0= ruleBoolean ) ) otherlv_5= ',' otherlv_6= 'obligatorisch' otherlv_7= '=' ( (lv_obligatorisch_8_0= ruleBoolean ) ) otherlv_9= ',' otherlv_10= 'mehrfach' otherlv_11= '=' ( (lv_multiple_12_0= ruleBoolean ) ) (otherlv_13= ',' otherlv_14= 'join Pfad' otherlv_15= '=' ( (lv_joinCriteria_16_0= RULE_STRING ) ) )? )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:711:1: ( () otherlv_1= '{' otherlv_2= 'prim\\u00E4r' otherlv_3= '=' ( (lv_primary_4_0= ruleBoolean ) ) otherlv_5= ',' otherlv_6= 'obligatorisch' otherlv_7= '=' ( (lv_obligatorisch_8_0= ruleBoolean ) ) otherlv_9= ',' otherlv_10= 'mehrfach' otherlv_11= '=' ( (lv_multiple_12_0= ruleBoolean ) ) (otherlv_13= ',' otherlv_14= 'join Pfad' otherlv_15= '=' ( (lv_joinCriteria_16_0= RULE_STRING ) ) )? )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:711:2: () otherlv_1= '{' otherlv_2= 'prim\\u00E4r' otherlv_3= '=' ( (lv_primary_4_0= ruleBoolean ) ) otherlv_5= ',' otherlv_6= 'obligatorisch' otherlv_7= '=' ( (lv_obligatorisch_8_0= ruleBoolean ) ) otherlv_9= ',' otherlv_10= 'mehrfach' otherlv_11= '=' ( (lv_multiple_12_0= ruleBoolean ) ) (otherlv_13= ',' otherlv_14= 'join Pfad' otherlv_15= '=' ( (lv_joinCriteria_16_0= RULE_STRING ) ) )?
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:711:2: ()
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:712:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSystemEntityConfigurationAccess().getSystemEntityConfigurationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleSystemEntityConfiguration1504); 

                	newLeafNode(otherlv_1, grammarAccess.getSystemEntityConfigurationAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleSystemEntityConfiguration1516); 

                	newLeafNode(otherlv_2, grammarAccess.getSystemEntityConfigurationAccess().getPrimärKeyword_2());
                
            otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleSystemEntityConfiguration1528); 

                	newLeafNode(otherlv_3, grammarAccess.getSystemEntityConfigurationAccess().getEqualsSignKeyword_3());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:729:1: ( (lv_primary_4_0= ruleBoolean ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:730:1: (lv_primary_4_0= ruleBoolean )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:730:1: (lv_primary_4_0= ruleBoolean )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:731:3: lv_primary_4_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getSystemEntityConfigurationAccess().getPrimaryBooleanEnumRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleSystemEntityConfiguration1549);
            lv_primary_4_0=ruleBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSystemEntityConfigurationRule());
            	        }
                   		set(
                   			current, 
                   			"primary",
                    		lv_primary_4_0, 
                    		"Boolean");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleSystemEntityConfiguration1561); 

                	newLeafNode(otherlv_5, grammarAccess.getSystemEntityConfigurationAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleSystemEntityConfiguration1573); 

                	newLeafNode(otherlv_6, grammarAccess.getSystemEntityConfigurationAccess().getObligatorischKeyword_6());
                
            otherlv_7=(Token)match(input,26,FOLLOW_26_in_ruleSystemEntityConfiguration1585); 

                	newLeafNode(otherlv_7, grammarAccess.getSystemEntityConfigurationAccess().getEqualsSignKeyword_7());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:759:1: ( (lv_obligatorisch_8_0= ruleBoolean ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:760:1: (lv_obligatorisch_8_0= ruleBoolean )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:760:1: (lv_obligatorisch_8_0= ruleBoolean )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:761:3: lv_obligatorisch_8_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getSystemEntityConfigurationAccess().getObligatorischBooleanEnumRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleSystemEntityConfiguration1606);
            lv_obligatorisch_8_0=ruleBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSystemEntityConfigurationRule());
            	        }
                   		set(
                   			current, 
                   			"obligatorisch",
                    		lv_obligatorisch_8_0, 
                    		"Boolean");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_9=(Token)match(input,17,FOLLOW_17_in_ruleSystemEntityConfiguration1618); 

                	newLeafNode(otherlv_9, grammarAccess.getSystemEntityConfigurationAccess().getCommaKeyword_9());
                
            otherlv_10=(Token)match(input,28,FOLLOW_28_in_ruleSystemEntityConfiguration1630); 

                	newLeafNode(otherlv_10, grammarAccess.getSystemEntityConfigurationAccess().getMehrfachKeyword_10());
                
            otherlv_11=(Token)match(input,26,FOLLOW_26_in_ruleSystemEntityConfiguration1642); 

                	newLeafNode(otherlv_11, grammarAccess.getSystemEntityConfigurationAccess().getEqualsSignKeyword_11());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:789:1: ( (lv_multiple_12_0= ruleBoolean ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:790:1: (lv_multiple_12_0= ruleBoolean )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:790:1: (lv_multiple_12_0= ruleBoolean )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:791:3: lv_multiple_12_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getSystemEntityConfigurationAccess().getMultipleBooleanEnumRuleCall_12_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleSystemEntityConfiguration1663);
            lv_multiple_12_0=ruleBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSystemEntityConfigurationRule());
            	        }
                   		set(
                   			current, 
                   			"multiple",
                    		lv_multiple_12_0, 
                    		"Boolean");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:807:2: (otherlv_13= ',' otherlv_14= 'join Pfad' otherlv_15= '=' ( (lv_joinCriteria_16_0= RULE_STRING ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==17) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:807:4: otherlv_13= ',' otherlv_14= 'join Pfad' otherlv_15= '=' ( (lv_joinCriteria_16_0= RULE_STRING ) )
                    {
                    otherlv_13=(Token)match(input,17,FOLLOW_17_in_ruleSystemEntityConfiguration1676); 

                        	newLeafNode(otherlv_13, grammarAccess.getSystemEntityConfigurationAccess().getCommaKeyword_13_0());
                        
                    otherlv_14=(Token)match(input,29,FOLLOW_29_in_ruleSystemEntityConfiguration1688); 

                        	newLeafNode(otherlv_14, grammarAccess.getSystemEntityConfigurationAccess().getJoinPfadKeyword_13_1());
                        
                    otherlv_15=(Token)match(input,26,FOLLOW_26_in_ruleSystemEntityConfiguration1700); 

                        	newLeafNode(otherlv_15, grammarAccess.getSystemEntityConfigurationAccess().getEqualsSignKeyword_13_2());
                        
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:819:1: ( (lv_joinCriteria_16_0= RULE_STRING ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:820:1: (lv_joinCriteria_16_0= RULE_STRING )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:820:1: (lv_joinCriteria_16_0= RULE_STRING )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:821:3: lv_joinCriteria_16_0= RULE_STRING
                    {
                    lv_joinCriteria_16_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSystemEntityConfiguration1717); 

                    			newLeafNode(lv_joinCriteria_16_0, grammarAccess.getSystemEntityConfigurationAccess().getJoinCriteriaSTRINGTerminalRuleCall_13_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSystemEntityConfigurationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"joinCriteria",
                            		lv_joinCriteria_16_0, 
                            		"STRING");
                    	    

                    }


                    }


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
    // $ANTLR end "ruleSystemEntityConfiguration"


    // $ANTLR start "entryRuleEntityConfiguration"
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:845:1: entryRuleEntityConfiguration returns [EObject current=null] : iv_ruleEntityConfiguration= ruleEntityConfiguration EOF ;
    public final EObject entryRuleEntityConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityConfiguration = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:846:2: (iv_ruleEntityConfiguration= ruleEntityConfiguration EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:847:2: iv_ruleEntityConfiguration= ruleEntityConfiguration EOF
            {
             newCompositeNode(grammarAccess.getEntityConfigurationRule()); 
            pushFollow(FOLLOW_ruleEntityConfiguration_in_entryRuleEntityConfiguration1760);
            iv_ruleEntityConfiguration=ruleEntityConfiguration();

            state._fsp--;

             current =iv_ruleEntityConfiguration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityConfiguration1770); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:854:1: ruleEntityConfiguration returns [EObject current=null] : ( () otherlv_1= '{' otherlv_2= 'prim\\u00E4r' otherlv_3= '=' ( (lv_primary_4_0= ruleBoolean ) ) otherlv_5= ',' otherlv_6= 'obligatorisch' otherlv_7= '=' ( (lv_obligatorisch_8_0= ruleBoolean ) ) otherlv_9= ',' otherlv_10= 'mehrfach' otherlv_11= '=' ( (lv_multiple_12_0= ruleBoolean ) ) (otherlv_13= ',' otherlv_14= 'Pfad' otherlv_15= '=' ( ( ruleFQN ) ) )? otherlv_17= '}' ) ;
    public final EObject ruleEntityConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Enumerator lv_primary_4_0 = null;

        Enumerator lv_obligatorisch_8_0 = null;

        Enumerator lv_multiple_12_0 = null;


         enterRule(); 
            
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:857:28: ( ( () otherlv_1= '{' otherlv_2= 'prim\\u00E4r' otherlv_3= '=' ( (lv_primary_4_0= ruleBoolean ) ) otherlv_5= ',' otherlv_6= 'obligatorisch' otherlv_7= '=' ( (lv_obligatorisch_8_0= ruleBoolean ) ) otherlv_9= ',' otherlv_10= 'mehrfach' otherlv_11= '=' ( (lv_multiple_12_0= ruleBoolean ) ) (otherlv_13= ',' otherlv_14= 'Pfad' otherlv_15= '=' ( ( ruleFQN ) ) )? otherlv_17= '}' ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:858:1: ( () otherlv_1= '{' otherlv_2= 'prim\\u00E4r' otherlv_3= '=' ( (lv_primary_4_0= ruleBoolean ) ) otherlv_5= ',' otherlv_6= 'obligatorisch' otherlv_7= '=' ( (lv_obligatorisch_8_0= ruleBoolean ) ) otherlv_9= ',' otherlv_10= 'mehrfach' otherlv_11= '=' ( (lv_multiple_12_0= ruleBoolean ) ) (otherlv_13= ',' otherlv_14= 'Pfad' otherlv_15= '=' ( ( ruleFQN ) ) )? otherlv_17= '}' )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:858:1: ( () otherlv_1= '{' otherlv_2= 'prim\\u00E4r' otherlv_3= '=' ( (lv_primary_4_0= ruleBoolean ) ) otherlv_5= ',' otherlv_6= 'obligatorisch' otherlv_7= '=' ( (lv_obligatorisch_8_0= ruleBoolean ) ) otherlv_9= ',' otherlv_10= 'mehrfach' otherlv_11= '=' ( (lv_multiple_12_0= ruleBoolean ) ) (otherlv_13= ',' otherlv_14= 'Pfad' otherlv_15= '=' ( ( ruleFQN ) ) )? otherlv_17= '}' )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:858:2: () otherlv_1= '{' otherlv_2= 'prim\\u00E4r' otherlv_3= '=' ( (lv_primary_4_0= ruleBoolean ) ) otherlv_5= ',' otherlv_6= 'obligatorisch' otherlv_7= '=' ( (lv_obligatorisch_8_0= ruleBoolean ) ) otherlv_9= ',' otherlv_10= 'mehrfach' otherlv_11= '=' ( (lv_multiple_12_0= ruleBoolean ) ) (otherlv_13= ',' otherlv_14= 'Pfad' otherlv_15= '=' ( ( ruleFQN ) ) )? otherlv_17= '}'
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:858:2: ()
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:859:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEntityConfigurationAccess().getEntityConfigurationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleEntityConfiguration1816); 

                	newLeafNode(otherlv_1, grammarAccess.getEntityConfigurationAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleEntityConfiguration1828); 

                	newLeafNode(otherlv_2, grammarAccess.getEntityConfigurationAccess().getPrimärKeyword_2());
                
            otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleEntityConfiguration1840); 

                	newLeafNode(otherlv_3, grammarAccess.getEntityConfigurationAccess().getEqualsSignKeyword_3());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:876:1: ( (lv_primary_4_0= ruleBoolean ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:877:1: (lv_primary_4_0= ruleBoolean )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:877:1: (lv_primary_4_0= ruleBoolean )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:878:3: lv_primary_4_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getEntityConfigurationAccess().getPrimaryBooleanEnumRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleEntityConfiguration1861);
            lv_primary_4_0=ruleBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEntityConfigurationRule());
            	        }
                   		set(
                   			current, 
                   			"primary",
                    		lv_primary_4_0, 
                    		"Boolean");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleEntityConfiguration1873); 

                	newLeafNode(otherlv_5, grammarAccess.getEntityConfigurationAccess().getCommaKeyword_5());
                
            otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleEntityConfiguration1885); 

                	newLeafNode(otherlv_6, grammarAccess.getEntityConfigurationAccess().getObligatorischKeyword_6());
                
            otherlv_7=(Token)match(input,26,FOLLOW_26_in_ruleEntityConfiguration1897); 

                	newLeafNode(otherlv_7, grammarAccess.getEntityConfigurationAccess().getEqualsSignKeyword_7());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:906:1: ( (lv_obligatorisch_8_0= ruleBoolean ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:907:1: (lv_obligatorisch_8_0= ruleBoolean )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:907:1: (lv_obligatorisch_8_0= ruleBoolean )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:908:3: lv_obligatorisch_8_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getEntityConfigurationAccess().getObligatorischBooleanEnumRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleEntityConfiguration1918);
            lv_obligatorisch_8_0=ruleBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEntityConfigurationRule());
            	        }
                   		set(
                   			current, 
                   			"obligatorisch",
                    		lv_obligatorisch_8_0, 
                    		"Boolean");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_9=(Token)match(input,17,FOLLOW_17_in_ruleEntityConfiguration1930); 

                	newLeafNode(otherlv_9, grammarAccess.getEntityConfigurationAccess().getCommaKeyword_9());
                
            otherlv_10=(Token)match(input,28,FOLLOW_28_in_ruleEntityConfiguration1942); 

                	newLeafNode(otherlv_10, grammarAccess.getEntityConfigurationAccess().getMehrfachKeyword_10());
                
            otherlv_11=(Token)match(input,26,FOLLOW_26_in_ruleEntityConfiguration1954); 

                	newLeafNode(otherlv_11, grammarAccess.getEntityConfigurationAccess().getEqualsSignKeyword_11());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:936:1: ( (lv_multiple_12_0= ruleBoolean ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:937:1: (lv_multiple_12_0= ruleBoolean )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:937:1: (lv_multiple_12_0= ruleBoolean )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:938:3: lv_multiple_12_0= ruleBoolean
            {
             
            	        newCompositeNode(grammarAccess.getEntityConfigurationAccess().getMultipleBooleanEnumRuleCall_12_0()); 
            	    
            pushFollow(FOLLOW_ruleBoolean_in_ruleEntityConfiguration1975);
            lv_multiple_12_0=ruleBoolean();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEntityConfigurationRule());
            	        }
                   		set(
                   			current, 
                   			"multiple",
                    		lv_multiple_12_0, 
                    		"Boolean");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:954:2: (otherlv_13= ',' otherlv_14= 'Pfad' otherlv_15= '=' ( ( ruleFQN ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==17) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:954:4: otherlv_13= ',' otherlv_14= 'Pfad' otherlv_15= '=' ( ( ruleFQN ) )
                    {
                    otherlv_13=(Token)match(input,17,FOLLOW_17_in_ruleEntityConfiguration1988); 

                        	newLeafNode(otherlv_13, grammarAccess.getEntityConfigurationAccess().getCommaKeyword_13_0());
                        
                    otherlv_14=(Token)match(input,30,FOLLOW_30_in_ruleEntityConfiguration2000); 

                        	newLeafNode(otherlv_14, grammarAccess.getEntityConfigurationAccess().getPfadKeyword_13_1());
                        
                    otherlv_15=(Token)match(input,26,FOLLOW_26_in_ruleEntityConfiguration2012); 

                        	newLeafNode(otherlv_15, grammarAccess.getEntityConfigurationAccess().getEqualsSignKeyword_13_2());
                        
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:966:1: ( ( ruleFQN ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:967:1: ( ruleFQN )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:967:1: ( ruleFQN )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:968:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEntityConfigurationRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEntityConfigurationAccess().getPathAssociationCrossReference_13_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleEntityConfiguration2035);
                    ruleFQN();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,13,FOLLOW_13_in_ruleEntityConfiguration2049); 

                	newLeafNode(otherlv_17, grammarAccess.getEntityConfigurationAccess().getRightCurlyBracketKeyword_14());
                

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:993:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:994:2: (iv_ruleSystem= ruleSystem EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:995:2: iv_ruleSystem= ruleSystem EOF
            {
             newCompositeNode(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_ruleSystem_in_entryRuleSystem2085);
            iv_ruleSystem=ruleSystem();

            state._fsp--;

             current =iv_ruleSystem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSystem2095); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1002:1: ruleSystem returns [EObject current=null] : (otherlv_0= 'SourceSystem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_srcEntities_3_0= ruleSystemEntity ) ) otherlv_4= '}' ) ;
    public final EObject ruleSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_srcEntities_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1005:28: ( (otherlv_0= 'SourceSystem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_srcEntities_3_0= ruleSystemEntity ) ) otherlv_4= '}' ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1006:1: (otherlv_0= 'SourceSystem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_srcEntities_3_0= ruleSystemEntity ) ) otherlv_4= '}' )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1006:1: (otherlv_0= 'SourceSystem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_srcEntities_3_0= ruleSystemEntity ) ) otherlv_4= '}' )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1006:3: otherlv_0= 'SourceSystem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_srcEntities_3_0= ruleSystemEntity ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleSystem2132); 

                	newLeafNode(otherlv_0, grammarAccess.getSystemAccess().getSourceSystemKeyword_0());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1010:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1011:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1011:1: (lv_name_1_0= RULE_ID )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1012:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSystem2149); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleSystem2166); 

                	newLeafNode(otherlv_2, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1032:1: ( (lv_srcEntities_3_0= ruleSystemEntity ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1033:1: (lv_srcEntities_3_0= ruleSystemEntity )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1033:1: (lv_srcEntities_3_0= ruleSystemEntity )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1034:3: lv_srcEntities_3_0= ruleSystemEntity
            {
             
            	        newCompositeNode(grammarAccess.getSystemAccess().getSrcEntitiesSystemEntityParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSystemEntity_in_ruleSystem2187);
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

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleSystem2199); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1062:1: entryRuleSystemEntity returns [EObject current=null] : iv_ruleSystemEntity= ruleSystemEntity EOF ;
    public final EObject entryRuleSystemEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemEntity = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1063:2: (iv_ruleSystemEntity= ruleSystemEntity EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1064:2: iv_ruleSystemEntity= ruleSystemEntity EOF
            {
             newCompositeNode(grammarAccess.getSystemEntityRule()); 
            pushFollow(FOLLOW_ruleSystemEntity_in_entryRuleSystemEntity2235);
            iv_ruleSystemEntity=ruleSystemEntity();

            state._fsp--;

             current =iv_ruleSystemEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSystemEntity2245); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1071:1: ruleSystemEntity returns [EObject current=null] : (otherlv_0= 'SystemEntit\\u00E4t' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Format' ( (lv_format_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleSystemEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_format_3_0=null;

         enterRule(); 
            
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1074:28: ( (otherlv_0= 'SystemEntit\\u00E4t' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Format' ( (lv_format_3_0= RULE_STRING ) ) ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1075:1: (otherlv_0= 'SystemEntit\\u00E4t' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Format' ( (lv_format_3_0= RULE_STRING ) ) )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1075:1: (otherlv_0= 'SystemEntit\\u00E4t' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Format' ( (lv_format_3_0= RULE_STRING ) ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1075:3: otherlv_0= 'SystemEntit\\u00E4t' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Format' ( (lv_format_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleSystemEntity2282); 

                	newLeafNode(otherlv_0, grammarAccess.getSystemEntityAccess().getSystemEntitätKeyword_0());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1079:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1080:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1080:1: (lv_name_1_0= RULE_ID )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1081:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSystemEntity2299); 

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

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleSystemEntity2316); 

                	newLeafNode(otherlv_2, grammarAccess.getSystemEntityAccess().getFormatKeyword_2());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1101:1: ( (lv_format_3_0= RULE_STRING ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1102:1: (lv_format_3_0= RULE_STRING )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1102:1: (lv_format_3_0= RULE_STRING )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1103:3: lv_format_3_0= RULE_STRING
            {
            lv_format_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSystemEntity2333); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1127:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1128:2: (iv_ruleImport= ruleImport EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1129:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport2374);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport2384); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1136:1: ruleImport returns [EObject current=null] : (otherlv_0= 'Import' ( (lv_importedNamespace_1_0= ruleFqnWithWildCard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1139:28: ( (otherlv_0= 'Import' ( (lv_importedNamespace_1_0= ruleFqnWithWildCard ) ) ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1140:1: (otherlv_0= 'Import' ( (lv_importedNamespace_1_0= ruleFqnWithWildCard ) ) )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1140:1: (otherlv_0= 'Import' ( (lv_importedNamespace_1_0= ruleFqnWithWildCard ) ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1140:3: otherlv_0= 'Import' ( (lv_importedNamespace_1_0= ruleFqnWithWildCard ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleImport2421); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1144:1: ( (lv_importedNamespace_1_0= ruleFqnWithWildCard ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1145:1: (lv_importedNamespace_1_0= ruleFqnWithWildCard )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1145:1: (lv_importedNamespace_1_0= ruleFqnWithWildCard )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1146:3: lv_importedNamespace_1_0= ruleFqnWithWildCard
            {
             
            	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceFqnWithWildCardParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFqnWithWildCard_in_ruleImport2442);
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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1170:1: entryRuleFqnWithWildCard returns [String current=null] : iv_ruleFqnWithWildCard= ruleFqnWithWildCard EOF ;
    public final String entryRuleFqnWithWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFqnWithWildCard = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1171:2: (iv_ruleFqnWithWildCard= ruleFqnWithWildCard EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1172:2: iv_ruleFqnWithWildCard= ruleFqnWithWildCard EOF
            {
             newCompositeNode(grammarAccess.getFqnWithWildCardRule()); 
            pushFollow(FOLLOW_ruleFqnWithWildCard_in_entryRuleFqnWithWildCard2479);
            iv_ruleFqnWithWildCard=ruleFqnWithWildCard();

            state._fsp--;

             current =iv_ruleFqnWithWildCard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFqnWithWildCard2490); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1179:1: ruleFqnWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FQN_0= ruleFQN (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleFqnWithWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FQN_0 = null;


         enterRule(); 
            
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1182:28: ( (this_FQN_0= ruleFQN (kw= '.*' )? ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1183:1: (this_FQN_0= ruleFQN (kw= '.*' )? )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1183:1: (this_FQN_0= ruleFQN (kw= '.*' )? )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1184:5: this_FQN_0= ruleFQN (kw= '.*' )?
            {
             
                    newCompositeNode(grammarAccess.getFqnWithWildCardAccess().getFQNParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleFQN_in_ruleFqnWithWildCard2537);
            this_FQN_0=ruleFQN();

            state._fsp--;


            		current.merge(this_FQN_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1194:1: (kw= '.*' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==35) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1195:2: kw= '.*'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleFqnWithWildCard2556); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1208:1: entryRuleDiagram returns [EObject current=null] : iv_ruleDiagram= ruleDiagram EOF ;
    public final EObject entryRuleDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiagram = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1209:2: (iv_ruleDiagram= ruleDiagram EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1210:2: iv_ruleDiagram= ruleDiagram EOF
            {
             newCompositeNode(grammarAccess.getDiagramRule()); 
            pushFollow(FOLLOW_ruleDiagram_in_entryRuleDiagram2598);
            iv_ruleDiagram=ruleDiagram();

            state._fsp--;

             current =iv_ruleDiagram; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDiagram2608); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1217:1: ruleDiagram returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'Diagram' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_includes_4_0= ruleInclude ) )* otherlv_5= '}' ) ;
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
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1220:28: ( ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'Diagram' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_includes_4_0= ruleInclude ) )* otherlv_5= '}' ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1221:1: ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'Diagram' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_includes_4_0= ruleInclude ) )* otherlv_5= '}' )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1221:1: ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'Diagram' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_includes_4_0= ruleInclude ) )* otherlv_5= '}' )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1221:2: ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'Diagram' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_includes_4_0= ruleInclude ) )* otherlv_5= '}'
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1221:2: ( (lv_imports_0_0= ruleImport ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==34) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1222:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1222:1: (lv_imports_0_0= ruleImport )
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1223:3: lv_imports_0_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDiagramAccess().getImportsImportParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleDiagram2654);
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
            	    break loop14;
                }
            } while (true);

            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleDiagram2667); 

                	newLeafNode(otherlv_1, grammarAccess.getDiagramAccess().getDiagramKeyword_1());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1243:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1244:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1244:1: (lv_name_2_0= RULE_ID )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1245:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDiagram2684); 

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

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleDiagram2701); 

                	newLeafNode(otherlv_3, grammarAccess.getDiagramAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1265:1: ( (lv_includes_4_0= ruleInclude ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=37 && LA15_0<=38)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1266:1: (lv_includes_4_0= ruleInclude )
            	    {
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1266:1: (lv_includes_4_0= ruleInclude )
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1267:3: lv_includes_4_0= ruleInclude
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDiagramAccess().getIncludesIncludeParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInclude_in_ruleDiagram2722);
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
            	    break loop15;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleDiagram2735); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1295:1: entryRuleInclude returns [EObject current=null] : iv_ruleInclude= ruleInclude EOF ;
    public final EObject entryRuleInclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInclude = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1296:2: (iv_ruleInclude= ruleInclude EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1297:2: iv_ruleInclude= ruleInclude EOF
            {
             newCompositeNode(grammarAccess.getIncludeRule()); 
            pushFollow(FOLLOW_ruleInclude_in_entryRuleInclude2771);
            iv_ruleInclude=ruleInclude();

            state._fsp--;

             current =iv_ruleInclude; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInclude2781); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1304:1: ruleInclude returns [EObject current=null] : ( ( ( (lv_include_0_1= 'Include' | lv_include_0_2= 'Exclude' ) ) ) ( ( ruleFQN ) ) (otherlv_2= 'with' otherlv_3= '{' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' ) ) ;
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
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1307:28: ( ( ( ( (lv_include_0_1= 'Include' | lv_include_0_2= 'Exclude' ) ) ) ( ( ruleFQN ) ) (otherlv_2= 'with' otherlv_3= '{' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' ) ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1308:1: ( ( ( (lv_include_0_1= 'Include' | lv_include_0_2= 'Exclude' ) ) ) ( ( ruleFQN ) ) (otherlv_2= 'with' otherlv_3= '{' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' ) )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1308:1: ( ( ( (lv_include_0_1= 'Include' | lv_include_0_2= 'Exclude' ) ) ) ( ( ruleFQN ) ) (otherlv_2= 'with' otherlv_3= '{' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1308:2: ( ( (lv_include_0_1= 'Include' | lv_include_0_2= 'Exclude' ) ) ) ( ( ruleFQN ) ) (otherlv_2= 'with' otherlv_3= '{' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1308:2: ( ( (lv_include_0_1= 'Include' | lv_include_0_2= 'Exclude' ) ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1309:1: ( (lv_include_0_1= 'Include' | lv_include_0_2= 'Exclude' ) )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1309:1: ( (lv_include_0_1= 'Include' | lv_include_0_2= 'Exclude' ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1310:1: (lv_include_0_1= 'Include' | lv_include_0_2= 'Exclude' )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1310:1: (lv_include_0_1= 'Include' | lv_include_0_2= 'Exclude' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==37) ) {
                alt16=1;
            }
            else if ( (LA16_0==38) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1311:3: lv_include_0_1= 'Include'
                    {
                    lv_include_0_1=(Token)match(input,37,FOLLOW_37_in_ruleInclude2826); 

                            newLeafNode(lv_include_0_1, grammarAccess.getIncludeAccess().getIncludeIncludeKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIncludeRule());
                    	        }
                           		setWithLastConsumed(current, "include", lv_include_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1323:8: lv_include_0_2= 'Exclude'
                    {
                    lv_include_0_2=(Token)match(input,38,FOLLOW_38_in_ruleInclude2855); 

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

            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1338:2: ( ( ruleFQN ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1339:1: ( ruleFQN )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1339:1: ( ruleFQN )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1340:3: ruleFQN
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIncludeRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getIncludeAccess().getEntityEntityCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleInclude2894);
            ruleFQN();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1353:2: (otherlv_2= 'with' otherlv_3= '{' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1353:4: otherlv_2= 'with' otherlv_3= '{' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}'
            {
            otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleInclude2907); 

                	newLeafNode(otherlv_2, grammarAccess.getIncludeAccess().getWithKeyword_2_0());
                
            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleInclude2919); 

                	newLeafNode(otherlv_3, grammarAccess.getIncludeAccess().getLeftCurlyBracketKeyword_2_1());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1361:1: ( (otherlv_4= RULE_ID ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1362:1: (otherlv_4= RULE_ID )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1362:1: (otherlv_4= RULE_ID )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1363:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIncludeRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInclude2939); 

            		newLeafNode(otherlv_4, grammarAccess.getIncludeAccess().getFieldsPropertyCrossReference_2_2_0()); 
            	

            }


            }

            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1374:2: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==17) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1374:4: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleInclude2952); 

            	        	newLeafNode(otherlv_5, grammarAccess.getIncludeAccess().getCommaKeyword_2_3_0());
            	        
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1378:1: ( (otherlv_6= RULE_ID ) )
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1379:1: (otherlv_6= RULE_ID )
            	    {
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1379:1: (otherlv_6= RULE_ID )
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1380:3: otherlv_6= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getIncludeRule());
            	    	        }
            	            
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInclude2972); 

            	    		newLeafNode(otherlv_6, grammarAccess.getIncludeAccess().getFieldsPropertyCrossReference_2_3_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleInclude2986); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1403:1: entryRuleEnumDeclaration returns [EObject current=null] : iv_ruleEnumDeclaration= ruleEnumDeclaration EOF ;
    public final EObject entryRuleEnumDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumDeclaration = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1404:2: (iv_ruleEnumDeclaration= ruleEnumDeclaration EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1405:2: iv_ruleEnumDeclaration= ruleEnumDeclaration EOF
            {
             newCompositeNode(grammarAccess.getEnumDeclarationRule()); 
            pushFollow(FOLLOW_ruleEnumDeclaration_in_entryRuleEnumDeclaration3023);
            iv_ruleEnumDeclaration=ruleEnumDeclaration();

            state._fsp--;

             current =iv_ruleEnumDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumDeclaration3033); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1412:1: ruleEnumDeclaration returns [EObject current=null] : (otherlv_0= 'Enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' this_ID_5= RULE_ID )* otherlv_6= '}' ) ;
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
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1415:28: ( (otherlv_0= 'Enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' this_ID_5= RULE_ID )* otherlv_6= '}' ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1416:1: (otherlv_0= 'Enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' this_ID_5= RULE_ID )* otherlv_6= '}' )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1416:1: (otherlv_0= 'Enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' this_ID_5= RULE_ID )* otherlv_6= '}' )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1416:3: otherlv_0= 'Enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' this_ID_5= RULE_ID )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleEnumDeclaration3070); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumDeclarationAccess().getEnumerationKeyword_0());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1420:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1421:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1421:1: (lv_name_1_0= RULE_ID )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1422:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumDeclaration3087); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleEnumDeclaration3104); 

                	newLeafNode(otherlv_2, grammarAccess.getEnumDeclarationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1442:1: ( (lv_values_3_0= RULE_ID ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1443:1: (lv_values_3_0= RULE_ID )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1443:1: (lv_values_3_0= RULE_ID )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1444:3: lv_values_3_0= RULE_ID
            {
            lv_values_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumDeclaration3121); 

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

            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1460:2: (otherlv_4= ',' this_ID_5= RULE_ID )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==17) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1460:4: otherlv_4= ',' this_ID_5= RULE_ID
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleEnumDeclaration3139); 

            	        	newLeafNode(otherlv_4, grammarAccess.getEnumDeclarationAccess().getCommaKeyword_4_0());
            	        
            	    this_ID_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumDeclaration3150); 
            	     
            	        newLeafNode(this_ID_5, grammarAccess.getEnumDeclarationAccess().getIDTerminalRuleCall_4_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleEnumDeclaration3163); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1480:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1481:2: (iv_ruleFQN= ruleFQN EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1482:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN3200);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN3211); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1489:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1492:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1493:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1493:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1493:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN3251); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1500:1: (kw= '.' this_ID_2= RULE_ID )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==41) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1501:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,41,FOLLOW_41_in_ruleFQN3270); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN3285); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1521:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1522:2: (iv_ruleEntity= ruleEntity EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1523:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity3332);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity3342); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1530:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_properties_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1533:28: ( (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1534:1: (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1534:1: (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1534:3: otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleEntity3379); 

                	newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1538:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1539:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1539:1: (lv_name_1_0= RULE_ID )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1540:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity3396); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleEntity3413); 

                	newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1560:1: ( (lv_properties_3_0= ruleProperty ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==45||LA20_0==47) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1561:1: (lv_properties_3_0= ruleProperty )
            	    {
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1561:1: (lv_properties_3_0= ruleProperty )
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1562:3: lv_properties_3_0= ruleProperty
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getPropertiesPropertyParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProperty_in_ruleEntity3434);
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
            	    break loop20;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleEntity3447); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1590:1: entryRuleDomain returns [EObject current=null] : iv_ruleDomain= ruleDomain EOF ;
    public final EObject entryRuleDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomain = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1591:2: (iv_ruleDomain= ruleDomain EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1592:2: iv_ruleDomain= ruleDomain EOF
            {
             newCompositeNode(grammarAccess.getDomainRule()); 
            pushFollow(FOLLOW_ruleDomain_in_entryRuleDomain3483);
            iv_ruleDomain=ruleDomain();

            state._fsp--;

             current =iv_ruleDomain; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomain3493); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1599:1: ruleDomain returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'Domain' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'Description: ' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= '{' ( (lv_entities_6_0= ruleEntity ) )+ otherlv_7= '}' ) ;
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
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1602:28: ( ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'Domain' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'Description: ' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= '{' ( (lv_entities_6_0= ruleEntity ) )+ otherlv_7= '}' ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1603:1: ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'Domain' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'Description: ' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= '{' ( (lv_entities_6_0= ruleEntity ) )+ otherlv_7= '}' )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1603:1: ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'Domain' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'Description: ' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= '{' ( (lv_entities_6_0= ruleEntity ) )+ otherlv_7= '}' )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1603:2: ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'Domain' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'Description: ' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= '{' ( (lv_entities_6_0= ruleEntity ) )+ otherlv_7= '}'
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1603:2: ( (lv_imports_0_0= ruleImport ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==34) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1604:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1604:1: (lv_imports_0_0= ruleImport )
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1605:3: lv_imports_0_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDomainAccess().getImportsImportParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleDomain3539);
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
            	    break loop21;
                }
            } while (true);

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleDomain3552); 

                	newLeafNode(otherlv_1, grammarAccess.getDomainAccess().getDomainKeyword_1());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1625:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1626:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1626:1: (lv_name_2_0= RULE_ID )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1627:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDomain3569); 

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

            otherlv_3=(Token)match(input,44,FOLLOW_44_in_ruleDomain3586); 

                	newLeafNode(otherlv_3, grammarAccess.getDomainAccess().getDescriptionKeyword_3());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1647:1: ( (lv_description_4_0= RULE_STRING ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1648:1: (lv_description_4_0= RULE_STRING )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1648:1: (lv_description_4_0= RULE_STRING )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1649:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDomain3603); 

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

            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleDomain3620); 

                	newLeafNode(otherlv_5, grammarAccess.getDomainAccess().getLeftCurlyBracketKeyword_5());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1669:1: ( (lv_entities_6_0= ruleEntity ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==42) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1670:1: (lv_entities_6_0= ruleEntity )
            	    {
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1670:1: (lv_entities_6_0= ruleEntity )
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1671:3: lv_entities_6_0= ruleEntity
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDomainAccess().getEntitiesEntityParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEntity_in_ruleDomain3641);
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
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleDomain3654); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1699:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1700:2: (iv_ruleProperty= ruleProperty EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1701:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty3690);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty3700); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1708:1: ruleProperty returns [EObject current=null] : (this_Field_0= ruleField | this_Association_1= ruleAssociation ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        EObject this_Field_0 = null;

        EObject this_Association_1 = null;


         enterRule(); 
            
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1711:28: ( (this_Field_0= ruleField | this_Association_1= ruleAssociation ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1712:1: (this_Field_0= ruleField | this_Association_1= ruleAssociation )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1712:1: (this_Field_0= ruleField | this_Association_1= ruleAssociation )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==47) ) {
                alt23=1;
            }
            else if ( (LA23_0==45) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1713:5: this_Field_0= ruleField
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyAccess().getFieldParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleField_in_ruleProperty3747);
                    this_Field_0=ruleField();

                    state._fsp--;

                     
                            current = this_Field_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1723:5: this_Association_1= ruleAssociation
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyAccess().getAssociationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAssociation_in_ruleProperty3774);
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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1739:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1740:2: (iv_ruleAssociation= ruleAssociation EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1741:2: iv_ruleAssociation= ruleAssociation EOF
            {
             newCompositeNode(grammarAccess.getAssociationRule()); 
            pushFollow(FOLLOW_ruleAssociation_in_entryRuleAssociation3809);
            iv_ruleAssociation=ruleAssociation();

            state._fsp--;

             current =iv_ruleAssociation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssociation3819); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1748:1: ruleAssociation returns [EObject current=null] : (otherlv_0= 'Relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleFQN ) ) ( (lv_multiplicity_4_0= ruleMultiplicty ) ) ) ;
    public final EObject ruleAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_multiplicity_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1751:28: ( (otherlv_0= 'Relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleFQN ) ) ( (lv_multiplicity_4_0= ruleMultiplicty ) ) ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1752:1: (otherlv_0= 'Relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleFQN ) ) ( (lv_multiplicity_4_0= ruleMultiplicty ) ) )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1752:1: (otherlv_0= 'Relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleFQN ) ) ( (lv_multiplicity_4_0= ruleMultiplicty ) ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1752:3: otherlv_0= 'Relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleFQN ) ) ( (lv_multiplicity_4_0= ruleMultiplicty ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleAssociation3856); 

                	newLeafNode(otherlv_0, grammarAccess.getAssociationAccess().getRelationKeyword_0());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1756:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1757:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1757:1: (lv_name_1_0= RULE_ID )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1758:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssociation3873); 

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

            otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleAssociation3890); 

                	newLeafNode(otherlv_2, grammarAccess.getAssociationAccess().getColonKeyword_2());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1778:1: ( ( ruleFQN ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1779:1: ( ruleFQN )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1779:1: ( ruleFQN )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1780:3: ruleFQN
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAssociationRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAssociationAccess().getTypeEntityCrossReference_3_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleAssociation3913);
            ruleFQN();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1793:2: ( (lv_multiplicity_4_0= ruleMultiplicty ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1794:1: (lv_multiplicity_4_0= ruleMultiplicty )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1794:1: (lv_multiplicity_4_0= ruleMultiplicty )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1795:3: lv_multiplicity_4_0= ruleMultiplicty
            {
             
            	        newCompositeNode(grammarAccess.getAssociationAccess().getMultiplicityMultiplictyEnumRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleMultiplicty_in_ruleAssociation3934);
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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1819:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1820:2: (iv_ruleField= ruleField EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1821:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField3970);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField3980); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1828:1: ruleField returns [EObject current=null] : (otherlv_0= 'Field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_literal_3_0= ruleLiteral ) ) ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_literal_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1831:28: ( (otherlv_0= 'Field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_literal_3_0= ruleLiteral ) ) ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1832:1: (otherlv_0= 'Field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_literal_3_0= ruleLiteral ) ) )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1832:1: (otherlv_0= 'Field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_literal_3_0= ruleLiteral ) ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1832:3: otherlv_0= 'Field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_literal_3_0= ruleLiteral ) )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleField4017); 

                	newLeafNode(otherlv_0, grammarAccess.getFieldAccess().getFieldKeyword_0());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1836:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1837:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1837:1: (lv_name_1_0= RULE_ID )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1838:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleField4034); 

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

            otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleField4051); 

                	newLeafNode(otherlv_2, grammarAccess.getFieldAccess().getColonKeyword_2());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1858:1: ( (lv_literal_3_0= ruleLiteral ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1859:1: (lv_literal_3_0= ruleLiteral )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1859:1: (lv_literal_3_0= ruleLiteral )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1860:3: lv_literal_3_0= ruleLiteral
            {
             
            	        newCompositeNode(grammarAccess.getFieldAccess().getLiteralLiteralParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleLiteral_in_ruleField4072);
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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1884:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1885:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1886:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral4108);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral4118); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1893:1: ruleLiteral returns [EObject current=null] : ( ( () ( (lv_name_1_0= 'Decimal' ) ) ) | ( () ( (lv_name_3_0= 'Money' ) ) ) | ( () ( (lv_name_5_0= 'Text' ) ) ) | ( () ( (lv_name_7_0= 'Boolean' ) ) ) | ( () ( (lv_name_9_0= 'Int' ) ) ) | this_Enum_10= ruleEnum ) ;
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
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1896:28: ( ( ( () ( (lv_name_1_0= 'Decimal' ) ) ) | ( () ( (lv_name_3_0= 'Money' ) ) ) | ( () ( (lv_name_5_0= 'Text' ) ) ) | ( () ( (lv_name_7_0= 'Boolean' ) ) ) | ( () ( (lv_name_9_0= 'Int' ) ) ) | this_Enum_10= ruleEnum ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1897:1: ( ( () ( (lv_name_1_0= 'Decimal' ) ) ) | ( () ( (lv_name_3_0= 'Money' ) ) ) | ( () ( (lv_name_5_0= 'Text' ) ) ) | ( () ( (lv_name_7_0= 'Boolean' ) ) ) | ( () ( (lv_name_9_0= 'Int' ) ) ) | this_Enum_10= ruleEnum )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1897:1: ( ( () ( (lv_name_1_0= 'Decimal' ) ) ) | ( () ( (lv_name_3_0= 'Money' ) ) ) | ( () ( (lv_name_5_0= 'Text' ) ) ) | ( () ( (lv_name_7_0= 'Boolean' ) ) ) | ( () ( (lv_name_9_0= 'Int' ) ) ) | this_Enum_10= ruleEnum )
            int alt24=6;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt24=1;
                }
                break;
            case 49:
                {
                alt24=2;
                }
                break;
            case 50:
                {
                alt24=3;
                }
                break;
            case 51:
                {
                alt24=4;
                }
                break;
            case 52:
                {
                alt24=5;
                }
                break;
            case 53:
                {
                alt24=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1897:2: ( () ( (lv_name_1_0= 'Decimal' ) ) )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1897:2: ( () ( (lv_name_1_0= 'Decimal' ) ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1897:3: () ( (lv_name_1_0= 'Decimal' ) )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1897:3: ()
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1898:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLiteralAccess().getLiteralAction_0_0(),
                                current);
                        

                    }

                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1903:2: ( (lv_name_1_0= 'Decimal' ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1904:1: (lv_name_1_0= 'Decimal' )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1904:1: (lv_name_1_0= 'Decimal' )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1905:3: lv_name_1_0= 'Decimal'
                    {
                    lv_name_1_0=(Token)match(input,48,FOLLOW_48_in_ruleLiteral4171); 

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
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1919:6: ( () ( (lv_name_3_0= 'Money' ) ) )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1919:6: ( () ( (lv_name_3_0= 'Money' ) ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1919:7: () ( (lv_name_3_0= 'Money' ) )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1919:7: ()
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1920:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLiteralAccess().getLiteralAction_1_0(),
                                current);
                        

                    }

                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1925:2: ( (lv_name_3_0= 'Money' ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1926:1: (lv_name_3_0= 'Money' )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1926:1: (lv_name_3_0= 'Money' )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1927:3: lv_name_3_0= 'Money'
                    {
                    lv_name_3_0=(Token)match(input,49,FOLLOW_49_in_ruleLiteral4219); 

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
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1941:6: ( () ( (lv_name_5_0= 'Text' ) ) )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1941:6: ( () ( (lv_name_5_0= 'Text' ) ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1941:7: () ( (lv_name_5_0= 'Text' ) )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1941:7: ()
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1942:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLiteralAccess().getLiteralAction_2_0(),
                                current);
                        

                    }

                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1947:2: ( (lv_name_5_0= 'Text' ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1948:1: (lv_name_5_0= 'Text' )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1948:1: (lv_name_5_0= 'Text' )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1949:3: lv_name_5_0= 'Text'
                    {
                    lv_name_5_0=(Token)match(input,50,FOLLOW_50_in_ruleLiteral4267); 

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
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1963:6: ( () ( (lv_name_7_0= 'Boolean' ) ) )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1963:6: ( () ( (lv_name_7_0= 'Boolean' ) ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1963:7: () ( (lv_name_7_0= 'Boolean' ) )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1963:7: ()
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1964:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLiteralAccess().getLiteralAction_3_0(),
                                current);
                        

                    }

                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1969:2: ( (lv_name_7_0= 'Boolean' ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1970:1: (lv_name_7_0= 'Boolean' )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1970:1: (lv_name_7_0= 'Boolean' )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1971:3: lv_name_7_0= 'Boolean'
                    {
                    lv_name_7_0=(Token)match(input,51,FOLLOW_51_in_ruleLiteral4315); 

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
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1985:6: ( () ( (lv_name_9_0= 'Int' ) ) )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1985:6: ( () ( (lv_name_9_0= 'Int' ) ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1985:7: () ( (lv_name_9_0= 'Int' ) )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1985:7: ()
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1986:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLiteralAccess().getLiteralAction_4_0(),
                                current);
                        

                    }

                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1991:2: ( (lv_name_9_0= 'Int' ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1992:1: (lv_name_9_0= 'Int' )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1992:1: (lv_name_9_0= 'Int' )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1993:3: lv_name_9_0= 'Int'
                    {
                    lv_name_9_0=(Token)match(input,52,FOLLOW_52_in_ruleLiteral4363); 

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
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:2008:5: this_Enum_10= ruleEnum
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getEnumParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleEnum_in_ruleLiteral4405);
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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:2024:1: entryRuleEnum returns [EObject current=null] : iv_ruleEnum= ruleEnum EOF ;
    public final EObject entryRuleEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnum = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:2025:2: (iv_ruleEnum= ruleEnum EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:2026:2: iv_ruleEnum= ruleEnum EOF
            {
             newCompositeNode(grammarAccess.getEnumRule()); 
            pushFollow(FOLLOW_ruleEnum_in_entryRuleEnum4440);
            iv_ruleEnum=ruleEnum();

            state._fsp--;

             current =iv_ruleEnum; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnum4450); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:2033:1: ruleEnum returns [EObject current=null] : (otherlv_0= 'Enum' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:2036:28: ( (otherlv_0= 'Enum' ( (otherlv_1= RULE_ID ) ) ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:2037:1: (otherlv_0= 'Enum' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:2037:1: (otherlv_0= 'Enum' ( (otherlv_1= RULE_ID ) ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:2037:3: otherlv_0= 'Enum' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,53,FOLLOW_53_in_ruleEnum4487); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumAccess().getEnumKeyword_0());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:2041:1: ( (otherlv_1= RULE_ID ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:2042:1: (otherlv_1= RULE_ID )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:2042:1: (otherlv_1= RULE_ID )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:2043:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnum4507); 

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


    // $ANTLR start "ruleBoolean"
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:2062:1: ruleBoolean returns [Enumerator current=null] : ( (enumLiteral_0= 'J' ) | (enumLiteral_1= 'F' ) ) ;
    public final Enumerator ruleBoolean() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:2064:28: ( ( (enumLiteral_0= 'J' ) | (enumLiteral_1= 'F' ) ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:2065:1: ( (enumLiteral_0= 'J' ) | (enumLiteral_1= 'F' ) )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:2065:1: ( (enumLiteral_0= 'J' ) | (enumLiteral_1= 'F' ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==54) ) {
                alt25=1;
            }
            else if ( (LA25_0==55) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:2065:2: (enumLiteral_0= 'J' )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:2065:2: (enumLiteral_0= 'J' )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:2065:4: enumLiteral_0= 'J'
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_54_in_ruleBoolean4557); 

                            current = grammarAccess.getBooleanAccess().getTrueEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getBooleanAccess().getTrueEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:2071:6: (enumLiteral_1= 'F' )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:2071:6: (enumLiteral_1= 'F' )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:2071:8: enumLiteral_1= 'F'
                    {
                    enumLiteral_1=(Token)match(input,55,FOLLOW_55_in_ruleBoolean4574); 

                            current = grammarAccess.getBooleanAccess().getFalseEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getBooleanAccess().getFalseEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "ruleBREType"
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:2081:1: ruleBREType returns [Enumerator current=null] : ( (enumLiteral_0= 'BizToBiz' ) | (enumLiteral_1= 'SrcToBiz' ) | (enumLiteral_2= 'BizToOut' ) ) ;
    public final Enumerator ruleBREType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:2083:28: ( ( (enumLiteral_0= 'BizToBiz' ) | (enumLiteral_1= 'SrcToBiz' ) | (enumLiteral_2= 'BizToOut' ) ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:2084:1: ( (enumLiteral_0= 'BizToBiz' ) | (enumLiteral_1= 'SrcToBiz' ) | (enumLiteral_2= 'BizToOut' ) )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:2084:1: ( (enumLiteral_0= 'BizToBiz' ) | (enumLiteral_1= 'SrcToBiz' ) | (enumLiteral_2= 'BizToOut' ) )
            int alt26=3;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt26=1;
                }
                break;
            case 57:
                {
                alt26=2;
                }
                break;
            case 58:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:2084:2: (enumLiteral_0= 'BizToBiz' )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:2084:2: (enumLiteral_0= 'BizToBiz' )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:2084:4: enumLiteral_0= 'BizToBiz'
                    {
                    enumLiteral_0=(Token)match(input,56,FOLLOW_56_in_ruleBREType4619); 

                            current = grammarAccess.getBRETypeAccess().getBizToBizEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getBRETypeAccess().getBizToBizEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:2090:6: (enumLiteral_1= 'SrcToBiz' )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:2090:6: (enumLiteral_1= 'SrcToBiz' )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:2090:8: enumLiteral_1= 'SrcToBiz'
                    {
                    enumLiteral_1=(Token)match(input,57,FOLLOW_57_in_ruleBREType4636); 

                            current = grammarAccess.getBRETypeAccess().getSrcToBizEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getBRETypeAccess().getSrcToBizEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:2096:6: (enumLiteral_2= 'BizToOut' )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:2096:6: (enumLiteral_2= 'BizToOut' )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:2096:8: enumLiteral_2= 'BizToOut'
                    {
                    enumLiteral_2=(Token)match(input,58,FOLLOW_58_in_ruleBREType4653); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:2106:1: ruleMultiplicty returns [Enumerator current=null] : ( (enumLiteral_0= '1..N' ) | (enumLiteral_1= '0..N' ) | (enumLiteral_2= '1' ) ) ;
    public final Enumerator ruleMultiplicty() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:2108:28: ( ( (enumLiteral_0= '1..N' ) | (enumLiteral_1= '0..N' ) | (enumLiteral_2= '1' ) ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:2109:1: ( (enumLiteral_0= '1..N' ) | (enumLiteral_1= '0..N' ) | (enumLiteral_2= '1' ) )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:2109:1: ( (enumLiteral_0= '1..N' ) | (enumLiteral_1= '0..N' ) | (enumLiteral_2= '1' ) )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt27=1;
                }
                break;
            case 60:
                {
                alt27=2;
                }
                break;
            case 61:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:2109:2: (enumLiteral_0= '1..N' )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:2109:2: (enumLiteral_0= '1..N' )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:2109:4: enumLiteral_0= '1..N'
                    {
                    enumLiteral_0=(Token)match(input,59,FOLLOW_59_in_ruleMultiplicty4698); 

                            current = grammarAccess.getMultiplictyAccess().getOneToManyEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getMultiplictyAccess().getOneToManyEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:2115:6: (enumLiteral_1= '0..N' )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:2115:6: (enumLiteral_1= '0..N' )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:2115:8: enumLiteral_1= '0..N'
                    {
                    enumLiteral_1=(Token)match(input,60,FOLLOW_60_in_ruleMultiplicty4715); 

                            current = grammarAccess.getMultiplictyAccess().getZeroToManyEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getMultiplictyAccess().getZeroToManyEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:2121:6: (enumLiteral_2= '1' )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:2121:6: (enumLiteral_2= '1' )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:2121:8: enumLiteral_2= '1'
                    {
                    enumLiteral_2=(Token)match(input,61,FOLLOW_61_in_ruleMultiplicty4732); 

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
    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA1_eotS =
        "\14\uffff";
    static final String DFA1_eofS =
        "\14\uffff";
    static final String DFA1_minS =
        "\1\4\1\uffff\1\4\5\uffff\1\13\1\4\2\13";
    static final String DFA1_maxS =
        "\1\53\1\uffff\1\4\5\uffff\1\53\1\4\2\53";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\1\3\1\4\1\5\1\6\4\uffff";
    static final String DFA1_specialS =
        "\14\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\6\6\uffff\1\5\11\uffff\1\6\11\uffff\1\7\2\uffff\1\2\1\uffff\1\3\3\uffff\1\1\2\uffff\1\4",
            "",
            "\1\10",
            "",
            "",
            "",
            "",
            "",
            "\1\5\11\uffff\1\6\14\uffff\1\2\1\12\1\3\4\uffff\1\11\1\uffff\1\4",
            "\1\13",
            "\1\5\11\uffff\1\6\14\uffff\1\2\1\uffff\1\3\6\uffff\1\4",
            "\1\5\11\uffff\1\6\14\uffff\1\2\1\12\1\3\4\uffff\1\11\1\uffff\1\4"
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
    static final String DFA8_eotS =
        "\26\uffff";
    static final String DFA8_eofS =
        "\26\uffff";
    static final String DFA8_minS =
        "\1\4\1\14\1\4\1\31\1\14\1\32\1\66\2\21\1\33\1\32\1\66\2\21\1\34\1\32\1\66\2\4\1\35\2\uffff";
    static final String DFA8_maxS =
        "\1\4\1\51\1\4\1\31\1\51\1\32\1\67\2\21\1\33\1\32\1\67\2\21\1\34\1\32\1\67\2\22\1\36\2\uffff";
    static final String DFA8_acceptS =
        "\24\uffff\1\2\1\1";
    static final String DFA8_specialS =
        "\26\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\1",
            "\1\3\34\uffff\1\2",
            "\1\4",
            "\1\5",
            "\1\3\34\uffff\1\2",
            "\1\6",
            "\1\7\1\10",
            "\1\11",
            "\1\11",
            "\1\12",
            "\1\13",
            "\1\14\1\15",
            "\1\16",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\21\1\22",
            "\1\25\10\uffff\1\24\3\uffff\1\23\1\25",
            "\1\25\10\uffff\1\24\3\uffff\1\23\1\25",
            "\1\25\1\24",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "497:1: (lv_systemInputs_8_1= ruleBreSystemEntityInput | lv_systemInputs_8_2= ruleBreEntityInput )";
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
    public static final BitSet FOLLOW_ruleImport_in_ruleFlow448 = new BitSet(new long[]{0x0000000400000800L});
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
    public static final BitSet FOLLOW_ruleImport_in_ruleBusinessRule917 = new BitSet(new long[]{0x0000000400200800L});
    public static final BitSet FOLLOW_21_in_ruleBusinessRule930 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBusinessRule947 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleBusinessRule964 = new BitSet(new long[]{0x0700000000000000L});
    public static final BitSet FOLLOW_ruleBREType_in_ruleBusinessRule985 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleBusinessRule997 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleBusinessRule1009 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleBusinessRule1021 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_ruleBreSystemEntityInput_in_ruleBusinessRule1044 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_ruleBreEntityInput_in_ruleBusinessRule1063 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_18_in_ruleBusinessRule1079 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleBusinessRule1091 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleBusinessRule1103 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleBusinessRule1126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleBusinessRule1157 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleBusinessRule1169 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleBusinessRule1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreSystemEntityInput_in_entryRuleBreSystemEntityInput1218 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBreSystemEntityInput1228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleBreSystemEntityInput1276 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleSystemEntityConfiguration_in_ruleBreSystemEntityInput1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreEntityInput_in_entryRuleBreEntityInput1333 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBreEntityInput1343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleBreEntityInput1391 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleEntityConfiguration_in_ruleBreEntityInput1412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystemEntityConfiguration_in_entryRuleSystemEntityConfiguration1448 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystemEntityConfiguration1458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleSystemEntityConfiguration1504 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleSystemEntityConfiguration1516 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleSystemEntityConfiguration1528 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleSystemEntityConfiguration1549 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSystemEntityConfiguration1561 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleSystemEntityConfiguration1573 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleSystemEntityConfiguration1585 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleSystemEntityConfiguration1606 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSystemEntityConfiguration1618 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleSystemEntityConfiguration1630 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleSystemEntityConfiguration1642 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleSystemEntityConfiguration1663 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleSystemEntityConfiguration1676 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleSystemEntityConfiguration1688 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleSystemEntityConfiguration1700 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSystemEntityConfiguration1717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityConfiguration_in_entryRuleEntityConfiguration1760 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityConfiguration1770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleEntityConfiguration1816 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleEntityConfiguration1828 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleEntityConfiguration1840 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleEntityConfiguration1861 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleEntityConfiguration1873 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleEntityConfiguration1885 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleEntityConfiguration1897 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleEntityConfiguration1918 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleEntityConfiguration1930 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleEntityConfiguration1942 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleEntityConfiguration1954 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleEntityConfiguration1975 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_17_in_ruleEntityConfiguration1988 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleEntityConfiguration2000 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleEntityConfiguration2012 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleEntityConfiguration2035 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEntityConfiguration2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystem_in_entryRuleSystem2085 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystem2095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleSystem2132 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSystem2149 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSystem2166 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ruleSystemEntity_in_ruleSystem2187 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSystem2199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystemEntity_in_entryRuleSystemEntity2235 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystemEntity2245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleSystemEntity2282 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSystemEntity2299 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleSystemEntity2316 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSystemEntity2333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport2374 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport2384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleImport2421 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFqnWithWildCard_in_ruleImport2442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFqnWithWildCard_in_entryRuleFqnWithWildCard2479 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFqnWithWildCard2490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleFqnWithWildCard2537 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleFqnWithWildCard2556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiagram_in_entryRuleDiagram2598 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDiagram2608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleDiagram2654 = new BitSet(new long[]{0x0000001400000800L});
    public static final BitSet FOLLOW_36_in_ruleDiagram2667 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDiagram2684 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDiagram2701 = new BitSet(new long[]{0x0000006000002000L});
    public static final BitSet FOLLOW_ruleInclude_in_ruleDiagram2722 = new BitSet(new long[]{0x0000006000002000L});
    public static final BitSet FOLLOW_13_in_ruleDiagram2735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_entryRuleInclude2771 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInclude2781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleInclude2826 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_38_in_ruleInclude2855 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleInclude2894 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleInclude2907 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInclude2919 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInclude2939 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_17_in_ruleInclude2952 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInclude2972 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_13_in_ruleInclude2986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDeclaration_in_entryRuleEnumDeclaration3023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumDeclaration3033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleEnumDeclaration3070 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumDeclaration3087 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEnumDeclaration3104 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumDeclaration3121 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_17_in_ruleEnumDeclaration3139 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumDeclaration3150 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_13_in_ruleEnumDeclaration3163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN3200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN3211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN3251 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_ruleFQN3270 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN3285 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity3332 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity3342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleEntity3379 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity3396 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEntity3413 = new BitSet(new long[]{0x0000A00000002000L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleEntity3434 = new BitSet(new long[]{0x0000A00000002000L});
    public static final BitSet FOLLOW_13_in_ruleEntity3447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomain_in_entryRuleDomain3483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomain3493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleDomain3539 = new BitSet(new long[]{0x0000080400000800L});
    public static final BitSet FOLLOW_43_in_ruleDomain3552 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDomain3569 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleDomain3586 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDomain3603 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDomain3620 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleDomain3641 = new BitSet(new long[]{0x0000040000002000L});
    public static final BitSet FOLLOW_13_in_ruleDomain3654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty3690 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty3700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_ruleProperty3747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociation_in_ruleProperty3774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociation_in_entryRuleAssociation3809 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssociation3819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleAssociation3856 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssociation3873 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleAssociation3890 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleAssociation3913 = new BitSet(new long[]{0x3800000000000000L});
    public static final BitSet FOLLOW_ruleMultiplicty_in_ruleAssociation3934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField3970 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField3980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleField4017 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleField4034 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleField4051 = new BitSet(new long[]{0x003F000000000000L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleField4072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral4108 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral4118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleLiteral4171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleLiteral4219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleLiteral4267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleLiteral4315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleLiteral4363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_ruleLiteral4405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_entryRuleEnum4440 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnum4450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleEnum4487 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnum4507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleBoolean4557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleBoolean4574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleBREType4619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleBREType4636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleBREType4653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleMultiplicty4698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleMultiplicty4715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleMultiplicty4732 = new BitSet(new long[]{0x0000000000000002L});

}