/**
 */
package org.pklose.espl.esplm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.pklose.espl.esplm.Activity;
import org.pklose.espl.esplm.Association;
import org.pklose.espl.esplm.BREType;
import org.pklose.espl.esplm.BreEntityInput;
import org.pklose.espl.esplm.BreSystemEntityInput;
import org.pklose.espl.esplm.BusinessRule;
import org.pklose.espl.esplm.Diagram;
import org.pklose.espl.esplm.Domain;
import org.pklose.espl.esplm.Element;
import org.pklose.espl.esplm.Entity;
import org.pklose.espl.esplm.EntityConfiguration;
import org.pklose.espl.esplm.EnumDeclaration;
import org.pklose.espl.esplm.EsplmFactory;
import org.pklose.espl.esplm.EsplmPackage;
import org.pklose.espl.esplm.Field;
import org.pklose.espl.esplm.Flow;
import org.pklose.espl.esplm.Import;
import org.pklose.espl.esplm.Include;
import org.pklose.espl.esplm.Literal;
import org.pklose.espl.esplm.Model;
import org.pklose.espl.esplm.Multiplicty;
import org.pklose.espl.esplm.Property;
import org.pklose.espl.esplm.SystemEntity;
import org.pklose.espl.esplm.SystemEntityConfiguration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EsplmFactoryImpl extends EFactoryImpl implements EsplmFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EsplmFactory init()
  {
    try
    {
      EsplmFactory theEsplmFactory = (EsplmFactory)EPackage.Registry.INSTANCE.getEFactory(EsplmPackage.eNS_URI);
      if (theEsplmFactory != null)
      {
        return theEsplmFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new EsplmFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EsplmFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case EsplmPackage.MODEL: return createModel();
      case EsplmPackage.ELEMENT: return createElement();
      case EsplmPackage.FLOW: return createFlow();
      case EsplmPackage.ACTIVITY: return createActivity();
      case EsplmPackage.BUSINESS_RULE: return createBusinessRule();
      case EsplmPackage.BRE_SYSTEM_ENTITY_INPUT: return createBreSystemEntityInput();
      case EsplmPackage.BRE_ENTITY_INPUT: return createBreEntityInput();
      case EsplmPackage.SYSTEM_ENTITY_CONFIGURATION: return createSystemEntityConfiguration();
      case EsplmPackage.ENTITY_CONFIGURATION: return createEntityConfiguration();
      case EsplmPackage.SYSTEM: return createSystem();
      case EsplmPackage.SYSTEM_ENTITY: return createSystemEntity();
      case EsplmPackage.IMPORT: return createImport();
      case EsplmPackage.DIAGRAM: return createDiagram();
      case EsplmPackage.INCLUDE: return createInclude();
      case EsplmPackage.ENUM_DECLARATION: return createEnumDeclaration();
      case EsplmPackage.ENTITY: return createEntity();
      case EsplmPackage.DOMAIN: return createDomain();
      case EsplmPackage.PROPERTY: return createProperty();
      case EsplmPackage.ASSOCIATION: return createAssociation();
      case EsplmPackage.FIELD: return createField();
      case EsplmPackage.LITERAL: return createLiteral();
      case EsplmPackage.ENUM: return createEnum();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case EsplmPackage.BOOLEAN:
        return createBooleanFromString(eDataType, initialValue);
      case EsplmPackage.BRE_TYPE:
        return createBRETypeFromString(eDataType, initialValue);
      case EsplmPackage.MULTIPLICTY:
        return createMultiplictyFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case EsplmPackage.BOOLEAN:
        return convertBooleanToString(eDataType, instanceValue);
      case EsplmPackage.BRE_TYPE:
        return convertBRETypeToString(eDataType, instanceValue);
      case EsplmPackage.MULTIPLICTY:
        return convertMultiplictyToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Element createElement()
  {
    ElementImpl element = new ElementImpl();
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Flow createFlow()
  {
    FlowImpl flow = new FlowImpl();
    return flow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Activity createActivity()
  {
    ActivityImpl activity = new ActivityImpl();
    return activity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BusinessRule createBusinessRule()
  {
    BusinessRuleImpl businessRule = new BusinessRuleImpl();
    return businessRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BreSystemEntityInput createBreSystemEntityInput()
  {
    BreSystemEntityInputImpl breSystemEntityInput = new BreSystemEntityInputImpl();
    return breSystemEntityInput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BreEntityInput createBreEntityInput()
  {
    BreEntityInputImpl breEntityInput = new BreEntityInputImpl();
    return breEntityInput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemEntityConfiguration createSystemEntityConfiguration()
  {
    SystemEntityConfigurationImpl systemEntityConfiguration = new SystemEntityConfigurationImpl();
    return systemEntityConfiguration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityConfiguration createEntityConfiguration()
  {
    EntityConfigurationImpl entityConfiguration = new EntityConfigurationImpl();
    return entityConfiguration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.pklose.espl.esplm.System createSystem()
  {
    SystemImpl system = new SystemImpl();
    return system;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemEntity createSystemEntity()
  {
    SystemEntityImpl systemEntity = new SystemEntityImpl();
    return systemEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Diagram createDiagram()
  {
    DiagramImpl diagram = new DiagramImpl();
    return diagram;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Include createInclude()
  {
    IncludeImpl include = new IncludeImpl();
    return include;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumDeclaration createEnumDeclaration()
  {
    EnumDeclarationImpl enumDeclaration = new EnumDeclarationImpl();
    return enumDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity createEntity()
  {
    EntityImpl entity = new EntityImpl();
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Domain createDomain()
  {
    DomainImpl domain = new DomainImpl();
    return domain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property createProperty()
  {
    PropertyImpl property = new PropertyImpl();
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Association createAssociation()
  {
    AssociationImpl association = new AssociationImpl();
    return association;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Field createField()
  {
    FieldImpl field = new FieldImpl();
    return field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal createLiteral()
  {
    LiteralImpl literal = new LiteralImpl();
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.pklose.espl.esplm.Enum createEnum()
  {
    EnumImpl enum_ = new EnumImpl();
    return enum_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.pklose.espl.esplm.Boolean createBooleanFromString(EDataType eDataType, String initialValue)
  {
    org.pklose.espl.esplm.Boolean result = org.pklose.espl.esplm.Boolean.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBooleanToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BREType createBRETypeFromString(EDataType eDataType, String initialValue)
  {
    BREType result = BREType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBRETypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Multiplicty createMultiplictyFromString(EDataType eDataType, String initialValue)
  {
    Multiplicty result = Multiplicty.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertMultiplictyToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EsplmPackage getEsplmPackage()
  {
    return (EsplmPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static EsplmPackage getPackage()
  {
    return EsplmPackage.eINSTANCE;
  }

} //EsplmFactoryImpl
