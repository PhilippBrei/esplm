/**
 */
package org.pklose.espl.esplm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Entity Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pklose.espl.esplm.SystemEntityConfiguration#getPrimary <em>Primary</em>}</li>
 *   <li>{@link org.pklose.espl.esplm.SystemEntityConfiguration#getObligatorisch <em>Obligatorisch</em>}</li>
 *   <li>{@link org.pklose.espl.esplm.SystemEntityConfiguration#getMultiple <em>Multiple</em>}</li>
 *   <li>{@link org.pklose.espl.esplm.SystemEntityConfiguration#getJoinCriteria <em>Join Criteria</em>}</li>
 * </ul>
 *
 * @see org.pklose.espl.esplm.EsplmPackage#getSystemEntityConfiguration()
 * @model
 * @generated
 */
public interface SystemEntityConfiguration extends EObject
{
  /**
   * Returns the value of the '<em><b>Primary</b></em>' attribute.
   * The literals are from the enumeration {@link org.pklose.espl.esplm.Boolean}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Primary</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Primary</em>' attribute.
   * @see org.pklose.espl.esplm.Boolean
   * @see #setPrimary(org.pklose.espl.esplm.Boolean)
   * @see org.pklose.espl.esplm.EsplmPackage#getSystemEntityConfiguration_Primary()
   * @model
   * @generated
   */
  org.pklose.espl.esplm.Boolean getPrimary();

  /**
   * Sets the value of the '{@link org.pklose.espl.esplm.SystemEntityConfiguration#getPrimary <em>Primary</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Primary</em>' attribute.
   * @see org.pklose.espl.esplm.Boolean
   * @see #getPrimary()
   * @generated
   */
  void setPrimary(org.pklose.espl.esplm.Boolean value);

  /**
   * Returns the value of the '<em><b>Obligatorisch</b></em>' attribute.
   * The literals are from the enumeration {@link org.pklose.espl.esplm.Boolean}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Obligatorisch</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Obligatorisch</em>' attribute.
   * @see org.pklose.espl.esplm.Boolean
   * @see #setObligatorisch(org.pklose.espl.esplm.Boolean)
   * @see org.pklose.espl.esplm.EsplmPackage#getSystemEntityConfiguration_Obligatorisch()
   * @model
   * @generated
   */
  org.pklose.espl.esplm.Boolean getObligatorisch();

  /**
   * Sets the value of the '{@link org.pklose.espl.esplm.SystemEntityConfiguration#getObligatorisch <em>Obligatorisch</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Obligatorisch</em>' attribute.
   * @see org.pklose.espl.esplm.Boolean
   * @see #getObligatorisch()
   * @generated
   */
  void setObligatorisch(org.pklose.espl.esplm.Boolean value);

  /**
   * Returns the value of the '<em><b>Multiple</b></em>' attribute.
   * The literals are from the enumeration {@link org.pklose.espl.esplm.Boolean}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Multiple</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Multiple</em>' attribute.
   * @see org.pklose.espl.esplm.Boolean
   * @see #setMultiple(org.pklose.espl.esplm.Boolean)
   * @see org.pklose.espl.esplm.EsplmPackage#getSystemEntityConfiguration_Multiple()
   * @model
   * @generated
   */
  org.pklose.espl.esplm.Boolean getMultiple();

  /**
   * Sets the value of the '{@link org.pklose.espl.esplm.SystemEntityConfiguration#getMultiple <em>Multiple</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Multiple</em>' attribute.
   * @see org.pklose.espl.esplm.Boolean
   * @see #getMultiple()
   * @generated
   */
  void setMultiple(org.pklose.espl.esplm.Boolean value);

  /**
   * Returns the value of the '<em><b>Join Criteria</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Join Criteria</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Join Criteria</em>' attribute.
   * @see #setJoinCriteria(String)
   * @see org.pklose.espl.esplm.EsplmPackage#getSystemEntityConfiguration_JoinCriteria()
   * @model
   * @generated
   */
  String getJoinCriteria();

  /**
   * Sets the value of the '{@link org.pklose.espl.esplm.SystemEntityConfiguration#getJoinCriteria <em>Join Criteria</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Join Criteria</em>' attribute.
   * @see #getJoinCriteria()
   * @generated
   */
  void setJoinCriteria(String value);

} // SystemEntityConfiguration
