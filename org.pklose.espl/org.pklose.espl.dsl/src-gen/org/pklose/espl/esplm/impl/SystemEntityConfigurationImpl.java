/**
 */
package org.pklose.espl.esplm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.pklose.espl.esplm.EsplmPackage;
import org.pklose.espl.esplm.SystemEntityConfiguration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Entity Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pklose.espl.esplm.impl.SystemEntityConfigurationImpl#getPrimary <em>Primary</em>}</li>
 *   <li>{@link org.pklose.espl.esplm.impl.SystemEntityConfigurationImpl#getObligatorisch <em>Obligatorisch</em>}</li>
 *   <li>{@link org.pklose.espl.esplm.impl.SystemEntityConfigurationImpl#getMultiple <em>Multiple</em>}</li>
 *   <li>{@link org.pklose.espl.esplm.impl.SystemEntityConfigurationImpl#getJoinCriteria <em>Join Criteria</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemEntityConfigurationImpl extends MinimalEObjectImpl.Container implements SystemEntityConfiguration
{
  /**
   * The default value of the '{@link #getPrimary() <em>Primary</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimary()
   * @generated
   * @ordered
   */
  protected static final org.pklose.espl.esplm.Boolean PRIMARY_EDEFAULT = org.pklose.espl.esplm.Boolean.TRUE;

  /**
   * The cached value of the '{@link #getPrimary() <em>Primary</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimary()
   * @generated
   * @ordered
   */
  protected org.pklose.espl.esplm.Boolean primary = PRIMARY_EDEFAULT;

  /**
   * The default value of the '{@link #getObligatorisch() <em>Obligatorisch</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObligatorisch()
   * @generated
   * @ordered
   */
  protected static final org.pklose.espl.esplm.Boolean OBLIGATORISCH_EDEFAULT = org.pklose.espl.esplm.Boolean.TRUE;

  /**
   * The cached value of the '{@link #getObligatorisch() <em>Obligatorisch</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObligatorisch()
   * @generated
   * @ordered
   */
  protected org.pklose.espl.esplm.Boolean obligatorisch = OBLIGATORISCH_EDEFAULT;

  /**
   * The default value of the '{@link #getMultiple() <em>Multiple</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMultiple()
   * @generated
   * @ordered
   */
  protected static final org.pklose.espl.esplm.Boolean MULTIPLE_EDEFAULT = org.pklose.espl.esplm.Boolean.TRUE;

  /**
   * The cached value of the '{@link #getMultiple() <em>Multiple</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMultiple()
   * @generated
   * @ordered
   */
  protected org.pklose.espl.esplm.Boolean multiple = MULTIPLE_EDEFAULT;

  /**
   * The default value of the '{@link #getJoinCriteria() <em>Join Criteria</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJoinCriteria()
   * @generated
   * @ordered
   */
  protected static final String JOIN_CRITERIA_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getJoinCriteria() <em>Join Criteria</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJoinCriteria()
   * @generated
   * @ordered
   */
  protected String joinCriteria = JOIN_CRITERIA_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SystemEntityConfigurationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return EsplmPackage.Literals.SYSTEM_ENTITY_CONFIGURATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.pklose.espl.esplm.Boolean getPrimary()
  {
    return primary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrimary(org.pklose.espl.esplm.Boolean newPrimary)
  {
    org.pklose.espl.esplm.Boolean oldPrimary = primary;
    primary = newPrimary == null ? PRIMARY_EDEFAULT : newPrimary;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsplmPackage.SYSTEM_ENTITY_CONFIGURATION__PRIMARY, oldPrimary, primary));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.pklose.espl.esplm.Boolean getObligatorisch()
  {
    return obligatorisch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObligatorisch(org.pklose.espl.esplm.Boolean newObligatorisch)
  {
    org.pklose.espl.esplm.Boolean oldObligatorisch = obligatorisch;
    obligatorisch = newObligatorisch == null ? OBLIGATORISCH_EDEFAULT : newObligatorisch;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsplmPackage.SYSTEM_ENTITY_CONFIGURATION__OBLIGATORISCH, oldObligatorisch, obligatorisch));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.pklose.espl.esplm.Boolean getMultiple()
  {
    return multiple;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMultiple(org.pklose.espl.esplm.Boolean newMultiple)
  {
    org.pklose.espl.esplm.Boolean oldMultiple = multiple;
    multiple = newMultiple == null ? MULTIPLE_EDEFAULT : newMultiple;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsplmPackage.SYSTEM_ENTITY_CONFIGURATION__MULTIPLE, oldMultiple, multiple));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getJoinCriteria()
  {
    return joinCriteria;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJoinCriteria(String newJoinCriteria)
  {
    String oldJoinCriteria = joinCriteria;
    joinCriteria = newJoinCriteria;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsplmPackage.SYSTEM_ENTITY_CONFIGURATION__JOIN_CRITERIA, oldJoinCriteria, joinCriteria));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case EsplmPackage.SYSTEM_ENTITY_CONFIGURATION__PRIMARY:
        return getPrimary();
      case EsplmPackage.SYSTEM_ENTITY_CONFIGURATION__OBLIGATORISCH:
        return getObligatorisch();
      case EsplmPackage.SYSTEM_ENTITY_CONFIGURATION__MULTIPLE:
        return getMultiple();
      case EsplmPackage.SYSTEM_ENTITY_CONFIGURATION__JOIN_CRITERIA:
        return getJoinCriteria();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EsplmPackage.SYSTEM_ENTITY_CONFIGURATION__PRIMARY:
        setPrimary((org.pklose.espl.esplm.Boolean)newValue);
        return;
      case EsplmPackage.SYSTEM_ENTITY_CONFIGURATION__OBLIGATORISCH:
        setObligatorisch((org.pklose.espl.esplm.Boolean)newValue);
        return;
      case EsplmPackage.SYSTEM_ENTITY_CONFIGURATION__MULTIPLE:
        setMultiple((org.pklose.espl.esplm.Boolean)newValue);
        return;
      case EsplmPackage.SYSTEM_ENTITY_CONFIGURATION__JOIN_CRITERIA:
        setJoinCriteria((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case EsplmPackage.SYSTEM_ENTITY_CONFIGURATION__PRIMARY:
        setPrimary(PRIMARY_EDEFAULT);
        return;
      case EsplmPackage.SYSTEM_ENTITY_CONFIGURATION__OBLIGATORISCH:
        setObligatorisch(OBLIGATORISCH_EDEFAULT);
        return;
      case EsplmPackage.SYSTEM_ENTITY_CONFIGURATION__MULTIPLE:
        setMultiple(MULTIPLE_EDEFAULT);
        return;
      case EsplmPackage.SYSTEM_ENTITY_CONFIGURATION__JOIN_CRITERIA:
        setJoinCriteria(JOIN_CRITERIA_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case EsplmPackage.SYSTEM_ENTITY_CONFIGURATION__PRIMARY:
        return primary != PRIMARY_EDEFAULT;
      case EsplmPackage.SYSTEM_ENTITY_CONFIGURATION__OBLIGATORISCH:
        return obligatorisch != OBLIGATORISCH_EDEFAULT;
      case EsplmPackage.SYSTEM_ENTITY_CONFIGURATION__MULTIPLE:
        return multiple != MULTIPLE_EDEFAULT;
      case EsplmPackage.SYSTEM_ENTITY_CONFIGURATION__JOIN_CRITERIA:
        return JOIN_CRITERIA_EDEFAULT == null ? joinCriteria != null : !JOIN_CRITERIA_EDEFAULT.equals(joinCriteria);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (primary: ");
    result.append(primary);
    result.append(", obligatorisch: ");
    result.append(obligatorisch);
    result.append(", multiple: ");
    result.append(multiple);
    result.append(", joinCriteria: ");
    result.append(joinCriteria);
    result.append(')');
    return result.toString();
  }

} //SystemEntityConfigurationImpl
