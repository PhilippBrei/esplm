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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Flow'", "'{'", "'}'", "'Activity'", "'Predecessors'", "'['", "','", "']'", "'Successors'", "'Calls'", "'Description'", "'BusinessRule'", "'Import'", "'.*'", "'Diagram'", "'Include'", "'Exclude'", "'with'", "'Enumeration'", "'.'", "'Entity'", "'Domain'", "'Description: '", "'Relation'", "':'", "'1..N'", "'0..N'", "'1'", "'1..0'", "'Field'", "'Decimal'", "'Money'", "'Text'", "'Boolean'", "'Int'", "'Enum'"
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
    public static final int T__46=46;
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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:115:1: ruleElement returns [EObject current=null] : (this_EnumDeclaration_0= ruleEnumDeclaration | this_Diagram_1= ruleDiagram | this_Domain_2= ruleDomain | this_ActivityDiagram_3= ruleActivityDiagram | this_BusinessRule_4= ruleBusinessRule ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_EnumDeclaration_0 = null;

        EObject this_Diagram_1 = null;

        EObject this_Domain_2 = null;

        EObject this_ActivityDiagram_3 = null;

        EObject this_BusinessRule_4 = null;


         enterRule(); 
            
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:118:28: ( (this_EnumDeclaration_0= ruleEnumDeclaration | this_Diagram_1= ruleDiagram | this_Domain_2= ruleDomain | this_ActivityDiagram_3= ruleActivityDiagram | this_BusinessRule_4= ruleBusinessRule ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:119:1: (this_EnumDeclaration_0= ruleEnumDeclaration | this_Diagram_1= ruleDiagram | this_Domain_2= ruleDomain | this_ActivityDiagram_3= ruleActivityDiagram | this_BusinessRule_4= ruleBusinessRule )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:119:1: (this_EnumDeclaration_0= ruleEnumDeclaration | this_Diagram_1= ruleDiagram | this_Domain_2= ruleDomain | this_ActivityDiagram_3= ruleActivityDiagram | this_BusinessRule_4= ruleBusinessRule )
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
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:150:5: this_ActivityDiagram_3= ruleActivityDiagram
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getActivityDiagramParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleActivityDiagram_in_ruleElement303);
                    this_ActivityDiagram_3=ruleActivityDiagram();

                    state._fsp--;

                     
                            current = this_ActivityDiagram_3; 
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


    // $ANTLR start "entryRuleActivityDiagram"
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:176:1: entryRuleActivityDiagram returns [EObject current=null] : iv_ruleActivityDiagram= ruleActivityDiagram EOF ;
    public final EObject entryRuleActivityDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivityDiagram = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:177:2: (iv_ruleActivityDiagram= ruleActivityDiagram EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:178:2: iv_ruleActivityDiagram= ruleActivityDiagram EOF
            {
             newCompositeNode(grammarAccess.getActivityDiagramRule()); 
            pushFollow(FOLLOW_ruleActivityDiagram_in_entryRuleActivityDiagram365);
            iv_ruleActivityDiagram=ruleActivityDiagram();

            state._fsp--;

             current =iv_ruleActivityDiagram; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivityDiagram375); 

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
    // $ANTLR end "entryRuleActivityDiagram"


    // $ANTLR start "ruleActivityDiagram"
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:185:1: ruleActivityDiagram returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'Flow' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_activities_4_0= ruleActivity ) )* otherlv_5= '}' ) ;
    public final EObject ruleActivityDiagram() throws RecognitionException {
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

                if ( (LA2_0==23) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:190:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:190:1: (lv_imports_0_0= ruleImport )
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:191:3: lv_imports_0_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getActivityDiagramAccess().getImportsImportParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleActivityDiagram421);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getActivityDiagramRule());
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

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleActivityDiagram434); 

                	newLeafNode(otherlv_1, grammarAccess.getActivityDiagramAccess().getFlowKeyword_1());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:211:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:212:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:212:1: (lv_name_2_0= RULE_ID )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:213:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActivityDiagram451); 

            			newLeafNode(lv_name_2_0, grammarAccess.getActivityDiagramAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActivityDiagramRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleActivityDiagram468); 

                	newLeafNode(otherlv_3, grammarAccess.getActivityDiagramAccess().getLeftCurlyBracketKeyword_3());
                
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
            	     
            	    	        newCompositeNode(grammarAccess.getActivityDiagramAccess().getActivitiesActivityParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActivity_in_ruleActivityDiagram489);
            	    lv_activities_4_0=ruleActivity();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getActivityDiagramRule());
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

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleActivityDiagram502); 

                	newLeafNode(otherlv_5, grammarAccess.getActivityDiagramAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleActivityDiagram"


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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:272:1: ruleActivity returns [EObject current=null] : (otherlv_0= 'Activity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Predecessors' otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' )? (otherlv_9= 'Successors' otherlv_10= '[' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ']' )? (otherlv_15= 'Calls' ( ( ruleFQN ) ) )? otherlv_17= 'Description' ( (lv_description_18_0= RULE_STRING ) ) otherlv_19= '}' ) ;
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
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token lv_description_18_0=null;
        Token otherlv_19=null;

         enterRule(); 
            
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:275:28: ( (otherlv_0= 'Activity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Predecessors' otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' )? (otherlv_9= 'Successors' otherlv_10= '[' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ']' )? (otherlv_15= 'Calls' ( ( ruleFQN ) ) )? otherlv_17= 'Description' ( (lv_description_18_0= RULE_STRING ) ) otherlv_19= '}' ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:276:1: (otherlv_0= 'Activity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Predecessors' otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' )? (otherlv_9= 'Successors' otherlv_10= '[' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ']' )? (otherlv_15= 'Calls' ( ( ruleFQN ) ) )? otherlv_17= 'Description' ( (lv_description_18_0= RULE_STRING ) ) otherlv_19= '}' )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:276:1: (otherlv_0= 'Activity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Predecessors' otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' )? (otherlv_9= 'Successors' otherlv_10= '[' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ']' )? (otherlv_15= 'Calls' ( ( ruleFQN ) ) )? otherlv_17= 'Description' ( (lv_description_18_0= RULE_STRING ) ) otherlv_19= '}' )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:276:3: otherlv_0= 'Activity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'Predecessors' otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' )? (otherlv_9= 'Successors' otherlv_10= '[' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ']' )? (otherlv_15= 'Calls' ( ( ruleFQN ) ) )? otherlv_17= 'Description' ( (lv_description_18_0= RULE_STRING ) ) otherlv_19= '}'
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
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:302:1: (otherlv_3= 'Predecessors' otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:302:3: otherlv_3= 'Predecessors' otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']'
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleActivity632); 

                        	newLeafNode(otherlv_3, grammarAccess.getActivityAccess().getPredecessorsKeyword_3_0());
                        
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

                    		newLeafNode(otherlv_5, grammarAccess.getActivityAccess().getPredecessorActivityCrossReference_3_2_0()); 
                    	

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

                    	    		newLeafNode(otherlv_7, grammarAccess.getActivityAccess().getPredecessorActivityCrossReference_3_3_1_0()); 
                    	    	

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

            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:344:3: (otherlv_9= 'Successors' otherlv_10= '[' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ']' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:344:5: otherlv_9= 'Successors' otherlv_10= '[' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ']'
                    {
                    otherlv_9=(Token)match(input,19,FOLLOW_19_in_ruleActivity726); 

                        	newLeafNode(otherlv_9, grammarAccess.getActivityAccess().getSuccessorsKeyword_4_0());
                        
                    otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleActivity738); 

                        	newLeafNode(otherlv_10, grammarAccess.getActivityAccess().getLeftSquareBracketKeyword_4_1());
                        
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:352:1: ( (otherlv_11= RULE_ID ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:353:1: (otherlv_11= RULE_ID )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:353:1: (otherlv_11= RULE_ID )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:354:3: otherlv_11= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getActivityRule());
                    	        }
                            
                    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActivity758); 

                    		newLeafNode(otherlv_11, grammarAccess.getActivityAccess().getSucessorsActivityCrossReference_4_2_0()); 
                    	

                    }


                    }

                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:365:2: (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==17) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:365:4: otherlv_12= ',' ( (otherlv_13= RULE_ID ) )
                    	    {
                    	    otherlv_12=(Token)match(input,17,FOLLOW_17_in_ruleActivity771); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getActivityAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:369:1: ( (otherlv_13= RULE_ID ) )
                    	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:370:1: (otherlv_13= RULE_ID )
                    	    {
                    	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:370:1: (otherlv_13= RULE_ID )
                    	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:371:3: otherlv_13= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getActivityRule());
                    	    	        }
                    	            
                    	    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActivity791); 

                    	    		newLeafNode(otherlv_13, grammarAccess.getActivityAccess().getSucessorsActivityCrossReference_4_3_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,18,FOLLOW_18_in_ruleActivity805); 

                        	newLeafNode(otherlv_14, grammarAccess.getActivityAccess().getRightSquareBracketKeyword_4_4());
                        

                    }
                    break;

            }

            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:386:3: (otherlv_15= 'Calls' ( ( ruleFQN ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:386:5: otherlv_15= 'Calls' ( ( ruleFQN ) )
                    {
                    otherlv_15=(Token)match(input,20,FOLLOW_20_in_ruleActivity820); 

                        	newLeafNode(otherlv_15, grammarAccess.getActivityAccess().getCallsKeyword_5_0());
                        
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:390:1: ( ( ruleFQN ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:391:1: ( ruleFQN )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:391:1: ( ruleFQN )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:392:3: ruleFQN
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getActivityRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getActivityAccess().getBusinessRuleBusinessRuleCrossReference_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFQN_in_ruleActivity843);
                    ruleFQN();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,21,FOLLOW_21_in_ruleActivity857); 

                	newLeafNode(otherlv_17, grammarAccess.getActivityAccess().getDescriptionKeyword_6());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:409:1: ( (lv_description_18_0= RULE_STRING ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:410:1: (lv_description_18_0= RULE_STRING )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:410:1: (lv_description_18_0= RULE_STRING )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:411:3: lv_description_18_0= RULE_STRING
            {
            lv_description_18_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActivity874); 

            			newLeafNode(lv_description_18_0, grammarAccess.getActivityAccess().getDescriptionSTRINGTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActivityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"description",
                    		lv_description_18_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_19=(Token)match(input,13,FOLLOW_13_in_ruleActivity891); 

                	newLeafNode(otherlv_19, grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_8());
                

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:439:1: entryRuleBusinessRule returns [EObject current=null] : iv_ruleBusinessRule= ruleBusinessRule EOF ;
    public final EObject entryRuleBusinessRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBusinessRule = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:440:2: (iv_ruleBusinessRule= ruleBusinessRule EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:441:2: iv_ruleBusinessRule= ruleBusinessRule EOF
            {
             newCompositeNode(grammarAccess.getBusinessRuleRule()); 
            pushFollow(FOLLOW_ruleBusinessRule_in_entryRuleBusinessRule927);
            iv_ruleBusinessRule=ruleBusinessRule();

            state._fsp--;

             current =iv_ruleBusinessRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBusinessRule937); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:448:1: ruleBusinessRule returns [EObject current=null] : (otherlv_0= 'BusinessRule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) ;
    public final EObject ruleBusinessRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:451:28: ( (otherlv_0= 'BusinessRule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:452:1: (otherlv_0= 'BusinessRule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:452:1: (otherlv_0= 'BusinessRule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:452:3: otherlv_0= 'BusinessRule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleBusinessRule974); 

                	newLeafNode(otherlv_0, grammarAccess.getBusinessRuleAccess().getBusinessRuleKeyword_0());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:456:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:457:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:457:1: (lv_name_1_0= RULE_ID )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:458:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBusinessRule991); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleBusinessRule1008); 

                	newLeafNode(otherlv_2, grammarAccess.getBusinessRuleAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleBusinessRule1020); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:490:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:491:2: (iv_ruleImport= ruleImport EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:492:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport1056);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport1066); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:499:1: ruleImport returns [EObject current=null] : (otherlv_0= 'Import' ( (lv_importedNamespace_1_0= ruleFqnWithWildCard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:502:28: ( (otherlv_0= 'Import' ( (lv_importedNamespace_1_0= ruleFqnWithWildCard ) ) ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:503:1: (otherlv_0= 'Import' ( (lv_importedNamespace_1_0= ruleFqnWithWildCard ) ) )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:503:1: (otherlv_0= 'Import' ( (lv_importedNamespace_1_0= ruleFqnWithWildCard ) ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:503:3: otherlv_0= 'Import' ( (lv_importedNamespace_1_0= ruleFqnWithWildCard ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleImport1103); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:507:1: ( (lv_importedNamespace_1_0= ruleFqnWithWildCard ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:508:1: (lv_importedNamespace_1_0= ruleFqnWithWildCard )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:508:1: (lv_importedNamespace_1_0= ruleFqnWithWildCard )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:509:3: lv_importedNamespace_1_0= ruleFqnWithWildCard
            {
             
            	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceFqnWithWildCardParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFqnWithWildCard_in_ruleImport1124);
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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:533:1: entryRuleFqnWithWildCard returns [String current=null] : iv_ruleFqnWithWildCard= ruleFqnWithWildCard EOF ;
    public final String entryRuleFqnWithWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFqnWithWildCard = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:534:2: (iv_ruleFqnWithWildCard= ruleFqnWithWildCard EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:535:2: iv_ruleFqnWithWildCard= ruleFqnWithWildCard EOF
            {
             newCompositeNode(grammarAccess.getFqnWithWildCardRule()); 
            pushFollow(FOLLOW_ruleFqnWithWildCard_in_entryRuleFqnWithWildCard1161);
            iv_ruleFqnWithWildCard=ruleFqnWithWildCard();

            state._fsp--;

             current =iv_ruleFqnWithWildCard.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFqnWithWildCard1172); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:542:1: ruleFqnWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FQN_0= ruleFQN (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleFqnWithWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_FQN_0 = null;


         enterRule(); 
            
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:545:28: ( (this_FQN_0= ruleFQN (kw= '.*' )? ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:546:1: (this_FQN_0= ruleFQN (kw= '.*' )? )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:546:1: (this_FQN_0= ruleFQN (kw= '.*' )? )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:547:5: this_FQN_0= ruleFQN (kw= '.*' )?
            {
             
                    newCompositeNode(grammarAccess.getFqnWithWildCardAccess().getFQNParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleFQN_in_ruleFqnWithWildCard1219);
            this_FQN_0=ruleFQN();

            state._fsp--;


            		current.merge(this_FQN_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:557:1: (kw= '.*' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:558:2: kw= '.*'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleFqnWithWildCard1238); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:571:1: entryRuleDiagram returns [EObject current=null] : iv_ruleDiagram= ruleDiagram EOF ;
    public final EObject entryRuleDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiagram = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:572:2: (iv_ruleDiagram= ruleDiagram EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:573:2: iv_ruleDiagram= ruleDiagram EOF
            {
             newCompositeNode(grammarAccess.getDiagramRule()); 
            pushFollow(FOLLOW_ruleDiagram_in_entryRuleDiagram1280);
            iv_ruleDiagram=ruleDiagram();

            state._fsp--;

             current =iv_ruleDiagram; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDiagram1290); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:580:1: ruleDiagram returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'Diagram' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_includes_4_0= ruleInclude ) )* otherlv_5= '}' ) ;
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
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:583:28: ( ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'Diagram' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_includes_4_0= ruleInclude ) )* otherlv_5= '}' ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:584:1: ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'Diagram' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_includes_4_0= ruleInclude ) )* otherlv_5= '}' )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:584:1: ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'Diagram' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_includes_4_0= ruleInclude ) )* otherlv_5= '}' )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:584:2: ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'Diagram' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_includes_4_0= ruleInclude ) )* otherlv_5= '}'
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:584:2: ( (lv_imports_0_0= ruleImport ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:585:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:585:1: (lv_imports_0_0= ruleImport )
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:586:3: lv_imports_0_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDiagramAccess().getImportsImportParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleDiagram1336);
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
            	    break loop10;
                }
            } while (true);

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleDiagram1349); 

                	newLeafNode(otherlv_1, grammarAccess.getDiagramAccess().getDiagramKeyword_1());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:606:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:607:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:607:1: (lv_name_2_0= RULE_ID )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:608:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDiagram1366); 

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

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleDiagram1383); 

                	newLeafNode(otherlv_3, grammarAccess.getDiagramAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:628:1: ( (lv_includes_4_0= ruleInclude ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=26 && LA11_0<=27)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:629:1: (lv_includes_4_0= ruleInclude )
            	    {
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:629:1: (lv_includes_4_0= ruleInclude )
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:630:3: lv_includes_4_0= ruleInclude
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDiagramAccess().getIncludesIncludeParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInclude_in_ruleDiagram1404);
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
            	    break loop11;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleDiagram1417); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:658:1: entryRuleInclude returns [EObject current=null] : iv_ruleInclude= ruleInclude EOF ;
    public final EObject entryRuleInclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInclude = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:659:2: (iv_ruleInclude= ruleInclude EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:660:2: iv_ruleInclude= ruleInclude EOF
            {
             newCompositeNode(grammarAccess.getIncludeRule()); 
            pushFollow(FOLLOW_ruleInclude_in_entryRuleInclude1453);
            iv_ruleInclude=ruleInclude();

            state._fsp--;

             current =iv_ruleInclude; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInclude1463); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:667:1: ruleInclude returns [EObject current=null] : ( ( ( (lv_include_0_1= 'Include' | lv_include_0_2= 'Exclude' ) ) ) ( ( ruleFQN ) ) (otherlv_2= 'with' otherlv_3= '{' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' ) ) ;
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
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:670:28: ( ( ( ( (lv_include_0_1= 'Include' | lv_include_0_2= 'Exclude' ) ) ) ( ( ruleFQN ) ) (otherlv_2= 'with' otherlv_3= '{' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' ) ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:671:1: ( ( ( (lv_include_0_1= 'Include' | lv_include_0_2= 'Exclude' ) ) ) ( ( ruleFQN ) ) (otherlv_2= 'with' otherlv_3= '{' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' ) )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:671:1: ( ( ( (lv_include_0_1= 'Include' | lv_include_0_2= 'Exclude' ) ) ) ( ( ruleFQN ) ) (otherlv_2= 'with' otherlv_3= '{' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:671:2: ( ( (lv_include_0_1= 'Include' | lv_include_0_2= 'Exclude' ) ) ) ( ( ruleFQN ) ) (otherlv_2= 'with' otherlv_3= '{' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:671:2: ( ( (lv_include_0_1= 'Include' | lv_include_0_2= 'Exclude' ) ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:672:1: ( (lv_include_0_1= 'Include' | lv_include_0_2= 'Exclude' ) )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:672:1: ( (lv_include_0_1= 'Include' | lv_include_0_2= 'Exclude' ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:673:1: (lv_include_0_1= 'Include' | lv_include_0_2= 'Exclude' )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:673:1: (lv_include_0_1= 'Include' | lv_include_0_2= 'Exclude' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            else if ( (LA12_0==27) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:674:3: lv_include_0_1= 'Include'
                    {
                    lv_include_0_1=(Token)match(input,26,FOLLOW_26_in_ruleInclude1508); 

                            newLeafNode(lv_include_0_1, grammarAccess.getIncludeAccess().getIncludeIncludeKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIncludeRule());
                    	        }
                           		setWithLastConsumed(current, "include", lv_include_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:686:8: lv_include_0_2= 'Exclude'
                    {
                    lv_include_0_2=(Token)match(input,27,FOLLOW_27_in_ruleInclude1537); 

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

            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:701:2: ( ( ruleFQN ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:702:1: ( ruleFQN )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:702:1: ( ruleFQN )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:703:3: ruleFQN
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIncludeRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getIncludeAccess().getEntityEntityCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleInclude1576);
            ruleFQN();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:716:2: (otherlv_2= 'with' otherlv_3= '{' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}' )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:716:4: otherlv_2= 'with' otherlv_3= '{' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= '}'
            {
            otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleInclude1589); 

                	newLeafNode(otherlv_2, grammarAccess.getIncludeAccess().getWithKeyword_2_0());
                
            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleInclude1601); 

                	newLeafNode(otherlv_3, grammarAccess.getIncludeAccess().getLeftCurlyBracketKeyword_2_1());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:724:1: ( (otherlv_4= RULE_ID ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:725:1: (otherlv_4= RULE_ID )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:725:1: (otherlv_4= RULE_ID )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:726:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIncludeRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInclude1621); 

            		newLeafNode(otherlv_4, grammarAccess.getIncludeAccess().getFieldsPropertyCrossReference_2_2_0()); 
            	

            }


            }

            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:737:2: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==17) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:737:4: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleInclude1634); 

            	        	newLeafNode(otherlv_5, grammarAccess.getIncludeAccess().getCommaKeyword_2_3_0());
            	        
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:741:1: ( (otherlv_6= RULE_ID ) )
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:742:1: (otherlv_6= RULE_ID )
            	    {
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:742:1: (otherlv_6= RULE_ID )
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:743:3: otherlv_6= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getIncludeRule());
            	    	        }
            	            
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInclude1654); 

            	    		newLeafNode(otherlv_6, grammarAccess.getIncludeAccess().getFieldsPropertyCrossReference_2_3_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleInclude1668); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:766:1: entryRuleEnumDeclaration returns [EObject current=null] : iv_ruleEnumDeclaration= ruleEnumDeclaration EOF ;
    public final EObject entryRuleEnumDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumDeclaration = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:767:2: (iv_ruleEnumDeclaration= ruleEnumDeclaration EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:768:2: iv_ruleEnumDeclaration= ruleEnumDeclaration EOF
            {
             newCompositeNode(grammarAccess.getEnumDeclarationRule()); 
            pushFollow(FOLLOW_ruleEnumDeclaration_in_entryRuleEnumDeclaration1705);
            iv_ruleEnumDeclaration=ruleEnumDeclaration();

            state._fsp--;

             current =iv_ruleEnumDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumDeclaration1715); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:775:1: ruleEnumDeclaration returns [EObject current=null] : (otherlv_0= 'Enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' this_ID_5= RULE_ID )* otherlv_6= '}' ) ;
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
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:778:28: ( (otherlv_0= 'Enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' this_ID_5= RULE_ID )* otherlv_6= '}' ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:779:1: (otherlv_0= 'Enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' this_ID_5= RULE_ID )* otherlv_6= '}' )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:779:1: (otherlv_0= 'Enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' this_ID_5= RULE_ID )* otherlv_6= '}' )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:779:3: otherlv_0= 'Enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' this_ID_5= RULE_ID )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleEnumDeclaration1752); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumDeclarationAccess().getEnumerationKeyword_0());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:783:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:784:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:784:1: (lv_name_1_0= RULE_ID )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:785:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumDeclaration1769); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleEnumDeclaration1786); 

                	newLeafNode(otherlv_2, grammarAccess.getEnumDeclarationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:805:1: ( (lv_values_3_0= RULE_ID ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:806:1: (lv_values_3_0= RULE_ID )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:806:1: (lv_values_3_0= RULE_ID )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:807:3: lv_values_3_0= RULE_ID
            {
            lv_values_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumDeclaration1803); 

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

            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:823:2: (otherlv_4= ',' this_ID_5= RULE_ID )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==17) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:823:4: otherlv_4= ',' this_ID_5= RULE_ID
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleEnumDeclaration1821); 

            	        	newLeafNode(otherlv_4, grammarAccess.getEnumDeclarationAccess().getCommaKeyword_4_0());
            	        
            	    this_ID_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumDeclaration1832); 
            	     
            	        newLeafNode(this_ID_5, grammarAccess.getEnumDeclarationAccess().getIDTerminalRuleCall_4_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleEnumDeclaration1845); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:843:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:844:2: (iv_ruleFQN= ruleFQN EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:845:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN1882);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN1893); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:852:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:855:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:856:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:856:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:856:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN1933); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:863:1: (kw= '.' this_ID_2= RULE_ID )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==30) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:864:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,30,FOLLOW_30_in_ruleFQN1952); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFQN1967); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:884:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:885:2: (iv_ruleEntity= ruleEntity EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:886:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity2014);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity2024); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:893:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_properties_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:896:28: ( (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:897:1: (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:897:1: (otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}' )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:897:3: otherlv_0= 'Entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_properties_3_0= ruleProperty ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleEntity2061); 

                	newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:901:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:902:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:902:1: (lv_name_1_0= RULE_ID )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:903:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity2078); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleEntity2095); 

                	newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:923:1: ( (lv_properties_3_0= ruleProperty ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==34||LA16_0==40) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:924:1: (lv_properties_3_0= ruleProperty )
            	    {
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:924:1: (lv_properties_3_0= ruleProperty )
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:925:3: lv_properties_3_0= ruleProperty
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEntityAccess().getPropertiesPropertyParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProperty_in_ruleEntity2116);
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
            	    break loop16;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleEntity2129); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:953:1: entryRuleDomain returns [EObject current=null] : iv_ruleDomain= ruleDomain EOF ;
    public final EObject entryRuleDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomain = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:954:2: (iv_ruleDomain= ruleDomain EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:955:2: iv_ruleDomain= ruleDomain EOF
            {
             newCompositeNode(grammarAccess.getDomainRule()); 
            pushFollow(FOLLOW_ruleDomain_in_entryRuleDomain2165);
            iv_ruleDomain=ruleDomain();

            state._fsp--;

             current =iv_ruleDomain; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomain2175); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:962:1: ruleDomain returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'Domain' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'Description: ' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= '{' ( (lv_entities_6_0= ruleEntity ) )+ otherlv_7= '}' ) ;
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
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:965:28: ( ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'Domain' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'Description: ' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= '{' ( (lv_entities_6_0= ruleEntity ) )+ otherlv_7= '}' ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:966:1: ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'Domain' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'Description: ' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= '{' ( (lv_entities_6_0= ruleEntity ) )+ otherlv_7= '}' )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:966:1: ( ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'Domain' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'Description: ' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= '{' ( (lv_entities_6_0= ruleEntity ) )+ otherlv_7= '}' )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:966:2: ( (lv_imports_0_0= ruleImport ) )* otherlv_1= 'Domain' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'Description: ' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= '{' ( (lv_entities_6_0= ruleEntity ) )+ otherlv_7= '}'
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:966:2: ( (lv_imports_0_0= ruleImport ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==23) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:967:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:967:1: (lv_imports_0_0= ruleImport )
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:968:3: lv_imports_0_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDomainAccess().getImportsImportParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleDomain2221);
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
            	    break loop17;
                }
            } while (true);

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleDomain2234); 

                	newLeafNode(otherlv_1, grammarAccess.getDomainAccess().getDomainKeyword_1());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:988:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:989:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:989:1: (lv_name_2_0= RULE_ID )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:990:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDomain2251); 

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

            otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleDomain2268); 

                	newLeafNode(otherlv_3, grammarAccess.getDomainAccess().getDescriptionKeyword_3());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1010:1: ( (lv_description_4_0= RULE_STRING ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1011:1: (lv_description_4_0= RULE_STRING )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1011:1: (lv_description_4_0= RULE_STRING )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1012:3: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDomain2285); 

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

            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleDomain2302); 

                	newLeafNode(otherlv_5, grammarAccess.getDomainAccess().getLeftCurlyBracketKeyword_5());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1032:1: ( (lv_entities_6_0= ruleEntity ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==31) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1033:1: (lv_entities_6_0= ruleEntity )
            	    {
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1033:1: (lv_entities_6_0= ruleEntity )
            	    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1034:3: lv_entities_6_0= ruleEntity
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDomainAccess().getEntitiesEntityParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEntity_in_ruleDomain2323);
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
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleDomain2336); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1062:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1063:2: (iv_ruleProperty= ruleProperty EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1064:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty2372);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty2382); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1071:1: ruleProperty returns [EObject current=null] : (this_Field_0= ruleField | this_Association_1= ruleAssociation ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        EObject this_Field_0 = null;

        EObject this_Association_1 = null;


         enterRule(); 
            
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1074:28: ( (this_Field_0= ruleField | this_Association_1= ruleAssociation ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1075:1: (this_Field_0= ruleField | this_Association_1= ruleAssociation )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1075:1: (this_Field_0= ruleField | this_Association_1= ruleAssociation )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==40) ) {
                alt19=1;
            }
            else if ( (LA19_0==34) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1076:5: this_Field_0= ruleField
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyAccess().getFieldParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleField_in_ruleProperty2429);
                    this_Field_0=ruleField();

                    state._fsp--;

                     
                            current = this_Field_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1086:5: this_Association_1= ruleAssociation
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyAccess().getAssociationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAssociation_in_ruleProperty2456);
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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1102:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1103:2: (iv_ruleAssociation= ruleAssociation EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1104:2: iv_ruleAssociation= ruleAssociation EOF
            {
             newCompositeNode(grammarAccess.getAssociationRule()); 
            pushFollow(FOLLOW_ruleAssociation_in_entryRuleAssociation2491);
            iv_ruleAssociation=ruleAssociation();

            state._fsp--;

             current =iv_ruleAssociation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssociation2501); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1111:1: ruleAssociation returns [EObject current=null] : (otherlv_0= 'Relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleFQN ) ) ( (lv_multiplicity_4_0= ruleMultiplicty ) ) ) ;
    public final EObject ruleAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_multiplicity_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1114:28: ( (otherlv_0= 'Relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleFQN ) ) ( (lv_multiplicity_4_0= ruleMultiplicty ) ) ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1115:1: (otherlv_0= 'Relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleFQN ) ) ( (lv_multiplicity_4_0= ruleMultiplicty ) ) )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1115:1: (otherlv_0= 'Relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleFQN ) ) ( (lv_multiplicity_4_0= ruleMultiplicty ) ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1115:3: otherlv_0= 'Relation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleFQN ) ) ( (lv_multiplicity_4_0= ruleMultiplicty ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleAssociation2538); 

                	newLeafNode(otherlv_0, grammarAccess.getAssociationAccess().getRelationKeyword_0());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1119:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1120:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1120:1: (lv_name_1_0= RULE_ID )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1121:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssociation2555); 

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

            otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleAssociation2572); 

                	newLeafNode(otherlv_2, grammarAccess.getAssociationAccess().getColonKeyword_2());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1141:1: ( ( ruleFQN ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1142:1: ( ruleFQN )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1142:1: ( ruleFQN )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1143:3: ruleFQN
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAssociationRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAssociationAccess().getTypeEntityCrossReference_3_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleAssociation2595);
            ruleFQN();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1156:2: ( (lv_multiplicity_4_0= ruleMultiplicty ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1157:1: (lv_multiplicity_4_0= ruleMultiplicty )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1157:1: (lv_multiplicity_4_0= ruleMultiplicty )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1158:3: lv_multiplicity_4_0= ruleMultiplicty
            {
             
            	        newCompositeNode(grammarAccess.getAssociationAccess().getMultiplicityMultiplictyParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleMultiplicty_in_ruleAssociation2616);
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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1182:1: entryRuleMultiplicty returns [EObject current=null] : iv_ruleMultiplicty= ruleMultiplicty EOF ;
    public final EObject entryRuleMultiplicty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicty = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1183:2: (iv_ruleMultiplicty= ruleMultiplicty EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1184:2: iv_ruleMultiplicty= ruleMultiplicty EOF
            {
             newCompositeNode(grammarAccess.getMultiplictyRule()); 
            pushFollow(FOLLOW_ruleMultiplicty_in_entryRuleMultiplicty2652);
            iv_ruleMultiplicty=ruleMultiplicty();

            state._fsp--;

             current =iv_ruleMultiplicty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicty2662); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1191:1: ruleMultiplicty returns [EObject current=null] : ( ( () ( (lv_name_1_0= '1..N' ) ) ) | ( () ( (lv_name_3_0= '0..N' ) ) ) | ( () ( (lv_name_5_0= '1' ) ) ) | ( () ( (lv_name_7_0= '1..0' ) ) ) ) ;
    public final EObject ruleMultiplicty() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_name_3_0=null;
        Token lv_name_5_0=null;
        Token lv_name_7_0=null;

         enterRule(); 
            
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1194:28: ( ( ( () ( (lv_name_1_0= '1..N' ) ) ) | ( () ( (lv_name_3_0= '0..N' ) ) ) | ( () ( (lv_name_5_0= '1' ) ) ) | ( () ( (lv_name_7_0= '1..0' ) ) ) ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1195:1: ( ( () ( (lv_name_1_0= '1..N' ) ) ) | ( () ( (lv_name_3_0= '0..N' ) ) ) | ( () ( (lv_name_5_0= '1' ) ) ) | ( () ( (lv_name_7_0= '1..0' ) ) ) )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1195:1: ( ( () ( (lv_name_1_0= '1..N' ) ) ) | ( () ( (lv_name_3_0= '0..N' ) ) ) | ( () ( (lv_name_5_0= '1' ) ) ) | ( () ( (lv_name_7_0= '1..0' ) ) ) )
            int alt20=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt20=1;
                }
                break;
            case 37:
                {
                alt20=2;
                }
                break;
            case 38:
                {
                alt20=3;
                }
                break;
            case 39:
                {
                alt20=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1195:2: ( () ( (lv_name_1_0= '1..N' ) ) )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1195:2: ( () ( (lv_name_1_0= '1..N' ) ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1195:3: () ( (lv_name_1_0= '1..N' ) )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1195:3: ()
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1196:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getMultiplictyAccess().getMultiplictyAction_0_0(),
                                current);
                        

                    }

                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1201:2: ( (lv_name_1_0= '1..N' ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1202:1: (lv_name_1_0= '1..N' )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1202:1: (lv_name_1_0= '1..N' )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1203:3: lv_name_1_0= '1..N'
                    {
                    lv_name_1_0=(Token)match(input,36,FOLLOW_36_in_ruleMultiplicty2715); 

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
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1217:6: ( () ( (lv_name_3_0= '0..N' ) ) )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1217:6: ( () ( (lv_name_3_0= '0..N' ) ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1217:7: () ( (lv_name_3_0= '0..N' ) )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1217:7: ()
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1218:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getMultiplictyAccess().getMultiplictyAction_1_0(),
                                current);
                        

                    }

                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1223:2: ( (lv_name_3_0= '0..N' ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1224:1: (lv_name_3_0= '0..N' )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1224:1: (lv_name_3_0= '0..N' )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1225:3: lv_name_3_0= '0..N'
                    {
                    lv_name_3_0=(Token)match(input,37,FOLLOW_37_in_ruleMultiplicty2763); 

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
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1239:6: ( () ( (lv_name_5_0= '1' ) ) )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1239:6: ( () ( (lv_name_5_0= '1' ) ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1239:7: () ( (lv_name_5_0= '1' ) )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1239:7: ()
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1240:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getMultiplictyAccess().getMultiplictyAction_2_0(),
                                current);
                        

                    }

                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1245:2: ( (lv_name_5_0= '1' ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1246:1: (lv_name_5_0= '1' )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1246:1: (lv_name_5_0= '1' )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1247:3: lv_name_5_0= '1'
                    {
                    lv_name_5_0=(Token)match(input,38,FOLLOW_38_in_ruleMultiplicty2811); 

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
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1261:6: ( () ( (lv_name_7_0= '1..0' ) ) )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1261:6: ( () ( (lv_name_7_0= '1..0' ) ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1261:7: () ( (lv_name_7_0= '1..0' ) )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1261:7: ()
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1262:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getMultiplictyAccess().getMultiplictyAction_3_0(),
                                current);
                        

                    }

                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1267:2: ( (lv_name_7_0= '1..0' ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1268:1: (lv_name_7_0= '1..0' )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1268:1: (lv_name_7_0= '1..0' )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1269:3: lv_name_7_0= '1..0'
                    {
                    lv_name_7_0=(Token)match(input,39,FOLLOW_39_in_ruleMultiplicty2859); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1290:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1291:2: (iv_ruleField= ruleField EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1292:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField2909);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField2919); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1299:1: ruleField returns [EObject current=null] : (otherlv_0= 'Field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_literal_3_0= ruleLiteral ) ) ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_literal_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1302:28: ( (otherlv_0= 'Field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_literal_3_0= ruleLiteral ) ) ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1303:1: (otherlv_0= 'Field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_literal_3_0= ruleLiteral ) ) )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1303:1: (otherlv_0= 'Field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_literal_3_0= ruleLiteral ) ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1303:3: otherlv_0= 'Field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_literal_3_0= ruleLiteral ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleField2956); 

                	newLeafNode(otherlv_0, grammarAccess.getFieldAccess().getFieldKeyword_0());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1307:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1308:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1308:1: (lv_name_1_0= RULE_ID )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1309:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleField2973); 

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

            otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleField2990); 

                	newLeafNode(otherlv_2, grammarAccess.getFieldAccess().getColonKeyword_2());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1329:1: ( (lv_literal_3_0= ruleLiteral ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1330:1: (lv_literal_3_0= ruleLiteral )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1330:1: (lv_literal_3_0= ruleLiteral )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1331:3: lv_literal_3_0= ruleLiteral
            {
             
            	        newCompositeNode(grammarAccess.getFieldAccess().getLiteralLiteralParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleLiteral_in_ruleField3011);
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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1355:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1356:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1357:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral3047);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral3057); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1364:1: ruleLiteral returns [EObject current=null] : ( ( () ( (lv_name_1_0= 'Decimal' ) ) ) | ( () ( (lv_name_3_0= 'Money' ) ) ) | ( () ( (lv_name_5_0= 'Text' ) ) ) | ( () ( (lv_name_7_0= 'Boolean' ) ) ) | ( () ( (lv_name_9_0= 'Int' ) ) ) | this_Enum_10= ruleEnum ) ;
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
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1367:28: ( ( ( () ( (lv_name_1_0= 'Decimal' ) ) ) | ( () ( (lv_name_3_0= 'Money' ) ) ) | ( () ( (lv_name_5_0= 'Text' ) ) ) | ( () ( (lv_name_7_0= 'Boolean' ) ) ) | ( () ( (lv_name_9_0= 'Int' ) ) ) | this_Enum_10= ruleEnum ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1368:1: ( ( () ( (lv_name_1_0= 'Decimal' ) ) ) | ( () ( (lv_name_3_0= 'Money' ) ) ) | ( () ( (lv_name_5_0= 'Text' ) ) ) | ( () ( (lv_name_7_0= 'Boolean' ) ) ) | ( () ( (lv_name_9_0= 'Int' ) ) ) | this_Enum_10= ruleEnum )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1368:1: ( ( () ( (lv_name_1_0= 'Decimal' ) ) ) | ( () ( (lv_name_3_0= 'Money' ) ) ) | ( () ( (lv_name_5_0= 'Text' ) ) ) | ( () ( (lv_name_7_0= 'Boolean' ) ) ) | ( () ( (lv_name_9_0= 'Int' ) ) ) | this_Enum_10= ruleEnum )
            int alt21=6;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt21=1;
                }
                break;
            case 42:
                {
                alt21=2;
                }
                break;
            case 43:
                {
                alt21=3;
                }
                break;
            case 44:
                {
                alt21=4;
                }
                break;
            case 45:
                {
                alt21=5;
                }
                break;
            case 46:
                {
                alt21=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1368:2: ( () ( (lv_name_1_0= 'Decimal' ) ) )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1368:2: ( () ( (lv_name_1_0= 'Decimal' ) ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1368:3: () ( (lv_name_1_0= 'Decimal' ) )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1368:3: ()
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1369:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLiteralAccess().getLiteralAction_0_0(),
                                current);
                        

                    }

                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1374:2: ( (lv_name_1_0= 'Decimal' ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1375:1: (lv_name_1_0= 'Decimal' )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1375:1: (lv_name_1_0= 'Decimal' )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1376:3: lv_name_1_0= 'Decimal'
                    {
                    lv_name_1_0=(Token)match(input,41,FOLLOW_41_in_ruleLiteral3110); 

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
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1390:6: ( () ( (lv_name_3_0= 'Money' ) ) )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1390:6: ( () ( (lv_name_3_0= 'Money' ) ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1390:7: () ( (lv_name_3_0= 'Money' ) )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1390:7: ()
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1391:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLiteralAccess().getLiteralAction_1_0(),
                                current);
                        

                    }

                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1396:2: ( (lv_name_3_0= 'Money' ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1397:1: (lv_name_3_0= 'Money' )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1397:1: (lv_name_3_0= 'Money' )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1398:3: lv_name_3_0= 'Money'
                    {
                    lv_name_3_0=(Token)match(input,42,FOLLOW_42_in_ruleLiteral3158); 

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
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1412:6: ( () ( (lv_name_5_0= 'Text' ) ) )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1412:6: ( () ( (lv_name_5_0= 'Text' ) ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1412:7: () ( (lv_name_5_0= 'Text' ) )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1412:7: ()
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1413:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLiteralAccess().getLiteralAction_2_0(),
                                current);
                        

                    }

                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1418:2: ( (lv_name_5_0= 'Text' ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1419:1: (lv_name_5_0= 'Text' )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1419:1: (lv_name_5_0= 'Text' )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1420:3: lv_name_5_0= 'Text'
                    {
                    lv_name_5_0=(Token)match(input,43,FOLLOW_43_in_ruleLiteral3206); 

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
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1434:6: ( () ( (lv_name_7_0= 'Boolean' ) ) )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1434:6: ( () ( (lv_name_7_0= 'Boolean' ) ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1434:7: () ( (lv_name_7_0= 'Boolean' ) )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1434:7: ()
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1435:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLiteralAccess().getLiteralAction_3_0(),
                                current);
                        

                    }

                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1440:2: ( (lv_name_7_0= 'Boolean' ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1441:1: (lv_name_7_0= 'Boolean' )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1441:1: (lv_name_7_0= 'Boolean' )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1442:3: lv_name_7_0= 'Boolean'
                    {
                    lv_name_7_0=(Token)match(input,44,FOLLOW_44_in_ruleLiteral3254); 

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
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1456:6: ( () ( (lv_name_9_0= 'Int' ) ) )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1456:6: ( () ( (lv_name_9_0= 'Int' ) ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1456:7: () ( (lv_name_9_0= 'Int' ) )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1456:7: ()
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1457:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLiteralAccess().getLiteralAction_4_0(),
                                current);
                        

                    }

                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1462:2: ( (lv_name_9_0= 'Int' ) )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1463:1: (lv_name_9_0= 'Int' )
                    {
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1463:1: (lv_name_9_0= 'Int' )
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1464:3: lv_name_9_0= 'Int'
                    {
                    lv_name_9_0=(Token)match(input,45,FOLLOW_45_in_ruleLiteral3302); 

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
                    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1479:5: this_Enum_10= ruleEnum
                    {
                     
                            newCompositeNode(grammarAccess.getLiteralAccess().getEnumParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleEnum_in_ruleLiteral3344);
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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1495:1: entryRuleEnum returns [EObject current=null] : iv_ruleEnum= ruleEnum EOF ;
    public final EObject entryRuleEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnum = null;


        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1496:2: (iv_ruleEnum= ruleEnum EOF )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1497:2: iv_ruleEnum= ruleEnum EOF
            {
             newCompositeNode(grammarAccess.getEnumRule()); 
            pushFollow(FOLLOW_ruleEnum_in_entryRuleEnum3379);
            iv_ruleEnum=ruleEnum();

            state._fsp--;

             current =iv_ruleEnum; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnum3389); 

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
    // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1504:1: ruleEnum returns [EObject current=null] : (otherlv_0= 'Enum' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1507:28: ( (otherlv_0= 'Enum' ( (otherlv_1= RULE_ID ) ) ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1508:1: (otherlv_0= 'Enum' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1508:1: (otherlv_0= 'Enum' ( (otherlv_1= RULE_ID ) ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1508:3: otherlv_0= 'Enum' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleEnum3426); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumAccess().getEnumKeyword_0());
                
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1512:1: ( (otherlv_1= RULE_ID ) )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1513:1: (otherlv_1= RULE_ID )
            {
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1513:1: (otherlv_1= RULE_ID )
            // ../org.pklose.espl.dsl/src-gen/org/pklose/espl/parser/antlr/internal/InternalEsplm.g:1514:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnum3446); 

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
        "\1\40\1\uffff\1\4\4\uffff\1\40\1\4\2\40";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\1\3\1\4\1\5\4\uffff";
    static final String DFA1_specialS =
        "\13\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\5\12\uffff\1\6\1\2\1\uffff\1\3\3\uffff\1\1\2\uffff\1\4",
            "",
            "\1\7",
            "",
            "",
            "",
            "",
            "\1\5\13\uffff\1\2\1\11\1\3\4\uffff\1\10\1\uffff\1\4",
            "\1\12",
            "\1\5\13\uffff\1\2\1\uffff\1\3\6\uffff\1\4",
            "\1\5\13\uffff\1\2\1\11\1\3\4\uffff\1\10\1\uffff\1\4"
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
            return "119:1: (this_EnumDeclaration_0= ruleEnumDeclaration | this_Diagram_1= ruleDiagram | this_Domain_2= ruleDomain | this_ActivityDiagram_3= ruleActivityDiagram | this_BusinessRule_4= ruleBusinessRule )";
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
    public static final BitSet FOLLOW_ruleActivityDiagram_in_ruleElement303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessRule_in_ruleElement330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivityDiagram_in_entryRuleActivityDiagram365 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivityDiagram375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleActivityDiagram421 = new BitSet(new long[]{0x0000000000800800L});
    public static final BitSet FOLLOW_11_in_ruleActivityDiagram434 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActivityDiagram451 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleActivityDiagram468 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_ruleActivity_in_ruleActivityDiagram489 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleActivityDiagram502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_entryRuleActivity538 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivity548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleActivity585 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActivity602 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleActivity619 = new BitSet(new long[]{0x0000000000388000L});
    public static final BitSet FOLLOW_15_in_ruleActivity632 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleActivity644 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActivity664 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleActivity677 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActivity697 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_ruleActivity711 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_19_in_ruleActivity726 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleActivity738 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActivity758 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleActivity771 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActivity791 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_ruleActivity805 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleActivity820 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleActivity843 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleActivity857 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActivity874 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleActivity891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessRule_in_entryRuleBusinessRule927 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBusinessRule937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleBusinessRule974 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBusinessRule991 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleBusinessRule1008 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleBusinessRule1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport1056 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport1066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleImport1103 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFqnWithWildCard_in_ruleImport1124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFqnWithWildCard_in_entryRuleFqnWithWildCard1161 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFqnWithWildCard1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleFqnWithWildCard1219 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleFqnWithWildCard1238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiagram_in_entryRuleDiagram1280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDiagram1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleDiagram1336 = new BitSet(new long[]{0x0000000002800800L});
    public static final BitSet FOLLOW_25_in_ruleDiagram1349 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDiagram1366 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDiagram1383 = new BitSet(new long[]{0x000000000C002000L});
    public static final BitSet FOLLOW_ruleInclude_in_ruleDiagram1404 = new BitSet(new long[]{0x000000000C002000L});
    public static final BitSet FOLLOW_13_in_ruleDiagram1417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_entryRuleInclude1453 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInclude1463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleInclude1508 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_27_in_ruleInclude1537 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleInclude1576 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleInclude1589 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInclude1601 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInclude1621 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_17_in_ruleInclude1634 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInclude1654 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_13_in_ruleInclude1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDeclaration_in_entryRuleEnumDeclaration1705 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumDeclaration1715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleEnumDeclaration1752 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumDeclaration1769 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEnumDeclaration1786 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumDeclaration1803 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_17_in_ruleEnumDeclaration1821 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumDeclaration1832 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_13_in_ruleEnumDeclaration1845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN1882 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN1893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN1933 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleFQN1952 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFQN1967 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity2014 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity2024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleEntity2061 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity2078 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEntity2095 = new BitSet(new long[]{0x0000010400002000L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleEntity2116 = new BitSet(new long[]{0x0000010400002000L});
    public static final BitSet FOLLOW_13_in_ruleEntity2129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomain_in_entryRuleDomain2165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomain2175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleDomain2221 = new BitSet(new long[]{0x0000000100800800L});
    public static final BitSet FOLLOW_32_in_ruleDomain2234 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDomain2251 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleDomain2268 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDomain2285 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDomain2302 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleDomain2323 = new BitSet(new long[]{0x0000000080002000L});
    public static final BitSet FOLLOW_13_in_ruleDomain2336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty2372 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty2382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_ruleProperty2429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociation_in_ruleProperty2456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociation_in_entryRuleAssociation2491 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssociation2501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleAssociation2538 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssociation2555 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleAssociation2572 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleAssociation2595 = new BitSet(new long[]{0x000000F000000000L});
    public static final BitSet FOLLOW_ruleMultiplicty_in_ruleAssociation2616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicty_in_entryRuleMultiplicty2652 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicty2662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleMultiplicty2715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleMultiplicty2763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleMultiplicty2811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleMultiplicty2859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField2909 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField2919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleField2956 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleField2973 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleField2990 = new BitSet(new long[]{0x00007E0000000000L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleField3011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral3047 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral3057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleLiteral3110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleLiteral3158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleLiteral3206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleLiteral3254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleLiteral3302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_ruleLiteral3344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_entryRuleEnum3379 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnum3389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleEnum3426 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnum3446 = new BitSet(new long[]{0x0000000000000002L});

}