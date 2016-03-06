/**
 */
package org.pklose.espl.esplm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bre Out Put Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pklose.espl.esplm.BreOutPutReference#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see org.pklose.espl.esplm.EsplmPackage#getBreOutPutReference()
 * @model
 * @generated
 */
public interface BreOutPutReference extends EObject
{
  /**
   * Returns the value of the '<em><b>Output</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Output</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Output</em>' reference.
   * @see #setOutput(ModelElement)
   * @see org.pklose.espl.esplm.EsplmPackage#getBreOutPutReference_Output()
   * @model
   * @generated
   */
  ModelElement getOutput();

  /**
   * Sets the value of the '{@link org.pklose.espl.esplm.BreOutPutReference#getOutput <em>Output</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Output</em>' reference.
   * @see #getOutput()
   * @generated
   */
  void setOutput(ModelElement value);

} // BreOutPutReference
