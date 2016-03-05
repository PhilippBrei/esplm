/**
 */
package org.pklose.espl.esplm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.pklose.espl.esplm.EsplmPackage;
import org.pklose.espl.esplm.SystemEntity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pklose.espl.esplm.impl.SystemImpl#getSrcEntities <em>Src Entities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends ElementImpl implements org.pklose.espl.esplm.System
{
  /**
   * The cached value of the '{@link #getSrcEntities() <em>Src Entities</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSrcEntities()
   * @generated
   * @ordered
   */
  protected EList<SystemEntity> srcEntities;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SystemImpl()
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
    return EsplmPackage.Literals.SYSTEM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SystemEntity> getSrcEntities()
  {
    if (srcEntities == null)
    {
      srcEntities = new EObjectContainmentEList<SystemEntity>(SystemEntity.class, this, EsplmPackage.SYSTEM__SRC_ENTITIES);
    }
    return srcEntities;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case EsplmPackage.SYSTEM__SRC_ENTITIES:
        return ((InternalEList<?>)getSrcEntities()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case EsplmPackage.SYSTEM__SRC_ENTITIES:
        return getSrcEntities();
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
      case EsplmPackage.SYSTEM__SRC_ENTITIES:
        getSrcEntities().clear();
        getSrcEntities().addAll((Collection<? extends SystemEntity>)newValue);
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
      case EsplmPackage.SYSTEM__SRC_ENTITIES:
        getSrcEntities().clear();
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
      case EsplmPackage.SYSTEM__SRC_ENTITIES:
        return srcEntities != null && !srcEntities.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SystemImpl
