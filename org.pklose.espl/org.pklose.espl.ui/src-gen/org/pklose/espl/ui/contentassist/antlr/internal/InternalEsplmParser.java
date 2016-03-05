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
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalEsplmParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Include'", "'Exclude'", "'J'", "'F'", "'BizToBiz'", "'SrcToBiz'", "'BizToOut'", "'1..N'", "'0..N'", "'1'", "'Flow'", "'{'", "'}'", "'Activity'", "'Description'", "'\"'", "'Successors'", "'['", "']'", "','", "'Calls'", "'BusinessRule'", "'type'", "'Input'", "'Output'", "'prim\\u00E4r'", "'='", "'obligatorisch'", "'mehrfach'", "'join Pfad'", "'Pfad'", "'SourceSystem'", "'Name'", "'Format'", "'Import'", "'.*'", "'Diagram'", "'with'", "'Enumeration'", "'.'", "'Entity'", "'Domain'", "'Description: '", "'Relation'", "':'", "'Field'", "'Enum'", "'Decimal'", "'Money'", "'Text'", "'Boolean'", "'Int'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__62=62;
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:61:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:62:1: ( ruleModel EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:63:1: ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel67);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel74); if (state.failed) return ;

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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:70:1: ruleModel : ( ( rule__Model__ElementsAssignment ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:74:2: ( ( ( rule__Model__ElementsAssignment ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:75:1: ( ( rule__Model__ElementsAssignment ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:75:1: ( ( rule__Model__ElementsAssignment ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:76:1: ( rule__Model__ElementsAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getElementsAssignment()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:77:1: ( rule__Model__ElementsAssignment )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:77:2: rule__Model__ElementsAssignment
            {
            pushFollow(FOLLOW_rule__Model__ElementsAssignment_in_ruleModel100);
            rule__Model__ElementsAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getElementsAssignment()); 
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleElement"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:89:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:90:1: ( ruleElement EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:91:1: ruleElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementRule()); 
            }
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement127);
            ruleElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement134); if (state.failed) return ;

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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:98:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:102:2: ( ( ( rule__Element__Alternatives ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:103:1: ( ( rule__Element__Alternatives ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:103:1: ( ( rule__Element__Alternatives ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:104:1: ( rule__Element__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementAccess().getAlternatives()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:105:1: ( rule__Element__Alternatives )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:105:2: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_rule__Element__Alternatives_in_ruleElement160);
            rule__Element__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementAccess().getAlternatives()); 
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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleFlow"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:117:1: entryRuleFlow : ruleFlow EOF ;
    public final void entryRuleFlow() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:118:1: ( ruleFlow EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:119:1: ruleFlow EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFlowRule()); 
            }
            pushFollow(FOLLOW_ruleFlow_in_entryRuleFlow187);
            ruleFlow();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFlowRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFlow194); if (state.failed) return ;

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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:126:1: ruleFlow : ( ( rule__Flow__Group__0 ) ) ;
    public final void ruleFlow() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:130:2: ( ( ( rule__Flow__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:131:1: ( ( rule__Flow__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:131:1: ( ( rule__Flow__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:132:1: ( rule__Flow__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFlowAccess().getGroup()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:133:1: ( rule__Flow__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:133:2: rule__Flow__Group__0
            {
            pushFollow(FOLLOW_rule__Flow__Group__0_in_ruleFlow220);
            rule__Flow__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFlowAccess().getGroup()); 
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
    // $ANTLR end "ruleFlow"


    // $ANTLR start "entryRuleActivity"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:145:1: entryRuleActivity : ruleActivity EOF ;
    public final void entryRuleActivity() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:146:1: ( ruleActivity EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:147:1: ruleActivity EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityRule()); 
            }
            pushFollow(FOLLOW_ruleActivity_in_entryRuleActivity247);
            ruleActivity();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleActivity254); if (state.failed) return ;

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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:154:1: ruleActivity : ( ( rule__Activity__Group__0 ) ) ;
    public final void ruleActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:158:2: ( ( ( rule__Activity__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:159:1: ( ( rule__Activity__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:159:1: ( ( rule__Activity__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:160:1: ( rule__Activity__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getGroup()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:161:1: ( rule__Activity__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:161:2: rule__Activity__Group__0
            {
            pushFollow(FOLLOW_rule__Activity__Group__0_in_ruleActivity280);
            rule__Activity__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getGroup()); 
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
    // $ANTLR end "ruleActivity"


    // $ANTLR start "entryRuleBusinessRule"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:173:1: entryRuleBusinessRule : ruleBusinessRule EOF ;
    public final void entryRuleBusinessRule() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:174:1: ( ruleBusinessRule EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:175:1: ruleBusinessRule EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBusinessRuleRule()); 
            }
            pushFollow(FOLLOW_ruleBusinessRule_in_entryRuleBusinessRule307);
            ruleBusinessRule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBusinessRuleRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBusinessRule314); if (state.failed) return ;

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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:182:1: ruleBusinessRule : ( ( rule__BusinessRule__Group__0 ) ) ;
    public final void ruleBusinessRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:186:2: ( ( ( rule__BusinessRule__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:187:1: ( ( rule__BusinessRule__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:187:1: ( ( rule__BusinessRule__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:188:1: ( rule__BusinessRule__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBusinessRuleAccess().getGroup()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:189:1: ( rule__BusinessRule__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:189:2: rule__BusinessRule__Group__0
            {
            pushFollow(FOLLOW_rule__BusinessRule__Group__0_in_ruleBusinessRule340);
            rule__BusinessRule__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBusinessRuleAccess().getGroup()); 
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
    // $ANTLR end "ruleBusinessRule"


    // $ANTLR start "entryRuleBreSystemEntityInput"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:201:1: entryRuleBreSystemEntityInput : ruleBreSystemEntityInput EOF ;
    public final void entryRuleBreSystemEntityInput() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:202:1: ( ruleBreSystemEntityInput EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:203:1: ruleBreSystemEntityInput EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBreSystemEntityInputRule()); 
            }
            pushFollow(FOLLOW_ruleBreSystemEntityInput_in_entryRuleBreSystemEntityInput367);
            ruleBreSystemEntityInput();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBreSystemEntityInputRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBreSystemEntityInput374); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBreSystemEntityInput"


    // $ANTLR start "ruleBreSystemEntityInput"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:210:1: ruleBreSystemEntityInput : ( ( rule__BreSystemEntityInput__Group__0 ) ) ;
    public final void ruleBreSystemEntityInput() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:214:2: ( ( ( rule__BreSystemEntityInput__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:215:1: ( ( rule__BreSystemEntityInput__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:215:1: ( ( rule__BreSystemEntityInput__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:216:1: ( rule__BreSystemEntityInput__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBreSystemEntityInputAccess().getGroup()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:217:1: ( rule__BreSystemEntityInput__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:217:2: rule__BreSystemEntityInput__Group__0
            {
            pushFollow(FOLLOW_rule__BreSystemEntityInput__Group__0_in_ruleBreSystemEntityInput400);
            rule__BreSystemEntityInput__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBreSystemEntityInputAccess().getGroup()); 
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
    // $ANTLR end "ruleBreSystemEntityInput"


    // $ANTLR start "entryRuleBreEntityInput"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:229:1: entryRuleBreEntityInput : ruleBreEntityInput EOF ;
    public final void entryRuleBreEntityInput() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:230:1: ( ruleBreEntityInput EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:231:1: ruleBreEntityInput EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBreEntityInputRule()); 
            }
            pushFollow(FOLLOW_ruleBreEntityInput_in_entryRuleBreEntityInput427);
            ruleBreEntityInput();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBreEntityInputRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBreEntityInput434); if (state.failed) return ;

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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:238:1: ruleBreEntityInput : ( ( rule__BreEntityInput__Group__0 ) ) ;
    public final void ruleBreEntityInput() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:242:2: ( ( ( rule__BreEntityInput__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:243:1: ( ( rule__BreEntityInput__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:243:1: ( ( rule__BreEntityInput__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:244:1: ( rule__BreEntityInput__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBreEntityInputAccess().getGroup()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:245:1: ( rule__BreEntityInput__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:245:2: rule__BreEntityInput__Group__0
            {
            pushFollow(FOLLOW_rule__BreEntityInput__Group__0_in_ruleBreEntityInput460);
            rule__BreEntityInput__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBreEntityInputAccess().getGroup()); 
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
    // $ANTLR end "ruleBreEntityInput"


    // $ANTLR start "entryRuleSystemEntityConfiguration"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:257:1: entryRuleSystemEntityConfiguration : ruleSystemEntityConfiguration EOF ;
    public final void entryRuleSystemEntityConfiguration() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:258:1: ( ruleSystemEntityConfiguration EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:259:1: ruleSystemEntityConfiguration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemEntityConfigurationRule()); 
            }
            pushFollow(FOLLOW_ruleSystemEntityConfiguration_in_entryRuleSystemEntityConfiguration487);
            ruleSystemEntityConfiguration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemEntityConfigurationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSystemEntityConfiguration494); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSystemEntityConfiguration"


    // $ANTLR start "ruleSystemEntityConfiguration"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:266:1: ruleSystemEntityConfiguration : ( ( rule__SystemEntityConfiguration__Group__0 ) ) ;
    public final void ruleSystemEntityConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:270:2: ( ( ( rule__SystemEntityConfiguration__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:271:1: ( ( rule__SystemEntityConfiguration__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:271:1: ( ( rule__SystemEntityConfiguration__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:272:1: ( rule__SystemEntityConfiguration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemEntityConfigurationAccess().getGroup()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:273:1: ( rule__SystemEntityConfiguration__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:273:2: rule__SystemEntityConfiguration__Group__0
            {
            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group__0_in_ruleSystemEntityConfiguration520);
            rule__SystemEntityConfiguration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemEntityConfigurationAccess().getGroup()); 
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
    // $ANTLR end "ruleSystemEntityConfiguration"


    // $ANTLR start "entryRuleEntityConfiguration"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:285:1: entryRuleEntityConfiguration : ruleEntityConfiguration EOF ;
    public final void entryRuleEntityConfiguration() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:286:1: ( ruleEntityConfiguration EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:287:1: ruleEntityConfiguration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityConfigurationRule()); 
            }
            pushFollow(FOLLOW_ruleEntityConfiguration_in_entryRuleEntityConfiguration547);
            ruleEntityConfiguration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityConfigurationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityConfiguration554); if (state.failed) return ;

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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:294:1: ruleEntityConfiguration : ( ( rule__EntityConfiguration__Group__0 ) ) ;
    public final void ruleEntityConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:298:2: ( ( ( rule__EntityConfiguration__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:299:1: ( ( rule__EntityConfiguration__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:299:1: ( ( rule__EntityConfiguration__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:300:1: ( rule__EntityConfiguration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityConfigurationAccess().getGroup()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:301:1: ( rule__EntityConfiguration__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:301:2: rule__EntityConfiguration__Group__0
            {
            pushFollow(FOLLOW_rule__EntityConfiguration__Group__0_in_ruleEntityConfiguration580);
            rule__EntityConfiguration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityConfigurationAccess().getGroup()); 
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
    // $ANTLR end "ruleEntityConfiguration"


    // $ANTLR start "entryRuleSystem"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:313:1: entryRuleSystem : ruleSystem EOF ;
    public final void entryRuleSystem() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:314:1: ( ruleSystem EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:315:1: ruleSystem EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemRule()); 
            }
            pushFollow(FOLLOW_ruleSystem_in_entryRuleSystem607);
            ruleSystem();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSystem614); if (state.failed) return ;

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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:322:1: ruleSystem : ( ( rule__System__Group__0 ) ) ;
    public final void ruleSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:326:2: ( ( ( rule__System__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:327:1: ( ( rule__System__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:327:1: ( ( rule__System__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:328:1: ( rule__System__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getGroup()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:329:1: ( rule__System__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:329:2: rule__System__Group__0
            {
            pushFollow(FOLLOW_rule__System__Group__0_in_ruleSystem640);
            rule__System__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getGroup()); 
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
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleSystemEntity"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:341:1: entryRuleSystemEntity : ruleSystemEntity EOF ;
    public final void entryRuleSystemEntity() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:342:1: ( ruleSystemEntity EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:343:1: ruleSystemEntity EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemEntityRule()); 
            }
            pushFollow(FOLLOW_ruleSystemEntity_in_entryRuleSystemEntity667);
            ruleSystemEntity();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemEntityRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSystemEntity674); if (state.failed) return ;

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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:350:1: ruleSystemEntity : ( ( rule__SystemEntity__Group__0 ) ) ;
    public final void ruleSystemEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:354:2: ( ( ( rule__SystemEntity__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:355:1: ( ( rule__SystemEntity__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:355:1: ( ( rule__SystemEntity__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:356:1: ( rule__SystemEntity__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemEntityAccess().getGroup()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:357:1: ( rule__SystemEntity__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:357:2: rule__SystemEntity__Group__0
            {
            pushFollow(FOLLOW_rule__SystemEntity__Group__0_in_ruleSystemEntity700);
            rule__SystemEntity__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemEntityAccess().getGroup()); 
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
    // $ANTLR end "ruleSystemEntity"


    // $ANTLR start "entryRuleImport"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:369:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:370:1: ( ruleImport EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:371:1: ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport727);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport734); if (state.failed) return ;

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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:378:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:382:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:383:1: ( ( rule__Import__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:383:1: ( ( rule__Import__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:384:1: ( rule__Import__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getGroup()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:385:1: ( rule__Import__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:385:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport760);
            rule__Import__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getGroup()); 
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleFqnWithWildCard"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:397:1: entryRuleFqnWithWildCard : ruleFqnWithWildCard EOF ;
    public final void entryRuleFqnWithWildCard() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:398:1: ( ruleFqnWithWildCard EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:399:1: ruleFqnWithWildCard EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFqnWithWildCardRule()); 
            }
            pushFollow(FOLLOW_ruleFqnWithWildCard_in_entryRuleFqnWithWildCard787);
            ruleFqnWithWildCard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFqnWithWildCardRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFqnWithWildCard794); if (state.failed) return ;

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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:406:1: ruleFqnWithWildCard : ( ( rule__FqnWithWildCard__Group__0 ) ) ;
    public final void ruleFqnWithWildCard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:410:2: ( ( ( rule__FqnWithWildCard__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:411:1: ( ( rule__FqnWithWildCard__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:411:1: ( ( rule__FqnWithWildCard__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:412:1: ( rule__FqnWithWildCard__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFqnWithWildCardAccess().getGroup()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:413:1: ( rule__FqnWithWildCard__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:413:2: rule__FqnWithWildCard__Group__0
            {
            pushFollow(FOLLOW_rule__FqnWithWildCard__Group__0_in_ruleFqnWithWildCard820);
            rule__FqnWithWildCard__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFqnWithWildCardAccess().getGroup()); 
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
    // $ANTLR end "ruleFqnWithWildCard"


    // $ANTLR start "entryRuleDiagram"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:425:1: entryRuleDiagram : ruleDiagram EOF ;
    public final void entryRuleDiagram() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:426:1: ( ruleDiagram EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:427:1: ruleDiagram EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDiagramRule()); 
            }
            pushFollow(FOLLOW_ruleDiagram_in_entryRuleDiagram847);
            ruleDiagram();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDiagramRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDiagram854); if (state.failed) return ;

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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:434:1: ruleDiagram : ( ( rule__Diagram__Group__0 ) ) ;
    public final void ruleDiagram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:438:2: ( ( ( rule__Diagram__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:439:1: ( ( rule__Diagram__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:439:1: ( ( rule__Diagram__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:440:1: ( rule__Diagram__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDiagramAccess().getGroup()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:441:1: ( rule__Diagram__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:441:2: rule__Diagram__Group__0
            {
            pushFollow(FOLLOW_rule__Diagram__Group__0_in_ruleDiagram880);
            rule__Diagram__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDiagramAccess().getGroup()); 
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
    // $ANTLR end "ruleDiagram"


    // $ANTLR start "entryRuleInclude"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:453:1: entryRuleInclude : ruleInclude EOF ;
    public final void entryRuleInclude() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:454:1: ( ruleInclude EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:455:1: ruleInclude EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIncludeRule()); 
            }
            pushFollow(FOLLOW_ruleInclude_in_entryRuleInclude907);
            ruleInclude();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIncludeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInclude914); if (state.failed) return ;

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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:462:1: ruleInclude : ( ( rule__Include__Group__0 ) ) ;
    public final void ruleInclude() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:466:2: ( ( ( rule__Include__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:467:1: ( ( rule__Include__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:467:1: ( ( rule__Include__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:468:1: ( rule__Include__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIncludeAccess().getGroup()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:469:1: ( rule__Include__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:469:2: rule__Include__Group__0
            {
            pushFollow(FOLLOW_rule__Include__Group__0_in_ruleInclude940);
            rule__Include__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIncludeAccess().getGroup()); 
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
    // $ANTLR end "ruleInclude"


    // $ANTLR start "entryRuleEnumDeclaration"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:481:1: entryRuleEnumDeclaration : ruleEnumDeclaration EOF ;
    public final void entryRuleEnumDeclaration() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:482:1: ( ruleEnumDeclaration EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:483:1: ruleEnumDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleEnumDeclaration_in_entryRuleEnumDeclaration967);
            ruleEnumDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumDeclaration974); if (state.failed) return ;

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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:490:1: ruleEnumDeclaration : ( ( rule__EnumDeclaration__Group__0 ) ) ;
    public final void ruleEnumDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:494:2: ( ( ( rule__EnumDeclaration__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:495:1: ( ( rule__EnumDeclaration__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:495:1: ( ( rule__EnumDeclaration__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:496:1: ( rule__EnumDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumDeclarationAccess().getGroup()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:497:1: ( rule__EnumDeclaration__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:497:2: rule__EnumDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__EnumDeclaration__Group__0_in_ruleEnumDeclaration1000);
            rule__EnumDeclaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumDeclarationAccess().getGroup()); 
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
    // $ANTLR end "ruleEnumDeclaration"


    // $ANTLR start "entryRuleFQN"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:509:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:510:1: ( ruleFQN EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:511:1: ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN1027);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFQNRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN1034); if (state.failed) return ;

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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:518:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:522:2: ( ( ( rule__FQN__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:523:1: ( ( rule__FQN__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:523:1: ( ( rule__FQN__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:524:1: ( rule__FQN__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getGroup()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:525:1: ( rule__FQN__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:525:2: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_rule__FQN__Group__0_in_ruleFQN1060);
            rule__FQN__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFQNAccess().getGroup()); 
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
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleEntity"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:537:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:538:1: ( ruleEntity EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:539:1: ruleEntity EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityRule()); 
            }
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity1087);
            ruleEntity();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity1094); if (state.failed) return ;

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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:546:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:550:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:551:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:551:1: ( ( rule__Entity__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:552:1: ( rule__Entity__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getGroup()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:553:1: ( rule__Entity__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:553:2: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_rule__Entity__Group__0_in_ruleEntity1120);
            rule__Entity__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getGroup()); 
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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleDomain"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:565:1: entryRuleDomain : ruleDomain EOF ;
    public final void entryRuleDomain() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:566:1: ( ruleDomain EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:567:1: ruleDomain EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainRule()); 
            }
            pushFollow(FOLLOW_ruleDomain_in_entryRuleDomain1147);
            ruleDomain();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomain1154); if (state.failed) return ;

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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:574:1: ruleDomain : ( ( rule__Domain__Group__0 ) ) ;
    public final void ruleDomain() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:578:2: ( ( ( rule__Domain__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:579:1: ( ( rule__Domain__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:579:1: ( ( rule__Domain__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:580:1: ( rule__Domain__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getGroup()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:581:1: ( rule__Domain__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:581:2: rule__Domain__Group__0
            {
            pushFollow(FOLLOW_rule__Domain__Group__0_in_ruleDomain1180);
            rule__Domain__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainAccess().getGroup()); 
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
    // $ANTLR end "ruleDomain"


    // $ANTLR start "entryRuleProperty"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:593:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:594:1: ( ruleProperty EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:595:1: ruleProperty EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty1207);
            ruleProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty1214); if (state.failed) return ;

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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:602:1: ruleProperty : ( ( rule__Property__Alternatives ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:606:2: ( ( ( rule__Property__Alternatives ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:607:1: ( ( rule__Property__Alternatives ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:607:1: ( ( rule__Property__Alternatives ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:608:1: ( rule__Property__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getAlternatives()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:609:1: ( rule__Property__Alternatives )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:609:2: rule__Property__Alternatives
            {
            pushFollow(FOLLOW_rule__Property__Alternatives_in_ruleProperty1240);
            rule__Property__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getAlternatives()); 
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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleAssociation"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:621:1: entryRuleAssociation : ruleAssociation EOF ;
    public final void entryRuleAssociation() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:622:1: ( ruleAssociation EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:623:1: ruleAssociation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssociationRule()); 
            }
            pushFollow(FOLLOW_ruleAssociation_in_entryRuleAssociation1267);
            ruleAssociation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssociationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssociation1274); if (state.failed) return ;

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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:630:1: ruleAssociation : ( ( rule__Association__Group__0 ) ) ;
    public final void ruleAssociation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:634:2: ( ( ( rule__Association__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:635:1: ( ( rule__Association__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:635:1: ( ( rule__Association__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:636:1: ( rule__Association__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssociationAccess().getGroup()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:637:1: ( rule__Association__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:637:2: rule__Association__Group__0
            {
            pushFollow(FOLLOW_rule__Association__Group__0_in_ruleAssociation1300);
            rule__Association__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssociationAccess().getGroup()); 
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
    // $ANTLR end "ruleAssociation"


    // $ANTLR start "entryRuleField"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:649:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:650:1: ( ruleField EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:651:1: ruleField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldRule()); 
            }
            pushFollow(FOLLOW_ruleField_in_entryRuleField1327);
            ruleField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleField1334); if (state.failed) return ;

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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:658:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:662:2: ( ( ( rule__Field__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:663:1: ( ( rule__Field__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:663:1: ( ( rule__Field__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:664:1: ( rule__Field__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getGroup()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:665:1: ( rule__Field__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:665:2: rule__Field__Group__0
            {
            pushFollow(FOLLOW_rule__Field__Group__0_in_ruleField1360);
            rule__Field__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getGroup()); 
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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleLiteral"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:677:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:678:1: ( ruleLiteral EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:679:1: ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral1387);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral1394); if (state.failed) return ;

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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:686:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:690:2: ( ( ( rule__Literal__Alternatives ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:691:1: ( ( rule__Literal__Alternatives ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:691:1: ( ( rule__Literal__Alternatives ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:692:1: ( rule__Literal__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getAlternatives()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:693:1: ( rule__Literal__Alternatives )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:693:2: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_rule__Literal__Alternatives_in_ruleLiteral1420);
            rule__Literal__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getAlternatives()); 
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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleEnum"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:705:1: entryRuleEnum : ruleEnum EOF ;
    public final void entryRuleEnum() throws RecognitionException {
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:706:1: ( ruleEnum EOF )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:707:1: ruleEnum EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumRule()); 
            }
            pushFollow(FOLLOW_ruleEnum_in_entryRuleEnum1447);
            ruleEnum();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnum1454); if (state.failed) return ;

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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:714:1: ruleEnum : ( ( rule__Enum__Group__0 ) ) ;
    public final void ruleEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:718:2: ( ( ( rule__Enum__Group__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:719:1: ( ( rule__Enum__Group__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:719:1: ( ( rule__Enum__Group__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:720:1: ( rule__Enum__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getGroup()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:721:1: ( rule__Enum__Group__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:721:2: rule__Enum__Group__0
            {
            pushFollow(FOLLOW_rule__Enum__Group__0_in_ruleEnum1480);
            rule__Enum__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAccess().getGroup()); 
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
    // $ANTLR end "ruleEnum"


    // $ANTLR start "ruleBoolean"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:734:1: ruleBoolean : ( ( rule__Boolean__Alternatives ) ) ;
    public final void ruleBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:738:1: ( ( ( rule__Boolean__Alternatives ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:739:1: ( ( rule__Boolean__Alternatives ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:739:1: ( ( rule__Boolean__Alternatives ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:740:1: ( rule__Boolean__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanAccess().getAlternatives()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:741:1: ( rule__Boolean__Alternatives )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:741:2: rule__Boolean__Alternatives
            {
            pushFollow(FOLLOW_rule__Boolean__Alternatives_in_ruleBoolean1517);
            rule__Boolean__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanAccess().getAlternatives()); 
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
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "ruleBREType"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:753:1: ruleBREType : ( ( rule__BREType__Alternatives ) ) ;
    public final void ruleBREType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:757:1: ( ( ( rule__BREType__Alternatives ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:758:1: ( ( rule__BREType__Alternatives ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:758:1: ( ( rule__BREType__Alternatives ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:759:1: ( rule__BREType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBRETypeAccess().getAlternatives()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:760:1: ( rule__BREType__Alternatives )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:760:2: rule__BREType__Alternatives
            {
            pushFollow(FOLLOW_rule__BREType__Alternatives_in_ruleBREType1553);
            rule__BREType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBRETypeAccess().getAlternatives()); 
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
    // $ANTLR end "ruleBREType"


    // $ANTLR start "ruleMultiplicty"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:772:1: ruleMultiplicty : ( ( rule__Multiplicty__Alternatives ) ) ;
    public final void ruleMultiplicty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:776:1: ( ( ( rule__Multiplicty__Alternatives ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:777:1: ( ( rule__Multiplicty__Alternatives ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:777:1: ( ( rule__Multiplicty__Alternatives ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:778:1: ( rule__Multiplicty__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplictyAccess().getAlternatives()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:779:1: ( rule__Multiplicty__Alternatives )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:779:2: rule__Multiplicty__Alternatives
            {
            pushFollow(FOLLOW_rule__Multiplicty__Alternatives_in_ruleMultiplicty1589);
            rule__Multiplicty__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplictyAccess().getAlternatives()); 
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
    // $ANTLR end "ruleMultiplicty"


    // $ANTLR start "rule__Element__Alternatives"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:790:1: rule__Element__Alternatives : ( ( ruleEnumDeclaration ) | ( ruleDiagram ) | ( ruleDomain ) | ( ruleFlow ) | ( ruleBusinessRule ) | ( ruleSystem ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:794:1: ( ( ruleEnumDeclaration ) | ( ruleDiagram ) | ( ruleDomain ) | ( ruleFlow ) | ( ruleBusinessRule ) | ( ruleSystem ) )
            int alt1=6;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:795:1: ( ruleEnumDeclaration )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:795:1: ( ruleEnumDeclaration )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:796:1: ruleEnumDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementAccess().getEnumDeclarationParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleEnumDeclaration_in_rule__Element__Alternatives1624);
                    ruleEnumDeclaration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementAccess().getEnumDeclarationParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:801:6: ( ruleDiagram )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:801:6: ( ruleDiagram )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:802:1: ruleDiagram
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementAccess().getDiagramParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleDiagram_in_rule__Element__Alternatives1641);
                    ruleDiagram();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementAccess().getDiagramParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:807:6: ( ruleDomain )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:807:6: ( ruleDomain )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:808:1: ruleDomain
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementAccess().getDomainParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleDomain_in_rule__Element__Alternatives1658);
                    ruleDomain();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementAccess().getDomainParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:813:6: ( ruleFlow )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:813:6: ( ruleFlow )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:814:1: ruleFlow
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementAccess().getFlowParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleFlow_in_rule__Element__Alternatives1675);
                    ruleFlow();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementAccess().getFlowParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:819:6: ( ruleBusinessRule )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:819:6: ( ruleBusinessRule )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:820:1: ruleBusinessRule
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementAccess().getBusinessRuleParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleBusinessRule_in_rule__Element__Alternatives1692);
                    ruleBusinessRule();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementAccess().getBusinessRuleParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:825:6: ( ruleSystem )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:825:6: ( ruleSystem )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:826:1: ruleSystem
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementAccess().getSystemParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_ruleSystem_in_rule__Element__Alternatives1709);
                    ruleSystem();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementAccess().getSystemParserRuleCall_5()); 
                    }

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


    // $ANTLR start "rule__BusinessRule__SystemInputsAlternatives_8_0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:836:1: rule__BusinessRule__SystemInputsAlternatives_8_0 : ( ( ruleBreSystemEntityInput ) | ( ruleBreEntityInput ) );
    public final void rule__BusinessRule__SystemInputsAlternatives_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:840:1: ( ( ruleBreSystemEntityInput ) | ( ruleBreEntityInput ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:841:1: ( ruleBreSystemEntityInput )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:841:1: ( ruleBreSystemEntityInput )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:842:1: ruleBreSystemEntityInput
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBusinessRuleAccess().getSystemInputsBreSystemEntityInputParserRuleCall_8_0_0()); 
                    }
                    pushFollow(FOLLOW_ruleBreSystemEntityInput_in_rule__BusinessRule__SystemInputsAlternatives_8_01741);
                    ruleBreSystemEntityInput();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBusinessRuleAccess().getSystemInputsBreSystemEntityInputParserRuleCall_8_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:847:6: ( ruleBreEntityInput )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:847:6: ( ruleBreEntityInput )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:848:1: ruleBreEntityInput
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBusinessRuleAccess().getSystemInputsBreEntityInputParserRuleCall_8_0_1()); 
                    }
                    pushFollow(FOLLOW_ruleBreEntityInput_in_rule__BusinessRule__SystemInputsAlternatives_8_01758);
                    ruleBreEntityInput();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBusinessRuleAccess().getSystemInputsBreEntityInputParserRuleCall_8_0_1()); 
                    }

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
    // $ANTLR end "rule__BusinessRule__SystemInputsAlternatives_8_0"


    // $ANTLR start "rule__Include__IncludeAlternatives_0_0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:858:1: rule__Include__IncludeAlternatives_0_0 : ( ( 'Include' ) | ( 'Exclude' ) );
    public final void rule__Include__IncludeAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:862:1: ( ( 'Include' ) | ( 'Exclude' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:863:1: ( 'Include' )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:863:1: ( 'Include' )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:864:1: 'Include'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIncludeAccess().getIncludeIncludeKeyword_0_0_0()); 
                    }
                    match(input,11,FOLLOW_11_in_rule__Include__IncludeAlternatives_0_01791); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIncludeAccess().getIncludeIncludeKeyword_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:871:6: ( 'Exclude' )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:871:6: ( 'Exclude' )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:872:1: 'Exclude'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIncludeAccess().getIncludeExcludeKeyword_0_0_1()); 
                    }
                    match(input,12,FOLLOW_12_in_rule__Include__IncludeAlternatives_0_01811); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIncludeAccess().getIncludeExcludeKeyword_0_0_1()); 
                    }

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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:884:1: rule__Property__Alternatives : ( ( ruleField ) | ( ruleAssociation ) );
    public final void rule__Property__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:888:1: ( ( ruleField ) | ( ruleAssociation ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==56) ) {
                alt4=1;
            }
            else if ( (LA4_0==54) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:889:1: ( ruleField )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:889:1: ( ruleField )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:890:1: ruleField
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPropertyAccess().getFieldParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleField_in_rule__Property__Alternatives1845);
                    ruleField();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPropertyAccess().getFieldParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:895:6: ( ruleAssociation )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:895:6: ( ruleAssociation )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:896:1: ruleAssociation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPropertyAccess().getAssociationParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleAssociation_in_rule__Property__Alternatives1862);
                    ruleAssociation();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPropertyAccess().getAssociationParserRuleCall_1()); 
                    }

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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:906:1: rule__Literal__Alternatives : ( ( ( rule__Literal__Group_0__0 ) ) | ( ( rule__Literal__Group_1__0 ) ) | ( ( rule__Literal__Group_2__0 ) ) | ( ( rule__Literal__Group_3__0 ) ) | ( ( rule__Literal__Group_4__0 ) ) | ( ruleEnum ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:910:1: ( ( ( rule__Literal__Group_0__0 ) ) | ( ( rule__Literal__Group_1__0 ) ) | ( ( rule__Literal__Group_2__0 ) ) | ( ( rule__Literal__Group_3__0 ) ) | ( ( rule__Literal__Group_4__0 ) ) | ( ruleEnum ) )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt5=1;
                }
                break;
            case 59:
                {
                alt5=2;
                }
                break;
            case 60:
                {
                alt5=3;
                }
                break;
            case 61:
                {
                alt5=4;
                }
                break;
            case 62:
                {
                alt5=5;
                }
                break;
            case 57:
                {
                alt5=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:911:1: ( ( rule__Literal__Group_0__0 ) )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:911:1: ( ( rule__Literal__Group_0__0 ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:912:1: ( rule__Literal__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getGroup_0()); 
                    }
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:913:1: ( rule__Literal__Group_0__0 )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:913:2: rule__Literal__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Literal__Group_0__0_in_rule__Literal__Alternatives1894);
                    rule__Literal__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:917:6: ( ( rule__Literal__Group_1__0 ) )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:917:6: ( ( rule__Literal__Group_1__0 ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:918:1: ( rule__Literal__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getGroup_1()); 
                    }
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:919:1: ( rule__Literal__Group_1__0 )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:919:2: rule__Literal__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Literal__Group_1__0_in_rule__Literal__Alternatives1912);
                    rule__Literal__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:923:6: ( ( rule__Literal__Group_2__0 ) )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:923:6: ( ( rule__Literal__Group_2__0 ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:924:1: ( rule__Literal__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getGroup_2()); 
                    }
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:925:1: ( rule__Literal__Group_2__0 )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:925:2: rule__Literal__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Literal__Group_2__0_in_rule__Literal__Alternatives1930);
                    rule__Literal__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:929:6: ( ( rule__Literal__Group_3__0 ) )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:929:6: ( ( rule__Literal__Group_3__0 ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:930:1: ( rule__Literal__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getGroup_3()); 
                    }
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:931:1: ( rule__Literal__Group_3__0 )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:931:2: rule__Literal__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Literal__Group_3__0_in_rule__Literal__Alternatives1948);
                    rule__Literal__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:935:6: ( ( rule__Literal__Group_4__0 ) )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:935:6: ( ( rule__Literal__Group_4__0 ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:936:1: ( rule__Literal__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getGroup_4()); 
                    }
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:937:1: ( rule__Literal__Group_4__0 )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:937:2: rule__Literal__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Literal__Group_4__0_in_rule__Literal__Alternatives1966);
                    rule__Literal__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getGroup_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:941:6: ( ruleEnum )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:941:6: ( ruleEnum )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:942:1: ruleEnum
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getEnumParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_ruleEnum_in_rule__Literal__Alternatives1984);
                    ruleEnum();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getEnumParserRuleCall_5()); 
                    }

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


    // $ANTLR start "rule__Boolean__Alternatives"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:952:1: rule__Boolean__Alternatives : ( ( ( 'J' ) ) | ( ( 'F' ) ) );
    public final void rule__Boolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:956:1: ( ( ( 'J' ) ) | ( ( 'F' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            else if ( (LA6_0==14) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:957:1: ( ( 'J' ) )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:957:1: ( ( 'J' ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:958:1: ( 'J' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanAccess().getTrueEnumLiteralDeclaration_0()); 
                    }
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:959:1: ( 'J' )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:959:3: 'J'
                    {
                    match(input,13,FOLLOW_13_in_rule__Boolean__Alternatives2017); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanAccess().getTrueEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:964:6: ( ( 'F' ) )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:964:6: ( ( 'F' ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:965:1: ( 'F' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanAccess().getFalseEnumLiteralDeclaration_1()); 
                    }
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:966:1: ( 'F' )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:966:3: 'F'
                    {
                    match(input,14,FOLLOW_14_in_rule__Boolean__Alternatives2038); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanAccess().getFalseEnumLiteralDeclaration_1()); 
                    }

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
    // $ANTLR end "rule__Boolean__Alternatives"


    // $ANTLR start "rule__BREType__Alternatives"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:976:1: rule__BREType__Alternatives : ( ( ( 'BizToBiz' ) ) | ( ( 'SrcToBiz' ) ) | ( ( 'BizToOut' ) ) );
    public final void rule__BREType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:980:1: ( ( ( 'BizToBiz' ) ) | ( ( 'SrcToBiz' ) ) | ( ( 'BizToOut' ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt7=1;
                }
                break;
            case 16:
                {
                alt7=2;
                }
                break;
            case 17:
                {
                alt7=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:981:1: ( ( 'BizToBiz' ) )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:981:1: ( ( 'BizToBiz' ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:982:1: ( 'BizToBiz' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBRETypeAccess().getBizToBizEnumLiteralDeclaration_0()); 
                    }
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:983:1: ( 'BizToBiz' )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:983:3: 'BizToBiz'
                    {
                    match(input,15,FOLLOW_15_in_rule__BREType__Alternatives2074); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBRETypeAccess().getBizToBizEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:988:6: ( ( 'SrcToBiz' ) )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:988:6: ( ( 'SrcToBiz' ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:989:1: ( 'SrcToBiz' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBRETypeAccess().getSrcToBizEnumLiteralDeclaration_1()); 
                    }
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:990:1: ( 'SrcToBiz' )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:990:3: 'SrcToBiz'
                    {
                    match(input,16,FOLLOW_16_in_rule__BREType__Alternatives2095); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBRETypeAccess().getSrcToBizEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:995:6: ( ( 'BizToOut' ) )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:995:6: ( ( 'BizToOut' ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:996:1: ( 'BizToOut' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBRETypeAccess().getBizToOutEnumLiteralDeclaration_2()); 
                    }
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:997:1: ( 'BizToOut' )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:997:3: 'BizToOut'
                    {
                    match(input,17,FOLLOW_17_in_rule__BREType__Alternatives2116); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBRETypeAccess().getBizToOutEnumLiteralDeclaration_2()); 
                    }

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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1007:1: rule__Multiplicty__Alternatives : ( ( ( '1..N' ) ) | ( ( '0..N' ) ) | ( ( '1' ) ) );
    public final void rule__Multiplicty__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1011:1: ( ( ( '1..N' ) ) | ( ( '0..N' ) ) | ( ( '1' ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt8=1;
                }
                break;
            case 19:
                {
                alt8=2;
                }
                break;
            case 20:
                {
                alt8=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1012:1: ( ( '1..N' ) )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1012:1: ( ( '1..N' ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1013:1: ( '1..N' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplictyAccess().getOneToManyEnumLiteralDeclaration_0()); 
                    }
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1014:1: ( '1..N' )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1014:3: '1..N'
                    {
                    match(input,18,FOLLOW_18_in_rule__Multiplicty__Alternatives2152); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplictyAccess().getOneToManyEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1019:6: ( ( '0..N' ) )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1019:6: ( ( '0..N' ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1020:1: ( '0..N' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplictyAccess().getZeroToManyEnumLiteralDeclaration_1()); 
                    }
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1021:1: ( '0..N' )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1021:3: '0..N'
                    {
                    match(input,19,FOLLOW_19_in_rule__Multiplicty__Alternatives2173); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplictyAccess().getZeroToManyEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1026:6: ( ( '1' ) )
                    {
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1026:6: ( ( '1' ) )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1027:1: ( '1' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplictyAccess().getOneToOneEnumLiteralDeclaration_2()); 
                    }
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1028:1: ( '1' )
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1028:3: '1'
                    {
                    match(input,20,FOLLOW_20_in_rule__Multiplicty__Alternatives2194); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplictyAccess().getOneToOneEnumLiteralDeclaration_2()); 
                    }

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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1040:1: rule__Flow__Group__0 : rule__Flow__Group__0__Impl rule__Flow__Group__1 ;
    public final void rule__Flow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1044:1: ( rule__Flow__Group__0__Impl rule__Flow__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1045:2: rule__Flow__Group__0__Impl rule__Flow__Group__1
            {
            pushFollow(FOLLOW_rule__Flow__Group__0__Impl_in_rule__Flow__Group__02227);
            rule__Flow__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Flow__Group__1_in_rule__Flow__Group__02230);
            rule__Flow__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1052:1: rule__Flow__Group__0__Impl : ( ( rule__Flow__ImportsAssignment_0 )* ) ;
    public final void rule__Flow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1056:1: ( ( ( rule__Flow__ImportsAssignment_0 )* ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1057:1: ( ( rule__Flow__ImportsAssignment_0 )* )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1057:1: ( ( rule__Flow__ImportsAssignment_0 )* )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1058:1: ( rule__Flow__ImportsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFlowAccess().getImportsAssignment_0()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1059:1: ( rule__Flow__ImportsAssignment_0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==45) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1059:2: rule__Flow__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Flow__ImportsAssignment_0_in_rule__Flow__Group__0__Impl2257);
            	    rule__Flow__ImportsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFlowAccess().getImportsAssignment_0()); 
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
    // $ANTLR end "rule__Flow__Group__0__Impl"


    // $ANTLR start "rule__Flow__Group__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1069:1: rule__Flow__Group__1 : rule__Flow__Group__1__Impl rule__Flow__Group__2 ;
    public final void rule__Flow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1073:1: ( rule__Flow__Group__1__Impl rule__Flow__Group__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1074:2: rule__Flow__Group__1__Impl rule__Flow__Group__2
            {
            pushFollow(FOLLOW_rule__Flow__Group__1__Impl_in_rule__Flow__Group__12288);
            rule__Flow__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Flow__Group__2_in_rule__Flow__Group__12291);
            rule__Flow__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1081:1: rule__Flow__Group__1__Impl : ( 'Flow' ) ;
    public final void rule__Flow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1085:1: ( ( 'Flow' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1086:1: ( 'Flow' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1086:1: ( 'Flow' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1087:1: 'Flow'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFlowAccess().getFlowKeyword_1()); 
            }
            match(input,21,FOLLOW_21_in_rule__Flow__Group__1__Impl2319); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFlowAccess().getFlowKeyword_1()); 
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
    // $ANTLR end "rule__Flow__Group__1__Impl"


    // $ANTLR start "rule__Flow__Group__2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1100:1: rule__Flow__Group__2 : rule__Flow__Group__2__Impl rule__Flow__Group__3 ;
    public final void rule__Flow__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1104:1: ( rule__Flow__Group__2__Impl rule__Flow__Group__3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1105:2: rule__Flow__Group__2__Impl rule__Flow__Group__3
            {
            pushFollow(FOLLOW_rule__Flow__Group__2__Impl_in_rule__Flow__Group__22350);
            rule__Flow__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Flow__Group__3_in_rule__Flow__Group__22353);
            rule__Flow__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1112:1: rule__Flow__Group__2__Impl : ( ( rule__Flow__NameAssignment_2 ) ) ;
    public final void rule__Flow__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1116:1: ( ( ( rule__Flow__NameAssignment_2 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1117:1: ( ( rule__Flow__NameAssignment_2 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1117:1: ( ( rule__Flow__NameAssignment_2 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1118:1: ( rule__Flow__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFlowAccess().getNameAssignment_2()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1119:1: ( rule__Flow__NameAssignment_2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1119:2: rule__Flow__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Flow__NameAssignment_2_in_rule__Flow__Group__2__Impl2380);
            rule__Flow__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFlowAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__Flow__Group__2__Impl"


    // $ANTLR start "rule__Flow__Group__3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1129:1: rule__Flow__Group__3 : rule__Flow__Group__3__Impl rule__Flow__Group__4 ;
    public final void rule__Flow__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1133:1: ( rule__Flow__Group__3__Impl rule__Flow__Group__4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1134:2: rule__Flow__Group__3__Impl rule__Flow__Group__4
            {
            pushFollow(FOLLOW_rule__Flow__Group__3__Impl_in_rule__Flow__Group__32410);
            rule__Flow__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Flow__Group__4_in_rule__Flow__Group__32413);
            rule__Flow__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1141:1: rule__Flow__Group__3__Impl : ( '{' ) ;
    public final void rule__Flow__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1145:1: ( ( '{' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1146:1: ( '{' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1146:1: ( '{' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1147:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFlowAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,22,FOLLOW_22_in_rule__Flow__Group__3__Impl2441); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFlowAccess().getLeftCurlyBracketKeyword_3()); 
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
    // $ANTLR end "rule__Flow__Group__3__Impl"


    // $ANTLR start "rule__Flow__Group__4"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1160:1: rule__Flow__Group__4 : rule__Flow__Group__4__Impl rule__Flow__Group__5 ;
    public final void rule__Flow__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1164:1: ( rule__Flow__Group__4__Impl rule__Flow__Group__5 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1165:2: rule__Flow__Group__4__Impl rule__Flow__Group__5
            {
            pushFollow(FOLLOW_rule__Flow__Group__4__Impl_in_rule__Flow__Group__42472);
            rule__Flow__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Flow__Group__5_in_rule__Flow__Group__42475);
            rule__Flow__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1172:1: rule__Flow__Group__4__Impl : ( ( rule__Flow__ActivitiesAssignment_4 )* ) ;
    public final void rule__Flow__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1176:1: ( ( ( rule__Flow__ActivitiesAssignment_4 )* ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1177:1: ( ( rule__Flow__ActivitiesAssignment_4 )* )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1177:1: ( ( rule__Flow__ActivitiesAssignment_4 )* )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1178:1: ( rule__Flow__ActivitiesAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFlowAccess().getActivitiesAssignment_4()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1179:1: ( rule__Flow__ActivitiesAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==24) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1179:2: rule__Flow__ActivitiesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Flow__ActivitiesAssignment_4_in_rule__Flow__Group__4__Impl2502);
            	    rule__Flow__ActivitiesAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFlowAccess().getActivitiesAssignment_4()); 
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
    // $ANTLR end "rule__Flow__Group__4__Impl"


    // $ANTLR start "rule__Flow__Group__5"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1189:1: rule__Flow__Group__5 : rule__Flow__Group__5__Impl ;
    public final void rule__Flow__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1193:1: ( rule__Flow__Group__5__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1194:2: rule__Flow__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Flow__Group__5__Impl_in_rule__Flow__Group__52533);
            rule__Flow__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1200:1: rule__Flow__Group__5__Impl : ( '}' ) ;
    public final void rule__Flow__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1204:1: ( ( '}' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1205:1: ( '}' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1205:1: ( '}' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1206:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFlowAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,23,FOLLOW_23_in_rule__Flow__Group__5__Impl2561); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFlowAccess().getRightCurlyBracketKeyword_5()); 
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
    // $ANTLR end "rule__Flow__Group__5__Impl"


    // $ANTLR start "rule__Activity__Group__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1231:1: rule__Activity__Group__0 : rule__Activity__Group__0__Impl rule__Activity__Group__1 ;
    public final void rule__Activity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1235:1: ( rule__Activity__Group__0__Impl rule__Activity__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1236:2: rule__Activity__Group__0__Impl rule__Activity__Group__1
            {
            pushFollow(FOLLOW_rule__Activity__Group__0__Impl_in_rule__Activity__Group__02604);
            rule__Activity__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activity__Group__1_in_rule__Activity__Group__02607);
            rule__Activity__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1243:1: rule__Activity__Group__0__Impl : ( 'Activity' ) ;
    public final void rule__Activity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1247:1: ( ( 'Activity' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1248:1: ( 'Activity' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1248:1: ( 'Activity' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1249:1: 'Activity'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getActivityKeyword_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__Activity__Group__0__Impl2635); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getActivityKeyword_0()); 
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
    // $ANTLR end "rule__Activity__Group__0__Impl"


    // $ANTLR start "rule__Activity__Group__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1262:1: rule__Activity__Group__1 : rule__Activity__Group__1__Impl rule__Activity__Group__2 ;
    public final void rule__Activity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1266:1: ( rule__Activity__Group__1__Impl rule__Activity__Group__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1267:2: rule__Activity__Group__1__Impl rule__Activity__Group__2
            {
            pushFollow(FOLLOW_rule__Activity__Group__1__Impl_in_rule__Activity__Group__12666);
            rule__Activity__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activity__Group__2_in_rule__Activity__Group__12669);
            rule__Activity__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1274:1: rule__Activity__Group__1__Impl : ( ( rule__Activity__NameAssignment_1 ) ) ;
    public final void rule__Activity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1278:1: ( ( ( rule__Activity__NameAssignment_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1279:1: ( ( rule__Activity__NameAssignment_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1279:1: ( ( rule__Activity__NameAssignment_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1280:1: ( rule__Activity__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getNameAssignment_1()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1281:1: ( rule__Activity__NameAssignment_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1281:2: rule__Activity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Activity__NameAssignment_1_in_rule__Activity__Group__1__Impl2696);
            rule__Activity__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__Activity__Group__1__Impl"


    // $ANTLR start "rule__Activity__Group__2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1291:1: rule__Activity__Group__2 : rule__Activity__Group__2__Impl rule__Activity__Group__3 ;
    public final void rule__Activity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1295:1: ( rule__Activity__Group__2__Impl rule__Activity__Group__3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1296:2: rule__Activity__Group__2__Impl rule__Activity__Group__3
            {
            pushFollow(FOLLOW_rule__Activity__Group__2__Impl_in_rule__Activity__Group__22726);
            rule__Activity__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activity__Group__3_in_rule__Activity__Group__22729);
            rule__Activity__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1303:1: rule__Activity__Group__2__Impl : ( '{' ) ;
    public final void rule__Activity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1307:1: ( ( '{' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1308:1: ( '{' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1308:1: ( '{' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1309:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,22,FOLLOW_22_in_rule__Activity__Group__2__Impl2757); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_2()); 
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
    // $ANTLR end "rule__Activity__Group__2__Impl"


    // $ANTLR start "rule__Activity__Group__3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1322:1: rule__Activity__Group__3 : rule__Activity__Group__3__Impl rule__Activity__Group__4 ;
    public final void rule__Activity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1326:1: ( rule__Activity__Group__3__Impl rule__Activity__Group__4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1327:2: rule__Activity__Group__3__Impl rule__Activity__Group__4
            {
            pushFollow(FOLLOW_rule__Activity__Group__3__Impl_in_rule__Activity__Group__32788);
            rule__Activity__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activity__Group__4_in_rule__Activity__Group__32791);
            rule__Activity__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1334:1: rule__Activity__Group__3__Impl : ( ( rule__Activity__Group_3__0 )? ) ;
    public final void rule__Activity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1338:1: ( ( ( rule__Activity__Group_3__0 )? ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1339:1: ( ( rule__Activity__Group_3__0 )? )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1339:1: ( ( rule__Activity__Group_3__0 )? )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1340:1: ( rule__Activity__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getGroup_3()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1341:1: ( rule__Activity__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1341:2: rule__Activity__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_3__0_in_rule__Activity__Group__3__Impl2818);
                    rule__Activity__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getGroup_3()); 
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
    // $ANTLR end "rule__Activity__Group__3__Impl"


    // $ANTLR start "rule__Activity__Group__4"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1351:1: rule__Activity__Group__4 : rule__Activity__Group__4__Impl rule__Activity__Group__5 ;
    public final void rule__Activity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1355:1: ( rule__Activity__Group__4__Impl rule__Activity__Group__5 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1356:2: rule__Activity__Group__4__Impl rule__Activity__Group__5
            {
            pushFollow(FOLLOW_rule__Activity__Group__4__Impl_in_rule__Activity__Group__42849);
            rule__Activity__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activity__Group__5_in_rule__Activity__Group__42852);
            rule__Activity__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1363:1: rule__Activity__Group__4__Impl : ( ( rule__Activity__Group_4__0 )? ) ;
    public final void rule__Activity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1367:1: ( ( ( rule__Activity__Group_4__0 )? ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1368:1: ( ( rule__Activity__Group_4__0 )? )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1368:1: ( ( rule__Activity__Group_4__0 )? )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1369:1: ( rule__Activity__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getGroup_4()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1370:1: ( rule__Activity__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1370:2: rule__Activity__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Activity__Group_4__0_in_rule__Activity__Group__4__Impl2879);
                    rule__Activity__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getGroup_4()); 
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
    // $ANTLR end "rule__Activity__Group__4__Impl"


    // $ANTLR start "rule__Activity__Group__5"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1380:1: rule__Activity__Group__5 : rule__Activity__Group__5__Impl rule__Activity__Group__6 ;
    public final void rule__Activity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1384:1: ( rule__Activity__Group__5__Impl rule__Activity__Group__6 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1385:2: rule__Activity__Group__5__Impl rule__Activity__Group__6
            {
            pushFollow(FOLLOW_rule__Activity__Group__5__Impl_in_rule__Activity__Group__52910);
            rule__Activity__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activity__Group__6_in_rule__Activity__Group__52913);
            rule__Activity__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1392:1: rule__Activity__Group__5__Impl : ( 'Description' ) ;
    public final void rule__Activity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1396:1: ( ( 'Description' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1397:1: ( 'Description' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1397:1: ( 'Description' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1398:1: 'Description'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getDescriptionKeyword_5()); 
            }
            match(input,25,FOLLOW_25_in_rule__Activity__Group__5__Impl2941); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getDescriptionKeyword_5()); 
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
    // $ANTLR end "rule__Activity__Group__5__Impl"


    // $ANTLR start "rule__Activity__Group__6"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1411:1: rule__Activity__Group__6 : rule__Activity__Group__6__Impl rule__Activity__Group__7 ;
    public final void rule__Activity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1415:1: ( rule__Activity__Group__6__Impl rule__Activity__Group__7 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1416:2: rule__Activity__Group__6__Impl rule__Activity__Group__7
            {
            pushFollow(FOLLOW_rule__Activity__Group__6__Impl_in_rule__Activity__Group__62972);
            rule__Activity__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activity__Group__7_in_rule__Activity__Group__62975);
            rule__Activity__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1423:1: rule__Activity__Group__6__Impl : ( ( rule__Activity__DescriptionAssignment_6 ) ) ;
    public final void rule__Activity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1427:1: ( ( ( rule__Activity__DescriptionAssignment_6 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1428:1: ( ( rule__Activity__DescriptionAssignment_6 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1428:1: ( ( rule__Activity__DescriptionAssignment_6 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1429:1: ( rule__Activity__DescriptionAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getDescriptionAssignment_6()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1430:1: ( rule__Activity__DescriptionAssignment_6 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1430:2: rule__Activity__DescriptionAssignment_6
            {
            pushFollow(FOLLOW_rule__Activity__DescriptionAssignment_6_in_rule__Activity__Group__6__Impl3002);
            rule__Activity__DescriptionAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getDescriptionAssignment_6()); 
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
    // $ANTLR end "rule__Activity__Group__6__Impl"


    // $ANTLR start "rule__Activity__Group__7"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1440:1: rule__Activity__Group__7 : rule__Activity__Group__7__Impl rule__Activity__Group__8 ;
    public final void rule__Activity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1444:1: ( rule__Activity__Group__7__Impl rule__Activity__Group__8 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1445:2: rule__Activity__Group__7__Impl rule__Activity__Group__8
            {
            pushFollow(FOLLOW_rule__Activity__Group__7__Impl_in_rule__Activity__Group__73032);
            rule__Activity__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activity__Group__8_in_rule__Activity__Group__73035);
            rule__Activity__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1452:1: rule__Activity__Group__7__Impl : ( ( '\"' ) ) ;
    public final void rule__Activity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1456:1: ( ( ( '\"' ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1457:1: ( ( '\"' ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1457:1: ( ( '\"' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1458:1: ( '\"' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getQuotationMarkKeyword_7()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1459:1: ( '\"' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1460:2: '\"'
            {
            match(input,26,FOLLOW_26_in_rule__Activity__Group__7__Impl3064); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getQuotationMarkKeyword_7()); 
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
    // $ANTLR end "rule__Activity__Group__7__Impl"


    // $ANTLR start "rule__Activity__Group__8"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1471:1: rule__Activity__Group__8 : rule__Activity__Group__8__Impl ;
    public final void rule__Activity__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1475:1: ( rule__Activity__Group__8__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1476:2: rule__Activity__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group__8__Impl_in_rule__Activity__Group__83096);
            rule__Activity__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__8"


    // $ANTLR start "rule__Activity__Group__8__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1482:1: rule__Activity__Group__8__Impl : ( '}' ) ;
    public final void rule__Activity__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1486:1: ( ( '}' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1487:1: ( '}' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1487:1: ( '}' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1488:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_8()); 
            }
            match(input,23,FOLLOW_23_in_rule__Activity__Group__8__Impl3124); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_8()); 
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
    // $ANTLR end "rule__Activity__Group__8__Impl"


    // $ANTLR start "rule__Activity__Group_3__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1519:1: rule__Activity__Group_3__0 : rule__Activity__Group_3__0__Impl rule__Activity__Group_3__1 ;
    public final void rule__Activity__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1523:1: ( rule__Activity__Group_3__0__Impl rule__Activity__Group_3__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1524:2: rule__Activity__Group_3__0__Impl rule__Activity__Group_3__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_3__0__Impl_in_rule__Activity__Group_3__03173);
            rule__Activity__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activity__Group_3__1_in_rule__Activity__Group_3__03176);
            rule__Activity__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1531:1: rule__Activity__Group_3__0__Impl : ( 'Successors' ) ;
    public final void rule__Activity__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1535:1: ( ( 'Successors' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1536:1: ( 'Successors' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1536:1: ( 'Successors' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1537:1: 'Successors'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getSuccessorsKeyword_3_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__Activity__Group_3__0__Impl3204); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getSuccessorsKeyword_3_0()); 
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
    // $ANTLR end "rule__Activity__Group_3__0__Impl"


    // $ANTLR start "rule__Activity__Group_3__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1550:1: rule__Activity__Group_3__1 : rule__Activity__Group_3__1__Impl rule__Activity__Group_3__2 ;
    public final void rule__Activity__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1554:1: ( rule__Activity__Group_3__1__Impl rule__Activity__Group_3__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1555:2: rule__Activity__Group_3__1__Impl rule__Activity__Group_3__2
            {
            pushFollow(FOLLOW_rule__Activity__Group_3__1__Impl_in_rule__Activity__Group_3__13235);
            rule__Activity__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activity__Group_3__2_in_rule__Activity__Group_3__13238);
            rule__Activity__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1562:1: rule__Activity__Group_3__1__Impl : ( '[' ) ;
    public final void rule__Activity__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1566:1: ( ( '[' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1567:1: ( '[' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1567:1: ( '[' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1568:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getLeftSquareBracketKeyword_3_1()); 
            }
            match(input,28,FOLLOW_28_in_rule__Activity__Group_3__1__Impl3266); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getLeftSquareBracketKeyword_3_1()); 
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
    // $ANTLR end "rule__Activity__Group_3__1__Impl"


    // $ANTLR start "rule__Activity__Group_3__2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1581:1: rule__Activity__Group_3__2 : rule__Activity__Group_3__2__Impl rule__Activity__Group_3__3 ;
    public final void rule__Activity__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1585:1: ( rule__Activity__Group_3__2__Impl rule__Activity__Group_3__3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1586:2: rule__Activity__Group_3__2__Impl rule__Activity__Group_3__3
            {
            pushFollow(FOLLOW_rule__Activity__Group_3__2__Impl_in_rule__Activity__Group_3__23297);
            rule__Activity__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activity__Group_3__3_in_rule__Activity__Group_3__23300);
            rule__Activity__Group_3__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1593:1: rule__Activity__Group_3__2__Impl : ( ( rule__Activity__SucessorsAssignment_3_2 ) ) ;
    public final void rule__Activity__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1597:1: ( ( ( rule__Activity__SucessorsAssignment_3_2 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1598:1: ( ( rule__Activity__SucessorsAssignment_3_2 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1598:1: ( ( rule__Activity__SucessorsAssignment_3_2 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1599:1: ( rule__Activity__SucessorsAssignment_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getSucessorsAssignment_3_2()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1600:1: ( rule__Activity__SucessorsAssignment_3_2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1600:2: rule__Activity__SucessorsAssignment_3_2
            {
            pushFollow(FOLLOW_rule__Activity__SucessorsAssignment_3_2_in_rule__Activity__Group_3__2__Impl3327);
            rule__Activity__SucessorsAssignment_3_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getSucessorsAssignment_3_2()); 
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
    // $ANTLR end "rule__Activity__Group_3__2__Impl"


    // $ANTLR start "rule__Activity__Group_3__3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1610:1: rule__Activity__Group_3__3 : rule__Activity__Group_3__3__Impl rule__Activity__Group_3__4 ;
    public final void rule__Activity__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1614:1: ( rule__Activity__Group_3__3__Impl rule__Activity__Group_3__4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1615:2: rule__Activity__Group_3__3__Impl rule__Activity__Group_3__4
            {
            pushFollow(FOLLOW_rule__Activity__Group_3__3__Impl_in_rule__Activity__Group_3__33357);
            rule__Activity__Group_3__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activity__Group_3__4_in_rule__Activity__Group_3__33360);
            rule__Activity__Group_3__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1622:1: rule__Activity__Group_3__3__Impl : ( ( rule__Activity__Group_3_3__0 )* ) ;
    public final void rule__Activity__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1626:1: ( ( ( rule__Activity__Group_3_3__0 )* ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1627:1: ( ( rule__Activity__Group_3_3__0 )* )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1627:1: ( ( rule__Activity__Group_3_3__0 )* )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1628:1: ( rule__Activity__Group_3_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getGroup_3_3()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1629:1: ( rule__Activity__Group_3_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==30) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1629:2: rule__Activity__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Activity__Group_3_3__0_in_rule__Activity__Group_3__3__Impl3387);
            	    rule__Activity__Group_3_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getGroup_3_3()); 
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
    // $ANTLR end "rule__Activity__Group_3__3__Impl"


    // $ANTLR start "rule__Activity__Group_3__4"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1639:1: rule__Activity__Group_3__4 : rule__Activity__Group_3__4__Impl ;
    public final void rule__Activity__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1643:1: ( rule__Activity__Group_3__4__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1644:2: rule__Activity__Group_3__4__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_3__4__Impl_in_rule__Activity__Group_3__43418);
            rule__Activity__Group_3__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1650:1: rule__Activity__Group_3__4__Impl : ( ']' ) ;
    public final void rule__Activity__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1654:1: ( ( ']' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1655:1: ( ']' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1655:1: ( ']' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1656:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getRightSquareBracketKeyword_3_4()); 
            }
            match(input,29,FOLLOW_29_in_rule__Activity__Group_3__4__Impl3446); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getRightSquareBracketKeyword_3_4()); 
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
    // $ANTLR end "rule__Activity__Group_3__4__Impl"


    // $ANTLR start "rule__Activity__Group_3_3__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1679:1: rule__Activity__Group_3_3__0 : rule__Activity__Group_3_3__0__Impl rule__Activity__Group_3_3__1 ;
    public final void rule__Activity__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1683:1: ( rule__Activity__Group_3_3__0__Impl rule__Activity__Group_3_3__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1684:2: rule__Activity__Group_3_3__0__Impl rule__Activity__Group_3_3__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_3_3__0__Impl_in_rule__Activity__Group_3_3__03487);
            rule__Activity__Group_3_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activity__Group_3_3__1_in_rule__Activity__Group_3_3__03490);
            rule__Activity__Group_3_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1691:1: rule__Activity__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Activity__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1695:1: ( ( ',' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1696:1: ( ',' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1696:1: ( ',' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1697:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getCommaKeyword_3_3_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__Activity__Group_3_3__0__Impl3518); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getCommaKeyword_3_3_0()); 
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
    // $ANTLR end "rule__Activity__Group_3_3__0__Impl"


    // $ANTLR start "rule__Activity__Group_3_3__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1710:1: rule__Activity__Group_3_3__1 : rule__Activity__Group_3_3__1__Impl ;
    public final void rule__Activity__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1714:1: ( rule__Activity__Group_3_3__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1715:2: rule__Activity__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_3_3__1__Impl_in_rule__Activity__Group_3_3__13549);
            rule__Activity__Group_3_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1721:1: rule__Activity__Group_3_3__1__Impl : ( ( rule__Activity__SucessorsAssignment_3_3_1 ) ) ;
    public final void rule__Activity__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1725:1: ( ( ( rule__Activity__SucessorsAssignment_3_3_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1726:1: ( ( rule__Activity__SucessorsAssignment_3_3_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1726:1: ( ( rule__Activity__SucessorsAssignment_3_3_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1727:1: ( rule__Activity__SucessorsAssignment_3_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getSucessorsAssignment_3_3_1()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1728:1: ( rule__Activity__SucessorsAssignment_3_3_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1728:2: rule__Activity__SucessorsAssignment_3_3_1
            {
            pushFollow(FOLLOW_rule__Activity__SucessorsAssignment_3_3_1_in_rule__Activity__Group_3_3__1__Impl3576);
            rule__Activity__SucessorsAssignment_3_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getSucessorsAssignment_3_3_1()); 
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
    // $ANTLR end "rule__Activity__Group_3_3__1__Impl"


    // $ANTLR start "rule__Activity__Group_4__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1742:1: rule__Activity__Group_4__0 : rule__Activity__Group_4__0__Impl rule__Activity__Group_4__1 ;
    public final void rule__Activity__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1746:1: ( rule__Activity__Group_4__0__Impl rule__Activity__Group_4__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1747:2: rule__Activity__Group_4__0__Impl rule__Activity__Group_4__1
            {
            pushFollow(FOLLOW_rule__Activity__Group_4__0__Impl_in_rule__Activity__Group_4__03610);
            rule__Activity__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Activity__Group_4__1_in_rule__Activity__Group_4__03613);
            rule__Activity__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1754:1: rule__Activity__Group_4__0__Impl : ( 'Calls' ) ;
    public final void rule__Activity__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1758:1: ( ( 'Calls' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1759:1: ( 'Calls' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1759:1: ( 'Calls' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1760:1: 'Calls'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getCallsKeyword_4_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__Activity__Group_4__0__Impl3641); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getCallsKeyword_4_0()); 
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
    // $ANTLR end "rule__Activity__Group_4__0__Impl"


    // $ANTLR start "rule__Activity__Group_4__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1773:1: rule__Activity__Group_4__1 : rule__Activity__Group_4__1__Impl ;
    public final void rule__Activity__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1777:1: ( rule__Activity__Group_4__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1778:2: rule__Activity__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Activity__Group_4__1__Impl_in_rule__Activity__Group_4__13672);
            rule__Activity__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1784:1: rule__Activity__Group_4__1__Impl : ( ( rule__Activity__BusinessRuleAssignment_4_1 ) ) ;
    public final void rule__Activity__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1788:1: ( ( ( rule__Activity__BusinessRuleAssignment_4_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1789:1: ( ( rule__Activity__BusinessRuleAssignment_4_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1789:1: ( ( rule__Activity__BusinessRuleAssignment_4_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1790:1: ( rule__Activity__BusinessRuleAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getBusinessRuleAssignment_4_1()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1791:1: ( rule__Activity__BusinessRuleAssignment_4_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1791:2: rule__Activity__BusinessRuleAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Activity__BusinessRuleAssignment_4_1_in_rule__Activity__Group_4__1__Impl3699);
            rule__Activity__BusinessRuleAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getBusinessRuleAssignment_4_1()); 
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
    // $ANTLR end "rule__Activity__Group_4__1__Impl"


    // $ANTLR start "rule__BusinessRule__Group__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1805:1: rule__BusinessRule__Group__0 : rule__BusinessRule__Group__0__Impl rule__BusinessRule__Group__1 ;
    public final void rule__BusinessRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1809:1: ( rule__BusinessRule__Group__0__Impl rule__BusinessRule__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1810:2: rule__BusinessRule__Group__0__Impl rule__BusinessRule__Group__1
            {
            pushFollow(FOLLOW_rule__BusinessRule__Group__0__Impl_in_rule__BusinessRule__Group__03733);
            rule__BusinessRule__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BusinessRule__Group__1_in_rule__BusinessRule__Group__03736);
            rule__BusinessRule__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1817:1: rule__BusinessRule__Group__0__Impl : ( ( rule__BusinessRule__ImportsAssignment_0 )* ) ;
    public final void rule__BusinessRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1821:1: ( ( ( rule__BusinessRule__ImportsAssignment_0 )* ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1822:1: ( ( rule__BusinessRule__ImportsAssignment_0 )* )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1822:1: ( ( rule__BusinessRule__ImportsAssignment_0 )* )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1823:1: ( rule__BusinessRule__ImportsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBusinessRuleAccess().getImportsAssignment_0()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1824:1: ( rule__BusinessRule__ImportsAssignment_0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==45) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1824:2: rule__BusinessRule__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__BusinessRule__ImportsAssignment_0_in_rule__BusinessRule__Group__0__Impl3763);
            	    rule__BusinessRule__ImportsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBusinessRuleAccess().getImportsAssignment_0()); 
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
    // $ANTLR end "rule__BusinessRule__Group__0__Impl"


    // $ANTLR start "rule__BusinessRule__Group__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1834:1: rule__BusinessRule__Group__1 : rule__BusinessRule__Group__1__Impl rule__BusinessRule__Group__2 ;
    public final void rule__BusinessRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1838:1: ( rule__BusinessRule__Group__1__Impl rule__BusinessRule__Group__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1839:2: rule__BusinessRule__Group__1__Impl rule__BusinessRule__Group__2
            {
            pushFollow(FOLLOW_rule__BusinessRule__Group__1__Impl_in_rule__BusinessRule__Group__13794);
            rule__BusinessRule__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BusinessRule__Group__2_in_rule__BusinessRule__Group__13797);
            rule__BusinessRule__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1846:1: rule__BusinessRule__Group__1__Impl : ( 'BusinessRule' ) ;
    public final void rule__BusinessRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1850:1: ( ( 'BusinessRule' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1851:1: ( 'BusinessRule' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1851:1: ( 'BusinessRule' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1852:1: 'BusinessRule'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBusinessRuleAccess().getBusinessRuleKeyword_1()); 
            }
            match(input,32,FOLLOW_32_in_rule__BusinessRule__Group__1__Impl3825); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBusinessRuleAccess().getBusinessRuleKeyword_1()); 
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
    // $ANTLR end "rule__BusinessRule__Group__1__Impl"


    // $ANTLR start "rule__BusinessRule__Group__2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1865:1: rule__BusinessRule__Group__2 : rule__BusinessRule__Group__2__Impl rule__BusinessRule__Group__3 ;
    public final void rule__BusinessRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1869:1: ( rule__BusinessRule__Group__2__Impl rule__BusinessRule__Group__3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1870:2: rule__BusinessRule__Group__2__Impl rule__BusinessRule__Group__3
            {
            pushFollow(FOLLOW_rule__BusinessRule__Group__2__Impl_in_rule__BusinessRule__Group__23856);
            rule__BusinessRule__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BusinessRule__Group__3_in_rule__BusinessRule__Group__23859);
            rule__BusinessRule__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1877:1: rule__BusinessRule__Group__2__Impl : ( ( rule__BusinessRule__NameAssignment_2 ) ) ;
    public final void rule__BusinessRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1881:1: ( ( ( rule__BusinessRule__NameAssignment_2 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1882:1: ( ( rule__BusinessRule__NameAssignment_2 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1882:1: ( ( rule__BusinessRule__NameAssignment_2 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1883:1: ( rule__BusinessRule__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBusinessRuleAccess().getNameAssignment_2()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1884:1: ( rule__BusinessRule__NameAssignment_2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1884:2: rule__BusinessRule__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__BusinessRule__NameAssignment_2_in_rule__BusinessRule__Group__2__Impl3886);
            rule__BusinessRule__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBusinessRuleAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__BusinessRule__Group__2__Impl"


    // $ANTLR start "rule__BusinessRule__Group__3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1894:1: rule__BusinessRule__Group__3 : rule__BusinessRule__Group__3__Impl rule__BusinessRule__Group__4 ;
    public final void rule__BusinessRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1898:1: ( rule__BusinessRule__Group__3__Impl rule__BusinessRule__Group__4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1899:2: rule__BusinessRule__Group__3__Impl rule__BusinessRule__Group__4
            {
            pushFollow(FOLLOW_rule__BusinessRule__Group__3__Impl_in_rule__BusinessRule__Group__33916);
            rule__BusinessRule__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BusinessRule__Group__4_in_rule__BusinessRule__Group__33919);
            rule__BusinessRule__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1906:1: rule__BusinessRule__Group__3__Impl : ( 'type' ) ;
    public final void rule__BusinessRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1910:1: ( ( 'type' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1911:1: ( 'type' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1911:1: ( 'type' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1912:1: 'type'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBusinessRuleAccess().getTypeKeyword_3()); 
            }
            match(input,33,FOLLOW_33_in_rule__BusinessRule__Group__3__Impl3947); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBusinessRuleAccess().getTypeKeyword_3()); 
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
    // $ANTLR end "rule__BusinessRule__Group__3__Impl"


    // $ANTLR start "rule__BusinessRule__Group__4"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1925:1: rule__BusinessRule__Group__4 : rule__BusinessRule__Group__4__Impl rule__BusinessRule__Group__5 ;
    public final void rule__BusinessRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1929:1: ( rule__BusinessRule__Group__4__Impl rule__BusinessRule__Group__5 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1930:2: rule__BusinessRule__Group__4__Impl rule__BusinessRule__Group__5
            {
            pushFollow(FOLLOW_rule__BusinessRule__Group__4__Impl_in_rule__BusinessRule__Group__43978);
            rule__BusinessRule__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BusinessRule__Group__5_in_rule__BusinessRule__Group__43981);
            rule__BusinessRule__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1937:1: rule__BusinessRule__Group__4__Impl : ( ( rule__BusinessRule__TypAssignment_4 ) ) ;
    public final void rule__BusinessRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1941:1: ( ( ( rule__BusinessRule__TypAssignment_4 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1942:1: ( ( rule__BusinessRule__TypAssignment_4 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1942:1: ( ( rule__BusinessRule__TypAssignment_4 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1943:1: ( rule__BusinessRule__TypAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBusinessRuleAccess().getTypAssignment_4()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1944:1: ( rule__BusinessRule__TypAssignment_4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1944:2: rule__BusinessRule__TypAssignment_4
            {
            pushFollow(FOLLOW_rule__BusinessRule__TypAssignment_4_in_rule__BusinessRule__Group__4__Impl4008);
            rule__BusinessRule__TypAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBusinessRuleAccess().getTypAssignment_4()); 
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
    // $ANTLR end "rule__BusinessRule__Group__4__Impl"


    // $ANTLR start "rule__BusinessRule__Group__5"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1954:1: rule__BusinessRule__Group__5 : rule__BusinessRule__Group__5__Impl rule__BusinessRule__Group__6 ;
    public final void rule__BusinessRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1958:1: ( rule__BusinessRule__Group__5__Impl rule__BusinessRule__Group__6 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1959:2: rule__BusinessRule__Group__5__Impl rule__BusinessRule__Group__6
            {
            pushFollow(FOLLOW_rule__BusinessRule__Group__5__Impl_in_rule__BusinessRule__Group__54038);
            rule__BusinessRule__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BusinessRule__Group__6_in_rule__BusinessRule__Group__54041);
            rule__BusinessRule__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1966:1: rule__BusinessRule__Group__5__Impl : ( '{' ) ;
    public final void rule__BusinessRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1970:1: ( ( '{' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1971:1: ( '{' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1971:1: ( '{' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1972:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBusinessRuleAccess().getLeftCurlyBracketKeyword_5()); 
            }
            match(input,22,FOLLOW_22_in_rule__BusinessRule__Group__5__Impl4069); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBusinessRuleAccess().getLeftCurlyBracketKeyword_5()); 
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
    // $ANTLR end "rule__BusinessRule__Group__5__Impl"


    // $ANTLR start "rule__BusinessRule__Group__6"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1985:1: rule__BusinessRule__Group__6 : rule__BusinessRule__Group__6__Impl rule__BusinessRule__Group__7 ;
    public final void rule__BusinessRule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1989:1: ( rule__BusinessRule__Group__6__Impl rule__BusinessRule__Group__7 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1990:2: rule__BusinessRule__Group__6__Impl rule__BusinessRule__Group__7
            {
            pushFollow(FOLLOW_rule__BusinessRule__Group__6__Impl_in_rule__BusinessRule__Group__64100);
            rule__BusinessRule__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BusinessRule__Group__7_in_rule__BusinessRule__Group__64103);
            rule__BusinessRule__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:1997:1: rule__BusinessRule__Group__6__Impl : ( 'Input' ) ;
    public final void rule__BusinessRule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2001:1: ( ( 'Input' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2002:1: ( 'Input' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2002:1: ( 'Input' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2003:1: 'Input'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBusinessRuleAccess().getInputKeyword_6()); 
            }
            match(input,34,FOLLOW_34_in_rule__BusinessRule__Group__6__Impl4131); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBusinessRuleAccess().getInputKeyword_6()); 
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
    // $ANTLR end "rule__BusinessRule__Group__6__Impl"


    // $ANTLR start "rule__BusinessRule__Group__7"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2016:1: rule__BusinessRule__Group__7 : rule__BusinessRule__Group__7__Impl rule__BusinessRule__Group__8 ;
    public final void rule__BusinessRule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2020:1: ( rule__BusinessRule__Group__7__Impl rule__BusinessRule__Group__8 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2021:2: rule__BusinessRule__Group__7__Impl rule__BusinessRule__Group__8
            {
            pushFollow(FOLLOW_rule__BusinessRule__Group__7__Impl_in_rule__BusinessRule__Group__74162);
            rule__BusinessRule__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BusinessRule__Group__8_in_rule__BusinessRule__Group__74165);
            rule__BusinessRule__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2028:1: rule__BusinessRule__Group__7__Impl : ( '[' ) ;
    public final void rule__BusinessRule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2032:1: ( ( '[' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2033:1: ( '[' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2033:1: ( '[' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2034:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBusinessRuleAccess().getLeftSquareBracketKeyword_7()); 
            }
            match(input,28,FOLLOW_28_in_rule__BusinessRule__Group__7__Impl4193); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBusinessRuleAccess().getLeftSquareBracketKeyword_7()); 
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
    // $ANTLR end "rule__BusinessRule__Group__7__Impl"


    // $ANTLR start "rule__BusinessRule__Group__8"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2047:1: rule__BusinessRule__Group__8 : rule__BusinessRule__Group__8__Impl rule__BusinessRule__Group__9 ;
    public final void rule__BusinessRule__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2051:1: ( rule__BusinessRule__Group__8__Impl rule__BusinessRule__Group__9 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2052:2: rule__BusinessRule__Group__8__Impl rule__BusinessRule__Group__9
            {
            pushFollow(FOLLOW_rule__BusinessRule__Group__8__Impl_in_rule__BusinessRule__Group__84224);
            rule__BusinessRule__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BusinessRule__Group__9_in_rule__BusinessRule__Group__84227);
            rule__BusinessRule__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2059:1: rule__BusinessRule__Group__8__Impl : ( ( rule__BusinessRule__SystemInputsAssignment_8 )* ) ;
    public final void rule__BusinessRule__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2063:1: ( ( ( rule__BusinessRule__SystemInputsAssignment_8 )* ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2064:1: ( ( rule__BusinessRule__SystemInputsAssignment_8 )* )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2064:1: ( ( rule__BusinessRule__SystemInputsAssignment_8 )* )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2065:1: ( rule__BusinessRule__SystemInputsAssignment_8 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBusinessRuleAccess().getSystemInputsAssignment_8()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2066:1: ( rule__BusinessRule__SystemInputsAssignment_8 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2066:2: rule__BusinessRule__SystemInputsAssignment_8
            	    {
            	    pushFollow(FOLLOW_rule__BusinessRule__SystemInputsAssignment_8_in_rule__BusinessRule__Group__8__Impl4254);
            	    rule__BusinessRule__SystemInputsAssignment_8();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBusinessRuleAccess().getSystemInputsAssignment_8()); 
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
    // $ANTLR end "rule__BusinessRule__Group__8__Impl"


    // $ANTLR start "rule__BusinessRule__Group__9"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2076:1: rule__BusinessRule__Group__9 : rule__BusinessRule__Group__9__Impl rule__BusinessRule__Group__10 ;
    public final void rule__BusinessRule__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2080:1: ( rule__BusinessRule__Group__9__Impl rule__BusinessRule__Group__10 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2081:2: rule__BusinessRule__Group__9__Impl rule__BusinessRule__Group__10
            {
            pushFollow(FOLLOW_rule__BusinessRule__Group__9__Impl_in_rule__BusinessRule__Group__94285);
            rule__BusinessRule__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BusinessRule__Group__10_in_rule__BusinessRule__Group__94288);
            rule__BusinessRule__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2088:1: rule__BusinessRule__Group__9__Impl : ( ']' ) ;
    public final void rule__BusinessRule__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2092:1: ( ( ']' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2093:1: ( ']' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2093:1: ( ']' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2094:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBusinessRuleAccess().getRightSquareBracketKeyword_9()); 
            }
            match(input,29,FOLLOW_29_in_rule__BusinessRule__Group__9__Impl4316); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBusinessRuleAccess().getRightSquareBracketKeyword_9()); 
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
    // $ANTLR end "rule__BusinessRule__Group__9__Impl"


    // $ANTLR start "rule__BusinessRule__Group__10"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2107:1: rule__BusinessRule__Group__10 : rule__BusinessRule__Group__10__Impl rule__BusinessRule__Group__11 ;
    public final void rule__BusinessRule__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2111:1: ( rule__BusinessRule__Group__10__Impl rule__BusinessRule__Group__11 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2112:2: rule__BusinessRule__Group__10__Impl rule__BusinessRule__Group__11
            {
            pushFollow(FOLLOW_rule__BusinessRule__Group__10__Impl_in_rule__BusinessRule__Group__104347);
            rule__BusinessRule__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BusinessRule__Group__11_in_rule__BusinessRule__Group__104350);
            rule__BusinessRule__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2119:1: rule__BusinessRule__Group__10__Impl : ( 'Output' ) ;
    public final void rule__BusinessRule__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2123:1: ( ( 'Output' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2124:1: ( 'Output' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2124:1: ( 'Output' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2125:1: 'Output'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBusinessRuleAccess().getOutputKeyword_10()); 
            }
            match(input,35,FOLLOW_35_in_rule__BusinessRule__Group__10__Impl4378); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBusinessRuleAccess().getOutputKeyword_10()); 
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
    // $ANTLR end "rule__BusinessRule__Group__10__Impl"


    // $ANTLR start "rule__BusinessRule__Group__11"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2138:1: rule__BusinessRule__Group__11 : rule__BusinessRule__Group__11__Impl rule__BusinessRule__Group__12 ;
    public final void rule__BusinessRule__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2142:1: ( rule__BusinessRule__Group__11__Impl rule__BusinessRule__Group__12 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2143:2: rule__BusinessRule__Group__11__Impl rule__BusinessRule__Group__12
            {
            pushFollow(FOLLOW_rule__BusinessRule__Group__11__Impl_in_rule__BusinessRule__Group__114409);
            rule__BusinessRule__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BusinessRule__Group__12_in_rule__BusinessRule__Group__114412);
            rule__BusinessRule__Group__12();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2150:1: rule__BusinessRule__Group__11__Impl : ( '[' ) ;
    public final void rule__BusinessRule__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2154:1: ( ( '[' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2155:1: ( '[' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2155:1: ( '[' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2156:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBusinessRuleAccess().getLeftSquareBracketKeyword_11()); 
            }
            match(input,28,FOLLOW_28_in_rule__BusinessRule__Group__11__Impl4440); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBusinessRuleAccess().getLeftSquareBracketKeyword_11()); 
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
    // $ANTLR end "rule__BusinessRule__Group__11__Impl"


    // $ANTLR start "rule__BusinessRule__Group__12"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2169:1: rule__BusinessRule__Group__12 : rule__BusinessRule__Group__12__Impl rule__BusinessRule__Group__13 ;
    public final void rule__BusinessRule__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2173:1: ( rule__BusinessRule__Group__12__Impl rule__BusinessRule__Group__13 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2174:2: rule__BusinessRule__Group__12__Impl rule__BusinessRule__Group__13
            {
            pushFollow(FOLLOW_rule__BusinessRule__Group__12__Impl_in_rule__BusinessRule__Group__124471);
            rule__BusinessRule__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BusinessRule__Group__13_in_rule__BusinessRule__Group__124474);
            rule__BusinessRule__Group__13();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2181:1: rule__BusinessRule__Group__12__Impl : ( ( rule__BusinessRule__OutputAssignment_12 ) ) ;
    public final void rule__BusinessRule__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2185:1: ( ( ( rule__BusinessRule__OutputAssignment_12 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2186:1: ( ( rule__BusinessRule__OutputAssignment_12 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2186:1: ( ( rule__BusinessRule__OutputAssignment_12 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2187:1: ( rule__BusinessRule__OutputAssignment_12 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBusinessRuleAccess().getOutputAssignment_12()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2188:1: ( rule__BusinessRule__OutputAssignment_12 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2188:2: rule__BusinessRule__OutputAssignment_12
            {
            pushFollow(FOLLOW_rule__BusinessRule__OutputAssignment_12_in_rule__BusinessRule__Group__12__Impl4501);
            rule__BusinessRule__OutputAssignment_12();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBusinessRuleAccess().getOutputAssignment_12()); 
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
    // $ANTLR end "rule__BusinessRule__Group__12__Impl"


    // $ANTLR start "rule__BusinessRule__Group__13"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2198:1: rule__BusinessRule__Group__13 : rule__BusinessRule__Group__13__Impl rule__BusinessRule__Group__14 ;
    public final void rule__BusinessRule__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2202:1: ( rule__BusinessRule__Group__13__Impl rule__BusinessRule__Group__14 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2203:2: rule__BusinessRule__Group__13__Impl rule__BusinessRule__Group__14
            {
            pushFollow(FOLLOW_rule__BusinessRule__Group__13__Impl_in_rule__BusinessRule__Group__134531);
            rule__BusinessRule__Group__13__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BusinessRule__Group__14_in_rule__BusinessRule__Group__134534);
            rule__BusinessRule__Group__14();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2210:1: rule__BusinessRule__Group__13__Impl : ( ']' ) ;
    public final void rule__BusinessRule__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2214:1: ( ( ']' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2215:1: ( ']' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2215:1: ( ']' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2216:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBusinessRuleAccess().getRightSquareBracketKeyword_13()); 
            }
            match(input,29,FOLLOW_29_in_rule__BusinessRule__Group__13__Impl4562); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBusinessRuleAccess().getRightSquareBracketKeyword_13()); 
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
    // $ANTLR end "rule__BusinessRule__Group__13__Impl"


    // $ANTLR start "rule__BusinessRule__Group__14"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2229:1: rule__BusinessRule__Group__14 : rule__BusinessRule__Group__14__Impl ;
    public final void rule__BusinessRule__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2233:1: ( rule__BusinessRule__Group__14__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2234:2: rule__BusinessRule__Group__14__Impl
            {
            pushFollow(FOLLOW_rule__BusinessRule__Group__14__Impl_in_rule__BusinessRule__Group__144593);
            rule__BusinessRule__Group__14__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2240:1: rule__BusinessRule__Group__14__Impl : ( '}' ) ;
    public final void rule__BusinessRule__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2244:1: ( ( '}' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2245:1: ( '}' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2245:1: ( '}' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2246:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBusinessRuleAccess().getRightCurlyBracketKeyword_14()); 
            }
            match(input,23,FOLLOW_23_in_rule__BusinessRule__Group__14__Impl4621); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBusinessRuleAccess().getRightCurlyBracketKeyword_14()); 
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
    // $ANTLR end "rule__BusinessRule__Group__14__Impl"


    // $ANTLR start "rule__BreSystemEntityInput__Group__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2289:1: rule__BreSystemEntityInput__Group__0 : rule__BreSystemEntityInput__Group__0__Impl rule__BreSystemEntityInput__Group__1 ;
    public final void rule__BreSystemEntityInput__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2293:1: ( rule__BreSystemEntityInput__Group__0__Impl rule__BreSystemEntityInput__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2294:2: rule__BreSystemEntityInput__Group__0__Impl rule__BreSystemEntityInput__Group__1
            {
            pushFollow(FOLLOW_rule__BreSystemEntityInput__Group__0__Impl_in_rule__BreSystemEntityInput__Group__04682);
            rule__BreSystemEntityInput__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BreSystemEntityInput__Group__1_in_rule__BreSystemEntityInput__Group__04685);
            rule__BreSystemEntityInput__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BreSystemEntityInput__Group__0"


    // $ANTLR start "rule__BreSystemEntityInput__Group__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2301:1: rule__BreSystemEntityInput__Group__0__Impl : ( ( rule__BreSystemEntityInput__InputElementAssignment_0 ) ) ;
    public final void rule__BreSystemEntityInput__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2305:1: ( ( ( rule__BreSystemEntityInput__InputElementAssignment_0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2306:1: ( ( rule__BreSystemEntityInput__InputElementAssignment_0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2306:1: ( ( rule__BreSystemEntityInput__InputElementAssignment_0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2307:1: ( rule__BreSystemEntityInput__InputElementAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBreSystemEntityInputAccess().getInputElementAssignment_0()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2308:1: ( rule__BreSystemEntityInput__InputElementAssignment_0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2308:2: rule__BreSystemEntityInput__InputElementAssignment_0
            {
            pushFollow(FOLLOW_rule__BreSystemEntityInput__InputElementAssignment_0_in_rule__BreSystemEntityInput__Group__0__Impl4712);
            rule__BreSystemEntityInput__InputElementAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBreSystemEntityInputAccess().getInputElementAssignment_0()); 
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
    // $ANTLR end "rule__BreSystemEntityInput__Group__0__Impl"


    // $ANTLR start "rule__BreSystemEntityInput__Group__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2318:1: rule__BreSystemEntityInput__Group__1 : rule__BreSystemEntityInput__Group__1__Impl ;
    public final void rule__BreSystemEntityInput__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2322:1: ( rule__BreSystemEntityInput__Group__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2323:2: rule__BreSystemEntityInput__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BreSystemEntityInput__Group__1__Impl_in_rule__BreSystemEntityInput__Group__14742);
            rule__BreSystemEntityInput__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BreSystemEntityInput__Group__1"


    // $ANTLR start "rule__BreSystemEntityInput__Group__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2329:1: rule__BreSystemEntityInput__Group__1__Impl : ( ( rule__BreSystemEntityInput__ConfigurationAssignment_1 ) ) ;
    public final void rule__BreSystemEntityInput__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2333:1: ( ( ( rule__BreSystemEntityInput__ConfigurationAssignment_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2334:1: ( ( rule__BreSystemEntityInput__ConfigurationAssignment_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2334:1: ( ( rule__BreSystemEntityInput__ConfigurationAssignment_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2335:1: ( rule__BreSystemEntityInput__ConfigurationAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBreSystemEntityInputAccess().getConfigurationAssignment_1()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2336:1: ( rule__BreSystemEntityInput__ConfigurationAssignment_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2336:2: rule__BreSystemEntityInput__ConfigurationAssignment_1
            {
            pushFollow(FOLLOW_rule__BreSystemEntityInput__ConfigurationAssignment_1_in_rule__BreSystemEntityInput__Group__1__Impl4769);
            rule__BreSystemEntityInput__ConfigurationAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBreSystemEntityInputAccess().getConfigurationAssignment_1()); 
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
    // $ANTLR end "rule__BreSystemEntityInput__Group__1__Impl"


    // $ANTLR start "rule__BreEntityInput__Group__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2350:1: rule__BreEntityInput__Group__0 : rule__BreEntityInput__Group__0__Impl rule__BreEntityInput__Group__1 ;
    public final void rule__BreEntityInput__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2354:1: ( rule__BreEntityInput__Group__0__Impl rule__BreEntityInput__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2355:2: rule__BreEntityInput__Group__0__Impl rule__BreEntityInput__Group__1
            {
            pushFollow(FOLLOW_rule__BreEntityInput__Group__0__Impl_in_rule__BreEntityInput__Group__04803);
            rule__BreEntityInput__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BreEntityInput__Group__1_in_rule__BreEntityInput__Group__04806);
            rule__BreEntityInput__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2362:1: rule__BreEntityInput__Group__0__Impl : ( ( rule__BreEntityInput__InputElementAssignment_0 ) ) ;
    public final void rule__BreEntityInput__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2366:1: ( ( ( rule__BreEntityInput__InputElementAssignment_0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2367:1: ( ( rule__BreEntityInput__InputElementAssignment_0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2367:1: ( ( rule__BreEntityInput__InputElementAssignment_0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2368:1: ( rule__BreEntityInput__InputElementAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBreEntityInputAccess().getInputElementAssignment_0()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2369:1: ( rule__BreEntityInput__InputElementAssignment_0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2369:2: rule__BreEntityInput__InputElementAssignment_0
            {
            pushFollow(FOLLOW_rule__BreEntityInput__InputElementAssignment_0_in_rule__BreEntityInput__Group__0__Impl4833);
            rule__BreEntityInput__InputElementAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBreEntityInputAccess().getInputElementAssignment_0()); 
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
    // $ANTLR end "rule__BreEntityInput__Group__0__Impl"


    // $ANTLR start "rule__BreEntityInput__Group__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2379:1: rule__BreEntityInput__Group__1 : rule__BreEntityInput__Group__1__Impl ;
    public final void rule__BreEntityInput__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2383:1: ( rule__BreEntityInput__Group__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2384:2: rule__BreEntityInput__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BreEntityInput__Group__1__Impl_in_rule__BreEntityInput__Group__14863);
            rule__BreEntityInput__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2390:1: rule__BreEntityInput__Group__1__Impl : ( ( rule__BreEntityInput__ConfigurationAssignment_1 ) ) ;
    public final void rule__BreEntityInput__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2394:1: ( ( ( rule__BreEntityInput__ConfigurationAssignment_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2395:1: ( ( rule__BreEntityInput__ConfigurationAssignment_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2395:1: ( ( rule__BreEntityInput__ConfigurationAssignment_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2396:1: ( rule__BreEntityInput__ConfigurationAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBreEntityInputAccess().getConfigurationAssignment_1()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2397:1: ( rule__BreEntityInput__ConfigurationAssignment_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2397:2: rule__BreEntityInput__ConfigurationAssignment_1
            {
            pushFollow(FOLLOW_rule__BreEntityInput__ConfigurationAssignment_1_in_rule__BreEntityInput__Group__1__Impl4890);
            rule__BreEntityInput__ConfigurationAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBreEntityInputAccess().getConfigurationAssignment_1()); 
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
    // $ANTLR end "rule__BreEntityInput__Group__1__Impl"


    // $ANTLR start "rule__SystemEntityConfiguration__Group__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2411:1: rule__SystemEntityConfiguration__Group__0 : rule__SystemEntityConfiguration__Group__0__Impl rule__SystemEntityConfiguration__Group__1 ;
    public final void rule__SystemEntityConfiguration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2415:1: ( rule__SystemEntityConfiguration__Group__0__Impl rule__SystemEntityConfiguration__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2416:2: rule__SystemEntityConfiguration__Group__0__Impl rule__SystemEntityConfiguration__Group__1
            {
            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group__0__Impl_in_rule__SystemEntityConfiguration__Group__04924);
            rule__SystemEntityConfiguration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group__1_in_rule__SystemEntityConfiguration__Group__04927);
            rule__SystemEntityConfiguration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEntityConfiguration__Group__0"


    // $ANTLR start "rule__SystemEntityConfiguration__Group__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2423:1: rule__SystemEntityConfiguration__Group__0__Impl : ( () ) ;
    public final void rule__SystemEntityConfiguration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2427:1: ( ( () ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2428:1: ( () )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2428:1: ( () )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2429:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemEntityConfigurationAccess().getSystemEntityConfigurationAction_0()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2430:1: ()
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2432:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemEntityConfigurationAccess().getSystemEntityConfigurationAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEntityConfiguration__Group__0__Impl"


    // $ANTLR start "rule__SystemEntityConfiguration__Group__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2442:1: rule__SystemEntityConfiguration__Group__1 : rule__SystemEntityConfiguration__Group__1__Impl rule__SystemEntityConfiguration__Group__2 ;
    public final void rule__SystemEntityConfiguration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2446:1: ( rule__SystemEntityConfiguration__Group__1__Impl rule__SystemEntityConfiguration__Group__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2447:2: rule__SystemEntityConfiguration__Group__1__Impl rule__SystemEntityConfiguration__Group__2
            {
            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group__1__Impl_in_rule__SystemEntityConfiguration__Group__14985);
            rule__SystemEntityConfiguration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group__2_in_rule__SystemEntityConfiguration__Group__14988);
            rule__SystemEntityConfiguration__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEntityConfiguration__Group__1"


    // $ANTLR start "rule__SystemEntityConfiguration__Group__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2454:1: rule__SystemEntityConfiguration__Group__1__Impl : ( '{' ) ;
    public final void rule__SystemEntityConfiguration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2458:1: ( ( '{' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2459:1: ( '{' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2459:1: ( '{' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2460:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemEntityConfigurationAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,22,FOLLOW_22_in_rule__SystemEntityConfiguration__Group__1__Impl5016); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemEntityConfigurationAccess().getLeftCurlyBracketKeyword_1()); 
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
    // $ANTLR end "rule__SystemEntityConfiguration__Group__1__Impl"


    // $ANTLR start "rule__SystemEntityConfiguration__Group__2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2473:1: rule__SystemEntityConfiguration__Group__2 : rule__SystemEntityConfiguration__Group__2__Impl rule__SystemEntityConfiguration__Group__3 ;
    public final void rule__SystemEntityConfiguration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2477:1: ( rule__SystemEntityConfiguration__Group__2__Impl rule__SystemEntityConfiguration__Group__3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2478:2: rule__SystemEntityConfiguration__Group__2__Impl rule__SystemEntityConfiguration__Group__3
            {
            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group__2__Impl_in_rule__SystemEntityConfiguration__Group__25047);
            rule__SystemEntityConfiguration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group__3_in_rule__SystemEntityConfiguration__Group__25050);
            rule__SystemEntityConfiguration__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEntityConfiguration__Group__2"


    // $ANTLR start "rule__SystemEntityConfiguration__Group__2__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2485:1: rule__SystemEntityConfiguration__Group__2__Impl : ( 'prim\\u00E4r' ) ;
    public final void rule__SystemEntityConfiguration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2489:1: ( ( 'prim\\u00E4r' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2490:1: ( 'prim\\u00E4r' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2490:1: ( 'prim\\u00E4r' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2491:1: 'prim\\u00E4r'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemEntityConfigurationAccess().getPrimärKeyword_2()); 
            }
            match(input,36,FOLLOW_36_in_rule__SystemEntityConfiguration__Group__2__Impl5078); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemEntityConfigurationAccess().getPrimärKeyword_2()); 
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
    // $ANTLR end "rule__SystemEntityConfiguration__Group__2__Impl"


    // $ANTLR start "rule__SystemEntityConfiguration__Group__3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2504:1: rule__SystemEntityConfiguration__Group__3 : rule__SystemEntityConfiguration__Group__3__Impl rule__SystemEntityConfiguration__Group__4 ;
    public final void rule__SystemEntityConfiguration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2508:1: ( rule__SystemEntityConfiguration__Group__3__Impl rule__SystemEntityConfiguration__Group__4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2509:2: rule__SystemEntityConfiguration__Group__3__Impl rule__SystemEntityConfiguration__Group__4
            {
            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group__3__Impl_in_rule__SystemEntityConfiguration__Group__35109);
            rule__SystemEntityConfiguration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group__4_in_rule__SystemEntityConfiguration__Group__35112);
            rule__SystemEntityConfiguration__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEntityConfiguration__Group__3"


    // $ANTLR start "rule__SystemEntityConfiguration__Group__3__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2516:1: rule__SystemEntityConfiguration__Group__3__Impl : ( '=' ) ;
    public final void rule__SystemEntityConfiguration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2520:1: ( ( '=' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2521:1: ( '=' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2521:1: ( '=' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2522:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemEntityConfigurationAccess().getEqualsSignKeyword_3()); 
            }
            match(input,37,FOLLOW_37_in_rule__SystemEntityConfiguration__Group__3__Impl5140); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemEntityConfigurationAccess().getEqualsSignKeyword_3()); 
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
    // $ANTLR end "rule__SystemEntityConfiguration__Group__3__Impl"


    // $ANTLR start "rule__SystemEntityConfiguration__Group__4"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2535:1: rule__SystemEntityConfiguration__Group__4 : rule__SystemEntityConfiguration__Group__4__Impl rule__SystemEntityConfiguration__Group__5 ;
    public final void rule__SystemEntityConfiguration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2539:1: ( rule__SystemEntityConfiguration__Group__4__Impl rule__SystemEntityConfiguration__Group__5 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2540:2: rule__SystemEntityConfiguration__Group__4__Impl rule__SystemEntityConfiguration__Group__5
            {
            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group__4__Impl_in_rule__SystemEntityConfiguration__Group__45171);
            rule__SystemEntityConfiguration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group__5_in_rule__SystemEntityConfiguration__Group__45174);
            rule__SystemEntityConfiguration__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEntityConfiguration__Group__4"


    // $ANTLR start "rule__SystemEntityConfiguration__Group__4__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2547:1: rule__SystemEntityConfiguration__Group__4__Impl : ( ( rule__SystemEntityConfiguration__PrimaryAssignment_4 ) ) ;
    public final void rule__SystemEntityConfiguration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2551:1: ( ( ( rule__SystemEntityConfiguration__PrimaryAssignment_4 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2552:1: ( ( rule__SystemEntityConfiguration__PrimaryAssignment_4 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2552:1: ( ( rule__SystemEntityConfiguration__PrimaryAssignment_4 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2553:1: ( rule__SystemEntityConfiguration__PrimaryAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemEntityConfigurationAccess().getPrimaryAssignment_4()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2554:1: ( rule__SystemEntityConfiguration__PrimaryAssignment_4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2554:2: rule__SystemEntityConfiguration__PrimaryAssignment_4
            {
            pushFollow(FOLLOW_rule__SystemEntityConfiguration__PrimaryAssignment_4_in_rule__SystemEntityConfiguration__Group__4__Impl5201);
            rule__SystemEntityConfiguration__PrimaryAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemEntityConfigurationAccess().getPrimaryAssignment_4()); 
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
    // $ANTLR end "rule__SystemEntityConfiguration__Group__4__Impl"


    // $ANTLR start "rule__SystemEntityConfiguration__Group__5"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2564:1: rule__SystemEntityConfiguration__Group__5 : rule__SystemEntityConfiguration__Group__5__Impl rule__SystemEntityConfiguration__Group__6 ;
    public final void rule__SystemEntityConfiguration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2568:1: ( rule__SystemEntityConfiguration__Group__5__Impl rule__SystemEntityConfiguration__Group__6 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2569:2: rule__SystemEntityConfiguration__Group__5__Impl rule__SystemEntityConfiguration__Group__6
            {
            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group__5__Impl_in_rule__SystemEntityConfiguration__Group__55231);
            rule__SystemEntityConfiguration__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group__6_in_rule__SystemEntityConfiguration__Group__55234);
            rule__SystemEntityConfiguration__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEntityConfiguration__Group__5"


    // $ANTLR start "rule__SystemEntityConfiguration__Group__5__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2576:1: rule__SystemEntityConfiguration__Group__5__Impl : ( ',' ) ;
    public final void rule__SystemEntityConfiguration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2580:1: ( ( ',' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2581:1: ( ',' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2581:1: ( ',' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2582:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemEntityConfigurationAccess().getCommaKeyword_5()); 
            }
            match(input,30,FOLLOW_30_in_rule__SystemEntityConfiguration__Group__5__Impl5262); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemEntityConfigurationAccess().getCommaKeyword_5()); 
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
    // $ANTLR end "rule__SystemEntityConfiguration__Group__5__Impl"


    // $ANTLR start "rule__SystemEntityConfiguration__Group__6"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2595:1: rule__SystemEntityConfiguration__Group__6 : rule__SystemEntityConfiguration__Group__6__Impl rule__SystemEntityConfiguration__Group__7 ;
    public final void rule__SystemEntityConfiguration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2599:1: ( rule__SystemEntityConfiguration__Group__6__Impl rule__SystemEntityConfiguration__Group__7 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2600:2: rule__SystemEntityConfiguration__Group__6__Impl rule__SystemEntityConfiguration__Group__7
            {
            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group__6__Impl_in_rule__SystemEntityConfiguration__Group__65293);
            rule__SystemEntityConfiguration__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group__7_in_rule__SystemEntityConfiguration__Group__65296);
            rule__SystemEntityConfiguration__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEntityConfiguration__Group__6"


    // $ANTLR start "rule__SystemEntityConfiguration__Group__6__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2607:1: rule__SystemEntityConfiguration__Group__6__Impl : ( 'obligatorisch' ) ;
    public final void rule__SystemEntityConfiguration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2611:1: ( ( 'obligatorisch' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2612:1: ( 'obligatorisch' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2612:1: ( 'obligatorisch' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2613:1: 'obligatorisch'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemEntityConfigurationAccess().getObligatorischKeyword_6()); 
            }
            match(input,38,FOLLOW_38_in_rule__SystemEntityConfiguration__Group__6__Impl5324); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemEntityConfigurationAccess().getObligatorischKeyword_6()); 
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
    // $ANTLR end "rule__SystemEntityConfiguration__Group__6__Impl"


    // $ANTLR start "rule__SystemEntityConfiguration__Group__7"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2626:1: rule__SystemEntityConfiguration__Group__7 : rule__SystemEntityConfiguration__Group__7__Impl rule__SystemEntityConfiguration__Group__8 ;
    public final void rule__SystemEntityConfiguration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2630:1: ( rule__SystemEntityConfiguration__Group__7__Impl rule__SystemEntityConfiguration__Group__8 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2631:2: rule__SystemEntityConfiguration__Group__7__Impl rule__SystemEntityConfiguration__Group__8
            {
            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group__7__Impl_in_rule__SystemEntityConfiguration__Group__75355);
            rule__SystemEntityConfiguration__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group__8_in_rule__SystemEntityConfiguration__Group__75358);
            rule__SystemEntityConfiguration__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEntityConfiguration__Group__7"


    // $ANTLR start "rule__SystemEntityConfiguration__Group__7__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2638:1: rule__SystemEntityConfiguration__Group__7__Impl : ( '=' ) ;
    public final void rule__SystemEntityConfiguration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2642:1: ( ( '=' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2643:1: ( '=' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2643:1: ( '=' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2644:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemEntityConfigurationAccess().getEqualsSignKeyword_7()); 
            }
            match(input,37,FOLLOW_37_in_rule__SystemEntityConfiguration__Group__7__Impl5386); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemEntityConfigurationAccess().getEqualsSignKeyword_7()); 
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
    // $ANTLR end "rule__SystemEntityConfiguration__Group__7__Impl"


    // $ANTLR start "rule__SystemEntityConfiguration__Group__8"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2657:1: rule__SystemEntityConfiguration__Group__8 : rule__SystemEntityConfiguration__Group__8__Impl rule__SystemEntityConfiguration__Group__9 ;
    public final void rule__SystemEntityConfiguration__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2661:1: ( rule__SystemEntityConfiguration__Group__8__Impl rule__SystemEntityConfiguration__Group__9 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2662:2: rule__SystemEntityConfiguration__Group__8__Impl rule__SystemEntityConfiguration__Group__9
            {
            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group__8__Impl_in_rule__SystemEntityConfiguration__Group__85417);
            rule__SystemEntityConfiguration__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group__9_in_rule__SystemEntityConfiguration__Group__85420);
            rule__SystemEntityConfiguration__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEntityConfiguration__Group__8"


    // $ANTLR start "rule__SystemEntityConfiguration__Group__8__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2669:1: rule__SystemEntityConfiguration__Group__8__Impl : ( ( rule__SystemEntityConfiguration__ObligatorischAssignment_8 ) ) ;
    public final void rule__SystemEntityConfiguration__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2673:1: ( ( ( rule__SystemEntityConfiguration__ObligatorischAssignment_8 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2674:1: ( ( rule__SystemEntityConfiguration__ObligatorischAssignment_8 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2674:1: ( ( rule__SystemEntityConfiguration__ObligatorischAssignment_8 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2675:1: ( rule__SystemEntityConfiguration__ObligatorischAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemEntityConfigurationAccess().getObligatorischAssignment_8()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2676:1: ( rule__SystemEntityConfiguration__ObligatorischAssignment_8 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2676:2: rule__SystemEntityConfiguration__ObligatorischAssignment_8
            {
            pushFollow(FOLLOW_rule__SystemEntityConfiguration__ObligatorischAssignment_8_in_rule__SystemEntityConfiguration__Group__8__Impl5447);
            rule__SystemEntityConfiguration__ObligatorischAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemEntityConfigurationAccess().getObligatorischAssignment_8()); 
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
    // $ANTLR end "rule__SystemEntityConfiguration__Group__8__Impl"


    // $ANTLR start "rule__SystemEntityConfiguration__Group__9"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2686:1: rule__SystemEntityConfiguration__Group__9 : rule__SystemEntityConfiguration__Group__9__Impl rule__SystemEntityConfiguration__Group__10 ;
    public final void rule__SystemEntityConfiguration__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2690:1: ( rule__SystemEntityConfiguration__Group__9__Impl rule__SystemEntityConfiguration__Group__10 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2691:2: rule__SystemEntityConfiguration__Group__9__Impl rule__SystemEntityConfiguration__Group__10
            {
            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group__9__Impl_in_rule__SystemEntityConfiguration__Group__95477);
            rule__SystemEntityConfiguration__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group__10_in_rule__SystemEntityConfiguration__Group__95480);
            rule__SystemEntityConfiguration__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEntityConfiguration__Group__9"


    // $ANTLR start "rule__SystemEntityConfiguration__Group__9__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2698:1: rule__SystemEntityConfiguration__Group__9__Impl : ( ',' ) ;
    public final void rule__SystemEntityConfiguration__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2702:1: ( ( ',' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2703:1: ( ',' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2703:1: ( ',' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2704:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemEntityConfigurationAccess().getCommaKeyword_9()); 
            }
            match(input,30,FOLLOW_30_in_rule__SystemEntityConfiguration__Group__9__Impl5508); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemEntityConfigurationAccess().getCommaKeyword_9()); 
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
    // $ANTLR end "rule__SystemEntityConfiguration__Group__9__Impl"


    // $ANTLR start "rule__SystemEntityConfiguration__Group__10"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2717:1: rule__SystemEntityConfiguration__Group__10 : rule__SystemEntityConfiguration__Group__10__Impl rule__SystemEntityConfiguration__Group__11 ;
    public final void rule__SystemEntityConfiguration__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2721:1: ( rule__SystemEntityConfiguration__Group__10__Impl rule__SystemEntityConfiguration__Group__11 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2722:2: rule__SystemEntityConfiguration__Group__10__Impl rule__SystemEntityConfiguration__Group__11
            {
            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group__10__Impl_in_rule__SystemEntityConfiguration__Group__105539);
            rule__SystemEntityConfiguration__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group__11_in_rule__SystemEntityConfiguration__Group__105542);
            rule__SystemEntityConfiguration__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEntityConfiguration__Group__10"


    // $ANTLR start "rule__SystemEntityConfiguration__Group__10__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2729:1: rule__SystemEntityConfiguration__Group__10__Impl : ( 'mehrfach' ) ;
    public final void rule__SystemEntityConfiguration__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2733:1: ( ( 'mehrfach' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2734:1: ( 'mehrfach' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2734:1: ( 'mehrfach' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2735:1: 'mehrfach'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemEntityConfigurationAccess().getMehrfachKeyword_10()); 
            }
            match(input,39,FOLLOW_39_in_rule__SystemEntityConfiguration__Group__10__Impl5570); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemEntityConfigurationAccess().getMehrfachKeyword_10()); 
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
    // $ANTLR end "rule__SystemEntityConfiguration__Group__10__Impl"


    // $ANTLR start "rule__SystemEntityConfiguration__Group__11"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2748:1: rule__SystemEntityConfiguration__Group__11 : rule__SystemEntityConfiguration__Group__11__Impl rule__SystemEntityConfiguration__Group__12 ;
    public final void rule__SystemEntityConfiguration__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2752:1: ( rule__SystemEntityConfiguration__Group__11__Impl rule__SystemEntityConfiguration__Group__12 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2753:2: rule__SystemEntityConfiguration__Group__11__Impl rule__SystemEntityConfiguration__Group__12
            {
            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group__11__Impl_in_rule__SystemEntityConfiguration__Group__115601);
            rule__SystemEntityConfiguration__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group__12_in_rule__SystemEntityConfiguration__Group__115604);
            rule__SystemEntityConfiguration__Group__12();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEntityConfiguration__Group__11"


    // $ANTLR start "rule__SystemEntityConfiguration__Group__11__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2760:1: rule__SystemEntityConfiguration__Group__11__Impl : ( '=' ) ;
    public final void rule__SystemEntityConfiguration__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2764:1: ( ( '=' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2765:1: ( '=' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2765:1: ( '=' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2766:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemEntityConfigurationAccess().getEqualsSignKeyword_11()); 
            }
            match(input,37,FOLLOW_37_in_rule__SystemEntityConfiguration__Group__11__Impl5632); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemEntityConfigurationAccess().getEqualsSignKeyword_11()); 
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
    // $ANTLR end "rule__SystemEntityConfiguration__Group__11__Impl"


    // $ANTLR start "rule__SystemEntityConfiguration__Group__12"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2779:1: rule__SystemEntityConfiguration__Group__12 : rule__SystemEntityConfiguration__Group__12__Impl rule__SystemEntityConfiguration__Group__13 ;
    public final void rule__SystemEntityConfiguration__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2783:1: ( rule__SystemEntityConfiguration__Group__12__Impl rule__SystemEntityConfiguration__Group__13 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2784:2: rule__SystemEntityConfiguration__Group__12__Impl rule__SystemEntityConfiguration__Group__13
            {
            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group__12__Impl_in_rule__SystemEntityConfiguration__Group__125663);
            rule__SystemEntityConfiguration__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group__13_in_rule__SystemEntityConfiguration__Group__125666);
            rule__SystemEntityConfiguration__Group__13();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEntityConfiguration__Group__12"


    // $ANTLR start "rule__SystemEntityConfiguration__Group__12__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2791:1: rule__SystemEntityConfiguration__Group__12__Impl : ( ( rule__SystemEntityConfiguration__MultipleAssignment_12 ) ) ;
    public final void rule__SystemEntityConfiguration__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2795:1: ( ( ( rule__SystemEntityConfiguration__MultipleAssignment_12 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2796:1: ( ( rule__SystemEntityConfiguration__MultipleAssignment_12 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2796:1: ( ( rule__SystemEntityConfiguration__MultipleAssignment_12 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2797:1: ( rule__SystemEntityConfiguration__MultipleAssignment_12 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemEntityConfigurationAccess().getMultipleAssignment_12()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2798:1: ( rule__SystemEntityConfiguration__MultipleAssignment_12 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2798:2: rule__SystemEntityConfiguration__MultipleAssignment_12
            {
            pushFollow(FOLLOW_rule__SystemEntityConfiguration__MultipleAssignment_12_in_rule__SystemEntityConfiguration__Group__12__Impl5693);
            rule__SystemEntityConfiguration__MultipleAssignment_12();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemEntityConfigurationAccess().getMultipleAssignment_12()); 
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
    // $ANTLR end "rule__SystemEntityConfiguration__Group__12__Impl"


    // $ANTLR start "rule__SystemEntityConfiguration__Group__13"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2808:1: rule__SystemEntityConfiguration__Group__13 : rule__SystemEntityConfiguration__Group__13__Impl ;
    public final void rule__SystemEntityConfiguration__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2812:1: ( rule__SystemEntityConfiguration__Group__13__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2813:2: rule__SystemEntityConfiguration__Group__13__Impl
            {
            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group__13__Impl_in_rule__SystemEntityConfiguration__Group__135723);
            rule__SystemEntityConfiguration__Group__13__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEntityConfiguration__Group__13"


    // $ANTLR start "rule__SystemEntityConfiguration__Group__13__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2819:1: rule__SystemEntityConfiguration__Group__13__Impl : ( ( rule__SystemEntityConfiguration__Group_13__0 )? ) ;
    public final void rule__SystemEntityConfiguration__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2823:1: ( ( ( rule__SystemEntityConfiguration__Group_13__0 )? ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2824:1: ( ( rule__SystemEntityConfiguration__Group_13__0 )? )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2824:1: ( ( rule__SystemEntityConfiguration__Group_13__0 )? )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2825:1: ( rule__SystemEntityConfiguration__Group_13__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemEntityConfigurationAccess().getGroup_13()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2826:1: ( rule__SystemEntityConfiguration__Group_13__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2826:2: rule__SystemEntityConfiguration__Group_13__0
                    {
                    pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group_13__0_in_rule__SystemEntityConfiguration__Group__13__Impl5750);
                    rule__SystemEntityConfiguration__Group_13__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemEntityConfigurationAccess().getGroup_13()); 
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
    // $ANTLR end "rule__SystemEntityConfiguration__Group__13__Impl"


    // $ANTLR start "rule__SystemEntityConfiguration__Group_13__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2864:1: rule__SystemEntityConfiguration__Group_13__0 : rule__SystemEntityConfiguration__Group_13__0__Impl rule__SystemEntityConfiguration__Group_13__1 ;
    public final void rule__SystemEntityConfiguration__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2868:1: ( rule__SystemEntityConfiguration__Group_13__0__Impl rule__SystemEntityConfiguration__Group_13__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2869:2: rule__SystemEntityConfiguration__Group_13__0__Impl rule__SystemEntityConfiguration__Group_13__1
            {
            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group_13__0__Impl_in_rule__SystemEntityConfiguration__Group_13__05809);
            rule__SystemEntityConfiguration__Group_13__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group_13__1_in_rule__SystemEntityConfiguration__Group_13__05812);
            rule__SystemEntityConfiguration__Group_13__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEntityConfiguration__Group_13__0"


    // $ANTLR start "rule__SystemEntityConfiguration__Group_13__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2876:1: rule__SystemEntityConfiguration__Group_13__0__Impl : ( ',' ) ;
    public final void rule__SystemEntityConfiguration__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2880:1: ( ( ',' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2881:1: ( ',' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2881:1: ( ',' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2882:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemEntityConfigurationAccess().getCommaKeyword_13_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__SystemEntityConfiguration__Group_13__0__Impl5840); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemEntityConfigurationAccess().getCommaKeyword_13_0()); 
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
    // $ANTLR end "rule__SystemEntityConfiguration__Group_13__0__Impl"


    // $ANTLR start "rule__SystemEntityConfiguration__Group_13__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2895:1: rule__SystemEntityConfiguration__Group_13__1 : rule__SystemEntityConfiguration__Group_13__1__Impl rule__SystemEntityConfiguration__Group_13__2 ;
    public final void rule__SystemEntityConfiguration__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2899:1: ( rule__SystemEntityConfiguration__Group_13__1__Impl rule__SystemEntityConfiguration__Group_13__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2900:2: rule__SystemEntityConfiguration__Group_13__1__Impl rule__SystemEntityConfiguration__Group_13__2
            {
            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group_13__1__Impl_in_rule__SystemEntityConfiguration__Group_13__15871);
            rule__SystemEntityConfiguration__Group_13__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group_13__2_in_rule__SystemEntityConfiguration__Group_13__15874);
            rule__SystemEntityConfiguration__Group_13__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEntityConfiguration__Group_13__1"


    // $ANTLR start "rule__SystemEntityConfiguration__Group_13__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2907:1: rule__SystemEntityConfiguration__Group_13__1__Impl : ( 'join Pfad' ) ;
    public final void rule__SystemEntityConfiguration__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2911:1: ( ( 'join Pfad' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2912:1: ( 'join Pfad' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2912:1: ( 'join Pfad' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2913:1: 'join Pfad'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemEntityConfigurationAccess().getJoinPfadKeyword_13_1()); 
            }
            match(input,40,FOLLOW_40_in_rule__SystemEntityConfiguration__Group_13__1__Impl5902); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemEntityConfigurationAccess().getJoinPfadKeyword_13_1()); 
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
    // $ANTLR end "rule__SystemEntityConfiguration__Group_13__1__Impl"


    // $ANTLR start "rule__SystemEntityConfiguration__Group_13__2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2926:1: rule__SystemEntityConfiguration__Group_13__2 : rule__SystemEntityConfiguration__Group_13__2__Impl rule__SystemEntityConfiguration__Group_13__3 ;
    public final void rule__SystemEntityConfiguration__Group_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2930:1: ( rule__SystemEntityConfiguration__Group_13__2__Impl rule__SystemEntityConfiguration__Group_13__3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2931:2: rule__SystemEntityConfiguration__Group_13__2__Impl rule__SystemEntityConfiguration__Group_13__3
            {
            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group_13__2__Impl_in_rule__SystemEntityConfiguration__Group_13__25933);
            rule__SystemEntityConfiguration__Group_13__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group_13__3_in_rule__SystemEntityConfiguration__Group_13__25936);
            rule__SystemEntityConfiguration__Group_13__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEntityConfiguration__Group_13__2"


    // $ANTLR start "rule__SystemEntityConfiguration__Group_13__2__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2938:1: rule__SystemEntityConfiguration__Group_13__2__Impl : ( '=' ) ;
    public final void rule__SystemEntityConfiguration__Group_13__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2942:1: ( ( '=' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2943:1: ( '=' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2943:1: ( '=' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2944:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemEntityConfigurationAccess().getEqualsSignKeyword_13_2()); 
            }
            match(input,37,FOLLOW_37_in_rule__SystemEntityConfiguration__Group_13__2__Impl5964); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemEntityConfigurationAccess().getEqualsSignKeyword_13_2()); 
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
    // $ANTLR end "rule__SystemEntityConfiguration__Group_13__2__Impl"


    // $ANTLR start "rule__SystemEntityConfiguration__Group_13__3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2957:1: rule__SystemEntityConfiguration__Group_13__3 : rule__SystemEntityConfiguration__Group_13__3__Impl ;
    public final void rule__SystemEntityConfiguration__Group_13__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2961:1: ( rule__SystemEntityConfiguration__Group_13__3__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2962:2: rule__SystemEntityConfiguration__Group_13__3__Impl
            {
            pushFollow(FOLLOW_rule__SystemEntityConfiguration__Group_13__3__Impl_in_rule__SystemEntityConfiguration__Group_13__35995);
            rule__SystemEntityConfiguration__Group_13__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemEntityConfiguration__Group_13__3"


    // $ANTLR start "rule__SystemEntityConfiguration__Group_13__3__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2968:1: rule__SystemEntityConfiguration__Group_13__3__Impl : ( ( rule__SystemEntityConfiguration__JoinCriteriaAssignment_13_3 ) ) ;
    public final void rule__SystemEntityConfiguration__Group_13__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2972:1: ( ( ( rule__SystemEntityConfiguration__JoinCriteriaAssignment_13_3 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2973:1: ( ( rule__SystemEntityConfiguration__JoinCriteriaAssignment_13_3 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2973:1: ( ( rule__SystemEntityConfiguration__JoinCriteriaAssignment_13_3 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2974:1: ( rule__SystemEntityConfiguration__JoinCriteriaAssignment_13_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemEntityConfigurationAccess().getJoinCriteriaAssignment_13_3()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2975:1: ( rule__SystemEntityConfiguration__JoinCriteriaAssignment_13_3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2975:2: rule__SystemEntityConfiguration__JoinCriteriaAssignment_13_3
            {
            pushFollow(FOLLOW_rule__SystemEntityConfiguration__JoinCriteriaAssignment_13_3_in_rule__SystemEntityConfiguration__Group_13__3__Impl6022);
            rule__SystemEntityConfiguration__JoinCriteriaAssignment_13_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemEntityConfigurationAccess().getJoinCriteriaAssignment_13_3()); 
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
    // $ANTLR end "rule__SystemEntityConfiguration__Group_13__3__Impl"


    // $ANTLR start "rule__EntityConfiguration__Group__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2993:1: rule__EntityConfiguration__Group__0 : rule__EntityConfiguration__Group__0__Impl rule__EntityConfiguration__Group__1 ;
    public final void rule__EntityConfiguration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2997:1: ( rule__EntityConfiguration__Group__0__Impl rule__EntityConfiguration__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:2998:2: rule__EntityConfiguration__Group__0__Impl rule__EntityConfiguration__Group__1
            {
            pushFollow(FOLLOW_rule__EntityConfiguration__Group__0__Impl_in_rule__EntityConfiguration__Group__06060);
            rule__EntityConfiguration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EntityConfiguration__Group__1_in_rule__EntityConfiguration__Group__06063);
            rule__EntityConfiguration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityConfiguration__Group__0"


    // $ANTLR start "rule__EntityConfiguration__Group__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3005:1: rule__EntityConfiguration__Group__0__Impl : ( () ) ;
    public final void rule__EntityConfiguration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3009:1: ( ( () ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3010:1: ( () )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3010:1: ( () )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3011:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityConfigurationAccess().getEntityConfigurationAction_0()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3012:1: ()
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3014:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityConfigurationAccess().getEntityConfigurationAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityConfiguration__Group__0__Impl"


    // $ANTLR start "rule__EntityConfiguration__Group__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3024:1: rule__EntityConfiguration__Group__1 : rule__EntityConfiguration__Group__1__Impl rule__EntityConfiguration__Group__2 ;
    public final void rule__EntityConfiguration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3028:1: ( rule__EntityConfiguration__Group__1__Impl rule__EntityConfiguration__Group__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3029:2: rule__EntityConfiguration__Group__1__Impl rule__EntityConfiguration__Group__2
            {
            pushFollow(FOLLOW_rule__EntityConfiguration__Group__1__Impl_in_rule__EntityConfiguration__Group__16121);
            rule__EntityConfiguration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EntityConfiguration__Group__2_in_rule__EntityConfiguration__Group__16124);
            rule__EntityConfiguration__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityConfiguration__Group__1"


    // $ANTLR start "rule__EntityConfiguration__Group__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3036:1: rule__EntityConfiguration__Group__1__Impl : ( '{' ) ;
    public final void rule__EntityConfiguration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3040:1: ( ( '{' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3041:1: ( '{' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3041:1: ( '{' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3042:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityConfigurationAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,22,FOLLOW_22_in_rule__EntityConfiguration__Group__1__Impl6152); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityConfigurationAccess().getLeftCurlyBracketKeyword_1()); 
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
    // $ANTLR end "rule__EntityConfiguration__Group__1__Impl"


    // $ANTLR start "rule__EntityConfiguration__Group__2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3055:1: rule__EntityConfiguration__Group__2 : rule__EntityConfiguration__Group__2__Impl rule__EntityConfiguration__Group__3 ;
    public final void rule__EntityConfiguration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3059:1: ( rule__EntityConfiguration__Group__2__Impl rule__EntityConfiguration__Group__3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3060:2: rule__EntityConfiguration__Group__2__Impl rule__EntityConfiguration__Group__3
            {
            pushFollow(FOLLOW_rule__EntityConfiguration__Group__2__Impl_in_rule__EntityConfiguration__Group__26183);
            rule__EntityConfiguration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EntityConfiguration__Group__3_in_rule__EntityConfiguration__Group__26186);
            rule__EntityConfiguration__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityConfiguration__Group__2"


    // $ANTLR start "rule__EntityConfiguration__Group__2__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3067:1: rule__EntityConfiguration__Group__2__Impl : ( 'prim\\u00E4r' ) ;
    public final void rule__EntityConfiguration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3071:1: ( ( 'prim\\u00E4r' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3072:1: ( 'prim\\u00E4r' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3072:1: ( 'prim\\u00E4r' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3073:1: 'prim\\u00E4r'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityConfigurationAccess().getPrimärKeyword_2()); 
            }
            match(input,36,FOLLOW_36_in_rule__EntityConfiguration__Group__2__Impl6214); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityConfigurationAccess().getPrimärKeyword_2()); 
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
    // $ANTLR end "rule__EntityConfiguration__Group__2__Impl"


    // $ANTLR start "rule__EntityConfiguration__Group__3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3086:1: rule__EntityConfiguration__Group__3 : rule__EntityConfiguration__Group__3__Impl rule__EntityConfiguration__Group__4 ;
    public final void rule__EntityConfiguration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3090:1: ( rule__EntityConfiguration__Group__3__Impl rule__EntityConfiguration__Group__4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3091:2: rule__EntityConfiguration__Group__3__Impl rule__EntityConfiguration__Group__4
            {
            pushFollow(FOLLOW_rule__EntityConfiguration__Group__3__Impl_in_rule__EntityConfiguration__Group__36245);
            rule__EntityConfiguration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EntityConfiguration__Group__4_in_rule__EntityConfiguration__Group__36248);
            rule__EntityConfiguration__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityConfiguration__Group__3"


    // $ANTLR start "rule__EntityConfiguration__Group__3__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3098:1: rule__EntityConfiguration__Group__3__Impl : ( '=' ) ;
    public final void rule__EntityConfiguration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3102:1: ( ( '=' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3103:1: ( '=' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3103:1: ( '=' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3104:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityConfigurationAccess().getEqualsSignKeyword_3()); 
            }
            match(input,37,FOLLOW_37_in_rule__EntityConfiguration__Group__3__Impl6276); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityConfigurationAccess().getEqualsSignKeyword_3()); 
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
    // $ANTLR end "rule__EntityConfiguration__Group__3__Impl"


    // $ANTLR start "rule__EntityConfiguration__Group__4"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3117:1: rule__EntityConfiguration__Group__4 : rule__EntityConfiguration__Group__4__Impl rule__EntityConfiguration__Group__5 ;
    public final void rule__EntityConfiguration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3121:1: ( rule__EntityConfiguration__Group__4__Impl rule__EntityConfiguration__Group__5 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3122:2: rule__EntityConfiguration__Group__4__Impl rule__EntityConfiguration__Group__5
            {
            pushFollow(FOLLOW_rule__EntityConfiguration__Group__4__Impl_in_rule__EntityConfiguration__Group__46307);
            rule__EntityConfiguration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EntityConfiguration__Group__5_in_rule__EntityConfiguration__Group__46310);
            rule__EntityConfiguration__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityConfiguration__Group__4"


    // $ANTLR start "rule__EntityConfiguration__Group__4__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3129:1: rule__EntityConfiguration__Group__4__Impl : ( ( rule__EntityConfiguration__PrimaryAssignment_4 ) ) ;
    public final void rule__EntityConfiguration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3133:1: ( ( ( rule__EntityConfiguration__PrimaryAssignment_4 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3134:1: ( ( rule__EntityConfiguration__PrimaryAssignment_4 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3134:1: ( ( rule__EntityConfiguration__PrimaryAssignment_4 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3135:1: ( rule__EntityConfiguration__PrimaryAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityConfigurationAccess().getPrimaryAssignment_4()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3136:1: ( rule__EntityConfiguration__PrimaryAssignment_4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3136:2: rule__EntityConfiguration__PrimaryAssignment_4
            {
            pushFollow(FOLLOW_rule__EntityConfiguration__PrimaryAssignment_4_in_rule__EntityConfiguration__Group__4__Impl6337);
            rule__EntityConfiguration__PrimaryAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityConfigurationAccess().getPrimaryAssignment_4()); 
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
    // $ANTLR end "rule__EntityConfiguration__Group__4__Impl"


    // $ANTLR start "rule__EntityConfiguration__Group__5"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3146:1: rule__EntityConfiguration__Group__5 : rule__EntityConfiguration__Group__5__Impl rule__EntityConfiguration__Group__6 ;
    public final void rule__EntityConfiguration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3150:1: ( rule__EntityConfiguration__Group__5__Impl rule__EntityConfiguration__Group__6 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3151:2: rule__EntityConfiguration__Group__5__Impl rule__EntityConfiguration__Group__6
            {
            pushFollow(FOLLOW_rule__EntityConfiguration__Group__5__Impl_in_rule__EntityConfiguration__Group__56367);
            rule__EntityConfiguration__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EntityConfiguration__Group__6_in_rule__EntityConfiguration__Group__56370);
            rule__EntityConfiguration__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityConfiguration__Group__5"


    // $ANTLR start "rule__EntityConfiguration__Group__5__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3158:1: rule__EntityConfiguration__Group__5__Impl : ( ',' ) ;
    public final void rule__EntityConfiguration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3162:1: ( ( ',' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3163:1: ( ',' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3163:1: ( ',' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3164:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityConfigurationAccess().getCommaKeyword_5()); 
            }
            match(input,30,FOLLOW_30_in_rule__EntityConfiguration__Group__5__Impl6398); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityConfigurationAccess().getCommaKeyword_5()); 
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
    // $ANTLR end "rule__EntityConfiguration__Group__5__Impl"


    // $ANTLR start "rule__EntityConfiguration__Group__6"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3177:1: rule__EntityConfiguration__Group__6 : rule__EntityConfiguration__Group__6__Impl rule__EntityConfiguration__Group__7 ;
    public final void rule__EntityConfiguration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3181:1: ( rule__EntityConfiguration__Group__6__Impl rule__EntityConfiguration__Group__7 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3182:2: rule__EntityConfiguration__Group__6__Impl rule__EntityConfiguration__Group__7
            {
            pushFollow(FOLLOW_rule__EntityConfiguration__Group__6__Impl_in_rule__EntityConfiguration__Group__66429);
            rule__EntityConfiguration__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EntityConfiguration__Group__7_in_rule__EntityConfiguration__Group__66432);
            rule__EntityConfiguration__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityConfiguration__Group__6"


    // $ANTLR start "rule__EntityConfiguration__Group__6__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3189:1: rule__EntityConfiguration__Group__6__Impl : ( 'obligatorisch' ) ;
    public final void rule__EntityConfiguration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3193:1: ( ( 'obligatorisch' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3194:1: ( 'obligatorisch' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3194:1: ( 'obligatorisch' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3195:1: 'obligatorisch'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityConfigurationAccess().getObligatorischKeyword_6()); 
            }
            match(input,38,FOLLOW_38_in_rule__EntityConfiguration__Group__6__Impl6460); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityConfigurationAccess().getObligatorischKeyword_6()); 
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
    // $ANTLR end "rule__EntityConfiguration__Group__6__Impl"


    // $ANTLR start "rule__EntityConfiguration__Group__7"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3208:1: rule__EntityConfiguration__Group__7 : rule__EntityConfiguration__Group__7__Impl rule__EntityConfiguration__Group__8 ;
    public final void rule__EntityConfiguration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3212:1: ( rule__EntityConfiguration__Group__7__Impl rule__EntityConfiguration__Group__8 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3213:2: rule__EntityConfiguration__Group__7__Impl rule__EntityConfiguration__Group__8
            {
            pushFollow(FOLLOW_rule__EntityConfiguration__Group__7__Impl_in_rule__EntityConfiguration__Group__76491);
            rule__EntityConfiguration__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EntityConfiguration__Group__8_in_rule__EntityConfiguration__Group__76494);
            rule__EntityConfiguration__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityConfiguration__Group__7"


    // $ANTLR start "rule__EntityConfiguration__Group__7__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3220:1: rule__EntityConfiguration__Group__7__Impl : ( '=' ) ;
    public final void rule__EntityConfiguration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3224:1: ( ( '=' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3225:1: ( '=' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3225:1: ( '=' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3226:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityConfigurationAccess().getEqualsSignKeyword_7()); 
            }
            match(input,37,FOLLOW_37_in_rule__EntityConfiguration__Group__7__Impl6522); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityConfigurationAccess().getEqualsSignKeyword_7()); 
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
    // $ANTLR end "rule__EntityConfiguration__Group__7__Impl"


    // $ANTLR start "rule__EntityConfiguration__Group__8"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3239:1: rule__EntityConfiguration__Group__8 : rule__EntityConfiguration__Group__8__Impl rule__EntityConfiguration__Group__9 ;
    public final void rule__EntityConfiguration__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3243:1: ( rule__EntityConfiguration__Group__8__Impl rule__EntityConfiguration__Group__9 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3244:2: rule__EntityConfiguration__Group__8__Impl rule__EntityConfiguration__Group__9
            {
            pushFollow(FOLLOW_rule__EntityConfiguration__Group__8__Impl_in_rule__EntityConfiguration__Group__86553);
            rule__EntityConfiguration__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EntityConfiguration__Group__9_in_rule__EntityConfiguration__Group__86556);
            rule__EntityConfiguration__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityConfiguration__Group__8"


    // $ANTLR start "rule__EntityConfiguration__Group__8__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3251:1: rule__EntityConfiguration__Group__8__Impl : ( ( rule__EntityConfiguration__ObligatorischAssignment_8 ) ) ;
    public final void rule__EntityConfiguration__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3255:1: ( ( ( rule__EntityConfiguration__ObligatorischAssignment_8 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3256:1: ( ( rule__EntityConfiguration__ObligatorischAssignment_8 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3256:1: ( ( rule__EntityConfiguration__ObligatorischAssignment_8 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3257:1: ( rule__EntityConfiguration__ObligatorischAssignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityConfigurationAccess().getObligatorischAssignment_8()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3258:1: ( rule__EntityConfiguration__ObligatorischAssignment_8 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3258:2: rule__EntityConfiguration__ObligatorischAssignment_8
            {
            pushFollow(FOLLOW_rule__EntityConfiguration__ObligatorischAssignment_8_in_rule__EntityConfiguration__Group__8__Impl6583);
            rule__EntityConfiguration__ObligatorischAssignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityConfigurationAccess().getObligatorischAssignment_8()); 
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
    // $ANTLR end "rule__EntityConfiguration__Group__8__Impl"


    // $ANTLR start "rule__EntityConfiguration__Group__9"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3268:1: rule__EntityConfiguration__Group__9 : rule__EntityConfiguration__Group__9__Impl rule__EntityConfiguration__Group__10 ;
    public final void rule__EntityConfiguration__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3272:1: ( rule__EntityConfiguration__Group__9__Impl rule__EntityConfiguration__Group__10 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3273:2: rule__EntityConfiguration__Group__9__Impl rule__EntityConfiguration__Group__10
            {
            pushFollow(FOLLOW_rule__EntityConfiguration__Group__9__Impl_in_rule__EntityConfiguration__Group__96613);
            rule__EntityConfiguration__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EntityConfiguration__Group__10_in_rule__EntityConfiguration__Group__96616);
            rule__EntityConfiguration__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityConfiguration__Group__9"


    // $ANTLR start "rule__EntityConfiguration__Group__9__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3280:1: rule__EntityConfiguration__Group__9__Impl : ( ',' ) ;
    public final void rule__EntityConfiguration__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3284:1: ( ( ',' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3285:1: ( ',' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3285:1: ( ',' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3286:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityConfigurationAccess().getCommaKeyword_9()); 
            }
            match(input,30,FOLLOW_30_in_rule__EntityConfiguration__Group__9__Impl6644); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityConfigurationAccess().getCommaKeyword_9()); 
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
    // $ANTLR end "rule__EntityConfiguration__Group__9__Impl"


    // $ANTLR start "rule__EntityConfiguration__Group__10"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3299:1: rule__EntityConfiguration__Group__10 : rule__EntityConfiguration__Group__10__Impl rule__EntityConfiguration__Group__11 ;
    public final void rule__EntityConfiguration__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3303:1: ( rule__EntityConfiguration__Group__10__Impl rule__EntityConfiguration__Group__11 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3304:2: rule__EntityConfiguration__Group__10__Impl rule__EntityConfiguration__Group__11
            {
            pushFollow(FOLLOW_rule__EntityConfiguration__Group__10__Impl_in_rule__EntityConfiguration__Group__106675);
            rule__EntityConfiguration__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EntityConfiguration__Group__11_in_rule__EntityConfiguration__Group__106678);
            rule__EntityConfiguration__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityConfiguration__Group__10"


    // $ANTLR start "rule__EntityConfiguration__Group__10__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3311:1: rule__EntityConfiguration__Group__10__Impl : ( 'mehrfach' ) ;
    public final void rule__EntityConfiguration__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3315:1: ( ( 'mehrfach' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3316:1: ( 'mehrfach' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3316:1: ( 'mehrfach' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3317:1: 'mehrfach'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityConfigurationAccess().getMehrfachKeyword_10()); 
            }
            match(input,39,FOLLOW_39_in_rule__EntityConfiguration__Group__10__Impl6706); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityConfigurationAccess().getMehrfachKeyword_10()); 
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
    // $ANTLR end "rule__EntityConfiguration__Group__10__Impl"


    // $ANTLR start "rule__EntityConfiguration__Group__11"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3330:1: rule__EntityConfiguration__Group__11 : rule__EntityConfiguration__Group__11__Impl rule__EntityConfiguration__Group__12 ;
    public final void rule__EntityConfiguration__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3334:1: ( rule__EntityConfiguration__Group__11__Impl rule__EntityConfiguration__Group__12 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3335:2: rule__EntityConfiguration__Group__11__Impl rule__EntityConfiguration__Group__12
            {
            pushFollow(FOLLOW_rule__EntityConfiguration__Group__11__Impl_in_rule__EntityConfiguration__Group__116737);
            rule__EntityConfiguration__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EntityConfiguration__Group__12_in_rule__EntityConfiguration__Group__116740);
            rule__EntityConfiguration__Group__12();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityConfiguration__Group__11"


    // $ANTLR start "rule__EntityConfiguration__Group__11__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3342:1: rule__EntityConfiguration__Group__11__Impl : ( '=' ) ;
    public final void rule__EntityConfiguration__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3346:1: ( ( '=' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3347:1: ( '=' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3347:1: ( '=' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3348:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityConfigurationAccess().getEqualsSignKeyword_11()); 
            }
            match(input,37,FOLLOW_37_in_rule__EntityConfiguration__Group__11__Impl6768); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityConfigurationAccess().getEqualsSignKeyword_11()); 
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
    // $ANTLR end "rule__EntityConfiguration__Group__11__Impl"


    // $ANTLR start "rule__EntityConfiguration__Group__12"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3361:1: rule__EntityConfiguration__Group__12 : rule__EntityConfiguration__Group__12__Impl rule__EntityConfiguration__Group__13 ;
    public final void rule__EntityConfiguration__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3365:1: ( rule__EntityConfiguration__Group__12__Impl rule__EntityConfiguration__Group__13 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3366:2: rule__EntityConfiguration__Group__12__Impl rule__EntityConfiguration__Group__13
            {
            pushFollow(FOLLOW_rule__EntityConfiguration__Group__12__Impl_in_rule__EntityConfiguration__Group__126799);
            rule__EntityConfiguration__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EntityConfiguration__Group__13_in_rule__EntityConfiguration__Group__126802);
            rule__EntityConfiguration__Group__13();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityConfiguration__Group__12"


    // $ANTLR start "rule__EntityConfiguration__Group__12__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3373:1: rule__EntityConfiguration__Group__12__Impl : ( ( rule__EntityConfiguration__MultipleAssignment_12 ) ) ;
    public final void rule__EntityConfiguration__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3377:1: ( ( ( rule__EntityConfiguration__MultipleAssignment_12 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3378:1: ( ( rule__EntityConfiguration__MultipleAssignment_12 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3378:1: ( ( rule__EntityConfiguration__MultipleAssignment_12 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3379:1: ( rule__EntityConfiguration__MultipleAssignment_12 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityConfigurationAccess().getMultipleAssignment_12()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3380:1: ( rule__EntityConfiguration__MultipleAssignment_12 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3380:2: rule__EntityConfiguration__MultipleAssignment_12
            {
            pushFollow(FOLLOW_rule__EntityConfiguration__MultipleAssignment_12_in_rule__EntityConfiguration__Group__12__Impl6829);
            rule__EntityConfiguration__MultipleAssignment_12();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityConfigurationAccess().getMultipleAssignment_12()); 
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
    // $ANTLR end "rule__EntityConfiguration__Group__12__Impl"


    // $ANTLR start "rule__EntityConfiguration__Group__13"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3390:1: rule__EntityConfiguration__Group__13 : rule__EntityConfiguration__Group__13__Impl rule__EntityConfiguration__Group__14 ;
    public final void rule__EntityConfiguration__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3394:1: ( rule__EntityConfiguration__Group__13__Impl rule__EntityConfiguration__Group__14 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3395:2: rule__EntityConfiguration__Group__13__Impl rule__EntityConfiguration__Group__14
            {
            pushFollow(FOLLOW_rule__EntityConfiguration__Group__13__Impl_in_rule__EntityConfiguration__Group__136859);
            rule__EntityConfiguration__Group__13__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EntityConfiguration__Group__14_in_rule__EntityConfiguration__Group__136862);
            rule__EntityConfiguration__Group__14();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityConfiguration__Group__13"


    // $ANTLR start "rule__EntityConfiguration__Group__13__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3402:1: rule__EntityConfiguration__Group__13__Impl : ( ( rule__EntityConfiguration__Group_13__0 )? ) ;
    public final void rule__EntityConfiguration__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3406:1: ( ( ( rule__EntityConfiguration__Group_13__0 )? ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3407:1: ( ( rule__EntityConfiguration__Group_13__0 )? )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3407:1: ( ( rule__EntityConfiguration__Group_13__0 )? )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3408:1: ( rule__EntityConfiguration__Group_13__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityConfigurationAccess().getGroup_13()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3409:1: ( rule__EntityConfiguration__Group_13__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==30) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3409:2: rule__EntityConfiguration__Group_13__0
                    {
                    pushFollow(FOLLOW_rule__EntityConfiguration__Group_13__0_in_rule__EntityConfiguration__Group__13__Impl6889);
                    rule__EntityConfiguration__Group_13__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityConfigurationAccess().getGroup_13()); 
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
    // $ANTLR end "rule__EntityConfiguration__Group__13__Impl"


    // $ANTLR start "rule__EntityConfiguration__Group__14"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3419:1: rule__EntityConfiguration__Group__14 : rule__EntityConfiguration__Group__14__Impl ;
    public final void rule__EntityConfiguration__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3423:1: ( rule__EntityConfiguration__Group__14__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3424:2: rule__EntityConfiguration__Group__14__Impl
            {
            pushFollow(FOLLOW_rule__EntityConfiguration__Group__14__Impl_in_rule__EntityConfiguration__Group__146920);
            rule__EntityConfiguration__Group__14__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityConfiguration__Group__14"


    // $ANTLR start "rule__EntityConfiguration__Group__14__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3430:1: rule__EntityConfiguration__Group__14__Impl : ( '}' ) ;
    public final void rule__EntityConfiguration__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3434:1: ( ( '}' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3435:1: ( '}' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3435:1: ( '}' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3436:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityConfigurationAccess().getRightCurlyBracketKeyword_14()); 
            }
            match(input,23,FOLLOW_23_in_rule__EntityConfiguration__Group__14__Impl6948); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityConfigurationAccess().getRightCurlyBracketKeyword_14()); 
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
    // $ANTLR end "rule__EntityConfiguration__Group__14__Impl"


    // $ANTLR start "rule__EntityConfiguration__Group_13__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3479:1: rule__EntityConfiguration__Group_13__0 : rule__EntityConfiguration__Group_13__0__Impl rule__EntityConfiguration__Group_13__1 ;
    public final void rule__EntityConfiguration__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3483:1: ( rule__EntityConfiguration__Group_13__0__Impl rule__EntityConfiguration__Group_13__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3484:2: rule__EntityConfiguration__Group_13__0__Impl rule__EntityConfiguration__Group_13__1
            {
            pushFollow(FOLLOW_rule__EntityConfiguration__Group_13__0__Impl_in_rule__EntityConfiguration__Group_13__07009);
            rule__EntityConfiguration__Group_13__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EntityConfiguration__Group_13__1_in_rule__EntityConfiguration__Group_13__07012);
            rule__EntityConfiguration__Group_13__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityConfiguration__Group_13__0"


    // $ANTLR start "rule__EntityConfiguration__Group_13__0__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3491:1: rule__EntityConfiguration__Group_13__0__Impl : ( ',' ) ;
    public final void rule__EntityConfiguration__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3495:1: ( ( ',' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3496:1: ( ',' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3496:1: ( ',' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3497:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityConfigurationAccess().getCommaKeyword_13_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__EntityConfiguration__Group_13__0__Impl7040); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityConfigurationAccess().getCommaKeyword_13_0()); 
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
    // $ANTLR end "rule__EntityConfiguration__Group_13__0__Impl"


    // $ANTLR start "rule__EntityConfiguration__Group_13__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3510:1: rule__EntityConfiguration__Group_13__1 : rule__EntityConfiguration__Group_13__1__Impl rule__EntityConfiguration__Group_13__2 ;
    public final void rule__EntityConfiguration__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3514:1: ( rule__EntityConfiguration__Group_13__1__Impl rule__EntityConfiguration__Group_13__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3515:2: rule__EntityConfiguration__Group_13__1__Impl rule__EntityConfiguration__Group_13__2
            {
            pushFollow(FOLLOW_rule__EntityConfiguration__Group_13__1__Impl_in_rule__EntityConfiguration__Group_13__17071);
            rule__EntityConfiguration__Group_13__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EntityConfiguration__Group_13__2_in_rule__EntityConfiguration__Group_13__17074);
            rule__EntityConfiguration__Group_13__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityConfiguration__Group_13__1"


    // $ANTLR start "rule__EntityConfiguration__Group_13__1__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3522:1: rule__EntityConfiguration__Group_13__1__Impl : ( 'Pfad' ) ;
    public final void rule__EntityConfiguration__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3526:1: ( ( 'Pfad' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3527:1: ( 'Pfad' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3527:1: ( 'Pfad' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3528:1: 'Pfad'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityConfigurationAccess().getPfadKeyword_13_1()); 
            }
            match(input,41,FOLLOW_41_in_rule__EntityConfiguration__Group_13__1__Impl7102); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityConfigurationAccess().getPfadKeyword_13_1()); 
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
    // $ANTLR end "rule__EntityConfiguration__Group_13__1__Impl"


    // $ANTLR start "rule__EntityConfiguration__Group_13__2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3541:1: rule__EntityConfiguration__Group_13__2 : rule__EntityConfiguration__Group_13__2__Impl rule__EntityConfiguration__Group_13__3 ;
    public final void rule__EntityConfiguration__Group_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3545:1: ( rule__EntityConfiguration__Group_13__2__Impl rule__EntityConfiguration__Group_13__3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3546:2: rule__EntityConfiguration__Group_13__2__Impl rule__EntityConfiguration__Group_13__3
            {
            pushFollow(FOLLOW_rule__EntityConfiguration__Group_13__2__Impl_in_rule__EntityConfiguration__Group_13__27133);
            rule__EntityConfiguration__Group_13__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EntityConfiguration__Group_13__3_in_rule__EntityConfiguration__Group_13__27136);
            rule__EntityConfiguration__Group_13__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityConfiguration__Group_13__2"


    // $ANTLR start "rule__EntityConfiguration__Group_13__2__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3553:1: rule__EntityConfiguration__Group_13__2__Impl : ( '=' ) ;
    public final void rule__EntityConfiguration__Group_13__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3557:1: ( ( '=' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3558:1: ( '=' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3558:1: ( '=' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3559:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityConfigurationAccess().getEqualsSignKeyword_13_2()); 
            }
            match(input,37,FOLLOW_37_in_rule__EntityConfiguration__Group_13__2__Impl7164); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityConfigurationAccess().getEqualsSignKeyword_13_2()); 
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
    // $ANTLR end "rule__EntityConfiguration__Group_13__2__Impl"


    // $ANTLR start "rule__EntityConfiguration__Group_13__3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3572:1: rule__EntityConfiguration__Group_13__3 : rule__EntityConfiguration__Group_13__3__Impl ;
    public final void rule__EntityConfiguration__Group_13__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3576:1: ( rule__EntityConfiguration__Group_13__3__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3577:2: rule__EntityConfiguration__Group_13__3__Impl
            {
            pushFollow(FOLLOW_rule__EntityConfiguration__Group_13__3__Impl_in_rule__EntityConfiguration__Group_13__37195);
            rule__EntityConfiguration__Group_13__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityConfiguration__Group_13__3"


    // $ANTLR start "rule__EntityConfiguration__Group_13__3__Impl"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3583:1: rule__EntityConfiguration__Group_13__3__Impl : ( ( rule__EntityConfiguration__PathAssignment_13_3 ) ) ;
    public final void rule__EntityConfiguration__Group_13__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3587:1: ( ( ( rule__EntityConfiguration__PathAssignment_13_3 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3588:1: ( ( rule__EntityConfiguration__PathAssignment_13_3 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3588:1: ( ( rule__EntityConfiguration__PathAssignment_13_3 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3589:1: ( rule__EntityConfiguration__PathAssignment_13_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityConfigurationAccess().getPathAssignment_13_3()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3590:1: ( rule__EntityConfiguration__PathAssignment_13_3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3590:2: rule__EntityConfiguration__PathAssignment_13_3
            {
            pushFollow(FOLLOW_rule__EntityConfiguration__PathAssignment_13_3_in_rule__EntityConfiguration__Group_13__3__Impl7222);
            rule__EntityConfiguration__PathAssignment_13_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityConfigurationAccess().getPathAssignment_13_3()); 
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
    // $ANTLR end "rule__EntityConfiguration__Group_13__3__Impl"


    // $ANTLR start "rule__System__Group__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3608:1: rule__System__Group__0 : rule__System__Group__0__Impl rule__System__Group__1 ;
    public final void rule__System__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3612:1: ( rule__System__Group__0__Impl rule__System__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3613:2: rule__System__Group__0__Impl rule__System__Group__1
            {
            pushFollow(FOLLOW_rule__System__Group__0__Impl_in_rule__System__Group__07260);
            rule__System__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__System__Group__1_in_rule__System__Group__07263);
            rule__System__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3620:1: rule__System__Group__0__Impl : ( 'SourceSystem' ) ;
    public final void rule__System__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3624:1: ( ( 'SourceSystem' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3625:1: ( 'SourceSystem' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3625:1: ( 'SourceSystem' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3626:1: 'SourceSystem'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getSourceSystemKeyword_0()); 
            }
            match(input,42,FOLLOW_42_in_rule__System__Group__0__Impl7291); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getSourceSystemKeyword_0()); 
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
    // $ANTLR end "rule__System__Group__0__Impl"


    // $ANTLR start "rule__System__Group__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3639:1: rule__System__Group__1 : rule__System__Group__1__Impl rule__System__Group__2 ;
    public final void rule__System__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3643:1: ( rule__System__Group__1__Impl rule__System__Group__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3644:2: rule__System__Group__1__Impl rule__System__Group__2
            {
            pushFollow(FOLLOW_rule__System__Group__1__Impl_in_rule__System__Group__17322);
            rule__System__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__System__Group__2_in_rule__System__Group__17325);
            rule__System__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3651:1: rule__System__Group__1__Impl : ( ( rule__System__NameAssignment_1 ) ) ;
    public final void rule__System__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3655:1: ( ( ( rule__System__NameAssignment_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3656:1: ( ( rule__System__NameAssignment_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3656:1: ( ( rule__System__NameAssignment_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3657:1: ( rule__System__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getNameAssignment_1()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3658:1: ( rule__System__NameAssignment_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3658:2: rule__System__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__System__NameAssignment_1_in_rule__System__Group__1__Impl7352);
            rule__System__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__System__Group__1__Impl"


    // $ANTLR start "rule__System__Group__2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3668:1: rule__System__Group__2 : rule__System__Group__2__Impl rule__System__Group__3 ;
    public final void rule__System__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3672:1: ( rule__System__Group__2__Impl rule__System__Group__3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3673:2: rule__System__Group__2__Impl rule__System__Group__3
            {
            pushFollow(FOLLOW_rule__System__Group__2__Impl_in_rule__System__Group__27382);
            rule__System__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__System__Group__3_in_rule__System__Group__27385);
            rule__System__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3680:1: rule__System__Group__2__Impl : ( '{' ) ;
    public final void rule__System__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3684:1: ( ( '{' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3685:1: ( '{' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3685:1: ( '{' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3686:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,22,FOLLOW_22_in_rule__System__Group__2__Impl7413); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2()); 
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
    // $ANTLR end "rule__System__Group__2__Impl"


    // $ANTLR start "rule__System__Group__3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3699:1: rule__System__Group__3 : rule__System__Group__3__Impl rule__System__Group__4 ;
    public final void rule__System__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3703:1: ( rule__System__Group__3__Impl rule__System__Group__4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3704:2: rule__System__Group__3__Impl rule__System__Group__4
            {
            pushFollow(FOLLOW_rule__System__Group__3__Impl_in_rule__System__Group__37444);
            rule__System__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__System__Group__4_in_rule__System__Group__37447);
            rule__System__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3711:1: rule__System__Group__3__Impl : ( ( rule__System__SrcEntitiesAssignment_3 ) ) ;
    public final void rule__System__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3715:1: ( ( ( rule__System__SrcEntitiesAssignment_3 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3716:1: ( ( rule__System__SrcEntitiesAssignment_3 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3716:1: ( ( rule__System__SrcEntitiesAssignment_3 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3717:1: ( rule__System__SrcEntitiesAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getSrcEntitiesAssignment_3()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3718:1: ( rule__System__SrcEntitiesAssignment_3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3718:2: rule__System__SrcEntitiesAssignment_3
            {
            pushFollow(FOLLOW_rule__System__SrcEntitiesAssignment_3_in_rule__System__Group__3__Impl7474);
            rule__System__SrcEntitiesAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getSrcEntitiesAssignment_3()); 
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
    // $ANTLR end "rule__System__Group__3__Impl"


    // $ANTLR start "rule__System__Group__4"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3728:1: rule__System__Group__4 : rule__System__Group__4__Impl ;
    public final void rule__System__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3732:1: ( rule__System__Group__4__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3733:2: rule__System__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__System__Group__4__Impl_in_rule__System__Group__47504);
            rule__System__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3739:1: rule__System__Group__4__Impl : ( '}' ) ;
    public final void rule__System__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3743:1: ( ( '}' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3744:1: ( '}' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3744:1: ( '}' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3745:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,23,FOLLOW_23_in_rule__System__Group__4__Impl7532); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_4()); 
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
    // $ANTLR end "rule__System__Group__4__Impl"


    // $ANTLR start "rule__SystemEntity__Group__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3768:1: rule__SystemEntity__Group__0 : rule__SystemEntity__Group__0__Impl rule__SystemEntity__Group__1 ;
    public final void rule__SystemEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3772:1: ( rule__SystemEntity__Group__0__Impl rule__SystemEntity__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3773:2: rule__SystemEntity__Group__0__Impl rule__SystemEntity__Group__1
            {
            pushFollow(FOLLOW_rule__SystemEntity__Group__0__Impl_in_rule__SystemEntity__Group__07573);
            rule__SystemEntity__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SystemEntity__Group__1_in_rule__SystemEntity__Group__07576);
            rule__SystemEntity__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3780:1: rule__SystemEntity__Group__0__Impl : ( 'Name' ) ;
    public final void rule__SystemEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3784:1: ( ( 'Name' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3785:1: ( 'Name' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3785:1: ( 'Name' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3786:1: 'Name'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemEntityAccess().getNameKeyword_0()); 
            }
            match(input,43,FOLLOW_43_in_rule__SystemEntity__Group__0__Impl7604); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemEntityAccess().getNameKeyword_0()); 
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
    // $ANTLR end "rule__SystemEntity__Group__0__Impl"


    // $ANTLR start "rule__SystemEntity__Group__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3799:1: rule__SystemEntity__Group__1 : rule__SystemEntity__Group__1__Impl rule__SystemEntity__Group__2 ;
    public final void rule__SystemEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3803:1: ( rule__SystemEntity__Group__1__Impl rule__SystemEntity__Group__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3804:2: rule__SystemEntity__Group__1__Impl rule__SystemEntity__Group__2
            {
            pushFollow(FOLLOW_rule__SystemEntity__Group__1__Impl_in_rule__SystemEntity__Group__17635);
            rule__SystemEntity__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SystemEntity__Group__2_in_rule__SystemEntity__Group__17638);
            rule__SystemEntity__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3811:1: rule__SystemEntity__Group__1__Impl : ( ( rule__SystemEntity__NameAssignment_1 ) ) ;
    public final void rule__SystemEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3815:1: ( ( ( rule__SystemEntity__NameAssignment_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3816:1: ( ( rule__SystemEntity__NameAssignment_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3816:1: ( ( rule__SystemEntity__NameAssignment_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3817:1: ( rule__SystemEntity__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemEntityAccess().getNameAssignment_1()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3818:1: ( rule__SystemEntity__NameAssignment_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3818:2: rule__SystemEntity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SystemEntity__NameAssignment_1_in_rule__SystemEntity__Group__1__Impl7665);
            rule__SystemEntity__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemEntityAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__SystemEntity__Group__1__Impl"


    // $ANTLR start "rule__SystemEntity__Group__2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3828:1: rule__SystemEntity__Group__2 : rule__SystemEntity__Group__2__Impl rule__SystemEntity__Group__3 ;
    public final void rule__SystemEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3832:1: ( rule__SystemEntity__Group__2__Impl rule__SystemEntity__Group__3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3833:2: rule__SystemEntity__Group__2__Impl rule__SystemEntity__Group__3
            {
            pushFollow(FOLLOW_rule__SystemEntity__Group__2__Impl_in_rule__SystemEntity__Group__27695);
            rule__SystemEntity__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SystemEntity__Group__3_in_rule__SystemEntity__Group__27698);
            rule__SystemEntity__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3840:1: rule__SystemEntity__Group__2__Impl : ( 'Format' ) ;
    public final void rule__SystemEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3844:1: ( ( 'Format' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3845:1: ( 'Format' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3845:1: ( 'Format' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3846:1: 'Format'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemEntityAccess().getFormatKeyword_2()); 
            }
            match(input,44,FOLLOW_44_in_rule__SystemEntity__Group__2__Impl7726); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemEntityAccess().getFormatKeyword_2()); 
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
    // $ANTLR end "rule__SystemEntity__Group__2__Impl"


    // $ANTLR start "rule__SystemEntity__Group__3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3859:1: rule__SystemEntity__Group__3 : rule__SystemEntity__Group__3__Impl ;
    public final void rule__SystemEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3863:1: ( rule__SystemEntity__Group__3__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3864:2: rule__SystemEntity__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SystemEntity__Group__3__Impl_in_rule__SystemEntity__Group__37757);
            rule__SystemEntity__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3870:1: rule__SystemEntity__Group__3__Impl : ( ( rule__SystemEntity__FormatAssignment_3 ) ) ;
    public final void rule__SystemEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3874:1: ( ( ( rule__SystemEntity__FormatAssignment_3 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3875:1: ( ( rule__SystemEntity__FormatAssignment_3 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3875:1: ( ( rule__SystemEntity__FormatAssignment_3 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3876:1: ( rule__SystemEntity__FormatAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemEntityAccess().getFormatAssignment_3()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3877:1: ( rule__SystemEntity__FormatAssignment_3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3877:2: rule__SystemEntity__FormatAssignment_3
            {
            pushFollow(FOLLOW_rule__SystemEntity__FormatAssignment_3_in_rule__SystemEntity__Group__3__Impl7784);
            rule__SystemEntity__FormatAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemEntityAccess().getFormatAssignment_3()); 
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
    // $ANTLR end "rule__SystemEntity__Group__3__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3895:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3899:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3900:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__07822);
            rule__Import__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__07825);
            rule__Import__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3907:1: rule__Import__Group__0__Impl : ( 'Import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3911:1: ( ( 'Import' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3912:1: ( 'Import' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3912:1: ( 'Import' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3913:1: 'Import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }
            match(input,45,FOLLOW_45_in_rule__Import__Group__0__Impl7853); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportKeyword_0()); 
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
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3926:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3930:1: ( rule__Import__Group__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3931:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__17884);
            rule__Import__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3937:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3941:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3942:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3942:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3943:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3944:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3944:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl7911);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
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
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__FqnWithWildCard__Group__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3958:1: rule__FqnWithWildCard__Group__0 : rule__FqnWithWildCard__Group__0__Impl rule__FqnWithWildCard__Group__1 ;
    public final void rule__FqnWithWildCard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3962:1: ( rule__FqnWithWildCard__Group__0__Impl rule__FqnWithWildCard__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3963:2: rule__FqnWithWildCard__Group__0__Impl rule__FqnWithWildCard__Group__1
            {
            pushFollow(FOLLOW_rule__FqnWithWildCard__Group__0__Impl_in_rule__FqnWithWildCard__Group__07945);
            rule__FqnWithWildCard__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FqnWithWildCard__Group__1_in_rule__FqnWithWildCard__Group__07948);
            rule__FqnWithWildCard__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3970:1: rule__FqnWithWildCard__Group__0__Impl : ( ruleFQN ) ;
    public final void rule__FqnWithWildCard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3974:1: ( ( ruleFQN ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3975:1: ( ruleFQN )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3975:1: ( ruleFQN )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3976:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFqnWithWildCardAccess().getFQNParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__FqnWithWildCard__Group__0__Impl7975);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFqnWithWildCardAccess().getFQNParserRuleCall_0()); 
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
    // $ANTLR end "rule__FqnWithWildCard__Group__0__Impl"


    // $ANTLR start "rule__FqnWithWildCard__Group__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3987:1: rule__FqnWithWildCard__Group__1 : rule__FqnWithWildCard__Group__1__Impl ;
    public final void rule__FqnWithWildCard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3991:1: ( rule__FqnWithWildCard__Group__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3992:2: rule__FqnWithWildCard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FqnWithWildCard__Group__1__Impl_in_rule__FqnWithWildCard__Group__18004);
            rule__FqnWithWildCard__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:3998:1: rule__FqnWithWildCard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__FqnWithWildCard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4002:1: ( ( ( '.*' )? ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4003:1: ( ( '.*' )? )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4003:1: ( ( '.*' )? )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4004:1: ( '.*' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFqnWithWildCardAccess().getFullStopAsteriskKeyword_1()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4005:1: ( '.*' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==46) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4006:2: '.*'
                    {
                    match(input,46,FOLLOW_46_in_rule__FqnWithWildCard__Group__1__Impl8033); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFqnWithWildCardAccess().getFullStopAsteriskKeyword_1()); 
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
    // $ANTLR end "rule__FqnWithWildCard__Group__1__Impl"


    // $ANTLR start "rule__Diagram__Group__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4021:1: rule__Diagram__Group__0 : rule__Diagram__Group__0__Impl rule__Diagram__Group__1 ;
    public final void rule__Diagram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4025:1: ( rule__Diagram__Group__0__Impl rule__Diagram__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4026:2: rule__Diagram__Group__0__Impl rule__Diagram__Group__1
            {
            pushFollow(FOLLOW_rule__Diagram__Group__0__Impl_in_rule__Diagram__Group__08070);
            rule__Diagram__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Diagram__Group__1_in_rule__Diagram__Group__08073);
            rule__Diagram__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4033:1: rule__Diagram__Group__0__Impl : ( ( rule__Diagram__ImportsAssignment_0 )* ) ;
    public final void rule__Diagram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4037:1: ( ( ( rule__Diagram__ImportsAssignment_0 )* ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4038:1: ( ( rule__Diagram__ImportsAssignment_0 )* )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4038:1: ( ( rule__Diagram__ImportsAssignment_0 )* )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4039:1: ( rule__Diagram__ImportsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDiagramAccess().getImportsAssignment_0()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4040:1: ( rule__Diagram__ImportsAssignment_0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==45) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4040:2: rule__Diagram__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Diagram__ImportsAssignment_0_in_rule__Diagram__Group__0__Impl8100);
            	    rule__Diagram__ImportsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDiagramAccess().getImportsAssignment_0()); 
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
    // $ANTLR end "rule__Diagram__Group__0__Impl"


    // $ANTLR start "rule__Diagram__Group__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4050:1: rule__Diagram__Group__1 : rule__Diagram__Group__1__Impl rule__Diagram__Group__2 ;
    public final void rule__Diagram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4054:1: ( rule__Diagram__Group__1__Impl rule__Diagram__Group__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4055:2: rule__Diagram__Group__1__Impl rule__Diagram__Group__2
            {
            pushFollow(FOLLOW_rule__Diagram__Group__1__Impl_in_rule__Diagram__Group__18131);
            rule__Diagram__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Diagram__Group__2_in_rule__Diagram__Group__18134);
            rule__Diagram__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4062:1: rule__Diagram__Group__1__Impl : ( 'Diagram' ) ;
    public final void rule__Diagram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4066:1: ( ( 'Diagram' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4067:1: ( 'Diagram' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4067:1: ( 'Diagram' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4068:1: 'Diagram'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDiagramAccess().getDiagramKeyword_1()); 
            }
            match(input,47,FOLLOW_47_in_rule__Diagram__Group__1__Impl8162); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDiagramAccess().getDiagramKeyword_1()); 
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
    // $ANTLR end "rule__Diagram__Group__1__Impl"


    // $ANTLR start "rule__Diagram__Group__2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4081:1: rule__Diagram__Group__2 : rule__Diagram__Group__2__Impl rule__Diagram__Group__3 ;
    public final void rule__Diagram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4085:1: ( rule__Diagram__Group__2__Impl rule__Diagram__Group__3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4086:2: rule__Diagram__Group__2__Impl rule__Diagram__Group__3
            {
            pushFollow(FOLLOW_rule__Diagram__Group__2__Impl_in_rule__Diagram__Group__28193);
            rule__Diagram__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Diagram__Group__3_in_rule__Diagram__Group__28196);
            rule__Diagram__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4093:1: rule__Diagram__Group__2__Impl : ( ( rule__Diagram__NameAssignment_2 ) ) ;
    public final void rule__Diagram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4097:1: ( ( ( rule__Diagram__NameAssignment_2 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4098:1: ( ( rule__Diagram__NameAssignment_2 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4098:1: ( ( rule__Diagram__NameAssignment_2 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4099:1: ( rule__Diagram__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDiagramAccess().getNameAssignment_2()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4100:1: ( rule__Diagram__NameAssignment_2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4100:2: rule__Diagram__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Diagram__NameAssignment_2_in_rule__Diagram__Group__2__Impl8223);
            rule__Diagram__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDiagramAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__Diagram__Group__2__Impl"


    // $ANTLR start "rule__Diagram__Group__3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4110:1: rule__Diagram__Group__3 : rule__Diagram__Group__3__Impl rule__Diagram__Group__4 ;
    public final void rule__Diagram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4114:1: ( rule__Diagram__Group__3__Impl rule__Diagram__Group__4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4115:2: rule__Diagram__Group__3__Impl rule__Diagram__Group__4
            {
            pushFollow(FOLLOW_rule__Diagram__Group__3__Impl_in_rule__Diagram__Group__38253);
            rule__Diagram__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Diagram__Group__4_in_rule__Diagram__Group__38256);
            rule__Diagram__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4122:1: rule__Diagram__Group__3__Impl : ( '{' ) ;
    public final void rule__Diagram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4126:1: ( ( '{' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4127:1: ( '{' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4127:1: ( '{' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4128:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDiagramAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,22,FOLLOW_22_in_rule__Diagram__Group__3__Impl8284); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDiagramAccess().getLeftCurlyBracketKeyword_3()); 
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
    // $ANTLR end "rule__Diagram__Group__3__Impl"


    // $ANTLR start "rule__Diagram__Group__4"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4141:1: rule__Diagram__Group__4 : rule__Diagram__Group__4__Impl rule__Diagram__Group__5 ;
    public final void rule__Diagram__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4145:1: ( rule__Diagram__Group__4__Impl rule__Diagram__Group__5 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4146:2: rule__Diagram__Group__4__Impl rule__Diagram__Group__5
            {
            pushFollow(FOLLOW_rule__Diagram__Group__4__Impl_in_rule__Diagram__Group__48315);
            rule__Diagram__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Diagram__Group__5_in_rule__Diagram__Group__48318);
            rule__Diagram__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4153:1: rule__Diagram__Group__4__Impl : ( ( rule__Diagram__IncludesAssignment_4 )* ) ;
    public final void rule__Diagram__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4157:1: ( ( ( rule__Diagram__IncludesAssignment_4 )* ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4158:1: ( ( rule__Diagram__IncludesAssignment_4 )* )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4158:1: ( ( rule__Diagram__IncludesAssignment_4 )* )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4159:1: ( rule__Diagram__IncludesAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDiagramAccess().getIncludesAssignment_4()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4160:1: ( rule__Diagram__IncludesAssignment_4 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=11 && LA20_0<=12)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4160:2: rule__Diagram__IncludesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Diagram__IncludesAssignment_4_in_rule__Diagram__Group__4__Impl8345);
            	    rule__Diagram__IncludesAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDiagramAccess().getIncludesAssignment_4()); 
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
    // $ANTLR end "rule__Diagram__Group__4__Impl"


    // $ANTLR start "rule__Diagram__Group__5"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4170:1: rule__Diagram__Group__5 : rule__Diagram__Group__5__Impl ;
    public final void rule__Diagram__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4174:1: ( rule__Diagram__Group__5__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4175:2: rule__Diagram__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Diagram__Group__5__Impl_in_rule__Diagram__Group__58376);
            rule__Diagram__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4181:1: rule__Diagram__Group__5__Impl : ( '}' ) ;
    public final void rule__Diagram__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4185:1: ( ( '}' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4186:1: ( '}' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4186:1: ( '}' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4187:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDiagramAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,23,FOLLOW_23_in_rule__Diagram__Group__5__Impl8404); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDiagramAccess().getRightCurlyBracketKeyword_5()); 
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
    // $ANTLR end "rule__Diagram__Group__5__Impl"


    // $ANTLR start "rule__Include__Group__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4212:1: rule__Include__Group__0 : rule__Include__Group__0__Impl rule__Include__Group__1 ;
    public final void rule__Include__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4216:1: ( rule__Include__Group__0__Impl rule__Include__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4217:2: rule__Include__Group__0__Impl rule__Include__Group__1
            {
            pushFollow(FOLLOW_rule__Include__Group__0__Impl_in_rule__Include__Group__08447);
            rule__Include__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Include__Group__1_in_rule__Include__Group__08450);
            rule__Include__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4224:1: rule__Include__Group__0__Impl : ( ( rule__Include__IncludeAssignment_0 ) ) ;
    public final void rule__Include__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4228:1: ( ( ( rule__Include__IncludeAssignment_0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4229:1: ( ( rule__Include__IncludeAssignment_0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4229:1: ( ( rule__Include__IncludeAssignment_0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4230:1: ( rule__Include__IncludeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIncludeAccess().getIncludeAssignment_0()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4231:1: ( rule__Include__IncludeAssignment_0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4231:2: rule__Include__IncludeAssignment_0
            {
            pushFollow(FOLLOW_rule__Include__IncludeAssignment_0_in_rule__Include__Group__0__Impl8477);
            rule__Include__IncludeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIncludeAccess().getIncludeAssignment_0()); 
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
    // $ANTLR end "rule__Include__Group__0__Impl"


    // $ANTLR start "rule__Include__Group__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4241:1: rule__Include__Group__1 : rule__Include__Group__1__Impl rule__Include__Group__2 ;
    public final void rule__Include__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4245:1: ( rule__Include__Group__1__Impl rule__Include__Group__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4246:2: rule__Include__Group__1__Impl rule__Include__Group__2
            {
            pushFollow(FOLLOW_rule__Include__Group__1__Impl_in_rule__Include__Group__18507);
            rule__Include__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Include__Group__2_in_rule__Include__Group__18510);
            rule__Include__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4253:1: rule__Include__Group__1__Impl : ( ( rule__Include__EntityAssignment_1 ) ) ;
    public final void rule__Include__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4257:1: ( ( ( rule__Include__EntityAssignment_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4258:1: ( ( rule__Include__EntityAssignment_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4258:1: ( ( rule__Include__EntityAssignment_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4259:1: ( rule__Include__EntityAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIncludeAccess().getEntityAssignment_1()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4260:1: ( rule__Include__EntityAssignment_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4260:2: rule__Include__EntityAssignment_1
            {
            pushFollow(FOLLOW_rule__Include__EntityAssignment_1_in_rule__Include__Group__1__Impl8537);
            rule__Include__EntityAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIncludeAccess().getEntityAssignment_1()); 
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
    // $ANTLR end "rule__Include__Group__1__Impl"


    // $ANTLR start "rule__Include__Group__2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4270:1: rule__Include__Group__2 : rule__Include__Group__2__Impl ;
    public final void rule__Include__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4274:1: ( rule__Include__Group__2__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4275:2: rule__Include__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Include__Group__2__Impl_in_rule__Include__Group__28567);
            rule__Include__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4281:1: rule__Include__Group__2__Impl : ( ( rule__Include__Group_2__0 ) ) ;
    public final void rule__Include__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4285:1: ( ( ( rule__Include__Group_2__0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4286:1: ( ( rule__Include__Group_2__0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4286:1: ( ( rule__Include__Group_2__0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4287:1: ( rule__Include__Group_2__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIncludeAccess().getGroup_2()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4288:1: ( rule__Include__Group_2__0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4288:2: rule__Include__Group_2__0
            {
            pushFollow(FOLLOW_rule__Include__Group_2__0_in_rule__Include__Group__2__Impl8594);
            rule__Include__Group_2__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIncludeAccess().getGroup_2()); 
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
    // $ANTLR end "rule__Include__Group__2__Impl"


    // $ANTLR start "rule__Include__Group_2__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4304:1: rule__Include__Group_2__0 : rule__Include__Group_2__0__Impl rule__Include__Group_2__1 ;
    public final void rule__Include__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4308:1: ( rule__Include__Group_2__0__Impl rule__Include__Group_2__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4309:2: rule__Include__Group_2__0__Impl rule__Include__Group_2__1
            {
            pushFollow(FOLLOW_rule__Include__Group_2__0__Impl_in_rule__Include__Group_2__08630);
            rule__Include__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Include__Group_2__1_in_rule__Include__Group_2__08633);
            rule__Include__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4316:1: rule__Include__Group_2__0__Impl : ( 'with' ) ;
    public final void rule__Include__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4320:1: ( ( 'with' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4321:1: ( 'with' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4321:1: ( 'with' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4322:1: 'with'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIncludeAccess().getWithKeyword_2_0()); 
            }
            match(input,48,FOLLOW_48_in_rule__Include__Group_2__0__Impl8661); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIncludeAccess().getWithKeyword_2_0()); 
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
    // $ANTLR end "rule__Include__Group_2__0__Impl"


    // $ANTLR start "rule__Include__Group_2__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4335:1: rule__Include__Group_2__1 : rule__Include__Group_2__1__Impl rule__Include__Group_2__2 ;
    public final void rule__Include__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4339:1: ( rule__Include__Group_2__1__Impl rule__Include__Group_2__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4340:2: rule__Include__Group_2__1__Impl rule__Include__Group_2__2
            {
            pushFollow(FOLLOW_rule__Include__Group_2__1__Impl_in_rule__Include__Group_2__18692);
            rule__Include__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Include__Group_2__2_in_rule__Include__Group_2__18695);
            rule__Include__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4347:1: rule__Include__Group_2__1__Impl : ( '{' ) ;
    public final void rule__Include__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4351:1: ( ( '{' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4352:1: ( '{' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4352:1: ( '{' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4353:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIncludeAccess().getLeftCurlyBracketKeyword_2_1()); 
            }
            match(input,22,FOLLOW_22_in_rule__Include__Group_2__1__Impl8723); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIncludeAccess().getLeftCurlyBracketKeyword_2_1()); 
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
    // $ANTLR end "rule__Include__Group_2__1__Impl"


    // $ANTLR start "rule__Include__Group_2__2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4366:1: rule__Include__Group_2__2 : rule__Include__Group_2__2__Impl rule__Include__Group_2__3 ;
    public final void rule__Include__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4370:1: ( rule__Include__Group_2__2__Impl rule__Include__Group_2__3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4371:2: rule__Include__Group_2__2__Impl rule__Include__Group_2__3
            {
            pushFollow(FOLLOW_rule__Include__Group_2__2__Impl_in_rule__Include__Group_2__28754);
            rule__Include__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Include__Group_2__3_in_rule__Include__Group_2__28757);
            rule__Include__Group_2__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4378:1: rule__Include__Group_2__2__Impl : ( ( rule__Include__FieldsAssignment_2_2 ) ) ;
    public final void rule__Include__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4382:1: ( ( ( rule__Include__FieldsAssignment_2_2 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4383:1: ( ( rule__Include__FieldsAssignment_2_2 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4383:1: ( ( rule__Include__FieldsAssignment_2_2 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4384:1: ( rule__Include__FieldsAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIncludeAccess().getFieldsAssignment_2_2()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4385:1: ( rule__Include__FieldsAssignment_2_2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4385:2: rule__Include__FieldsAssignment_2_2
            {
            pushFollow(FOLLOW_rule__Include__FieldsAssignment_2_2_in_rule__Include__Group_2__2__Impl8784);
            rule__Include__FieldsAssignment_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIncludeAccess().getFieldsAssignment_2_2()); 
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
    // $ANTLR end "rule__Include__Group_2__2__Impl"


    // $ANTLR start "rule__Include__Group_2__3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4395:1: rule__Include__Group_2__3 : rule__Include__Group_2__3__Impl rule__Include__Group_2__4 ;
    public final void rule__Include__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4399:1: ( rule__Include__Group_2__3__Impl rule__Include__Group_2__4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4400:2: rule__Include__Group_2__3__Impl rule__Include__Group_2__4
            {
            pushFollow(FOLLOW_rule__Include__Group_2__3__Impl_in_rule__Include__Group_2__38814);
            rule__Include__Group_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Include__Group_2__4_in_rule__Include__Group_2__38817);
            rule__Include__Group_2__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4407:1: rule__Include__Group_2__3__Impl : ( ( rule__Include__Group_2_3__0 )* ) ;
    public final void rule__Include__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4411:1: ( ( ( rule__Include__Group_2_3__0 )* ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4412:1: ( ( rule__Include__Group_2_3__0 )* )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4412:1: ( ( rule__Include__Group_2_3__0 )* )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4413:1: ( rule__Include__Group_2_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIncludeAccess().getGroup_2_3()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4414:1: ( rule__Include__Group_2_3__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==30) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4414:2: rule__Include__Group_2_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Include__Group_2_3__0_in_rule__Include__Group_2__3__Impl8844);
            	    rule__Include__Group_2_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIncludeAccess().getGroup_2_3()); 
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
    // $ANTLR end "rule__Include__Group_2__3__Impl"


    // $ANTLR start "rule__Include__Group_2__4"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4424:1: rule__Include__Group_2__4 : rule__Include__Group_2__4__Impl ;
    public final void rule__Include__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4428:1: ( rule__Include__Group_2__4__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4429:2: rule__Include__Group_2__4__Impl
            {
            pushFollow(FOLLOW_rule__Include__Group_2__4__Impl_in_rule__Include__Group_2__48875);
            rule__Include__Group_2__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4435:1: rule__Include__Group_2__4__Impl : ( '}' ) ;
    public final void rule__Include__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4439:1: ( ( '}' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4440:1: ( '}' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4440:1: ( '}' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4441:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIncludeAccess().getRightCurlyBracketKeyword_2_4()); 
            }
            match(input,23,FOLLOW_23_in_rule__Include__Group_2__4__Impl8903); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIncludeAccess().getRightCurlyBracketKeyword_2_4()); 
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
    // $ANTLR end "rule__Include__Group_2__4__Impl"


    // $ANTLR start "rule__Include__Group_2_3__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4464:1: rule__Include__Group_2_3__0 : rule__Include__Group_2_3__0__Impl rule__Include__Group_2_3__1 ;
    public final void rule__Include__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4468:1: ( rule__Include__Group_2_3__0__Impl rule__Include__Group_2_3__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4469:2: rule__Include__Group_2_3__0__Impl rule__Include__Group_2_3__1
            {
            pushFollow(FOLLOW_rule__Include__Group_2_3__0__Impl_in_rule__Include__Group_2_3__08944);
            rule__Include__Group_2_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Include__Group_2_3__1_in_rule__Include__Group_2_3__08947);
            rule__Include__Group_2_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4476:1: rule__Include__Group_2_3__0__Impl : ( ',' ) ;
    public final void rule__Include__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4480:1: ( ( ',' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4481:1: ( ',' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4481:1: ( ',' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4482:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIncludeAccess().getCommaKeyword_2_3_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__Include__Group_2_3__0__Impl8975); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIncludeAccess().getCommaKeyword_2_3_0()); 
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
    // $ANTLR end "rule__Include__Group_2_3__0__Impl"


    // $ANTLR start "rule__Include__Group_2_3__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4495:1: rule__Include__Group_2_3__1 : rule__Include__Group_2_3__1__Impl ;
    public final void rule__Include__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4499:1: ( rule__Include__Group_2_3__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4500:2: rule__Include__Group_2_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Include__Group_2_3__1__Impl_in_rule__Include__Group_2_3__19006);
            rule__Include__Group_2_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4506:1: rule__Include__Group_2_3__1__Impl : ( ( rule__Include__FieldsAssignment_2_3_1 ) ) ;
    public final void rule__Include__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4510:1: ( ( ( rule__Include__FieldsAssignment_2_3_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4511:1: ( ( rule__Include__FieldsAssignment_2_3_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4511:1: ( ( rule__Include__FieldsAssignment_2_3_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4512:1: ( rule__Include__FieldsAssignment_2_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIncludeAccess().getFieldsAssignment_2_3_1()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4513:1: ( rule__Include__FieldsAssignment_2_3_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4513:2: rule__Include__FieldsAssignment_2_3_1
            {
            pushFollow(FOLLOW_rule__Include__FieldsAssignment_2_3_1_in_rule__Include__Group_2_3__1__Impl9033);
            rule__Include__FieldsAssignment_2_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIncludeAccess().getFieldsAssignment_2_3_1()); 
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
    // $ANTLR end "rule__Include__Group_2_3__1__Impl"


    // $ANTLR start "rule__EnumDeclaration__Group__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4527:1: rule__EnumDeclaration__Group__0 : rule__EnumDeclaration__Group__0__Impl rule__EnumDeclaration__Group__1 ;
    public final void rule__EnumDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4531:1: ( rule__EnumDeclaration__Group__0__Impl rule__EnumDeclaration__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4532:2: rule__EnumDeclaration__Group__0__Impl rule__EnumDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__EnumDeclaration__Group__0__Impl_in_rule__EnumDeclaration__Group__09067);
            rule__EnumDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumDeclaration__Group__1_in_rule__EnumDeclaration__Group__09070);
            rule__EnumDeclaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4539:1: rule__EnumDeclaration__Group__0__Impl : ( 'Enumeration' ) ;
    public final void rule__EnumDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4543:1: ( ( 'Enumeration' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4544:1: ( 'Enumeration' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4544:1: ( 'Enumeration' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4545:1: 'Enumeration'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumDeclarationAccess().getEnumerationKeyword_0()); 
            }
            match(input,49,FOLLOW_49_in_rule__EnumDeclaration__Group__0__Impl9098); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumDeclarationAccess().getEnumerationKeyword_0()); 
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
    // $ANTLR end "rule__EnumDeclaration__Group__0__Impl"


    // $ANTLR start "rule__EnumDeclaration__Group__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4558:1: rule__EnumDeclaration__Group__1 : rule__EnumDeclaration__Group__1__Impl rule__EnumDeclaration__Group__2 ;
    public final void rule__EnumDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4562:1: ( rule__EnumDeclaration__Group__1__Impl rule__EnumDeclaration__Group__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4563:2: rule__EnumDeclaration__Group__1__Impl rule__EnumDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__EnumDeclaration__Group__1__Impl_in_rule__EnumDeclaration__Group__19129);
            rule__EnumDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumDeclaration__Group__2_in_rule__EnumDeclaration__Group__19132);
            rule__EnumDeclaration__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4570:1: rule__EnumDeclaration__Group__1__Impl : ( ( rule__EnumDeclaration__NameAssignment_1 ) ) ;
    public final void rule__EnumDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4574:1: ( ( ( rule__EnumDeclaration__NameAssignment_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4575:1: ( ( rule__EnumDeclaration__NameAssignment_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4575:1: ( ( rule__EnumDeclaration__NameAssignment_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4576:1: ( rule__EnumDeclaration__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumDeclarationAccess().getNameAssignment_1()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4577:1: ( rule__EnumDeclaration__NameAssignment_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4577:2: rule__EnumDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumDeclaration__NameAssignment_1_in_rule__EnumDeclaration__Group__1__Impl9159);
            rule__EnumDeclaration__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumDeclarationAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__EnumDeclaration__Group__1__Impl"


    // $ANTLR start "rule__EnumDeclaration__Group__2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4587:1: rule__EnumDeclaration__Group__2 : rule__EnumDeclaration__Group__2__Impl rule__EnumDeclaration__Group__3 ;
    public final void rule__EnumDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4591:1: ( rule__EnumDeclaration__Group__2__Impl rule__EnumDeclaration__Group__3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4592:2: rule__EnumDeclaration__Group__2__Impl rule__EnumDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__EnumDeclaration__Group__2__Impl_in_rule__EnumDeclaration__Group__29189);
            rule__EnumDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumDeclaration__Group__3_in_rule__EnumDeclaration__Group__29192);
            rule__EnumDeclaration__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4599:1: rule__EnumDeclaration__Group__2__Impl : ( '{' ) ;
    public final void rule__EnumDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4603:1: ( ( '{' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4604:1: ( '{' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4604:1: ( '{' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4605:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumDeclarationAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,22,FOLLOW_22_in_rule__EnumDeclaration__Group__2__Impl9220); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumDeclarationAccess().getLeftCurlyBracketKeyword_2()); 
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
    // $ANTLR end "rule__EnumDeclaration__Group__2__Impl"


    // $ANTLR start "rule__EnumDeclaration__Group__3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4618:1: rule__EnumDeclaration__Group__3 : rule__EnumDeclaration__Group__3__Impl rule__EnumDeclaration__Group__4 ;
    public final void rule__EnumDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4622:1: ( rule__EnumDeclaration__Group__3__Impl rule__EnumDeclaration__Group__4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4623:2: rule__EnumDeclaration__Group__3__Impl rule__EnumDeclaration__Group__4
            {
            pushFollow(FOLLOW_rule__EnumDeclaration__Group__3__Impl_in_rule__EnumDeclaration__Group__39251);
            rule__EnumDeclaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumDeclaration__Group__4_in_rule__EnumDeclaration__Group__39254);
            rule__EnumDeclaration__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4630:1: rule__EnumDeclaration__Group__3__Impl : ( ( rule__EnumDeclaration__ValuesAssignment_3 ) ) ;
    public final void rule__EnumDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4634:1: ( ( ( rule__EnumDeclaration__ValuesAssignment_3 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4635:1: ( ( rule__EnumDeclaration__ValuesAssignment_3 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4635:1: ( ( rule__EnumDeclaration__ValuesAssignment_3 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4636:1: ( rule__EnumDeclaration__ValuesAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumDeclarationAccess().getValuesAssignment_3()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4637:1: ( rule__EnumDeclaration__ValuesAssignment_3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4637:2: rule__EnumDeclaration__ValuesAssignment_3
            {
            pushFollow(FOLLOW_rule__EnumDeclaration__ValuesAssignment_3_in_rule__EnumDeclaration__Group__3__Impl9281);
            rule__EnumDeclaration__ValuesAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumDeclarationAccess().getValuesAssignment_3()); 
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
    // $ANTLR end "rule__EnumDeclaration__Group__3__Impl"


    // $ANTLR start "rule__EnumDeclaration__Group__4"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4647:1: rule__EnumDeclaration__Group__4 : rule__EnumDeclaration__Group__4__Impl rule__EnumDeclaration__Group__5 ;
    public final void rule__EnumDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4651:1: ( rule__EnumDeclaration__Group__4__Impl rule__EnumDeclaration__Group__5 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4652:2: rule__EnumDeclaration__Group__4__Impl rule__EnumDeclaration__Group__5
            {
            pushFollow(FOLLOW_rule__EnumDeclaration__Group__4__Impl_in_rule__EnumDeclaration__Group__49311);
            rule__EnumDeclaration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumDeclaration__Group__5_in_rule__EnumDeclaration__Group__49314);
            rule__EnumDeclaration__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4659:1: rule__EnumDeclaration__Group__4__Impl : ( ( rule__EnumDeclaration__Group_4__0 )* ) ;
    public final void rule__EnumDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4663:1: ( ( ( rule__EnumDeclaration__Group_4__0 )* ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4664:1: ( ( rule__EnumDeclaration__Group_4__0 )* )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4664:1: ( ( rule__EnumDeclaration__Group_4__0 )* )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4665:1: ( rule__EnumDeclaration__Group_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumDeclarationAccess().getGroup_4()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4666:1: ( rule__EnumDeclaration__Group_4__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==30) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4666:2: rule__EnumDeclaration__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__EnumDeclaration__Group_4__0_in_rule__EnumDeclaration__Group__4__Impl9341);
            	    rule__EnumDeclaration__Group_4__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumDeclarationAccess().getGroup_4()); 
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
    // $ANTLR end "rule__EnumDeclaration__Group__4__Impl"


    // $ANTLR start "rule__EnumDeclaration__Group__5"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4676:1: rule__EnumDeclaration__Group__5 : rule__EnumDeclaration__Group__5__Impl ;
    public final void rule__EnumDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4680:1: ( rule__EnumDeclaration__Group__5__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4681:2: rule__EnumDeclaration__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__EnumDeclaration__Group__5__Impl_in_rule__EnumDeclaration__Group__59372);
            rule__EnumDeclaration__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4687:1: rule__EnumDeclaration__Group__5__Impl : ( '}' ) ;
    public final void rule__EnumDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4691:1: ( ( '}' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4692:1: ( '}' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4692:1: ( '}' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4693:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumDeclarationAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,23,FOLLOW_23_in_rule__EnumDeclaration__Group__5__Impl9400); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumDeclarationAccess().getRightCurlyBracketKeyword_5()); 
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
    // $ANTLR end "rule__EnumDeclaration__Group__5__Impl"


    // $ANTLR start "rule__EnumDeclaration__Group_4__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4718:1: rule__EnumDeclaration__Group_4__0 : rule__EnumDeclaration__Group_4__0__Impl rule__EnumDeclaration__Group_4__1 ;
    public final void rule__EnumDeclaration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4722:1: ( rule__EnumDeclaration__Group_4__0__Impl rule__EnumDeclaration__Group_4__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4723:2: rule__EnumDeclaration__Group_4__0__Impl rule__EnumDeclaration__Group_4__1
            {
            pushFollow(FOLLOW_rule__EnumDeclaration__Group_4__0__Impl_in_rule__EnumDeclaration__Group_4__09443);
            rule__EnumDeclaration__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EnumDeclaration__Group_4__1_in_rule__EnumDeclaration__Group_4__09446);
            rule__EnumDeclaration__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4730:1: rule__EnumDeclaration__Group_4__0__Impl : ( ',' ) ;
    public final void rule__EnumDeclaration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4734:1: ( ( ',' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4735:1: ( ',' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4735:1: ( ',' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4736:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumDeclarationAccess().getCommaKeyword_4_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__EnumDeclaration__Group_4__0__Impl9474); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumDeclarationAccess().getCommaKeyword_4_0()); 
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
    // $ANTLR end "rule__EnumDeclaration__Group_4__0__Impl"


    // $ANTLR start "rule__EnumDeclaration__Group_4__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4749:1: rule__EnumDeclaration__Group_4__1 : rule__EnumDeclaration__Group_4__1__Impl ;
    public final void rule__EnumDeclaration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4753:1: ( rule__EnumDeclaration__Group_4__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4754:2: rule__EnumDeclaration__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__EnumDeclaration__Group_4__1__Impl_in_rule__EnumDeclaration__Group_4__19505);
            rule__EnumDeclaration__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4760:1: rule__EnumDeclaration__Group_4__1__Impl : ( RULE_ID ) ;
    public final void rule__EnumDeclaration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4764:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4765:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4765:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4766:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumDeclarationAccess().getIDTerminalRuleCall_4_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumDeclaration__Group_4__1__Impl9532); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumDeclarationAccess().getIDTerminalRuleCall_4_1()); 
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
    // $ANTLR end "rule__EnumDeclaration__Group_4__1__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4781:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4785:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4786:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__09565);
            rule__FQN__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__09568);
            rule__FQN__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4793:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4797:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4798:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4798:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4799:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl9595); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__FQN__Group__0__Impl"


    // $ANTLR start "rule__FQN__Group__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4810:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4814:1: ( rule__FQN__Group__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4815:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__19624);
            rule__FQN__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4821:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4825:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4826:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4826:1: ( ( rule__FQN__Group_1__0 )* )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4827:1: ( rule__FQN__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getGroup_1()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4828:1: ( rule__FQN__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==50) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4828:2: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl9651);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFQNAccess().getGroup_1()); 
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
    // $ANTLR end "rule__FQN__Group__1__Impl"


    // $ANTLR start "rule__FQN__Group_1__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4842:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4846:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4847:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__09686);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__09689);
            rule__FQN__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4854:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4858:1: ( ( '.' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4859:1: ( '.' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4859:1: ( '.' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4860:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            }
            match(input,50,FOLLOW_50_in_rule__FQN__Group_1__0__Impl9717); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
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
    // $ANTLR end "rule__FQN__Group_1__0__Impl"


    // $ANTLR start "rule__FQN__Group_1__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4873:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4877:1: ( rule__FQN__Group_1__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4878:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__19748);
            rule__FQN__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4884:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4888:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4889:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4889:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4890:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl9775); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
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
    // $ANTLR end "rule__FQN__Group_1__1__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4905:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4909:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4910:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__09808);
            rule__Entity__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__09811);
            rule__Entity__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4917:1: rule__Entity__Group__0__Impl : ( 'Entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4921:1: ( ( 'Entity' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4922:1: ( 'Entity' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4922:1: ( 'Entity' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4923:1: 'Entity'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            }
            match(input,51,FOLLOW_51_in_rule__Entity__Group__0__Impl9839); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
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
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4936:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4940:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4941:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__19870);
            rule__Entity__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__19873);
            rule__Entity__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4948:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4952:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4953:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4953:1: ( ( rule__Entity__NameAssignment_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4954:1: ( rule__Entity__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4955:1: ( rule__Entity__NameAssignment_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4955:2: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl9900);
            rule__Entity__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4965:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4969:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4970:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__29930);
            rule__Entity__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__29933);
            rule__Entity__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4977:1: rule__Entity__Group__2__Impl : ( '{' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4981:1: ( ( '{' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4982:1: ( '{' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4982:1: ( '{' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4983:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,22,FOLLOW_22_in_rule__Entity__Group__2__Impl9961); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 
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
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:4996:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5000:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5001:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__39992);
            rule__Entity__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__39995);
            rule__Entity__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5008:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__PropertiesAssignment_3 )* ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5012:1: ( ( ( rule__Entity__PropertiesAssignment_3 )* ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5013:1: ( ( rule__Entity__PropertiesAssignment_3 )* )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5013:1: ( ( rule__Entity__PropertiesAssignment_3 )* )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5014:1: ( rule__Entity__PropertiesAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getPropertiesAssignment_3()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5015:1: ( rule__Entity__PropertiesAssignment_3 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==54||LA24_0==56) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5015:2: rule__Entity__PropertiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Entity__PropertiesAssignment_3_in_rule__Entity__Group__3__Impl10022);
            	    rule__Entity__PropertiesAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getPropertiesAssignment_3()); 
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
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5025:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5029:1: ( rule__Entity__Group__4__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5030:2: rule__Entity__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__410053);
            rule__Entity__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5036:1: rule__Entity__Group__4__Impl : ( '}' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5040:1: ( ( '}' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5041:1: ( '}' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5041:1: ( '}' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5042:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,23,FOLLOW_23_in_rule__Entity__Group__4__Impl10081); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4()); 
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
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Domain__Group__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5065:1: rule__Domain__Group__0 : rule__Domain__Group__0__Impl rule__Domain__Group__1 ;
    public final void rule__Domain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5069:1: ( rule__Domain__Group__0__Impl rule__Domain__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5070:2: rule__Domain__Group__0__Impl rule__Domain__Group__1
            {
            pushFollow(FOLLOW_rule__Domain__Group__0__Impl_in_rule__Domain__Group__010122);
            rule__Domain__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Domain__Group__1_in_rule__Domain__Group__010125);
            rule__Domain__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5077:1: rule__Domain__Group__0__Impl : ( ( rule__Domain__ImportsAssignment_0 )* ) ;
    public final void rule__Domain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5081:1: ( ( ( rule__Domain__ImportsAssignment_0 )* ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5082:1: ( ( rule__Domain__ImportsAssignment_0 )* )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5082:1: ( ( rule__Domain__ImportsAssignment_0 )* )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5083:1: ( rule__Domain__ImportsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getImportsAssignment_0()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5084:1: ( rule__Domain__ImportsAssignment_0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==45) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5084:2: rule__Domain__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Domain__ImportsAssignment_0_in_rule__Domain__Group__0__Impl10152);
            	    rule__Domain__ImportsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainAccess().getImportsAssignment_0()); 
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
    // $ANTLR end "rule__Domain__Group__0__Impl"


    // $ANTLR start "rule__Domain__Group__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5094:1: rule__Domain__Group__1 : rule__Domain__Group__1__Impl rule__Domain__Group__2 ;
    public final void rule__Domain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5098:1: ( rule__Domain__Group__1__Impl rule__Domain__Group__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5099:2: rule__Domain__Group__1__Impl rule__Domain__Group__2
            {
            pushFollow(FOLLOW_rule__Domain__Group__1__Impl_in_rule__Domain__Group__110183);
            rule__Domain__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Domain__Group__2_in_rule__Domain__Group__110186);
            rule__Domain__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5106:1: rule__Domain__Group__1__Impl : ( 'Domain' ) ;
    public final void rule__Domain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5110:1: ( ( 'Domain' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5111:1: ( 'Domain' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5111:1: ( 'Domain' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5112:1: 'Domain'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getDomainKeyword_1()); 
            }
            match(input,52,FOLLOW_52_in_rule__Domain__Group__1__Impl10214); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainAccess().getDomainKeyword_1()); 
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
    // $ANTLR end "rule__Domain__Group__1__Impl"


    // $ANTLR start "rule__Domain__Group__2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5125:1: rule__Domain__Group__2 : rule__Domain__Group__2__Impl rule__Domain__Group__3 ;
    public final void rule__Domain__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5129:1: ( rule__Domain__Group__2__Impl rule__Domain__Group__3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5130:2: rule__Domain__Group__2__Impl rule__Domain__Group__3
            {
            pushFollow(FOLLOW_rule__Domain__Group__2__Impl_in_rule__Domain__Group__210245);
            rule__Domain__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Domain__Group__3_in_rule__Domain__Group__210248);
            rule__Domain__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5137:1: rule__Domain__Group__2__Impl : ( ( rule__Domain__NameAssignment_2 ) ) ;
    public final void rule__Domain__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5141:1: ( ( ( rule__Domain__NameAssignment_2 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5142:1: ( ( rule__Domain__NameAssignment_2 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5142:1: ( ( rule__Domain__NameAssignment_2 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5143:1: ( rule__Domain__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getNameAssignment_2()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5144:1: ( rule__Domain__NameAssignment_2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5144:2: rule__Domain__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Domain__NameAssignment_2_in_rule__Domain__Group__2__Impl10275);
            rule__Domain__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__Domain__Group__2__Impl"


    // $ANTLR start "rule__Domain__Group__3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5154:1: rule__Domain__Group__3 : rule__Domain__Group__3__Impl rule__Domain__Group__4 ;
    public final void rule__Domain__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5158:1: ( rule__Domain__Group__3__Impl rule__Domain__Group__4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5159:2: rule__Domain__Group__3__Impl rule__Domain__Group__4
            {
            pushFollow(FOLLOW_rule__Domain__Group__3__Impl_in_rule__Domain__Group__310305);
            rule__Domain__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Domain__Group__4_in_rule__Domain__Group__310308);
            rule__Domain__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5166:1: rule__Domain__Group__3__Impl : ( 'Description: ' ) ;
    public final void rule__Domain__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5170:1: ( ( 'Description: ' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5171:1: ( 'Description: ' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5171:1: ( 'Description: ' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5172:1: 'Description: '
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getDescriptionKeyword_3()); 
            }
            match(input,53,FOLLOW_53_in_rule__Domain__Group__3__Impl10336); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainAccess().getDescriptionKeyword_3()); 
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
    // $ANTLR end "rule__Domain__Group__3__Impl"


    // $ANTLR start "rule__Domain__Group__4"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5185:1: rule__Domain__Group__4 : rule__Domain__Group__4__Impl rule__Domain__Group__5 ;
    public final void rule__Domain__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5189:1: ( rule__Domain__Group__4__Impl rule__Domain__Group__5 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5190:2: rule__Domain__Group__4__Impl rule__Domain__Group__5
            {
            pushFollow(FOLLOW_rule__Domain__Group__4__Impl_in_rule__Domain__Group__410367);
            rule__Domain__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Domain__Group__5_in_rule__Domain__Group__410370);
            rule__Domain__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5197:1: rule__Domain__Group__4__Impl : ( ( rule__Domain__DescriptionAssignment_4 ) ) ;
    public final void rule__Domain__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5201:1: ( ( ( rule__Domain__DescriptionAssignment_4 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5202:1: ( ( rule__Domain__DescriptionAssignment_4 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5202:1: ( ( rule__Domain__DescriptionAssignment_4 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5203:1: ( rule__Domain__DescriptionAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getDescriptionAssignment_4()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5204:1: ( rule__Domain__DescriptionAssignment_4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5204:2: rule__Domain__DescriptionAssignment_4
            {
            pushFollow(FOLLOW_rule__Domain__DescriptionAssignment_4_in_rule__Domain__Group__4__Impl10397);
            rule__Domain__DescriptionAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainAccess().getDescriptionAssignment_4()); 
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
    // $ANTLR end "rule__Domain__Group__4__Impl"


    // $ANTLR start "rule__Domain__Group__5"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5214:1: rule__Domain__Group__5 : rule__Domain__Group__5__Impl rule__Domain__Group__6 ;
    public final void rule__Domain__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5218:1: ( rule__Domain__Group__5__Impl rule__Domain__Group__6 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5219:2: rule__Domain__Group__5__Impl rule__Domain__Group__6
            {
            pushFollow(FOLLOW_rule__Domain__Group__5__Impl_in_rule__Domain__Group__510427);
            rule__Domain__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Domain__Group__6_in_rule__Domain__Group__510430);
            rule__Domain__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5226:1: rule__Domain__Group__5__Impl : ( '{' ) ;
    public final void rule__Domain__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5230:1: ( ( '{' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5231:1: ( '{' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5231:1: ( '{' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5232:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getLeftCurlyBracketKeyword_5()); 
            }
            match(input,22,FOLLOW_22_in_rule__Domain__Group__5__Impl10458); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainAccess().getLeftCurlyBracketKeyword_5()); 
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
    // $ANTLR end "rule__Domain__Group__5__Impl"


    // $ANTLR start "rule__Domain__Group__6"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5245:1: rule__Domain__Group__6 : rule__Domain__Group__6__Impl rule__Domain__Group__7 ;
    public final void rule__Domain__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5249:1: ( rule__Domain__Group__6__Impl rule__Domain__Group__7 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5250:2: rule__Domain__Group__6__Impl rule__Domain__Group__7
            {
            pushFollow(FOLLOW_rule__Domain__Group__6__Impl_in_rule__Domain__Group__610489);
            rule__Domain__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Domain__Group__7_in_rule__Domain__Group__610492);
            rule__Domain__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5257:1: rule__Domain__Group__6__Impl : ( ( ( rule__Domain__EntitiesAssignment_6 ) ) ( ( rule__Domain__EntitiesAssignment_6 )* ) ) ;
    public final void rule__Domain__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5261:1: ( ( ( ( rule__Domain__EntitiesAssignment_6 ) ) ( ( rule__Domain__EntitiesAssignment_6 )* ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5262:1: ( ( ( rule__Domain__EntitiesAssignment_6 ) ) ( ( rule__Domain__EntitiesAssignment_6 )* ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5262:1: ( ( ( rule__Domain__EntitiesAssignment_6 ) ) ( ( rule__Domain__EntitiesAssignment_6 )* ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5263:1: ( ( rule__Domain__EntitiesAssignment_6 ) ) ( ( rule__Domain__EntitiesAssignment_6 )* )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5263:1: ( ( rule__Domain__EntitiesAssignment_6 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5264:1: ( rule__Domain__EntitiesAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getEntitiesAssignment_6()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5265:1: ( rule__Domain__EntitiesAssignment_6 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5265:2: rule__Domain__EntitiesAssignment_6
            {
            pushFollow(FOLLOW_rule__Domain__EntitiesAssignment_6_in_rule__Domain__Group__6__Impl10521);
            rule__Domain__EntitiesAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainAccess().getEntitiesAssignment_6()); 
            }

            }

            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5268:1: ( ( rule__Domain__EntitiesAssignment_6 )* )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5269:1: ( rule__Domain__EntitiesAssignment_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getEntitiesAssignment_6()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5270:1: ( rule__Domain__EntitiesAssignment_6 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==51) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5270:2: rule__Domain__EntitiesAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Domain__EntitiesAssignment_6_in_rule__Domain__Group__6__Impl10533);
            	    rule__Domain__EntitiesAssignment_6();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainAccess().getEntitiesAssignment_6()); 
            }

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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5281:1: rule__Domain__Group__7 : rule__Domain__Group__7__Impl ;
    public final void rule__Domain__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5285:1: ( rule__Domain__Group__7__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5286:2: rule__Domain__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Domain__Group__7__Impl_in_rule__Domain__Group__710566);
            rule__Domain__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5292:1: rule__Domain__Group__7__Impl : ( '}' ) ;
    public final void rule__Domain__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5296:1: ( ( '}' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5297:1: ( '}' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5297:1: ( '}' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5298:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getRightCurlyBracketKeyword_7()); 
            }
            match(input,23,FOLLOW_23_in_rule__Domain__Group__7__Impl10594); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainAccess().getRightCurlyBracketKeyword_7()); 
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
    // $ANTLR end "rule__Domain__Group__7__Impl"


    // $ANTLR start "rule__Association__Group__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5327:1: rule__Association__Group__0 : rule__Association__Group__0__Impl rule__Association__Group__1 ;
    public final void rule__Association__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5331:1: ( rule__Association__Group__0__Impl rule__Association__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5332:2: rule__Association__Group__0__Impl rule__Association__Group__1
            {
            pushFollow(FOLLOW_rule__Association__Group__0__Impl_in_rule__Association__Group__010641);
            rule__Association__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Association__Group__1_in_rule__Association__Group__010644);
            rule__Association__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5339:1: rule__Association__Group__0__Impl : ( 'Relation' ) ;
    public final void rule__Association__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5343:1: ( ( 'Relation' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5344:1: ( 'Relation' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5344:1: ( 'Relation' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5345:1: 'Relation'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssociationAccess().getRelationKeyword_0()); 
            }
            match(input,54,FOLLOW_54_in_rule__Association__Group__0__Impl10672); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssociationAccess().getRelationKeyword_0()); 
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
    // $ANTLR end "rule__Association__Group__0__Impl"


    // $ANTLR start "rule__Association__Group__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5358:1: rule__Association__Group__1 : rule__Association__Group__1__Impl rule__Association__Group__2 ;
    public final void rule__Association__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5362:1: ( rule__Association__Group__1__Impl rule__Association__Group__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5363:2: rule__Association__Group__1__Impl rule__Association__Group__2
            {
            pushFollow(FOLLOW_rule__Association__Group__1__Impl_in_rule__Association__Group__110703);
            rule__Association__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Association__Group__2_in_rule__Association__Group__110706);
            rule__Association__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5370:1: rule__Association__Group__1__Impl : ( ( rule__Association__NameAssignment_1 ) ) ;
    public final void rule__Association__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5374:1: ( ( ( rule__Association__NameAssignment_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5375:1: ( ( rule__Association__NameAssignment_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5375:1: ( ( rule__Association__NameAssignment_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5376:1: ( rule__Association__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssociationAccess().getNameAssignment_1()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5377:1: ( rule__Association__NameAssignment_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5377:2: rule__Association__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Association__NameAssignment_1_in_rule__Association__Group__1__Impl10733);
            rule__Association__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssociationAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__Association__Group__1__Impl"


    // $ANTLR start "rule__Association__Group__2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5387:1: rule__Association__Group__2 : rule__Association__Group__2__Impl rule__Association__Group__3 ;
    public final void rule__Association__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5391:1: ( rule__Association__Group__2__Impl rule__Association__Group__3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5392:2: rule__Association__Group__2__Impl rule__Association__Group__3
            {
            pushFollow(FOLLOW_rule__Association__Group__2__Impl_in_rule__Association__Group__210763);
            rule__Association__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Association__Group__3_in_rule__Association__Group__210766);
            rule__Association__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5399:1: rule__Association__Group__2__Impl : ( ':' ) ;
    public final void rule__Association__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5403:1: ( ( ':' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5404:1: ( ':' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5404:1: ( ':' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5405:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssociationAccess().getColonKeyword_2()); 
            }
            match(input,55,FOLLOW_55_in_rule__Association__Group__2__Impl10794); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssociationAccess().getColonKeyword_2()); 
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
    // $ANTLR end "rule__Association__Group__2__Impl"


    // $ANTLR start "rule__Association__Group__3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5418:1: rule__Association__Group__3 : rule__Association__Group__3__Impl rule__Association__Group__4 ;
    public final void rule__Association__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5422:1: ( rule__Association__Group__3__Impl rule__Association__Group__4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5423:2: rule__Association__Group__3__Impl rule__Association__Group__4
            {
            pushFollow(FOLLOW_rule__Association__Group__3__Impl_in_rule__Association__Group__310825);
            rule__Association__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Association__Group__4_in_rule__Association__Group__310828);
            rule__Association__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5430:1: rule__Association__Group__3__Impl : ( ( rule__Association__TypeAssignment_3 ) ) ;
    public final void rule__Association__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5434:1: ( ( ( rule__Association__TypeAssignment_3 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5435:1: ( ( rule__Association__TypeAssignment_3 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5435:1: ( ( rule__Association__TypeAssignment_3 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5436:1: ( rule__Association__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssociationAccess().getTypeAssignment_3()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5437:1: ( rule__Association__TypeAssignment_3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5437:2: rule__Association__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Association__TypeAssignment_3_in_rule__Association__Group__3__Impl10855);
            rule__Association__TypeAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssociationAccess().getTypeAssignment_3()); 
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
    // $ANTLR end "rule__Association__Group__3__Impl"


    // $ANTLR start "rule__Association__Group__4"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5447:1: rule__Association__Group__4 : rule__Association__Group__4__Impl ;
    public final void rule__Association__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5451:1: ( rule__Association__Group__4__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5452:2: rule__Association__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Association__Group__4__Impl_in_rule__Association__Group__410885);
            rule__Association__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5458:1: rule__Association__Group__4__Impl : ( ( rule__Association__MultiplicityAssignment_4 ) ) ;
    public final void rule__Association__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5462:1: ( ( ( rule__Association__MultiplicityAssignment_4 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5463:1: ( ( rule__Association__MultiplicityAssignment_4 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5463:1: ( ( rule__Association__MultiplicityAssignment_4 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5464:1: ( rule__Association__MultiplicityAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssociationAccess().getMultiplicityAssignment_4()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5465:1: ( rule__Association__MultiplicityAssignment_4 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5465:2: rule__Association__MultiplicityAssignment_4
            {
            pushFollow(FOLLOW_rule__Association__MultiplicityAssignment_4_in_rule__Association__Group__4__Impl10912);
            rule__Association__MultiplicityAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssociationAccess().getMultiplicityAssignment_4()); 
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
    // $ANTLR end "rule__Association__Group__4__Impl"


    // $ANTLR start "rule__Field__Group__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5485:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5489:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5490:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__010952);
            rule__Field__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group__1_in_rule__Field__Group__010955);
            rule__Field__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5497:1: rule__Field__Group__0__Impl : ( 'Field' ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5501:1: ( ( 'Field' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5502:1: ( 'Field' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5502:1: ( 'Field' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5503:1: 'Field'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getFieldKeyword_0()); 
            }
            match(input,56,FOLLOW_56_in_rule__Field__Group__0__Impl10983); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getFieldKeyword_0()); 
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
    // $ANTLR end "rule__Field__Group__0__Impl"


    // $ANTLR start "rule__Field__Group__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5516:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5520:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5521:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__111014);
            rule__Field__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group__2_in_rule__Field__Group__111017);
            rule__Field__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5528:1: rule__Field__Group__1__Impl : ( ( rule__Field__NameAssignment_1 ) ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5532:1: ( ( ( rule__Field__NameAssignment_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5533:1: ( ( rule__Field__NameAssignment_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5533:1: ( ( rule__Field__NameAssignment_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5534:1: ( rule__Field__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getNameAssignment_1()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5535:1: ( rule__Field__NameAssignment_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5535:2: rule__Field__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Field__NameAssignment_1_in_rule__Field__Group__1__Impl11044);
            rule__Field__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__Field__Group__1__Impl"


    // $ANTLR start "rule__Field__Group__2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5545:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5549:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5550:2: rule__Field__Group__2__Impl rule__Field__Group__3
            {
            pushFollow(FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__211074);
            rule__Field__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Field__Group__3_in_rule__Field__Group__211077);
            rule__Field__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5557:1: rule__Field__Group__2__Impl : ( ':' ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5561:1: ( ( ':' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5562:1: ( ':' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5562:1: ( ':' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5563:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getColonKeyword_2()); 
            }
            match(input,55,FOLLOW_55_in_rule__Field__Group__2__Impl11105); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getColonKeyword_2()); 
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
    // $ANTLR end "rule__Field__Group__2__Impl"


    // $ANTLR start "rule__Field__Group__3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5576:1: rule__Field__Group__3 : rule__Field__Group__3__Impl ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5580:1: ( rule__Field__Group__3__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5581:2: rule__Field__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__311136);
            rule__Field__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5587:1: rule__Field__Group__3__Impl : ( ( rule__Field__LiteralAssignment_3 ) ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5591:1: ( ( ( rule__Field__LiteralAssignment_3 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5592:1: ( ( rule__Field__LiteralAssignment_3 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5592:1: ( ( rule__Field__LiteralAssignment_3 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5593:1: ( rule__Field__LiteralAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getLiteralAssignment_3()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5594:1: ( rule__Field__LiteralAssignment_3 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5594:2: rule__Field__LiteralAssignment_3
            {
            pushFollow(FOLLOW_rule__Field__LiteralAssignment_3_in_rule__Field__Group__3__Impl11163);
            rule__Field__LiteralAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getLiteralAssignment_3()); 
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
    // $ANTLR end "rule__Field__Group__3__Impl"


    // $ANTLR start "rule__Literal__Group_0__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5612:1: rule__Literal__Group_0__0 : rule__Literal__Group_0__0__Impl rule__Literal__Group_0__1 ;
    public final void rule__Literal__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5616:1: ( rule__Literal__Group_0__0__Impl rule__Literal__Group_0__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5617:2: rule__Literal__Group_0__0__Impl rule__Literal__Group_0__1
            {
            pushFollow(FOLLOW_rule__Literal__Group_0__0__Impl_in_rule__Literal__Group_0__011201);
            rule__Literal__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Literal__Group_0__1_in_rule__Literal__Group_0__011204);
            rule__Literal__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5624:1: rule__Literal__Group_0__0__Impl : ( () ) ;
    public final void rule__Literal__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5628:1: ( ( () ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5629:1: ( () )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5629:1: ( () )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5630:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getLiteralAction_0_0()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5631:1: ()
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5633:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getLiteralAction_0_0()); 
            }

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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5643:1: rule__Literal__Group_0__1 : rule__Literal__Group_0__1__Impl ;
    public final void rule__Literal__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5647:1: ( rule__Literal__Group_0__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5648:2: rule__Literal__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Literal__Group_0__1__Impl_in_rule__Literal__Group_0__111262);
            rule__Literal__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5654:1: rule__Literal__Group_0__1__Impl : ( ( rule__Literal__NameAssignment_0_1 ) ) ;
    public final void rule__Literal__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5658:1: ( ( ( rule__Literal__NameAssignment_0_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5659:1: ( ( rule__Literal__NameAssignment_0_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5659:1: ( ( rule__Literal__NameAssignment_0_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5660:1: ( rule__Literal__NameAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getNameAssignment_0_1()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5661:1: ( rule__Literal__NameAssignment_0_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5661:2: rule__Literal__NameAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Literal__NameAssignment_0_1_in_rule__Literal__Group_0__1__Impl11289);
            rule__Literal__NameAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getNameAssignment_0_1()); 
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
    // $ANTLR end "rule__Literal__Group_0__1__Impl"


    // $ANTLR start "rule__Literal__Group_1__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5675:1: rule__Literal__Group_1__0 : rule__Literal__Group_1__0__Impl rule__Literal__Group_1__1 ;
    public final void rule__Literal__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5679:1: ( rule__Literal__Group_1__0__Impl rule__Literal__Group_1__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5680:2: rule__Literal__Group_1__0__Impl rule__Literal__Group_1__1
            {
            pushFollow(FOLLOW_rule__Literal__Group_1__0__Impl_in_rule__Literal__Group_1__011323);
            rule__Literal__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Literal__Group_1__1_in_rule__Literal__Group_1__011326);
            rule__Literal__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5687:1: rule__Literal__Group_1__0__Impl : ( () ) ;
    public final void rule__Literal__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5691:1: ( ( () ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5692:1: ( () )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5692:1: ( () )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5693:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getLiteralAction_1_0()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5694:1: ()
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5696:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getLiteralAction_1_0()); 
            }

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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5706:1: rule__Literal__Group_1__1 : rule__Literal__Group_1__1__Impl ;
    public final void rule__Literal__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5710:1: ( rule__Literal__Group_1__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5711:2: rule__Literal__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Literal__Group_1__1__Impl_in_rule__Literal__Group_1__111384);
            rule__Literal__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5717:1: rule__Literal__Group_1__1__Impl : ( ( rule__Literal__NameAssignment_1_1 ) ) ;
    public final void rule__Literal__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5721:1: ( ( ( rule__Literal__NameAssignment_1_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5722:1: ( ( rule__Literal__NameAssignment_1_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5722:1: ( ( rule__Literal__NameAssignment_1_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5723:1: ( rule__Literal__NameAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getNameAssignment_1_1()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5724:1: ( rule__Literal__NameAssignment_1_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5724:2: rule__Literal__NameAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Literal__NameAssignment_1_1_in_rule__Literal__Group_1__1__Impl11411);
            rule__Literal__NameAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getNameAssignment_1_1()); 
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
    // $ANTLR end "rule__Literal__Group_1__1__Impl"


    // $ANTLR start "rule__Literal__Group_2__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5738:1: rule__Literal__Group_2__0 : rule__Literal__Group_2__0__Impl rule__Literal__Group_2__1 ;
    public final void rule__Literal__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5742:1: ( rule__Literal__Group_2__0__Impl rule__Literal__Group_2__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5743:2: rule__Literal__Group_2__0__Impl rule__Literal__Group_2__1
            {
            pushFollow(FOLLOW_rule__Literal__Group_2__0__Impl_in_rule__Literal__Group_2__011445);
            rule__Literal__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Literal__Group_2__1_in_rule__Literal__Group_2__011448);
            rule__Literal__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5750:1: rule__Literal__Group_2__0__Impl : ( () ) ;
    public final void rule__Literal__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5754:1: ( ( () ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5755:1: ( () )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5755:1: ( () )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5756:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getLiteralAction_2_0()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5757:1: ()
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5759:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getLiteralAction_2_0()); 
            }

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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5769:1: rule__Literal__Group_2__1 : rule__Literal__Group_2__1__Impl ;
    public final void rule__Literal__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5773:1: ( rule__Literal__Group_2__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5774:2: rule__Literal__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Literal__Group_2__1__Impl_in_rule__Literal__Group_2__111506);
            rule__Literal__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5780:1: rule__Literal__Group_2__1__Impl : ( ( rule__Literal__NameAssignment_2_1 ) ) ;
    public final void rule__Literal__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5784:1: ( ( ( rule__Literal__NameAssignment_2_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5785:1: ( ( rule__Literal__NameAssignment_2_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5785:1: ( ( rule__Literal__NameAssignment_2_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5786:1: ( rule__Literal__NameAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getNameAssignment_2_1()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5787:1: ( rule__Literal__NameAssignment_2_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5787:2: rule__Literal__NameAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Literal__NameAssignment_2_1_in_rule__Literal__Group_2__1__Impl11533);
            rule__Literal__NameAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getNameAssignment_2_1()); 
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
    // $ANTLR end "rule__Literal__Group_2__1__Impl"


    // $ANTLR start "rule__Literal__Group_3__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5801:1: rule__Literal__Group_3__0 : rule__Literal__Group_3__0__Impl rule__Literal__Group_3__1 ;
    public final void rule__Literal__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5805:1: ( rule__Literal__Group_3__0__Impl rule__Literal__Group_3__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5806:2: rule__Literal__Group_3__0__Impl rule__Literal__Group_3__1
            {
            pushFollow(FOLLOW_rule__Literal__Group_3__0__Impl_in_rule__Literal__Group_3__011567);
            rule__Literal__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Literal__Group_3__1_in_rule__Literal__Group_3__011570);
            rule__Literal__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5813:1: rule__Literal__Group_3__0__Impl : ( () ) ;
    public final void rule__Literal__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5817:1: ( ( () ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5818:1: ( () )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5818:1: ( () )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5819:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getLiteralAction_3_0()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5820:1: ()
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5822:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getLiteralAction_3_0()); 
            }

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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5832:1: rule__Literal__Group_3__1 : rule__Literal__Group_3__1__Impl ;
    public final void rule__Literal__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5836:1: ( rule__Literal__Group_3__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5837:2: rule__Literal__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Literal__Group_3__1__Impl_in_rule__Literal__Group_3__111628);
            rule__Literal__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5843:1: rule__Literal__Group_3__1__Impl : ( ( rule__Literal__NameAssignment_3_1 ) ) ;
    public final void rule__Literal__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5847:1: ( ( ( rule__Literal__NameAssignment_3_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5848:1: ( ( rule__Literal__NameAssignment_3_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5848:1: ( ( rule__Literal__NameAssignment_3_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5849:1: ( rule__Literal__NameAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getNameAssignment_3_1()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5850:1: ( rule__Literal__NameAssignment_3_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5850:2: rule__Literal__NameAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Literal__NameAssignment_3_1_in_rule__Literal__Group_3__1__Impl11655);
            rule__Literal__NameAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getNameAssignment_3_1()); 
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
    // $ANTLR end "rule__Literal__Group_3__1__Impl"


    // $ANTLR start "rule__Literal__Group_4__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5864:1: rule__Literal__Group_4__0 : rule__Literal__Group_4__0__Impl rule__Literal__Group_4__1 ;
    public final void rule__Literal__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5868:1: ( rule__Literal__Group_4__0__Impl rule__Literal__Group_4__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5869:2: rule__Literal__Group_4__0__Impl rule__Literal__Group_4__1
            {
            pushFollow(FOLLOW_rule__Literal__Group_4__0__Impl_in_rule__Literal__Group_4__011689);
            rule__Literal__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Literal__Group_4__1_in_rule__Literal__Group_4__011692);
            rule__Literal__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5876:1: rule__Literal__Group_4__0__Impl : ( () ) ;
    public final void rule__Literal__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5880:1: ( ( () ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5881:1: ( () )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5881:1: ( () )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5882:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getLiteralAction_4_0()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5883:1: ()
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5885:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getLiteralAction_4_0()); 
            }

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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5895:1: rule__Literal__Group_4__1 : rule__Literal__Group_4__1__Impl ;
    public final void rule__Literal__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5899:1: ( rule__Literal__Group_4__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5900:2: rule__Literal__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Literal__Group_4__1__Impl_in_rule__Literal__Group_4__111750);
            rule__Literal__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5906:1: rule__Literal__Group_4__1__Impl : ( ( rule__Literal__NameAssignment_4_1 ) ) ;
    public final void rule__Literal__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5910:1: ( ( ( rule__Literal__NameAssignment_4_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5911:1: ( ( rule__Literal__NameAssignment_4_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5911:1: ( ( rule__Literal__NameAssignment_4_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5912:1: ( rule__Literal__NameAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getNameAssignment_4_1()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5913:1: ( rule__Literal__NameAssignment_4_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5913:2: rule__Literal__NameAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Literal__NameAssignment_4_1_in_rule__Literal__Group_4__1__Impl11777);
            rule__Literal__NameAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getNameAssignment_4_1()); 
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
    // $ANTLR end "rule__Literal__Group_4__1__Impl"


    // $ANTLR start "rule__Enum__Group__0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5927:1: rule__Enum__Group__0 : rule__Enum__Group__0__Impl rule__Enum__Group__1 ;
    public final void rule__Enum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5931:1: ( rule__Enum__Group__0__Impl rule__Enum__Group__1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5932:2: rule__Enum__Group__0__Impl rule__Enum__Group__1
            {
            pushFollow(FOLLOW_rule__Enum__Group__0__Impl_in_rule__Enum__Group__011811);
            rule__Enum__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__011814);
            rule__Enum__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5939:1: rule__Enum__Group__0__Impl : ( 'Enum' ) ;
    public final void rule__Enum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5943:1: ( ( 'Enum' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5944:1: ( 'Enum' )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5944:1: ( 'Enum' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5945:1: 'Enum'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getEnumKeyword_0()); 
            }
            match(input,57,FOLLOW_57_in_rule__Enum__Group__0__Impl11842); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAccess().getEnumKeyword_0()); 
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
    // $ANTLR end "rule__Enum__Group__0__Impl"


    // $ANTLR start "rule__Enum__Group__1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5958:1: rule__Enum__Group__1 : rule__Enum__Group__1__Impl ;
    public final void rule__Enum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5962:1: ( rule__Enum__Group__1__Impl )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5963:2: rule__Enum__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Enum__Group__1__Impl_in_rule__Enum__Group__111873);
            rule__Enum__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5969:1: rule__Enum__Group__1__Impl : ( ( rule__Enum__TypeAssignment_1 ) ) ;
    public final void rule__Enum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5973:1: ( ( ( rule__Enum__TypeAssignment_1 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5974:1: ( ( rule__Enum__TypeAssignment_1 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5974:1: ( ( rule__Enum__TypeAssignment_1 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5975:1: ( rule__Enum__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getTypeAssignment_1()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5976:1: ( rule__Enum__TypeAssignment_1 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5976:2: rule__Enum__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Enum__TypeAssignment_1_in_rule__Enum__Group__1__Impl11900);
            rule__Enum__TypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAccess().getTypeAssignment_1()); 
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
    // $ANTLR end "rule__Enum__Group__1__Impl"


    // $ANTLR start "rule__Model__ElementsAssignment"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5991:1: rule__Model__ElementsAssignment : ( ruleElement ) ;
    public final void rule__Model__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5995:1: ( ( ruleElement ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5996:1: ( ruleElement )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5996:1: ( ruleElement )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:5997:1: ruleElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getElementsElementParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleElement_in_rule__Model__ElementsAssignment11939);
            ruleElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getElementsElementParserRuleCall_0()); 
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
    // $ANTLR end "rule__Model__ElementsAssignment"


    // $ANTLR start "rule__Flow__ImportsAssignment_0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6006:1: rule__Flow__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Flow__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6010:1: ( ( ruleImport ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6011:1: ( ruleImport )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6011:1: ( ruleImport )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6012:1: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFlowAccess().getImportsImportParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleImport_in_rule__Flow__ImportsAssignment_011970);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFlowAccess().getImportsImportParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Flow__ImportsAssignment_0"


    // $ANTLR start "rule__Flow__NameAssignment_2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6021:1: rule__Flow__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Flow__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6025:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6026:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6026:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6027:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFlowAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Flow__NameAssignment_212001); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFlowAccess().getNameIDTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__Flow__NameAssignment_2"


    // $ANTLR start "rule__Flow__ActivitiesAssignment_4"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6036:1: rule__Flow__ActivitiesAssignment_4 : ( ruleActivity ) ;
    public final void rule__Flow__ActivitiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6040:1: ( ( ruleActivity ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6041:1: ( ruleActivity )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6041:1: ( ruleActivity )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6042:1: ruleActivity
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFlowAccess().getActivitiesActivityParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleActivity_in_rule__Flow__ActivitiesAssignment_412032);
            ruleActivity();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFlowAccess().getActivitiesActivityParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__Flow__ActivitiesAssignment_4"


    // $ANTLR start "rule__Activity__NameAssignment_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6051:1: rule__Activity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Activity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6055:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6056:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6056:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6057:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Activity__NameAssignment_112063); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Activity__NameAssignment_1"


    // $ANTLR start "rule__Activity__SucessorsAssignment_3_2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6066:1: rule__Activity__SucessorsAssignment_3_2 : ( ( RULE_ID ) ) ;
    public final void rule__Activity__SucessorsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6070:1: ( ( ( RULE_ID ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6071:1: ( ( RULE_ID ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6071:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6072:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getSucessorsActivityCrossReference_3_2_0()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6073:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6074:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getSucessorsActivityIDTerminalRuleCall_3_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Activity__SucessorsAssignment_3_212098); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getSucessorsActivityIDTerminalRuleCall_3_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getSucessorsActivityCrossReference_3_2_0()); 
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
    // $ANTLR end "rule__Activity__SucessorsAssignment_3_2"


    // $ANTLR start "rule__Activity__SucessorsAssignment_3_3_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6085:1: rule__Activity__SucessorsAssignment_3_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Activity__SucessorsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6089:1: ( ( ( RULE_ID ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6090:1: ( ( RULE_ID ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6090:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6091:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getSucessorsActivityCrossReference_3_3_1_0()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6092:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6093:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getSucessorsActivityIDTerminalRuleCall_3_3_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Activity__SucessorsAssignment_3_3_112137); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getSucessorsActivityIDTerminalRuleCall_3_3_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getSucessorsActivityCrossReference_3_3_1_0()); 
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
    // $ANTLR end "rule__Activity__SucessorsAssignment_3_3_1"


    // $ANTLR start "rule__Activity__BusinessRuleAssignment_4_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6104:1: rule__Activity__BusinessRuleAssignment_4_1 : ( ( ruleFQN ) ) ;
    public final void rule__Activity__BusinessRuleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6108:1: ( ( ( ruleFQN ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6109:1: ( ( ruleFQN ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6109:1: ( ( ruleFQN ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6110:1: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getBusinessRuleBusinessRuleCrossReference_4_1_0()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6111:1: ( ruleFQN )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6112:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getBusinessRuleBusinessRuleFQNParserRuleCall_4_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Activity__BusinessRuleAssignment_4_112176);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getBusinessRuleBusinessRuleFQNParserRuleCall_4_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getBusinessRuleBusinessRuleCrossReference_4_1_0()); 
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
    // $ANTLR end "rule__Activity__BusinessRuleAssignment_4_1"


    // $ANTLR start "rule__Activity__DescriptionAssignment_6"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6123:1: rule__Activity__DescriptionAssignment_6 : ( ( '\"' ) ) ;
    public final void rule__Activity__DescriptionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6127:1: ( ( ( '\"' ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6128:1: ( ( '\"' ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6128:1: ( ( '\"' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6129:1: ( '\"' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getDescriptionQuotationMarkKeyword_6_0()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6130:1: ( '\"' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6131:1: '\"'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActivityAccess().getDescriptionQuotationMarkKeyword_6_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__Activity__DescriptionAssignment_612216); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getDescriptionQuotationMarkKeyword_6_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActivityAccess().getDescriptionQuotationMarkKeyword_6_0()); 
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
    // $ANTLR end "rule__Activity__DescriptionAssignment_6"


    // $ANTLR start "rule__BusinessRule__ImportsAssignment_0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6146:1: rule__BusinessRule__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__BusinessRule__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6150:1: ( ( ruleImport ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6151:1: ( ruleImport )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6151:1: ( ruleImport )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6152:1: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBusinessRuleAccess().getImportsImportParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleImport_in_rule__BusinessRule__ImportsAssignment_012255);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBusinessRuleAccess().getImportsImportParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__BusinessRule__ImportsAssignment_0"


    // $ANTLR start "rule__BusinessRule__NameAssignment_2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6161:1: rule__BusinessRule__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__BusinessRule__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6165:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6166:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6166:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6167:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBusinessRuleAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BusinessRule__NameAssignment_212286); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBusinessRuleAccess().getNameIDTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__BusinessRule__NameAssignment_2"


    // $ANTLR start "rule__BusinessRule__TypAssignment_4"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6176:1: rule__BusinessRule__TypAssignment_4 : ( ruleBREType ) ;
    public final void rule__BusinessRule__TypAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6180:1: ( ( ruleBREType ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6181:1: ( ruleBREType )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6181:1: ( ruleBREType )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6182:1: ruleBREType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBusinessRuleAccess().getTypBRETypeEnumRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleBREType_in_rule__BusinessRule__TypAssignment_412317);
            ruleBREType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBusinessRuleAccess().getTypBRETypeEnumRuleCall_4_0()); 
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
    // $ANTLR end "rule__BusinessRule__TypAssignment_4"


    // $ANTLR start "rule__BusinessRule__SystemInputsAssignment_8"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6191:1: rule__BusinessRule__SystemInputsAssignment_8 : ( ( rule__BusinessRule__SystemInputsAlternatives_8_0 ) ) ;
    public final void rule__BusinessRule__SystemInputsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6195:1: ( ( ( rule__BusinessRule__SystemInputsAlternatives_8_0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6196:1: ( ( rule__BusinessRule__SystemInputsAlternatives_8_0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6196:1: ( ( rule__BusinessRule__SystemInputsAlternatives_8_0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6197:1: ( rule__BusinessRule__SystemInputsAlternatives_8_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBusinessRuleAccess().getSystemInputsAlternatives_8_0()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6198:1: ( rule__BusinessRule__SystemInputsAlternatives_8_0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6198:2: rule__BusinessRule__SystemInputsAlternatives_8_0
            {
            pushFollow(FOLLOW_rule__BusinessRule__SystemInputsAlternatives_8_0_in_rule__BusinessRule__SystemInputsAssignment_812348);
            rule__BusinessRule__SystemInputsAlternatives_8_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBusinessRuleAccess().getSystemInputsAlternatives_8_0()); 
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
    // $ANTLR end "rule__BusinessRule__SystemInputsAssignment_8"


    // $ANTLR start "rule__BusinessRule__OutputAssignment_12"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6207:1: rule__BusinessRule__OutputAssignment_12 : ( ( ruleFQN ) ) ;
    public final void rule__BusinessRule__OutputAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6211:1: ( ( ( ruleFQN ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6212:1: ( ( ruleFQN ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6212:1: ( ( ruleFQN ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6213:1: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBusinessRuleAccess().getOutputEntityCrossReference_12_0()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6214:1: ( ruleFQN )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6215:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBusinessRuleAccess().getOutputEntityFQNParserRuleCall_12_0_1()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__BusinessRule__OutputAssignment_1212385);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBusinessRuleAccess().getOutputEntityFQNParserRuleCall_12_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBusinessRuleAccess().getOutputEntityCrossReference_12_0()); 
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
    // $ANTLR end "rule__BusinessRule__OutputAssignment_12"


    // $ANTLR start "rule__BreSystemEntityInput__InputElementAssignment_0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6226:1: rule__BreSystemEntityInput__InputElementAssignment_0 : ( ( ruleFQN ) ) ;
    public final void rule__BreSystemEntityInput__InputElementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6230:1: ( ( ( ruleFQN ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6231:1: ( ( ruleFQN ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6231:1: ( ( ruleFQN ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6232:1: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBreSystemEntityInputAccess().getInputElementSystemEntityCrossReference_0_0()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6233:1: ( ruleFQN )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6234:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBreSystemEntityInputAccess().getInputElementSystemEntityFQNParserRuleCall_0_0_1()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__BreSystemEntityInput__InputElementAssignment_012424);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBreSystemEntityInputAccess().getInputElementSystemEntityFQNParserRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBreSystemEntityInputAccess().getInputElementSystemEntityCrossReference_0_0()); 
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
    // $ANTLR end "rule__BreSystemEntityInput__InputElementAssignment_0"


    // $ANTLR start "rule__BreSystemEntityInput__ConfigurationAssignment_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6245:1: rule__BreSystemEntityInput__ConfigurationAssignment_1 : ( ruleSystemEntityConfiguration ) ;
    public final void rule__BreSystemEntityInput__ConfigurationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6249:1: ( ( ruleSystemEntityConfiguration ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6250:1: ( ruleSystemEntityConfiguration )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6250:1: ( ruleSystemEntityConfiguration )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6251:1: ruleSystemEntityConfiguration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBreSystemEntityInputAccess().getConfigurationSystemEntityConfigurationParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleSystemEntityConfiguration_in_rule__BreSystemEntityInput__ConfigurationAssignment_112459);
            ruleSystemEntityConfiguration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBreSystemEntityInputAccess().getConfigurationSystemEntityConfigurationParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__BreSystemEntityInput__ConfigurationAssignment_1"


    // $ANTLR start "rule__BreEntityInput__InputElementAssignment_0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6260:1: rule__BreEntityInput__InputElementAssignment_0 : ( ( ruleFQN ) ) ;
    public final void rule__BreEntityInput__InputElementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6264:1: ( ( ( ruleFQN ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6265:1: ( ( ruleFQN ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6265:1: ( ( ruleFQN ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6266:1: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBreEntityInputAccess().getInputElementEntityCrossReference_0_0()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6267:1: ( ruleFQN )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6268:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBreEntityInputAccess().getInputElementEntityFQNParserRuleCall_0_0_1()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__BreEntityInput__InputElementAssignment_012494);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBreEntityInputAccess().getInputElementEntityFQNParserRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBreEntityInputAccess().getInputElementEntityCrossReference_0_0()); 
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
    // $ANTLR end "rule__BreEntityInput__InputElementAssignment_0"


    // $ANTLR start "rule__BreEntityInput__ConfigurationAssignment_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6279:1: rule__BreEntityInput__ConfigurationAssignment_1 : ( ruleEntityConfiguration ) ;
    public final void rule__BreEntityInput__ConfigurationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6283:1: ( ( ruleEntityConfiguration ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6284:1: ( ruleEntityConfiguration )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6284:1: ( ruleEntityConfiguration )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6285:1: ruleEntityConfiguration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBreEntityInputAccess().getConfigurationEntityConfigurationParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleEntityConfiguration_in_rule__BreEntityInput__ConfigurationAssignment_112529);
            ruleEntityConfiguration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBreEntityInputAccess().getConfigurationEntityConfigurationParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__BreEntityInput__ConfigurationAssignment_1"


    // $ANTLR start "rule__SystemEntityConfiguration__PrimaryAssignment_4"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6294:1: rule__SystemEntityConfiguration__PrimaryAssignment_4 : ( ruleBoolean ) ;
    public final void rule__SystemEntityConfiguration__PrimaryAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6298:1: ( ( ruleBoolean ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6299:1: ( ruleBoolean )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6299:1: ( ruleBoolean )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6300:1: ruleBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemEntityConfigurationAccess().getPrimaryBooleanEnumRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleBoolean_in_rule__SystemEntityConfiguration__PrimaryAssignment_412560);
            ruleBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemEntityConfigurationAccess().getPrimaryBooleanEnumRuleCall_4_0()); 
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
    // $ANTLR end "rule__SystemEntityConfiguration__PrimaryAssignment_4"


    // $ANTLR start "rule__SystemEntityConfiguration__ObligatorischAssignment_8"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6309:1: rule__SystemEntityConfiguration__ObligatorischAssignment_8 : ( ruleBoolean ) ;
    public final void rule__SystemEntityConfiguration__ObligatorischAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6313:1: ( ( ruleBoolean ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6314:1: ( ruleBoolean )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6314:1: ( ruleBoolean )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6315:1: ruleBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemEntityConfigurationAccess().getObligatorischBooleanEnumRuleCall_8_0()); 
            }
            pushFollow(FOLLOW_ruleBoolean_in_rule__SystemEntityConfiguration__ObligatorischAssignment_812591);
            ruleBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemEntityConfigurationAccess().getObligatorischBooleanEnumRuleCall_8_0()); 
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
    // $ANTLR end "rule__SystemEntityConfiguration__ObligatorischAssignment_8"


    // $ANTLR start "rule__SystemEntityConfiguration__MultipleAssignment_12"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6324:1: rule__SystemEntityConfiguration__MultipleAssignment_12 : ( ruleBoolean ) ;
    public final void rule__SystemEntityConfiguration__MultipleAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6328:1: ( ( ruleBoolean ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6329:1: ( ruleBoolean )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6329:1: ( ruleBoolean )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6330:1: ruleBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemEntityConfigurationAccess().getMultipleBooleanEnumRuleCall_12_0()); 
            }
            pushFollow(FOLLOW_ruleBoolean_in_rule__SystemEntityConfiguration__MultipleAssignment_1212622);
            ruleBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemEntityConfigurationAccess().getMultipleBooleanEnumRuleCall_12_0()); 
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
    // $ANTLR end "rule__SystemEntityConfiguration__MultipleAssignment_12"


    // $ANTLR start "rule__SystemEntityConfiguration__JoinCriteriaAssignment_13_3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6339:1: rule__SystemEntityConfiguration__JoinCriteriaAssignment_13_3 : ( RULE_STRING ) ;
    public final void rule__SystemEntityConfiguration__JoinCriteriaAssignment_13_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6343:1: ( ( RULE_STRING ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6344:1: ( RULE_STRING )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6344:1: ( RULE_STRING )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6345:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemEntityConfigurationAccess().getJoinCriteriaSTRINGTerminalRuleCall_13_3_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SystemEntityConfiguration__JoinCriteriaAssignment_13_312653); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemEntityConfigurationAccess().getJoinCriteriaSTRINGTerminalRuleCall_13_3_0()); 
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
    // $ANTLR end "rule__SystemEntityConfiguration__JoinCriteriaAssignment_13_3"


    // $ANTLR start "rule__EntityConfiguration__PrimaryAssignment_4"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6354:1: rule__EntityConfiguration__PrimaryAssignment_4 : ( ruleBoolean ) ;
    public final void rule__EntityConfiguration__PrimaryAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6358:1: ( ( ruleBoolean ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6359:1: ( ruleBoolean )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6359:1: ( ruleBoolean )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6360:1: ruleBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityConfigurationAccess().getPrimaryBooleanEnumRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleBoolean_in_rule__EntityConfiguration__PrimaryAssignment_412684);
            ruleBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityConfigurationAccess().getPrimaryBooleanEnumRuleCall_4_0()); 
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
    // $ANTLR end "rule__EntityConfiguration__PrimaryAssignment_4"


    // $ANTLR start "rule__EntityConfiguration__ObligatorischAssignment_8"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6369:1: rule__EntityConfiguration__ObligatorischAssignment_8 : ( ruleBoolean ) ;
    public final void rule__EntityConfiguration__ObligatorischAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6373:1: ( ( ruleBoolean ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6374:1: ( ruleBoolean )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6374:1: ( ruleBoolean )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6375:1: ruleBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityConfigurationAccess().getObligatorischBooleanEnumRuleCall_8_0()); 
            }
            pushFollow(FOLLOW_ruleBoolean_in_rule__EntityConfiguration__ObligatorischAssignment_812715);
            ruleBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityConfigurationAccess().getObligatorischBooleanEnumRuleCall_8_0()); 
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
    // $ANTLR end "rule__EntityConfiguration__ObligatorischAssignment_8"


    // $ANTLR start "rule__EntityConfiguration__MultipleAssignment_12"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6384:1: rule__EntityConfiguration__MultipleAssignment_12 : ( ruleBoolean ) ;
    public final void rule__EntityConfiguration__MultipleAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6388:1: ( ( ruleBoolean ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6389:1: ( ruleBoolean )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6389:1: ( ruleBoolean )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6390:1: ruleBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityConfigurationAccess().getMultipleBooleanEnumRuleCall_12_0()); 
            }
            pushFollow(FOLLOW_ruleBoolean_in_rule__EntityConfiguration__MultipleAssignment_1212746);
            ruleBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityConfigurationAccess().getMultipleBooleanEnumRuleCall_12_0()); 
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
    // $ANTLR end "rule__EntityConfiguration__MultipleAssignment_12"


    // $ANTLR start "rule__EntityConfiguration__PathAssignment_13_3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6399:1: rule__EntityConfiguration__PathAssignment_13_3 : ( ( ruleFQN ) ) ;
    public final void rule__EntityConfiguration__PathAssignment_13_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6403:1: ( ( ( ruleFQN ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6404:1: ( ( ruleFQN ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6404:1: ( ( ruleFQN ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6405:1: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityConfigurationAccess().getPathAssociationCrossReference_13_3_0()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6406:1: ( ruleFQN )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6407:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityConfigurationAccess().getPathAssociationFQNParserRuleCall_13_3_0_1()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__EntityConfiguration__PathAssignment_13_312781);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityConfigurationAccess().getPathAssociationFQNParserRuleCall_13_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityConfigurationAccess().getPathAssociationCrossReference_13_3_0()); 
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
    // $ANTLR end "rule__EntityConfiguration__PathAssignment_13_3"


    // $ANTLR start "rule__System__NameAssignment_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6418:1: rule__System__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__System__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6422:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6423:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6423:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6424:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__System__NameAssignment_112816); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__System__NameAssignment_1"


    // $ANTLR start "rule__System__SrcEntitiesAssignment_3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6433:1: rule__System__SrcEntitiesAssignment_3 : ( ruleSystemEntity ) ;
    public final void rule__System__SrcEntitiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6437:1: ( ( ruleSystemEntity ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6438:1: ( ruleSystemEntity )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6438:1: ( ruleSystemEntity )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6439:1: ruleSystemEntity
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemAccess().getSrcEntitiesSystemEntityParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleSystemEntity_in_rule__System__SrcEntitiesAssignment_312847);
            ruleSystemEntity();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemAccess().getSrcEntitiesSystemEntityParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__System__SrcEntitiesAssignment_3"


    // $ANTLR start "rule__SystemEntity__NameAssignment_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6448:1: rule__SystemEntity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SystemEntity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6452:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6453:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6453:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6454:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SystemEntity__NameAssignment_112878); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemEntityAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__SystemEntity__NameAssignment_1"


    // $ANTLR start "rule__SystemEntity__FormatAssignment_3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6463:1: rule__SystemEntity__FormatAssignment_3 : ( RULE_STRING ) ;
    public final void rule__SystemEntity__FormatAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6467:1: ( ( RULE_STRING ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6468:1: ( RULE_STRING )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6468:1: ( RULE_STRING )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6469:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSystemEntityAccess().getFormatSTRINGTerminalRuleCall_3_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SystemEntity__FormatAssignment_312909); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSystemEntityAccess().getFormatSTRINGTerminalRuleCall_3_0()); 
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
    // $ANTLR end "rule__SystemEntity__FormatAssignment_3"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6478:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleFqnWithWildCard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6482:1: ( ( ruleFqnWithWildCard ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6483:1: ( ruleFqnWithWildCard )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6483:1: ( ruleFqnWithWildCard )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6484:1: ruleFqnWithWildCard
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceFqnWithWildCardParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleFqnWithWildCard_in_rule__Import__ImportedNamespaceAssignment_112940);
            ruleFqnWithWildCard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportedNamespaceFqnWithWildCardParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__Diagram__ImportsAssignment_0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6493:1: rule__Diagram__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Diagram__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6497:1: ( ( ruleImport ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6498:1: ( ruleImport )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6498:1: ( ruleImport )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6499:1: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDiagramAccess().getImportsImportParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleImport_in_rule__Diagram__ImportsAssignment_012971);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDiagramAccess().getImportsImportParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Diagram__ImportsAssignment_0"


    // $ANTLR start "rule__Diagram__NameAssignment_2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6508:1: rule__Diagram__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Diagram__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6512:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6513:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6513:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6514:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDiagramAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Diagram__NameAssignment_213002); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDiagramAccess().getNameIDTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__Diagram__NameAssignment_2"


    // $ANTLR start "rule__Diagram__IncludesAssignment_4"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6523:1: rule__Diagram__IncludesAssignment_4 : ( ruleInclude ) ;
    public final void rule__Diagram__IncludesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6527:1: ( ( ruleInclude ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6528:1: ( ruleInclude )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6528:1: ( ruleInclude )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6529:1: ruleInclude
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDiagramAccess().getIncludesIncludeParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleInclude_in_rule__Diagram__IncludesAssignment_413033);
            ruleInclude();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDiagramAccess().getIncludesIncludeParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__Diagram__IncludesAssignment_4"


    // $ANTLR start "rule__Include__IncludeAssignment_0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6538:1: rule__Include__IncludeAssignment_0 : ( ( rule__Include__IncludeAlternatives_0_0 ) ) ;
    public final void rule__Include__IncludeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6542:1: ( ( ( rule__Include__IncludeAlternatives_0_0 ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6543:1: ( ( rule__Include__IncludeAlternatives_0_0 ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6543:1: ( ( rule__Include__IncludeAlternatives_0_0 ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6544:1: ( rule__Include__IncludeAlternatives_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIncludeAccess().getIncludeAlternatives_0_0()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6545:1: ( rule__Include__IncludeAlternatives_0_0 )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6545:2: rule__Include__IncludeAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__Include__IncludeAlternatives_0_0_in_rule__Include__IncludeAssignment_013064);
            rule__Include__IncludeAlternatives_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIncludeAccess().getIncludeAlternatives_0_0()); 
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
    // $ANTLR end "rule__Include__IncludeAssignment_0"


    // $ANTLR start "rule__Include__EntityAssignment_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6554:1: rule__Include__EntityAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__Include__EntityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6558:1: ( ( ( ruleFQN ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6559:1: ( ( ruleFQN ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6559:1: ( ( ruleFQN ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6560:1: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIncludeAccess().getEntityEntityCrossReference_1_0()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6561:1: ( ruleFQN )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6562:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIncludeAccess().getEntityEntityFQNParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Include__EntityAssignment_113101);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIncludeAccess().getEntityEntityFQNParserRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIncludeAccess().getEntityEntityCrossReference_1_0()); 
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
    // $ANTLR end "rule__Include__EntityAssignment_1"


    // $ANTLR start "rule__Include__FieldsAssignment_2_2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6573:1: rule__Include__FieldsAssignment_2_2 : ( ( RULE_ID ) ) ;
    public final void rule__Include__FieldsAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6577:1: ( ( ( RULE_ID ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6578:1: ( ( RULE_ID ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6578:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6579:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIncludeAccess().getFieldsPropertyCrossReference_2_2_0()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6580:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6581:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIncludeAccess().getFieldsPropertyIDTerminalRuleCall_2_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Include__FieldsAssignment_2_213140); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIncludeAccess().getFieldsPropertyIDTerminalRuleCall_2_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIncludeAccess().getFieldsPropertyCrossReference_2_2_0()); 
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
    // $ANTLR end "rule__Include__FieldsAssignment_2_2"


    // $ANTLR start "rule__Include__FieldsAssignment_2_3_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6592:1: rule__Include__FieldsAssignment_2_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Include__FieldsAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6596:1: ( ( ( RULE_ID ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6597:1: ( ( RULE_ID ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6597:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6598:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIncludeAccess().getFieldsPropertyCrossReference_2_3_1_0()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6599:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6600:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIncludeAccess().getFieldsPropertyIDTerminalRuleCall_2_3_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Include__FieldsAssignment_2_3_113179); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIncludeAccess().getFieldsPropertyIDTerminalRuleCall_2_3_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIncludeAccess().getFieldsPropertyCrossReference_2_3_1_0()); 
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
    // $ANTLR end "rule__Include__FieldsAssignment_2_3_1"


    // $ANTLR start "rule__EnumDeclaration__NameAssignment_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6611:1: rule__EnumDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EnumDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6615:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6616:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6616:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6617:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumDeclaration__NameAssignment_113214); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__EnumDeclaration__NameAssignment_1"


    // $ANTLR start "rule__EnumDeclaration__ValuesAssignment_3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6626:1: rule__EnumDeclaration__ValuesAssignment_3 : ( RULE_ID ) ;
    public final void rule__EnumDeclaration__ValuesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6630:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6631:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6631:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6632:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumDeclarationAccess().getValuesIDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumDeclaration__ValuesAssignment_313245); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumDeclarationAccess().getValuesIDTerminalRuleCall_3_0()); 
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
    // $ANTLR end "rule__EnumDeclaration__ValuesAssignment_3"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6641:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6645:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6646:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6646:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6647:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_113276); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__PropertiesAssignment_3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6656:1: rule__Entity__PropertiesAssignment_3 : ( ruleProperty ) ;
    public final void rule__Entity__PropertiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6660:1: ( ( ruleProperty ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6661:1: ( ruleProperty )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6661:1: ( ruleProperty )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6662:1: ruleProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getPropertiesPropertyParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_rule__Entity__PropertiesAssignment_313307);
            ruleProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getPropertiesPropertyParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__Entity__PropertiesAssignment_3"


    // $ANTLR start "rule__Domain__ImportsAssignment_0"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6671:1: rule__Domain__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Domain__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6675:1: ( ( ruleImport ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6676:1: ( ruleImport )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6676:1: ( ruleImport )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6677:1: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getImportsImportParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleImport_in_rule__Domain__ImportsAssignment_013338);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainAccess().getImportsImportParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Domain__ImportsAssignment_0"


    // $ANTLR start "rule__Domain__NameAssignment_2"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6686:1: rule__Domain__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Domain__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6690:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6691:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6691:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6692:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Domain__NameAssignment_213369); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainAccess().getNameIDTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__Domain__NameAssignment_2"


    // $ANTLR start "rule__Domain__DescriptionAssignment_4"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6701:1: rule__Domain__DescriptionAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Domain__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6705:1: ( ( RULE_STRING ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6706:1: ( RULE_STRING )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6706:1: ( RULE_STRING )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6707:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Domain__DescriptionAssignment_413400); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainAccess().getDescriptionSTRINGTerminalRuleCall_4_0()); 
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
    // $ANTLR end "rule__Domain__DescriptionAssignment_4"


    // $ANTLR start "rule__Domain__EntitiesAssignment_6"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6716:1: rule__Domain__EntitiesAssignment_6 : ( ruleEntity ) ;
    public final void rule__Domain__EntitiesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6720:1: ( ( ruleEntity ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6721:1: ( ruleEntity )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6721:1: ( ruleEntity )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6722:1: ruleEntity
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainAccess().getEntitiesEntityParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_ruleEntity_in_rule__Domain__EntitiesAssignment_613431);
            ruleEntity();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainAccess().getEntitiesEntityParserRuleCall_6_0()); 
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
    // $ANTLR end "rule__Domain__EntitiesAssignment_6"


    // $ANTLR start "rule__Association__NameAssignment_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6731:1: rule__Association__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Association__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6735:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6736:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6736:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6737:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssociationAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Association__NameAssignment_113462); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssociationAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Association__NameAssignment_1"


    // $ANTLR start "rule__Association__TypeAssignment_3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6746:1: rule__Association__TypeAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__Association__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6750:1: ( ( ( ruleFQN ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6751:1: ( ( ruleFQN ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6751:1: ( ( ruleFQN ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6752:1: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssociationAccess().getTypeEntityCrossReference_3_0()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6753:1: ( ruleFQN )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6754:1: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssociationAccess().getTypeEntityFQNParserRuleCall_3_0_1()); 
            }
            pushFollow(FOLLOW_ruleFQN_in_rule__Association__TypeAssignment_313497);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssociationAccess().getTypeEntityFQNParserRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssociationAccess().getTypeEntityCrossReference_3_0()); 
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
    // $ANTLR end "rule__Association__TypeAssignment_3"


    // $ANTLR start "rule__Association__MultiplicityAssignment_4"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6765:1: rule__Association__MultiplicityAssignment_4 : ( ruleMultiplicty ) ;
    public final void rule__Association__MultiplicityAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6769:1: ( ( ruleMultiplicty ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6770:1: ( ruleMultiplicty )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6770:1: ( ruleMultiplicty )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6771:1: ruleMultiplicty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssociationAccess().getMultiplicityMultiplictyEnumRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleMultiplicty_in_rule__Association__MultiplicityAssignment_413532);
            ruleMultiplicty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssociationAccess().getMultiplicityMultiplictyEnumRuleCall_4_0()); 
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
    // $ANTLR end "rule__Association__MultiplicityAssignment_4"


    // $ANTLR start "rule__Field__NameAssignment_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6780:1: rule__Field__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Field__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6784:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6785:1: ( RULE_ID )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6785:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6786:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Field__NameAssignment_113563); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Field__NameAssignment_1"


    // $ANTLR start "rule__Field__LiteralAssignment_3"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6795:1: rule__Field__LiteralAssignment_3 : ( ruleLiteral ) ;
    public final void rule__Field__LiteralAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6799:1: ( ( ruleLiteral ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6800:1: ( ruleLiteral )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6800:1: ( ruleLiteral )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6801:1: ruleLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFieldAccess().getLiteralLiteralParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_rule__Field__LiteralAssignment_313594);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFieldAccess().getLiteralLiteralParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__Field__LiteralAssignment_3"


    // $ANTLR start "rule__Literal__NameAssignment_0_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6810:1: rule__Literal__NameAssignment_0_1 : ( ( 'Decimal' ) ) ;
    public final void rule__Literal__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6814:1: ( ( ( 'Decimal' ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6815:1: ( ( 'Decimal' ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6815:1: ( ( 'Decimal' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6816:1: ( 'Decimal' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getNameDecimalKeyword_0_1_0()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6817:1: ( 'Decimal' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6818:1: 'Decimal'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getNameDecimalKeyword_0_1_0()); 
            }
            match(input,58,FOLLOW_58_in_rule__Literal__NameAssignment_0_113630); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getNameDecimalKeyword_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getNameDecimalKeyword_0_1_0()); 
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
    // $ANTLR end "rule__Literal__NameAssignment_0_1"


    // $ANTLR start "rule__Literal__NameAssignment_1_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6833:1: rule__Literal__NameAssignment_1_1 : ( ( 'Money' ) ) ;
    public final void rule__Literal__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6837:1: ( ( ( 'Money' ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6838:1: ( ( 'Money' ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6838:1: ( ( 'Money' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6839:1: ( 'Money' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getNameMoneyKeyword_1_1_0()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6840:1: ( 'Money' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6841:1: 'Money'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getNameMoneyKeyword_1_1_0()); 
            }
            match(input,59,FOLLOW_59_in_rule__Literal__NameAssignment_1_113674); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getNameMoneyKeyword_1_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getNameMoneyKeyword_1_1_0()); 
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
    // $ANTLR end "rule__Literal__NameAssignment_1_1"


    // $ANTLR start "rule__Literal__NameAssignment_2_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6856:1: rule__Literal__NameAssignment_2_1 : ( ( 'Text' ) ) ;
    public final void rule__Literal__NameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6860:1: ( ( ( 'Text' ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6861:1: ( ( 'Text' ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6861:1: ( ( 'Text' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6862:1: ( 'Text' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getNameTextKeyword_2_1_0()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6863:1: ( 'Text' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6864:1: 'Text'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getNameTextKeyword_2_1_0()); 
            }
            match(input,60,FOLLOW_60_in_rule__Literal__NameAssignment_2_113718); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getNameTextKeyword_2_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getNameTextKeyword_2_1_0()); 
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
    // $ANTLR end "rule__Literal__NameAssignment_2_1"


    // $ANTLR start "rule__Literal__NameAssignment_3_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6879:1: rule__Literal__NameAssignment_3_1 : ( ( 'Boolean' ) ) ;
    public final void rule__Literal__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6883:1: ( ( ( 'Boolean' ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6884:1: ( ( 'Boolean' ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6884:1: ( ( 'Boolean' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6885:1: ( 'Boolean' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getNameBooleanKeyword_3_1_0()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6886:1: ( 'Boolean' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6887:1: 'Boolean'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getNameBooleanKeyword_3_1_0()); 
            }
            match(input,61,FOLLOW_61_in_rule__Literal__NameAssignment_3_113762); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getNameBooleanKeyword_3_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getNameBooleanKeyword_3_1_0()); 
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
    // $ANTLR end "rule__Literal__NameAssignment_3_1"


    // $ANTLR start "rule__Literal__NameAssignment_4_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6902:1: rule__Literal__NameAssignment_4_1 : ( ( 'Int' ) ) ;
    public final void rule__Literal__NameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6906:1: ( ( ( 'Int' ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6907:1: ( ( 'Int' ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6907:1: ( ( 'Int' ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6908:1: ( 'Int' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getNameIntKeyword_4_1_0()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6909:1: ( 'Int' )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6910:1: 'Int'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getNameIntKeyword_4_1_0()); 
            }
            match(input,62,FOLLOW_62_in_rule__Literal__NameAssignment_4_113806); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getNameIntKeyword_4_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getNameIntKeyword_4_1_0()); 
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
    // $ANTLR end "rule__Literal__NameAssignment_4_1"


    // $ANTLR start "rule__Enum__TypeAssignment_1"
    // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6925:1: rule__Enum__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Enum__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6929:1: ( ( ( RULE_ID ) ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6930:1: ( ( RULE_ID ) )
            {
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6930:1: ( ( RULE_ID ) )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6931:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getTypeEnumDeclarationCrossReference_1_0()); 
            }
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6932:1: ( RULE_ID )
            // ../org.pklose.espl.ui/src-gen/org/pklose/espl/ui/contentassist/antlr/internal/InternalEsplm.g:6933:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumAccess().getTypeEnumDeclarationIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Enum__TypeAssignment_113849); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAccess().getTypeEnumDeclarationIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumAccess().getTypeEnumDeclarationCrossReference_1_0()); 
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
    // $ANTLR end "rule__Enum__TypeAssignment_1"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA1_eotS =
        "\14\uffff";
    static final String DFA1_eofS =
        "\14\uffff";
    static final String DFA1_minS =
        "\1\25\1\uffff\1\4\5\uffff\1\25\1\4\2\25";
    static final String DFA1_maxS =
        "\1\64\1\uffff\1\4\5\uffff\1\64\1\4\2\64";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\1\3\1\4\1\5\1\6\4\uffff";
    static final String DFA1_specialS =
        "\14\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\5\12\uffff\1\6\11\uffff\1\7\2\uffff\1\2\1\uffff\1\3\1\uffff\1\1\2\uffff\1\4",
            "",
            "\1\10",
            "",
            "",
            "",
            "",
            "",
            "\1\5\12\uffff\1\6\14\uffff\1\2\1\12\1\3\2\uffff\1\11\1\uffff\1\4",
            "\1\13",
            "\1\5\12\uffff\1\6\14\uffff\1\2\1\uffff\1\3\4\uffff\1\4",
            "\1\5\12\uffff\1\6\14\uffff\1\2\1\12\1\3\2\uffff\1\11\1\uffff\1\4"
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
            return "790:1: rule__Element__Alternatives : ( ( ruleEnumDeclaration ) | ( ruleDiagram ) | ( ruleDomain ) | ( ruleFlow ) | ( ruleBusinessRule ) | ( ruleSystem ) );";
        }
    }
    static final String DFA2_eotS =
        "\26\uffff";
    static final String DFA2_eofS =
        "\21\uffff\2\24\3\uffff";
    static final String DFA2_minS =
        "\1\4\1\26\1\4\1\44\1\26\1\45\1\15\2\36\1\46\1\45\1\15\2\36\1\47\1\45\1\15\2\4\1\50\2\uffff";
    static final String DFA2_maxS =
        "\1\4\1\62\1\4\1\44\1\62\1\45\1\16\2\36\1\46\1\45\1\16\2\36\1\47\1\45\1\16\2\36\1\51\2\uffff";
    static final String DFA2_acceptS =
        "\24\uffff\1\1\1\2";
    static final String DFA2_specialS =
        "\26\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1",
            "\1\3\33\uffff\1\2",
            "\1\4",
            "\1\5",
            "\1\3\33\uffff\1\2",
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
            "\1\24\22\uffff\1\25\5\uffff\1\24\1\23",
            "\1\24\22\uffff\1\25\5\uffff\1\24\1\23",
            "\1\24\1\25",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "836:1: rule__BusinessRule__SystemInputsAlternatives_8_0 : ( ( ruleBreSystemEntityInput ) | ( ruleBreEntityInput ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ElementsAssignment_in_ruleModel100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Alternatives_in_ruleElement160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFlow_in_entryRuleFlow187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFlow194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__Group__0_in_ruleFlow220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_entryRuleActivity247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActivity254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__0_in_ruleActivity280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessRule_in_entryRuleBusinessRule307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBusinessRule314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__0_in_ruleBusinessRule340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreSystemEntityInput_in_entryRuleBreSystemEntityInput367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBreSystemEntityInput374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BreSystemEntityInput__Group__0_in_ruleBreSystemEntityInput400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreEntityInput_in_entryRuleBreEntityInput427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBreEntityInput434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BreEntityInput__Group__0_in_ruleBreEntityInput460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystemEntityConfiguration_in_entryRuleSystemEntityConfiguration487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystemEntityConfiguration494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group__0_in_ruleSystemEntityConfiguration520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityConfiguration_in_entryRuleEntityConfiguration547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityConfiguration554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group__0_in_ruleEntityConfiguration580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystem_in_entryRuleSystem607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystem614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__0_in_ruleSystem640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystemEntity_in_entryRuleSystemEntity667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystemEntity674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntity__Group__0_in_ruleSystemEntity700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFqnWithWildCard_in_entryRuleFqnWithWildCard787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFqnWithWildCard794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FqnWithWildCard__Group__0_in_ruleFqnWithWildCard820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiagram_in_entryRuleDiagram847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDiagram854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Diagram__Group__0_in_ruleDiagram880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_entryRuleInclude907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInclude914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__0_in_ruleInclude940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDeclaration_in_entryRuleEnumDeclaration967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumDeclaration974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__0_in_ruleEnumDeclaration1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN1027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0_in_ruleFQN1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity1087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomain_in_entryRuleDomain1147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomain1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__0_in_ruleDomain1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty1207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Alternatives_in_ruleProperty1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociation_in_entryRuleAssociation1267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssociation1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group__0_in_ruleAssociation1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField1327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0_in_ruleField1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral1387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Alternatives_in_ruleLiteral1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_entryRuleEnum1447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnum1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__0_in_ruleEnum1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Boolean__Alternatives_in_ruleBoolean1517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BREType__Alternatives_in_ruleBREType1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicty__Alternatives_in_ruleMultiplicty1589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumDeclaration_in_rule__Element__Alternatives1624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDiagram_in_rule__Element__Alternatives1641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomain_in_rule__Element__Alternatives1658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFlow_in_rule__Element__Alternatives1675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessRule_in_rule__Element__Alternatives1692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystem_in_rule__Element__Alternatives1709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreSystemEntityInput_in_rule__BusinessRule__SystemInputsAlternatives_8_01741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreEntityInput_in_rule__BusinessRule__SystemInputsAlternatives_8_01758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Include__IncludeAlternatives_0_01791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Include__IncludeAlternatives_0_01811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__Property__Alternatives1845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociation_in_rule__Property__Alternatives1862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_0__0_in_rule__Literal__Alternatives1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_1__0_in_rule__Literal__Alternatives1912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_2__0_in_rule__Literal__Alternatives1930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_3__0_in_rule__Literal__Alternatives1948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_4__0_in_rule__Literal__Alternatives1966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_rule__Literal__Alternatives1984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Boolean__Alternatives2017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Boolean__Alternatives2038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__BREType__Alternatives2074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__BREType__Alternatives2095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__BREType__Alternatives2116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Multiplicty__Alternatives2152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Multiplicty__Alternatives2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Multiplicty__Alternatives2194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__Group__0__Impl_in_rule__Flow__Group__02227 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Flow__Group__1_in_rule__Flow__Group__02230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__ImportsAssignment_0_in_rule__Flow__Group__0__Impl2257 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_rule__Flow__Group__1__Impl_in_rule__Flow__Group__12288 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Flow__Group__2_in_rule__Flow__Group__12291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Flow__Group__1__Impl2319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__Group__2__Impl_in_rule__Flow__Group__22350 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Flow__Group__3_in_rule__Flow__Group__22353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__NameAssignment_2_in_rule__Flow__Group__2__Impl2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__Group__3__Impl_in_rule__Flow__Group__32410 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__Flow__Group__4_in_rule__Flow__Group__32413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Flow__Group__3__Impl2441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__Group__4__Impl_in_rule__Flow__Group__42472 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__Flow__Group__5_in_rule__Flow__Group__42475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flow__ActivitiesAssignment_4_in_rule__Flow__Group__4__Impl2502 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Flow__Group__5__Impl_in_rule__Flow__Group__52533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Flow__Group__5__Impl2561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__0__Impl_in_rule__Activity__Group__02604 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group__1_in_rule__Activity__Group__02607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Activity__Group__0__Impl2635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__1__Impl_in_rule__Activity__Group__12666 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Activity__Group__2_in_rule__Activity__Group__12669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__NameAssignment_1_in_rule__Activity__Group__1__Impl2696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__2__Impl_in_rule__Activity__Group__22726 = new BitSet(new long[]{0x000000008A000000L});
    public static final BitSet FOLLOW_rule__Activity__Group__3_in_rule__Activity__Group__22729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Activity__Group__2__Impl2757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__3__Impl_in_rule__Activity__Group__32788 = new BitSet(new long[]{0x000000008A000000L});
    public static final BitSet FOLLOW_rule__Activity__Group__4_in_rule__Activity__Group__32791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_3__0_in_rule__Activity__Group__3__Impl2818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__4__Impl_in_rule__Activity__Group__42849 = new BitSet(new long[]{0x000000008A000000L});
    public static final BitSet FOLLOW_rule__Activity__Group__5_in_rule__Activity__Group__42852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__0_in_rule__Activity__Group__4__Impl2879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__5__Impl_in_rule__Activity__Group__52910 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Activity__Group__6_in_rule__Activity__Group__52913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Activity__Group__5__Impl2941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__6__Impl_in_rule__Activity__Group__62972 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Activity__Group__7_in_rule__Activity__Group__62975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__DescriptionAssignment_6_in_rule__Activity__Group__6__Impl3002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__7__Impl_in_rule__Activity__Group__73032 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Activity__Group__8_in_rule__Activity__Group__73035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Activity__Group__7__Impl3064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group__8__Impl_in_rule__Activity__Group__83096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Activity__Group__8__Impl3124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_3__0__Impl_in_rule__Activity__Group_3__03173 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Activity__Group_3__1_in_rule__Activity__Group_3__03176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Activity__Group_3__0__Impl3204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_3__1__Impl_in_rule__Activity__Group_3__13235 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group_3__2_in_rule__Activity__Group_3__13238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Activity__Group_3__1__Impl3266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_3__2__Impl_in_rule__Activity__Group_3__23297 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_rule__Activity__Group_3__3_in_rule__Activity__Group_3__23300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__SucessorsAssignment_3_2_in_rule__Activity__Group_3__2__Impl3327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_3__3__Impl_in_rule__Activity__Group_3__33357 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_rule__Activity__Group_3__4_in_rule__Activity__Group_3__33360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_3_3__0_in_rule__Activity__Group_3__3__Impl3387 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_3__4__Impl_in_rule__Activity__Group_3__43418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Activity__Group_3__4__Impl3446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_3_3__0__Impl_in_rule__Activity__Group_3_3__03487 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group_3_3__1_in_rule__Activity__Group_3_3__03490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Activity__Group_3_3__0__Impl3518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_3_3__1__Impl_in_rule__Activity__Group_3_3__13549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__SucessorsAssignment_3_3_1_in_rule__Activity__Group_3_3__1__Impl3576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__0__Impl_in_rule__Activity__Group_4__03610 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__1_in_rule__Activity__Group_4__03613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Activity__Group_4__0__Impl3641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__Group_4__1__Impl_in_rule__Activity__Group_4__13672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Activity__BusinessRuleAssignment_4_1_in_rule__Activity__Group_4__1__Impl3699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__0__Impl_in_rule__BusinessRule__Group__03733 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__1_in_rule__BusinessRule__Group__03736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__ImportsAssignment_0_in_rule__BusinessRule__Group__0__Impl3763 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__1__Impl_in_rule__BusinessRule__Group__13794 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__2_in_rule__BusinessRule__Group__13797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__BusinessRule__Group__1__Impl3825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__2__Impl_in_rule__BusinessRule__Group__23856 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__3_in_rule__BusinessRule__Group__23859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__NameAssignment_2_in_rule__BusinessRule__Group__2__Impl3886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__3__Impl_in_rule__BusinessRule__Group__33916 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__4_in_rule__BusinessRule__Group__33919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__BusinessRule__Group__3__Impl3947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__4__Impl_in_rule__BusinessRule__Group__43978 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__5_in_rule__BusinessRule__Group__43981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__TypAssignment_4_in_rule__BusinessRule__Group__4__Impl4008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__5__Impl_in_rule__BusinessRule__Group__54038 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__6_in_rule__BusinessRule__Group__54041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__BusinessRule__Group__5__Impl4069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__6__Impl_in_rule__BusinessRule__Group__64100 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__7_in_rule__BusinessRule__Group__64103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__BusinessRule__Group__6__Impl4131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__7__Impl_in_rule__BusinessRule__Group__74162 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__8_in_rule__BusinessRule__Group__74165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__BusinessRule__Group__7__Impl4193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__8__Impl_in_rule__BusinessRule__Group__84224 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__9_in_rule__BusinessRule__Group__84227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__SystemInputsAssignment_8_in_rule__BusinessRule__Group__8__Impl4254 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__9__Impl_in_rule__BusinessRule__Group__94285 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__10_in_rule__BusinessRule__Group__94288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__BusinessRule__Group__9__Impl4316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__10__Impl_in_rule__BusinessRule__Group__104347 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__11_in_rule__BusinessRule__Group__104350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__BusinessRule__Group__10__Impl4378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__11__Impl_in_rule__BusinessRule__Group__114409 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__12_in_rule__BusinessRule__Group__114412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__BusinessRule__Group__11__Impl4440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__12__Impl_in_rule__BusinessRule__Group__124471 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__13_in_rule__BusinessRule__Group__124474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__OutputAssignment_12_in_rule__BusinessRule__Group__12__Impl4501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__13__Impl_in_rule__BusinessRule__Group__134531 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__14_in_rule__BusinessRule__Group__134534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__BusinessRule__Group__13__Impl4562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__Group__14__Impl_in_rule__BusinessRule__Group__144593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__BusinessRule__Group__14__Impl4621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BreSystemEntityInput__Group__0__Impl_in_rule__BreSystemEntityInput__Group__04682 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__BreSystemEntityInput__Group__1_in_rule__BreSystemEntityInput__Group__04685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BreSystemEntityInput__InputElementAssignment_0_in_rule__BreSystemEntityInput__Group__0__Impl4712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BreSystemEntityInput__Group__1__Impl_in_rule__BreSystemEntityInput__Group__14742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BreSystemEntityInput__ConfigurationAssignment_1_in_rule__BreSystemEntityInput__Group__1__Impl4769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BreEntityInput__Group__0__Impl_in_rule__BreEntityInput__Group__04803 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__BreEntityInput__Group__1_in_rule__BreEntityInput__Group__04806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BreEntityInput__InputElementAssignment_0_in_rule__BreEntityInput__Group__0__Impl4833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BreEntityInput__Group__1__Impl_in_rule__BreEntityInput__Group__14863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BreEntityInput__ConfigurationAssignment_1_in_rule__BreEntityInput__Group__1__Impl4890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group__0__Impl_in_rule__SystemEntityConfiguration__Group__04924 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group__1_in_rule__SystemEntityConfiguration__Group__04927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group__1__Impl_in_rule__SystemEntityConfiguration__Group__14985 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group__2_in_rule__SystemEntityConfiguration__Group__14988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__SystemEntityConfiguration__Group__1__Impl5016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group__2__Impl_in_rule__SystemEntityConfiguration__Group__25047 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group__3_in_rule__SystemEntityConfiguration__Group__25050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__SystemEntityConfiguration__Group__2__Impl5078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group__3__Impl_in_rule__SystemEntityConfiguration__Group__35109 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group__4_in_rule__SystemEntityConfiguration__Group__35112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__SystemEntityConfiguration__Group__3__Impl5140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group__4__Impl_in_rule__SystemEntityConfiguration__Group__45171 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group__5_in_rule__SystemEntityConfiguration__Group__45174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__PrimaryAssignment_4_in_rule__SystemEntityConfiguration__Group__4__Impl5201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group__5__Impl_in_rule__SystemEntityConfiguration__Group__55231 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group__6_in_rule__SystemEntityConfiguration__Group__55234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__SystemEntityConfiguration__Group__5__Impl5262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group__6__Impl_in_rule__SystemEntityConfiguration__Group__65293 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group__7_in_rule__SystemEntityConfiguration__Group__65296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__SystemEntityConfiguration__Group__6__Impl5324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group__7__Impl_in_rule__SystemEntityConfiguration__Group__75355 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group__8_in_rule__SystemEntityConfiguration__Group__75358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__SystemEntityConfiguration__Group__7__Impl5386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group__8__Impl_in_rule__SystemEntityConfiguration__Group__85417 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group__9_in_rule__SystemEntityConfiguration__Group__85420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__ObligatorischAssignment_8_in_rule__SystemEntityConfiguration__Group__8__Impl5447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group__9__Impl_in_rule__SystemEntityConfiguration__Group__95477 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group__10_in_rule__SystemEntityConfiguration__Group__95480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__SystemEntityConfiguration__Group__9__Impl5508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group__10__Impl_in_rule__SystemEntityConfiguration__Group__105539 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group__11_in_rule__SystemEntityConfiguration__Group__105542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__SystemEntityConfiguration__Group__10__Impl5570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group__11__Impl_in_rule__SystemEntityConfiguration__Group__115601 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group__12_in_rule__SystemEntityConfiguration__Group__115604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__SystemEntityConfiguration__Group__11__Impl5632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group__12__Impl_in_rule__SystemEntityConfiguration__Group__125663 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group__13_in_rule__SystemEntityConfiguration__Group__125666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__MultipleAssignment_12_in_rule__SystemEntityConfiguration__Group__12__Impl5693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group__13__Impl_in_rule__SystemEntityConfiguration__Group__135723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group_13__0_in_rule__SystemEntityConfiguration__Group__13__Impl5750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group_13__0__Impl_in_rule__SystemEntityConfiguration__Group_13__05809 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group_13__1_in_rule__SystemEntityConfiguration__Group_13__05812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__SystemEntityConfiguration__Group_13__0__Impl5840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group_13__1__Impl_in_rule__SystemEntityConfiguration__Group_13__15871 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group_13__2_in_rule__SystemEntityConfiguration__Group_13__15874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__SystemEntityConfiguration__Group_13__1__Impl5902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group_13__2__Impl_in_rule__SystemEntityConfiguration__Group_13__25933 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group_13__3_in_rule__SystemEntityConfiguration__Group_13__25936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__SystemEntityConfiguration__Group_13__2__Impl5964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__Group_13__3__Impl_in_rule__SystemEntityConfiguration__Group_13__35995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntityConfiguration__JoinCriteriaAssignment_13_3_in_rule__SystemEntityConfiguration__Group_13__3__Impl6022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group__0__Impl_in_rule__EntityConfiguration__Group__06060 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group__1_in_rule__EntityConfiguration__Group__06063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group__1__Impl_in_rule__EntityConfiguration__Group__16121 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group__2_in_rule__EntityConfiguration__Group__16124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EntityConfiguration__Group__1__Impl6152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group__2__Impl_in_rule__EntityConfiguration__Group__26183 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group__3_in_rule__EntityConfiguration__Group__26186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__EntityConfiguration__Group__2__Impl6214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group__3__Impl_in_rule__EntityConfiguration__Group__36245 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group__4_in_rule__EntityConfiguration__Group__36248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__EntityConfiguration__Group__3__Impl6276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group__4__Impl_in_rule__EntityConfiguration__Group__46307 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group__5_in_rule__EntityConfiguration__Group__46310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__PrimaryAssignment_4_in_rule__EntityConfiguration__Group__4__Impl6337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group__5__Impl_in_rule__EntityConfiguration__Group__56367 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group__6_in_rule__EntityConfiguration__Group__56370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__EntityConfiguration__Group__5__Impl6398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group__6__Impl_in_rule__EntityConfiguration__Group__66429 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group__7_in_rule__EntityConfiguration__Group__66432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__EntityConfiguration__Group__6__Impl6460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group__7__Impl_in_rule__EntityConfiguration__Group__76491 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group__8_in_rule__EntityConfiguration__Group__76494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__EntityConfiguration__Group__7__Impl6522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group__8__Impl_in_rule__EntityConfiguration__Group__86553 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group__9_in_rule__EntityConfiguration__Group__86556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__ObligatorischAssignment_8_in_rule__EntityConfiguration__Group__8__Impl6583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group__9__Impl_in_rule__EntityConfiguration__Group__96613 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group__10_in_rule__EntityConfiguration__Group__96616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__EntityConfiguration__Group__9__Impl6644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group__10__Impl_in_rule__EntityConfiguration__Group__106675 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group__11_in_rule__EntityConfiguration__Group__106678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__EntityConfiguration__Group__10__Impl6706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group__11__Impl_in_rule__EntityConfiguration__Group__116737 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group__12_in_rule__EntityConfiguration__Group__116740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__EntityConfiguration__Group__11__Impl6768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group__12__Impl_in_rule__EntityConfiguration__Group__126799 = new BitSet(new long[]{0x0000000040800000L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group__13_in_rule__EntityConfiguration__Group__126802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__MultipleAssignment_12_in_rule__EntityConfiguration__Group__12__Impl6829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group__13__Impl_in_rule__EntityConfiguration__Group__136859 = new BitSet(new long[]{0x0000000040800000L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group__14_in_rule__EntityConfiguration__Group__136862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group_13__0_in_rule__EntityConfiguration__Group__13__Impl6889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group__14__Impl_in_rule__EntityConfiguration__Group__146920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__EntityConfiguration__Group__14__Impl6948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group_13__0__Impl_in_rule__EntityConfiguration__Group_13__07009 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group_13__1_in_rule__EntityConfiguration__Group_13__07012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__EntityConfiguration__Group_13__0__Impl7040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group_13__1__Impl_in_rule__EntityConfiguration__Group_13__17071 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group_13__2_in_rule__EntityConfiguration__Group_13__17074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__EntityConfiguration__Group_13__1__Impl7102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group_13__2__Impl_in_rule__EntityConfiguration__Group_13__27133 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group_13__3_in_rule__EntityConfiguration__Group_13__27136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__EntityConfiguration__Group_13__2__Impl7164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__Group_13__3__Impl_in_rule__EntityConfiguration__Group_13__37195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityConfiguration__PathAssignment_13_3_in_rule__EntityConfiguration__Group_13__3__Impl7222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__0__Impl_in_rule__System__Group__07260 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__System__Group__1_in_rule__System__Group__07263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__System__Group__0__Impl7291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__1__Impl_in_rule__System__Group__17322 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__System__Group__2_in_rule__System__Group__17325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__NameAssignment_1_in_rule__System__Group__1__Impl7352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__2__Impl_in_rule__System__Group__27382 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__System__Group__3_in_rule__System__Group__27385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__System__Group__2__Impl7413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__3__Impl_in_rule__System__Group__37444 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__System__Group__4_in_rule__System__Group__37447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__SrcEntitiesAssignment_3_in_rule__System__Group__3__Impl7474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__4__Impl_in_rule__System__Group__47504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__System__Group__4__Impl7532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntity__Group__0__Impl_in_rule__SystemEntity__Group__07573 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SystemEntity__Group__1_in_rule__SystemEntity__Group__07576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__SystemEntity__Group__0__Impl7604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntity__Group__1__Impl_in_rule__SystemEntity__Group__17635 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__SystemEntity__Group__2_in_rule__SystemEntity__Group__17638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntity__NameAssignment_1_in_rule__SystemEntity__Group__1__Impl7665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntity__Group__2__Impl_in_rule__SystemEntity__Group__27695 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SystemEntity__Group__3_in_rule__SystemEntity__Group__27698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__SystemEntity__Group__2__Impl7726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntity__Group__3__Impl_in_rule__SystemEntity__Group__37757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SystemEntity__FormatAssignment_3_in_rule__SystemEntity__Group__3__Impl7784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__07822 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__07825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Import__Group__0__Impl7853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__17884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl7911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FqnWithWildCard__Group__0__Impl_in_rule__FqnWithWildCard__Group__07945 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__FqnWithWildCard__Group__1_in_rule__FqnWithWildCard__Group__07948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__FqnWithWildCard__Group__0__Impl7975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FqnWithWildCard__Group__1__Impl_in_rule__FqnWithWildCard__Group__18004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__FqnWithWildCard__Group__1__Impl8033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Diagram__Group__0__Impl_in_rule__Diagram__Group__08070 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__Diagram__Group__1_in_rule__Diagram__Group__08073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Diagram__ImportsAssignment_0_in_rule__Diagram__Group__0__Impl8100 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_rule__Diagram__Group__1__Impl_in_rule__Diagram__Group__18131 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Diagram__Group__2_in_rule__Diagram__Group__18134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Diagram__Group__1__Impl8162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Diagram__Group__2__Impl_in_rule__Diagram__Group__28193 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Diagram__Group__3_in_rule__Diagram__Group__28196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Diagram__NameAssignment_2_in_rule__Diagram__Group__2__Impl8223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Diagram__Group__3__Impl_in_rule__Diagram__Group__38253 = new BitSet(new long[]{0x0000000000801800L});
    public static final BitSet FOLLOW_rule__Diagram__Group__4_in_rule__Diagram__Group__38256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Diagram__Group__3__Impl8284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Diagram__Group__4__Impl_in_rule__Diagram__Group__48315 = new BitSet(new long[]{0x0000000000801800L});
    public static final BitSet FOLLOW_rule__Diagram__Group__5_in_rule__Diagram__Group__48318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Diagram__IncludesAssignment_4_in_rule__Diagram__Group__4__Impl8345 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_rule__Diagram__Group__5__Impl_in_rule__Diagram__Group__58376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Diagram__Group__5__Impl8404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__0__Impl_in_rule__Include__Group__08447 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Include__Group__1_in_rule__Include__Group__08450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__IncludeAssignment_0_in_rule__Include__Group__0__Impl8477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__1__Impl_in_rule__Include__Group__18507 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__Include__Group__2_in_rule__Include__Group__18510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__EntityAssignment_1_in_rule__Include__Group__1__Impl8537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__2__Impl_in_rule__Include__Group__28567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group_2__0_in_rule__Include__Group__2__Impl8594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group_2__0__Impl_in_rule__Include__Group_2__08630 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Include__Group_2__1_in_rule__Include__Group_2__08633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Include__Group_2__0__Impl8661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group_2__1__Impl_in_rule__Include__Group_2__18692 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Include__Group_2__2_in_rule__Include__Group_2__18695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Include__Group_2__1__Impl8723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group_2__2__Impl_in_rule__Include__Group_2__28754 = new BitSet(new long[]{0x0000000040800000L});
    public static final BitSet FOLLOW_rule__Include__Group_2__3_in_rule__Include__Group_2__28757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__FieldsAssignment_2_2_in_rule__Include__Group_2__2__Impl8784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group_2__3__Impl_in_rule__Include__Group_2__38814 = new BitSet(new long[]{0x0000000040800000L});
    public static final BitSet FOLLOW_rule__Include__Group_2__4_in_rule__Include__Group_2__38817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group_2_3__0_in_rule__Include__Group_2__3__Impl8844 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__Include__Group_2__4__Impl_in_rule__Include__Group_2__48875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Include__Group_2__4__Impl8903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group_2_3__0__Impl_in_rule__Include__Group_2_3__08944 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Include__Group_2_3__1_in_rule__Include__Group_2_3__08947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Include__Group_2_3__0__Impl8975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group_2_3__1__Impl_in_rule__Include__Group_2_3__19006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__FieldsAssignment_2_3_1_in_rule__Include__Group_2_3__1__Impl9033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__0__Impl_in_rule__EnumDeclaration__Group__09067 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__1_in_rule__EnumDeclaration__Group__09070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__EnumDeclaration__Group__0__Impl9098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__1__Impl_in_rule__EnumDeclaration__Group__19129 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__2_in_rule__EnumDeclaration__Group__19132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__NameAssignment_1_in_rule__EnumDeclaration__Group__1__Impl9159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__2__Impl_in_rule__EnumDeclaration__Group__29189 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__3_in_rule__EnumDeclaration__Group__29192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EnumDeclaration__Group__2__Impl9220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__3__Impl_in_rule__EnumDeclaration__Group__39251 = new BitSet(new long[]{0x0000000040800000L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__4_in_rule__EnumDeclaration__Group__39254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__ValuesAssignment_3_in_rule__EnumDeclaration__Group__3__Impl9281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__4__Impl_in_rule__EnumDeclaration__Group__49311 = new BitSet(new long[]{0x0000000040800000L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__5_in_rule__EnumDeclaration__Group__49314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group_4__0_in_rule__EnumDeclaration__Group__4__Impl9341 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group__5__Impl_in_rule__EnumDeclaration__Group__59372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__EnumDeclaration__Group__5__Impl9400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group_4__0__Impl_in_rule__EnumDeclaration__Group_4__09443 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group_4__1_in_rule__EnumDeclaration__Group_4__09446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__EnumDeclaration__Group_4__0__Impl9474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumDeclaration__Group_4__1__Impl_in_rule__EnumDeclaration__Group_4__19505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumDeclaration__Group_4__1__Impl9532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__0__Impl_in_rule__FQN__Group__09565 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__FQN__Group__1_in_rule__FQN__Group__09568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group__0__Impl9595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group__1__Impl_in_rule__FQN__Group__19624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0_in_rule__FQN__Group__1__Impl9651 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__0__Impl_in_rule__FQN__Group_1__09686 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1_in_rule__FQN__Group_1__09689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__FQN__Group_1__0__Impl9717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FQN__Group_1__1__Impl_in_rule__FQN__Group_1__19748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FQN__Group_1__1__Impl9775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__09808 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__09811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Entity__Group__0__Impl9839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__19870 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__19873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl9900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__29930 = new BitSet(new long[]{0x0140000000800000L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__29933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Entity__Group__2__Impl9961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__39992 = new BitSet(new long[]{0x0140000000800000L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__39995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__PropertiesAssignment_3_in_rule__Entity__Group__3__Impl10022 = new BitSet(new long[]{0x0140000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__410053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Entity__Group__4__Impl10081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__0__Impl_in_rule__Domain__Group__010122 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__Domain__Group__1_in_rule__Domain__Group__010125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__ImportsAssignment_0_in_rule__Domain__Group__0__Impl10152 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__1__Impl_in_rule__Domain__Group__110183 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Domain__Group__2_in_rule__Domain__Group__110186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Domain__Group__1__Impl10214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__2__Impl_in_rule__Domain__Group__210245 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__Domain__Group__3_in_rule__Domain__Group__210248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__NameAssignment_2_in_rule__Domain__Group__2__Impl10275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__3__Impl_in_rule__Domain__Group__310305 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Domain__Group__4_in_rule__Domain__Group__310308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__Domain__Group__3__Impl10336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__4__Impl_in_rule__Domain__Group__410367 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Domain__Group__5_in_rule__Domain__Group__410370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__DescriptionAssignment_4_in_rule__Domain__Group__4__Impl10397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__5__Impl_in_rule__Domain__Group__510427 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__Domain__Group__6_in_rule__Domain__Group__510430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Domain__Group__5__Impl10458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__6__Impl_in_rule__Domain__Group__610489 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Domain__Group__7_in_rule__Domain__Group__610492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__EntitiesAssignment_6_in_rule__Domain__Group__6__Impl10521 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_rule__Domain__EntitiesAssignment_6_in_rule__Domain__Group__6__Impl10533 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__7__Impl_in_rule__Domain__Group__710566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Domain__Group__7__Impl10594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group__0__Impl_in_rule__Association__Group__010641 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Association__Group__1_in_rule__Association__Group__010644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Association__Group__0__Impl10672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group__1__Impl_in_rule__Association__Group__110703 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_rule__Association__Group__2_in_rule__Association__Group__110706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__NameAssignment_1_in_rule__Association__Group__1__Impl10733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group__2__Impl_in_rule__Association__Group__210763 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Association__Group__3_in_rule__Association__Group__210766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__Association__Group__2__Impl10794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group__3__Impl_in_rule__Association__Group__310825 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_rule__Association__Group__4_in_rule__Association__Group__310828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__TypeAssignment_3_in_rule__Association__Group__3__Impl10855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group__4__Impl_in_rule__Association__Group__410885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__MultiplicityAssignment_4_in_rule__Association__Group__4__Impl10912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__010952 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Field__Group__1_in_rule__Field__Group__010955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__Field__Group__0__Impl10983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__111014 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_rule__Field__Group__2_in_rule__Field__Group__111017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__NameAssignment_1_in_rule__Field__Group__1__Impl11044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__2__Impl_in_rule__Field__Group__211074 = new BitSet(new long[]{0x7E00000000000000L});
    public static final BitSet FOLLOW_rule__Field__Group__3_in_rule__Field__Group__211077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__Field__Group__2__Impl11105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__3__Impl_in_rule__Field__Group__311136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__LiteralAssignment_3_in_rule__Field__Group__3__Impl11163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_0__0__Impl_in_rule__Literal__Group_0__011201 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rule__Literal__Group_0__1_in_rule__Literal__Group_0__011204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_0__1__Impl_in_rule__Literal__Group_0__111262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__NameAssignment_0_1_in_rule__Literal__Group_0__1__Impl11289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_1__0__Impl_in_rule__Literal__Group_1__011323 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_rule__Literal__Group_1__1_in_rule__Literal__Group_1__011326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_1__1__Impl_in_rule__Literal__Group_1__111384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__NameAssignment_1_1_in_rule__Literal__Group_1__1__Impl11411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_2__0__Impl_in_rule__Literal__Group_2__011445 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rule__Literal__Group_2__1_in_rule__Literal__Group_2__011448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_2__1__Impl_in_rule__Literal__Group_2__111506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__NameAssignment_2_1_in_rule__Literal__Group_2__1__Impl11533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_3__0__Impl_in_rule__Literal__Group_3__011567 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__Literal__Group_3__1_in_rule__Literal__Group_3__011570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_3__1__Impl_in_rule__Literal__Group_3__111628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__NameAssignment_3_1_in_rule__Literal__Group_3__1__Impl11655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_4__0__Impl_in_rule__Literal__Group_4__011689 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_rule__Literal__Group_4__1_in_rule__Literal__Group_4__011692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_4__1__Impl_in_rule__Literal__Group_4__111750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__NameAssignment_4_1_in_rule__Literal__Group_4__1__Impl11777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__0__Impl_in_rule__Enum__Group__011811 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__011814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__Enum__Group__0__Impl11842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__1__Impl_in_rule__Enum__Group__111873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__TypeAssignment_1_in_rule__Enum__Group__1__Impl11900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_rule__Model__ElementsAssignment11939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Flow__ImportsAssignment_011970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Flow__NameAssignment_212001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActivity_in_rule__Flow__ActivitiesAssignment_412032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Activity__NameAssignment_112063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Activity__SucessorsAssignment_3_212098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Activity__SucessorsAssignment_3_3_112137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Activity__BusinessRuleAssignment_4_112176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Activity__DescriptionAssignment_612216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__BusinessRule__ImportsAssignment_012255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BusinessRule__NameAssignment_212286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBREType_in_rule__BusinessRule__TypAssignment_412317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BusinessRule__SystemInputsAlternatives_8_0_in_rule__BusinessRule__SystemInputsAssignment_812348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__BusinessRule__OutputAssignment_1212385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__BreSystemEntityInput__InputElementAssignment_012424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystemEntityConfiguration_in_rule__BreSystemEntityInput__ConfigurationAssignment_112459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__BreEntityInput__InputElementAssignment_012494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityConfiguration_in_rule__BreEntityInput__ConfigurationAssignment_112529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_rule__SystemEntityConfiguration__PrimaryAssignment_412560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_rule__SystemEntityConfiguration__ObligatorischAssignment_812591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_rule__SystemEntityConfiguration__MultipleAssignment_1212622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SystemEntityConfiguration__JoinCriteriaAssignment_13_312653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_rule__EntityConfiguration__PrimaryAssignment_412684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_rule__EntityConfiguration__ObligatorischAssignment_812715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_rule__EntityConfiguration__MultipleAssignment_1212746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__EntityConfiguration__PathAssignment_13_312781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__System__NameAssignment_112816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystemEntity_in_rule__System__SrcEntitiesAssignment_312847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SystemEntity__NameAssignment_112878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SystemEntity__FormatAssignment_312909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFqnWithWildCard_in_rule__Import__ImportedNamespaceAssignment_112940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Diagram__ImportsAssignment_012971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Diagram__NameAssignment_213002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_rule__Diagram__IncludesAssignment_413033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__IncludeAlternatives_0_0_in_rule__Include__IncludeAssignment_013064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Include__EntityAssignment_113101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Include__FieldsAssignment_2_213140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Include__FieldsAssignment_2_3_113179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumDeclaration__NameAssignment_113214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumDeclaration__ValuesAssignment_313245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_113276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__Entity__PropertiesAssignment_313307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Domain__ImportsAssignment_013338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Domain__NameAssignment_213369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Domain__DescriptionAssignment_413400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Domain__EntitiesAssignment_613431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Association__NameAssignment_113462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_rule__Association__TypeAssignment_313497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicty_in_rule__Association__MultiplicityAssignment_413532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Field__NameAssignment_113563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__Field__LiteralAssignment_313594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__Literal__NameAssignment_0_113630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__Literal__NameAssignment_1_113674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__Literal__NameAssignment_2_113718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__Literal__NameAssignment_3_113762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__Literal__NameAssignment_4_113806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Enum__TypeAssignment_113849 = new BitSet(new long[]{0x0000000000000002L});

}