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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.pklose.espl.esplm.BREType;
import org.pklose.espl.esplm.BreEntityInput;
import org.pklose.espl.esplm.BreOutPutReference;
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
 *   <li>{@link org.pklose.espl.esplm.impl.BusinessRuleImpl#getInputs <em>Inputs</em>}</li>
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
   * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInputs()
   * @generated
   * @ordered
   */
  protected EList<BreEntityInput> inputs;

  /**
   * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutput()
   * @generated
   * @ordered
   */
  protected BreOutPutReference output;

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
  public EList<BreEntityInput> getInputs()
  {
    if (inputs == null)
    {
      inputs = new EObjectContainmentEList<BreEntityInput>(BreEntityInput.class, this, EsplmPackage.BUSINESS_RULE__INPUTS);
    }
    return inputs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BreOutPutReference getOutput()
  {
    return output;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOutput(BreOutPutReference newOutput, NotificationChain msgs)
  {
    BreOutPutReference oldOutput = output;
    output = newOutput;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsplmPackage.BUSINESS_RULE__OUTPUT, oldOutput, newOutput);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOutput(BreOutPutReference newOutput)
  {
    if (newOutput != output)
    {
      NotificationChain msgs = null;
      if (output != null)
        msgs = ((InternalEObject)output).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsplmPackage.BUSINESS_RULE__OUTPUT, null, msgs);
      if (newOutput != null)
        msgs = ((InternalEObject)newOutput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsplmPackage.BUSINESS_RULE__OUTPUT, null, msgs);
      msgs = basicSetOutput(newOutput, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsplmPackage.BUSINESS_RULE__OUTPUT, newOutput, newOutput));
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
      case EsplmPackage.BUSINESS_RULE__INPUTS:
        return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
      case EsplmPackage.BUSINESS_RULE__OUTPUT:
        return basicSetOutput(null, msgs);
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
      case EsplmPackage.BUSINESS_RULE__INPUTS:
        return getInputs();
      case EsplmPackage.BUSINESS_RULE__OUTPUT:
        return getOutput();
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
      case EsplmPackage.BUSINESS_RULE__INPUTS:
        getInputs().clear();
        getInputs().addAll((Collection<? extends BreEntityInput>)newValue);
        return;
      case EsplmPackage.BUSINESS_RULE__OUTPUT:
        setOutput((BreOutPutReference)newValue);
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
      case EsplmPackage.BUSINESS_RULE__INPUTS:
        getInputs().clear();
        return;
      case EsplmPackage.BUSINESS_RULE__OUTPUT:
        setOutput((BreOutPutReference)null);
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
      case EsplmPackage.BUSINESS_RULE__INPUTS:
        return inputs != null && !inputs.isEmpty();
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
