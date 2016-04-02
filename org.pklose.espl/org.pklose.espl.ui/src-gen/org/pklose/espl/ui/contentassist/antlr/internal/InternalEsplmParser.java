package org.pklose.espl.ui.contentassist.antlr.internal; 

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
import org.pklose.espl.services.EsplmGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEsplmParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Include'", "'Exclude'", "'BizToBiz'", "'SrcToBiz'", "'BizToOut'", "'1..N'", "'0..N'", "'1..1'", "'0..1'", "'Flow'", "'{'", "'}'", "'Activity'", "'Description'", "'Successors'", "'['", "']'", "','", "'Calls'", "'BusinessRule'", "'type'", "'Input'", "'Output'", "'SourceSystem'", "'SystemEntit\\u00E4t'", "'Format'", "'Import'", "'.*'", "'Diagram'", "'with'", "'Enumeration'", "'.'", "'Entity'", "'Domain'", "'Description: '", "'Relation'", "':'", "'Field'", "'Enum'", "'prim\\u00E4r'", "'obligatorisch'", "'mehrfach'", "'Decimal'", "'Money'", "'Text'", "'Boolean'", "'Int'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
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
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
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
    public String getGrammarFileName() { return "../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g"; }


     
     	private EsplmGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(EsplmGrammarAccess grammarAccess) {
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:61:1: ( ruleModel EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:62:1: ruleModel EOF
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:69:1: ruleModel : ( ( rule__Model__ElementsAssignment ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:73:2: ( ( ( rule__Model__ElementsAssignment ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:74:1: ( ( rule__Model__ElementsAssignment ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:74:1: ( ( rule__Model__ElementsAssignment ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:75:1: ( rule__Model__ElementsAssignment )
            {
             before(grammarAccess.getModelAccess().getElementsAssignment()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:76:1: ( rule__Model__ElementsAssignment )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:76:2: rule__Model__ElementsAssignment
            {
            pushFollow(FOLLOW_rule__Model__ElementsAssignment_in_ruleModel94);
            rule__Model__ElementsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getElementsAssignment()); 

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


    // $ANTLR start "entryRuleElement"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:88:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:89:1: ( ruleElement EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:90:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement121);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement128); 

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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:97:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:101:2: ( ( ( rule__Element__Alternatives ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:102:1: ( ( rule__Element__Alternatives ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:102:1: ( ( rule__Element__Alternatives ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:103:1: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:104:1: ( rule__Element__Alternatives )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:104:2: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_rule__Element__Alternatives_in_ruleElement154);
            rule__Element__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleFlow"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:116:1: entryRuleFlow : ruleFlow EOF ;
    public final void entryRuleFlow() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:117:1: ( ruleFlow EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:118:1: ruleFlow EOF
            {
             before(grammarAccess.getFlowRule()); 
            pushFollow(FOLLOW_ruleFlow_in_entryRuleFlow181);
            ruleFlow();

            state._fsp--;

             after(grammarAccess.getFlowRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFlow188); 

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
    // $ANTLR end "entryRuleFlow"


    // $ANTLR start "ruleFlow"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:125:1: ruleFlow : ( ( rule__Flow__Group__0 ) ) ;
    public final void ruleFlow() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:129:2: ( ( ( rule__Flow__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:130:1: ( ( rule__Flow__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:130:1: ( ( rule__Flow__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:131:1: ( rule__Flow__Group__0 )
            {
             before(grammarAccess.getFlowAccess().getGroup()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:132:1: ( rule__Flow__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:132:2: rule__Flow__Group__0
            {
            pushFollow(FOLLOW_rule__Flow__Group__0_in_ruleFlow214);
            rule__Flow__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFlowAccess().getGroup()); 

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
    // $ANTLR end "ruleFlow"


    // $ANTLR start "entryRuleActivity"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:144:1: entryRuleActivity : ruleActivity EOF ;
    public final void entryRuleActivity() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:145:1: ( ruleActivity EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:146:1: ruleActivity EOF
            {
             before(grammarAccess.getActivityRule()); 
            pushFollow(FOLLOW_ruleActivity_in_entryRuleActivity241);
            ruleActivity();

            state._fsp--;

             after(grammarAccess.getActivityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivity248); 

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
    // $ANTLR end "entryRuleActivity"


    // $ANTLR start "ruleActivity"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:153:1: ruleActivity : ( ( rule__Activity__Group__0 ) ) ;
    public final void ruleActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:157:2: ( ( ( rule__Activity__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:158:1: ( ( rule__Activity__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:158:1: ( ( rule__Activity__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:159:1: ( rule__Activity__Group__0 )
            {
             before(grammarAccess.getActivityAccess().getGroup()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:160:1: ( rule__Activity__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:160:2: rule__Activity__Group__0
            {
            pushFollow(FOLLOW_rule__Activity__Group__0_in_ruleActivity274);
            rule__Activity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getGroup()); 

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
    // $ANTLR end "ruleActivity"


    // $ANTLR start "entryRuleBusinessRule"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:172:1: entryRuleBusinessRule : ruleBusinessRule EOF ;
    public final void entryRuleBusinessRule() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:173:1: ( ruleBusinessRule EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:174:1: ruleBusinessRule EOF
            {
             before(grammarAccess.getBusinessRuleRule()); 
            pushFollow(FOLLOW_ruleBusinessRule_in_entryRuleBusinessRule301);
            ruleBusinessRule();

            state._fsp--;

             after(grammarAccess.getBusinessRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBusinessRule308); 

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
    // $ANTLR end "entryRuleBusinessRule"


    // $ANTLR start "ruleBusinessRule"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:181:1: ruleBusinessRule : ( ( rule__BusinessRule__Group__0 ) ) ;
    public final void ruleBusinessRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:185:2: ( ( ( rule__BusinessRule__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:186:1: ( ( rule__BusinessRule__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:186:1: ( ( rule__BusinessRule__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:187:1: ( rule__BusinessRule__Group__0 )
            {
             before(grammarAccess.getBusinessRuleAccess().getGroup()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:188:1: ( rule__BusinessRule__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:188:2: rule__BusinessRule__Group__0
            {
            pushFollow(FOLLOW_rule__BusinessRule__Group__0_in_ruleBusinessRule334);
            rule__BusinessRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBusinessRuleAccess().getGroup()); 

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
    // $ANTLR end "ruleBusinessRule"


    // $ANTLR start "entryRuleBreOutPutReference"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:202:1: entryRuleBreOutPutReference : ruleBreOutPutReference EOF ;
    public final void entryRuleBreOutPutReference() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:203:1: ( ruleBreOutPutReference EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:204:1: ruleBreOutPutReference EOF
            {
             before(grammarAccess.getBreOutPutReferenceRule()); 
            pushFollow(FOLLOW_ruleBreOutPutReference_in_entryRuleBreOutPutReference363);
            ruleBreOutPutReference();

            state._fsp--;

             after(grammarAccess.getBreOutPutReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBreOutPutReference370); 

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
    // $ANTLR end "entryRuleBreOutPutReference"


    // $ANTLR start "ruleBreOutPutReference"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:211:1: ruleBreOutPutReference : ( ( rule__BreOutPutReference__OutputAssignment ) ) ;
    public final void ruleBreOutPutReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:215:2: ( ( ( rule__BreOutPutReference__OutputAssignment ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:216:1: ( ( rule__BreOutPutReference__OutputAssignment ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:216:1: ( ( rule__BreOutPutReference__OutputAssignment ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:217:1: ( rule__BreOutPutReference__OutputAssignment )
            {
             before(grammarAccess.getBreOutPutReferenceAccess().getOutputAssignment()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:218:1: ( rule__BreOutPutReference__OutputAssignment )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:218:2: rule__BreOutPutReference__OutputAssignment
            {
            pushFollow(FOLLOW_rule__BreOutPutReference__OutputAssignment_in_ruleBreOutPutReference396);
            rule__BreOutPutReference__OutputAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBreOutPutReferenceAccess().getOutputAssignment()); 

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
    // $ANTLR end "ruleBreOutPutReference"


    // $ANTLR start "entryRuleBreEntityInput"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:230:1: entryRuleBreEntityInput : ruleBreEntityInput EOF ;
    public final void entryRuleBreEntityInput() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:231:1: ( ruleBreEntityInput EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:232:1: ruleBreEntityInput EOF
            {
             before(grammarAccess.getBreEntityInputRule()); 
            pushFollow(FOLLOW_ruleBreEntityInput_in_entryRuleBreEntityInput423);
            ruleBreEntityInput();

            state._fsp--;

             after(grammarAccess.getBreEntityInputRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBreEntityInput430); 

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
    // $ANTLR end "entryRuleBreEntityInput"


    // $ANTLR start "ruleBreEntityInput"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:239:1: ruleBreEntityInput : ( ( rule__BreEntityInput__Group__0 ) ) ;
    public final void ruleBreEntityInput() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:243:2: ( ( ( rule__BreEntityInput__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:244:1: ( ( rule__BreEntityInput__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:244:1: ( ( rule__BreEntityInput__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:245:1: ( rule__BreEntityInput__Group__0 )
            {
             before(grammarAccess.getBreEntityInputAccess().getGroup()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:246:1: ( rule__BreEntityInput__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:246:2: rule__BreEntityInput__Group__0
            {
            pushFollow(FOLLOW_rule__BreEntityInput__Group__0_in_ruleBreEntityInput456);
            rule__BreEntityInput__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBreEntityInputAccess().getGroup()); 

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
    // $ANTLR end "ruleBreEntityInput"


    // $ANTLR start "entryRuleEntityConfiguration"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:258:1: entryRuleEntityConfiguration : ruleEntityConfiguration EOF ;
    public final void entryRuleEntityConfiguration() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:259:1: ( ruleEntityConfiguration EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:260:1: ruleEntityConfiguration EOF
            {
             before(grammarAccess.getEntityConfigurationRule()); 
            pushFollow(FOLLOW_ruleEntityConfiguration_in_entryRuleEntityConfiguration483);
            ruleEntityConfiguration();

            state._fsp--;

             after(grammarAccess.getEntityConfigurationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityConfiguration490); 

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
    // $ANTLR end "entryRuleEntityConfiguration"


    // $ANTLR start "ruleEntityConfiguration"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:267:1: ruleEntityConfiguration : ( ( rule__EntityConfiguration__UnorderedGroup ) ) ;
    public final void ruleEntityConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:271:2: ( ( ( rule__EntityConfiguration__UnorderedGroup ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:272:1: ( ( rule__EntityConfiguration__UnorderedGroup ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:272:1: ( ( rule__EntityConfiguration__UnorderedGroup ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:273:1: ( rule__EntityConfiguration__UnorderedGroup )
            {
             before(grammarAccess.getEntityConfigurationAccess().getUnorderedGroup()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:274:1: ( rule__EntityConfiguration__UnorderedGroup )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:274:2: rule__EntityConfiguration__UnorderedGroup
            {
            pushFollow(FOLLOW_rule__EntityConfiguration__UnorderedGroup_in_ruleEntityConfiguration516);
            rule__EntityConfiguration__UnorderedGroup();

            state._fsp--;


            }

             after(grammarAccess.getEntityConfigurationAccess().getUnorderedGroup()); 

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
    // $ANTLR end "ruleEntityConfiguration"


    // $ANTLR start "entryRuleSystem"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:286:1: entryRuleSystem : ruleSystem EOF ;
    public final void entryRuleSystem() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:287:1: ( ruleSystem EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:288:1: ruleSystem EOF
            {
             before(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_ruleSystem_in_entryRuleSystem543);
            ruleSystem();

            state._fsp--;

             after(grammarAccess.getSystemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSystem550); 

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
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:295:1: ruleSystem : ( ( rule__System__Group__0 ) ) ;
    public final void ruleSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:299:2: ( ( ( rule__System__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:300:1: ( ( rule__System__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:300:1: ( ( rule__System__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:301:1: ( rule__System__Group__0 )
            {
             before(grammarAccess.getSystemAccess().getGroup()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:302:1: ( rule__System__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:302:2: rule__System__Group__0
            {
            pushFollow(FOLLOW_rule__System__Group__0_in_ruleSystem576);
            rule__System__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getGroup()); 

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
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleSystemEntity"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:314:1: entryRuleSystemEntity : ruleSystemEntity EOF ;
    public final void entryRuleSystemEntity() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:315:1: ( ruleSystemEntity EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:316:1: ruleSystemEntity EOF
            {
             before(grammarAccess.getSystemEntityRule()); 
            pushFollow(FOLLOW_ruleSystemEntity_in_entryRuleSystemEntity603);
            ruleSystemEntity();

            state._fsp--;

             after(grammarAccess.getSystemEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSystemEntity610); 

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
    // $ANTLR end "entryRuleSystemEntity"


    // $ANTLR start "ruleSystemEntity"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:323:1: ruleSystemEntity : ( ( rule__SystemEntity__Group__0 ) ) ;
    public final void ruleSystemEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:327:2: ( ( ( rule__SystemEntity__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:328:1: ( ( rule__SystemEntity__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:328:1: ( ( rule__SystemEntity__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:329:1: ( rule__SystemEntity__Group__0 )
            {
             before(grammarAccess.getSystemEntityAccess().getGroup()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:330:1: ( rule__SystemEntity__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:330:2: rule__SystemEntity__Group__0
            {
            pushFollow(FOLLOW_rule__SystemEntity__Group__0_in_ruleSystemEntity636);
            rule__SystemEntity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSystemEntityAccess().getGroup()); 

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
    // $ANTLR end "ruleSystemEntity"


    // $ANTLR start "entryRuleImport"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:342:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:343:1: ( ruleImport EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:344:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport663);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport670); 

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:351:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:355:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:356:1: ( ( rule__Import__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:356:1: ( ( rule__Import__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:357:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:358:1: ( rule__Import__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:358:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport696);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleFqnWithWildCard"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:370:1: entryRuleFqnWithWildCard : ruleFqnWithWildCard EOF ;
    public final void entryRuleFqnWithWildCard() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:371:1: ( ruleFqnWithWildCard EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:372:1: ruleFqnWithWildCard EOF
            {
             before(grammarAccess.getFqnWithWildCardRule()); 
            pushFollow(FOLLOW_ruleFqnWithWildCard_in_entryRuleFqnWithWildCard723);
            ruleFqnWithWildCard();

            state._fsp--;

             after(grammarAccess.getFqnWithWildCardRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFqnWithWildCard730); 

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
    // $ANTLR end "entryRuleFqnWithWildCard"


    // $ANTLR start "ruleFqnWithWildCard"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:379:1: ruleFqnWithWildCard : ( ( rule__FqnWithWildCard__Group__0 ) ) ;
    public final void ruleFqnWithWildCard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:383:2: ( ( ( rule__FqnWithWildCard__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:384:1: ( ( rule__FqnWithWildCard__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:384:1: ( ( rule__FqnWithWildCard__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:385:1: ( rule__FqnWithWildCard__Group__0 )
            {
             before(grammarAccess.getFqnWithWildCardAccess().getGroup()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:386:1: ( rule__FqnWithWildCard__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:386:2: rule__FqnWithWildCard__Group__0
            {
            pushFollow(FOLLOW_rule__FqnWithWildCard__Group__0_in_ruleFqnWithWildCard756);
            rule__FqnWithWildCard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFqnWithWildCardAccess().getGroup()); 

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
    // $ANTLR end "ruleFqnWithWildCard"


    // $ANTLR start "entryRuleDiagram"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:398:1: entryRuleDiagram : ruleDiagram EOF ;
    public final void entryRuleDiagram() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:399:1: ( ruleDiagram EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:400:1: ruleDiagram EOF
            {
             before(grammarAccess.getDiagramRule()); 
            pushFollow(FOLLOW_ruleDiagram_in_entryRuleDiagram783);
            ruleDiagram();

            state._fsp--;

             after(grammarAccess.getDiagramRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDiagram790); 

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
    // $ANTLR end "entryRuleDiagram"


    // $ANTLR start "ruleDiagram"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:407:1: ruleDiagram : ( ( rule__Diagram__Group__0 ) ) ;
    public final void ruleDiagram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:411:2: ( ( ( rule__Diagram__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:412:1: ( ( rule__Diagram__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:412:1: ( ( rule__Diagram__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:413:1: ( rule__Diagram__Group__0 )
            {
             before(grammarAccess.getDiagramAccess().getGroup()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:414:1: ( rule__Diagram__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:414:2: rule__Diagram__Group__0
            {
            pushFollow(FOLLOW_rule__Diagram__Group__0_in_ruleDiagram816);
            rule__Diagram__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDiagramAccess().getGroup()); 

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
    // $ANTLR end "ruleDiagram"


    // $ANTLR start "entryRuleInclude"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:426:1: entryRuleInclude : ruleInclude EOF ;
    public final void entryRuleInclude() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:427:1: ( ruleInclude EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:428:1: ruleInclude EOF
            {
             before(grammarAccess.getIncludeRule()); 
            pushFollow(FOLLOW_ruleInclude_in_entryRuleInclude843);
            ruleInclude();

            state._fsp--;

             after(grammarAccess.getIncludeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInclude850); 

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
    // $ANTLR end "entryRuleInclude"


    // $ANTLR start "ruleInclude"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:435:1: ruleInclude : ( ( rule__Include__Group__0 ) ) ;
    public final void ruleInclude() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:439:2: ( ( ( rule__Include__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:440:1: ( ( rule__Include__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:440:1: ( ( rule__Include__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:441:1: ( rule__Include__Group__0 )
            {
             before(grammarAccess.getIncludeAccess().getGroup()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:442:1: ( rule__Include__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:442:2: rule__Include__Group__0
            {
            pushFollow(FOLLOW_rule__Include__Group__0_in_ruleInclude876);
            rule__Include__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIncludeAccess().getGroup()); 

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
    // $ANTLR end "ruleInclude"


    // $ANTLR start "entryRuleEnumDeclaration"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:454:1: entryRuleEnumDeclaration : ruleEnumDeclaration EOF ;
    public final void entryRuleEnumDeclaration() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:455:1: ( ruleEnumDeclaration EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:456:1: ruleEnumDeclaration EOF
            {
             before(grammarAccess.getEnumDeclarationRule()); 
            pushFollow(FOLLOW_ruleEnumDeclaration_in_entryRuleEnumDeclaration903);
            ruleEnumDeclaration();

            state._fsp--;

             after(grammarAccess.getEnumDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumDeclaration910); 

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
    // $ANTLR end "entryRuleEnumDeclaration"


    // $ANTLR start "ruleEnumDeclaration"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:463:1: ruleEnumDeclaration : ( ( rule__EnumDeclaration__Group__0 ) ) ;
    public final void ruleEnumDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:467:2: ( ( ( rule__EnumDeclaration__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:468:1: ( ( rule__EnumDeclaration__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:468:1: ( ( rule__EnumDeclaration__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:469:1: ( rule__EnumDeclaration__Group__0 )
            {
             before(grammarAccess.getEnumDeclarationAccess().getGroup()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:470:1: ( rule__EnumDeclaration__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:470:2: rule__EnumDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__EnumDeclaration__Group__0_in_ruleEnumDeclaration936);
            rule__EnumDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumDeclarationAccess().getGroup()); 

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
    // $ANTLR end "ruleEnumDeclaration"


    // $ANTLR start "entryRuleFQN"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:482:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:483:1: ( ruleFQN EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:484:1: ruleFQN EOF
            {
             before(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN963);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFQNRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN970); 

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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:491:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:495:2: ( ( ( rule__FQN__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:496:1: ( ( rule__FQN__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:496:1: ( ( rule__FQN__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:497:1: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:498:1: ( rule__FQN__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:498:2: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_rule__FQN__Group__0_in_ruleFQN996);
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


    // $ANTLR start "entryRuleEntity"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:510:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:511:1: ( ruleEntity EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:512:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity1023);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity1030); 

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:519:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:523:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:524:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:524:1: ( ( rule__Entity__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:525:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:526:1: ( rule__Entity__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:526:2: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_rule__Entity__Group__0_in_ruleEntity1056);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleDomain"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:538:1: entryRuleDomain : ruleDomain EOF ;
    public final void entryRuleDomain() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:539:1: ( ruleDomain EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:540:1: ruleDomain EOF
            {
             before(grammarAccess.getDomainRule()); 
            pushFollow(FOLLOW_ruleDomain_in_entryRuleDomain1083);
            ruleDomain();

            state._fsp--;

             after(grammarAccess.getDomainRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomain1090); 

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
    // $ANTLR end "entryRuleDomain"


    // $ANTLR start "ruleDomain"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:547:1: ruleDomain : ( ( rule__Domain__Group__0 ) ) ;
    public final void ruleDomain() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:551:2: ( ( ( rule__Domain__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:552:1: ( ( rule__Domain__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:552:1: ( ( rule__Domain__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:553:1: ( rule__Domain__Group__0 )
            {
             before(grammarAccess.getDomainAccess().getGroup()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:554:1: ( rule__Domain__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:554:2: rule__Domain__Group__0
            {
            pushFollow(FOLLOW_rule__Domain__Group__0_in_ruleDomain1116);
            rule__Domain__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getGroup()); 

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
    // $ANTLR end "ruleDomain"


    // $ANTLR start "entryRuleProperty"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:566:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:567:1: ( ruleProperty EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:568:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty1143);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty1150); 

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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:575:1: ruleProperty : ( ( rule__Property__Alternatives ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:579:2: ( ( ( rule__Property__Alternatives ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:580:1: ( ( rule__Property__Alternatives ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:580:1: ( ( rule__Property__Alternatives ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:581:1: ( rule__Property__Alternatives )
            {
             before(grammarAccess.getPropertyAccess().getAlternatives()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:582:1: ( rule__Property__Alternatives )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:582:2: rule__Property__Alternatives
            {
            pushFollow(FOLLOW_rule__Property__Alternatives_in_ruleProperty1176);
            rule__Property__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleAssociation"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:594:1: entryRuleAssociation : ruleAssociation EOF ;
    public final void entryRuleAssociation() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:595:1: ( ruleAssociation EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:596:1: ruleAssociation EOF
            {
             before(grammarAccess.getAssociationRule()); 
            pushFollow(FOLLOW_ruleAssociation_in_entryRuleAssociation1203);
            ruleAssociation();

            state._fsp--;

             after(grammarAccess.getAssociationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssociation1210); 

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
    // $ANTLR end "entryRuleAssociation"


    // $ANTLR start "ruleAssociation"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:603:1: ruleAssociation : ( ( rule__Association__Group__0 ) ) ;
    public final void ruleAssociation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:607:2: ( ( ( rule__Association__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:608:1: ( ( rule__Association__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:608:1: ( ( rule__Association__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:609:1: ( rule__Association__Group__0 )
            {
             before(grammarAccess.getAssociationAccess().getGroup()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:610:1: ( rule__Association__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:610:2: rule__Association__Group__0
            {
            pushFollow(FOLLOW_rule__Association__Group__0_in_ruleAssociation1236);
            rule__Association__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getGroup()); 

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
    // $ANTLR end "ruleAssociation"


    // $ANTLR start "entryRuleField"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:622:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:623:1: ( ruleField EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:624:1: ruleField EOF
            {
             before(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField1263);
            ruleField();

            state._fsp--;

             after(grammarAccess.getFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField1270); 

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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:631:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:635:2: ( ( ( rule__Field__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:636:1: ( ( rule__Field__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:636:1: ( ( rule__Field__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:637:1: ( rule__Field__Group__0 )
            {
             before(grammarAccess.getFieldAccess().getGroup()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:638:1: ( rule__Field__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:638:2: rule__Field__Group__0
            {
            pushFollow(FOLLOW_rule__Field__Group__0_in_ruleField1296);
            rule__Field__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getGroup()); 

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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleLiteral"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:650:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:651:1: ( ruleLiteral EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:652:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral1323);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral1330); 

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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:659:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:663:2: ( ( ( rule__Literal__Alternatives ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:664:1: ( ( rule__Literal__Alternatives ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:664:1: ( ( rule__Literal__Alternatives ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:665:1: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:666:1: ( rule__Literal__Alternatives )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:666:2: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_rule__Literal__Alternatives_in_ruleLiteral1356);
            rule__Literal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getAlternatives()); 

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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleEnum"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:678:1: entryRuleEnum : ruleEnum EOF ;
    public final void entryRuleEnum() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:679:1: ( ruleEnum EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:680:1: ruleEnum EOF
            {
             before(grammarAccess.getEnumRule()); 
            pushFollow(FOLLOW_ruleEnum_in_entryRuleEnum1383);
            ruleEnum();

            state._fsp--;

             after(grammarAccess.getEnumRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnum1390); 

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
    // $ANTLR end "entryRuleEnum"


    // $ANTLR start "ruleEnum"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:687:1: ruleEnum : ( ( rule__Enum__Group__0 ) ) ;
    public final void ruleEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:691:2: ( ( ( rule__Enum__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:692:1: ( ( rule__Enum__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:692:1: ( ( rule__Enum__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:693:1: ( rule__Enum__Group__0 )
            {
             before(grammarAccess.getEnumAccess().getGroup()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:694:1: ( rule__Enum__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:694:2: rule__Enum__Group__0
            {
            pushFollow(FOLLOW_rule__Enum__Group__0_in_ruleEnum1416);
            rule__Enum__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getGroup()); 

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
    // $ANTLR end "ruleEnum"


    // $ANTLR start "ruleBREType"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:709:1: ruleBREType : ( ( rule__BREType__Alternatives ) ) ;
    public final void ruleBREType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:713:1: ( ( ( rule__BREType__Alternatives ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:714:1: ( ( rule__BREType__Alternatives ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:714:1: ( ( rule__BREType__Alternatives ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:715:1: ( rule__BREType__Alternatives )
            {
             before(grammarAccess.getBRETypeAccess().getAlternatives()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:716:1: ( rule__BREType__Alternatives )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:716:2: rule__BREType__Alternatives
            {
            pushFollow(FOLLOW_rule__BREType__Alternatives_in_ruleBREType1455);
            rule__BREType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBRETypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleBREType"


    // $ANTLR start "ruleMultiplicty"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:728:1: ruleMultiplicty : ( ( rule__Multiplicty__Alternatives ) ) ;
    public final void ruleMultiplicty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:732:1: ( ( ( rule__Multiplicty__Alternatives ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:733:1: ( ( rule__Multiplicty__Alternatives ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:733:1: ( ( rule__Multiplicty__Alternatives ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:734:1: ( rule__Multiplicty__Alternatives )
            {
             before(grammarAccess.getMultiplictyAccess().getAlternatives()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:735:1: ( rule__Multiplicty__Alternatives )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:735:2: rule__Multiplicty__Alternatives
            {
            pushFollow(FOLLOW_rule__Multiplicty__Alternatives_in_ruleMultiplicty1491);
            rule__Multiplicty__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMultiplictyAccess().getAlternatives()); 

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
    // $ANTLR end "ruleMultiplicty"


    // $ANTLR start "rule__Element__Alternatives"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:746:1: rule__Element__Alternatives : ( ( ruleEnumDeclaration ) | ( ruleDiagram ) | ( ruleDomain ) | ( ruleFlow ) | ( ruleBusinessRule ) | ( ruleSystem ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:750:1: ( ( ruleEnumDeclaration ) | ( ruleDiagram ) | ( ruleDomain ) | ( ruleFlow ) | ( ruleBusinessRule ) | ( ruleSystem ) )
            int alt1=6;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:751:1: ( ruleEnumDeclaration )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:751:1: ( ruleEnumDeclaration )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:752:1: ruleEnumDeclaration
                    {
                     before(grammarAccess.getElementAccess().getEnumDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleEnumDeclaration_in_rule__Element__Alternatives1526);
                    ruleEnumDeclaration();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getEnumDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:757:6: ( ruleDiagram )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:757:6: ( ruleDiagram )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:758:1: ruleDiagram
                    {
                     before(grammarAccess.getElementAccess().getDiagramParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDiagram_in_rule__Element__Alternatives1543);
                    ruleDiagram();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getDiagramParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:763:6: ( ruleDomain )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:763:6: ( ruleDomain )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:764:1: ruleDomain
                    {
                     before(grammarAccess.getElementAccess().getDomainParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleDomain_in_rule__Element__Alternatives1560);
                    ruleDomain();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getDomainParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:769:6: ( ruleFlow )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:769:6: ( ruleFlow )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:770:1: ruleFlow
                    {
                     before(grammarAccess.getElementAccess().getFlowParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleFlow_in_rule__Element__Alternatives1577);
                    ruleFlow();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getFlowParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:775:6: ( ruleBusinessRule )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:775:6: ( ruleBusinessRule )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:776:1: ruleBusinessRule
                    {
                     before(grammarAccess.getElementAccess().getBusinessRuleParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleBusinessRule_in_rule__Element__Alternatives1594);
                    ruleBusinessRule();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getBusinessRuleParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:781:6: ( ruleSystem )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:781:6: ( ruleSystem )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:782:1: ruleSystem
                    {
                     before(grammarAccess.getElementAccess().getSystemParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleSystem_in_rule__Element__Alternatives1611);
                    ruleSystem();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getSystemParserRuleCall_5()); 

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
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__Include__IncludeAlternatives_0_0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:793:1: rule__Include__IncludeAlternatives_0_0 : ( ( 'Include' ) | ( 'Exclude' ) );
    public final void rule__Include__IncludeAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:797:1: ( ( 'Include' ) | ( 'Exclude' ) )
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
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:798:1: ( 'Include' )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:798:1: ( 'Include' )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:799:1: 'Include'
                    {
                     before(grammarAccess.getIncludeAccess().getIncludeIncludeKeyword_0_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__Include__IncludeAlternatives_0_01645); 
                     after(grammarAccess.getIncludeAccess().getIncludeIncludeKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:806:6: ( 'Exclude' )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:806:6: ( 'Exclude' )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:807:1: 'Exclude'
                    {
                     before(grammarAccess.getIncludeAccess().getIncludeExcludeKeyword_0_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__Include__IncludeAlternatives_0_01665); 
                     after(grammarAccess.getIncludeAccess().getIncludeExcludeKeyword_0_0_1()); 

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
    // $ANTLR end "rule__Include__IncludeAlternatives_0_0"


    // $ANTLR start "rule__Property__Alternatives"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:819:1: rule__Property__Alternatives : ( ( ruleField ) | ( ruleAssociation ) );
    public final void rule__Property__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:823:1: ( ( ruleField ) | ( ruleAssociation ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==48) ) {
                alt3=1;
            }
            else if ( (LA3_0==46) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:824:1: ( ruleField )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:824:1: ( ruleField )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:825:1: ruleField
                    {
                     before(grammarAccess.getPropertyAccess().getFieldParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleField_in_rule__Property__Alternatives1699);
                    ruleField();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getFieldParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:830:6: ( ruleAssociation )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:830:6: ( ruleAssociation )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:831:1: ruleAssociation
                    {
                     before(grammarAccess.getPropertyAccess().getAssociationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAssociation_in_rule__Property__Alternatives1716);
                    ruleAssociation();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getAssociationParserRuleCall_1()); 

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
    // $ANTLR end "rule__Property__Alternatives"


    // $ANTLR start "rule__Literal__Alternatives"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:841:1: rule__Literal__Alternatives : ( ( ( rule__Literal__Group_0__0 ) ) | ( ( rule__Literal__Group_1__0 ) ) | ( ( rule__Literal__Group_2__0 ) ) | ( ( rule__Literal__Group_3__0 ) ) | ( ( rule__Literal__Group_4__0 ) ) | ( ruleEnum ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:845:1: ( ( ( rule__Literal__Group_0__0 ) ) | ( ( rule__Literal__Group_1__0 ) ) | ( ( rule__Literal__Group_2__0 ) ) | ( ( rule__Literal__Group_3__0 ) ) | ( ( rule__Literal__Group_4__0 ) ) | ( ruleEnum ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt4=1;
                }
                break;
            case 54:
                {
                alt4=2;
                }
                break;
            case 55:
                {
                alt4=3;
                }
                break;
            case 56:
                {
                alt4=4;
                }
                break;
            case 57:
                {
                alt4=5;
                }
                break;
            case 49:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:846:1: ( ( rule__Literal__Group_0__0 ) )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:846:1: ( ( rule__Literal__Group_0__0 ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:847:1: ( rule__Literal__Group_0__0 )
                    {
                     before(grammarAccess.getLiteralAccess().getGroup_0()); 
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:848:1: ( rule__Literal__Group_0__0 )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:848:2: rule__Literal__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Literal__Group_0__0_in_rule__Literal__Alternatives1748);
                    rule__Literal__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:852:6: ( ( rule__Literal__Group_1__0 ) )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:852:6: ( ( rule__Literal__Group_1__0 ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:853:1: ( rule__Literal__Group_1__0 )
                    {
                     before(grammarAccess.getLiteralAccess().getGroup_1()); 
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:854:1: ( rule__Literal__Group_1__0 )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:854:2: rule__Literal__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Literal__Group_1__0_in_rule__Literal__Alternatives1766);
                    rule__Literal__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:858:6: ( ( rule__Literal__Group_2__0 ) )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:858:6: ( ( rule__Literal__Group_2__0 ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:859:1: ( rule__Literal__Group_2__0 )
                    {
                     before(grammarAccess.getLiteralAccess().getGroup_2()); 
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:860:1: ( rule__Literal__Group_2__0 )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:860:2: rule__Literal__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Literal__Group_2__0_in_rule__Literal__Alternatives1784);
                    rule__Literal__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:864:6: ( ( rule__Literal__Group_3__0 ) )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:864:6: ( ( rule__Literal__Group_3__0 ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:865:1: ( rule__Literal__Group_3__0 )
                    {
                     before(grammarAccess.getLiteralAccess().getGroup_3()); 
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:866:1: ( rule__Literal__Group_3__0 )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:866:2: rule__Literal__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Literal__Group_3__0_in_rule__Literal__Alternatives1802);
                    rule__Literal__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:870:6: ( ( rule__Literal__Group_4__0 ) )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:870:6: ( ( rule__Literal__Group_4__0 ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:871:1: ( rule__Literal__Group_4__0 )
                    {
                     before(grammarAccess.getLiteralAccess().getGroup_4()); 
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:872:1: ( rule__Literal__Group_4__0 )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:872:2: rule__Literal__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Literal__Group_4__0_in_rule__Literal__Alternatives1820);
                    rule__Literal__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:876:6: ( ruleEnum )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:876:6: ( ruleEnum )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:877:1: ruleEnum
                    {
                     before(grammarAccess.getLiteralAccess().getEnumParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleEnum_in_rule__Literal__Alternatives1838);
                    ruleEnum();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getEnumParserRuleCall_5()); 

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
    // $ANTLR end "rule__Literal__Alternatives"


    // $ANTLR start "rule__BREType__Alternatives"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:888:1: rule__BREType__Alternatives : ( ( ( 'BizToBiz' ) ) | ( ( 'SrcToBiz' ) ) | ( ( 'BizToOut' ) ) );
    public final void rule__BREType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:892:1: ( ( ( 'BizToBiz' ) ) | ( ( 'SrcToBiz' ) ) | ( ( 'BizToOut' ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt5=1;
                }
                break;
            case 14:
                {
                alt5=2;
                }
                break;
            case 15:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:893:1: ( ( 'BizToBiz' ) )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:893:1: ( ( 'BizToBiz' ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:894:1: ( 'BizToBiz' )
                    {
                     before(grammarAccess.getBRETypeAccess().getBizToBizEnumLiteralDeclaration_0()); 
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:895:1: ( 'BizToBiz' )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:895:3: 'BizToBiz'
                    {
                    match(input,13,FOLLOW_13_in_rule__BREType__Alternatives1872); 

                    }

                     after(grammarAccess.getBRETypeAccess().getBizToBizEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:900:6: ( ( 'SrcToBiz' ) )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:900:6: ( ( 'SrcToBiz' ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:901:1: ( 'SrcToBiz' )
                    {
                     before(grammarAccess.getBRETypeAccess().getSrcToBizEnumLiteralDeclaration_1()); 
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:902:1: ( 'SrcToBiz' )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:902:3: 'SrcToBiz'
                    {
                    match(input,14,FOLLOW_14_in_rule__BREType__Alternatives1893); 

                    }

                     after(grammarAccess.getBRETypeAccess().getSrcToBizEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:907:6: ( ( 'BizToOut' ) )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:907:6: ( ( 'BizToOut' ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:908:1: ( 'BizToOut' )
                    {
                     before(grammarAccess.getBRETypeAccess().getBizToOutEnumLiteralDeclaration_2()); 
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:909:1: ( 'BizToOut' )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:909:3: 'BizToOut'
                    {
                    match(input,15,FOLLOW_15_in_rule__BREType__Alternatives1914); 

                    }

                     after(grammarAccess.getBRETypeAccess().getBizToOutEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__BREType__Alternatives"


    // $ANTLR start "rule__Multiplicty__Alternatives"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:919:1: rule__Multiplicty__Alternatives : ( ( ( '1..N' ) ) | ( ( '0..N' ) ) | ( ( '1..1' ) ) | ( ( '0..1' ) ) );
    public final void rule__Multiplicty__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:923:1: ( ( ( '1..N' ) ) | ( ( '0..N' ) ) | ( ( '1..1' ) ) | ( ( '0..1' ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt6=1;
                }
                break;
            case 17:
                {
                alt6=2;
                }
                break;
            case 18:
                {
                alt6=3;
                }
                break;
            case 19:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:924:1: ( ( '1..N' ) )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:924:1: ( ( '1..N' ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:925:1: ( '1..N' )
                    {
                     before(grammarAccess.getMultiplictyAccess().getOneToManyEnumLiteralDeclaration_0()); 
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:926:1: ( '1..N' )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:926:3: '1..N'
                    {
                    match(input,16,FOLLOW_16_in_rule__Multiplicty__Alternatives1950); 

                    }

                     after(grammarAccess.getMultiplictyAccess().getOneToManyEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:931:6: ( ( '0..N' ) )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:931:6: ( ( '0..N' ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:932:1: ( '0..N' )
                    {
                     before(grammarAccess.getMultiplictyAccess().getZeroToManyEnumLiteralDeclaration_1()); 
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:933:1: ( '0..N' )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:933:3: '0..N'
                    {
                    match(input,17,FOLLOW_17_in_rule__Multiplicty__Alternatives1971); 

                    }

                     after(grammarAccess.getMultiplictyAccess().getZeroToManyEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:938:6: ( ( '1..1' ) )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:938:6: ( ( '1..1' ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:939:1: ( '1..1' )
                    {
                     before(grammarAccess.getMultiplictyAccess().getOneToOneEnumLiteralDeclaration_2()); 
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:940:1: ( '1..1' )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:940:3: '1..1'
                    {
                    match(input,18,FOLLOW_18_in_rule__Multiplicty__Alternatives1992); 

                    }

                     after(grammarAccess.getMultiplictyAccess().getOneToOneEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:945:6: ( ( '0..1' ) )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:945:6: ( ( '0..1' ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:946:1: ( '0..1' )
                    {
                     before(grammarAccess.getMultiplictyAccess().getZeroToOneEnumLiteralDeclaration_3()); 
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:947:1: ( '0..1' )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:947:3: '0..1'
                    {
                    match(input,19,FOLLOW_19_in_rule__Multiplicty__Alternatives2013); 

                    }

                     after(grammarAccess.getMultiplictyAccess().getZeroToOneEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__Multiplicty__Alternatives"


    // $ANTLR start "rule__Flow__Group__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:959:1: rule__Flow__Group__0 : rule__Flow__Group__0__Impl rule__Flow__Group__1 ;
    public final void rule__Flow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:963:1: ( rule__Flow__Group__0__Impl rule__Flow__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:964:2: rule__Flow__Group__0__Impl rule__Flow__Group__1
            {
            pushFollow(FOLLOW_rule__Flow__Group__0__Impl_in_rule__Flow__Group__02046);
            rule__Flow__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Flow__Group__1_in_rule__Flow__Group__02049);
            rule__Flow__Group__1();

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
    // $ANTLR end "rule__Flow__Group__0"


    // $ANTLR start "rule__Flow__Group__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:971:1: rule__Flow__Group__0__Impl : ( ( rule__Flow__ImportsAssignment_0 )* ) ;
    public final void rule__Flow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:975:1: ( ( ( rule__Flow__ImportsAssignment_0 )* ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:976:1: ( ( rule__Flow__ImportsAssignment_0 )* )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:976:1: ( ( rule__Flow__ImportsAssignment_0 )* )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:977:1: ( rule__Flow__ImportsAssignment_0 )*
            {
             before(grammarAccess.getFlowAccess().getImportsAssignment_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:978:1: ( rule__Flow__ImportsAssignment_0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==37) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:978:2: rule__Flow__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Flow__ImportsAssignment_0_in_rule__Flow__Group__0__Impl2076);
            	    rule__Flow__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getFlowAccess().getImportsAssignment_0()); 

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
    // $ANTLR end "rule__Flow__Group__0__Impl"


    // $ANTLR start "rule__Flow__Group__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:988:1: rule__Flow__Group__1 : rule__Flow__Group__1__Impl rule__Flow__Group__2 ;
    public final void rule__Flow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:992:1: ( rule__Flow__Group__1__Impl rule__Flow__Group__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:993:2: rule__Flow__Group__1__Impl rule__Flow__Group__2
            {
            pushFollow(FOLLOW_rule__Flow__Group__1__Impl_in_rule__Flow__Group__12107);
            rule__Flow__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Flow__Group__2_in_rule__Flow__Group__12110);
            rule__Flow__Group__2();

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
    // $ANTLR end "rule__Flow__Group__1"


    // $ANTLR start "rule__Flow__Group__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1000:1: rule__Flow__Group__1__Impl : ( 'Flow' ) ;
    public final void rule__Flow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1004:1: ( ( 'Flow' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1005:1: ( 'Flow' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1005:1: ( 'Flow' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1006:1: 'Flow'
            {
             before(grammarAccess.getFlowAccess().getFlowKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__Flow__Group__1__Impl2138); 
             after(grammarAccess.getFlowAccess().getFlowKeyword_1()); 

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
    // $ANTLR end "rule__Flow__Group__1__Impl"


    // $ANTLR start "rule__Flow__Group__2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1019:1: rule__Flow__Group__2 : rule__Flow__Group__2__Impl rule__Flow__Group__3 ;
    public final void rule__Flow__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1023:1: ( rule__Flow__Group__2__Impl rule__Flow__Group__3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1024:2: rule__Flow__Group__2__Impl rule__Flow__Group__3
            {
            pushFollow(FOLLOW_rule__Flow__Group__2__Impl_in_rule__Flow__Group__22169);
            rule__Flow__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Flow__Group__3_in_rule__Flow__Group__22172);
            rule__Flow__Group__3();

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
    // $ANTLR end "rule__Flow__Group__2"


    // $ANTLR start "rule__Flow__Group__2__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1031:1: rule__Flow__Group__2__Impl : ( ( rule__Flow__NameAssignment_2 ) ) ;
    public final void rule__Flow__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1035:1: ( ( ( rule__Flow__NameAssignment_2 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1036:1: ( ( rule__Flow__NameAssignment_2 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1036:1: ( ( rule__Flow__NameAssignment_2 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1037:1: ( rule__Flow__NameAssignment_2 )
            {
             before(grammarAccess.getFlowAccess().getNameAssignment_2()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1038:1: ( rule__Flow__NameAssignment_2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1038:2: rule__Flow__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Flow__NameAssignment_2_in_rule__Flow__Group__2__Impl2199);
            rule__Flow__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFlowAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Flow__Group__2__Impl"


    // $ANTLR start "rule__Flow__Group__3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1048:1: rule__Flow__Group__3 : rule__Flow__Group__3__Impl rule__Flow__Group__4 ;
    public final void rule__Flow__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1052:1: ( rule__Flow__Group__3__Impl rule__Flow__Group__4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1053:2: rule__Flow__Group__3__Impl rule__Flow__Group__4
            {
            pushFollow(FOLLOW_rule__Flow__Group__3__Impl_in_rule__Flow__Group__32229);
            rule__Flow__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Flow__Group__4_in_rule__Flow__Group__32232);
            rule__Flow__Group__4();

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
    // $ANTLR end "rule__Flow__Group__3"


    // $ANTLR start "rule__Flow__Group__3__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1060:1: rule__Flow__Group__3__Impl : ( '{' ) ;
    public final void rule__Flow__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1064:1: ( ( '{' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1065:1: ( '{' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1065:1: ( '{' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1066:1: '{'
            {
             before(grammarAccess.getFlowAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__Flow__Group__3__Impl2260); 
             after(grammarAccess.getFlowAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Flow__Group__3__Impl"


    // $ANTLR start "rule__Flow__Group__4"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1079:1: rule__Flow__Group__4 : rule__Flow__Group__4__Impl rule__Flow__Group__5 ;
    public final void rule__Flow__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1083:1: ( rule__Flow__Group__4__Impl rule__Flow__Group__5 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1084:2: rule__Flow__Group__4__Impl rule__Flow__Group__5
            {
            pushFollow(FOLLOW_rule__Flow__Group__4__Impl_in_rule__Flow__Group__42291);
            rule__Flow__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Flow__Group__5_in_rule__Flow__Group__42294);
            rule__Flow__Group__5();

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
    // $ANTLR end "rule__Flow__Group__4"


    // $ANTLR start "rule__Flow__Group__4__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1091:1: rule__Flow__Group__4__Impl : ( ( rule__Flow__ActivitiesAssignment_4 )* ) ;
    public final void rule__Flow__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1095:1: ( ( ( rule__Flow__ActivitiesAssignment_4 )* ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1096:1: ( ( rule__Flow__ActivitiesAssignment_4 )* )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1096:1: ( ( rule__Flow__ActivitiesAssignment_4 )* )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1097:1: ( rule__Flow__ActivitiesAssignment_4 )*
            {
             before(grammarAccess.getFlowAccess().getActivitiesAssignment_4()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1098:1: ( rule__Flow__ActivitiesAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1098:2: rule__Flow__ActivitiesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Flow__ActivitiesAssignment_4_in_rule__Flow__Group__4__Impl2321);
            	    rule__Flow__ActivitiesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getFlowAccess().getActivitiesAssignment_4()); 

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
    // $ANTLR end "rule__Flow__Group__4__Impl"


    // $ANTLR start "rule__Flow__Group__5"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1108:1: rule__Flow__Group__5 : rule__Flow__Group__5__Impl ;
    public final void rule__Flow__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1112:1: ( rule__Flow__Group__5__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1113:2: rule__Flow__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Flow__Group__5__Impl_in_rule__Flow__Group__52352);
            rule__Flow__Group__5__Impl();

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
    // $ANTLR end "rule__Flow__Group__5"


    // $ANTLR start "rule__Flow__Group__5__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1119:1: rule__Flow__Group__5__Impl : ( '}' ) ;
    public final void rule__Flow__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1123:1: ( ( '}' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1124:1: ( '}' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1124:1: ( '}' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1125:1: '}'
            {
             before(grammarAccess.getFlowAccess().getRightCurlyBracketKeyword_5()); 
            match(input,22,FOLLOW_22_in_rule__Flow__Group__5__Impl2380); 
             after(grammarAccess.getFlowAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Flow__Group__5__Impl"


    // $ANTLR start "rule__Activity__Group__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1150:1: rule__Activity__Group__0 : rule__Activity__Group__0__Impl rule__Activity__Group__1 ;
    public final void rule__Activity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1154:1: ( rule__Activity__Group__0__Impl rule__Activity__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1155:2: rule__Activity__Group__0__Impl rule__Activity__Group__1
            {
            pushFollow(FOLLOW_rule__Activity__Group__0__Impl_in_rule__Activity__Group__02423);
            rule__Activity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__1_in_rule__Activity__Group__02426);
            rule__Activity__Group__1();

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
    // $ANTLR end "rule__Activity__Group__0"


    // $ANTLR start "rule__Activity__Group__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1162:1: rule__Activity__Group__0__Impl : ( 'Activity' ) ;
    public final void rule__Activity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1166:1: ( ( 'Activity' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1167:1: ( 'Activity' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1167:1: ( 'Activity' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1168:1: 'Activity'
            {
             before(grammarAccess.getActivityAccess().getActivityKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Activity__Group__0__Impl2454); 
             after(grammarAccess.getActivityAccess().getActivityKeyword_0()); 

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
    // $ANTLR end "rule__Activity__Group__0__Impl"


    // $ANTLR start "rule__Activity__Group__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1181:1: rule__Activity__Group__1 : rule__Activity__Group__1__Impl rule__Activity__Group__2 ;
    public final void rule__Activity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1185:1: ( rule__Activity__Group__1__Impl rule__Activity__Group__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1186:2: rule__Activity__Group__1__Impl rule__Activity__Group__2
            {
            pushFollow(FOLLOW_rule__Activity__Group__1__Impl_in_rule__Activity__Group__12485);
            rule__Activity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__2_in_rule__Activity__Group__12488);
            rule__Activity__Group__2();

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
    // $ANTLR end "rule__Activity__Group__1"


    // $ANTLR start "rule__Activity__Group__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1193:1: rule__Activity__Group__1__Impl : ( ( rule__Activity__NameAssignment_1 ) ) ;
    public final void rule__Activity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1197:1: ( ( ( rule__Activity__NameAssignment_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1198:1: ( ( rule__Activity__NameAssignment_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1198:1: ( ( rule__Activity__NameAssignment_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1199:1: ( rule__Activity__NameAssignment_1 )
            {
             before(grammarAccess.getActivityAccess().getNameAssignment_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1200:1: ( rule__Activity__NameAssignment_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1200:2: rule__Activity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Activity__NameAssignment_1_in_rule__Activity__Group__1__Impl2515);
            rule__Activity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Activity__Group__1__Impl"


    // $ANTLR start "rule__Activity__Group__2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1210:1: rule__Activity__Group__2 : rule__Activity__Group__2__Impl rule__Activity__Group__3 ;
    public final void rule__Activity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1214:1: ( rule__Activity__Group__2__Impl rule__Activity__Group__3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1215:2: rule__Activity__Group__2__Impl rule__Activity__Group__3
            {
            pushFollow(FOLLOW_rule__Activity__Group__2__Impl_in_rule__Activity__Group__22545);
            rule__Activity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__3_in_rule__Activity__Group__22548);
            rule__Activity__Group__3();

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
    // $ANTLR end "rule__Activity__Group__2"


    // $ANTLR start "rule__Activity__Group__2__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1222:1: rule__Activity__Group__2__Impl : ( '{' ) ;
    public final void rule__Activity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1226:1: ( ( '{' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1227:1: ( '{' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1227:1: ( '{' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1228:1: '{'
            {
             before(grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_21_in_rule__Activity__Group__2__Impl2576); 
             after(grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Activity__Group__2__Impl"


    // $ANTLR start "rule__Activity__Group__3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1241:1: rule__Activity__Group__3 : rule__Activity__Group__3__Impl rule__Activity__Group__4 ;
    public final void rule__Activity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1245:1: ( rule__Activity__Group__3__Impl rule__Activity__Group__4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1246:2: rule__Activity__Group__3__Impl rule__Activity__Group__4
            {
            pushFollow(FOLLOW_rule__Activity__Group__3__Impl_in_rule__Activity__Group__32607);
            rule__Activity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__4_in_rule__Activity__Group__32610);
            rule__Activity__Group__4();

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
    // $ANTLR end "rule__Activity__Group__3"


    // $ANTLR start "rule__Activity__Group__3__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1253:1: rule__Activity__Group__3__Impl : ( ( rule__Activity__Group_3__0 )? ) ;
    public final void rule__Activity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1257:1: ( ( ( rule__Activity__Group_3__0 )? ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1258:1: ( ( rule__Activity__Group_3__0 )? )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1258:1: ( ( rule__Activity__Group_3__0 )? )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1259:1: ( rule__Activity__Group_3__0 )?
            {
             before(grammarAccess.getActivityAccess().getGroup_3()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1260:1: ( rule__Activity__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1260:2: rule__Activity__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_3__0_in_rule__Activity__Group__3__Impl2637);
                    rule__Activity__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActivityAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Activity__Group__3__Impl"


    // $ANTLR start "rule__Activity__Group__4"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1270:1: rule__Activity__Group__4 : rule__Activity__Group__4__Impl rule__Activity__Group__5 ;
    public final void rule__Activity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1274:1: ( rule__Activity__Group__4__Impl rule__Activity__Group__5 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1275:2: rule__Activity__Group__4__Impl rule__Activity__Group__5
            {
            pushFollow(FOLLOW_rule__Activity__Group__4__Impl_in_rule__Activity__Group__42668);
            rule__Activity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__5_in_rule__Activity__Group__42671);
            rule__Activity__Group__5();

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
    // $ANTLR end "rule__Activity__Group__4"


    // $ANTLR start "rule__Activity__Group__4__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1282:1: rule__Activity__Group__4__Impl : ( ( rule__Activity__Group_4__0 )? ) ;
    public final void rule__Activity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1286:1: ( ( ( rule__Activity__Group_4__0 )? ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1287:1: ( ( rule__Activity__Group_4__0 )? )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1287:1: ( ( rule__Activity__Group_4__0 )? )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1288:1: ( rule__Activity__Group_4__0 )?
            {
             before(grammarAccess.getActivityAccess().getGroup_4()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1289:1: ( rule__Activity__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==29) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1289:2: rule__Activity__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_4__0_in_rule__Activity__Group__4__Impl2698);
                    rule__Activity__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActivityAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Activity__Group__4__Impl"


    // $ANTLR start "rule__Activity__Group__5"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1299:1: rule__Activity__Group__5 : rule__Activity__Group__5__Impl rule__Activity__Group__6 ;
    public final void rule__Activity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1303:1: ( rule__Activity__Group__5__Impl rule__Activity__Group__6 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1304:2: rule__Activity__Group__5__Impl rule__Activity__Group__6
            {
            pushFollow(FOLLOW_rule__Activity__Group__5__Impl_in_rule__Activity__Group__52729);
            rule__Activity__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__6_in_rule__Activity__Group__52732);
            rule__Activity__Group__6();

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
    // $ANTLR end "rule__Activity__Group__5"


    // $ANTLR start "rule__Activity__Group__5__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1311:1: rule__Activity__Group__5__Impl : ( 'Description' ) ;
    public final void rule__Activity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1315:1: ( ( 'Description' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1316:1: ( 'Description' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1316:1: ( 'Description' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1317:1: 'Description'
            {
             before(grammarAccess.getActivityAccess().getDescriptionKeyword_5()); 
            match(input,24,FOLLOW_24_in_rule__Activity__Group__5__Impl2760); 
             after(grammarAccess.getActivityAccess().getDescriptionKeyword_5()); 

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
    // $ANTLR end "rule__Activity__Group__5__Impl"


    // $ANTLR start "rule__Activity__Group__6"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1330:1: rule__Activity__Group__6 : rule__Activity__Group__6__Impl rule__Activity__Group__7 ;
    public final void rule__Activity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1334:1: ( rule__Activity__Group__6__Impl rule__Activity__Group__7 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1335:2: rule__Activity__Group__6__Impl rule__Activity__Group__7
            {
            pushFollow(FOLLOW_rule__Activity__Group__6__Impl_in_rule__Activity__Group__62791);
            rule__Activity__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group__7_in_rule__Activity__Group__62794);
            rule__Activity__Group__7();

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
    // $ANTLR end "rule__Activity__Group__6"


    // $ANTLR start "rule__Activity__Group__6__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1342:1: rule__Activity__Group__6__Impl : ( ( rule__Activity__DescriptionAssignment_6 ) ) ;
    public final void rule__Activity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1346:1: ( ( ( rule__Activity__DescriptionAssignment_6 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1347:1: ( ( rule__Activity__DescriptionAssignment_6 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1347:1: ( ( rule__Activity__DescriptionAssignment_6 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1348:1: ( rule__Activity__DescriptionAssignment_6 )
            {
             before(grammarAccess.getActivityAccess().getDescriptionAssignment_6()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1349:1: ( rule__Activity__DescriptionAssignment_6 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1349:2: rule__Activity__DescriptionAssignment_6
            {
            pushFollow(FOLLOW_rule__Activity__DescriptionAssignment_6_in_rule__Activity__Group__6__Impl2821);
            rule__Activity__DescriptionAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getDescriptionAssignment_6()); 

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
    // $ANTLR end "rule__Activity__Group__6__Impl"


    // $ANTLR start "rule__Activity__Group__7"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1359:1: rule__Activity__Group__7 : rule__Activity__Group__7__Impl ;
    public final void rule__Activity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1363:1: ( rule__Activity__Group__7__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1364:2: rule__Activity__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group__7__Impl_in_rule__Activity__Group__72851);
            rule__Activity__Group__7__Impl();

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
    // $ANTLR end "rule__Activity__Group__7"


    // $ANTLR start "rule__Activity__Group__7__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1370:1: rule__Activity__Group__7__Impl : ( '}' ) ;
    public final void rule__Activity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1374:1: ( ( '}' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1375:1: ( '}' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1375:1: ( '}' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1376:1: '}'
            {
             before(grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_7()); 
            match(input,22,FOLLOW_22_in_rule__Activity__Group__7__Impl2879); 
             after(grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Activity__Group__7__Impl"


    // $ANTLR start "rule__Activity__Group_3__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1405:1: rule__Activity__Group_3__0 : rule__Activity__Group_3__0__Impl rule__Activity__Group_3__1 ;
    public final void rule__Activity__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1409:1: ( rule__Activity__Group_3__0__Impl rule__Activity__Group_3__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1410:2: rule__Activity__Group_3__0__Impl rule__Activity__Group_3__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_3__0__Impl_in_rule__Activity__Group_3__02926);
            rule__Activity__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_3__1_in_rule__Activity__Group_3__02929);
            rule__Activity__Group_3__1();

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
    // $ANTLR end "rule__Activity__Group_3__0"


    // $ANTLR start "rule__Activity__Group_3__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1417:1: rule__Activity__Group_3__0__Impl : ( 'Successors' ) ;
    public final void rule__Activity__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1421:1: ( ( 'Successors' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1422:1: ( 'Successors' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1422:1: ( 'Successors' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1423:1: 'Successors'
            {
             before(grammarAccess.getActivityAccess().getSuccessorsKeyword_3_0()); 
            match(input,25,FOLLOW_25_in_rule__Activity__Group_3__0__Impl2957); 
             after(grammarAccess.getActivityAccess().getSuccessorsKeyword_3_0()); 

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
    // $ANTLR end "rule__Activity__Group_3__0__Impl"


    // $ANTLR start "rule__Activity__Group_3__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1436:1: rule__Activity__Group_3__1 : rule__Activity__Group_3__1__Impl rule__Activity__Group_3__2 ;
    public final void rule__Activity__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1440:1: ( rule__Activity__Group_3__1__Impl rule__Activity__Group_3__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1441:2: rule__Activity__Group_3__1__Impl rule__Activity__Group_3__2
            {
            pushFollow(FOLLOW_rule__Activity__Group_3__1__Impl_in_rule__Activity__Group_3__12988);
            rule__Activity__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_3__2_in_rule__Activity__Group_3__12991);
            rule__Activity__Group_3__2();

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
    // $ANTLR end "rule__Activity__Group_3__1"


    // $ANTLR start "rule__Activity__Group_3__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1448:1: rule__Activity__Group_3__1__Impl : ( '[' ) ;
    public final void rule__Activity__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1452:1: ( ( '[' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1453:1: ( '[' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1453:1: ( '[' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1454:1: '['
            {
             before(grammarAccess.getActivityAccess().getLeftSquareBracketKeyword_3_1()); 
            match(input,26,FOLLOW_26_in_rule__Activity__Group_3__1__Impl3019); 
             after(grammarAccess.getActivityAccess().getLeftSquareBracketKeyword_3_1()); 

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
    // $ANTLR end "rule__Activity__Group_3__1__Impl"


    // $ANTLR start "rule__Activity__Group_3__2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1467:1: rule__Activity__Group_3__2 : rule__Activity__Group_3__2__Impl rule__Activity__Group_3__3 ;
    public final void rule__Activity__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1471:1: ( rule__Activity__Group_3__2__Impl rule__Activity__Group_3__3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1472:2: rule__Activity__Group_3__2__Impl rule__Activity__Group_3__3
            {
            pushFollow(FOLLOW_rule__Activity__Group_3__2__Impl_in_rule__Activity__Group_3__23050);
            rule__Activity__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_3__3_in_rule__Activity__Group_3__23053);
            rule__Activity__Group_3__3();

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
    // $ANTLR end "rule__Activity__Group_3__2"


    // $ANTLR start "rule__Activity__Group_3__2__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1479:1: rule__Activity__Group_3__2__Impl : ( ( rule__Activity__SucessorsAssignment_3_2 ) ) ;
    public final void rule__Activity__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1483:1: ( ( ( rule__Activity__SucessorsAssignment_3_2 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1484:1: ( ( rule__Activity__SucessorsAssignment_3_2 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1484:1: ( ( rule__Activity__SucessorsAssignment_3_2 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1485:1: ( rule__Activity__SucessorsAssignment_3_2 )
            {
             before(grammarAccess.getActivityAccess().getSucessorsAssignment_3_2()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1486:1: ( rule__Activity__SucessorsAssignment_3_2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1486:2: rule__Activity__SucessorsAssignment_3_2
            {
            pushFollow(FOLLOW_rule__Activity__SucessorsAssignment_3_2_in_rule__Activity__Group_3__2__Impl3080);
            rule__Activity__SucessorsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getSucessorsAssignment_3_2()); 

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
    // $ANTLR end "rule__Activity__Group_3__2__Impl"


    // $ANTLR start "rule__Activity__Group_3__3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1496:1: rule__Activity__Group_3__3 : rule__Activity__Group_3__3__Impl rule__Activity__Group_3__4 ;
    public final void rule__Activity__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1500:1: ( rule__Activity__Group_3__3__Impl rule__Activity__Group_3__4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1501:2: rule__Activity__Group_3__3__Impl rule__Activity__Group_3__4
            {
            pushFollow(FOLLOW_rule__Activity__Group_3__3__Impl_in_rule__Activity__Group_3__33110);
            rule__Activity__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_3__4_in_rule__Activity__Group_3__33113);
            rule__Activity__Group_3__4();

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
    // $ANTLR end "rule__Activity__Group_3__3"


    // $ANTLR start "rule__Activity__Group_3__3__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1508:1: rule__Activity__Group_3__3__Impl : ( ( rule__Activity__Group_3_3__0 )* ) ;
    public final void rule__Activity__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1512:1: ( ( ( rule__Activity__Group_3_3__0 )* ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1513:1: ( ( rule__Activity__Group_3_3__0 )* )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1513:1: ( ( rule__Activity__Group_3_3__0 )* )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1514:1: ( rule__Activity__Group_3_3__0 )*
            {
             before(grammarAccess.getActivityAccess().getGroup_3_3()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1515:1: ( rule__Activity__Group_3_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==28) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1515:2: rule__Activity__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Activity__Group_3_3__0_in_rule__Activity__Group_3__3__Impl3140);
            	    rule__Activity__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getActivityAccess().getGroup_3_3()); 

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
    // $ANTLR end "rule__Activity__Group_3__3__Impl"


    // $ANTLR start "rule__Activity__Group_3__4"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1525:1: rule__Activity__Group_3__4 : rule__Activity__Group_3__4__Impl ;
    public final void rule__Activity__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1529:1: ( rule__Activity__Group_3__4__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1530:2: rule__Activity__Group_3__4__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_3__4__Impl_in_rule__Activity__Group_3__43171);
            rule__Activity__Group_3__4__Impl();

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
    // $ANTLR end "rule__Activity__Group_3__4"


    // $ANTLR start "rule__Activity__Group_3__4__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1536:1: rule__Activity__Group_3__4__Impl : ( ']' ) ;
    public final void rule__Activity__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1540:1: ( ( ']' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1541:1: ( ']' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1541:1: ( ']' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1542:1: ']'
            {
             before(grammarAccess.getActivityAccess().getRightSquareBracketKeyword_3_4()); 
            match(input,27,FOLLOW_27_in_rule__Activity__Group_3__4__Impl3199); 
             after(grammarAccess.getActivityAccess().getRightSquareBracketKeyword_3_4()); 

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
    // $ANTLR end "rule__Activity__Group_3__4__Impl"


    // $ANTLR start "rule__Activity__Group_3_3__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1565:1: rule__Activity__Group_3_3__0 : rule__Activity__Group_3_3__0__Impl rule__Activity__Group_3_3__1 ;
    public final void rule__Activity__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1569:1: ( rule__Activity__Group_3_3__0__Impl rule__Activity__Group_3_3__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1570:2: rule__Activity__Group_3_3__0__Impl rule__Activity__Group_3_3__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_3_3__0__Impl_in_rule__Activity__Group_3_3__03240);
            rule__Activity__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_3_3__1_in_rule__Activity__Group_3_3__03243);
            rule__Activity__Group_3_3__1();

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
    // $ANTLR end "rule__Activity__Group_3_3__0"


    // $ANTLR start "rule__Activity__Group_3_3__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1577:1: rule__Activity__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Activity__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1581:1: ( ( ',' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1582:1: ( ',' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1582:1: ( ',' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1583:1: ','
            {
             before(grammarAccess.getActivityAccess().getCommaKeyword_3_3_0()); 
            match(input,28,FOLLOW_28_in_rule__Activity__Group_3_3__0__Impl3271); 
             after(grammarAccess.getActivityAccess().getCommaKeyword_3_3_0()); 

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
    // $ANTLR end "rule__Activity__Group_3_3__0__Impl"


    // $ANTLR start "rule__Activity__Group_3_3__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1596:1: rule__Activity__Group_3_3__1 : rule__Activity__Group_3_3__1__Impl ;
    public final void rule__Activity__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1600:1: ( rule__Activity__Group_3_3__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1601:2: rule__Activity__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_3_3__1__Impl_in_rule__Activity__Group_3_3__13302);
            rule__Activity__Group_3_3__1__Impl();

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
    // $ANTLR end "rule__Activity__Group_3_3__1"


    // $ANTLR start "rule__Activity__Group_3_3__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1607:1: rule__Activity__Group_3_3__1__Impl : ( ( rule__Activity__SucessorsAssignment_3_3_1 ) ) ;
    public final void rule__Activity__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1611:1: ( ( ( rule__Activity__SucessorsAssignment_3_3_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1612:1: ( ( rule__Activity__SucessorsAssignment_3_3_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1612:1: ( ( rule__Activity__SucessorsAssignment_3_3_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1613:1: ( rule__Activity__SucessorsAssignment_3_3_1 )
            {
             before(grammarAccess.getActivityAccess().getSucessorsAssignment_3_3_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1614:1: ( rule__Activity__SucessorsAssignment_3_3_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1614:2: rule__Activity__SucessorsAssignment_3_3_1
            {
            pushFollow(FOLLOW_rule__Activity__SucessorsAssignment_3_3_1_in_rule__Activity__Group_3_3__1__Impl3329);
            rule__Activity__SucessorsAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getSucessorsAssignment_3_3_1()); 

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
    // $ANTLR end "rule__Activity__Group_3_3__1__Impl"


    // $ANTLR start "rule__Activity__Group_4__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1628:1: rule__Activity__Group_4__0 : rule__Activity__Group_4__0__Impl rule__Activity__Group_4__1 ;
    public final void rule__Activity__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1632:1: ( rule__Activity__Group_4__0__Impl rule__Activity__Group_4__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1633:2: rule__Activity__Group_4__0__Impl rule__Activity__Group_4__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_4__0__Impl_in_rule__Activity__Group_4__03363);
            rule__Activity__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Activity__Group_4__1_in_rule__Activity__Group_4__03366);
            rule__Activity__Group_4__1();

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
    // $ANTLR end "rule__Activity__Group_4__0"


    // $ANTLR start "rule__Activity__Group_4__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1640:1: rule__Activity__Group_4__0__Impl : ( 'Calls' ) ;
    public final void rule__Activity__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1644:1: ( ( 'Calls' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1645:1: ( 'Calls' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1645:1: ( 'Calls' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1646:1: 'Calls'
            {
             before(grammarAccess.getActivityAccess().getCallsKeyword_4_0()); 
            match(input,29,FOLLOW_29_in_rule__Activity__Group_4__0__Impl3394); 
             after(grammarAccess.getActivityAccess().getCallsKeyword_4_0()); 

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
    // $ANTLR end "rule__Activity__Group_4__0__Impl"


    // $ANTLR start "rule__Activity__Group_4__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1659:1: rule__Activity__Group_4__1 : rule__Activity__Group_4__1__Impl ;
    public final void rule__Activity__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1663:1: ( rule__Activity__Group_4__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1664:2: rule__Activity__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_4__1__Impl_in_rule__Activity__Group_4__13425);
            rule__Activity__Group_4__1__Impl();

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
    // $ANTLR end "rule__Activity__Group_4__1"


    // $ANTLR start "rule__Activity__Group_4__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1670:1: rule__Activity__Group_4__1__Impl : ( ( rule__Activity__BusinessRuleAssignment_4_1 ) ) ;
    public final void rule__Activity__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1674:1: ( ( ( rule__Activity__BusinessRuleAssignment_4_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1675:1: ( ( rule__Activity__BusinessRuleAssignment_4_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1675:1: ( ( rule__Activity__BusinessRuleAssignment_4_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1676:1: ( rule__Activity__BusinessRuleAssignment_4_1 )
            {
             before(grammarAccess.getActivityAccess().getBusinessRuleAssignment_4_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1677:1: ( rule__Activity__BusinessRuleAssignment_4_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1677:2: rule__Activity__BusinessRuleAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Activity__BusinessRuleAssignment_4_1_in_rule__Activity__Group_4__1__Impl3452);
            rule__Activity__BusinessRuleAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getBusinessRuleAssignment_4_1()); 

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
    // $ANTLR end "rule__Activity__Group_4__1__Impl"


    // $ANTLR start "rule__BusinessRule__Group__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1691:1: rule__BusinessRule__Group__0 : rule__BusinessRule__Group__0__Impl rule__BusinessRule__Group__1 ;
    public final void rule__BusinessRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1695:1: ( rule__BusinessRule__Group__0__Impl rule__BusinessRule__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1696:2: rule__BusinessRule__Group__0__Impl rule__BusinessRule__Group__1
            {
            pushFollow(FOLLOW_rule__BusinessRule__Group__0__Impl_in_rule__BusinessRule__Group__03486);
            rule__BusinessRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BusinessRule__Group__1_in_rule__BusinessRule__Group__03489);
            rule__BusinessRule__Group__1();

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
    // $ANTLR end "rule__BusinessRule__Group__0"


    // $ANTLR start "rule__BusinessRule__Group__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1703:1: rule__BusinessRule__Group__0__Impl : ( ( rule__BusinessRule__ImportsAssignment_0 )* ) ;
    public final void rule__BusinessRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1707:1: ( ( ( rule__BusinessRule__ImportsAssignment_0 )* ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1708:1: ( ( rule__BusinessRule__ImportsAssignment_0 )* )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1708:1: ( ( rule__BusinessRule__ImportsAssignment_0 )* )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1709:1: ( rule__BusinessRule__ImportsAssignment_0 )*
            {
             before(grammarAccess.getBusinessRuleAccess().getImportsAssignment_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1710:1: ( rule__BusinessRule__ImportsAssignment_0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==37) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1710:2: rule__BusinessRule__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__BusinessRule__ImportsAssignment_0_in_rule__BusinessRule__Group__0__Impl3516);
            	    rule__BusinessRule__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getBusinessRuleAccess().getImportsAssignment_0()); 

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
    // $ANTLR end "rule__BusinessRule__Group__0__Impl"


    // $ANTLR start "rule__BusinessRule__Group__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1720:1: rule__BusinessRule__Group__1 : rule__BusinessRule__Group__1__Impl rule__BusinessRule__Group__2 ;
    public final void rule__BusinessRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1724:1: ( rule__BusinessRule__Group__1__Impl rule__BusinessRule__Group__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1725:2: rule__BusinessRule__Group__1__Impl rule__BusinessRule__Group__2
            {
            pushFollow(FOLLOW_rule__BusinessRule__Group__1__Impl_in_rule__BusinessRule__Group__13547);
            rule__BusinessRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BusinessRule__Group__2_in_rule__BusinessRule__Group__13550);
            rule__BusinessRule__Group__2();

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
    // $ANTLR end "rule__BusinessRule__Group__1"


    // $ANTLR start "rule__BusinessRule__Group__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1732:1: rule__BusinessRule__Group__1__Impl : ( 'BusinessRule' ) ;
    public final void rule__BusinessRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1736:1: ( ( 'BusinessRule' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1737:1: ( 'BusinessRule' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1737:1: ( 'BusinessRule' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1738:1: 'BusinessRule'
            {
             before(grammarAccess.getBusinessRuleAccess().getBusinessRuleKeyword_1()); 
            match(input,30,FOLLOW_30_in_rule__BusinessRule__Group__1__Impl3578); 
             after(grammarAccess.getBusinessRuleAccess().getBusinessRuleKeyword_1()); 

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
    // $ANTLR end "rule__BusinessRule__Group__1__Impl"


    // $ANTLR start "rule__BusinessRule__Group__2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1751:1: rule__BusinessRule__Group__2 : rule__BusinessRule__Group__2__Impl rule__BusinessRule__Group__3 ;
    public final void rule__BusinessRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1755:1: ( rule__BusinessRule__Group__2__Impl rule__BusinessRule__Group__3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1756:2: rule__BusinessRule__Group__2__Impl rule__BusinessRule__Group__3
            {
            pushFollow(FOLLOW_rule__BusinessRule__Group__2__Impl_in_rule__BusinessRule__Group__23609);
            rule__BusinessRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BusinessRule__Group__3_in_rule__BusinessRule__Group__23612);
            rule__BusinessRule__Group__3();

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
    // $ANTLR end "rule__BusinessRule__Group__2"


    // $ANTLR start "rule__BusinessRule__Group__2__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1763:1: rule__BusinessRule__Group__2__Impl : ( ( rule__BusinessRule__NameAssignment_2 ) ) ;
    public final void rule__BusinessRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1767:1: ( ( ( rule__BusinessRule__NameAssignment_2 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1768:1: ( ( rule__BusinessRule__NameAssignment_2 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1768:1: ( ( rule__BusinessRule__NameAssignment_2 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1769:1: ( rule__BusinessRule__NameAssignment_2 )
            {
             before(grammarAccess.getBusinessRuleAccess().getNameAssignment_2()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1770:1: ( rule__BusinessRule__NameAssignment_2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1770:2: rule__BusinessRule__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__BusinessRule__NameAssignment_2_in_rule__BusinessRule__Group__2__Impl3639);
            rule__BusinessRule__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBusinessRuleAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__BusinessRule__Group__2__Impl"


    // $ANTLR start "rule__BusinessRule__Group__3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1780:1: rule__BusinessRule__Group__3 : rule__BusinessRule__Group__3__Impl rule__BusinessRule__Group__4 ;
    public final void rule__BusinessRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1784:1: ( rule__BusinessRule__Group__3__Impl rule__BusinessRule__Group__4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1785:2: rule__BusinessRule__Group__3__Impl rule__BusinessRule__Group__4
            {
            pushFollow(FOLLOW_rule__BusinessRule__Group__3__Impl_in_rule__BusinessRule__Group__33669);
            rule__BusinessRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BusinessRule__Group__4_in_rule__BusinessRule__Group__33672);
            rule__BusinessRule__Group__4();

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
    // $ANTLR end "rule__BusinessRule__Group__3"


    // $ANTLR start "rule__BusinessRule__Group__3__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1792:1: rule__BusinessRule__Group__3__Impl : ( 'type' ) ;
    public final void rule__BusinessRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1796:1: ( ( 'type' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1797:1: ( 'type' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1797:1: ( 'type' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1798:1: 'type'
            {
             before(grammarAccess.getBusinessRuleAccess().getTypeKeyword_3()); 
            match(input,31,FOLLOW_31_in_rule__BusinessRule__Group__3__Impl3700); 
             after(grammarAccess.getBusinessRuleAccess().getTypeKeyword_3()); 

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
    // $ANTLR end "rule__BusinessRule__Group__3__Impl"


    // $ANTLR start "rule__BusinessRule__Group__4"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1811:1: rule__BusinessRule__Group__4 : rule__BusinessRule__Group__4__Impl rule__BusinessRule__Group__5 ;
    public final void rule__BusinessRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1815:1: ( rule__BusinessRule__Group__4__Impl rule__BusinessRule__Group__5 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1816:2: rule__BusinessRule__Group__4__Impl rule__BusinessRule__Group__5
            {
            pushFollow(FOLLOW_rule__BusinessRule__Group__4__Impl_in_rule__BusinessRule__Group__43731);
            rule__BusinessRule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BusinessRule__Group__5_in_rule__BusinessRule__Group__43734);
            rule__BusinessRule__Group__5();

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
    // $ANTLR end "rule__BusinessRule__Group__4"


    // $ANTLR start "rule__BusinessRule__Group__4__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1823:1: rule__BusinessRule__Group__4__Impl : ( ( rule__BusinessRule__TypAssignment_4 ) ) ;
    public final void rule__BusinessRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1827:1: ( ( ( rule__BusinessRule__TypAssignment_4 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1828:1: ( ( rule__BusinessRule__TypAssignment_4 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1828:1: ( ( rule__BusinessRule__TypAssignment_4 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1829:1: ( rule__BusinessRule__TypAssignment_4 )
            {
             before(grammarAccess.getBusinessRuleAccess().getTypAssignment_4()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1830:1: ( rule__BusinessRule__TypAssignment_4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1830:2: rule__BusinessRule__TypAssignment_4
            {
            pushFollow(FOLLOW_rule__BusinessRule__TypAssignment_4_in_rule__BusinessRule__Group__4__Impl3761);
            rule__BusinessRule__TypAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBusinessRuleAccess().getTypAssignment_4()); 

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
    // $ANTLR end "rule__BusinessRule__Group__4__Impl"


    // $ANTLR start "rule__BusinessRule__Group__5"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1840:1: rule__BusinessRule__Group__5 : rule__BusinessRule__Group__5__Impl rule__BusinessRule__Group__6 ;
    public final void rule__BusinessRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1844:1: ( rule__BusinessRule__Group__5__Impl rule__BusinessRule__Group__6 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1845:2: rule__BusinessRule__Group__5__Impl rule__BusinessRule__Group__6
            {
            pushFollow(FOLLOW_rule__BusinessRule__Group__5__Impl_in_rule__BusinessRule__Group__53791);
            rule__BusinessRule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BusinessRule__Group__6_in_rule__BusinessRule__Group__53794);
            rule__BusinessRule__Group__6();

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
    // $ANTLR end "rule__BusinessRule__Group__5"


    // $ANTLR start "rule__BusinessRule__Group__5__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1852:1: rule__BusinessRule__Group__5__Impl : ( '{' ) ;
    public final void rule__BusinessRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1856:1: ( ( '{' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1857:1: ( '{' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1857:1: ( '{' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1858:1: '{'
            {
             before(grammarAccess.getBusinessRuleAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,21,FOLLOW_21_in_rule__BusinessRule__Group__5__Impl3822); 
             after(grammarAccess.getBusinessRuleAccess().getLeftCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__BusinessRule__Group__5__Impl"


    // $ANTLR start "rule__BusinessRule__Group__6"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1871:1: rule__BusinessRule__Group__6 : rule__BusinessRule__Group__6__Impl rule__BusinessRule__Group__7 ;
    public final void rule__BusinessRule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1875:1: ( rule__BusinessRule__Group__6__Impl rule__BusinessRule__Group__7 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1876:2: rule__BusinessRule__Group__6__Impl rule__BusinessRule__Group__7
            {
            pushFollow(FOLLOW_rule__BusinessRule__Group__6__Impl_in_rule__BusinessRule__Group__63853);
            rule__BusinessRule__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BusinessRule__Group__7_in_rule__BusinessRule__Group__63856);
            rule__BusinessRule__Group__7();

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
    // $ANTLR end "rule__BusinessRule__Group__6"


    // $ANTLR start "rule__BusinessRule__Group__6__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1883:1: rule__BusinessRule__Group__6__Impl : ( 'Input' ) ;
    public final void rule__BusinessRule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1887:1: ( ( 'Input' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1888:1: ( 'Input' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1888:1: ( 'Input' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1889:1: 'Input'
            {
             before(grammarAccess.getBusinessRuleAccess().getInputKeyword_6()); 
            match(input,32,FOLLOW_32_in_rule__BusinessRule__Group__6__Impl3884); 
             after(grammarAccess.getBusinessRuleAccess().getInputKeyword_6()); 

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
    // $ANTLR end "rule__BusinessRule__Group__6__Impl"


    // $ANTLR start "rule__BusinessRule__Group__7"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1902:1: rule__BusinessRule__Group__7 : rule__BusinessRule__Group__7__Impl rule__BusinessRule__Group__8 ;
    public final void rule__BusinessRule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1906:1: ( rule__BusinessRule__Group__7__Impl rule__BusinessRule__Group__8 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1907:2: rule__BusinessRule__Group__7__Impl rule__BusinessRule__Group__8
            {
            pushFollow(FOLLOW_rule__BusinessRule__Group__7__Impl_in_rule__BusinessRule__Group__73915);
            rule__BusinessRule__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BusinessRule__Group__8_in_rule__BusinessRule__Group__73918);
            rule__BusinessRule__Group__8();

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
    // $ANTLR end "rule__BusinessRule__Group__7"


    // $ANTLR start "rule__BusinessRule__Group__7__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1914:1: rule__BusinessRule__Group__7__Impl : ( '[' ) ;
    public final void rule__BusinessRule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1918:1: ( ( '[' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1919:1: ( '[' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1919:1: ( '[' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1920:1: '['
            {
             before(grammarAccess.getBusinessRuleAccess().getLeftSquareBracketKeyword_7()); 
            match(input,26,FOLLOW_26_in_rule__BusinessRule__Group__7__Impl3946); 
             after(grammarAccess.getBusinessRuleAccess().getLeftSquareBracketKeyword_7()); 

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
    // $ANTLR end "rule__BusinessRule__Group__7__Impl"


    // $ANTLR start "rule__BusinessRule__Group__8"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1933:1: rule__BusinessRule__Group__8 : rule__BusinessRule__Group__8__Impl rule__BusinessRule__Group__9 ;
    public final void rule__BusinessRule__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1937:1: ( rule__BusinessRule__Group__8__Impl rule__BusinessRule__Group__9 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1938:2: rule__BusinessRule__Group__8__Impl rule__BusinessRule__Group__9
            {
            pushFollow(FOLLOW_rule__BusinessRule__Group__8__Impl_in_rule__BusinessRule__Group__83977);
            rule__BusinessRule__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BusinessRule__Group__9_in_rule__BusinessRule__Group__83980);
            rule__BusinessRule__Group__9();

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
    // $ANTLR end "rule__BusinessRule__Group__8"


    // $ANTLR start "rule__BusinessRule__Group__8__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1945:1: rule__BusinessRule__Group__8__Impl : ( ( rule__BusinessRule__InputsAssignment_8 ) ) ;
    public final void rule__BusinessRule__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1949:1: ( ( ( rule__BusinessRule__InputsAssignment_8 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1950:1: ( ( rule__BusinessRule__InputsAssignment_8 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1950:1: ( ( rule__BusinessRule__InputsAssignment_8 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1951:1: ( rule__BusinessRule__InputsAssignment_8 )
            {
             before(grammarAccess.getBusinessRuleAccess().getInputsAssignment_8()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1952:1: ( rule__BusinessRule__InputsAssignment_8 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1952:2: rule__BusinessRule__InputsAssignment_8
            {
            pushFollow(FOLLOW_rule__BusinessRule__InputsAssignment_8_in_rule__BusinessRule__Group__8__Impl4007);
            rule__BusinessRule__InputsAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getBusinessRuleAccess().getInputsAssignment_8()); 

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
    // $ANTLR end "rule__BusinessRule__Group__8__Impl"


    // $ANTLR start "rule__BusinessRule__Group__9"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1962:1: rule__BusinessRule__Group__9 : rule__BusinessRule__Group__9__Impl rule__BusinessRule__Group__10 ;
    public final void rule__BusinessRule__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1966:1: ( rule__BusinessRule__Group__9__Impl rule__BusinessRule__Group__10 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1967:2: rule__BusinessRule__Group__9__Impl rule__BusinessRule__Group__10
            {
            pushFollow(FOLLOW_rule__BusinessRule__Group__9__Impl_in_rule__BusinessRule__Group__94037);
            rule__BusinessRule__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BusinessRule__Group__10_in_rule__BusinessRule__Group__94040);
            rule__BusinessRule__Group__10();

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
    // $ANTLR end "rule__BusinessRule__Group__9"


    // $ANTLR start "rule__BusinessRule__Group__9__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1974:1: rule__BusinessRule__Group__9__Impl : ( ( rule__BusinessRule__Group_9__0 )* ) ;
    public final void rule__BusinessRule__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1978:1: ( ( ( rule__BusinessRule__Group_9__0 )* ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1979:1: ( ( rule__BusinessRule__Group_9__0 )* )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1979:1: ( ( rule__BusinessRule__Group_9__0 )* )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1980:1: ( rule__BusinessRule__Group_9__0 )*
            {
             before(grammarAccess.getBusinessRuleAccess().getGroup_9()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1981:1: ( rule__BusinessRule__Group_9__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==28) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1981:2: rule__BusinessRule__Group_9__0
            	    {
            	    pushFollow(FOLLOW_rule__BusinessRule__Group_9__0_in_rule__BusinessRule__Group__9__Impl4067);
            	    rule__BusinessRule__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getBusinessRuleAccess().getGroup_9()); 

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
    // $ANTLR end "rule__BusinessRule__Group__9__Impl"


    // $ANTLR start "rule__BusinessRule__Group__10"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1991:1: rule__BusinessRule__Group__10 : rule__BusinessRule__Group__10__Impl rule__BusinessRule__Group__11 ;
    public final void rule__BusinessRule__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1995:1: ( rule__BusinessRule__Group__10__Impl rule__BusinessRule__Group__11 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1996:2: rule__BusinessRule__Group__10__Impl rule__BusinessRule__Group__11
            {
            pushFollow(FOLLOW_rule__BusinessRule__Group__10__Impl_in_rule__BusinessRule__Group__104098);
            rule__BusinessRule__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BusinessRule__Group__11_in_rule__BusinessRule__Group__104101);
            rule__BusinessRule__Group__11();

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
    // $ANTLR end "rule__BusinessRule__Group__10"


    // $ANTLR start "rule__BusinessRule__Group__10__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2003:1: rule__BusinessRule__Group__10__Impl : ( ']' ) ;
    public final void rule__BusinessRule__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2007:1: ( ( ']' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2008:1: ( ']' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2008:1: ( ']' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2009:1: ']'
            {
             before(grammarAccess.getBusinessRuleAccess().getRightSquareBracketKeyword_10()); 
            match(input,27,FOLLOW_27_in_rule__BusinessRule__Group__10__Impl4129); 
             after(grammarAccess.getBusinessRuleAccess().getRightSquareBracketKeyword_10()); 

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
    // $ANTLR end "rule__BusinessRule__Group__10__Impl"


    // $ANTLR start "rule__BusinessRule__Group__11"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2022:1: rule__BusinessRule__Group__11 : rule__BusinessRule__Group__11__Impl rule__BusinessRule__Group__12 ;
    public final void rule__BusinessRule__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2026:1: ( rule__BusinessRule__Group__11__Impl rule__BusinessRule__Group__12 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2027:2: rule__BusinessRule__Group__11__Impl rule__BusinessRule__Group__12
            {
            pushFollow(FOLLOW_rule__BusinessRule__Group__11__Impl_in_rule__BusinessRule__Group__114160);
            rule__BusinessRule__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BusinessRule__Group__12_in_rule__BusinessRule__Group__114163);
            rule__BusinessRule__Group__12();

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
    // $ANTLR end "rule__BusinessRule__Group__11"


    // $ANTLR start "rule__BusinessRule__Group__11__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2034:1: rule__BusinessRule__Group__11__Impl : ( 'Output' ) ;
    public final void rule__BusinessRule__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2038:1: ( ( 'Output' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2039:1: ( 'Output' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2039:1: ( 'Output' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2040:1: 'Output'
            {
             before(grammarAccess.getBusinessRuleAccess().getOutputKeyword_11()); 
            match(input,33,FOLLOW_33_in_rule__BusinessRule__Group__11__Impl4191); 
             after(grammarAccess.getBusinessRuleAccess().getOutputKeyword_11()); 

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
    // $ANTLR end "rule__BusinessRule__Group__11__Impl"


    // $ANTLR start "rule__BusinessRule__Group__12"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2053:1: rule__BusinessRule__Group__12 : rule__BusinessRule__Group__12__Impl rule__BusinessRule__Group__13 ;
    public final void rule__BusinessRule__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2057:1: ( rule__BusinessRule__Group__12__Impl rule__BusinessRule__Group__13 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2058:2: rule__BusinessRule__Group__12__Impl rule__BusinessRule__Group__13
            {
            pushFollow(FOLLOW_rule__BusinessRule__Group__12__Impl_in_rule__BusinessRule__Group__124222);
            rule__BusinessRule__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BusinessRule__Group__13_in_rule__BusinessRule__Group__124225);
            rule__BusinessRule__Group__13();

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
    // $ANTLR end "rule__BusinessRule__Group__12"


    // $ANTLR start "rule__BusinessRule__Group__12__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2065:1: rule__BusinessRule__Group__12__Impl : ( '[' ) ;
    public final void rule__BusinessRule__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2069:1: ( ( '[' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2070:1: ( '[' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2070:1: ( '[' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2071:1: '['
            {
             before(grammarAccess.getBusinessRuleAccess().getLeftSquareBracketKeyword_12()); 
            match(input,26,FOLLOW_26_in_rule__BusinessRule__Group__12__Impl4253); 
             after(grammarAccess.getBusinessRuleAccess().getLeftSquareBracketKeyword_12()); 

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
    // $ANTLR end "rule__BusinessRule__Group__12__Impl"


    // $ANTLR start "rule__BusinessRule__Group__13"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2084:1: rule__BusinessRule__Group__13 : rule__BusinessRule__Group__13__Impl rule__BusinessRule__Group__14 ;
    public final void rule__BusinessRule__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2088:1: ( rule__BusinessRule__Group__13__Impl rule__BusinessRule__Group__14 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2089:2: rule__BusinessRule__Group__13__Impl rule__BusinessRule__Group__14
            {
            pushFollow(FOLLOW_rule__BusinessRule__Group__13__Impl_in_rule__BusinessRule__Group__134284);
            rule__BusinessRule__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BusinessRule__Group__14_in_rule__BusinessRule__Group__134287);
            rule__BusinessRule__Group__14();

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
    // $ANTLR end "rule__BusinessRule__Group__13"


    // $ANTLR start "rule__BusinessRule__Group__13__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2096:1: rule__BusinessRule__Group__13__Impl : ( ( rule__BusinessRule__OutputAssignment_13 ) ) ;
    public final void rule__BusinessRule__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2100:1: ( ( ( rule__BusinessRule__OutputAssignment_13 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2101:1: ( ( rule__BusinessRule__OutputAssignment_13 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2101:1: ( ( rule__BusinessRule__OutputAssignment_13 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2102:1: ( rule__BusinessRule__OutputAssignment_13 )
            {
             before(grammarAccess.getBusinessRuleAccess().getOutputAssignment_13()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2103:1: ( rule__BusinessRule__OutputAssignment_13 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2103:2: rule__BusinessRule__OutputAssignment_13
            {
            pushFollow(FOLLOW_rule__BusinessRule__OutputAssignment_13_in_rule__BusinessRule__Group__13__Impl4314);
            rule__BusinessRule__OutputAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getBusinessRuleAccess().getOutputAssignment_13()); 

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
    // $ANTLR end "rule__BusinessRule__Group__13__Impl"


    // $ANTLR start "rule__BusinessRule__Group__14"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2113:1: rule__BusinessRule__Group__14 : rule__BusinessRule__Group__14__Impl rule__BusinessRule__Group__15 ;
    public final void rule__BusinessRule__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2117:1: ( rule__BusinessRule__Group__14__Impl rule__BusinessRule__Group__15 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2118:2: rule__BusinessRule__Group__14__Impl rule__BusinessRule__Group__15
            {
            pushFollow(FOLLOW_rule__BusinessRule__Group__14__Impl_in_rule__BusinessRule__Group__144344);
            rule__BusinessRule__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BusinessRule__Group__15_in_rule__BusinessRule__Group__144347);
            rule__BusinessRule__Group__15();

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
    // $ANTLR end "rule__BusinessRule__Group__14"


    // $ANTLR start "rule__BusinessRule__Group__14__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2125:1: rule__BusinessRule__Group__14__Impl : ( ']' ) ;
    public final void rule__BusinessRule__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2129:1: ( ( ']' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2130:1: ( ']' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2130:1: ( ']' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2131:1: ']'
            {
             before(grammarAccess.getBusinessRuleAccess().getRightSquareBracketKeyword_14()); 
            match(input,27,FOLLOW_27_in_rule__BusinessRule__Group__14__Impl4375); 
             after(grammarAccess.getBusinessRuleAccess().getRightSquareBracketKeyword_14()); 

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
    // $ANTLR end "rule__BusinessRule__Group__14__Impl"


    // $ANTLR start "rule__BusinessRule__Group__15"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2144:1: rule__BusinessRule__Group__15 : rule__BusinessRule__Group__15__Impl ;
    public final void rule__BusinessRule__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2148:1: ( rule__BusinessRule__Group__15__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2149:2: rule__BusinessRule__Group__15__Impl
            {
            pushFollow(FOLLOW_rule__BusinessRule__Group__15__Impl_in_rule__BusinessRule__Group__154406);
            rule__BusinessRule__Group__15__Impl();

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
    // $ANTLR end "rule__BusinessRule__Group__15"


    // $ANTLR start "rule__BusinessRule__Group__15__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2155:1: rule__BusinessRule__Group__15__Impl : ( '}' ) ;
    public final void rule__BusinessRule__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2159:1: ( ( '}' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2160:1: ( '}' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2160:1: ( '}' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2161:1: '}'
            {
             before(grammarAccess.getBusinessRuleAccess().getRightCurlyBracketKeyword_15()); 
            match(input,22,FOLLOW_22_in_rule__BusinessRule__Group__15__Impl4434); 
             after(grammarAccess.getBusinessRuleAccess().getRightCurlyBracketKeyword_15()); 

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
    // $ANTLR end "rule__BusinessRule__Group__15__Impl"


    // $ANTLR start "rule__BusinessRule__Group_9__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2206:1: rule__BusinessRule__Group_9__0 : rule__BusinessRule__Group_9__0__Impl rule__BusinessRule__Group_9__1 ;
    public final void rule__BusinessRule__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2210:1: ( rule__BusinessRule__Group_9__0__Impl rule__BusinessRule__Group_9__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2211:2: rule__BusinessRule__Group_9__0__Impl rule__BusinessRule__Group_9__1
            {
            pushFollow(FOLLOW_rule__BusinessRule__Group_9__0__Impl_in_rule__BusinessRule__Group_9__04497);
            rule__BusinessRule__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BusinessRule__Group_9__1_in_rule__BusinessRule__Group_9__04500);
            rule__BusinessRule__Group_9__1();

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
    // $ANTLR end "rule__BusinessRule__Group_9__0"


    // $ANTLR start "rule__BusinessRule__Group_9__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2218:1: rule__BusinessRule__Group_9__0__Impl : ( ',' ) ;
    public final void rule__BusinessRule__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2222:1: ( ( ',' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2223:1: ( ',' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2223:1: ( ',' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2224:1: ','
            {
             before(grammarAccess.getBusinessRuleAccess().getCommaKeyword_9_0()); 
            match(input,28,FOLLOW_28_in_rule__BusinessRule__Group_9__0__Impl4528); 
             after(grammarAccess.getBusinessRuleAccess().getCommaKeyword_9_0()); 

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
    // $ANTLR end "rule__BusinessRule__Group_9__0__Impl"


    // $ANTLR start "rule__BusinessRule__Group_9__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2237:1: rule__BusinessRule__Group_9__1 : rule__BusinessRule__Group_9__1__Impl ;
    public final void rule__BusinessRule__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2241:1: ( rule__BusinessRule__Group_9__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2242:2: rule__BusinessRule__Group_9__1__Impl
            {
            pushFollow(FOLLOW_rule__BusinessRule__Group_9__1__Impl_in_rule__BusinessRule__Group_9__14559);
            rule__BusinessRule__Group_9__1__Impl();

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
    // $ANTLR end "rule__BusinessRule__Group_9__1"


    // $ANTLR start "rule__BusinessRule__Group_9__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2248:1: rule__BusinessRule__Group_9__1__Impl : ( ( rule__BusinessRule__InputsAssignment_9_1 ) ) ;
    public final void rule__BusinessRule__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2252:1: ( ( ( rule__BusinessRule__InputsAssignment_9_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2253:1: ( ( rule__BusinessRule__InputsAssignment_9_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2253:1: ( ( rule__BusinessRule__InputsAssignment_9_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2254:1: ( rule__BusinessRule__InputsAssignment_9_1 )
            {
             before(grammarAccess.getBusinessRuleAccess().getInputsAssignment_9_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2255:1: ( rule__BusinessRule__InputsAssignment_9_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2255:2: rule__BusinessRule__InputsAssignment_9_1
            {
            pushFollow(FOLLOW_rule__BusinessRule__InputsAssignment_9_1_in_rule__BusinessRule__Group_9__1__Impl4586);
            rule__BusinessRule__InputsAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getBusinessRuleAccess().getInputsAssignment_9_1()); 

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
    // $ANTLR end "rule__BusinessRule__Group_9__1__Impl"


    // $ANTLR start "rule__BreEntityInput__Group__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2269:1: rule__BreEntityInput__Group__0 : rule__BreEntityInput__Group__0__Impl rule__BreEntityInput__Group__1 ;
    public final void rule__BreEntityInput__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2273:1: ( rule__BreEntityInput__Group__0__Impl rule__BreEntityInput__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2274:2: rule__BreEntityInput__Group__0__Impl rule__BreEntityInput__Group__1
            {
            pushFollow(FOLLOW_rule__BreEntityInput__Group__0__Impl_in_rule__BreEntityInput__Group__04620);
            rule__BreEntityInput__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BreEntityInput__Group__1_in_rule__BreEntityInput__Group__04623);
            rule__BreEntityInput__Group__1();

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
    // $ANTLR end "rule__BreEntityInput__Group__0"


    // $ANTLR start "rule__BreEntityInput__Group__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2281:1: rule__BreEntityInput__Group__0__Impl : ( ( rule__BreEntityInput__InputElementAssignment_0 ) ) ;
    public final void rule__BreEntityInput__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2285:1: ( ( ( rule__BreEntityInput__InputElementAssignment_0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2286:1: ( ( rule__BreEntityInput__InputElementAssignment_0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2286:1: ( ( rule__BreEntityInput__InputElementAssignment_0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2287:1: ( rule__BreEntityInput__InputElementAssignment_0 )
            {
             before(grammarAccess.getBreEntityInputAccess().getInputElementAssignment_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2288:1: ( rule__BreEntityInput__InputElementAssignment_0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2288:2: rule__BreEntityInput__InputElementAssignment_0
            {
            pushFollow(FOLLOW_rule__BreEntityInput__InputElementAssignment_0_in_rule__BreEntityInput__Group__0__Impl4650);
            rule__BreEntityInput__InputElementAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBreEntityInputAccess().getInputElementAssignment_0()); 

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
    // $ANTLR end "rule__BreEntityInput__Group__0__Impl"


    // $ANTLR start "rule__BreEntityInput__Group__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2298:1: rule__BreEntityInput__Group__1 : rule__BreEntityInput__Group__1__Impl ;
    public final void rule__BreEntityInput__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2302:1: ( rule__BreEntityInput__Group__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2303:2: rule__BreEntityInput__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BreEntityInput__Group__1__Impl_in_rule__BreEntityInput__Group__14680);
            rule__BreEntityInput__Group__1__Impl();

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
    // $ANTLR end "rule__BreEntityInput__Group__1"


    // $ANTLR start "rule__BreEntityInput__Group__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2309:1: rule__BreEntityInput__Group__1__Impl : ( ( rule__BreEntityInput__ConfigurationAssignment_1 ) ) ;
    public final void rule__BreEntityInput__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2313:1: ( ( ( rule__BreEntityInput__ConfigurationAssignment_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2314:1: ( ( rule__BreEntityInput__ConfigurationAssignment_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2314:1: ( ( rule__BreEntityInput__ConfigurationAssignment_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2315:1: ( rule__BreEntityInput__ConfigurationAssignment_1 )
            {
             before(grammarAccess.getBreEntityInputAccess().getConfigurationAssignment_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2316:1: ( rule__BreEntityInput__ConfigurationAssignment_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2316:2: rule__BreEntityInput__ConfigurationAssignment_1
            {
            pushFollow(FOLLOW_rule__BreEntityInput__ConfigurationAssignment_1_in_rule__BreEntityInput__Group__1__Impl4707);
            rule__BreEntityInput__ConfigurationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBreEntityInputAccess().getConfigurationAssignment_1()); 

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
    // $ANTLR end "rule__BreEntityInput__Group__1__Impl"


    // $ANTLR start "rule__EntityConfiguration__Group_0__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2330:1: rule__EntityConfiguration__Group_0__0 : rule__EntityConfiguration__Group_0__0__Impl rule__EntityConfiguration__Group_0__1 ;
    public final void rule__EntityConfiguration__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2334:1: ( rule__EntityConfiguration__Group_0__0__Impl rule__EntityConfiguration__Group_0__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2335:2: rule__EntityConfiguration__Group_0__0__Impl rule__EntityConfiguration__Group_0__1
            {
            pushFollow(FOLLOW_rule__EntityConfiguration__Group_0__0__Impl_in_rule__EntityConfiguration__Group_0__04741);
            rule__EntityConfiguration__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityConfiguration__Group_0__1_in_rule__EntityConfiguration__Group_0__04744);
            rule__EntityConfiguration__Group_0__1();

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
    // $ANTLR end "rule__EntityConfiguration__Group_0__0"


    // $ANTLR start "rule__EntityConfiguration__Group_0__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2342:1: rule__EntityConfiguration__Group_0__0__Impl : ( '{' ) ;
    public final void rule__EntityConfiguration__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2346:1: ( ( '{' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2347:1: ( '{' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2347:1: ( '{' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2348:1: '{'
            {
             before(grammarAccess.getEntityConfigurationAccess().getLeftCurlyBracketKeyword_0_0()); 
            match(input,21,FOLLOW_21_in_rule__EntityConfiguration__Group_0__0__Impl4772); 
             after(grammarAccess.getEntityConfigurationAccess().getLeftCurlyBracketKeyword_0_0()); 

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
    // $ANTLR end "rule__EntityConfiguration__Group_0__0__Impl"


    // $ANTLR start "rule__EntityConfiguration__Group_0__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2361:1: rule__EntityConfiguration__Group_0__1 : rule__EntityConfiguration__Group_0__1__Impl ;
    public final void rule__EntityConfiguration__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2365:1: ( rule__EntityConfiguration__Group_0__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2366:2: rule__EntityConfiguration__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__EntityConfiguration__Group_0__1__Impl_in_rule__EntityConfiguration__Group_0__14803);
            rule__EntityConfiguration__Group_0__1__Impl();

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
    // $ANTLR end "rule__EntityConfiguration__Group_0__1"


    // $ANTLR start "rule__EntityConfiguration__Group_0__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2372:1: rule__EntityConfiguration__Group_0__1__Impl : ( ( rule__EntityConfiguration__PrimaryAssignment_0_1 )? ) ;
    public final void rule__EntityConfiguration__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2376:1: ( ( ( rule__EntityConfiguration__PrimaryAssignment_0_1 )? ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2377:1: ( ( rule__EntityConfiguration__PrimaryAssignment_0_1 )? )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2377:1: ( ( rule__EntityConfiguration__PrimaryAssignment_0_1 )? )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2378:1: ( rule__EntityConfiguration__PrimaryAssignment_0_1 )?
            {
             before(grammarAccess.getEntityConfigurationAccess().getPrimaryAssignment_0_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2379:1: ( rule__EntityConfiguration__PrimaryAssignment_0_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==50) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2379:2: rule__EntityConfiguration__PrimaryAssignment_0_1
                    {
                    pushFollow(FOLLOW_rule__EntityConfiguration__PrimaryAssignment_0_1_in_rule__EntityConfiguration__Group_0__1__Impl4830);
                    rule__EntityConfiguration__PrimaryAssignment_0_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityConfigurationAccess().getPrimaryAssignment_0_1()); 

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
    // $ANTLR end "rule__EntityConfiguration__Group_0__1__Impl"


    // $ANTLR start "rule__EntityConfiguration__Group_2__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2393:1: rule__EntityConfiguration__Group_2__0 : rule__EntityConfiguration__Group_2__0__Impl rule__EntityConfiguration__Group_2__1 ;
    public final void rule__EntityConfiguration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2397:1: ( rule__EntityConfiguration__Group_2__0__Impl rule__EntityConfiguration__Group_2__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2398:2: rule__EntityConfiguration__Group_2__0__Impl rule__EntityConfiguration__Group_2__1
            {
            pushFollow(FOLLOW_rule__EntityConfiguration__Group_2__0__Impl_in_rule__EntityConfiguration__Group_2__04865);
            rule__EntityConfiguration__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EntityConfiguration__Group_2__1_in_rule__EntityConfiguration__Group_2__04868);
            rule__EntityConfiguration__Group_2__1();

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
    // $ANTLR end "rule__EntityConfiguration__Group_2__0"


    // $ANTLR start "rule__EntityConfiguration__Group_2__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2405:1: rule__EntityConfiguration__Group_2__0__Impl : ( ( rule__EntityConfiguration__MultipleAssignment_2_0 )? ) ;
    public final void rule__EntityConfiguration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2409:1: ( ( ( rule__EntityConfiguration__MultipleAssignment_2_0 )? ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2410:1: ( ( rule__EntityConfiguration__MultipleAssignment_2_0 )? )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2410:1: ( ( rule__EntityConfiguration__MultipleAssignment_2_0 )? )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2411:1: ( rule__EntityConfiguration__MultipleAssignment_2_0 )?
            {
             before(grammarAccess.getEntityConfigurationAccess().getMultipleAssignment_2_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2412:1: ( rule__EntityConfiguration__MultipleAssignment_2_0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==52) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2412:2: rule__EntityConfiguration__MultipleAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__EntityConfiguration__MultipleAssignment_2_0_in_rule__EntityConfiguration__Group_2__0__Impl4895);
                    rule__EntityConfiguration__MultipleAssignment_2_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityConfigurationAccess().getMultipleAssignment_2_0()); 

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
    // $ANTLR end "rule__EntityConfiguration__Group_2__0__Impl"


    // $ANTLR start "rule__EntityConfiguration__Group_2__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2422:1: rule__EntityConfiguration__Group_2__1 : rule__EntityConfiguration__Group_2__1__Impl ;
    public final void rule__EntityConfiguration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2426:1: ( rule__EntityConfiguration__Group_2__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2427:2: rule__EntityConfiguration__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__EntityConfiguration__Group_2__1__Impl_in_rule__EntityConfiguration__Group_2__14926);
            rule__EntityConfiguration__Group_2__1__Impl();

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
    // $ANTLR end "rule__EntityConfiguration__Group_2__1"


    // $ANTLR start "rule__EntityConfiguration__Group_2__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2433:1: rule__EntityConfiguration__Group_2__1__Impl : ( '}' ) ;
    public final void rule__EntityConfiguration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2437:1: ( ( '}' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2438:1: ( '}' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2438:1: ( '}' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2439:1: '}'
            {
             before(grammarAccess.getEntityConfigurationAccess().getRightCurlyBracketKeyword_2_1()); 
            match(input,22,FOLLOW_22_in_rule__EntityConfiguration__Group_2__1__Impl4954); 
             after(grammarAccess.getEntityConfigurationAccess().getRightCurlyBracketKeyword_2_1()); 

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
    // $ANTLR end "rule__EntityConfiguration__Group_2__1__Impl"


    // $ANTLR start "rule__System__Group__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2456:1: rule__System__Group__0 : rule__System__Group__0__Impl rule__System__Group__1 ;
    public final void rule__System__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2460:1: ( rule__System__Group__0__Impl rule__System__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2461:2: rule__System__Group__0__Impl rule__System__Group__1
            {
            pushFollow(FOLLOW_rule__System__Group__0__Impl_in_rule__System__Group__04989);
            rule__System__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__1_in_rule__System__Group__04992);
            rule__System__Group__1();

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
    // $ANTLR end "rule__System__Group__0"


    // $ANTLR start "rule__System__Group__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2468:1: rule__System__Group__0__Impl : ( 'SourceSystem' ) ;
    public final void rule__System__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2472:1: ( ( 'SourceSystem' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2473:1: ( 'SourceSystem' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2473:1: ( 'SourceSystem' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2474:1: 'SourceSystem'
            {
             before(grammarAccess.getSystemAccess().getSourceSystemKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__System__Group__0__Impl5020); 
             after(grammarAccess.getSystemAccess().getSourceSystemKeyword_0()); 

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
    // $ANTLR end "rule__System__Group__0__Impl"


    // $ANTLR start "rule__System__Group__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2487:1: rule__System__Group__1 : rule__System__Group__1__Impl rule__System__Group__2 ;
    public final void rule__System__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2491:1: ( rule__System__Group__1__Impl rule__System__Group__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2492:2: rule__System__Group__1__Impl rule__System__Group__2
            {
            pushFollow(FOLLOW_rule__System__Group__1__Impl_in_rule__System__Group__15051);
            rule__System__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__2_in_rule__System__Group__15054);
            rule__System__Group__2();

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
    // $ANTLR end "rule__System__Group__1"


    // $ANTLR start "rule__System__Group__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2499:1: rule__System__Group__1__Impl : ( ( rule__System__NameAssignment_1 ) ) ;
    public final void rule__System__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2503:1: ( ( ( rule__System__NameAssignment_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2504:1: ( ( rule__System__NameAssignment_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2504:1: ( ( rule__System__NameAssignment_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2505:1: ( rule__System__NameAssignment_1 )
            {
             before(grammarAccess.getSystemAccess().getNameAssignment_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2506:1: ( rule__System__NameAssignment_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2506:2: rule__System__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__System__NameAssignment_1_in_rule__System__Group__1__Impl5081);
            rule__System__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__System__Group__1__Impl"


    // $ANTLR start "rule__System__Group__2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2516:1: rule__System__Group__2 : rule__System__Group__2__Impl rule__System__Group__3 ;
    public final void rule__System__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2520:1: ( rule__System__Group__2__Impl rule__System__Group__3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2521:2: rule__System__Group__2__Impl rule__System__Group__3
            {
            pushFollow(FOLLOW_rule__System__Group__2__Impl_in_rule__System__Group__25111);
            rule__System__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__3_in_rule__System__Group__25114);
            rule__System__Group__3();

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
    // $ANTLR end "rule__System__Group__2"


    // $ANTLR start "rule__System__Group__2__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2528:1: rule__System__Group__2__Impl : ( '{' ) ;
    public final void rule__System__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2532:1: ( ( '{' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2533:1: ( '{' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2533:1: ( '{' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2534:1: '{'
            {
             before(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_21_in_rule__System__Group__2__Impl5142); 
             after(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__System__Group__2__Impl"


    // $ANTLR start "rule__System__Group__3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2547:1: rule__System__Group__3 : rule__System__Group__3__Impl rule__System__Group__4 ;
    public final void rule__System__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2551:1: ( rule__System__Group__3__Impl rule__System__Group__4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2552:2: rule__System__Group__3__Impl rule__System__Group__4
            {
            pushFollow(FOLLOW_rule__System__Group__3__Impl_in_rule__System__Group__35173);
            rule__System__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__4_in_rule__System__Group__35176);
            rule__System__Group__4();

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
    // $ANTLR end "rule__System__Group__3"


    // $ANTLR start "rule__System__Group__3__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2559:1: rule__System__Group__3__Impl : ( ( rule__System__SrcEntitiesAssignment_3 ) ) ;
    public final void rule__System__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2563:1: ( ( ( rule__System__SrcEntitiesAssignment_3 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2564:1: ( ( rule__System__SrcEntitiesAssignment_3 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2564:1: ( ( rule__System__SrcEntitiesAssignment_3 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2565:1: ( rule__System__SrcEntitiesAssignment_3 )
            {
             before(grammarAccess.getSystemAccess().getSrcEntitiesAssignment_3()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2566:1: ( rule__System__SrcEntitiesAssignment_3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2566:2: rule__System__SrcEntitiesAssignment_3
            {
            pushFollow(FOLLOW_rule__System__SrcEntitiesAssignment_3_in_rule__System__Group__3__Impl5203);
            rule__System__SrcEntitiesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getSrcEntitiesAssignment_3()); 

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
    // $ANTLR end "rule__System__Group__3__Impl"


    // $ANTLR start "rule__System__Group__4"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2576:1: rule__System__Group__4 : rule__System__Group__4__Impl ;
    public final void rule__System__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2580:1: ( rule__System__Group__4__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2581:2: rule__System__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__System__Group__4__Impl_in_rule__System__Group__45233);
            rule__System__Group__4__Impl();

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
    // $ANTLR end "rule__System__Group__4"


    // $ANTLR start "rule__System__Group__4__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2587:1: rule__System__Group__4__Impl : ( '}' ) ;
    public final void rule__System__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2591:1: ( ( '}' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2592:1: ( '}' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2592:1: ( '}' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2593:1: '}'
            {
             before(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_4()); 
            match(input,22,FOLLOW_22_in_rule__System__Group__4__Impl5261); 
             after(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__System__Group__4__Impl"


    // $ANTLR start "rule__SystemEntity__Group__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2616:1: rule__SystemEntity__Group__0 : rule__SystemEntity__Group__0__Impl rule__SystemEntity__Group__1 ;
    public final void rule__SystemEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2620:1: ( rule__SystemEntity__Group__0__Impl rule__SystemEntity__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2621:2: rule__SystemEntity__Group__0__Impl rule__SystemEntity__Group__1
            {
            pushFollow(FOLLOW_rule__SystemEntity__Group__0__Impl_in_rule__SystemEntity__Group__05302);
            rule__SystemEntity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SystemEntity__Group__1_in_rule__SystemEntity__Group__05305);
            rule__SystemEntity__Group__1();

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
    // $ANTLR end "rule__SystemEntity__Group__0"


    // $ANTLR start "rule__SystemEntity__Group__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2628:1: rule__SystemEntity__Group__0__Impl : ( 'SystemEntit\\u00E4t' ) ;
    public final void rule__SystemEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2632:1: ( ( 'SystemEntit\\u00E4t' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2633:1: ( 'SystemEntit\\u00E4t' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2633:1: ( 'SystemEntit\\u00E4t' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2634:1: 'SystemEntit\\u00E4t'
            {
             before(grammarAccess.getSystemEntityAccess().getSystemEntitätKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__SystemEntity__Group__0__Impl5333); 
             after(grammarAccess.getSystemEntityAccess().getSystemEntitätKeyword_0()); 

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
    // $ANTLR end "rule__SystemEntity__Group__0__Impl"


    // $ANTLR start "rule__SystemEntity__Group__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2647:1: rule__SystemEntity__Group__1 : rule__SystemEntity__Group__1__Impl rule__SystemEntity__Group__2 ;
    public final void rule__SystemEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2651:1: ( rule__SystemEntity__Group__1__Impl rule__SystemEntity__Group__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2652:2: rule__SystemEntity__Group__1__Impl rule__SystemEntity__Group__2
            {
            pushFollow(FOLLOW_rule__SystemEntity__Group__1__Impl_in_rule__SystemEntity__Group__15364);
            rule__SystemEntity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SystemEntity__Group__2_in_rule__SystemEntity__Group__15367);
            rule__SystemEntity__Group__2();

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
    // $ANTLR end "rule__SystemEntity__Group__1"


    // $ANTLR start "rule__SystemEntity__Group__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2659:1: rule__SystemEntity__Group__1__Impl : ( ( rule__SystemEntity__NameAssignment_1 ) ) ;
    public final void rule__SystemEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2663:1: ( ( ( rule__SystemEntity__NameAssignment_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2664:1: ( ( rule__SystemEntity__NameAssignment_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2664:1: ( ( rule__SystemEntity__NameAssignment_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2665:1: ( rule__SystemEntity__NameAssignment_1 )
            {
             before(grammarAccess.getSystemEntityAccess().getNameAssignment_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2666:1: ( rule__SystemEntity__NameAssignment_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2666:2: rule__SystemEntity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SystemEntity__NameAssignment_1_in_rule__SystemEntity__Group__1__Impl5394);
            rule__SystemEntity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemEntityAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__SystemEntity__Group__1__Impl"


    // $ANTLR start "rule__SystemEntity__Group__2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2676:1: rule__SystemEntity__Group__2 : rule__SystemEntity__Group__2__Impl rule__SystemEntity__Group__3 ;
    public final void rule__SystemEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2680:1: ( rule__SystemEntity__Group__2__Impl rule__SystemEntity__Group__3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2681:2: rule__SystemEntity__Group__2__Impl rule__SystemEntity__Group__3
            {
            pushFollow(FOLLOW_rule__SystemEntity__Group__2__Impl_in_rule__SystemEntity__Group__25424);
            rule__SystemEntity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SystemEntity__Group__3_in_rule__SystemEntity__Group__25427);
            rule__SystemEntity__Group__3();

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
    // $ANTLR end "rule__SystemEntity__Group__2"


    // $ANTLR start "rule__SystemEntity__Group__2__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2688:1: rule__SystemEntity__Group__2__Impl : ( 'Format' ) ;
    public final void rule__SystemEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2692:1: ( ( 'Format' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2693:1: ( 'Format' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2693:1: ( 'Format' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2694:1: 'Format'
            {
             before(grammarAccess.getSystemEntityAccess().getFormatKeyword_2()); 
            match(input,36,FOLLOW_36_in_rule__SystemEntity__Group__2__Impl5455); 
             after(grammarAccess.getSystemEntityAccess().getFormatKeyword_2()); 

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
    // $ANTLR end "rule__SystemEntity__Group__2__Impl"


    // $ANTLR start "rule__SystemEntity__Group__3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2707:1: rule__SystemEntity__Group__3 : rule__SystemEntity__Group__3__Impl ;
    public final void rule__SystemEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2711:1: ( rule__SystemEntity__Group__3__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2712:2: rule__SystemEntity__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SystemEntity__Group__3__Impl_in_rule__SystemEntity__Group__35486);
            rule__SystemEntity__Group__3__Impl();

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
    // $ANTLR end "rule__SystemEntity__Group__3"


    // $ANTLR start "rule__SystemEntity__Group__3__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2718:1: rule__SystemEntity__Group__3__Impl : ( ( rule__SystemEntity__FormatAssignment_3 ) ) ;
    public final void rule__SystemEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2722:1: ( ( ( rule__SystemEntity__FormatAssignment_3 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2723:1: ( ( rule__SystemEntity__FormatAssignment_3 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2723:1: ( ( rule__SystemEntity__FormatAssignment_3 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2724:1: ( rule__SystemEntity__FormatAssignment_3 )
            {
             before(grammarAccess.getSystemEntityAccess().getFormatAssignment_3()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2725:1: ( rule__SystemEntity__FormatAssignment_3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2725:2: rule__SystemEntity__FormatAssignment_3
            {
            pushFollow(FOLLOW_rule__SystemEntity__FormatAssignment_3_in_rule__SystemEntity__Group__3__Impl5513);
            rule__SystemEntity__FormatAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSystemEntityAccess().getFormatAssignment_3()); 

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
    // $ANTLR end "rule__SystemEntity__Group__3__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2743:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2747:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2748:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__05551);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__05554);
            rule__Import__Group__1();

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
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2755:1: rule__Import__Group__0__Impl : ( 'Import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2759:1: ( ( 'Import' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2760:1: ( 'Import' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2760:1: ( 'Import' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2761:1: 'Import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__Import__Group__0__Impl5582); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

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
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2774:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2778:1: ( rule__Import__Group__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2779:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__15613);
            rule__Import__Group__1__Impl();

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
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2785:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2789:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2790:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2790:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2791:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2792:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2792:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl5640);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 

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
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__FqnWithWildCard__Group__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2806:1: rule__FqnWithWildCard__Group__0 : rule__FqnWithWildCard__Group__0__Impl rule__FqnWithWildCard__Group__1 ;
    public final void rule__FqnWithWildCard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2810:1: ( rule__FqnWithWildCard__Group__0__Impl rule__FqnWithWildCard__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2811:2: rule__FqnWithWildCard__Group__0__Impl rule__FqnWithWildCard__Group__1
            {
            pushFollow(FOLLOW_rule__FqnWithWildCard__Group__0__Impl_in_rule__FqnWithWildCard__Group__05674);
            rule__FqnWithWildCard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FqnWithWildCard__Group__1_in_rule__FqnWithWildCard__Group__05677);
            rule__FqnWithWildCard__Group__1();

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
    // $ANTLR end "rule__FqnWithWildCard__Group__0"


    // $ANTLR start "rule__FqnWithWildCard__Group__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2818:1: rule__FqnWithWildCard__Group__0__Impl : ( ruleFQN ) ;
    public final void rule__FqnWithWildCard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2822:1: ( ( ruleFQN ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2823:1: ( ruleFQN )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2823:1: ( ruleFQN )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2824:1: ruleFQN
            {
             before(grammarAccess.getFqnWithWildCardAccess().getFQNParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__FqnWithWildCard__Group__0__Impl5704);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFqnWithWildCardAccess().getFQNParserRuleCall_0()); 

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
    // $ANTLR end "rule__FqnWithWildCard__Group__0__Impl"


    // $ANTLR start "rule__FqnWithWildCard__Group__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2835:1: rule__FqnWithWildCard__Group__1 : rule__FqnWithWildCard__Group__1__Impl ;
    public final void rule__FqnWithWildCard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2839:1: ( rule__FqnWithWildCard__Group__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2840:2: rule__FqnWithWildCard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FqnWithWildCard__Group__1__Impl_in_rule__FqnWithWildCard__Group__15733);
            rule__FqnWithWildCard__Group__1__Impl();

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
    // $ANTLR end "rule__FqnWithWildCard__Group__1"


    // $ANTLR start "rule__FqnWithWildCard__Group__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2846:1: rule__FqnWithWildCard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__FqnWithWildCard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2850:1: ( ( ( '.*' )? ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2851:1: ( ( '.*' )? )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2851:1: ( ( '.*' )? )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2852:1: ( '.*' )?
            {
             before(grammarAccess.getFqnWithWildCardAccess().getFullStopAsteriskKeyword_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2853:1: ( '.*' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==38) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2854:2: '.*'
                    {
                    match(input,38,FOLLOW_38_in_rule__FqnWithWildCard__Group__1__Impl5762); 

                    }
                    break;

            }

             after(grammarAccess.getFqnWithWildCardAccess().getFullStopAsteriskKeyword_1()); 

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
    // $ANTLR end "rule__FqnWithWildCard__Group__1__Impl"


    // $ANTLR start "rule__Diagram__Group__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2869:1: rule__Diagram__Group__0 : rule__Diagram__Group__0__Impl rule__Diagram__Group__1 ;
    public final void rule__Diagram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2873:1: ( rule__Diagram__Group__0__Impl rule__Diagram__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2874:2: rule__Diagram__Group__0__Impl rule__Diagram__Group__1
            {
            pushFollow(FOLLOW_rule__Diagram__Group__0__Impl_in_rule__Diagram__Group__05799);
            rule__Diagram__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Diagram__Group__1_in_rule__Diagram__Group__05802);
            rule__Diagram__Group__1();

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
    // $ANTLR end "rule__Diagram__Group__0"


    // $ANTLR start "rule__Diagram__Group__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2881:1: rule__Diagram__Group__0__Impl : ( ( rule__Diagram__ImportsAssignment_0 )* ) ;
    public final void rule__Diagram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2885:1: ( ( ( rule__Diagram__ImportsAssignment_0 )* ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2886:1: ( ( rule__Diagram__ImportsAssignment_0 )* )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2886:1: ( ( rule__Diagram__ImportsAssignment_0 )* )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2887:1: ( rule__Diagram__ImportsAssignment_0 )*
            {
             before(grammarAccess.getDiagramAccess().getImportsAssignment_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2888:1: ( rule__Diagram__ImportsAssignment_0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==37) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2888:2: rule__Diagram__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Diagram__ImportsAssignment_0_in_rule__Diagram__Group__0__Impl5829);
            	    rule__Diagram__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getDiagramAccess().getImportsAssignment_0()); 

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
    // $ANTLR end "rule__Diagram__Group__0__Impl"


    // $ANTLR start "rule__Diagram__Group__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2898:1: rule__Diagram__Group__1 : rule__Diagram__Group__1__Impl rule__Diagram__Group__2 ;
    public final void rule__Diagram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2902:1: ( rule__Diagram__Group__1__Impl rule__Diagram__Group__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2903:2: rule__Diagram__Group__1__Impl rule__Diagram__Group__2
            {
            pushFollow(FOLLOW_rule__Diagram__Group__1__Impl_in_rule__Diagram__Group__15860);
            rule__Diagram__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Diagram__Group__2_in_rule__Diagram__Group__15863);
            rule__Diagram__Group__2();

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
    // $ANTLR end "rule__Diagram__Group__1"


    // $ANTLR start "rule__Diagram__Group__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2910:1: rule__Diagram__Group__1__Impl : ( 'Diagram' ) ;
    public final void rule__Diagram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2914:1: ( ( 'Diagram' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2915:1: ( 'Diagram' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2915:1: ( 'Diagram' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2916:1: 'Diagram'
            {
             before(grammarAccess.getDiagramAccess().getDiagramKeyword_1()); 
            match(input,39,FOLLOW_39_in_rule__Diagram__Group__1__Impl5891); 
             after(grammarAccess.getDiagramAccess().getDiagramKeyword_1()); 

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
    // $ANTLR end "rule__Diagram__Group__1__Impl"


    // $ANTLR start "rule__Diagram__Group__2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2929:1: rule__Diagram__Group__2 : rule__Diagram__Group__2__Impl rule__Diagram__Group__3 ;
    public final void rule__Diagram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2933:1: ( rule__Diagram__Group__2__Impl rule__Diagram__Group__3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2934:2: rule__Diagram__Group__2__Impl rule__Diagram__Group__3
            {
            pushFollow(FOLLOW_rule__Diagram__Group__2__Impl_in_rule__Diagram__Group__25922);
            rule__Diagram__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Diagram__Group__3_in_rule__Diagram__Group__25925);
            rule__Diagram__Group__3();

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
    // $ANTLR end "rule__Diagram__Group__2"


    // $ANTLR start "rule__Diagram__Group__2__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2941:1: rule__Diagram__Group__2__Impl : ( ( rule__Diagram__NameAssignment_2 ) ) ;
    public final void rule__Diagram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2945:1: ( ( ( rule__Diagram__NameAssignment_2 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2946:1: ( ( rule__Diagram__NameAssignment_2 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2946:1: ( ( rule__Diagram__NameAssignment_2 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2947:1: ( rule__Diagram__NameAssignment_2 )
            {
             before(grammarAccess.getDiagramAccess().getNameAssignment_2()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2948:1: ( rule__Diagram__NameAssignment_2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2948:2: rule__Diagram__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Diagram__NameAssignment_2_in_rule__Diagram__Group__2__Impl5952);
            rule__Diagram__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDiagramAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Diagram__Group__2__Impl"


    // $ANTLR start "rule__Diagram__Group__3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2958:1: rule__Diagram__Group__3 : rule__Diagram__Group__3__Impl rule__Diagram__Group__4 ;
    public final void rule__Diagram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2962:1: ( rule__Diagram__Group__3__Impl rule__Diagram__Group__4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2963:2: rule__Diagram__Group__3__Impl rule__Diagram__Group__4
            {
            pushFollow(FOLLOW_rule__Diagram__Group__3__Impl_in_rule__Diagram__Group__35982);
            rule__Diagram__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Diagram__Group__4_in_rule__Diagram__Group__35985);
            rule__Diagram__Group__4();

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
    // $ANTLR end "rule__Diagram__Group__3"


    // $ANTLR start "rule__Diagram__Group__3__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2970:1: rule__Diagram__Group__3__Impl : ( '{' ) ;
    public final void rule__Diagram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2974:1: ( ( '{' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2975:1: ( '{' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2975:1: ( '{' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2976:1: '{'
            {
             before(grammarAccess.getDiagramAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__Diagram__Group__3__Impl6013); 
             after(grammarAccess.getDiagramAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Diagram__Group__3__Impl"


    // $ANTLR start "rule__Diagram__Group__4"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2989:1: rule__Diagram__Group__4 : rule__Diagram__Group__4__Impl rule__Diagram__Group__5 ;
    public final void rule__Diagram__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2993:1: ( rule__Diagram__Group__4__Impl rule__Diagram__Group__5 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2994:2: rule__Diagram__Group__4__Impl rule__Diagram__Group__5
            {
            pushFollow(FOLLOW_rule__Diagram__Group__4__Impl_in_rule__Diagram__Group__46044);
            rule__Diagram__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Diagram__Group__5_in_rule__Diagram__Group__46047);
            rule__Diagram__Group__5();

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
    // $ANTLR end "rule__Diagram__Group__4"


    // $ANTLR start "rule__Diagram__Group__4__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3001:1: rule__Diagram__Group__4__Impl : ( ( rule__Diagram__IncludesAssignment_4 )* ) ;
    public final void rule__Diagram__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3005:1: ( ( ( rule__Diagram__IncludesAssignment_4 )* ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3006:1: ( ( rule__Diagram__IncludesAssignment_4 )* )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3006:1: ( ( rule__Diagram__IncludesAssignment_4 )* )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3007:1: ( rule__Diagram__IncludesAssignment_4 )*
            {
             before(grammarAccess.getDiagramAccess().getIncludesAssignment_4()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3008:1: ( rule__Diagram__IncludesAssignment_4 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=11 && LA18_0<=12)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3008:2: rule__Diagram__IncludesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Diagram__IncludesAssignment_4_in_rule__Diagram__Group__4__Impl6074);
            	    rule__Diagram__IncludesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getDiagramAccess().getIncludesAssignment_4()); 

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
    // $ANTLR end "rule__Diagram__Group__4__Impl"


    // $ANTLR start "rule__Diagram__Group__5"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3018:1: rule__Diagram__Group__5 : rule__Diagram__Group__5__Impl ;
    public final void rule__Diagram__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3022:1: ( rule__Diagram__Group__5__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3023:2: rule__Diagram__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Diagram__Group__5__Impl_in_rule__Diagram__Group__56105);
            rule__Diagram__Group__5__Impl();

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
    // $ANTLR end "rule__Diagram__Group__5"


    // $ANTLR start "rule__Diagram__Group__5__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3029:1: rule__Diagram__Group__5__Impl : ( '}' ) ;
    public final void rule__Diagram__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3033:1: ( ( '}' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3034:1: ( '}' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3034:1: ( '}' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3035:1: '}'
            {
             before(grammarAccess.getDiagramAccess().getRightCurlyBracketKeyword_5()); 
            match(input,22,FOLLOW_22_in_rule__Diagram__Group__5__Impl6133); 
             after(grammarAccess.getDiagramAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Diagram__Group__5__Impl"


    // $ANTLR start "rule__Include__Group__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3060:1: rule__Include__Group__0 : rule__Include__Group__0__Impl rule__Include__Group__1 ;
    public final void rule__Include__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3064:1: ( rule__Include__Group__0__Impl rule__Include__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3065:2: rule__Include__Group__0__Impl rule__Include__Group__1
            {
            pushFollow(FOLLOW_rule__Include__Group__0__Impl_in_rule__Include__Group__06176);
            rule__Include__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Include__Group__1_in_rule__Include__Group__06179);
            rule__Include__Group__1();

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
    // $ANTLR end "rule__Include__Group__0"


    // $ANTLR start "rule__Include__Group__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3072:1: rule__Include__Group__0__Impl : ( ( rule__Include__IncludeAssignment_0 ) ) ;
    public final void rule__Include__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3076:1: ( ( ( rule__Include__IncludeAssignment_0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3077:1: ( ( rule__Include__IncludeAssignment_0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3077:1: ( ( rule__Include__IncludeAssignment_0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3078:1: ( rule__Include__IncludeAssignment_0 )
            {
             before(grammarAccess.getIncludeAccess().getIncludeAssignment_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3079:1: ( rule__Include__IncludeAssignment_0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3079:2: rule__Include__IncludeAssignment_0
            {
            pushFollow(FOLLOW_rule__Include__IncludeAssignment_0_in_rule__Include__Group__0__Impl6206);
            rule__Include__IncludeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getIncludeAccess().getIncludeAssignment_0()); 

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
    // $ANTLR end "rule__Include__Group__0__Impl"


    // $ANTLR start "rule__Include__Group__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3089:1: rule__Include__Group__1 : rule__Include__Group__1__Impl rule__Include__Group__2 ;
    public final void rule__Include__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3093:1: ( rule__Include__Group__1__Impl rule__Include__Group__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3094:2: rule__Include__Group__1__Impl rule__Include__Group__2
            {
            pushFollow(FOLLOW_rule__Include__Group__1__Impl_in_rule__Include__Group__16236);
            rule__Include__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Include__Group__2_in_rule__Include__Group__16239);
            rule__Include__Group__2();

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
    // $ANTLR end "rule__Include__Group__1"


    // $ANTLR start "rule__Include__Group__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3101:1: rule__Include__Group__1__Impl : ( ( rule__Include__EntityAssignment_1 ) ) ;
    public final void rule__Include__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3105:1: ( ( ( rule__Include__EntityAssignment_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3106:1: ( ( rule__Include__EntityAssignment_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3106:1: ( ( rule__Include__EntityAssignment_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3107:1: ( rule__Include__EntityAssignment_1 )
            {
             before(grammarAccess.getIncludeAccess().getEntityAssignment_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3108:1: ( rule__Include__EntityAssignment_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3108:2: rule__Include__EntityAssignment_1
            {
            pushFollow(FOLLOW_rule__Include__EntityAssignment_1_in_rule__Include__Group__1__Impl6266);
            rule__Include__EntityAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIncludeAccess().getEntityAssignment_1()); 

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
    // $ANTLR end "rule__Include__Group__1__Impl"


    // $ANTLR start "rule__Include__Group__2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3118:1: rule__Include__Group__2 : rule__Include__Group__2__Impl ;
    public final void rule__Include__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3122:1: ( rule__Include__Group__2__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3123:2: rule__Include__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Include__Group__2__Impl_in_rule__Include__Group__26296);
            rule__Include__Group__2__Impl();

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
    // $ANTLR end "rule__Include__Group__2"


    // $ANTLR start "rule__Include__Group__2__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3129:1: rule__Include__Group__2__Impl : ( ( rule__Include__Group_2__0 ) ) ;
    public final void rule__Include__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3133:1: ( ( ( rule__Include__Group_2__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3134:1: ( ( rule__Include__Group_2__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3134:1: ( ( rule__Include__Group_2__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3135:1: ( rule__Include__Group_2__0 )
            {
             before(grammarAccess.getIncludeAccess().getGroup_2()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3136:1: ( rule__Include__Group_2__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3136:2: rule__Include__Group_2__0
            {
            pushFollow(FOLLOW_rule__Include__Group_2__0_in_rule__Include__Group__2__Impl6323);
            rule__Include__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getIncludeAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Include__Group__2__Impl"


    // $ANTLR start "rule__Include__Group_2__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3152:1: rule__Include__Group_2__0 : rule__Include__Group_2__0__Impl rule__Include__Group_2__1 ;
    public final void rule__Include__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3156:1: ( rule__Include__Group_2__0__Impl rule__Include__Group_2__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3157:2: rule__Include__Group_2__0__Impl rule__Include__Group_2__1
            {
            pushFollow(FOLLOW_rule__Include__Group_2__0__Impl_in_rule__Include__Group_2__06359);
            rule__Include__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Include__Group_2__1_in_rule__Include__Group_2__06362);
            rule__Include__Group_2__1();

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
    // $ANTLR end "rule__Include__Group_2__0"


    // $ANTLR start "rule__Include__Group_2__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3164:1: rule__Include__Group_2__0__Impl : ( 'with' ) ;
    public final void rule__Include__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3168:1: ( ( 'with' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3169:1: ( 'with' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3169:1: ( 'with' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3170:1: 'with'
            {
             before(grammarAccess.getIncludeAccess().getWithKeyword_2_0()); 
            match(input,40,FOLLOW_40_in_rule__Include__Group_2__0__Impl6390); 
             after(grammarAccess.getIncludeAccess().getWithKeyword_2_0()); 

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
    // $ANTLR end "rule__Include__Group_2__0__Impl"


    // $ANTLR start "rule__Include__Group_2__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3183:1: rule__Include__Group_2__1 : rule__Include__Group_2__1__Impl rule__Include__Group_2__2 ;
    public final void rule__Include__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3187:1: ( rule__Include__Group_2__1__Impl rule__Include__Group_2__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3188:2: rule__Include__Group_2__1__Impl rule__Include__Group_2__2
            {
            pushFollow(FOLLOW_rule__Include__Group_2__1__Impl_in_rule__Include__Group_2__16421);
            rule__Include__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Include__Group_2__2_in_rule__Include__Group_2__16424);
            rule__Include__Group_2__2();

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
    // $ANTLR end "rule__Include__Group_2__1"


    // $ANTLR start "rule__Include__Group_2__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3195:1: rule__Include__Group_2__1__Impl : ( '{' ) ;
    public final void rule__Include__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3199:1: ( ( '{' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3200:1: ( '{' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3200:1: ( '{' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3201:1: '{'
            {
             before(grammarAccess.getIncludeAccess().getLeftCurlyBracketKeyword_2_1()); 
            match(input,21,FOLLOW_21_in_rule__Include__Group_2__1__Impl6452); 
             after(grammarAccess.getIncludeAccess().getLeftCurlyBracketKeyword_2_1()); 

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
    // $ANTLR end "rule__Include__Group_2__1__Impl"


    // $ANTLR start "rule__Include__Group_2__2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3214:1: rule__Include__Group_2__2 : rule__Include__Group_2__2__Impl rule__Include__Group_2__3 ;
    public final void rule__Include__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3218:1: ( rule__Include__Group_2__2__Impl rule__Include__Group_2__3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3219:2: rule__Include__Group_2__2__Impl rule__Include__Group_2__3
            {
            pushFollow(FOLLOW_rule__Include__Group_2__2__Impl_in_rule__Include__Group_2__26483);
            rule__Include__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Include__Group_2__3_in_rule__Include__Group_2__26486);
            rule__Include__Group_2__3();

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
    // $ANTLR end "rule__Include__Group_2__2"


    // $ANTLR start "rule__Include__Group_2__2__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3226:1: rule__Include__Group_2__2__Impl : ( ( rule__Include__FieldsAssignment_2_2 ) ) ;
    public final void rule__Include__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3230:1: ( ( ( rule__Include__FieldsAssignment_2_2 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3231:1: ( ( rule__Include__FieldsAssignment_2_2 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3231:1: ( ( rule__Include__FieldsAssignment_2_2 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3232:1: ( rule__Include__FieldsAssignment_2_2 )
            {
             before(grammarAccess.getIncludeAccess().getFieldsAssignment_2_2()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3233:1: ( rule__Include__FieldsAssignment_2_2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3233:2: rule__Include__FieldsAssignment_2_2
            {
            pushFollow(FOLLOW_rule__Include__FieldsAssignment_2_2_in_rule__Include__Group_2__2__Impl6513);
            rule__Include__FieldsAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getIncludeAccess().getFieldsAssignment_2_2()); 

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
    // $ANTLR end "rule__Include__Group_2__2__Impl"


    // $ANTLR start "rule__Include__Group_2__3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3243:1: rule__Include__Group_2__3 : rule__Include__Group_2__3__Impl rule__Include__Group_2__4 ;
    public final void rule__Include__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3247:1: ( rule__Include__Group_2__3__Impl rule__Include__Group_2__4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3248:2: rule__Include__Group_2__3__Impl rule__Include__Group_2__4
            {
            pushFollow(FOLLOW_rule__Include__Group_2__3__Impl_in_rule__Include__Group_2__36543);
            rule__Include__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Include__Group_2__4_in_rule__Include__Group_2__36546);
            rule__Include__Group_2__4();

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
    // $ANTLR end "rule__Include__Group_2__3"


    // $ANTLR start "rule__Include__Group_2__3__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3255:1: rule__Include__Group_2__3__Impl : ( ( rule__Include__Group_2_3__0 )* ) ;
    public final void rule__Include__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3259:1: ( ( ( rule__Include__Group_2_3__0 )* ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3260:1: ( ( rule__Include__Group_2_3__0 )* )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3260:1: ( ( rule__Include__Group_2_3__0 )* )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3261:1: ( rule__Include__Group_2_3__0 )*
            {
             before(grammarAccess.getIncludeAccess().getGroup_2_3()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3262:1: ( rule__Include__Group_2_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==28) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3262:2: rule__Include__Group_2_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Include__Group_2_3__0_in_rule__Include__Group_2__3__Impl6573);
            	    rule__Include__Group_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getIncludeAccess().getGroup_2_3()); 

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
    // $ANTLR end "rule__Include__Group_2__3__Impl"


    // $ANTLR start "rule__Include__Group_2__4"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3272:1: rule__Include__Group_2__4 : rule__Include__Group_2__4__Impl ;
    public final void rule__Include__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3276:1: ( rule__Include__Group_2__4__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3277:2: rule__Include__Group_2__4__Impl
            {
            pushFollow(FOLLOW_rule__Include__Group_2__4__Impl_in_rule__Include__Group_2__46604);
            rule__Include__Group_2__4__Impl();

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
    // $ANTLR end "rule__Include__Group_2__4"


    // $ANTLR start "rule__Include__Group_2__4__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3283:1: rule__Include__Group_2__4__Impl : ( '}' ) ;
    public final void rule__Include__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3287:1: ( ( '}' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3288:1: ( '}' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3288:1: ( '}' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3289:1: '}'
            {
             before(grammarAccess.getIncludeAccess().getRightCurlyBracketKeyword_2_4()); 
            match(input,22,FOLLOW_22_in_rule__Include__Group_2__4__Impl6632); 
             after(grammarAccess.getIncludeAccess().getRightCurlyBracketKeyword_2_4()); 

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
    // $ANTLR end "rule__Include__Group_2__4__Impl"


    // $ANTLR start "rule__Include__Group_2_3__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3312:1: rule__Include__Group_2_3__0 : rule__Include__Group_2_3__0__Impl rule__Include__Group_2_3__1 ;
    public final void rule__Include__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3316:1: ( rule__Include__Group_2_3__0__Impl rule__Include__Group_2_3__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3317:2: rule__Include__Group_2_3__0__Impl rule__Include__Group_2_3__1
            {
            pushFollow(FOLLOW_rule__Include__Group_2_3__0__Impl_in_rule__Include__Group_2_3__06673);
            rule__Include__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Include__Group_2_3__1_in_rule__Include__Group_2_3__06676);
            rule__Include__Group_2_3__1();

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
    // $ANTLR end "rule__Include__Group_2_3__0"


    // $ANTLR start "rule__Include__Group_2_3__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3324:1: rule__Include__Group_2_3__0__Impl : ( ',' ) ;
    public final void rule__Include__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3328:1: ( ( ',' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3329:1: ( ',' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3329:1: ( ',' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3330:1: ','
            {
             before(grammarAccess.getIncludeAccess().getCommaKeyword_2_3_0()); 
            match(input,28,FOLLOW_28_in_rule__Include__Group_2_3__0__Impl6704); 
             after(grammarAccess.getIncludeAccess().getCommaKeyword_2_3_0()); 

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
    // $ANTLR end "rule__Include__Group_2_3__0__Impl"


    // $ANTLR start "rule__Include__Group_2_3__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3343:1: rule__Include__Group_2_3__1 : rule__Include__Group_2_3__1__Impl ;
    public final void rule__Include__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3347:1: ( rule__Include__Group_2_3__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3348:2: rule__Include__Group_2_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Include__Group_2_3__1__Impl_in_rule__Include__Group_2_3__16735);
            rule__Include__Group_2_3__1__Impl();

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
    // $ANTLR end "rule__Include__Group_2_3__1"


    // $ANTLR start "rule__Include__Group_2_3__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3354:1: rule__Include__Group_2_3__1__Impl : ( ( rule__Include__FieldsAssignment_2_3_1 ) ) ;
    public final void rule__Include__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3358:1: ( ( ( rule__Include__FieldsAssignment_2_3_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3359:1: ( ( rule__Include__FieldsAssignment_2_3_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3359:1: ( ( rule__Include__FieldsAssignment_2_3_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3360:1: ( rule__Include__FieldsAssignment_2_3_1 )
            {
             before(grammarAccess.getIncludeAccess().getFieldsAssignment_2_3_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3361:1: ( rule__Include__FieldsAssignment_2_3_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3361:2: rule__Include__FieldsAssignment_2_3_1
            {
            pushFollow(FOLLOW_rule__Include__FieldsAssignment_2_3_1_in_rule__Include__Group_2_3__1__Impl6762);
            rule__Include__FieldsAssignment_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getIncludeAccess().getFieldsAssignment_2_3_1()); 

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
    // $ANTLR end "rule__Include__Group_2_3__1__Impl"


    // $ANTLR start "rule__EnumDeclaration__Group__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3375:1: rule__EnumDeclaration__Group__0 : rule__EnumDeclaration__Group__0__Impl rule__EnumDeclaration__Group__1 ;
    public final void rule__EnumDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3379:1: ( rule__EnumDeclaration__Group__0__Impl rule__EnumDeclaration__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3380:2: rule__EnumDeclaration__Group__0__Impl rule__EnumDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__EnumDeclaration__Group__0__Impl_in_rule__EnumDeclaration__Group__06796);
            rule__EnumDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumDeclaration__Group__1_in_rule__EnumDeclaration__Group__06799);
            rule__EnumDeclaration__Group__1();

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
    // $ANTLR end "rule__EnumDeclaration__Group__0"


    // $ANTLR start "rule__EnumDeclaration__Group__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3387:1: rule__EnumDeclaration__Group__0__Impl : ( 'Enumeration' ) ;
    public final void rule__EnumDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3391:1: ( ( 'Enumeration' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3392:1: ( 'Enumeration' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3392:1: ( 'Enumeration' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3393:1: 'Enumeration'
            {
             before(grammarAccess.getEnumDeclarationAccess().getEnumerationKeyword_0()); 
            match(input,41,FOLLOW_41_in_rule__EnumDeclaration__Group__0__Impl6827); 
             after(grammarAccess.getEnumDeclarationAccess().getEnumerationKeyword_0()); 

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
    // $ANTLR end "rule__EnumDeclaration__Group__0__Impl"


    // $ANTLR start "rule__EnumDeclaration__Group__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3406:1: rule__EnumDeclaration__Group__1 : rule__EnumDeclaration__Group__1__Impl rule__EnumDeclaration__Group__2 ;
    public final void rule__EnumDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3410:1: ( rule__EnumDeclaration__Group__1__Impl rule__EnumDeclaration__Group__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3411:2: rule__EnumDeclaration__Group__1__Impl rule__EnumDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__EnumDeclaration__Group__1__Impl_in_rule__EnumDeclaration__Group__16858);
            rule__EnumDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumDeclaration__Group__2_in_rule__EnumDeclaration__Group__16861);
            rule__EnumDeclaration__Group__2();

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
    // $ANTLR end "rule__EnumDeclaration__Group__1"


    // $ANTLR start "rule__EnumDeclaration__Group__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3418:1: rule__EnumDeclaration__Group__1__Impl : ( ( rule__EnumDeclaration__NameAssignment_1 ) ) ;
    public final void rule__EnumDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3422:1: ( ( ( rule__EnumDeclaration__NameAssignment_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3423:1: ( ( rule__EnumDeclaration__NameAssignment_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3423:1: ( ( rule__EnumDeclaration__NameAssignment_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3424:1: ( rule__EnumDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getEnumDeclarationAccess().getNameAssignment_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3425:1: ( rule__EnumDeclaration__NameAssignment_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3425:2: rule__EnumDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumDeclaration__NameAssignment_1_in_rule__EnumDeclaration__Group__1__Impl6888);
            rule__EnumDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumDeclarationAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__EnumDeclaration__Group__1__Impl"


    // $ANTLR start "rule__EnumDeclaration__Group__2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3435:1: rule__EnumDeclaration__Group__2 : rule__EnumDeclaration__Group__2__Impl rule__EnumDeclaration__Group__3 ;
    public final void rule__EnumDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3439:1: ( rule__EnumDeclaration__Group__2__Impl rule__EnumDeclaration__Group__3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3440:2: rule__EnumDeclaration__Group__2__Impl rule__EnumDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__EnumDeclaration__Group__2__Impl_in_rule__EnumDeclaration__Group__26918);
            rule__EnumDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumDeclaration__Group__3_in_rule__EnumDeclaration__Group__26921);
            rule__EnumDeclaration__Group__3();

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
    // $ANTLR end "rule__EnumDeclaration__Group__2"


    // $ANTLR start "rule__EnumDeclaration__Group__2__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3447:1: rule__EnumDeclaration__Group__2__Impl : ( '{' ) ;
    public final void rule__EnumDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3451:1: ( ( '{' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3452:1: ( '{' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3452:1: ( '{' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3453:1: '{'
            {
             before(grammarAccess.getEnumDeclarationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_21_in_rule__EnumDeclaration__Group__2__Impl6949); 
             after(grammarAccess.getEnumDeclarationAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__EnumDeclaration__Group__2__Impl"


    // $ANTLR start "rule__EnumDeclaration__Group__3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3466:1: rule__EnumDeclaration__Group__3 : rule__EnumDeclaration__Group__3__Impl rule__EnumDeclaration__Group__4 ;
    public final void rule__EnumDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3470:1: ( rule__EnumDeclaration__Group__3__Impl rule__EnumDeclaration__Group__4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3471:2: rule__EnumDeclaration__Group__3__Impl rule__EnumDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__EnumDeclaration__Group__3__Impl_in_rule__EnumDeclaration__Group__36980);
            rule__EnumDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumDeclaration__Group__4_in_rule__EnumDeclaration__Group__36983);
            rule__EnumDeclaration__Group__4();

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
    // $ANTLR end "rule__EnumDeclaration__Group__3"


    // $ANTLR start "rule__EnumDeclaration__Group__3__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3478:1: rule__EnumDeclaration__Group__3__Impl : ( ( rule__EnumDeclaration__ValuesAssignment_3 ) ) ;
    public final void rule__EnumDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3482:1: ( ( ( rule__EnumDeclaration__ValuesAssignment_3 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3483:1: ( ( rule__EnumDeclaration__ValuesAssignment_3 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3483:1: ( ( rule__EnumDeclaration__ValuesAssignment_3 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3484:1: ( rule__EnumDeclaration__ValuesAssignment_3 )
            {
             before(grammarAccess.getEnumDeclarationAccess().getValuesAssignment_3()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3485:1: ( rule__EnumDeclaration__ValuesAssignment_3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3485:2: rule__EnumDeclaration__ValuesAssignment_3
            {
            pushFollow(FOLLOW_rule__EnumDeclaration__ValuesAssignment_3_in_rule__EnumDeclaration__Group__3__Impl7010);
            rule__EnumDeclaration__ValuesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEnumDeclarationAccess().getValuesAssignment_3()); 

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
    // $ANTLR end "rule__EnumDeclaration__Group__3__Impl"


    // $ANTLR start "rule__EnumDeclaration__Group__4"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3495:1: rule__EnumDeclaration__Group__4 : rule__EnumDeclaration__Group__4__Impl rule__EnumDeclaration__Group__5 ;
    public final void rule__EnumDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3499:1: ( rule__EnumDeclaration__Group__4__Impl rule__EnumDeclaration__Group__5 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3500:2: rule__EnumDeclaration__Group__4__Impl rule__EnumDeclaration__Group__5
            {
            pushFollow(FOLLOW_rule__EnumDeclaration__Group__4__Impl_in_rule__EnumDeclaration__Group__47040);
            rule__EnumDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumDeclaration__Group__5_in_rule__EnumDeclaration__Group__47043);
            rule__EnumDeclaration__Group__5();

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
    // $ANTLR end "rule__EnumDeclaration__Group__4"


    // $ANTLR start "rule__EnumDeclaration__Group__4__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3507:1: rule__EnumDeclaration__Group__4__Impl : ( ( rule__EnumDeclaration__Group_4__0 )* ) ;
    public final void rule__EnumDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3511:1: ( ( ( rule__EnumDeclaration__Group_4__0 )* ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3512:1: ( ( rule__EnumDeclaration__Group_4__0 )* )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3512:1: ( ( rule__EnumDeclaration__Group_4__0 )* )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3513:1: ( rule__EnumDeclaration__Group_4__0 )*
            {
             before(grammarAccess.getEnumDeclarationAccess().getGroup_4()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3514:1: ( rule__EnumDeclaration__Group_4__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==28) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3514:2: rule__EnumDeclaration__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__EnumDeclaration__Group_4__0_in_rule__EnumDeclaration__Group__4__Impl7070);
            	    rule__EnumDeclaration__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getEnumDeclarationAccess().getGroup_4()); 

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
    // $ANTLR end "rule__EnumDeclaration__Group__4__Impl"


    // $ANTLR start "rule__EnumDeclaration__Group__5"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3524:1: rule__EnumDeclaration__Group__5 : rule__EnumDeclaration__Group__5__Impl ;
    public final void rule__EnumDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3528:1: ( rule__EnumDeclaration__Group__5__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3529:2: rule__EnumDeclaration__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__EnumDeclaration__Group__5__Impl_in_rule__EnumDeclaration__Group__57101);
            rule__EnumDeclaration__Group__5__Impl();

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
    // $ANTLR end "rule__EnumDeclaration__Group__5"


    // $ANTLR start "rule__EnumDeclaration__Group__5__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3535:1: rule__EnumDeclaration__Group__5__Impl : ( '}' ) ;
    public final void rule__EnumDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3539:1: ( ( '}' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3540:1: ( '}' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3540:1: ( '}' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3541:1: '}'
            {
             before(grammarAccess.getEnumDeclarationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,22,FOLLOW_22_in_rule__EnumDeclaration__Group__5__Impl7129); 
             after(grammarAccess.getEnumDeclarationAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__EnumDeclaration__Group__5__Impl"


    // $ANTLR start "rule__EnumDeclaration__Group_4__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3566:1: rule__EnumDeclaration__Group_4__0 : rule__EnumDeclaration__Group_4__0__Impl rule__EnumDeclaration__Group_4__1 ;
    public final void rule__EnumDeclaration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3570:1: ( rule__EnumDeclaration__Group_4__0__Impl rule__EnumDeclaration__Group_4__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3571:2: rule__EnumDeclaration__Group_4__0__Impl rule__EnumDeclaration__Group_4__1
            {
            pushFollow(FOLLOW_rule__EnumDeclaration__Group_4__0__Impl_in_rule__EnumDeclaration__Group_4__07172);
            rule__EnumDeclaration__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumDeclaration__Group_4__1_in_rule__EnumDeclaration__Group_4__07175);
            rule__EnumDeclaration__Group_4__1();

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
    // $ANTLR end "rule__EnumDeclaration__Group_4__0"


    // $ANTLR start "rule__EnumDeclaration__Group_4__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3578:1: rule__EnumDeclaration__Group_4__0__Impl : ( ',' ) ;
    public final void rule__EnumDeclaration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3582:1: ( ( ',' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3583:1: ( ',' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3583:1: ( ',' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3584:1: ','
            {
             before(grammarAccess.getEnumDeclarationAccess().getCommaKeyword_4_0()); 
            match(input,28,FOLLOW_28_in_rule__EnumDeclaration__Group_4__0__Impl7203); 
             after(grammarAccess.getEnumDeclarationAccess().getCommaKeyword_4_0()); 

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
    // $ANTLR end "rule__EnumDeclaration__Group_4__0__Impl"


    // $ANTLR start "rule__EnumDeclaration__Group_4__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3597:1: rule__EnumDeclaration__Group_4__1 : rule__EnumDeclaration__Group_4__1__Impl ;
    public final void rule__EnumDeclaration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3601:1: ( rule__EnumDeclaration__Group_4__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3602:2: rule__EnumDeclaration__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumDeclaration__Group_4__1__Impl_in_rule__EnumDeclaration__Group_4__17234);
            rule__EnumDeclaration__Group_4__1__Impl();

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
    // $ANTLR end "rule__EnumDeclaration__Group_4__1"


    // $ANTLR start "rule__EnumDeclaration__Group_4__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3608:1: rule__EnumDeclaration__Group_4__1__Impl : ( RULE_ID ) ;
    public final void rule__EnumDeclaration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3612:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3613:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3613:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3614:1: RULE_ID
            {
             before(grammarAccess.getEnumDeclarationAccess().getIDTerminalRuleCall_4_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumDeclaration__Group_4__1__Impl7261); 
             after(grammarAccess.getEnumDeclarationAccess().getIDTerminalRuleCall_4_1()); 

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
    // $ANTLR end "rule__EnumDeclaration__Group_4__1__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3629:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3633:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3634:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__07294);
            rule__FQN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__07297);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3641:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3645:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3646:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3646:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3647:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl7324); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3658:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3662:1: ( rule__FQN__Group__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3663:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__17353);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3669:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3673:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3674:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3674:1: ( ( rule__FQN__Group_1__0 )* )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3675:1: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3676:1: ( rule__FQN__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==42) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3676:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl7380);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3690:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3694:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3695:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__07415);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__07418);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3702:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3706:1: ( ( '.' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3707:1: ( '.' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3707:1: ( '.' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3708:1: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,42,FOLLOW_42_in_rule__FQN__Group_1__0__Impl7446); 
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3721:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3725:1: ( rule__FQN__Group_1__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3726:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__17477);
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3732:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3736:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3737:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3737:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3738:1: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl7504); 
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


    // $ANTLR start "rule__Entity__Group__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3753:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3757:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3758:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__07537);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__07540);
            rule__Entity__Group__1();

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
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3765:1: rule__Entity__Group__0__Impl : ( 'Entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3769:1: ( ( 'Entity' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3770:1: ( 'Entity' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3770:1: ( 'Entity' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3771:1: 'Entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,43,FOLLOW_43_in_rule__Entity__Group__0__Impl7568); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

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
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3784:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3788:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3789:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__17599);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__17602);
            rule__Entity__Group__2();

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
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3796:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3800:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3801:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3801:1: ( ( rule__Entity__NameAssignment_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3802:1: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3803:1: ( rule__Entity__NameAssignment_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3803:2: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl7629);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3813:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3817:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3818:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__27659);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__27662);
            rule__Entity__Group__3();

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
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3825:1: rule__Entity__Group__2__Impl : ( '{' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3829:1: ( ( '{' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3830:1: ( '{' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3830:1: ( '{' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3831:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_21_in_rule__Entity__Group__2__Impl7690); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3844:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3848:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3849:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__37721);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__37724);
            rule__Entity__Group__4();

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
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3856:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__PropertiesAssignment_3 )* ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3860:1: ( ( ( rule__Entity__PropertiesAssignment_3 )* ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3861:1: ( ( rule__Entity__PropertiesAssignment_3 )* )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3861:1: ( ( rule__Entity__PropertiesAssignment_3 )* )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3862:1: ( rule__Entity__PropertiesAssignment_3 )*
            {
             before(grammarAccess.getEntityAccess().getPropertiesAssignment_3()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3863:1: ( rule__Entity__PropertiesAssignment_3 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==46||LA22_0==48) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3863:2: rule__Entity__PropertiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Entity__PropertiesAssignment_3_in_rule__Entity__Group__3__Impl7751);
            	    rule__Entity__PropertiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getPropertiesAssignment_3()); 

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
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3873:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3877:1: ( rule__Entity__Group__4__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3878:2: rule__Entity__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__47782);
            rule__Entity__Group__4__Impl();

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
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3884:1: rule__Entity__Group__4__Impl : ( '}' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3888:1: ( ( '}' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3889:1: ( '}' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3889:1: ( '}' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3890:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,22,FOLLOW_22_in_rule__Entity__Group__4__Impl7810); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Domain__Group__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3913:1: rule__Domain__Group__0 : rule__Domain__Group__0__Impl rule__Domain__Group__1 ;
    public final void rule__Domain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3917:1: ( rule__Domain__Group__0__Impl rule__Domain__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3918:2: rule__Domain__Group__0__Impl rule__Domain__Group__1
            {
            pushFollow(FOLLOW_rule__Domain__Group__0__Impl_in_rule__Domain__Group__07851);
            rule__Domain__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Domain__Group__1_in_rule__Domain__Group__07854);
            rule__Domain__Group__1();

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
    // $ANTLR end "rule__Domain__Group__0"


    // $ANTLR start "rule__Domain__Group__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3925:1: rule__Domain__Group__0__Impl : ( ( rule__Domain__ImportsAssignment_0 )* ) ;
    public final void rule__Domain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3929:1: ( ( ( rule__Domain__ImportsAssignment_0 )* ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3930:1: ( ( rule__Domain__ImportsAssignment_0 )* )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3930:1: ( ( rule__Domain__ImportsAssignment_0 )* )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3931:1: ( rule__Domain__ImportsAssignment_0 )*
            {
             before(grammarAccess.getDomainAccess().getImportsAssignment_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3932:1: ( rule__Domain__ImportsAssignment_0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==37) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3932:2: rule__Domain__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Domain__ImportsAssignment_0_in_rule__Domain__Group__0__Impl7881);
            	    rule__Domain__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getDomainAccess().getImportsAssignment_0()); 

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
    // $ANTLR end "rule__Domain__Group__0__Impl"


    // $ANTLR start "rule__Domain__Group__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3942:1: rule__Domain__Group__1 : rule__Domain__Group__1__Impl rule__Domain__Group__2 ;
    public final void rule__Domain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3946:1: ( rule__Domain__Group__1__Impl rule__Domain__Group__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3947:2: rule__Domain__Group__1__Impl rule__Domain__Group__2
            {
            pushFollow(FOLLOW_rule__Domain__Group__1__Impl_in_rule__Domain__Group__17912);
            rule__Domain__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Domain__Group__2_in_rule__Domain__Group__17915);
            rule__Domain__Group__2();

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
    // $ANTLR end "rule__Domain__Group__1"


    // $ANTLR start "rule__Domain__Group__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3954:1: rule__Domain__Group__1__Impl : ( 'Domain' ) ;
    public final void rule__Domain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3958:1: ( ( 'Domain' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3959:1: ( 'Domain' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3959:1: ( 'Domain' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3960:1: 'Domain'
            {
             before(grammarAccess.getDomainAccess().getDomainKeyword_1()); 
            match(input,44,FOLLOW_44_in_rule__Domain__Group__1__Impl7943); 
             after(grammarAccess.getDomainAccess().getDomainKeyword_1()); 

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
    // $ANTLR end "rule__Domain__Group__1__Impl"


    // $ANTLR start "rule__Domain__Group__2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3973:1: rule__Domain__Group__2 : rule__Domain__Group__2__Impl rule__Domain__Group__3 ;
    public final void rule__Domain__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3977:1: ( rule__Domain__Group__2__Impl rule__Domain__Group__3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3978:2: rule__Domain__Group__2__Impl rule__Domain__Group__3
            {
            pushFollow(FOLLOW_rule__Domain__Group__2__Impl_in_rule__Domain__Group__27974);
            rule__Domain__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Domain__Group__3_in_rule__Domain__Group__27977);
            rule__Domain__Group__3();

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
    // $ANTLR end "rule__Domain__Group__2"


    // $ANTLR start "rule__Domain__Group__2__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3985:1: rule__Domain__Group__2__Impl : ( ( rule__Domain__NameAssignment_2 ) ) ;
    public final void rule__Domain__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3989:1: ( ( ( rule__Domain__NameAssignment_2 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3990:1: ( ( rule__Domain__NameAssignment_2 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3990:1: ( ( rule__Domain__NameAssignment_2 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3991:1: ( rule__Domain__NameAssignment_2 )
            {
             before(grammarAccess.getDomainAccess().getNameAssignment_2()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3992:1: ( rule__Domain__NameAssignment_2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3992:2: rule__Domain__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Domain__NameAssignment_2_in_rule__Domain__Group__2__Impl8004);
            rule__Domain__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Domain__Group__2__Impl"


    // $ANTLR start "rule__Domain__Group__3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4002:1: rule__Domain__Group__3 : rule__Domain__Group__3__Impl rule__Domain__Group__4 ;
    public final void rule__Domain__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4006:1: ( rule__Domain__Group__3__Impl rule__Domain__Group__4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4007:2: rule__Domain__Group__3__Impl rule__Domain__Group__4
            {
            pushFollow(FOLLOW_rule__Domain__Group__3__Impl_in_rule__Domain__Group__38034);
            rule__Domain__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Domain__Group__4_in_rule__Domain__Group__38037);
            rule__Domain__Group__4();

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
    // $ANTLR end "rule__Domain__Group__3"


    // $ANTLR start "rule__Domain__Group__3__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4014:1: rule__Domain__Group__3__Impl : ( 'Description: ' ) ;
    public final void rule__Domain__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4018:1: ( ( 'Description: ' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4019:1: ( 'Description: ' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4019:1: ( 'Description: ' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4020:1: 'Description: '
            {
             before(grammarAccess.getDomainAccess().getDescriptionKeyword_3()); 
            match(input,45,FOLLOW_45_in_rule__Domain__Group__3__Impl8065); 
             after(grammarAccess.getDomainAccess().getDescriptionKeyword_3()); 

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
    // $ANTLR end "rule__Domain__Group__3__Impl"


    // $ANTLR start "rule__Domain__Group__4"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4033:1: rule__Domain__Group__4 : rule__Domain__Group__4__Impl rule__Domain__Group__5 ;
    public final void rule__Domain__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4037:1: ( rule__Domain__Group__4__Impl rule__Domain__Group__5 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4038:2: rule__Domain__Group__4__Impl rule__Domain__Group__5
            {
            pushFollow(FOLLOW_rule__Domain__Group__4__Impl_in_rule__Domain__Group__48096);
            rule__Domain__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Domain__Group__5_in_rule__Domain__Group__48099);
            rule__Domain__Group__5();

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
    // $ANTLR end "rule__Domain__Group__4"


    // $ANTLR start "rule__Domain__Group__4__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4045:1: rule__Domain__Group__4__Impl : ( ( rule__Domain__DescriptionAssignment_4 ) ) ;
    public final void rule__Domain__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4049:1: ( ( ( rule__Domain__DescriptionAssignment_4 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4050:1: ( ( rule__Domain__DescriptionAssignment_4 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4050:1: ( ( rule__Domain__DescriptionAssignment_4 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4051:1: ( rule__Domain__DescriptionAssignment_4 )
            {
             before(grammarAccess.getDomainAccess().getDescriptionAssignment_4()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4052:1: ( rule__Domain__DescriptionAssignment_4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4052:2: rule__Domain__DescriptionAssignment_4
            {
            pushFollow(FOLLOW_rule__Domain__DescriptionAssignment_4_in_rule__Domain__Group__4__Impl8126);
            rule__Domain__DescriptionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getDescriptionAssignment_4()); 

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
    // $ANTLR end "rule__Domain__Group__4__Impl"


    // $ANTLR start "rule__Domain__Group__5"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4062:1: rule__Domain__Group__5 : rule__Domain__Group__5__Impl rule__Domain__Group__6 ;
    public final void rule__Domain__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4066:1: ( rule__Domain__Group__5__Impl rule__Domain__Group__6 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4067:2: rule__Domain__Group__5__Impl rule__Domain__Group__6
            {
            pushFollow(FOLLOW_rule__Domain__Group__5__Impl_in_rule__Domain__Group__58156);
            rule__Domain__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Domain__Group__6_in_rule__Domain__Group__58159);
            rule__Domain__Group__6();

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
    // $ANTLR end "rule__Domain__Group__5"


    // $ANTLR start "rule__Domain__Group__5__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4074:1: rule__Domain__Group__5__Impl : ( '{' ) ;
    public final void rule__Domain__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4078:1: ( ( '{' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4079:1: ( '{' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4079:1: ( '{' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4080:1: '{'
            {
             before(grammarAccess.getDomainAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,21,FOLLOW_21_in_rule__Domain__Group__5__Impl8187); 
             after(grammarAccess.getDomainAccess().getLeftCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Domain__Group__5__Impl"


    // $ANTLR start "rule__Domain__Group__6"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4093:1: rule__Domain__Group__6 : rule__Domain__Group__6__Impl rule__Domain__Group__7 ;
    public final void rule__Domain__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4097:1: ( rule__Domain__Group__6__Impl rule__Domain__Group__7 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4098:2: rule__Domain__Group__6__Impl rule__Domain__Group__7
            {
            pushFollow(FOLLOW_rule__Domain__Group__6__Impl_in_rule__Domain__Group__68218);
            rule__Domain__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Domain__Group__7_in_rule__Domain__Group__68221);
            rule__Domain__Group__7();

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
    // $ANTLR end "rule__Domain__Group__6"


    // $ANTLR start "rule__Domain__Group__6__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4105:1: rule__Domain__Group__6__Impl : ( ( ( rule__Domain__EntitiesAssignment_6 ) ) ( ( rule__Domain__EntitiesAssignment_6 )* ) ) ;
    public final void rule__Domain__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4109:1: ( ( ( ( rule__Domain__EntitiesAssignment_6 ) ) ( ( rule__Domain__EntitiesAssignment_6 )* ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4110:1: ( ( ( rule__Domain__EntitiesAssignment_6 ) ) ( ( rule__Domain__EntitiesAssignment_6 )* ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4110:1: ( ( ( rule__Domain__EntitiesAssignment_6 ) ) ( ( rule__Domain__EntitiesAssignment_6 )* ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4111:1: ( ( rule__Domain__EntitiesAssignment_6 ) ) ( ( rule__Domain__EntitiesAssignment_6 )* )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4111:1: ( ( rule__Domain__EntitiesAssignment_6 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4112:1: ( rule__Domain__EntitiesAssignment_6 )
            {
             before(grammarAccess.getDomainAccess().getEntitiesAssignment_6()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4113:1: ( rule__Domain__EntitiesAssignment_6 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4113:2: rule__Domain__EntitiesAssignment_6
            {
            pushFollow(FOLLOW_rule__Domain__EntitiesAssignment_6_in_rule__Domain__Group__6__Impl8250);
            rule__Domain__EntitiesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getEntitiesAssignment_6()); 

            }

            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4116:1: ( ( rule__Domain__EntitiesAssignment_6 )* )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4117:1: ( rule__Domain__EntitiesAssignment_6 )*
            {
             before(grammarAccess.getDomainAccess().getEntitiesAssignment_6()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4118:1: ( rule__Domain__EntitiesAssignment_6 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==43) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4118:2: rule__Domain__EntitiesAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Domain__EntitiesAssignment_6_in_rule__Domain__Group__6__Impl8262);
            	    rule__Domain__EntitiesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getDomainAccess().getEntitiesAssignment_6()); 

            }


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
    // $ANTLR end "rule__Domain__Group__6__Impl"


    // $ANTLR start "rule__Domain__Group__7"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4129:1: rule__Domain__Group__7 : rule__Domain__Group__7__Impl ;
    public final void rule__Domain__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4133:1: ( rule__Domain__Group__7__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4134:2: rule__Domain__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Domain__Group__7__Impl_in_rule__Domain__Group__78295);
            rule__Domain__Group__7__Impl();

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
    // $ANTLR end "rule__Domain__Group__7"


    // $ANTLR start "rule__Domain__Group__7__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4140:1: rule__Domain__Group__7__Impl : ( '}' ) ;
    public final void rule__Domain__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4144:1: ( ( '}' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4145:1: ( '}' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4145:1: ( '}' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4146:1: '}'
            {
             before(grammarAccess.getDomainAccess().getRightCurlyBracketKeyword_7()); 
            match(input,22,FOLLOW_22_in_rule__Domain__Group__7__Impl8323); 
             after(grammarAccess.getDomainAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Domain__Group__7__Impl"


    // $ANTLR start "rule__Association__Group__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4175:1: rule__Association__Group__0 : rule__Association__Group__0__Impl rule__Association__Group__1 ;
    public final void rule__Association__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4179:1: ( rule__Association__Group__0__Impl rule__Association__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4180:2: rule__Association__Group__0__Impl rule__Association__Group__1
            {
            pushFollow(FOLLOW_rule__Association__Group__0__Impl_in_rule__Association__Group__08370);
            rule__Association__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Association__Group__1_in_rule__Association__Group__08373);
            rule__Association__Group__1();

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
    // $ANTLR end "rule__Association__Group__0"


    // $ANTLR start "rule__Association__Group__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4187:1: rule__Association__Group__0__Impl : ( 'Relation' ) ;
    public final void rule__Association__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4191:1: ( ( 'Relation' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4192:1: ( 'Relation' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4192:1: ( 'Relation' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4193:1: 'Relation'
            {
             before(grammarAccess.getAssociationAccess().getRelationKeyword_0()); 
            match(input,46,FOLLOW_46_in_rule__Association__Group__0__Impl8401); 
             after(grammarAccess.getAssociationAccess().getRelationKeyword_0()); 

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
    // $ANTLR end "rule__Association__Group__0__Impl"


    // $ANTLR start "rule__Association__Group__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4206:1: rule__Association__Group__1 : rule__Association__Group__1__Impl rule__Association__Group__2 ;
    public final void rule__Association__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4210:1: ( rule__Association__Group__1__Impl rule__Association__Group__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4211:2: rule__Association__Group__1__Impl rule__Association__Group__2
            {
            pushFollow(FOLLOW_rule__Association__Group__1__Impl_in_rule__Association__Group__18432);
            rule__Association__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Association__Group__2_in_rule__Association__Group__18435);
            rule__Association__Group__2();

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
    // $ANTLR end "rule__Association__Group__1"


    // $ANTLR start "rule__Association__Group__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4218:1: rule__Association__Group__1__Impl : ( ( rule__Association__NameAssignment_1 ) ) ;
    public final void rule__Association__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4222:1: ( ( ( rule__Association__NameAssignment_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4223:1: ( ( rule__Association__NameAssignment_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4223:1: ( ( rule__Association__NameAssignment_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4224:1: ( rule__Association__NameAssignment_1 )
            {
             before(grammarAccess.getAssociationAccess().getNameAssignment_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4225:1: ( rule__Association__NameAssignment_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4225:2: rule__Association__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Association__NameAssignment_1_in_rule__Association__Group__1__Impl8462);
            rule__Association__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Association__Group__1__Impl"


    // $ANTLR start "rule__Association__Group__2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4235:1: rule__Association__Group__2 : rule__Association__Group__2__Impl rule__Association__Group__3 ;
    public final void rule__Association__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4239:1: ( rule__Association__Group__2__Impl rule__Association__Group__3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4240:2: rule__Association__Group__2__Impl rule__Association__Group__3
            {
            pushFollow(FOLLOW_rule__Association__Group__2__Impl_in_rule__Association__Group__28492);
            rule__Association__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Association__Group__3_in_rule__Association__Group__28495);
            rule__Association__Group__3();

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
    // $ANTLR end "rule__Association__Group__2"


    // $ANTLR start "rule__Association__Group__2__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4247:1: rule__Association__Group__2__Impl : ( ':' ) ;
    public final void rule__Association__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4251:1: ( ( ':' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4252:1: ( ':' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4252:1: ( ':' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4253:1: ':'
            {
             before(grammarAccess.getAssociationAccess().getColonKeyword_2()); 
            match(input,47,FOLLOW_47_in_rule__Association__Group__2__Impl8523); 
             after(grammarAccess.getAssociationAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Association__Group__2__Impl"


    // $ANTLR start "rule__Association__Group__3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4266:1: rule__Association__Group__3 : rule__Association__Group__3__Impl rule__Association__Group__4 ;
    public final void rule__Association__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4270:1: ( rule__Association__Group__3__Impl rule__Association__Group__4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4271:2: rule__Association__Group__3__Impl rule__Association__Group__4
            {
            pushFollow(FOLLOW_rule__Association__Group__3__Impl_in_rule__Association__Group__38554);
            rule__Association__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Association__Group__4_in_rule__Association__Group__38557);
            rule__Association__Group__4();

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
    // $ANTLR end "rule__Association__Group__3"


    // $ANTLR start "rule__Association__Group__3__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4278:1: rule__Association__Group__3__Impl : ( ( rule__Association__TypeAssignment_3 ) ) ;
    public final void rule__Association__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4282:1: ( ( ( rule__Association__TypeAssignment_3 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4283:1: ( ( rule__Association__TypeAssignment_3 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4283:1: ( ( rule__Association__TypeAssignment_3 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4284:1: ( rule__Association__TypeAssignment_3 )
            {
             before(grammarAccess.getAssociationAccess().getTypeAssignment_3()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4285:1: ( rule__Association__TypeAssignment_3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4285:2: rule__Association__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Association__TypeAssignment_3_in_rule__Association__Group__3__Impl8584);
            rule__Association__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getTypeAssignment_3()); 

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
    // $ANTLR end "rule__Association__Group__3__Impl"


    // $ANTLR start "rule__Association__Group__4"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4295:1: rule__Association__Group__4 : rule__Association__Group__4__Impl ;
    public final void rule__Association__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4299:1: ( rule__Association__Group__4__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4300:2: rule__Association__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Association__Group__4__Impl_in_rule__Association__Group__48614);
            rule__Association__Group__4__Impl();

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
    // $ANTLR end "rule__Association__Group__4"


    // $ANTLR start "rule__Association__Group__4__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4306:1: rule__Association__Group__4__Impl : ( ( rule__Association__MultiplicityAssignment_4 ) ) ;
    public final void rule__Association__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4310:1: ( ( ( rule__Association__MultiplicityAssignment_4 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4311:1: ( ( rule__Association__MultiplicityAssignment_4 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4311:1: ( ( rule__Association__MultiplicityAssignment_4 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4312:1: ( rule__Association__MultiplicityAssignment_4 )
            {
             before(grammarAccess.getAssociationAccess().getMultiplicityAssignment_4()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4313:1: ( rule__Association__MultiplicityAssignment_4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4313:2: rule__Association__MultiplicityAssignment_4
            {
            pushFollow(FOLLOW_rule__Association__MultiplicityAssignment_4_in_rule__Association__Group__4__Impl8641);
            rule__Association__MultiplicityAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getMultiplicityAssignment_4()); 

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
    // $ANTLR end "rule__Association__Group__4__Impl"


    // $ANTLR start "rule__Field__Group__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4333:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4337:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4338:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__08681);
            rule__Field__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__1_in_rule__Field__Group__08684);
            rule__Field__Group__1();

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
    // $ANTLR end "rule__Field__Group__0"


    // $ANTLR start "rule__Field__Group__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4345:1: rule__Field__Group__0__Impl : ( 'Field' ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4349:1: ( ( 'Field' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4350:1: ( 'Field' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4350:1: ( 'Field' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4351:1: 'Field'
            {
             before(grammarAccess.getFieldAccess().getFieldKeyword_0()); 
            match(input,48,FOLLOW_48_in_rule__Field__Group__0__Impl8712); 
             after(grammarAccess.getFieldAccess().getFieldKeyword_0()); 

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
    // $ANTLR end "rule__Field__Group__0__Impl"


    // $ANTLR start "rule__Field__Group__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4364:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4368:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4369:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__18743);
            rule__Field__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__2_in_rule__Field__Group__18746);
            rule__Field__Group__2();

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
    // $ANTLR end "rule__Field__Group__1"


    // $ANTLR start "rule__Field__Group__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4376:1: rule__Field__Group__1__Impl : ( ( rule__Field__NameAssignment_1 ) ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4380:1: ( ( ( rule__Field__NameAssignment_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4381:1: ( ( rule__Field__NameAssignment_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4381:1: ( ( rule__Field__NameAssignment_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4382:1: ( rule__Field__NameAssignment_1 )
            {
             before(grammarAccess.getFieldAccess().getNameAssignment_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4383:1: ( rule__Field__NameAssignment_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4383:2: rule__Field__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Field__NameAssignment_1_in_rule__Field__Group__1__Impl8773);
            rule__Field__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Field__Group__1__Impl"


    // $ANTLR start "rule__Field__Group__2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4393:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4397:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4398:2: rule__Field__Group__2__Impl rule__Field__Group__3
            {
            pushFollow(FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__28803);
            rule__Field__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__3_in_rule__Field__Group__28806);
            rule__Field__Group__3();

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
    // $ANTLR end "rule__Field__Group__2"


    // $ANTLR start "rule__Field__Group__2__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4405:1: rule__Field__Group__2__Impl : ( ':' ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4409:1: ( ( ':' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4410:1: ( ':' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4410:1: ( ':' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4411:1: ':'
            {
             before(grammarAccess.getFieldAccess().getColonKeyword_2()); 
            match(input,47,FOLLOW_47_in_rule__Field__Group__2__Impl8834); 
             after(grammarAccess.getFieldAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Field__Group__2__Impl"


    // $ANTLR start "rule__Field__Group__3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4424:1: rule__Field__Group__3 : rule__Field__Group__3__Impl ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4428:1: ( rule__Field__Group__3__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4429:2: rule__Field__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__38865);
            rule__Field__Group__3__Impl();

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
    // $ANTLR end "rule__Field__Group__3"


    // $ANTLR start "rule__Field__Group__3__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4435:1: rule__Field__Group__3__Impl : ( ( rule__Field__LiteralAssignment_3 ) ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4439:1: ( ( ( rule__Field__LiteralAssignment_3 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4440:1: ( ( rule__Field__LiteralAssignment_3 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4440:1: ( ( rule__Field__LiteralAssignment_3 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4441:1: ( rule__Field__LiteralAssignment_3 )
            {
             before(grammarAccess.getFieldAccess().getLiteralAssignment_3()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4442:1: ( rule__Field__LiteralAssignment_3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4442:2: rule__Field__LiteralAssignment_3
            {
            pushFollow(FOLLOW_rule__Field__LiteralAssignment_3_in_rule__Field__Group__3__Impl8892);
            rule__Field__LiteralAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getLiteralAssignment_3()); 

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
    // $ANTLR end "rule__Field__Group__3__Impl"


    // $ANTLR start "rule__Literal__Group_0__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4460:1: rule__Literal__Group_0__0 : rule__Literal__Group_0__0__Impl rule__Literal__Group_0__1 ;
    public final void rule__Literal__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4464:1: ( rule__Literal__Group_0__0__Impl rule__Literal__Group_0__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4465:2: rule__Literal__Group_0__0__Impl rule__Literal__Group_0__1
            {
            pushFollow(FOLLOW_rule__Literal__Group_0__0__Impl_in_rule__Literal__Group_0__08930);
            rule__Literal__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Literal__Group_0__1_in_rule__Literal__Group_0__08933);
            rule__Literal__Group_0__1();

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
    // $ANTLR end "rule__Literal__Group_0__0"


    // $ANTLR start "rule__Literal__Group_0__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4472:1: rule__Literal__Group_0__0__Impl : ( () ) ;
    public final void rule__Literal__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4476:1: ( ( () ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4477:1: ( () )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4477:1: ( () )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4478:1: ()
            {
             before(grammarAccess.getLiteralAccess().getLiteralAction_0_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4479:1: ()
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4481:1: 
            {
            }

             after(grammarAccess.getLiteralAccess().getLiteralAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_0__0__Impl"


    // $ANTLR start "rule__Literal__Group_0__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4491:1: rule__Literal__Group_0__1 : rule__Literal__Group_0__1__Impl ;
    public final void rule__Literal__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4495:1: ( rule__Literal__Group_0__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4496:2: rule__Literal__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Literal__Group_0__1__Impl_in_rule__Literal__Group_0__18991);
            rule__Literal__Group_0__1__Impl();

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
    // $ANTLR end "rule__Literal__Group_0__1"


    // $ANTLR start "rule__Literal__Group_0__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4502:1: rule__Literal__Group_0__1__Impl : ( ( rule__Literal__NameAssignment_0_1 ) ) ;
    public final void rule__Literal__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4506:1: ( ( ( rule__Literal__NameAssignment_0_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4507:1: ( ( rule__Literal__NameAssignment_0_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4507:1: ( ( rule__Literal__NameAssignment_0_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4508:1: ( rule__Literal__NameAssignment_0_1 )
            {
             before(grammarAccess.getLiteralAccess().getNameAssignment_0_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4509:1: ( rule__Literal__NameAssignment_0_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4509:2: rule__Literal__NameAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Literal__NameAssignment_0_1_in_rule__Literal__Group_0__1__Impl9018);
            rule__Literal__NameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getNameAssignment_0_1()); 

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
    // $ANTLR end "rule__Literal__Group_0__1__Impl"


    // $ANTLR start "rule__Literal__Group_1__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4523:1: rule__Literal__Group_1__0 : rule__Literal__Group_1__0__Impl rule__Literal__Group_1__1 ;
    public final void rule__Literal__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4527:1: ( rule__Literal__Group_1__0__Impl rule__Literal__Group_1__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4528:2: rule__Literal__Group_1__0__Impl rule__Literal__Group_1__1
            {
            pushFollow(FOLLOW_rule__Literal__Group_1__0__Impl_in_rule__Literal__Group_1__09052);
            rule__Literal__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Literal__Group_1__1_in_rule__Literal__Group_1__09055);
            rule__Literal__Group_1__1();

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
    // $ANTLR end "rule__Literal__Group_1__0"


    // $ANTLR start "rule__Literal__Group_1__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4535:1: rule__Literal__Group_1__0__Impl : ( () ) ;
    public final void rule__Literal__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4539:1: ( ( () ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4540:1: ( () )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4540:1: ( () )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4541:1: ()
            {
             before(grammarAccess.getLiteralAccess().getLiteralAction_1_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4542:1: ()
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4544:1: 
            {
            }

             after(grammarAccess.getLiteralAccess().getLiteralAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_1__0__Impl"


    // $ANTLR start "rule__Literal__Group_1__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4554:1: rule__Literal__Group_1__1 : rule__Literal__Group_1__1__Impl ;
    public final void rule__Literal__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4558:1: ( rule__Literal__Group_1__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4559:2: rule__Literal__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Literal__Group_1__1__Impl_in_rule__Literal__Group_1__19113);
            rule__Literal__Group_1__1__Impl();

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
    // $ANTLR end "rule__Literal__Group_1__1"


    // $ANTLR start "rule__Literal__Group_1__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4565:1: rule__Literal__Group_1__1__Impl : ( ( rule__Literal__NameAssignment_1_1 ) ) ;
    public final void rule__Literal__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4569:1: ( ( ( rule__Literal__NameAssignment_1_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4570:1: ( ( rule__Literal__NameAssignment_1_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4570:1: ( ( rule__Literal__NameAssignment_1_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4571:1: ( rule__Literal__NameAssignment_1_1 )
            {
             before(grammarAccess.getLiteralAccess().getNameAssignment_1_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4572:1: ( rule__Literal__NameAssignment_1_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4572:2: rule__Literal__NameAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Literal__NameAssignment_1_1_in_rule__Literal__Group_1__1__Impl9140);
            rule__Literal__NameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getNameAssignment_1_1()); 

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
    // $ANTLR end "rule__Literal__Group_1__1__Impl"


    // $ANTLR start "rule__Literal__Group_2__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4586:1: rule__Literal__Group_2__0 : rule__Literal__Group_2__0__Impl rule__Literal__Group_2__1 ;
    public final void rule__Literal__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4590:1: ( rule__Literal__Group_2__0__Impl rule__Literal__Group_2__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4591:2: rule__Literal__Group_2__0__Impl rule__Literal__Group_2__1
            {
            pushFollow(FOLLOW_rule__Literal__Group_2__0__Impl_in_rule__Literal__Group_2__09174);
            rule__Literal__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Literal__Group_2__1_in_rule__Literal__Group_2__09177);
            rule__Literal__Group_2__1();

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
    // $ANTLR end "rule__Literal__Group_2__0"


    // $ANTLR start "rule__Literal__Group_2__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4598:1: rule__Literal__Group_2__0__Impl : ( () ) ;
    public final void rule__Literal__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4602:1: ( ( () ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4603:1: ( () )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4603:1: ( () )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4604:1: ()
            {
             before(grammarAccess.getLiteralAccess().getLiteralAction_2_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4605:1: ()
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4607:1: 
            {
            }

             after(grammarAccess.getLiteralAccess().getLiteralAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_2__0__Impl"


    // $ANTLR start "rule__Literal__Group_2__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4617:1: rule__Literal__Group_2__1 : rule__Literal__Group_2__1__Impl ;
    public final void rule__Literal__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4621:1: ( rule__Literal__Group_2__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4622:2: rule__Literal__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Literal__Group_2__1__Impl_in_rule__Literal__Group_2__19235);
            rule__Literal__Group_2__1__Impl();

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
    // $ANTLR end "rule__Literal__Group_2__1"


    // $ANTLR start "rule__Literal__Group_2__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4628:1: rule__Literal__Group_2__1__Impl : ( ( rule__Literal__NameAssignment_2_1 ) ) ;
    public final void rule__Literal__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4632:1: ( ( ( rule__Literal__NameAssignment_2_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4633:1: ( ( rule__Literal__NameAssignment_2_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4633:1: ( ( rule__Literal__NameAssignment_2_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4634:1: ( rule__Literal__NameAssignment_2_1 )
            {
             before(grammarAccess.getLiteralAccess().getNameAssignment_2_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4635:1: ( rule__Literal__NameAssignment_2_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4635:2: rule__Literal__NameAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Literal__NameAssignment_2_1_in_rule__Literal__Group_2__1__Impl9262);
            rule__Literal__NameAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getNameAssignment_2_1()); 

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
    // $ANTLR end "rule__Literal__Group_2__1__Impl"


    // $ANTLR start "rule__Literal__Group_3__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4649:1: rule__Literal__Group_3__0 : rule__Literal__Group_3__0__Impl rule__Literal__Group_3__1 ;
    public final void rule__Literal__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4653:1: ( rule__Literal__Group_3__0__Impl rule__Literal__Group_3__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4654:2: rule__Literal__Group_3__0__Impl rule__Literal__Group_3__1
            {
            pushFollow(FOLLOW_rule__Literal__Group_3__0__Impl_in_rule__Literal__Group_3__09296);
            rule__Literal__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Literal__Group_3__1_in_rule__Literal__Group_3__09299);
            rule__Literal__Group_3__1();

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
    // $ANTLR end "rule__Literal__Group_3__0"


    // $ANTLR start "rule__Literal__Group_3__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4661:1: rule__Literal__Group_3__0__Impl : ( () ) ;
    public final void rule__Literal__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4665:1: ( ( () ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4666:1: ( () )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4666:1: ( () )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4667:1: ()
            {
             before(grammarAccess.getLiteralAccess().getLiteralAction_3_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4668:1: ()
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4670:1: 
            {
            }

             after(grammarAccess.getLiteralAccess().getLiteralAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_3__0__Impl"


    // $ANTLR start "rule__Literal__Group_3__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4680:1: rule__Literal__Group_3__1 : rule__Literal__Group_3__1__Impl ;
    public final void rule__Literal__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4684:1: ( rule__Literal__Group_3__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4685:2: rule__Literal__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Literal__Group_3__1__Impl_in_rule__Literal__Group_3__19357);
            rule__Literal__Group_3__1__Impl();

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
    // $ANTLR end "rule__Literal__Group_3__1"


    // $ANTLR start "rule__Literal__Group_3__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4691:1: rule__Literal__Group_3__1__Impl : ( ( rule__Literal__NameAssignment_3_1 ) ) ;
    public final void rule__Literal__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4695:1: ( ( ( rule__Literal__NameAssignment_3_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4696:1: ( ( rule__Literal__NameAssignment_3_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4696:1: ( ( rule__Literal__NameAssignment_3_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4697:1: ( rule__Literal__NameAssignment_3_1 )
            {
             before(grammarAccess.getLiteralAccess().getNameAssignment_3_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4698:1: ( rule__Literal__NameAssignment_3_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4698:2: rule__Literal__NameAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Literal__NameAssignment_3_1_in_rule__Literal__Group_3__1__Impl9384);
            rule__Literal__NameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getNameAssignment_3_1()); 

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
    // $ANTLR end "rule__Literal__Group_3__1__Impl"


    // $ANTLR start "rule__Literal__Group_4__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4712:1: rule__Literal__Group_4__0 : rule__Literal__Group_4__0__Impl rule__Literal__Group_4__1 ;
    public final void rule__Literal__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4716:1: ( rule__Literal__Group_4__0__Impl rule__Literal__Group_4__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4717:2: rule__Literal__Group_4__0__Impl rule__Literal__Group_4__1
            {
            pushFollow(FOLLOW_rule__Literal__Group_4__0__Impl_in_rule__Literal__Group_4__09418);
            rule__Literal__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Literal__Group_4__1_in_rule__Literal__Group_4__09421);
            rule__Literal__Group_4__1();

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
    // $ANTLR end "rule__Literal__Group_4__0"


    // $ANTLR start "rule__Literal__Group_4__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4724:1: rule__Literal__Group_4__0__Impl : ( () ) ;
    public final void rule__Literal__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4728:1: ( ( () ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4729:1: ( () )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4729:1: ( () )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4730:1: ()
            {
             before(grammarAccess.getLiteralAccess().getLiteralAction_4_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4731:1: ()
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4733:1: 
            {
            }

             after(grammarAccess.getLiteralAccess().getLiteralAction_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_4__0__Impl"


    // $ANTLR start "rule__Literal__Group_4__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4743:1: rule__Literal__Group_4__1 : rule__Literal__Group_4__1__Impl ;
    public final void rule__Literal__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4747:1: ( rule__Literal__Group_4__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4748:2: rule__Literal__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Literal__Group_4__1__Impl_in_rule__Literal__Group_4__19479);
            rule__Literal__Group_4__1__Impl();

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
    // $ANTLR end "rule__Literal__Group_4__1"


    // $ANTLR start "rule__Literal__Group_4__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4754:1: rule__Literal__Group_4__1__Impl : ( ( rule__Literal__NameAssignment_4_1 ) ) ;
    public final void rule__Literal__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4758:1: ( ( ( rule__Literal__NameAssignment_4_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4759:1: ( ( rule__Literal__NameAssignment_4_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4759:1: ( ( rule__Literal__NameAssignment_4_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4760:1: ( rule__Literal__NameAssignment_4_1 )
            {
             before(grammarAccess.getLiteralAccess().getNameAssignment_4_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4761:1: ( rule__Literal__NameAssignment_4_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4761:2: rule__Literal__NameAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Literal__NameAssignment_4_1_in_rule__Literal__Group_4__1__Impl9506);
            rule__Literal__NameAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getNameAssignment_4_1()); 

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
    // $ANTLR end "rule__Literal__Group_4__1__Impl"


    // $ANTLR start "rule__Enum__Group__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4775:1: rule__Enum__Group__0 : rule__Enum__Group__0__Impl rule__Enum__Group__1 ;
    public final void rule__Enum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4779:1: ( rule__Enum__Group__0__Impl rule__Enum__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4780:2: rule__Enum__Group__0__Impl rule__Enum__Group__1
            {
            pushFollow(FOLLOW_rule__Enum__Group__0__Impl_in_rule__Enum__Group__09540);
            rule__Enum__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__09543);
            rule__Enum__Group__1();

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
    // $ANTLR end "rule__Enum__Group__0"


    // $ANTLR start "rule__Enum__Group__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4787:1: rule__Enum__Group__0__Impl : ( 'Enum' ) ;
    public final void rule__Enum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4791:1: ( ( 'Enum' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4792:1: ( 'Enum' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4792:1: ( 'Enum' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4793:1: 'Enum'
            {
             before(grammarAccess.getEnumAccess().getEnumKeyword_0()); 
            match(input,49,FOLLOW_49_in_rule__Enum__Group__0__Impl9571); 
             after(grammarAccess.getEnumAccess().getEnumKeyword_0()); 

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
    // $ANTLR end "rule__Enum__Group__0__Impl"


    // $ANTLR start "rule__Enum__Group__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4806:1: rule__Enum__Group__1 : rule__Enum__Group__1__Impl ;
    public final void rule__Enum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4810:1: ( rule__Enum__Group__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4811:2: rule__Enum__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Enum__Group__1__Impl_in_rule__Enum__Group__19602);
            rule__Enum__Group__1__Impl();

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
    // $ANTLR end "rule__Enum__Group__1"


    // $ANTLR start "rule__Enum__Group__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4817:1: rule__Enum__Group__1__Impl : ( ( rule__Enum__TypeAssignment_1 ) ) ;
    public final void rule__Enum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4821:1: ( ( ( rule__Enum__TypeAssignment_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4822:1: ( ( rule__Enum__TypeAssignment_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4822:1: ( ( rule__Enum__TypeAssignment_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4823:1: ( rule__Enum__TypeAssignment_1 )
            {
             before(grammarAccess.getEnumAccess().getTypeAssignment_1()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4824:1: ( rule__Enum__TypeAssignment_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4824:2: rule__Enum__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Enum__TypeAssignment_1_in_rule__Enum__Group__1__Impl9629);
            rule__Enum__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getTypeAssignment_1()); 

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
    // $ANTLR end "rule__Enum__Group__1__Impl"


    // $ANTLR start "rule__EntityConfiguration__UnorderedGroup"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4839:1: rule__EntityConfiguration__UnorderedGroup : rule__EntityConfiguration__UnorderedGroup__0 {...}?;
    public final void rule__EntityConfiguration__UnorderedGroup() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getEntityConfigurationAccess().getUnorderedGroup());
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4844:1: ( rule__EntityConfiguration__UnorderedGroup__0 {...}?)
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4845:2: rule__EntityConfiguration__UnorderedGroup__0 {...}?
            {
            pushFollow(FOLLOW_rule__EntityConfiguration__UnorderedGroup__0_in_rule__EntityConfiguration__UnorderedGroup9664);
            rule__EntityConfiguration__UnorderedGroup__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getEntityConfigurationAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "rule__EntityConfiguration__UnorderedGroup", "getUnorderedGroupHelper().canLeave(grammarAccess.getEntityConfigurationAccess().getUnorderedGroup())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getEntityConfigurationAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityConfiguration__UnorderedGroup"


    // $ANTLR start "rule__EntityConfiguration__UnorderedGroup__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4856:1: rule__EntityConfiguration__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__EntityConfiguration__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EntityConfiguration__ObligatoryAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__EntityConfiguration__Group_2__0 ) ) ) ) ) ;
    public final void rule__EntityConfiguration__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4861:1: ( ( ({...}? => ( ( ( rule__EntityConfiguration__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EntityConfiguration__ObligatoryAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__EntityConfiguration__Group_2__0 ) ) ) ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4862:3: ( ({...}? => ( ( ( rule__EntityConfiguration__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EntityConfiguration__ObligatoryAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__EntityConfiguration__Group_2__0 ) ) ) ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4862:3: ( ({...}? => ( ( ( rule__EntityConfiguration__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EntityConfiguration__ObligatoryAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__EntityConfiguration__Group_2__0 ) ) ) ) )
            int alt25=3;
            int LA25_0 = input.LA(1);

            if ( LA25_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getEntityConfigurationAccess().getUnorderedGroup(), 0) ) {
                alt25=1;
            }
            else if ( LA25_0 ==51 && getUnorderedGroupHelper().canSelect(grammarAccess.getEntityConfigurationAccess().getUnorderedGroup(), 1) ) {
                alt25=2;
            }
            else if ( (LA25_0==22||LA25_0==52) && getUnorderedGroupHelper().canSelect(grammarAccess.getEntityConfigurationAccess().getUnorderedGroup(), 2) ) {
                alt25=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4864:4: ({...}? => ( ( ( rule__EntityConfiguration__Group_0__0 ) ) ) )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4864:4: ({...}? => ( ( ( rule__EntityConfiguration__Group_0__0 ) ) ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4865:5: {...}? => ( ( ( rule__EntityConfiguration__Group_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEntityConfigurationAccess().getUnorderedGroup(), 0) ) {
                        throw new FailedPredicateException(input, "rule__EntityConfiguration__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEntityConfigurationAccess().getUnorderedGroup(), 0)");
                    }
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4865:114: ( ( ( rule__EntityConfiguration__Group_0__0 ) ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4866:6: ( ( rule__EntityConfiguration__Group_0__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getEntityConfigurationAccess().getUnorderedGroup(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4872:6: ( ( rule__EntityConfiguration__Group_0__0 ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4874:7: ( rule__EntityConfiguration__Group_0__0 )
                    {
                     before(grammarAccess.getEntityConfigurationAccess().getGroup_0()); 
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4875:7: ( rule__EntityConfiguration__Group_0__0 )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4875:8: rule__EntityConfiguration__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__EntityConfiguration__Group_0__0_in_rule__EntityConfiguration__UnorderedGroup__Impl9753);
                    rule__EntityConfiguration__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEntityConfigurationAccess().getGroup_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4881:4: ({...}? => ( ( ( rule__EntityConfiguration__ObligatoryAssignment_1 ) ) ) )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4881:4: ({...}? => ( ( ( rule__EntityConfiguration__ObligatoryAssignment_1 ) ) ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4882:5: {...}? => ( ( ( rule__EntityConfiguration__ObligatoryAssignment_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEntityConfigurationAccess().getUnorderedGroup(), 1) ) {
                        throw new FailedPredicateException(input, "rule__EntityConfiguration__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEntityConfigurationAccess().getUnorderedGroup(), 1)");
                    }
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4882:114: ( ( ( rule__EntityConfiguration__ObligatoryAssignment_1 ) ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4883:6: ( ( rule__EntityConfiguration__ObligatoryAssignment_1 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getEntityConfigurationAccess().getUnorderedGroup(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4889:6: ( ( rule__EntityConfiguration__ObligatoryAssignment_1 ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4891:7: ( rule__EntityConfiguration__ObligatoryAssignment_1 )
                    {
                     before(grammarAccess.getEntityConfigurationAccess().getObligatoryAssignment_1()); 
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4892:7: ( rule__EntityConfiguration__ObligatoryAssignment_1 )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4892:8: rule__EntityConfiguration__ObligatoryAssignment_1
                    {
                    pushFollow(FOLLOW_rule__EntityConfiguration__ObligatoryAssignment_1_in_rule__EntityConfiguration__UnorderedGroup__Impl9844);
                    rule__EntityConfiguration__ObligatoryAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getEntityConfigurationAccess().getObligatoryAssignment_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4898:4: ({...}? => ( ( ( rule__EntityConfiguration__Group_2__0 ) ) ) )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4898:4: ({...}? => ( ( ( rule__EntityConfiguration__Group_2__0 ) ) ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4899:5: {...}? => ( ( ( rule__EntityConfiguration__Group_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEntityConfigurationAccess().getUnorderedGroup(), 2) ) {
                        throw new FailedPredicateException(input, "rule__EntityConfiguration__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEntityConfigurationAccess().getUnorderedGroup(), 2)");
                    }
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4899:114: ( ( ( rule__EntityConfiguration__Group_2__0 ) ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4900:6: ( ( rule__EntityConfiguration__Group_2__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getEntityConfigurationAccess().getUnorderedGroup(), 2);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4906:6: ( ( rule__EntityConfiguration__Group_2__0 ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4908:7: ( rule__EntityConfiguration__Group_2__0 )
                    {
                     before(grammarAccess.getEntityConfigurationAccess().getGroup_2()); 
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4909:7: ( rule__EntityConfiguration__Group_2__0 )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4909:8: rule__EntityConfiguration__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__EntityConfiguration__Group_2__0_in_rule__EntityConfiguration__UnorderedGroup__Impl9935);
                    rule__EntityConfiguration__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEntityConfigurationAccess().getGroup_2()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEntityConfigurationAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityConfiguration__UnorderedGroup__Impl"


    // $ANTLR start "rule__EntityConfiguration__UnorderedGroup__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4924:1: rule__EntityConfiguration__UnorderedGroup__0 : rule__EntityConfiguration__UnorderedGroup__Impl ( rule__EntityConfiguration__UnorderedGroup__1 )? ;
    public final void rule__EntityConfiguration__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4928:1: ( rule__EntityConfiguration__UnorderedGroup__Impl ( rule__EntityConfiguration__UnorderedGroup__1 )? )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4929:2: rule__EntityConfiguration__UnorderedGroup__Impl ( rule__EntityConfiguration__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_rule__EntityConfiguration__UnorderedGroup__Impl_in_rule__EntityConfiguration__UnorderedGroup__09994);
            rule__EntityConfiguration__UnorderedGroup__Impl();

            state._fsp--;

            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4930:2: ( rule__EntityConfiguration__UnorderedGroup__1 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( LA26_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getEntityConfigurationAccess().getUnorderedGroup(), 0) ) {
                alt26=1;
            }
            else if ( LA26_0 ==51 && getUnorderedGroupHelper().canSelect(grammarAccess.getEntityConfigurationAccess().getUnorderedGroup(), 1) ) {
                alt26=1;
            }
            else if ( (LA26_0==22||LA26_0==52) && getUnorderedGroupHelper().canSelect(grammarAccess.getEntityConfigurationAccess().getUnorderedGroup(), 2) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4930:2: rule__EntityConfiguration__UnorderedGroup__1
                    {
                    pushFollow(FOLLOW_rule__EntityConfiguration__UnorderedGroup__1_in_rule__EntityConfiguration__UnorderedGroup__09997);
                    rule__EntityConfiguration__UnorderedGroup__1();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__EntityConfiguration__UnorderedGroup__0"


    // $ANTLR start "rule__EntityConfiguration__UnorderedGroup__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4937:1: rule__EntityConfiguration__UnorderedGroup__1 : rule__EntityConfiguration__UnorderedGroup__Impl ( rule__EntityConfiguration__UnorderedGroup__2 )? ;
    public final void rule__EntityConfiguration__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4941:1: ( rule__EntityConfiguration__UnorderedGroup__Impl ( rule__EntityConfiguration__UnorderedGroup__2 )? )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4942:2: rule__EntityConfiguration__UnorderedGroup__Impl ( rule__EntityConfiguration__UnorderedGroup__2 )?
            {
            pushFollow(FOLLOW_rule__EntityConfiguration__UnorderedGroup__Impl_in_rule__EntityConfiguration__UnorderedGroup__110022);
            rule__EntityConfiguration__UnorderedGroup__Impl();

            state._fsp--;

            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4943:2: ( rule__EntityConfiguration__UnorderedGroup__2 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( LA27_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getEntityConfigurationAccess().getUnorderedGroup(), 0) ) {
                alt27=1;
            }
            else if ( LA27_0 ==51 && getUnorderedGroupHelper().canSelect(grammarAccess.getEntityConfigurationAccess().getUnorderedGroup(), 1) ) {
                alt27=1;
            }
            else if ( (LA27_0==22||LA27_0==52) && getUnorderedGroupHelper().canSelect(grammarAccess.getEntityConfigurationAccess().getUnorderedGroup(), 2) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4943:2: rule__EntityConfiguration__UnorderedGroup__2
                    {
                    pushFollow(FOLLOW_rule__EntityConfiguration__UnorderedGroup__2_in_rule__EntityConfiguration__UnorderedGroup__110025);
                    rule__EntityConfiguration__UnorderedGroup__2();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__EntityConfiguration__UnorderedGroup__1"


    // $ANTLR start "rule__EntityConfiguration__UnorderedGroup__2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4950:1: rule__EntityConfiguration__UnorderedGroup__2 : rule__EntityConfiguration__UnorderedGroup__Impl ;
    public final void rule__EntityConfiguration__UnorderedGroup__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4954:1: ( rule__EntityConfiguration__UnorderedGroup__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4955:2: rule__EntityConfiguration__UnorderedGroup__Impl
            {
            pushFollow(FOLLOW_rule__EntityConfiguration__UnorderedGroup__Impl_in_rule__EntityConfiguration__UnorderedGroup__210050);
            rule__EntityConfiguration__UnorderedGroup__Impl();

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
    // $ANTLR end "rule__EntityConfiguration__UnorderedGroup__2"


    // $ANTLR start "rule__Model__ElementsAssignment"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4968:1: rule__Model__ElementsAssignment : ( ruleElement ) ;
    public final void rule__Model__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4972:1: ( ( ruleElement ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4973:1: ( ruleElement )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4973:1: ( ruleElement )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4974:1: ruleElement
            {
             before(grammarAccess.getModelAccess().getElementsElementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleElement_in_rule__Model__ElementsAssignment10084);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsElementParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__ElementsAssignment"


    // $ANTLR start "rule__Flow__ImportsAssignment_0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4983:1: rule__Flow__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Flow__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4987:1: ( ( ruleImport ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4988:1: ( ruleImport )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4988:1: ( ruleImport )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4989:1: ruleImport
            {
             before(grammarAccess.getFlowAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Flow__ImportsAssignment_010115);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getFlowAccess().getImportsImportParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Flow__ImportsAssignment_0"


    // $ANTLR start "rule__Flow__NameAssignment_2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4998:1: rule__Flow__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Flow__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5002:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5003:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5003:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5004:1: RULE_ID
            {
             before(grammarAccess.getFlowAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Flow__NameAssignment_210146); 
             after(grammarAccess.getFlowAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Flow__NameAssignment_2"


    // $ANTLR start "rule__Flow__ActivitiesAssignment_4"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5013:1: rule__Flow__ActivitiesAssignment_4 : ( ruleActivity ) ;
    public final void rule__Flow__ActivitiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5017:1: ( ( ruleActivity ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5018:1: ( ruleActivity )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5018:1: ( ruleActivity )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5019:1: ruleActivity
            {
             before(grammarAccess.getFlowAccess().getActivitiesActivityParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleActivity_in_rule__Flow__ActivitiesAssignment_410177);
            ruleActivity();

            state._fsp--;

             after(grammarAccess.getFlowAccess().getActivitiesActivityParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Flow__ActivitiesAssignment_4"


    // $ANTLR start "rule__Activity__NameAssignment_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5028:1: rule__Activity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Activity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5032:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5033:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5033:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5034:1: RULE_ID
            {
             before(grammarAccess.getActivityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Activity__NameAssignment_110208); 
             after(grammarAccess.getActivityAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Activity__NameAssignment_1"


    // $ANTLR start "rule__Activity__SucessorsAssignment_3_2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5043:1: rule__Activity__SucessorsAssignment_3_2 : ( ( RULE_ID ) ) ;
    public final void rule__Activity__SucessorsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5047:1: ( ( ( RULE_ID ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5048:1: ( ( RULE_ID ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5048:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5049:1: ( RULE_ID )
            {
             before(grammarAccess.getActivityAccess().getSucessorsActivityCrossReference_3_2_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5050:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5051:1: RULE_ID
            {
             before(grammarAccess.getActivityAccess().getSucessorsActivityIDTerminalRuleCall_3_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Activity__SucessorsAssignment_3_210243); 
             after(grammarAccess.getActivityAccess().getSucessorsActivityIDTerminalRuleCall_3_2_0_1()); 

            }

             after(grammarAccess.getActivityAccess().getSucessorsActivityCrossReference_3_2_0()); 

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
    // $ANTLR end "rule__Activity__SucessorsAssignment_3_2"


    // $ANTLR start "rule__Activity__SucessorsAssignment_3_3_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5062:1: rule__Activity__SucessorsAssignment_3_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Activity__SucessorsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5066:1: ( ( ( RULE_ID ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5067:1: ( ( RULE_ID ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5067:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5068:1: ( RULE_ID )
            {
             before(grammarAccess.getActivityAccess().getSucessorsActivityCrossReference_3_3_1_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5069:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5070:1: RULE_ID
            {
             before(grammarAccess.getActivityAccess().getSucessorsActivityIDTerminalRuleCall_3_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Activity__SucessorsAssignment_3_3_110282); 
             after(grammarAccess.getActivityAccess().getSucessorsActivityIDTerminalRuleCall_3_3_1_0_1()); 

            }

             after(grammarAccess.getActivityAccess().getSucessorsActivityCrossReference_3_3_1_0()); 

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
    // $ANTLR end "rule__Activity__SucessorsAssignment_3_3_1"


    // $ANTLR start "rule__Activity__BusinessRuleAssignment_4_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5081:1: rule__Activity__BusinessRuleAssignment_4_1 : ( ( ruleFQN ) ) ;
    public final void rule__Activity__BusinessRuleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5085:1: ( ( ( ruleFQN ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5086:1: ( ( ruleFQN ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5086:1: ( ( ruleFQN ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5087:1: ( ruleFQN )
            {
             before(grammarAccess.getActivityAccess().getBusinessRuleBusinessRuleCrossReference_4_1_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5088:1: ( ruleFQN )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5089:1: ruleFQN
            {
             before(grammarAccess.getActivityAccess().getBusinessRuleBusinessRuleFQNParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Activity__BusinessRuleAssignment_4_110321);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getBusinessRuleBusinessRuleFQNParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getActivityAccess().getBusinessRuleBusinessRuleCrossReference_4_1_0()); 

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
    // $ANTLR end "rule__Activity__BusinessRuleAssignment_4_1"


    // $ANTLR start "rule__Activity__DescriptionAssignment_6"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5100:1: rule__Activity__DescriptionAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Activity__DescriptionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5104:1: ( ( RULE_STRING ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5105:1: ( RULE_STRING )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5105:1: ( RULE_STRING )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5106:1: RULE_STRING
            {
             before(grammarAccess.getActivityAccess().getDescriptionSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Activity__DescriptionAssignment_610356); 
             after(grammarAccess.getActivityAccess().getDescriptionSTRINGTerminalRuleCall_6_0()); 

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
    // $ANTLR end "rule__Activity__DescriptionAssignment_6"


    // $ANTLR start "rule__BusinessRule__ImportsAssignment_0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5115:1: rule__BusinessRule__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__BusinessRule__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5119:1: ( ( ruleImport ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5120:1: ( ruleImport )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5120:1: ( ruleImport )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5121:1: ruleImport
            {
             before(grammarAccess.getBusinessRuleAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__BusinessRule__ImportsAssignment_010387);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getBusinessRuleAccess().getImportsImportParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__BusinessRule__ImportsAssignment_0"


    // $ANTLR start "rule__BusinessRule__NameAssignment_2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5130:1: rule__BusinessRule__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__BusinessRule__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5134:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5135:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5135:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5136:1: RULE_ID
            {
             before(grammarAccess.getBusinessRuleAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BusinessRule__NameAssignment_210418); 
             after(grammarAccess.getBusinessRuleAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__BusinessRule__NameAssignment_2"


    // $ANTLR start "rule__BusinessRule__TypAssignment_4"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5145:1: rule__BusinessRule__TypAssignment_4 : ( ruleBREType ) ;
    public final void rule__BusinessRule__TypAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5149:1: ( ( ruleBREType ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5150:1: ( ruleBREType )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5150:1: ( ruleBREType )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5151:1: ruleBREType
            {
             before(grammarAccess.getBusinessRuleAccess().getTypBRETypeEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleBREType_in_rule__BusinessRule__TypAssignment_410449);
            ruleBREType();

            state._fsp--;

             after(grammarAccess.getBusinessRuleAccess().getTypBRETypeEnumRuleCall_4_0()); 

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
    // $ANTLR end "rule__BusinessRule__TypAssignment_4"


    // $ANTLR start "rule__BusinessRule__InputsAssignment_8"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5160:1: rule__BusinessRule__InputsAssignment_8 : ( ruleBreEntityInput ) ;
    public final void rule__BusinessRule__InputsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5164:1: ( ( ruleBreEntityInput ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5165:1: ( ruleBreEntityInput )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5165:1: ( ruleBreEntityInput )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5166:1: ruleBreEntityInput
            {
             before(grammarAccess.getBusinessRuleAccess().getInputsBreEntityInputParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleBreEntityInput_in_rule__BusinessRule__InputsAssignment_810480);
            ruleBreEntityInput();

            state._fsp--;

             after(grammarAccess.getBusinessRuleAccess().getInputsBreEntityInputParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__BusinessRule__InputsAssignment_8"


    // $ANTLR start "rule__BusinessRule__InputsAssignment_9_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5175:1: rule__BusinessRule__InputsAssignment_9_1 : ( ruleBreEntityInput ) ;
    public final void rule__BusinessRule__InputsAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5179:1: ( ( ruleBreEntityInput ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5180:1: ( ruleBreEntityInput )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5180:1: ( ruleBreEntityInput )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5181:1: ruleBreEntityInput
            {
             before(grammarAccess.getBusinessRuleAccess().getInputsBreEntityInputParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_ruleBreEntityInput_in_rule__BusinessRule__InputsAssignment_9_110511);
            ruleBreEntityInput();

            state._fsp--;

             after(grammarAccess.getBusinessRuleAccess().getInputsBreEntityInputParserRuleCall_9_1_0()); 

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
    // $ANTLR end "rule__BusinessRule__InputsAssignment_9_1"


    // $ANTLR start "rule__BusinessRule__OutputAssignment_13"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5190:1: rule__BusinessRule__OutputAssignment_13 : ( ruleBreOutPutReference ) ;
    public final void rule__BusinessRule__OutputAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5194:1: ( ( ruleBreOutPutReference ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5195:1: ( ruleBreOutPutReference )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5195:1: ( ruleBreOutPutReference )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5196:1: ruleBreOutPutReference
            {
             before(grammarAccess.getBusinessRuleAccess().getOutputBreOutPutReferenceParserRuleCall_13_0()); 
            pushFollow(FOLLOW_ruleBreOutPutReference_in_rule__BusinessRule__OutputAssignment_1310542);
            ruleBreOutPutReference();

            state._fsp--;

             after(grammarAccess.getBusinessRuleAccess().getOutputBreOutPutReferenceParserRuleCall_13_0()); 

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
    // $ANTLR end "rule__BusinessRule__OutputAssignment_13"


    // $ANTLR start "rule__BreOutPutReference__OutputAssignment"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5205:1: rule__BreOutPutReference__OutputAssignment : ( ( ruleFQN ) ) ;
    public final void rule__BreOutPutReference__OutputAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5209:1: ( ( ( ruleFQN ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5210:1: ( ( ruleFQN ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5210:1: ( ( ruleFQN ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5211:1: ( ruleFQN )
            {
             before(grammarAccess.getBreOutPutReferenceAccess().getOutputModelElementCrossReference_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5212:1: ( ruleFQN )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5213:1: ruleFQN
            {
             before(grammarAccess.getBreOutPutReferenceAccess().getOutputModelElementFQNParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__BreOutPutReference__OutputAssignment10577);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getBreOutPutReferenceAccess().getOutputModelElementFQNParserRuleCall_0_1()); 

            }

             after(grammarAccess.getBreOutPutReferenceAccess().getOutputModelElementCrossReference_0()); 

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
    // $ANTLR end "rule__BreOutPutReference__OutputAssignment"


    // $ANTLR start "rule__BreEntityInput__InputElementAssignment_0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5224:1: rule__BreEntityInput__InputElementAssignment_0 : ( ( ruleFQN ) ) ;
    public final void rule__BreEntityInput__InputElementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5228:1: ( ( ( ruleFQN ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5229:1: ( ( ruleFQN ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5229:1: ( ( ruleFQN ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5230:1: ( ruleFQN )
            {
             before(grammarAccess.getBreEntityInputAccess().getInputElementModelElementCrossReference_0_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5231:1: ( ruleFQN )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5232:1: ruleFQN
            {
             before(grammarAccess.getBreEntityInputAccess().getInputElementModelElementFQNParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__BreEntityInput__InputElementAssignment_010616);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getBreEntityInputAccess().getInputElementModelElementFQNParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getBreEntityInputAccess().getInputElementModelElementCrossReference_0_0()); 

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
    // $ANTLR end "rule__BreEntityInput__InputElementAssignment_0"


    // $ANTLR start "rule__BreEntityInput__ConfigurationAssignment_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5243:1: rule__BreEntityInput__ConfigurationAssignment_1 : ( ruleEntityConfiguration ) ;
    public final void rule__BreEntityInput__ConfigurationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5247:1: ( ( ruleEntityConfiguration ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5248:1: ( ruleEntityConfiguration )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5248:1: ( ruleEntityConfiguration )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5249:1: ruleEntityConfiguration
            {
             before(grammarAccess.getBreEntityInputAccess().getConfigurationEntityConfigurationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEntityConfiguration_in_rule__BreEntityInput__ConfigurationAssignment_110651);
            ruleEntityConfiguration();

            state._fsp--;

             after(grammarAccess.getBreEntityInputAccess().getConfigurationEntityConfigurationParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__BreEntityInput__ConfigurationAssignment_1"


    // $ANTLR start "rule__EntityConfiguration__PrimaryAssignment_0_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5258:1: rule__EntityConfiguration__PrimaryAssignment_0_1 : ( ( 'prim\\u00E4r' ) ) ;
    public final void rule__EntityConfiguration__PrimaryAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5262:1: ( ( ( 'prim\\u00E4r' ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5263:1: ( ( 'prim\\u00E4r' ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5263:1: ( ( 'prim\\u00E4r' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5264:1: ( 'prim\\u00E4r' )
            {
             before(grammarAccess.getEntityConfigurationAccess().getPrimaryPrimärKeyword_0_1_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5265:1: ( 'prim\\u00E4r' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5266:1: 'prim\\u00E4r'
            {
             before(grammarAccess.getEntityConfigurationAccess().getPrimaryPrimärKeyword_0_1_0()); 
            match(input,50,FOLLOW_50_in_rule__EntityConfiguration__PrimaryAssignment_0_110687); 
             after(grammarAccess.getEntityConfigurationAccess().getPrimaryPrimärKeyword_0_1_0()); 

            }

             after(grammarAccess.getEntityConfigurationAccess().getPrimaryPrimärKeyword_0_1_0()); 

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
    // $ANTLR end "rule__EntityConfiguration__PrimaryAssignment_0_1"


    // $ANTLR start "rule__EntityConfiguration__ObligatoryAssignment_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5281:1: rule__EntityConfiguration__ObligatoryAssignment_1 : ( ( 'obligatorisch' ) ) ;
    public final void rule__EntityConfiguration__ObligatoryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5285:1: ( ( ( 'obligatorisch' ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5286:1: ( ( 'obligatorisch' ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5286:1: ( ( 'obligatorisch' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5287:1: ( 'obligatorisch' )
            {
             before(grammarAccess.getEntityConfigurationAccess().getObligatoryObligatorischKeyword_1_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5288:1: ( 'obligatorisch' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5289:1: 'obligatorisch'
            {
             before(grammarAccess.getEntityConfigurationAccess().getObligatoryObligatorischKeyword_1_0()); 
            match(input,51,FOLLOW_51_in_rule__EntityConfiguration__ObligatoryAssignment_110731); 
             after(grammarAccess.getEntityConfigurationAccess().getObligatoryObligatorischKeyword_1_0()); 

            }

             after(grammarAccess.getEntityConfigurationAccess().getObligatoryObligatorischKeyword_1_0()); 

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
    // $ANTLR end "rule__EntityConfiguration__ObligatoryAssignment_1"


    // $ANTLR start "rule__EntityConfiguration__MultipleAssignment_2_0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5304:1: rule__EntityConfiguration__MultipleAssignment_2_0 : ( ( 'mehrfach' ) ) ;
    public final void rule__EntityConfiguration__MultipleAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5308:1: ( ( ( 'mehrfach' ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5309:1: ( ( 'mehrfach' ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5309:1: ( ( 'mehrfach' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5310:1: ( 'mehrfach' )
            {
             before(grammarAccess.getEntityConfigurationAccess().getMultipleMehrfachKeyword_2_0_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5311:1: ( 'mehrfach' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5312:1: 'mehrfach'
            {
             before(grammarAccess.getEntityConfigurationAccess().getMultipleMehrfachKeyword_2_0_0()); 
            match(input,52,FOLLOW_52_in_rule__EntityConfiguration__MultipleAssignment_2_010775); 
             after(grammarAccess.getEntityConfigurationAccess().getMultipleMehrfachKeyword_2_0_0()); 

            }

             after(grammarAccess.getEntityConfigurationAccess().getMultipleMehrfachKeyword_2_0_0()); 

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
    // $ANTLR end "rule__EntityConfiguration__MultipleAssignment_2_0"


    // $ANTLR start "rule__System__NameAssignment_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5327:1: rule__System__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__System__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5331:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5332:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5332:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5333:1: RULE_ID
            {
             before(grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__System__NameAssignment_110814); 
             after(grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__System__NameAssignment_1"


    // $ANTLR start "rule__System__SrcEntitiesAssignment_3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5342:1: rule__System__SrcEntitiesAssignment_3 : ( ruleSystemEntity ) ;
    public final void rule__System__SrcEntitiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5346:1: ( ( ruleSystemEntity ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5347:1: ( ruleSystemEntity )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5347:1: ( ruleSystemEntity )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5348:1: ruleSystemEntity
            {
             before(grammarAccess.getSystemAccess().getSrcEntitiesSystemEntityParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleSystemEntity_in_rule__System__SrcEntitiesAssignment_310845);
            ruleSystemEntity();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getSrcEntitiesSystemEntityParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__System__SrcEntitiesAssignment_3"


    // $ANTLR start "rule__SystemEntity__NameAssignment_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5357:1: rule__SystemEntity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SystemEntity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5361:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5362:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5362:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5363:1: RULE_ID
            {
             before(grammarAccess.getSystemEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SystemEntity__NameAssignment_110876); 
             after(grammarAccess.getSystemEntityAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__SystemEntity__NameAssignment_1"


    // $ANTLR start "rule__SystemEntity__FormatAssignment_3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5372:1: rule__SystemEntity__FormatAssignment_3 : ( RULE_STRING ) ;
    public final void rule__SystemEntity__FormatAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5376:1: ( ( RULE_STRING ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5377:1: ( RULE_STRING )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5377:1: ( RULE_STRING )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5378:1: RULE_STRING
            {
             before(grammarAccess.getSystemEntityAccess().getFormatSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SystemEntity__FormatAssignment_310907); 
             after(grammarAccess.getSystemEntityAccess().getFormatSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__SystemEntity__FormatAssignment_3"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5387:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleFqnWithWildCard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5391:1: ( ( ruleFqnWithWildCard ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5392:1: ( ruleFqnWithWildCard )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5392:1: ( ruleFqnWithWildCard )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5393:1: ruleFqnWithWildCard
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceFqnWithWildCardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFqnWithWildCard_in_rule__Import__ImportedNamespaceAssignment_110938);
            ruleFqnWithWildCard();

            state._fsp--;

             after(grammarAccess.getImportAccess().getImportedNamespaceFqnWithWildCardParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__Diagram__ImportsAssignment_0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5402:1: rule__Diagram__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Diagram__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5406:1: ( ( ruleImport ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5407:1: ( ruleImport )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5407:1: ( ruleImport )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5408:1: ruleImport
            {
             before(grammarAccess.getDiagramAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Diagram__ImportsAssignment_010969);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getDiagramAccess().getImportsImportParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Diagram__ImportsAssignment_0"


    // $ANTLR start "rule__Diagram__NameAssignment_2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5417:1: rule__Diagram__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Diagram__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5421:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5422:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5422:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5423:1: RULE_ID
            {
             before(grammarAccess.getDiagramAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Diagram__NameAssignment_211000); 
             after(grammarAccess.getDiagramAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Diagram__NameAssignment_2"


    // $ANTLR start "rule__Diagram__IncludesAssignment_4"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5432:1: rule__Diagram__IncludesAssignment_4 : ( ruleInclude ) ;
    public final void rule__Diagram__IncludesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5436:1: ( ( ruleInclude ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5437:1: ( ruleInclude )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5437:1: ( ruleInclude )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5438:1: ruleInclude
            {
             before(grammarAccess.getDiagramAccess().getIncludesIncludeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleInclude_in_rule__Diagram__IncludesAssignment_411031);
            ruleInclude();

            state._fsp--;

             after(grammarAccess.getDiagramAccess().getIncludesIncludeParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Diagram__IncludesAssignment_4"


    // $ANTLR start "rule__Include__IncludeAssignment_0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5447:1: rule__Include__IncludeAssignment_0 : ( ( rule__Include__IncludeAlternatives_0_0 ) ) ;
    public final void rule__Include__IncludeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5451:1: ( ( ( rule__Include__IncludeAlternatives_0_0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5452:1: ( ( rule__Include__IncludeAlternatives_0_0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5452:1: ( ( rule__Include__IncludeAlternatives_0_0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5453:1: ( rule__Include__IncludeAlternatives_0_0 )
            {
             before(grammarAccess.getIncludeAccess().getIncludeAlternatives_0_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5454:1: ( rule__Include__IncludeAlternatives_0_0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5454:2: rule__Include__IncludeAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__Include__IncludeAlternatives_0_0_in_rule__Include__IncludeAssignment_011062);
            rule__Include__IncludeAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getIncludeAccess().getIncludeAlternatives_0_0()); 

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
    // $ANTLR end "rule__Include__IncludeAssignment_0"


    // $ANTLR start "rule__Include__EntityAssignment_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5463:1: rule__Include__EntityAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__Include__EntityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5467:1: ( ( ( ruleFQN ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5468:1: ( ( ruleFQN ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5468:1: ( ( ruleFQN ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5469:1: ( ruleFQN )
            {
             before(grammarAccess.getIncludeAccess().getEntityEntityCrossReference_1_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5470:1: ( ruleFQN )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5471:1: ruleFQN
            {
             before(grammarAccess.getIncludeAccess().getEntityEntityFQNParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Include__EntityAssignment_111099);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getIncludeAccess().getEntityEntityFQNParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getIncludeAccess().getEntityEntityCrossReference_1_0()); 

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
    // $ANTLR end "rule__Include__EntityAssignment_1"


    // $ANTLR start "rule__Include__FieldsAssignment_2_2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5482:1: rule__Include__FieldsAssignment_2_2 : ( ( RULE_ID ) ) ;
    public final void rule__Include__FieldsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5486:1: ( ( ( RULE_ID ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5487:1: ( ( RULE_ID ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5487:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5488:1: ( RULE_ID )
            {
             before(grammarAccess.getIncludeAccess().getFieldsPropertyCrossReference_2_2_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5489:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5490:1: RULE_ID
            {
             before(grammarAccess.getIncludeAccess().getFieldsPropertyIDTerminalRuleCall_2_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Include__FieldsAssignment_2_211138); 
             after(grammarAccess.getIncludeAccess().getFieldsPropertyIDTerminalRuleCall_2_2_0_1()); 

            }

             after(grammarAccess.getIncludeAccess().getFieldsPropertyCrossReference_2_2_0()); 

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
    // $ANTLR end "rule__Include__FieldsAssignment_2_2"


    // $ANTLR start "rule__Include__FieldsAssignment_2_3_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5501:1: rule__Include__FieldsAssignment_2_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Include__FieldsAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5505:1: ( ( ( RULE_ID ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5506:1: ( ( RULE_ID ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5506:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5507:1: ( RULE_ID )
            {
             before(grammarAccess.getIncludeAccess().getFieldsPropertyCrossReference_2_3_1_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5508:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5509:1: RULE_ID
            {
             before(grammarAccess.getIncludeAccess().getFieldsPropertyIDTerminalRuleCall_2_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Include__FieldsAssignment_2_3_111177); 
             after(grammarAccess.getIncludeAccess().getFieldsPropertyIDTerminalRuleCall_2_3_1_0_1()); 

            }

             after(grammarAccess.getIncludeAccess().getFieldsPropertyCrossReference_2_3_1_0()); 

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
    // $ANTLR end "rule__Include__FieldsAssignment_2_3_1"


    // $ANTLR start "rule__EnumDeclaration__NameAssignment_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5520:1: rule__EnumDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EnumDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5524:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5525:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5525:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5526:1: RULE_ID
            {
             before(grammarAccess.getEnumDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumDeclaration__NameAssignment_111212); 
             after(grammarAccess.getEnumDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__EnumDeclaration__NameAssignment_1"


    // $ANTLR start "rule__EnumDeclaration__ValuesAssignment_3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5535:1: rule__EnumDeclaration__ValuesAssignment_3 : ( RULE_ID ) ;
    public final void rule__EnumDeclaration__ValuesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5539:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5540:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5540:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5541:1: RULE_ID
            {
             before(grammarAccess.getEnumDeclarationAccess().getValuesIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumDeclaration__ValuesAssignment_311243); 
             after(grammarAccess.getEnumDeclarationAccess().getValuesIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__EnumDeclaration__ValuesAssignment_3"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5550:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5554:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5555:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5555:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5556:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_111274); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__PropertiesAssignment_3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5565:1: rule__Entity__PropertiesAssignment_3 : ( ruleProperty ) ;
    public final void rule__Entity__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5569:1: ( ( ruleProperty ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5570:1: ( ruleProperty )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5570:1: ( ruleProperty )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5571:1: ruleProperty
            {
             before(grammarAccess.getEntityAccess().getPropertiesPropertyParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleProperty_in_rule__Entity__PropertiesAssignment_311305);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getPropertiesPropertyParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Entity__PropertiesAssignment_3"


    // $ANTLR start "rule__Domain__ImportsAssignment_0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5580:1: rule__Domain__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Domain__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5584:1: ( ( ruleImport ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5585:1: ( ruleImport )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5585:1: ( ruleImport )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5586:1: ruleImport
            {
             before(grammarAccess.getDomainAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Domain__ImportsAssignment_011336);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getDomainAccess().getImportsImportParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Domain__ImportsAssignment_0"


    // $ANTLR start "rule__Domain__NameAssignment_2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5595:1: rule__Domain__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Domain__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5599:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5600:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5600:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5601:1: RULE_ID
            {
             before(grammarAccess.getDomainAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Domain__NameAssignment_211367); 
             after(grammarAccess.getDomainAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Domain__NameAssignment_2"


    // $ANTLR start "rule__Domain__DescriptionAssignment_4"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5610:1: rule__Domain__DescriptionAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Domain__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5614:1: ( ( RULE_STRING ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5615:1: ( RULE_STRING )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5615:1: ( RULE_STRING )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5616:1: RULE_STRING
            {
             before(grammarAccess.getDomainAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Domain__DescriptionAssignment_411398); 
             after(grammarAccess.getDomainAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__Domain__DescriptionAssignment_4"


    // $ANTLR start "rule__Domain__EntitiesAssignment_6"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5625:1: rule__Domain__EntitiesAssignment_6 : ( ruleEntity ) ;
    public final void rule__Domain__EntitiesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5629:1: ( ( ruleEntity ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5630:1: ( ruleEntity )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5630:1: ( ruleEntity )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5631:1: ruleEntity
            {
             before(grammarAccess.getDomainAccess().getEntitiesEntityParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleEntity_in_rule__Domain__EntitiesAssignment_611429);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getDomainAccess().getEntitiesEntityParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Domain__EntitiesAssignment_6"


    // $ANTLR start "rule__Association__NameAssignment_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5640:1: rule__Association__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Association__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5644:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5645:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5645:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5646:1: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Association__NameAssignment_111460); 
             after(grammarAccess.getAssociationAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Association__NameAssignment_1"


    // $ANTLR start "rule__Association__TypeAssignment_3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5655:1: rule__Association__TypeAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__Association__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5659:1: ( ( ( ruleFQN ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5660:1: ( ( ruleFQN ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5660:1: ( ( ruleFQN ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5661:1: ( ruleFQN )
            {
             before(grammarAccess.getAssociationAccess().getTypeEntityCrossReference_3_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5662:1: ( ruleFQN )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5663:1: ruleFQN
            {
             before(grammarAccess.getAssociationAccess().getTypeEntityFQNParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_ruleFQN_in_rule__Association__TypeAssignment_311495);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getAssociationAccess().getTypeEntityFQNParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getAssociationAccess().getTypeEntityCrossReference_3_0()); 

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
    // $ANTLR end "rule__Association__TypeAssignment_3"


    // $ANTLR start "rule__Association__MultiplicityAssignment_4"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5674:1: rule__Association__MultiplicityAssignment_4 : ( ruleMultiplicty ) ;
    public final void rule__Association__MultiplicityAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5678:1: ( ( ruleMultiplicty ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5679:1: ( ruleMultiplicty )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5679:1: ( ruleMultiplicty )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5680:1: ruleMultiplicty
            {
             before(grammarAccess.getAssociationAccess().getMultiplicityMultiplictyEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleMultiplicty_in_rule__Association__MultiplicityAssignment_411530);
            ruleMultiplicty();

            state._fsp--;

             after(grammarAccess.getAssociationAccess().getMultiplicityMultiplictyEnumRuleCall_4_0()); 

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
    // $ANTLR end "rule__Association__MultiplicityAssignment_4"


    // $ANTLR start "rule__Field__NameAssignment_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5689:1: rule__Field__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Field__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5693:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5694:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5694:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5695:1: RULE_ID
            {
             before(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Field__NameAssignment_111561); 
             after(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Field__NameAssignment_1"


    // $ANTLR start "rule__Field__LiteralAssignment_3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5704:1: rule__Field__LiteralAssignment_3 : ( ruleLiteral ) ;
    public final void rule__Field__LiteralAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5708:1: ( ( ruleLiteral ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5709:1: ( ruleLiteral )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5709:1: ( ruleLiteral )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5710:1: ruleLiteral
            {
             before(grammarAccess.getFieldAccess().getLiteralLiteralParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleLiteral_in_rule__Field__LiteralAssignment_311592);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getLiteralLiteralParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Field__LiteralAssignment_3"


    // $ANTLR start "rule__Literal__NameAssignment_0_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5719:1: rule__Literal__NameAssignment_0_1 : ( ( 'Decimal' ) ) ;
    public final void rule__Literal__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5723:1: ( ( ( 'Decimal' ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5724:1: ( ( 'Decimal' ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5724:1: ( ( 'Decimal' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5725:1: ( 'Decimal' )
            {
             before(grammarAccess.getLiteralAccess().getNameDecimalKeyword_0_1_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5726:1: ( 'Decimal' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5727:1: 'Decimal'
            {
             before(grammarAccess.getLiteralAccess().getNameDecimalKeyword_0_1_0()); 
            match(input,53,FOLLOW_53_in_rule__Literal__NameAssignment_0_111628); 
             after(grammarAccess.getLiteralAccess().getNameDecimalKeyword_0_1_0()); 

            }

             after(grammarAccess.getLiteralAccess().getNameDecimalKeyword_0_1_0()); 

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
    // $ANTLR end "rule__Literal__NameAssignment_0_1"


    // $ANTLR start "rule__Literal__NameAssignment_1_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5742:1: rule__Literal__NameAssignment_1_1 : ( ( 'Money' ) ) ;
    public final void rule__Literal__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5746:1: ( ( ( 'Money' ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5747:1: ( ( 'Money' ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5747:1: ( ( 'Money' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5748:1: ( 'Money' )
            {
             before(grammarAccess.getLiteralAccess().getNameMoneyKeyword_1_1_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5749:1: ( 'Money' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5750:1: 'Money'
            {
             before(grammarAccess.getLiteralAccess().getNameMoneyKeyword_1_1_0()); 
            match(input,54,FOLLOW_54_in_rule__Literal__NameAssignment_1_111672); 
             after(grammarAccess.getLiteralAccess().getNameMoneyKeyword_1_1_0()); 

            }

             after(grammarAccess.getLiteralAccess().getNameMoneyKeyword_1_1_0()); 

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
    // $ANTLR end "rule__Literal__NameAssignment_1_1"


    // $ANTLR start "rule__Literal__NameAssignment_2_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5765:1: rule__Literal__NameAssignment_2_1 : ( ( 'Text' ) ) ;
    public final void rule__Literal__NameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5769:1: ( ( ( 'Text' ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5770:1: ( ( 'Text' ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5770:1: ( ( 'Text' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5771:1: ( 'Text' )
            {
             before(grammarAccess.getLiteralAccess().getNameTextKeyword_2_1_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5772:1: ( 'Text' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5773:1: 'Text'
            {
             before(grammarAccess.getLiteralAccess().getNameTextKeyword_2_1_0()); 
            match(input,55,FOLLOW_55_in_rule__Literal__NameAssignment_2_111716); 
             after(grammarAccess.getLiteralAccess().getNameTextKeyword_2_1_0()); 

            }

             after(grammarAccess.getLiteralAccess().getNameTextKeyword_2_1_0()); 

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
    // $ANTLR end "rule__Literal__NameAssignment_2_1"


    // $ANTLR start "rule__Literal__NameAssignment_3_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5788:1: rule__Literal__NameAssignment_3_1 : ( ( 'Boolean' ) ) ;
    public final void rule__Literal__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5792:1: ( ( ( 'Boolean' ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5793:1: ( ( 'Boolean' ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5793:1: ( ( 'Boolean' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5794:1: ( 'Boolean' )
            {
             before(grammarAccess.getLiteralAccess().getNameBooleanKeyword_3_1_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5795:1: ( 'Boolean' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5796:1: 'Boolean'
            {
             before(grammarAccess.getLiteralAccess().getNameBooleanKeyword_3_1_0()); 
            match(input,56,FOLLOW_56_in_rule__Literal__NameAssignment_3_111760); 
             after(grammarAccess.getLiteralAccess().getNameBooleanKeyword_3_1_0()); 

            }

             after(grammarAccess.getLiteralAccess().getNameBooleanKeyword_3_1_0()); 

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
    // $ANTLR end "rule__Literal__NameAssignment_3_1"


    // $ANTLR start "rule__Literal__NameAssignment_4_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5811:1: rule__Literal__NameAssignment_4_1 : ( ( 'Int' ) ) ;
    public final void rule__Literal__NameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5815:1: ( ( ( 'Int' ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5816:1: ( ( 'Int' ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5816:1: ( ( 'Int' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5817:1: ( 'Int' )
            {
             before(grammarAccess.getLiteralAccess().getNameIntKeyword_4_1_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5818:1: ( 'Int' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5819:1: 'Int'
            {
             before(grammarAccess.getLiteralAccess().getNameIntKeyword_4_1_0()); 
            match(input,57,FOLLOW_57_in_rule__Literal__NameAssignment_4_111804); 
             after(grammarAccess.getLiteralAccess().getNameIntKeyword_4_1_0()); 

            }

             after(grammarAccess.getLiteralAccess().getNameIntKeyword_4_1_0()); 

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
    // $ANTLR end "rule__Literal__NameAssignment_4_1"


    // $ANTLR start "rule__Enum__TypeAssignment_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5834:1: rule__Enum__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Enum__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5838:1: ( ( ( RULE_ID ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5839:1: ( ( RULE_ID ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5839:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5840:1: ( RULE_ID )
            {
             before(grammarAccess.getEnumAccess().getTypeEnumDeclarationCrossReference_1_0()); 
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5841:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5842:1: RULE_ID
            {
             before(grammarAccess.getEnumAccess().getTypeEnumDeclarationIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Enum__TypeAssignment_111847); 
             after(grammarAccess.getEnumAccess().getTypeEnumDeclarationIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getEnumAccess().getTypeEnumDeclarationCrossReference_1_0()); 

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
    // $ANTLR end "rule__Enum__TypeAssignment_1"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String DFA1_eotS =
        "\14\uffff";
    static final String DFA1_eofS =
        "\14\uffff";
    static final String DFA1_minS =
        "\1\24\1\uffff\1\4\5\uffff\1\24\1\4\2\24";
    static final String DFA1_maxS =
        "\1\54\1\uffff\1\4\5\uffff\1\54\1\4\2\54";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\1\3\1\4\1\5\1\6\4\uffff";
    static final String DFA1_specialS =
        "\14\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\5\11\uffff\1\6\3\uffff\1\7\2\uffff\1\2\1\uffff\1\3\1\uffff"+
            "\1\1\2\uffff\1\4",
            "",
            "\1\10",
            "",
            "",
            "",
            "",
            "",
            "\1\5\11\uffff\1\6\6\uffff\1\2\1\12\1\3\2\uffff\1\11\1\uffff"+
            "\1\4",
            "\1\13",
            "\1\5\11\uffff\1\6\6\uffff\1\2\1\uffff\1\3\4\uffff\1\4",
            "\1\5\11\uffff\1\6\6\uffff\1\2\1\12\1\3\2\uffff\1\11\1\uffff"+
            "\1\4"
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
            return "746:1: rule__Element__Alternatives : ( ( ruleEnumDeclaration ) | ( ruleDiagram ) | ( ruleDomain ) | ( ruleFlow ) | ( ruleBusinessRule ) | ( ruleSystem ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ElementsAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Alternatives_in_ruleElement154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFlow_in_entryRuleFlow181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFlow188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__Group__0_in_ruleFlow214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_entryRuleActivity241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivity248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__0_in_ruleActivity274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessRule_in_entryRuleBusinessRule301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBusinessRule308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__0_in_ruleBusinessRule334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreOutPutReference_in_entryRuleBreOutPutReference363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBreOutPutReference370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BreOutPutReference__OutputAssignment_in_ruleBreOutPutReference396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreEntityInput_in_entryRuleBreEntityInput423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBreEntityInput430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BreEntityInput__Group__0_in_ruleBreEntityInput456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityConfiguration_in_entryRuleEntityConfiguration483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityConfiguration490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__UnorderedGroup_in_ruleEntityConfiguration516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystem_in_entryRuleSystem543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystem550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__0_in_ruleSystem576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystemEntity_in_entryRuleSystemEntity603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystemEntity610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntity__Group__0_in_ruleSystemEntity636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFqnWithWildCard_in_entryRuleFqnWithWildCard723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFqnWithWildCard730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FqnWithWildCard__Group__0_in_ruleFqnWithWildCard756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiagram_in_entryRuleDiagram783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDiagram790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Diagram__Group__0_in_ruleDiagram816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_entryRuleInclude843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInclude850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__0_in_ruleInclude876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDeclaration_in_entryRuleEnumDeclaration903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumDeclaration910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__0_in_ruleEnumDeclaration936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0_in_ruleFQN996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity1023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomain_in_entryRuleDomain1083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomain1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__0_in_ruleDomain1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty1143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Alternatives_in_ruleProperty1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociation_in_entryRuleAssociation1203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssociation1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group__0_in_ruleAssociation1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField1263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0_in_ruleField1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral1323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Alternatives_in_ruleLiteral1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_entryRuleEnum1383 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnum1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__0_in_ruleEnum1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BREType__Alternatives_in_ruleBREType1455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicty__Alternatives_in_ruleMultiplicty1491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDeclaration_in_rule__Element__Alternatives1526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiagram_in_rule__Element__Alternatives1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomain_in_rule__Element__Alternatives1560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFlow_in_rule__Element__Alternatives1577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessRule_in_rule__Element__Alternatives1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystem_in_rule__Element__Alternatives1611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Include__IncludeAlternatives_0_01645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Include__IncludeAlternatives_0_01665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__Property__Alternatives1699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociation_in_rule__Property__Alternatives1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_0__0_in_rule__Literal__Alternatives1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_1__0_in_rule__Literal__Alternatives1766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_2__0_in_rule__Literal__Alternatives1784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_3__0_in_rule__Literal__Alternatives1802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_4__0_in_rule__Literal__Alternatives1820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_rule__Literal__Alternatives1838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__BREType__Alternatives1872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__BREType__Alternatives1893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__BREType__Alternatives1914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Multiplicty__Alternatives1950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Multiplicty__Alternatives1971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Multiplicty__Alternatives1992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Multiplicty__Alternatives2013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__Group__0__Impl_in_rule__Flow__Group__02046 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Flow__Group__1_in_rule__Flow__Group__02049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__ImportsAssignment_0_in_rule__Flow__Group__0__Impl2076 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__Flow__Group__1__Impl_in_rule__Flow__Group__12107 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Flow__Group__2_in_rule__Flow__Group__12110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Flow__Group__1__Impl2138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__Group__2__Impl_in_rule__Flow__Group__22169 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Flow__Group__3_in_rule__Flow__Group__22172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__NameAssignment_2_in_rule__Flow__Group__2__Impl2199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__Group__3__Impl_in_rule__Flow__Group__32229 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_rule__Flow__Group__4_in_rule__Flow__Group__32232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Flow__Group__3__Impl2260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__Group__4__Impl_in_rule__Flow__Group__42291 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_rule__Flow__Group__5_in_rule__Flow__Group__42294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__ActivitiesAssignment_4_in_rule__Flow__Group__4__Impl2321 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Flow__Group__5__Impl_in_rule__Flow__Group__52352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Flow__Group__5__Impl2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__0__Impl_in_rule__Activity__Group__02423 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group__1_in_rule__Activity__Group__02426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Activity__Group__0__Impl2454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__1__Impl_in_rule__Activity__Group__12485 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Activity__Group__2_in_rule__Activity__Group__12488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__NameAssignment_1_in_rule__Activity__Group__1__Impl2515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__2__Impl_in_rule__Activity__Group__22545 = new BitSet(new long[]{0x0000000023000000L});
    public static final BitSet FOLLOW_rule__Activity__Group__3_in_rule__Activity__Group__22548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Activity__Group__2__Impl2576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__3__Impl_in_rule__Activity__Group__32607 = new BitSet(new long[]{0x0000000023000000L});
    public static final BitSet FOLLOW_rule__Activity__Group__4_in_rule__Activity__Group__32610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_3__0_in_rule__Activity__Group__3__Impl2637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__4__Impl_in_rule__Activity__Group__42668 = new BitSet(new long[]{0x0000000023000000L});
    public static final BitSet FOLLOW_rule__Activity__Group__5_in_rule__Activity__Group__42671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__0_in_rule__Activity__Group__4__Impl2698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__5__Impl_in_rule__Activity__Group__52729 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Activity__Group__6_in_rule__Activity__Group__52732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Activity__Group__5__Impl2760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__6__Impl_in_rule__Activity__Group__62791 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Activity__Group__7_in_rule__Activity__Group__62794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__DescriptionAssignment_6_in_rule__Activity__Group__6__Impl2821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__7__Impl_in_rule__Activity__Group__72851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Activity__Group__7__Impl2879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_3__0__Impl_in_rule__Activity__Group_3__02926 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Activity__Group_3__1_in_rule__Activity__Group_3__02929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Activity__Group_3__0__Impl2957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_3__1__Impl_in_rule__Activity__Group_3__12988 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group_3__2_in_rule__Activity__Group_3__12991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Activity__Group_3__1__Impl3019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_3__2__Impl_in_rule__Activity__Group_3__23050 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__Activity__Group_3__3_in_rule__Activity__Group_3__23053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__SucessorsAssignment_3_2_in_rule__Activity__Group_3__2__Impl3080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_3__3__Impl_in_rule__Activity__Group_3__33110 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__Activity__Group_3__4_in_rule__Activity__Group_3__33113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_3_3__0_in_rule__Activity__Group_3__3__Impl3140 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_3__4__Impl_in_rule__Activity__Group_3__43171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Activity__Group_3__4__Impl3199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_3_3__0__Impl_in_rule__Activity__Group_3_3__03240 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group_3_3__1_in_rule__Activity__Group_3_3__03243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Activity__Group_3_3__0__Impl3271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_3_3__1__Impl_in_rule__Activity__Group_3_3__13302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__SucessorsAssignment_3_3_1_in_rule__Activity__Group_3_3__1__Impl3329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__0__Impl_in_rule__Activity__Group_4__03363 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__1_in_rule__Activity__Group_4__03366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Activity__Group_4__0__Impl3394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__1__Impl_in_rule__Activity__Group_4__13425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__BusinessRuleAssignment_4_1_in_rule__Activity__Group_4__1__Impl3452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__0__Impl_in_rule__BusinessRule__Group__03486 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__1_in_rule__BusinessRule__Group__03489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__ImportsAssignment_0_in_rule__BusinessRule__Group__0__Impl3516 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__1__Impl_in_rule__BusinessRule__Group__13547 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__2_in_rule__BusinessRule__Group__13550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__BusinessRule__Group__1__Impl3578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__2__Impl_in_rule__BusinessRule__Group__23609 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__3_in_rule__BusinessRule__Group__23612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__NameAssignment_2_in_rule__BusinessRule__Group__2__Impl3639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__3__Impl_in_rule__BusinessRule__Group__33669 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__4_in_rule__BusinessRule__Group__33672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__BusinessRule__Group__3__Impl3700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__4__Impl_in_rule__BusinessRule__Group__43731 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__5_in_rule__BusinessRule__Group__43734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__TypAssignment_4_in_rule__BusinessRule__Group__4__Impl3761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__5__Impl_in_rule__BusinessRule__Group__53791 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__6_in_rule__BusinessRule__Group__53794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__BusinessRule__Group__5__Impl3822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__6__Impl_in_rule__BusinessRule__Group__63853 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__7_in_rule__BusinessRule__Group__63856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__BusinessRule__Group__6__Impl3884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__7__Impl_in_rule__BusinessRule__Group__73915 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__8_in_rule__BusinessRule__Group__73918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__BusinessRule__Group__7__Impl3946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__8__Impl_in_rule__BusinessRule__Group__83977 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__9_in_rule__BusinessRule__Group__83980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__InputsAssignment_8_in_rule__BusinessRule__Group__8__Impl4007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__9__Impl_in_rule__BusinessRule__Group__94037 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__10_in_rule__BusinessRule__Group__94040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group_9__0_in_rule__BusinessRule__Group__9__Impl4067 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__10__Impl_in_rule__BusinessRule__Group__104098 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__11_in_rule__BusinessRule__Group__104101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__BusinessRule__Group__10__Impl4129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__11__Impl_in_rule__BusinessRule__Group__114160 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__12_in_rule__BusinessRule__Group__114163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__BusinessRule__Group__11__Impl4191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__12__Impl_in_rule__BusinessRule__Group__124222 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__13_in_rule__BusinessRule__Group__124225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__BusinessRule__Group__12__Impl4253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__13__Impl_in_rule__BusinessRule__Group__134284 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__14_in_rule__BusinessRule__Group__134287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__OutputAssignment_13_in_rule__BusinessRule__Group__13__Impl4314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__14__Impl_in_rule__BusinessRule__Group__144344 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__15_in_rule__BusinessRule__Group__144347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__BusinessRule__Group__14__Impl4375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__15__Impl_in_rule__BusinessRule__Group__154406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__BusinessRule__Group__15__Impl4434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group_9__0__Impl_in_rule__BusinessRule__Group_9__04497 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group_9__1_in_rule__BusinessRule__Group_9__04500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__BusinessRule__Group_9__0__Impl4528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group_9__1__Impl_in_rule__BusinessRule__Group_9__14559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__InputsAssignment_9_1_in_rule__BusinessRule__Group_9__1__Impl4586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BreEntityInput__Group__0__Impl_in_rule__BreEntityInput__Group__04620 = new BitSet(new long[]{0x0018000000600000L});
    public static final BitSet FOLLOW_rule__BreEntityInput__Group__1_in_rule__BreEntityInput__Group__04623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BreEntityInput__InputElementAssignment_0_in_rule__BreEntityInput__Group__0__Impl4650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BreEntityInput__Group__1__Impl_in_rule__BreEntityInput__Group__14680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BreEntityInput__ConfigurationAssignment_1_in_rule__BreEntityInput__Group__1__Impl4707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group_0__0__Impl_in_rule__EntityConfiguration__Group_0__04741 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group_0__1_in_rule__EntityConfiguration__Group_0__04744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__EntityConfiguration__Group_0__0__Impl4772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group_0__1__Impl_in_rule__EntityConfiguration__Group_0__14803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__PrimaryAssignment_0_1_in_rule__EntityConfiguration__Group_0__1__Impl4830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group_2__0__Impl_in_rule__EntityConfiguration__Group_2__04865 = new BitSet(new long[]{0x0018000000600000L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group_2__1_in_rule__EntityConfiguration__Group_2__04868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__MultipleAssignment_2_0_in_rule__EntityConfiguration__Group_2__0__Impl4895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group_2__1__Impl_in_rule__EntityConfiguration__Group_2__14926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EntityConfiguration__Group_2__1__Impl4954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__0__Impl_in_rule__System__Group__04989 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__System__Group__1_in_rule__System__Group__04992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__System__Group__0__Impl5020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__1__Impl_in_rule__System__Group__15051 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__System__Group__2_in_rule__System__Group__15054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__NameAssignment_1_in_rule__System__Group__1__Impl5081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__2__Impl_in_rule__System__Group__25111 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__System__Group__3_in_rule__System__Group__25114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__System__Group__2__Impl5142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__3__Impl_in_rule__System__Group__35173 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__System__Group__4_in_rule__System__Group__35176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__SrcEntitiesAssignment_3_in_rule__System__Group__3__Impl5203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__4__Impl_in_rule__System__Group__45233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__System__Group__4__Impl5261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntity__Group__0__Impl_in_rule__SystemEntity__Group__05302 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SystemEntity__Group__1_in_rule__SystemEntity__Group__05305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__SystemEntity__Group__0__Impl5333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntity__Group__1__Impl_in_rule__SystemEntity__Group__15364 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__SystemEntity__Group__2_in_rule__SystemEntity__Group__15367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntity__NameAssignment_1_in_rule__SystemEntity__Group__1__Impl5394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntity__Group__2__Impl_in_rule__SystemEntity__Group__25424 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SystemEntity__Group__3_in_rule__SystemEntity__Group__25427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__SystemEntity__Group__2__Impl5455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntity__Group__3__Impl_in_rule__SystemEntity__Group__35486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntity__FormatAssignment_3_in_rule__SystemEntity__Group__3__Impl5513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__05551 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__05554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Import__Group__0__Impl5582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__15613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl5640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FqnWithWildCard__Group__0__Impl_in_rule__FqnWithWildCard__Group__05674 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__FqnWithWildCard__Group__1_in_rule__FqnWithWildCard__Group__05677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__FqnWithWildCard__Group__0__Impl5704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FqnWithWildCard__Group__1__Impl_in_rule__FqnWithWildCard__Group__15733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__FqnWithWildCard__Group__1__Impl5762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Diagram__Group__0__Impl_in_rule__Diagram__Group__05799 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Diagram__Group__1_in_rule__Diagram__Group__05802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Diagram__ImportsAssignment_0_in_rule__Diagram__Group__0__Impl5829 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__Diagram__Group__1__Impl_in_rule__Diagram__Group__15860 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Diagram__Group__2_in_rule__Diagram__Group__15863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Diagram__Group__1__Impl5891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Diagram__Group__2__Impl_in_rule__Diagram__Group__25922 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Diagram__Group__3_in_rule__Diagram__Group__25925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Diagram__NameAssignment_2_in_rule__Diagram__Group__2__Impl5952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Diagram__Group__3__Impl_in_rule__Diagram__Group__35982 = new BitSet(new long[]{0x0000000000401800L});
    public static final BitSet FOLLOW_rule__Diagram__Group__4_in_rule__Diagram__Group__35985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Diagram__Group__3__Impl6013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Diagram__Group__4__Impl_in_rule__Diagram__Group__46044 = new BitSet(new long[]{0x0000000000401800L});
    public static final BitSet FOLLOW_rule__Diagram__Group__5_in_rule__Diagram__Group__46047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Diagram__IncludesAssignment_4_in_rule__Diagram__Group__4__Impl6074 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_rule__Diagram__Group__5__Impl_in_rule__Diagram__Group__56105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Diagram__Group__5__Impl6133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__0__Impl_in_rule__Include__Group__06176 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Include__Group__1_in_rule__Include__Group__06179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__IncludeAssignment_0_in_rule__Include__Group__0__Impl6206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__1__Impl_in_rule__Include__Group__16236 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Include__Group__2_in_rule__Include__Group__16239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__EntityAssignment_1_in_rule__Include__Group__1__Impl6266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__2__Impl_in_rule__Include__Group__26296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group_2__0_in_rule__Include__Group__2__Impl6323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group_2__0__Impl_in_rule__Include__Group_2__06359 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Include__Group_2__1_in_rule__Include__Group_2__06362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Include__Group_2__0__Impl6390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group_2__1__Impl_in_rule__Include__Group_2__16421 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Include__Group_2__2_in_rule__Include__Group_2__16424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Include__Group_2__1__Impl6452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group_2__2__Impl_in_rule__Include__Group_2__26483 = new BitSet(new long[]{0x0000000010400000L});
    public static final BitSet FOLLOW_rule__Include__Group_2__3_in_rule__Include__Group_2__26486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__FieldsAssignment_2_2_in_rule__Include__Group_2__2__Impl6513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group_2__3__Impl_in_rule__Include__Group_2__36543 = new BitSet(new long[]{0x0000000010400000L});
    public static final BitSet FOLLOW_rule__Include__Group_2__4_in_rule__Include__Group_2__36546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group_2_3__0_in_rule__Include__Group_2__3__Impl6573 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__Include__Group_2__4__Impl_in_rule__Include__Group_2__46604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Include__Group_2__4__Impl6632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group_2_3__0__Impl_in_rule__Include__Group_2_3__06673 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Include__Group_2_3__1_in_rule__Include__Group_2_3__06676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Include__Group_2_3__0__Impl6704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group_2_3__1__Impl_in_rule__Include__Group_2_3__16735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__FieldsAssignment_2_3_1_in_rule__Include__Group_2_3__1__Impl6762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__0__Impl_in_rule__EnumDeclaration__Group__06796 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__1_in_rule__EnumDeclaration__Group__06799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__EnumDeclaration__Group__0__Impl6827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__1__Impl_in_rule__EnumDeclaration__Group__16858 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__2_in_rule__EnumDeclaration__Group__16861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__NameAssignment_1_in_rule__EnumDeclaration__Group__1__Impl6888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__2__Impl_in_rule__EnumDeclaration__Group__26918 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__3_in_rule__EnumDeclaration__Group__26921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__EnumDeclaration__Group__2__Impl6949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__3__Impl_in_rule__EnumDeclaration__Group__36980 = new BitSet(new long[]{0x0000000010400000L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__4_in_rule__EnumDeclaration__Group__36983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__ValuesAssignment_3_in_rule__EnumDeclaration__Group__3__Impl7010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__4__Impl_in_rule__EnumDeclaration__Group__47040 = new BitSet(new long[]{0x0000000010400000L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__5_in_rule__EnumDeclaration__Group__47043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group_4__0_in_rule__EnumDeclaration__Group__4__Impl7070 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__5__Impl_in_rule__EnumDeclaration__Group__57101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EnumDeclaration__Group__5__Impl7129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group_4__0__Impl_in_rule__EnumDeclaration__Group_4__07172 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group_4__1_in_rule__EnumDeclaration__Group_4__07175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__EnumDeclaration__Group_4__0__Impl7203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group_4__1__Impl_in_rule__EnumDeclaration__Group_4__17234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumDeclaration__Group_4__1__Impl7261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__07294 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__07297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl7324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__17353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl7380 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__07415 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__07418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__FQN__Group_1__0__Impl7446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__17477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl7504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__07537 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__07540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Entity__Group__0__Impl7568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__17599 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__17602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl7629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__27659 = new BitSet(new long[]{0x0001400000400000L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__27662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Entity__Group__2__Impl7690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__37721 = new BitSet(new long[]{0x0001400000400000L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__37724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__PropertiesAssignment_3_in_rule__Entity__Group__3__Impl7751 = new BitSet(new long[]{0x0001400000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__47782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Entity__Group__4__Impl7810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__0__Impl_in_rule__Domain__Group__07851 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__Domain__Group__1_in_rule__Domain__Group__07854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__ImportsAssignment_0_in_rule__Domain__Group__0__Impl7881 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__1__Impl_in_rule__Domain__Group__17912 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Domain__Group__2_in_rule__Domain__Group__17915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Domain__Group__1__Impl7943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__2__Impl_in_rule__Domain__Group__27974 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__Domain__Group__3_in_rule__Domain__Group__27977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__NameAssignment_2_in_rule__Domain__Group__2__Impl8004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__3__Impl_in_rule__Domain__Group__38034 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Domain__Group__4_in_rule__Domain__Group__38037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Domain__Group__3__Impl8065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__4__Impl_in_rule__Domain__Group__48096 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Domain__Group__5_in_rule__Domain__Group__48099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__DescriptionAssignment_4_in_rule__Domain__Group__4__Impl8126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__5__Impl_in_rule__Domain__Group__58156 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Domain__Group__6_in_rule__Domain__Group__58159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Domain__Group__5__Impl8187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__6__Impl_in_rule__Domain__Group__68218 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Domain__Group__7_in_rule__Domain__Group__68221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__EntitiesAssignment_6_in_rule__Domain__Group__6__Impl8250 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_rule__Domain__EntitiesAssignment_6_in_rule__Domain__Group__6__Impl8262 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__7__Impl_in_rule__Domain__Group__78295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Domain__Group__7__Impl8323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group__0__Impl_in_rule__Association__Group__08370 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Association__Group__1_in_rule__Association__Group__08373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Association__Group__0__Impl8401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group__1__Impl_in_rule__Association__Group__18432 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__Association__Group__2_in_rule__Association__Group__18435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__NameAssignment_1_in_rule__Association__Group__1__Impl8462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group__2__Impl_in_rule__Association__Group__28492 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Association__Group__3_in_rule__Association__Group__28495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Association__Group__2__Impl8523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group__3__Impl_in_rule__Association__Group__38554 = new BitSet(new long[]{0x00000000000F0000L});
    public static final BitSet FOLLOW_rule__Association__Group__4_in_rule__Association__Group__38557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__TypeAssignment_3_in_rule__Association__Group__3__Impl8584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group__4__Impl_in_rule__Association__Group__48614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__MultiplicityAssignment_4_in_rule__Association__Group__4__Impl8641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__08681 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Field__Group__1_in_rule__Field__Group__08684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Field__Group__0__Impl8712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__18743 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__Field__Group__2_in_rule__Field__Group__18746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__NameAssignment_1_in_rule__Field__Group__1__Impl8773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__28803 = new BitSet(new long[]{0x03E2000000000000L});
    public static final BitSet FOLLOW_rule__Field__Group__3_in_rule__Field__Group__28806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Field__Group__2__Impl8834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__38865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__LiteralAssignment_3_in_rule__Field__Group__3__Impl8892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_0__0__Impl_in_rule__Literal__Group_0__08930 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__Literal__Group_0__1_in_rule__Literal__Group_0__08933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_0__1__Impl_in_rule__Literal__Group_0__18991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__NameAssignment_0_1_in_rule__Literal__Group_0__1__Impl9018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_1__0__Impl_in_rule__Literal__Group_1__09052 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__Literal__Group_1__1_in_rule__Literal__Group_1__09055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_1__1__Impl_in_rule__Literal__Group_1__19113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__NameAssignment_1_1_in_rule__Literal__Group_1__1__Impl9140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_2__0__Impl_in_rule__Literal__Group_2__09174 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_rule__Literal__Group_2__1_in_rule__Literal__Group_2__09177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_2__1__Impl_in_rule__Literal__Group_2__19235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__NameAssignment_2_1_in_rule__Literal__Group_2__1__Impl9262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_3__0__Impl_in_rule__Literal__Group_3__09296 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__Literal__Group_3__1_in_rule__Literal__Group_3__09299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_3__1__Impl_in_rule__Literal__Group_3__19357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__NameAssignment_3_1_in_rule__Literal__Group_3__1__Impl9384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_4__0__Impl_in_rule__Literal__Group_4__09418 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_rule__Literal__Group_4__1_in_rule__Literal__Group_4__09421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_4__1__Impl_in_rule__Literal__Group_4__19479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__NameAssignment_4_1_in_rule__Literal__Group_4__1__Impl9506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__0__Impl_in_rule__Enum__Group__09540 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__09543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Enum__Group__0__Impl9571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__1__Impl_in_rule__Enum__Group__19602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__TypeAssignment_1_in_rule__Enum__Group__1__Impl9629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__UnorderedGroup__0_in_rule__EntityConfiguration__UnorderedGroup9664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group_0__0_in_rule__EntityConfiguration__UnorderedGroup__Impl9753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__ObligatoryAssignment_1_in_rule__EntityConfiguration__UnorderedGroup__Impl9844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group_2__0_in_rule__EntityConfiguration__UnorderedGroup__Impl9935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__UnorderedGroup__Impl_in_rule__EntityConfiguration__UnorderedGroup__09994 = new BitSet(new long[]{0x0018000000600002L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__UnorderedGroup__1_in_rule__EntityConfiguration__UnorderedGroup__09997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__UnorderedGroup__Impl_in_rule__EntityConfiguration__UnorderedGroup__110022 = new BitSet(new long[]{0x0018000000600002L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__UnorderedGroup__2_in_rule__EntityConfiguration__UnorderedGroup__110025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__UnorderedGroup__Impl_in_rule__EntityConfiguration__UnorderedGroup__210050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_rule__Model__ElementsAssignment10084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Flow__ImportsAssignment_010115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Flow__NameAssignment_210146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_rule__Flow__ActivitiesAssignment_410177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Activity__NameAssignment_110208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Activity__SucessorsAssignment_3_210243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Activity__SucessorsAssignment_3_3_110282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Activity__BusinessRuleAssignment_4_110321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Activity__DescriptionAssignment_610356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__BusinessRule__ImportsAssignment_010387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BusinessRule__NameAssignment_210418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBREType_in_rule__BusinessRule__TypAssignment_410449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreEntityInput_in_rule__BusinessRule__InputsAssignment_810480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreEntityInput_in_rule__BusinessRule__InputsAssignment_9_110511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreOutPutReference_in_rule__BusinessRule__OutputAssignment_1310542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__BreOutPutReference__OutputAssignment10577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__BreEntityInput__InputElementAssignment_010616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityConfiguration_in_rule__BreEntityInput__ConfigurationAssignment_110651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__EntityConfiguration__PrimaryAssignment_0_110687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__EntityConfiguration__ObligatoryAssignment_110731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__EntityConfiguration__MultipleAssignment_2_010775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__System__NameAssignment_110814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystemEntity_in_rule__System__SrcEntitiesAssignment_310845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SystemEntity__NameAssignment_110876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SystemEntity__FormatAssignment_310907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFqnWithWildCard_in_rule__Import__ImportedNamespaceAssignment_110938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Diagram__ImportsAssignment_010969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Diagram__NameAssignment_211000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_rule__Diagram__IncludesAssignment_411031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__IncludeAlternatives_0_0_in_rule__Include__IncludeAssignment_011062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Include__EntityAssignment_111099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Include__FieldsAssignment_2_211138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Include__FieldsAssignment_2_3_111177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumDeclaration__NameAssignment_111212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumDeclaration__ValuesAssignment_311243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_111274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__Entity__PropertiesAssignment_311305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Domain__ImportsAssignment_011336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Domain__NameAssignment_211367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Domain__DescriptionAssignment_411398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Domain__EntitiesAssignment_611429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Association__NameAssignment_111460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Association__TypeAssignment_311495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicty_in_rule__Association__MultiplicityAssignment_411530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Field__NameAssignment_111561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__Field__LiteralAssignment_311592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__Literal__NameAssignment_0_111628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Literal__NameAssignment_1_111672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__Literal__NameAssignment_2_111716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__Literal__NameAssignment_3_111760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__Literal__NameAssignment_4_111804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Enum__TypeAssignment_111847 = new BitSet(new long[]{0x0000000000000002L});

}
