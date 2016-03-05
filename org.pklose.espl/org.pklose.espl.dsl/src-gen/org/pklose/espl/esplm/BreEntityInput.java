/**
 */
package org.pklose.espl.esplm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bre Entity Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pklose.espl.esplm.BreEntityInput#getInputElement <em>Input Element</em>}</li>
 *   <li>{@link org.pklose.espl.esplm.BreEntityInput#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 *
 * @see org.pklose.espl.esplm.EsplmPackage#getBreEntityInput()
 * @model
 * @generated
 */
public interface BreEntityInput extends EObject
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
   * @see #setInputElement(Entity)
   * @see org.pklose.espl.esplm.EsplmPackage#getBreEntityInput_InputElement()
   * @model
   * @generated
   */
  Entity getInputElement();

  /**
   * Sets the value of the '{@link org.pklose.espl.esplm.BreEntityInput#getInputElement <em>Input Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input Element</em>' reference.
   * @see #getInputElement()
   * @generated
   */
  void setInputElement(Entity value);

  /**
   * Returns the value of the '<em><b>Configuration</b></em>' containment reference list.
   * The list contents are of type {@link org.pklose.espl.esplm.EntityConfiguration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Configuration</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Configuration</em>' containment reference list.
   * @see org.pklose.espl.esplm.EsplmPackage#getBreEntityInput_Configuration()
   * @model containment="true"
   * @generated
   */
  EList<EntityConfiguration> getConfiguration();

} // BreEntityInput
