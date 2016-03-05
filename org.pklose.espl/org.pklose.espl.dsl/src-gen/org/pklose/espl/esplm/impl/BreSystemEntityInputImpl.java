/**
 */
package org.pklose.espl.esplm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.pklose.espl.esplm.BreSystemEntityInput;
import org.pklose.espl.esplm.EsplmPackage;
import org.pklose.espl.esplm.SystemEntity;
import org.pklose.espl.esplm.SystemEntityConfiguration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bre System Entity Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pklose.espl.esplm.impl.BreSystemEntityInputImpl#getInputElement <em>Input Element</em>}</li>
 *   <li>{@link org.pklose.espl.esplm.impl.BreSystemEntityInputImpl#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BreSystemEntityInputImpl extends MinimalEObjectImpl.Container implements BreSystemEntityInput
{
  /**
   * The cached value of the '{@link #getInputElement() <em>Input Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInputElement()
   * @generated
   * @ordered
   */
  protected SystemEntity inputElement;

  /**
   * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConfiguration()
   * @generated
   * @ordered
   */
  protected EList<SystemEntityConfiguration> configuration;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BreSystemEntityInputImpl()
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
    return EsplmPackage.Literals.BRE_SYSTEM_ENTITY_INPUT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemEntity getInputElement()
  {
    if (inputElement != null && inputElement.eIsProxy())
    {
      InternalEObject oldInputElement = (InternalEObject)inputElement;
      inputElement = (SystemEntity)eResolveProxy(oldInputElement);
      if (inputElement != oldInputElement)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EsplmPackage.BRE_SYSTEM_ENTITY_INPUT__INPUT_ELEMENT, oldInputElement, inputElement));
      }
    }
    return inputElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemEntity basicGetInputElement()
  {
    return inputElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInputElement(SystemEntity newInputElement)
  {
    SystemEntity oldInputElement = inputElement;
    inputElement = newInputElement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsplmPackage.BRE_SYSTEM_ENTITY_INPUT__INPUT_ELEMENT, oldInputElement, inputElement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SystemEntityConfiguration> getConfiguration()
  {
    if (configuration == null)
    {
      configuration = new EObjectContainmentEList<SystemEntityConfiguration>(SystemEntityConfiguration.class, this, EsplmPackage.BRE_SYSTEM_ENTITY_INPUT__CONFIGURATION);
    }
    return configuration;
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
      case EsplmPackage.BRE_SYSTEM_ENTITY_INPUT__CONFIGURATION:
        return ((InternalEList<?>)getConfiguration()).basicRemove(otherEnd, msgs);
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
      case EsplmPackage.BRE_SYSTEM_ENTITY_INPUT__INPUT_ELEMENT:
        if (resolve) return getInputElement();
        return basicGetInputElement();
      case EsplmPackage.BRE_SYSTEM_ENTITY_INPUT__CONFIGURATION:
        return getConfiguration();
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
      case EsplmPackage.BRE_SYSTEM_ENTITY_INPUT__INPUT_ELEMENT:
        setInputElement((SystemEntity)newValue);
        return;
      case EsplmPackage.BRE_SYSTEM_ENTITY_INPUT__CONFIGURATION:
        getConfiguration().clear();
        getConfiguration().addAll((Collection<? extends SystemEntityConfiguration>)newValue);
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
      case EsplmPackage.BRE_SYSTEM_ENTITY_INPUT__INPUT_ELEMENT:
        setInputElement((SystemEntity)null);
        return;
      case EsplmPackage.BRE_SYSTEM_ENTITY_INPUT__CONFIGURATION:
        getConfiguration().clear();
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
      case EsplmPackage.BRE_SYSTEM_ENTITY_INPUT__INPUT_ELEMENT:
        return inputElement != null;
      case EsplmPackage.BRE_SYSTEM_ENTITY_INPUT__CONFIGURATION:
        return configuration != null && !configuration.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //BreSystemEntityInputImpl
