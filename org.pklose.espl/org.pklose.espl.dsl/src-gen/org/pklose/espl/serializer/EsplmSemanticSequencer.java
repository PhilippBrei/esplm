/*
 * generated by Xtext
 */
package org.pklose.espl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.pklose.espl.esplm.Activity;
import org.pklose.espl.esplm.Association;
import org.pklose.espl.esplm.BusinessRule;
import org.pklose.espl.esplm.Diagram;
import org.pklose.espl.esplm.Domain;
import org.pklose.espl.esplm.Entity;
import org.pklose.espl.esplm.EnumDeclaration;
import org.pklose.espl.esplm.EsplmPackage;
import org.pklose.espl.esplm.Field;
import org.pklose.espl.esplm.Flow;
import org.pklose.espl.esplm.Import;
import org.pklose.espl.esplm.Include;
import org.pklose.espl.esplm.Literal;
import org.pklose.espl.esplm.Model;
import org.pklose.espl.esplm.Multiplicty;
import org.pklose.espl.services.EsplmGrammarAccess;

@SuppressWarnings("all")
public class EsplmSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private EsplmGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == EsplmPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case EsplmPackage.ACTIVITY:
				sequence_Activity(context, (Activity) semanticObject); 
				return; 
			case EsplmPackage.ASSOCIATION:
				sequence_Association(context, (Association) semanticObject); 
				return; 
			case EsplmPackage.BUSINESS_RULE:
				sequence_BusinessRule(context, (BusinessRule) semanticObject); 
				return; 
			case EsplmPackage.DIAGRAM:
				sequence_Diagram(context, (Diagram) semanticObject); 
				return; 
			case EsplmPackage.DOMAIN:
				sequence_Domain(context, (Domain) semanticObject); 
				return; 
			case EsplmPackage.ENTITY:
				sequence_Entity(context, (Entity) semanticObject); 
				return; 
			case EsplmPackage.ENUM:
				sequence_Enum(context, (org.pklose.espl.esplm.Enum) semanticObject); 
				return; 
			case EsplmPackage.ENUM_DECLARATION:
				sequence_EnumDeclaration(context, (EnumDeclaration) semanticObject); 
				return; 
			case EsplmPackage.FIELD:
				sequence_Field(context, (Field) semanticObject); 
				return; 
			case EsplmPackage.FLOW:
				sequence_Flow(context, (Flow) semanticObject); 
				return; 
			case EsplmPackage.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			case EsplmPackage.INCLUDE:
				sequence_Include(context, (Include) semanticObject); 
				return; 
			case EsplmPackage.LITERAL:
				sequence_Literal(context, (Literal) semanticObject); 
				return; 
			case EsplmPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case EsplmPackage.MULTIPLICTY:
				sequence_Multiplicty(context, (Multiplicty) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID (sucessors+=[Activity|ID] sucessors+=[Activity|ID]*)? businessRule=[BusinessRule|FQN]? description=STRING)
	 */
	protected void sequence_Activity(EObject context, Activity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=[Entity|FQN] multiplicity=Multiplicty)
	 */
	protected void sequence_Association(EObject context, Association semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EsplmPackage.Literals.PROPERTY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EsplmPackage.Literals.PROPERTY__NAME));
			if(transientValues.isValueTransient(semanticObject, EsplmPackage.Literals.ASSOCIATION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EsplmPackage.Literals.ASSOCIATION__TYPE));
			if(transientValues.isValueTransient(semanticObject, EsplmPackage.Literals.ASSOCIATION__MULTIPLICITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EsplmPackage.Literals.ASSOCIATION__MULTIPLICITY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAssociationAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAssociationAccess().getTypeEntityFQNParserRuleCall_3_0_1(), semanticObject.getType());
		feeder.accept(grammarAccess.getAssociationAccess().getMultiplicityMultiplictyParserRuleCall_4_0(), semanticObject.getMultiplicity());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_BusinessRule(EObject context, BusinessRule semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EsplmPackage.Literals.ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EsplmPackage.Literals.ELEMENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBusinessRuleAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (imports+=Import* name=ID includes+=Include*)
	 */
	protected void sequence_Diagram(EObject context, Diagram semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (imports+=Import* name=ID description=STRING entities+=Entity+)
	 */
	protected void sequence_Domain(EObject context, Domain semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID properties+=Property*)
	 */
	protected void sequence_Entity(EObject context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID values+=ID)
	 */
	protected void sequence_EnumDeclaration(EObject context, EnumDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     type=[EnumDeclaration|ID]
	 */
	protected void sequence_Enum(EObject context, org.pklose.espl.esplm.Enum semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID literal=Literal)
	 */
	protected void sequence_Field(EObject context, Field semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EsplmPackage.Literals.PROPERTY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EsplmPackage.Literals.PROPERTY__NAME));
			if(transientValues.isValueTransient(semanticObject, EsplmPackage.Literals.FIELD__LITERAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EsplmPackage.Literals.FIELD__LITERAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getFieldAccess().getLiteralLiteralParserRuleCall_3_0(), semanticObject.getLiteral());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (imports+=Import* name=ID activities+=Activity*)
	 */
	protected void sequence_Flow(EObject context, Flow semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     importedNamespace=FqnWithWildCard
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EsplmPackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EsplmPackage.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceFqnWithWildCardParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((include='Include' | include='Exclude') entity=[Entity|FQN] fields+=[Property|ID] fields+=[Property|ID]*)
	 */
	protected void sequence_Include(EObject context, Include semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name='Decimal' | name='Money' | name='Text' | name='Boolean' | name='Int')
	 */
	protected void sequence_Literal(EObject context, Literal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     elements+=Element
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name='1..N' | name='0..N' | name='1' | name='1..0')
	 */
	protected void sequence_Multiplicty(EObject context, Multiplicty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
