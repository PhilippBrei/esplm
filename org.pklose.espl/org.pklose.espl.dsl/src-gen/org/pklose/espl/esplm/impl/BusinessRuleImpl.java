/**
 */
package org.pklose.espl.esplm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.pklose.espl.esplm.BREType;
import org.pklose.espl.esplm.BusinessRule;
import org.pklose.espl.esplm.EsplmPackage;
import org.pklose.espl.esplm.Import;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Business Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pklose.espl.esplm.impl.BusinessRuleImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.pklose.espl.esplm.impl.BusinessRuleImpl#getTyp <em>Typ</em>}</li>
 *   <li>{@link org.pklose.espl.esplm.impl.BusinessRuleImpl#getSystemInputs <em>System Inputs</em>}</li>
 *   <li>{@link org.pklose.espl.esplm.impl.BusinessRuleImpl#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusinessRuleImpl extends ElementImpl implements BusinessRule
{
  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<Import> imports;

  /**
   * The default value of the '{@link #getTyp() <em>Typ</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTyp()
   * @generated
   * @ordered
   */
  protected static final BREType TYP_EDEFAULT = BREType.BIZ_TO_BIZ;

  /**
   * The cached value of the '{@link #getTyp() <em>Typ</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTyp()
   * @generated
   * @ordered
   */
  protected BREType typ = TYP_EDEFAULT;

  /**
   * The cached value of the '{@link #getSystemInputs() <em>System Inputs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSystemInputs()
   * @generated
   * @ordered
   */
  protected EList<EObject> systemInputs;

  /**
   * The cached value of the '{@link #getOutput() <em>Output</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutput()
   * @generated
   * @ordered
   */
  protected EObject output;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BusinessRuleImpl()
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
    return EsplmPackage.Literals.BUSINESS_RULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Import> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<Import>(Import.class, this, EsplmPackage.BUSINESS_RULE__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BREType getTyp()
  {
    return typ;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTyp(BREType newTyp)
  {
    BREType oldTyp = typ;
    typ = newTyp == null ? TYP_EDEFAULT : newTyp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsplmPackage.BUSINESS_RULE__TYP, oldTyp, typ));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EObject> getSystemInputs()
  {
    if (systemInputs == null)
    {
      systemInputs = new EObjectContainmentEList<EObject>(EObject.class, this, EsplmPackage.BUSINESS_RULE__SYSTEM_INPUTS);
    }
    return systemInputs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getOutput()
  {
    if (output != null && output.eIsProxy())
    {
      InternalEObject oldOutput = (InternalEObject)output;
      output = eResolveProxy(oldOutput);
      if (output != oldOutput)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EsplmPackage.BUSINESS_RULE__OUTPUT, oldOutput, output));
      }
    }
    return output;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject basicGetOutput()
  {
    return output;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOutput(EObject newOutput)
  {
    EObject oldOutput = output;
    output = newOutput;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsplmPackage.BUSINESS_RULE__OUTPUT, oldOutput, output));
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
      case EsplmPackage.BUSINESS_RULE__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case EsplmPackage.BUSINESS_RULE__SYSTEM_INPUTS:
        return ((InternalEList<?>)getSystemInputs()).basicRemove(otherEnd, msgs);
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
      case EsplmPackage.BUSINESS_RULE__IMPORTS:
        return getImports();
      case EsplmPackage.BUSINESS_RULE__TYP:
        return getTyp();
      case EsplmPackage.BUSINESS_RULE__SYSTEM_INPUTS:
        return getSystemInputs();
      case EsplmPackage.BUSINESS_RULE__OUTPUT:
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
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EsplmPackage.BUSINESS_RULE__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends Import>)newValue);
        return;
      case EsplmPackage.BUSINESS_RULE__TYP:
        setTyp((BREType)newValue);
        return;
      case EsplmPackage.BUSINESS_RULE__SYSTEM_INPUTS:
        getSystemInputs().clear();
        getSystemInputs().addAll((Collection<? extends EObject>)newValue);
        return;
      case EsplmPackage.BUSINESS_RULE__OUTPUT:
        setOutput((EObject)newValue);
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
      case EsplmPackage.BUSINESS_RULE__IMPORTS:
        getImports().clear();
        return;
      case EsplmPackage.BUSINESS_RULE__TYP:
        setTyp(TYP_EDEFAULT);
        return;
      case EsplmPackage.BUSINESS_RULE__SYSTEM_INPUTS:
        getSystemInputs().clear();
        return;
      case EsplmPackage.BUSINESS_RULE__OUTPUT:
        setOutput((EObject)null);
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
      case EsplmPackage.BUSINESS_RULE__IMPORTS:
        return imports != null && !imports.isEmpty();
      case EsplmPackage.BUSINESS_RULE__TYP:
        return typ != TYP_EDEFAULT;
      case EsplmPackage.BUSINESS_RULE__SYSTEM_INPUTS:
        return systemInputs != null && !systemInputs.isEmpty();
      case EsplmPackage.BUSINESS_RULE__OUTPUT:
        return output != null;
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
    result.append(" (typ: ");
    result.append(typ);
    result.append(')');
    return result.toString();
  }

} //BusinessRuleImpl
