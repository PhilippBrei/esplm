/**
 */
package org.pklose.espl.esplm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pklose.espl.esplm.BusinessRule#getImports <em>Imports</em>}</li>
 *   <li>{@link org.pklose.espl.esplm.BusinessRule#getTyp <em>Typ</em>}</li>
 *   <li>{@link org.pklose.espl.esplm.BusinessRule#getSystemInputs <em>System Inputs</em>}</li>
 *   <li>{@link org.pklose.espl.esplm.BusinessRule#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see org.pklose.espl.esplm.EsplmPackage#getBusinessRule()
 * @model
 * @generated
 */
public interface BusinessRule extends Element
{
  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link org.pklose.espl.esplm.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see org.pklose.espl.esplm.EsplmPackage#getBusinessRule_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Typ</b></em>' attribute.
   * The literals are from the enumeration {@link org.pklose.espl.esplm.BREType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Typ</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Typ</em>' attribute.
   * @see org.pklose.espl.esplm.BREType
   * @see #setTyp(BREType)
   * @see org.pklose.espl.esplm.EsplmPackage#getBusinessRule_Typ()
   * @model
   * @generated
   */
  BREType getTyp();

  /**
   * Sets the value of the '{@link org.pklose.espl.esplm.BusinessRule#getTyp <em>Typ</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Typ</em>' attribute.
   * @see org.pklose.espl.esplm.BREType
   * @see #getTyp()
   * @generated
   */
  void setTyp(BREType value);

  /**
   * Returns the value of the '<em><b>System Inputs</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>System Inputs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>System Inputs</em>' containment reference list.
   * @see org.pklose.espl.esplm.EsplmPackage#getBusinessRule_SystemInputs()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getSystemInputs();

  /**
   * Returns the value of the '<em><b>Output</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Output</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Output</em>' reference.
   * @see #setOutput(Entity)
   * @see org.pklose.espl.esplm.EsplmPackage#getBusinessRule_Output()
   * @model
   * @generated
   */
  Entity getOutput();

  /**
   * Sets the value of the '{@link org.pklose.espl.esplm.BusinessRule#getOutput <em>Output</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Output</em>' reference.
   * @see #getOutput()
   * @generated
   */
  void setOutput(Entity value);

} // BusinessRule
