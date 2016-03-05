/**
 */
package org.pklose.espl.esplm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bre System Entity Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pklose.espl.esplm.BreSystemEntityInput#getInputElement <em>Input Element</em>}</li>
 *   <li>{@link org.pklose.espl.esplm.BreSystemEntityInput#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 *
 * @see org.pklose.espl.esplm.EsplmPackage#getBreSystemEntityInput()
 * @model
 * @generated
 */
public interface BreSystemEntityInput extends EObject
{
  /**
   * Returns the value of the '<em><b>Input Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input Element</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input Element</em>' reference.
   * @see #setInputElement(SystemEntity)
   * @see org.pklose.espl.esplm.EsplmPackage#getBreSystemEntityInput_InputElement()
   * @model
   * @generated
   */
  SystemEntity getInputElement();

  /**
   * Sets the value of the '{@link org.pklose.espl.esplm.BreSystemEntityInput#getInputElement <em>Input Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input Element</em>' reference.
   * @see #getInputElement()
   * @generated
   */
  void setInputElement(SystemEntity value);

  /**
   * Returns the value of the '<em><b>Configuration</b></em>' containment reference list.
   * The list contents are of type {@link org.pklose.espl.esplm.SystemEntityConfiguration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Configuration</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Configuration</em>' containment reference list.
   * @see org.pklose.espl.esplm.EsplmPackage#getBreSystemEntityInput_Configuration()
   * @model containment="true"
   * @generated
   */
  EList<SystemEntityConfiguration> getConfiguration();

} // BreSystemEntityInput
