/**
 */
package org.pklose.espl.esplm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.pklose.espl.esplm.BreOutPutReference;
import org.pklose.espl.esplm.EsplmPackage;
import org.pklose.espl.esplm.ModelElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bre Out Put Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pklose.espl.esplm.impl.BreOutPutReferenceImpl#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BreOutPutReferenceImpl extends MinimalEObjectImpl.Container implements BreOutPutReference
{
  /**
   * The cached value of the '{@link #getOutput() <em>Output</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutput()
   * @generated
   * @ordered
   */
  protected ModelElement output;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BreOutPutReferenceImpl()
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
    return EsplmPackage.Literals.BRE_OUT_PUT_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelElement getOutput()
  {
    if (output != null && output.eIsProxy())
    {
      InternalEObject oldOutput = (InternalEObject)output;
      output = (ModelElement)eResolveProxy(oldOutput);
      if (output != oldOutput)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EsplmPackage.BRE_OUT_PUT_REFERENCE__OUTPUT, oldOutput, output));
      }
    }
    return output;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelElement basicGetOutput()
  {
    return output;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOutput(ModelElement newOutput)
  {
    ModelElement oldOutput = output;
    output = newOutput;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsplmPackage.BRE_OUT_PUT_REFERENCE__OUTPUT, oldOutput, output));
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
      case EsplmPackage.BRE_OUT_PUT_REFERENCE__OUTPUT:
        if (resolve) return getOutput();
        return basicGetOutput();
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
      case EsplmPackage.BRE_OUT_PUT_REFERENCE__OUTPUT:
        setOutput((ModelElement)newValue);
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
      case EsplmPackage.BRE_OUT_PUT_REFERENCE__OUTPUT:
        setOutput((ModelElement)null);
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
      case EsplmPackage.BRE_OUT_PUT_REFERENCE__OUTPUT:
        return output != null;
    }
    return super.eIsSet(featureID);
  }

} //BreOutPutReferenceImpl
