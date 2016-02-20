/**
 */
package org.pklose.espl.esplm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pklose.espl.esplm.Association#getType <em>Type</em>}</li>
 *   <li>{@link org.pklose.espl.esplm.Association#getMultiplicity <em>Multiplicity</em>}</li>
 * </ul>
 *
 * @see org.pklose.espl.esplm.EsplmPackage#getAssociation()
 * @model
 * @generated
 */
public interface Association extends Property
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(Entity)
   * @see org.pklose.espl.esplm.EsplmPackage#getAssociation_Type()
   * @model
   * @generated
   */
  Entity getType();

  /**
   * Sets the value of the '{@link org.pklose.espl.esplm.Association#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(Entity value);

  /**
   * Returns the value of the '<em><b>Multiplicity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Multiplicity</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Multiplicity</em>' containment reference.
   * @see #setMultiplicity(Multiplicty)
   * @see org.pklose.espl.esplm.EsplmPackage#getAssociation_Multiplicity()
   * @model containment="true"
   * @generated
   */
  Multiplicty getMultiplicity();

  /**
   * Sets the value of the '{@link org.pklose.espl.esplm.Association#getMultiplicity <em>Multiplicity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Multiplicity</em>' containment reference.
   * @see #getMultiplicity()
   * @generated
   */
  void setMultiplicity(Multiplicty value);

} // Association
