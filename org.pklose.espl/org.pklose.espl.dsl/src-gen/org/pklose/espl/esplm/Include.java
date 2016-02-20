/**
 */
package org.pklose.espl.esplm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Include</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pklose.espl.esplm.Include#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.pklose.espl.esplm.Include#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see org.pklose.espl.esplm.EsplmPackage#getInclude()
 * @model
 * @generated
 */
public interface Include extends EObject
{
  /**
   * Returns the value of the '<em><b>Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entity</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity</em>' reference.
   * @see #setEntity(Entity)
   * @see org.pklose.espl.esplm.EsplmPackage#getInclude_Entity()
   * @model
   * @generated
   */
  Entity getEntity();

  /**
   * Sets the value of the '{@link org.pklose.espl.esplm.Include#getEntity <em>Entity</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entity</em>' reference.
   * @see #getEntity()
   * @generated
   */
  void setEntity(Entity value);

  /**
   * Returns the value of the '<em><b>Fields</b></em>' reference list.
   * The list contents are of type {@link org.pklose.espl.esplm.Property}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fields</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' reference list.
   * @see org.pklose.espl.esplm.EsplmPackage#getInclude_Fields()
   * @model
   * @generated
   */
  EList<Property> getFields();

} // Include
