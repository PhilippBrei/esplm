/**
 */
package org.pklose.espl.esplm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pklose.espl.esplm.SystemEntity#getName <em>Name</em>}</li>
 *   <li>{@link org.pklose.espl.esplm.SystemEntity#getFormat <em>Format</em>}</li>
 * </ul>
 *
 * @see org.pklose.espl.esplm.EsplmPackage#getSystemEntity()
 * @model
 * @generated
 */
public interface SystemEntity extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.pklose.espl.esplm.EsplmPackage#getSystemEntity_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.pklose.espl.esplm.SystemEntity#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Format</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Format</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Format</em>' attribute.
   * @see #setFormat(String)
   * @see org.pklose.espl.esplm.EsplmPackage#getSystemEntity_Format()
   * @model
   * @generated
   */
  String getFormat();

  /**
   * Sets the value of the '{@link org.pklose.espl.esplm.SystemEntity#getFormat <em>Format</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Format</em>' attribute.
   * @see #getFormat()
   * @generated
   */
  void setFormat(String value);

} // SystemEntity
