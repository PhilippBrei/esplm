/**
 */
package org.pklose.espl.esplm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.pklose.espl.esplm.Activity;
import org.pklose.espl.esplm.EsplmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pklose.espl.esplm.impl.ActivityImpl#getPredecessor <em>Predecessor</em>}</li>
 *   <li>{@link org.pklose.espl.esplm.impl.ActivityImpl#getSucessors <em>Sucessors</em>}</li>
 *   <li>{@link org.pklose.espl.esplm.impl.ActivityImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityImpl extends ElementImpl implements Activity
{
  /**
   * The cached value of the '{@link #getPredecessor() <em>Predecessor</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPredecessor()
   * @generated
   * @ordered
   */
  protected EList<Activity> predecessor;

  /**
   * The cached value of the '{@link #getSucessors() <em>Sucessors</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSucessors()
   * @generated
   * @ordered
   */
  protected EList<Activity> sucessors;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActivityImpl()
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
    return EsplmPackage.Literals.ACTIVITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Activity> getPredecessor()
  {
    if (predecessor == null)
    {
      predecessor = new EObjectResolvingEList<Activity>(Activity.class, this, EsplmPackage.ACTIVITY__PREDECESSOR);
    }
    return predecessor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Activity> getSucessors()
  {
    if (sucessors == null)
    {
      sucessors = new EObjectResolvingEList<Activity>(Activity.class, this, EsplmPackage.ACTIVITY__SUCESSORS);
    }
    return sucessors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsplmPackage.ACTIVITY__DESCRIPTION, oldDescription, description));
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
      case EsplmPackage.ACTIVITY__PREDECESSOR:
        return getPredecessor();
      case EsplmPackage.ACTIVITY__SUCESSORS:
        return getSucessors();
      case EsplmPackage.ACTIVITY__DESCRIPTION:
        return getDescription();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EsplmPackage.ACTIVITY__PREDECESSOR:
        getPredecessor().clear();
        getPredecessor().addAll((Collection<? extends Activity>)newValue);
        return;
      case EsplmPackage.ACTIVITY__SUCESSORS:
        getSucessors().clear();
        getSucessors().addAll((Collection<? extends Activity>)newValue);
        return;
      case EsplmPackage.ACTIVITY__DESCRIPTION:
        setDescription((String)newValue);
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
      case EsplmPackage.ACTIVITY__PREDECESSOR:
        getPredecessor().clear();
        return;
      case EsplmPackage.ACTIVITY__SUCESSORS:
        getSucessors().clear();
        return;
      case EsplmPackage.ACTIVITY__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
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
      case EsplmPackage.ACTIVITY__PREDECESSOR:
        return predecessor != null && !predecessor.isEmpty();
      case EsplmPackage.ACTIVITY__SUCESSORS:
        return sucessors != null && !sucessors.isEmpty();
      case EsplmPackage.ACTIVITY__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
    result.append(" (description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //ActivityImpl
