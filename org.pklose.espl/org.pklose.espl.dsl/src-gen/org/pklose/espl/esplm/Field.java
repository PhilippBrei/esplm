/**
 */
package org.pklose.espl.esplm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pklose.espl.esplm.Field#getLiteral <em>Literal</em>}</li>
 * </ul>
 *
 * @see org.pklose.espl.esplm.EsplmPackage#getField()
 * @model
 * @generated
 */
public interface Field extends Property
{
  /**
   * Returns the value of the '<em><b>Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Literal</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Literal</em>' containment reference.
   * @see #setLiteral(Literal)
   * @see org.pklose.espl.esplm.EsplmPackage#getField_Literal()
   * @model containment="true"
   * @generated
   */
  Literal getLiteral();

  /**
   * Sets the value of the '{@link org.pklose.espl.esplm.Field#getLiteral <em>Literal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Literal</em>' containment reference.
   * @see #getLiteral()
   * @generated
   */
  void setLiteral(Literal value);

} // Field
