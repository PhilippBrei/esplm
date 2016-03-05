/**
 */
package org.pklose.espl.esplm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pklose.espl.esplm.System#getSrcEntities <em>Src Entities</em>}</li>
 * </ul>
 *
 * @see org.pklose.espl.esplm.EsplmPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends Element
{
  /**
   * Returns the value of the '<em><b>Src Entities</b></em>' containment reference list.
   * The list contents are of type {@link org.pklose.espl.esplm.SystemEntity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Src Entities</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Src Entities</em>' containment reference list.
   * @see org.pklose.espl.esplm.EsplmPackage#getSystem_SrcEntities()
   * @model containment="true"
   * @generated
   */
  EList<SystemEntity> getSrcEntities();

} // System
