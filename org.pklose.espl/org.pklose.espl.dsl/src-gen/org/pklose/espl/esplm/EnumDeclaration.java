/**
 */
package org.pklose.espl.esplm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.pklose.espl.esplm.EnumDeclaration#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see org.pklose.espl.esplm.EsplmPackage#getEnumDeclaration()
 * @model
 * @generated
 */
public interface EnumDeclaration extends Element
{
  /**
   * Returns the value of the '<em><b>Values</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' attribute list.
   * @see org.pklose.espl.esplm.EsplmPackage#getEnumDeclaration_Values()
   * @model unique="false"
   * @generated
   */
  EList<String> getValues();

} // EnumDeclaration
