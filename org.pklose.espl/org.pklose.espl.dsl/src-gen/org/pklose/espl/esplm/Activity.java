/**
 */
package org.pklose.espl.esplm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pklose.espl.esplm.Activity#getPredecessor <em>Predecessor</em>}</li>
 *   <li>{@link org.pklose.espl.esplm.Activity#getSucessors <em>Sucessors</em>}</li>
 *   <li>{@link org.pklose.espl.esplm.Activity#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.pklose.espl.esplm.EsplmPackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends Element
{
  /**
   * Returns the value of the '<em><b>Predecessor</b></em>' reference list.
   * The list contents are of type {@link org.pklose.espl.esplm.Activity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Predecessor</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Predecessor</em>' reference list.
   * @see org.pklose.espl.esplm.EsplmPackage#getActivity_Predecessor()
   * @model
   * @generated
   */
  EList<Activity> getPredecessor();

  /**
   * Returns the value of the '<em><b>Sucessors</b></em>' reference list.
   * The list contents are of type {@link org.pklose.espl.esplm.Activity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sucessors</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sucessors</em>' reference list.
   * @see org.pklose.espl.esplm.EsplmPackage#getActivity_Sucessors()
   * @model
   * @generated
   */
  EList<Activity> getSucessors();

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see org.pklose.espl.esplm.EsplmPackage#getActivity_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.pklose.espl.esplm.Activity#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

} // Activity
