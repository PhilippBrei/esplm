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

import org.pklose.espl.esplm.BreEntityInput;
import org.pklose.espl.esplm.EntityConfiguration;
import org.pklose.espl.esplm.EsplmPackage;
import org.pklose.espl.esplm.ModelElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bre Entity Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pklose.espl.esplm.impl.BreEntityInputImpl#getInputElement <em>Input Element</em>}</li>
 *   <li>{@link org.pklose.espl.esplm.impl.BreEntityInputImpl#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BreEntityInputImpl extends MinimalEObjectImpl.Container implements BreEntityInput
{
  /**
   * The cached value of the '{@link #getInputElement() <em>Input Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInputElement()
   * @generated
   * @ordered
   */
  protected ModelElement inputElement;

  /**
   * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConfiguration()
   * @generated
   * @ordered
   */
  protected EList<EntityConfiguration> configuration;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BreEntityInputImpl()
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
    return EsplmPackage.Literals.BRE_ENTITY_INPUT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelElement getInputElement()
  {
    if (inputElement != null && inputElement.eIsProxy())
    {
      InternalEObject oldInputElement = (InternalEObject)inputElement;
      inputElement = (ModelElement)eResolveProxy(oldInputElement);
      if (inputElement != oldInputElement)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EsplmPackage.BRE_ENTITY_INPUT__INPUT_ELEMENT, oldInputElement, inputElement));
      }
    }
    return inputElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelElement basicGetInputElement()
  {
    return inputElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInputElement(ModelElement newInputElement)
  {
    ModelElement oldInputElement = inputElement;
    inputElement = newInputElement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsplmPackage.BRE_ENTITY_INPUT__INPUT_ELEMENT, oldInputElement, inputElement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EntityConfiguration> getConfiguration()
  {
    if (configuration == null)
    {
      configuration = new EObjectContainmentEList<EntityConfiguration>(EntityConfiguration.class, this, EsplmPackage.BRE_ENTITY_INPUT__CONFIGURATION);
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
      case EsplmPackage.BRE_ENTITY_INPUT__CONFIGURATION:
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
      case EsplmPackage.BRE_ENTITY_INPUT__INPUT_ELEMENT:
        if (resolve) return getInputElement();
        return basicGetInputElement();
      case EsplmPackage.BRE_ENTITY_INPUT__CONFIGURATION:
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
      case EsplmPackage.BRE_ENTITY_INPUT__INPUT_ELEMENT:
        setInputElement((ModelElement)newValue);
        return;
      case EsplmPackage.BRE_ENTITY_INPUT__CONFIGURATION:
        getConfiguration().clear();
        getConfiguration().addAll((Collection<? extends EntityConfiguration>)newValue);
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
      case EsplmPackage.BRE_ENTITY_INPUT__INPUT_ELEMENT:
        setInputElement((ModelElement)null);
        return;
      case EsplmPackage.BRE_ENTITY_INPUT__CONFIGURATION:
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
      case EsplmPackage.BRE_ENTITY_INPUT__INPUT_ELEMENT:
        return inputElement != null;
      case EsplmPackage.BRE_ENTITY_INPUT__CONFIGURATION:
        return configuration != null && !configuration.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //BreEntityInputImpl
