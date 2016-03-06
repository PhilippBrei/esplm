/**
 */
package org.pklose.espl.esplm.impl;

import java.lang.Boolean;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.pklose.espl.esplm.EntityConfiguration;
import org.pklose.espl.esplm.EsplmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pklose.espl.esplm.impl.EntityConfigurationImpl#isPrimary <em>Primary</em>}</li>
 *   <li>{@link org.pklose.espl.esplm.impl.EntityConfigurationImpl#isObligatory <em>Obligatory</em>}</li>
 *   <li>{@link org.pklose.espl.esplm.impl.EntityConfigurationImpl#isMultiple <em>Multiple</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityConfigurationImpl extends MinimalEObjectImpl.Container implements EntityConfiguration
{
  /**
   * The default value of the '{@link #isPrimary() <em>Primary</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPrimary()
   * @generated
   * @ordered
   */
  protected static final boolean PRIMARY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPrimary() <em>Primary</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPrimary()
   * @generated
   * @ordered
   */
  protected boolean primary = PRIMARY_EDEFAULT;

  /**
   * The default value of the '{@link #isObligatory() <em>Obligatory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isObligatory()
   * @generated
   * @ordered
   */
  protected static final boolean OBLIGATORY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isObligatory() <em>Obligatory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isObligatory()
   * @generated
   * @ordered
   */
  protected boolean obligatory = OBLIGATORY_EDEFAULT;

  /**
   * The default value of the '{@link #isMultiple() <em>Multiple</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMultiple()
   * @generated
   * @ordered
   */
  protected static final boolean MULTIPLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMultiple() <em>Multiple</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMultiple()
   * @generated
   * @ordered
   */
  protected boolean multiple = MULTIPLE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntityConfigurationImpl()
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
    return EsplmPackage.Literals.ENTITY_CONFIGURATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPrimary()
  {
    return primary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrimary(boolean newPrimary)
  {
    boolean oldPrimary = primary;
    primary = newPrimary;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsplmPackage.ENTITY_CONFIGURATION__PRIMARY, oldPrimary, primary));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isObligatory()
  {
    return obligatory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObligatory(boolean newObligatory)
  {
    boolean oldObligatory = obligatory;
    obligatory = newObligatory;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsplmPackage.ENTITY_CONFIGURATION__OBLIGATORY, oldObligatory, obligatory));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMultiple()
  {
    return multiple;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMultiple(boolean newMultiple)
  {
    boolean oldMultiple = multiple;
    multiple = newMultiple;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsplmPackage.ENTITY_CONFIGURATION__MULTIPLE, oldMultiple, multiple));
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
      case EsplmPackage.ENTITY_CONFIGURATION__PRIMARY:
        return isPrimary();
      case EsplmPackage.ENTITY_CONFIGURATION__OBLIGATORY:
        return isObligatory();
      case EsplmPackage.ENTITY_CONFIGURATION__MULTIPLE:
        return isMultiple();
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
      case EsplmPackage.ENTITY_CONFIGURATION__PRIMARY:
        setPrimary((Boolean)newValue);
        return;
      case EsplmPackage.ENTITY_CONFIGURATION__OBLIGATORY:
        setObligatory((Boolean)newValue);
        return;
      case EsplmPackage.ENTITY_CONFIGURATION__MULTIPLE:
        setMultiple((Boolean)newValue);
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
      case EsplmPackage.ENTITY_CONFIGURATION__PRIMARY:
        setPrimary(PRIMARY_EDEFAULT);
        return;
      case EsplmPackage.ENTITY_CONFIGURATION__OBLIGATORY:
        setObligatory(OBLIGATORY_EDEFAULT);
        return;
      case EsplmPackage.ENTITY_CONFIGURATION__MULTIPLE:
        setMultiple(MULTIPLE_EDEFAULT);
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
      case EsplmPackage.ENTITY_CONFIGURATION__PRIMARY:
        return primary != PRIMARY_EDEFAULT;
      case EsplmPackage.ENTITY_CONFIGURATION__OBLIGATORY:
        return obligatory != OBLIGATORY_EDEFAULT;
      case EsplmPackage.ENTITY_CONFIGURATION__MULTIPLE:
        return multiple != MULTIPLE_EDEFAULT;
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
    result.append(", obligatory: ");
    result.append(obligatory);
    result.append(", multiple: ");
    result.append(multiple);
    result.append(')');
    return result.toString();
  }

} //EntityConfigurationImpl
