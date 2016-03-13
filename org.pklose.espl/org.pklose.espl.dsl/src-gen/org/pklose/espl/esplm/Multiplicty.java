/**
 */
package org.pklose.espl.esplm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Multiplicty</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.pklose.espl.esplm.EsplmPackage#getMultiplicty()
 * @model
 * @generated
 */
public enum Multiplicty implements Enumerator
{
  /**
   * The '<em><b>One To Many</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ONE_TO_MANY_VALUE
   * @generated
   * @ordered
   */
  ONE_TO_MANY(0, "OneToMany", "1..N"),

  /**
   * The '<em><b>Zero To Many</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ZERO_TO_MANY_VALUE
   * @generated
   * @ordered
   */
  ZERO_TO_MANY(1, "ZeroToMany", "0..N"),

  /**
   * The '<em><b>One To One</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ONE_TO_ONE_VALUE
   * @generated
   * @ordered
   */
  ONE_TO_ONE(2, "OneToOne", "1..1"),

  /**
   * The '<em><b>Zero To One</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ZERO_TO_ONE_VALUE
   * @generated
   * @ordered
   */
  ZERO_TO_ONE(3, "ZeroToOne", "0..1");

  /**
   * The '<em><b>One To Many</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>One To Many</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ONE_TO_MANY
   * @model name="OneToMany" literal="1..N"
   * @generated
   * @ordered
   */
  public static final int ONE_TO_MANY_VALUE = 0;

  /**
   * The '<em><b>Zero To Many</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Zero To Many</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ZERO_TO_MANY
   * @model name="ZeroToMany" literal="0..N"
   * @generated
   * @ordered
   */
  public static final int ZERO_TO_MANY_VALUE = 1;

  /**
   * The '<em><b>One To One</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>One To One</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ONE_TO_ONE
   * @model name="OneToOne" literal="1..1"
   * @generated
   * @ordered
   */
  public static final int ONE_TO_ONE_VALUE = 2;

  /**
   * The '<em><b>Zero To One</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Zero To One</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ZERO_TO_ONE
   * @model name="ZeroToOne" literal="0..1"
   * @generated
   * @ordered
   */
  public static final int ZERO_TO_ONE_VALUE = 3;

  /**
   * An array of all the '<em><b>Multiplicty</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Multiplicty[] VALUES_ARRAY =
    new Multiplicty[]
    {
      ONE_TO_MANY,
      ZERO_TO_MANY,
      ONE_TO_ONE,
      ZERO_TO_ONE,
    };

  /**
   * A public read-only list of all the '<em><b>Multiplicty</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Multiplicty> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Multiplicty</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Multiplicty get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Multiplicty result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Multiplicty</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Multiplicty getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Multiplicty result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Multiplicty</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Multiplicty get(int value)
  {
    switch (value)
    {
      case ONE_TO_MANY_VALUE: return ONE_TO_MANY;
      case ZERO_TO_MANY_VALUE: return ZERO_TO_MANY;
      case ONE_TO_ONE_VALUE: return ONE_TO_ONE;
      case ZERO_TO_ONE_VALUE: return ZERO_TO_ONE;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private Multiplicty(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //Multiplicty
