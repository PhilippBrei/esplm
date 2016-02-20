/**
 */
package org.pklose.espl.esplm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pklose.espl.esplm.Enum#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.pklose.espl.esplm.EsplmPackage#getEnum()
 * @model
 * @generated
 */
public interface Enum extends Literal
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
   * @see #setType(EnumDeclaration)
   * @see org.pklose.espl.esplm.EsplmPackage#getEnum_Type()
   * @model
   * @generated
   */
  EnumDeclaration getType();

  /**
   * Sets the value of the '{@link org.pklose.espl.esplm.Enum#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(EnumDeclaration value);

} // Enum
