/**
 */
package org.pklose.espl.esplm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pklose.espl.esplm.EntityConfiguration#isPrimary <em>Primary</em>}</li>
 *   <li>{@link org.pklose.espl.esplm.EntityConfiguration#isObligatory <em>Obligatory</em>}</li>
 *   <li>{@link org.pklose.espl.esplm.EntityConfiguration#isMultiple <em>Multiple</em>}</li>
 * </ul>
 *
 * @see org.pklose.espl.esplm.EsplmPackage#getEntityConfiguration()
 * @model
 * @generated
 */
public interface EntityConfiguration extends EObject
{
  /**
   * Returns the value of the '<em><b>Primary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Primary</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Primary</em>' attribute.
   * @see #setPrimary(boolean)
   * @see org.pklose.espl.esplm.EsplmPackage#getEntityConfiguration_Primary()
   * @model
   * @generated
   */
  boolean isPrimary();

  /**
   * Sets the value of the '{@link org.pklose.espl.esplm.EntityConfiguration#isPrimary <em>Primary</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Primary</em>' attribute.
   * @see #isPrimary()
   * @generated
   */
  void setPrimary(boolean value);

  /**
   * Returns the value of the '<em><b>Obligatory</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Obligatory</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Obligatory</em>' attribute.
   * @see #setObligatory(boolean)
   * @see org.pklose.espl.esplm.EsplmPackage#getEntityConfiguration_Obligatory()
   * @model
   * @generated
   */
  boolean isObligatory();

  /**
   * Sets the value of the '{@link org.pklose.espl.esplm.EntityConfiguration#isObligatory <em>Obligatory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Obligatory</em>' attribute.
   * @see #isObligatory()
   * @generated
   */
  void setObligatory(boolean value);

  /**
   * Returns the value of the '<em><b>Multiple</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Multiple</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Multiple</em>' attribute.
   * @see #setMultiple(boolean)
   * @see org.pklose.espl.esplm.EsplmPackage#getEntityConfiguration_Multiple()
   * @model
   * @generated
   */
  boolean isMultiple();

  /**
   * Sets the value of the '{@link org.pklose.espl.esplm.EntityConfiguration#isMultiple <em>Multiple</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Multiple</em>' attribute.
   * @see #isMultiple()
   * @generated
   */
  void setMultiple(boolean value);

} // EntityConfiguration
