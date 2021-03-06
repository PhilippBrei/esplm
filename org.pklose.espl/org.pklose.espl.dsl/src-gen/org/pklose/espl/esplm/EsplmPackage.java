/**
 */
package org.pklose.espl.esplm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.pklose.espl.esplm.EsplmFactory
 * @model kind="package"
 * @generated
 */
public interface EsplmPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "esplm";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.org.pklose/esplm";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "esplm";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EsplmPackage eINSTANCE = org.pklose.espl.esplm.impl.EsplmPackageImpl.init();

  /**
   * The meta object id for the '{@link org.pklose.espl.esplm.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pklose.espl.esplm.impl.ModelImpl
   * @see org.pklose.espl.esplm.impl.EsplmPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.pklose.espl.esplm.impl.ElementImpl <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pklose.espl.esplm.impl.ElementImpl
   * @see org.pklose.espl.esplm.impl.EsplmPackageImpl#getElement()
   * @generated
   */
  int ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.pklose.espl.esplm.impl.FlowImpl <em>Flow</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pklose.espl.esplm.impl.FlowImpl
   * @see org.pklose.espl.esplm.impl.EsplmPackageImpl#getFlow()
   * @generated
   */
  int FLOW = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW__NAME = ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW__IMPORTS = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Activities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW__ACTIVITIES = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Flow</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.pklose.espl.esplm.impl.ActivityImpl <em>Activity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pklose.espl.esplm.impl.ActivityImpl
   * @see org.pklose.espl.esplm.impl.EsplmPackageImpl#getActivity()
   * @generated
   */
  int ACTIVITY = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY__NAME = 0;

  /**
   * The feature id for the '<em><b>Sucessors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY__SUCESSORS = 1;

  /**
   * The feature id for the '<em><b>Business Rule</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY__BUSINESS_RULE = 2;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY__DESCRIPTION = 3;

  /**
   * The number of structural features of the '<em>Activity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.pklose.espl.esplm.impl.BusinessRuleImpl <em>Business Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pklose.espl.esplm.impl.BusinessRuleImpl
   * @see org.pklose.espl.esplm.impl.EsplmPackageImpl#getBusinessRule()
   * @generated
   */
  int BUSINESS_RULE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_RULE__NAME = ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_RULE__IMPORTS = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Typ</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_RULE__TYP = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_RULE__INPUTS = ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Output</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_RULE__OUTPUT = ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Business Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUSINESS_RULE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.pklose.espl.esplm.impl.ModelElementImpl <em>Model Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pklose.espl.esplm.impl.ModelElementImpl
   * @see org.pklose.espl.esplm.impl.EsplmPackageImpl#getModelElement()
   * @generated
   */
  int MODEL_ELEMENT = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Model Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.pklose.espl.esplm.impl.BreOutPutReferenceImpl <em>Bre Out Put Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pklose.espl.esplm.impl.BreOutPutReferenceImpl
   * @see org.pklose.espl.esplm.impl.EsplmPackageImpl#getBreOutPutReference()
   * @generated
   */
  int BRE_OUT_PUT_REFERENCE = 6;

  /**
   * The feature id for the '<em><b>Output</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRE_OUT_PUT_REFERENCE__OUTPUT = 0;

  /**
   * The number of structural features of the '<em>Bre Out Put Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRE_OUT_PUT_REFERENCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.pklose.espl.esplm.impl.BreEntityInputImpl <em>Bre Entity Input</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pklose.espl.esplm.impl.BreEntityInputImpl
   * @see org.pklose.espl.esplm.impl.EsplmPackageImpl#getBreEntityInput()
   * @generated
   */
  int BRE_ENTITY_INPUT = 7;

  /**
   * The feature id for the '<em><b>Input Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRE_ENTITY_INPUT__INPUT_ELEMENT = 0;

  /**
   * The feature id for the '<em><b>Configuration</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRE_ENTITY_INPUT__CONFIGURATION = 1;

  /**
   * The number of structural features of the '<em>Bre Entity Input</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRE_ENTITY_INPUT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.pklose.espl.esplm.impl.EntityConfigurationImpl <em>Entity Configuration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pklose.espl.esplm.impl.EntityConfigurationImpl
   * @see org.pklose.espl.esplm.impl.EsplmPackageImpl#getEntityConfiguration()
   * @generated
   */
  int ENTITY_CONFIGURATION = 8;

  /**
   * The feature id for the '<em><b>Primary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_CONFIGURATION__PRIMARY = 0;

  /**
   * The feature id for the '<em><b>Obligatory</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_CONFIGURATION__OBLIGATORY = 1;

  /**
   * The feature id for the '<em><b>Multiple</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_CONFIGURATION__MULTIPLE = 2;

  /**
   * The number of structural features of the '<em>Entity Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_CONFIGURATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.pklose.espl.esplm.impl.SystemImpl <em>System</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pklose.espl.esplm.impl.SystemImpl
   * @see org.pklose.espl.esplm.impl.EsplmPackageImpl#getSystem()
   * @generated
   */
  int SYSTEM = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM__NAME = ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Src Entities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM__SRC_ENTITIES = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>System</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.pklose.espl.esplm.impl.SystemEntityImpl <em>System Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pklose.espl.esplm.impl.SystemEntityImpl
   * @see org.pklose.espl.esplm.impl.EsplmPackageImpl#getSystemEntity()
   * @generated
   */
  int SYSTEM_ENTITY = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_ENTITY__NAME = MODEL_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Format</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_ENTITY__FORMAT = MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>System Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_ENTITY_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.pklose.espl.esplm.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pklose.espl.esplm.impl.ImportImpl
   * @see org.pklose.espl.esplm.impl.EsplmPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 11;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.pklose.espl.esplm.impl.DiagramImpl <em>Diagram</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pklose.espl.esplm.impl.DiagramImpl
   * @see org.pklose.espl.esplm.impl.EsplmPackageImpl#getDiagram()
   * @generated
   */
  int DIAGRAM = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAGRAM__NAME = ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAGRAM__IMPORTS = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Includes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAGRAM__INCLUDES = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Diagram</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAGRAM_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.pklose.espl.esplm.impl.IncludeImpl <em>Include</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pklose.espl.esplm.impl.IncludeImpl
   * @see org.pklose.espl.esplm.impl.EsplmPackageImpl#getInclude()
   * @generated
   */
  int INCLUDE = 13;

  /**
   * The feature id for the '<em><b>Include</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE__INCLUDE = 0;

  /**
   * The feature id for the '<em><b>Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE__ENTITY = 1;

  /**
   * The feature id for the '<em><b>Fields</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE__FIELDS = 2;

  /**
   * The number of structural features of the '<em>Include</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.pklose.espl.esplm.impl.EnumDeclarationImpl <em>Enum Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pklose.espl.esplm.impl.EnumDeclarationImpl
   * @see org.pklose.espl.esplm.impl.EsplmPackageImpl#getEnumDeclaration()
   * @generated
   */
  int ENUM_DECLARATION = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_DECLARATION__NAME = ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Values</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_DECLARATION__VALUES = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Enum Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_DECLARATION_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.pklose.espl.esplm.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pklose.espl.esplm.impl.EntityImpl
   * @see org.pklose.espl.esplm.impl.EsplmPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME = MODEL_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__PROPERTIES = MODEL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.pklose.espl.esplm.impl.DomainImpl <em>Domain</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pklose.espl.esplm.impl.DomainImpl
   * @see org.pklose.espl.esplm.impl.EsplmPackageImpl#getDomain()
   * @generated
   */
  int DOMAIN = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN__NAME = ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN__IMPORTS = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN__DESCRIPTION = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Entities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN__ENTITIES = ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Domain</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.pklose.espl.esplm.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pklose.espl.esplm.impl.PropertyImpl
   * @see org.pklose.espl.esplm.impl.EsplmPackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__NAME = 0;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.pklose.espl.esplm.impl.AssociationImpl <em>Association</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pklose.espl.esplm.impl.AssociationImpl
   * @see org.pklose.espl.esplm.impl.EsplmPackageImpl#getAssociation()
   * @generated
   */
  int ASSOCIATION = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION__NAME = PROPERTY__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION__TYPE = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION__MULTIPLICITY = PROPERTY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Association</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.pklose.espl.esplm.impl.FieldImpl <em>Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pklose.espl.esplm.impl.FieldImpl
   * @see org.pklose.espl.esplm.impl.EsplmPackageImpl#getField()
   * @generated
   */
  int FIELD = 19;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__NAME = PROPERTY__NAME;

  /**
   * The feature id for the '<em><b>Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__LITERAL = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.pklose.espl.esplm.impl.LiteralImpl <em>Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pklose.espl.esplm.impl.LiteralImpl
   * @see org.pklose.espl.esplm.impl.EsplmPackageImpl#getLiteral()
   * @generated
   */
  int LITERAL = 20;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__NAME = 0;

  /**
   * The number of structural features of the '<em>Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.pklose.espl.esplm.impl.EnumImpl <em>Enum</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pklose.espl.esplm.impl.EnumImpl
   * @see org.pklose.espl.esplm.impl.EsplmPackageImpl#getEnum()
   * @generated
   */
  int ENUM = 21;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM__NAME = LITERAL__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM__TYPE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Enum</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.pklose.espl.esplm.Boolean <em>Boolean</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pklose.espl.esplm.Boolean
   * @see org.pklose.espl.esplm.impl.EsplmPackageImpl#getBoolean()
   * @generated
   */
  int BOOLEAN = 22;

  /**
   * The meta object id for the '{@link org.pklose.espl.esplm.BREType <em>BRE Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pklose.espl.esplm.BREType
   * @see org.pklose.espl.esplm.impl.EsplmPackageImpl#getBREType()
   * @generated
   */
  int BRE_TYPE = 23;

  /**
   * The meta object id for the '{@link org.pklose.espl.esplm.Multiplicty <em>Multiplicty</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.pklose.espl.esplm.Multiplicty
   * @see org.pklose.espl.esplm.impl.EsplmPackageImpl#getMultiplicty()
   * @generated
   */
  int MULTIPLICTY = 24;


  /**
   * Returns the meta object for class '{@link org.pklose.espl.esplm.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.pklose.espl.esplm.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.pklose.espl.esplm.Model#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.pklose.espl.esplm.Model#getElements()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Elements();

  /**
   * Returns the meta object for class '{@link org.pklose.espl.esplm.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element</em>'.
   * @see org.pklose.espl.esplm.Element
   * @generated
   */
  EClass getElement();

  /**
   * Returns the meta object for the attribute '{@link org.pklose.espl.esplm.Element#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.pklose.espl.esplm.Element#getName()
   * @see #getElement()
   * @generated
   */
  EAttribute getElement_Name();

  /**
   * Returns the meta object for class '{@link org.pklose.espl.esplm.Flow <em>Flow</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Flow</em>'.
   * @see org.pklose.espl.esplm.Flow
   * @generated
   */
  EClass getFlow();

  /**
   * Returns the meta object for the containment reference list '{@link org.pklose.espl.esplm.Flow#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.pklose.espl.esplm.Flow#getImports()
   * @see #getFlow()
   * @generated
   */
  EReference getFlow_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link org.pklose.espl.esplm.Flow#getActivities <em>Activities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Activities</em>'.
   * @see org.pklose.espl.esplm.Flow#getActivities()
   * @see #getFlow()
   * @generated
   */
  EReference getFlow_Activities();

  /**
   * Returns the meta object for class '{@link org.pklose.espl.esplm.Activity <em>Activity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Activity</em>'.
   * @see org.pklose.espl.esplm.Activity
   * @generated
   */
  EClass getActivity();

  /**
   * Returns the meta object for the attribute '{@link org.pklose.espl.esplm.Activity#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.pklose.espl.esplm.Activity#getName()
   * @see #getActivity()
   * @generated
   */
  EAttribute getActivity_Name();

  /**
   * Returns the meta object for the reference list '{@link org.pklose.espl.esplm.Activity#getSucessors <em>Sucessors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Sucessors</em>'.
   * @see org.pklose.espl.esplm.Activity#getSucessors()
   * @see #getActivity()
   * @generated
   */
  EReference getActivity_Sucessors();

  /**
   * Returns the meta object for the reference '{@link org.pklose.espl.esplm.Activity#getBusinessRule <em>Business Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Business Rule</em>'.
   * @see org.pklose.espl.esplm.Activity#getBusinessRule()
   * @see #getActivity()
   * @generated
   */
  EReference getActivity_BusinessRule();

  /**
   * Returns the meta object for the attribute '{@link org.pklose.espl.esplm.Activity#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.pklose.espl.esplm.Activity#getDescription()
   * @see #getActivity()
   * @generated
   */
  EAttribute getActivity_Description();

  /**
   * Returns the meta object for class '{@link org.pklose.espl.esplm.BusinessRule <em>Business Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Business Rule</em>'.
   * @see org.pklose.espl.esplm.BusinessRule
   * @generated
   */
  EClass getBusinessRule();

  /**
   * Returns the meta object for the containment reference list '{@link org.pklose.espl.esplm.BusinessRule#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.pklose.espl.esplm.BusinessRule#getImports()
   * @see #getBusinessRule()
   * @generated
   */
  EReference getBusinessRule_Imports();

  /**
   * Returns the meta object for the attribute '{@link org.pklose.espl.esplm.BusinessRule#getTyp <em>Typ</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Typ</em>'.
   * @see org.pklose.espl.esplm.BusinessRule#getTyp()
   * @see #getBusinessRule()
   * @generated
   */
  EAttribute getBusinessRule_Typ();

  /**
   * Returns the meta object for the containment reference list '{@link org.pklose.espl.esplm.BusinessRule#getInputs <em>Inputs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Inputs</em>'.
   * @see org.pklose.espl.esplm.BusinessRule#getInputs()
   * @see #getBusinessRule()
   * @generated
   */
  EReference getBusinessRule_Inputs();

  /**
   * Returns the meta object for the containment reference '{@link org.pklose.espl.esplm.BusinessRule#getOutput <em>Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Output</em>'.
   * @see org.pklose.espl.esplm.BusinessRule#getOutput()
   * @see #getBusinessRule()
   * @generated
   */
  EReference getBusinessRule_Output();

  /**
   * Returns the meta object for class '{@link org.pklose.espl.esplm.ModelElement <em>Model Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model Element</em>'.
   * @see org.pklose.espl.esplm.ModelElement
   * @generated
   */
  EClass getModelElement();

  /**
   * Returns the meta object for the attribute '{@link org.pklose.espl.esplm.ModelElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.pklose.espl.esplm.ModelElement#getName()
   * @see #getModelElement()
   * @generated
   */
  EAttribute getModelElement_Name();

  /**
   * Returns the meta object for class '{@link org.pklose.espl.esplm.BreOutPutReference <em>Bre Out Put Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bre Out Put Reference</em>'.
   * @see org.pklose.espl.esplm.BreOutPutReference
   * @generated
   */
  EClass getBreOutPutReference();

  /**
   * Returns the meta object for the reference '{@link org.pklose.espl.esplm.BreOutPutReference#getOutput <em>Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Output</em>'.
   * @see org.pklose.espl.esplm.BreOutPutReference#getOutput()
   * @see #getBreOutPutReference()
   * @generated
   */
  EReference getBreOutPutReference_Output();

  /**
   * Returns the meta object for class '{@link org.pklose.espl.esplm.BreEntityInput <em>Bre Entity Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bre Entity Input</em>'.
   * @see org.pklose.espl.esplm.BreEntityInput
   * @generated
   */
  EClass getBreEntityInput();

  /**
   * Returns the meta object for the reference '{@link org.pklose.espl.esplm.BreEntityInput#getInputElement <em>Input Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Input Element</em>'.
   * @see org.pklose.espl.esplm.BreEntityInput#getInputElement()
   * @see #getBreEntityInput()
   * @generated
   */
  EReference getBreEntityInput_InputElement();

  /**
   * Returns the meta object for the containment reference list '{@link org.pklose.espl.esplm.BreEntityInput#getConfiguration <em>Configuration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Configuration</em>'.
   * @see org.pklose.espl.esplm.BreEntityInput#getConfiguration()
   * @see #getBreEntityInput()
   * @generated
   */
  EReference getBreEntityInput_Configuration();

  /**
   * Returns the meta object for class '{@link org.pklose.espl.esplm.EntityConfiguration <em>Entity Configuration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity Configuration</em>'.
   * @see org.pklose.espl.esplm.EntityConfiguration
   * @generated
   */
  EClass getEntityConfiguration();

  /**
   * Returns the meta object for the attribute '{@link org.pklose.espl.esplm.EntityConfiguration#isPrimary <em>Primary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Primary</em>'.
   * @see org.pklose.espl.esplm.EntityConfiguration#isPrimary()
   * @see #getEntityConfiguration()
   * @generated
   */
  EAttribute getEntityConfiguration_Primary();

  /**
   * Returns the meta object for the attribute '{@link org.pklose.espl.esplm.EntityConfiguration#isObligatory <em>Obligatory</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Obligatory</em>'.
   * @see org.pklose.espl.esplm.EntityConfiguration#isObligatory()
   * @see #getEntityConfiguration()
   * @generated
   */
  EAttribute getEntityConfiguration_Obligatory();

  /**
   * Returns the meta object for the attribute '{@link org.pklose.espl.esplm.EntityConfiguration#isMultiple <em>Multiple</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Multiple</em>'.
   * @see org.pklose.espl.esplm.EntityConfiguration#isMultiple()
   * @see #getEntityConfiguration()
   * @generated
   */
  EAttribute getEntityConfiguration_Multiple();

  /**
   * Returns the meta object for class '{@link org.pklose.espl.esplm.System <em>System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>System</em>'.
   * @see org.pklose.espl.esplm.System
   * @generated
   */
  EClass getSystem();

  /**
   * Returns the meta object for the containment reference list '{@link org.pklose.espl.esplm.System#getSrcEntities <em>Src Entities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Src Entities</em>'.
   * @see org.pklose.espl.esplm.System#getSrcEntities()
   * @see #getSystem()
   * @generated
   */
  EReference getSystem_SrcEntities();

  /**
   * Returns the meta object for class '{@link org.pklose.espl.esplm.SystemEntity <em>System Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>System Entity</em>'.
   * @see org.pklose.espl.esplm.SystemEntity
   * @generated
   */
  EClass getSystemEntity();

  /**
   * Returns the meta object for the attribute '{@link org.pklose.espl.esplm.SystemEntity#getFormat <em>Format</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Format</em>'.
   * @see org.pklose.espl.esplm.SystemEntity#getFormat()
   * @see #getSystemEntity()
   * @generated
   */
  EAttribute getSystemEntity_Format();

  /**
   * Returns the meta object for class '{@link org.pklose.espl.esplm.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see org.pklose.espl.esplm.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link org.pklose.espl.esplm.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see org.pklose.espl.esplm.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link org.pklose.espl.esplm.Diagram <em>Diagram</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Diagram</em>'.
   * @see org.pklose.espl.esplm.Diagram
   * @generated
   */
  EClass getDiagram();

  /**
   * Returns the meta object for the containment reference list '{@link org.pklose.espl.esplm.Diagram#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.pklose.espl.esplm.Diagram#getImports()
   * @see #getDiagram()
   * @generated
   */
  EReference getDiagram_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link org.pklose.espl.esplm.Diagram#getIncludes <em>Includes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Includes</em>'.
   * @see org.pklose.espl.esplm.Diagram#getIncludes()
   * @see #getDiagram()
   * @generated
   */
  EReference getDiagram_Includes();

  /**
   * Returns the meta object for class '{@link org.pklose.espl.esplm.Include <em>Include</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Include</em>'.
   * @see org.pklose.espl.esplm.Include
   * @generated
   */
  EClass getInclude();

  /**
   * Returns the meta object for the attribute '{@link org.pklose.espl.esplm.Include#getInclude <em>Include</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Include</em>'.
   * @see org.pklose.espl.esplm.Include#getInclude()
   * @see #getInclude()
   * @generated
   */
  EAttribute getInclude_Include();

  /**
   * Returns the meta object for the reference '{@link org.pklose.espl.esplm.Include#getEntity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Entity</em>'.
   * @see org.pklose.espl.esplm.Include#getEntity()
   * @see #getInclude()
   * @generated
   */
  EReference getInclude_Entity();

  /**
   * Returns the meta object for the reference list '{@link org.pklose.espl.esplm.Include#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Fields</em>'.
   * @see org.pklose.espl.esplm.Include#getFields()
   * @see #getInclude()
   * @generated
   */
  EReference getInclude_Fields();

  /**
   * Returns the meta object for class '{@link org.pklose.espl.esplm.EnumDeclaration <em>Enum Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Declaration</em>'.
   * @see org.pklose.espl.esplm.EnumDeclaration
   * @generated
   */
  EClass getEnumDeclaration();

  /**
   * Returns the meta object for the attribute list '{@link org.pklose.espl.esplm.EnumDeclaration#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Values</em>'.
   * @see org.pklose.espl.esplm.EnumDeclaration#getValues()
   * @see #getEnumDeclaration()
   * @generated
   */
  EAttribute getEnumDeclaration_Values();

  /**
   * Returns the meta object for class '{@link org.pklose.espl.esplm.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see org.pklose.espl.esplm.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the containment reference list '{@link org.pklose.espl.esplm.Entity#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see org.pklose.espl.esplm.Entity#getProperties()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Properties();

  /**
   * Returns the meta object for class '{@link org.pklose.espl.esplm.Domain <em>Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domain</em>'.
   * @see org.pklose.espl.esplm.Domain
   * @generated
   */
  EClass getDomain();

  /**
   * Returns the meta object for the containment reference list '{@link org.pklose.espl.esplm.Domain#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.pklose.espl.esplm.Domain#getImports()
   * @see #getDomain()
   * @generated
   */
  EReference getDomain_Imports();

  /**
   * Returns the meta object for the attribute '{@link org.pklose.espl.esplm.Domain#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.pklose.espl.esplm.Domain#getDescription()
   * @see #getDomain()
   * @generated
   */
  EAttribute getDomain_Description();

  /**
   * Returns the meta object for the containment reference list '{@link org.pklose.espl.esplm.Domain#getEntities <em>Entities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entities</em>'.
   * @see org.pklose.espl.esplm.Domain#getEntities()
   * @see #getDomain()
   * @generated
   */
  EReference getDomain_Entities();

  /**
   * Returns the meta object for class '{@link org.pklose.espl.esplm.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see org.pklose.espl.esplm.Property
   * @generated
   */
  EClass getProperty();

  /**
   * Returns the meta object for the attribute '{@link org.pklose.espl.esplm.Property#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.pklose.espl.esplm.Property#getName()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Name();

  /**
   * Returns the meta object for class '{@link org.pklose.espl.esplm.Association <em>Association</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Association</em>'.
   * @see org.pklose.espl.esplm.Association
   * @generated
   */
  EClass getAssociation();

  /**
   * Returns the meta object for the reference '{@link org.pklose.espl.esplm.Association#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.pklose.espl.esplm.Association#getType()
   * @see #getAssociation()
   * @generated
   */
  EReference getAssociation_Type();

  /**
   * Returns the meta object for the attribute '{@link org.pklose.espl.esplm.Association#getMultiplicity <em>Multiplicity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Multiplicity</em>'.
   * @see org.pklose.espl.esplm.Association#getMultiplicity()
   * @see #getAssociation()
   * @generated
   */
  EAttribute getAssociation_Multiplicity();

  /**
   * Returns the meta object for class '{@link org.pklose.espl.esplm.Field <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field</em>'.
   * @see org.pklose.espl.esplm.Field
   * @generated
   */
  EClass getField();

  /**
   * Returns the meta object for the containment reference '{@link org.pklose.espl.esplm.Field#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Literal</em>'.
   * @see org.pklose.espl.esplm.Field#getLiteral()
   * @see #getField()
   * @generated
   */
  EReference getField_Literal();

  /**
   * Returns the meta object for class '{@link org.pklose.espl.esplm.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal</em>'.
   * @see org.pklose.espl.esplm.Literal
   * @generated
   */
  EClass getLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.pklose.espl.esplm.Literal#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.pklose.espl.esplm.Literal#getName()
   * @see #getLiteral()
   * @generated
   */
  EAttribute getLiteral_Name();

  /**
   * Returns the meta object for class '{@link org.pklose.espl.esplm.Enum <em>Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum</em>'.
   * @see org.pklose.espl.esplm.Enum
   * @generated
   */
  EClass getEnum();

  /**
   * Returns the meta object for the reference '{@link org.pklose.espl.esplm.Enum#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.pklose.espl.esplm.Enum#getType()
   * @see #getEnum()
   * @generated
   */
  EReference getEnum_Type();

  /**
   * Returns the meta object for enum '{@link org.pklose.espl.esplm.Boolean <em>Boolean</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Boolean</em>'.
   * @see org.pklose.espl.esplm.Boolean
   * @generated
   */
  EEnum getBoolean();

  /**
   * Returns the meta object for enum '{@link org.pklose.espl.esplm.BREType <em>BRE Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>BRE Type</em>'.
   * @see org.pklose.espl.esplm.BREType
   * @generated
   */
  EEnum getBREType();

  /**
   * Returns the meta object for enum '{@link org.pklose.espl.esplm.Multiplicty <em>Multiplicty</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Multiplicty</em>'.
   * @see org.pklose.espl.esplm.Multiplicty
   * @generated
   */
  EEnum getMultiplicty();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  EsplmFactory getEsplmFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.pklose.espl.esplm.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pklose.espl.esplm.impl.ModelImpl
     * @see org.pklose.espl.esplm.impl.EsplmPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ELEMENTS = eINSTANCE.getModel_Elements();

    /**
     * The meta object literal for the '{@link org.pklose.espl.esplm.impl.ElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pklose.espl.esplm.impl.ElementImpl
     * @see org.pklose.espl.esplm.impl.EsplmPackageImpl#getElement()
     * @generated
     */
    EClass ELEMENT = eINSTANCE.getElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

    /**
     * The meta object literal for the '{@link org.pklose.espl.esplm.impl.FlowImpl <em>Flow</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pklose.espl.esplm.impl.FlowImpl
     * @see org.pklose.espl.esplm.impl.EsplmPackageImpl#getFlow()
     * @generated
     */
    EClass FLOW = eINSTANCE.getFlow();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FLOW__IMPORTS = eINSTANCE.getFlow_Imports();

    /**
     * The meta object literal for the '<em><b>Activities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FLOW__ACTIVITIES = eINSTANCE.getFlow_Activities();

    /**
     * The meta object literal for the '{@link org.pklose.espl.esplm.impl.ActivityImpl <em>Activity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pklose.espl.esplm.impl.ActivityImpl
     * @see org.pklose.espl.esplm.impl.EsplmPackageImpl#getActivity()
     * @generated
     */
    EClass ACTIVITY = eINSTANCE.getActivity();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTIVITY__NAME = eINSTANCE.getActivity_Name();

    /**
     * The meta object literal for the '<em><b>Sucessors</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTIVITY__SUCESSORS = eINSTANCE.getActivity_Sucessors();

    /**
     * The meta object literal for the '<em><b>Business Rule</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTIVITY__BUSINESS_RULE = eINSTANCE.getActivity_BusinessRule();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTIVITY__DESCRIPTION = eINSTANCE.getActivity_Description();

    /**
     * The meta object literal for the '{@link org.pklose.espl.esplm.impl.BusinessRuleImpl <em>Business Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pklose.espl.esplm.impl.BusinessRuleImpl
     * @see org.pklose.espl.esplm.impl.EsplmPackageImpl#getBusinessRule()
     * @generated
     */
    EClass BUSINESS_RULE = eINSTANCE.getBusinessRule();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUSINESS_RULE__IMPORTS = eINSTANCE.getBusinessRule_Imports();

    /**
     * The meta object literal for the '<em><b>Typ</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUSINESS_RULE__TYP = eINSTANCE.getBusinessRule_Typ();

    /**
     * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUSINESS_RULE__INPUTS = eINSTANCE.getBusinessRule_Inputs();

    /**
     * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUSINESS_RULE__OUTPUT = eINSTANCE.getBusinessRule_Output();

    /**
     * The meta object literal for the '{@link org.pklose.espl.esplm.impl.ModelElementImpl <em>Model Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pklose.espl.esplm.impl.ModelElementImpl
     * @see org.pklose.espl.esplm.impl.EsplmPackageImpl#getModelElement()
     * @generated
     */
    EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL_ELEMENT__NAME = eINSTANCE.getModelElement_Name();

    /**
     * The meta object literal for the '{@link org.pklose.espl.esplm.impl.BreOutPutReferenceImpl <em>Bre Out Put Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pklose.espl.esplm.impl.BreOutPutReferenceImpl
     * @see org.pklose.espl.esplm.impl.EsplmPackageImpl#getBreOutPutReference()
     * @generated
     */
    EClass BRE_OUT_PUT_REFERENCE = eINSTANCE.getBreOutPutReference();

    /**
     * The meta object literal for the '<em><b>Output</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BRE_OUT_PUT_REFERENCE__OUTPUT = eINSTANCE.getBreOutPutReference_Output();

    /**
     * The meta object literal for the '{@link org.pklose.espl.esplm.impl.BreEntityInputImpl <em>Bre Entity Input</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pklose.espl.esplm.impl.BreEntityInputImpl
     * @see org.pklose.espl.esplm.impl.EsplmPackageImpl#getBreEntityInput()
     * @generated
     */
    EClass BRE_ENTITY_INPUT = eINSTANCE.getBreEntityInput();

    /**
     * The meta object literal for the '<em><b>Input Element</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BRE_ENTITY_INPUT__INPUT_ELEMENT = eINSTANCE.getBreEntityInput_InputElement();

    /**
     * The meta object literal for the '<em><b>Configuration</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BRE_ENTITY_INPUT__CONFIGURATION = eINSTANCE.getBreEntityInput_Configuration();

    /**
     * The meta object literal for the '{@link org.pklose.espl.esplm.impl.EntityConfigurationImpl <em>Entity Configuration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pklose.espl.esplm.impl.EntityConfigurationImpl
     * @see org.pklose.espl.esplm.impl.EsplmPackageImpl#getEntityConfiguration()
     * @generated
     */
    EClass ENTITY_CONFIGURATION = eINSTANCE.getEntityConfiguration();

    /**
     * The meta object literal for the '<em><b>Primary</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY_CONFIGURATION__PRIMARY = eINSTANCE.getEntityConfiguration_Primary();

    /**
     * The meta object literal for the '<em><b>Obligatory</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY_CONFIGURATION__OBLIGATORY = eINSTANCE.getEntityConfiguration_Obligatory();

    /**
     * The meta object literal for the '<em><b>Multiple</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY_CONFIGURATION__MULTIPLE = eINSTANCE.getEntityConfiguration_Multiple();

    /**
     * The meta object literal for the '{@link org.pklose.espl.esplm.impl.SystemImpl <em>System</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pklose.espl.esplm.impl.SystemImpl
     * @see org.pklose.espl.esplm.impl.EsplmPackageImpl#getSystem()
     * @generated
     */
    EClass SYSTEM = eINSTANCE.getSystem();

    /**
     * The meta object literal for the '<em><b>Src Entities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYSTEM__SRC_ENTITIES = eINSTANCE.getSystem_SrcEntities();

    /**
     * The meta object literal for the '{@link org.pklose.espl.esplm.impl.SystemEntityImpl <em>System Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pklose.espl.esplm.impl.SystemEntityImpl
     * @see org.pklose.espl.esplm.impl.EsplmPackageImpl#getSystemEntity()
     * @generated
     */
    EClass SYSTEM_ENTITY = eINSTANCE.getSystemEntity();

    /**
     * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYSTEM_ENTITY__FORMAT = eINSTANCE.getSystemEntity_Format();

    /**
     * The meta object literal for the '{@link org.pklose.espl.esplm.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pklose.espl.esplm.impl.ImportImpl
     * @see org.pklose.espl.esplm.impl.EsplmPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link org.pklose.espl.esplm.impl.DiagramImpl <em>Diagram</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pklose.espl.esplm.impl.DiagramImpl
     * @see org.pklose.espl.esplm.impl.EsplmPackageImpl#getDiagram()
     * @generated
     */
    EClass DIAGRAM = eINSTANCE.getDiagram();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIAGRAM__IMPORTS = eINSTANCE.getDiagram_Imports();

    /**
     * The meta object literal for the '<em><b>Includes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIAGRAM__INCLUDES = eINSTANCE.getDiagram_Includes();

    /**
     * The meta object literal for the '{@link org.pklose.espl.esplm.impl.IncludeImpl <em>Include</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pklose.espl.esplm.impl.IncludeImpl
     * @see org.pklose.espl.esplm.impl.EsplmPackageImpl#getInclude()
     * @generated
     */
    EClass INCLUDE = eINSTANCE.getInclude();

    /**
     * The meta object literal for the '<em><b>Include</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INCLUDE__INCLUDE = eINSTANCE.getInclude_Include();

    /**
     * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INCLUDE__ENTITY = eINSTANCE.getInclude_Entity();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INCLUDE__FIELDS = eINSTANCE.getInclude_Fields();

    /**
     * The meta object literal for the '{@link org.pklose.espl.esplm.impl.EnumDeclarationImpl <em>Enum Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pklose.espl.esplm.impl.EnumDeclarationImpl
     * @see org.pklose.espl.esplm.impl.EsplmPackageImpl#getEnumDeclaration()
     * @generated
     */
    EClass ENUM_DECLARATION = eINSTANCE.getEnumDeclaration();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_DECLARATION__VALUES = eINSTANCE.getEnumDeclaration_Values();

    /**
     * The meta object literal for the '{@link org.pklose.espl.esplm.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pklose.espl.esplm.impl.EntityImpl
     * @see org.pklose.espl.esplm.impl.EsplmPackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__PROPERTIES = eINSTANCE.getEntity_Properties();

    /**
     * The meta object literal for the '{@link org.pklose.espl.esplm.impl.DomainImpl <em>Domain</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pklose.espl.esplm.impl.DomainImpl
     * @see org.pklose.espl.esplm.impl.EsplmPackageImpl#getDomain()
     * @generated
     */
    EClass DOMAIN = eINSTANCE.getDomain();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN__IMPORTS = eINSTANCE.getDomain_Imports();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOMAIN__DESCRIPTION = eINSTANCE.getDomain_Description();

    /**
     * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN__ENTITIES = eINSTANCE.getDomain_Entities();

    /**
     * The meta object literal for the '{@link org.pklose.espl.esplm.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pklose.espl.esplm.impl.PropertyImpl
     * @see org.pklose.espl.esplm.impl.EsplmPackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

    /**
     * The meta object literal for the '{@link org.pklose.espl.esplm.impl.AssociationImpl <em>Association</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pklose.espl.esplm.impl.AssociationImpl
     * @see org.pklose.espl.esplm.impl.EsplmPackageImpl#getAssociation()
     * @generated
     */
    EClass ASSOCIATION = eINSTANCE.getAssociation();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSOCIATION__TYPE = eINSTANCE.getAssociation_Type();

    /**
     * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSOCIATION__MULTIPLICITY = eINSTANCE.getAssociation_Multiplicity();

    /**
     * The meta object literal for the '{@link org.pklose.espl.esplm.impl.FieldImpl <em>Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pklose.espl.esplm.impl.FieldImpl
     * @see org.pklose.espl.esplm.impl.EsplmPackageImpl#getField()
     * @generated
     */
    EClass FIELD = eINSTANCE.getField();

    /**
     * The meta object literal for the '<em><b>Literal</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD__LITERAL = eINSTANCE.getField_Literal();

    /**
     * The meta object literal for the '{@link org.pklose.espl.esplm.impl.LiteralImpl <em>Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pklose.espl.esplm.impl.LiteralImpl
     * @see org.pklose.espl.esplm.impl.EsplmPackageImpl#getLiteral()
     * @generated
     */
    EClass LITERAL = eINSTANCE.getLiteral();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LITERAL__NAME = eINSTANCE.getLiteral_Name();

    /**
     * The meta object literal for the '{@link org.pklose.espl.esplm.impl.EnumImpl <em>Enum</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pklose.espl.esplm.impl.EnumImpl
     * @see org.pklose.espl.esplm.impl.EsplmPackageImpl#getEnum()
     * @generated
     */
    EClass ENUM = eINSTANCE.getEnum();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM__TYPE = eINSTANCE.getEnum_Type();

    /**
     * The meta object literal for the '{@link org.pklose.espl.esplm.Boolean <em>Boolean</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pklose.espl.esplm.Boolean
     * @see org.pklose.espl.esplm.impl.EsplmPackageImpl#getBoolean()
     * @generated
     */
    EEnum BOOLEAN = eINSTANCE.getBoolean();

    /**
     * The meta object literal for the '{@link org.pklose.espl.esplm.BREType <em>BRE Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pklose.espl.esplm.BREType
     * @see org.pklose.espl.esplm.impl.EsplmPackageImpl#getBREType()
     * @generated
     */
    EEnum BRE_TYPE = eINSTANCE.getBREType();

    /**
     * The meta object literal for the '{@link org.pklose.espl.esplm.Multiplicty <em>Multiplicty</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.pklose.espl.esplm.Multiplicty
     * @see org.pklose.espl.esplm.impl.EsplmPackageImpl#getMultiplicty()
     * @generated
     */
    EEnum MULTIPLICTY = eINSTANCE.getMultiplicty();

  }

} //EsplmPackage
