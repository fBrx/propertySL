/**
 */
package com.github.fbrx.propertysl.propertySL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.fbrx.propertysl.propertySL.Property#getKey <em>Key</em>}</li>
 *   <li>{@link com.github.fbrx.propertysl.propertySL.Property#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.fbrx.propertysl.propertySL.PropertySLPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends EObject
{
  /**
   * Returns the value of the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Key</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key</em>' attribute.
   * @see #setKey(String)
   * @see com.github.fbrx.propertysl.propertySL.PropertySLPackage#getProperty_Key()
   * @model
   * @generated
   */
  String getKey();

  /**
   * Sets the value of the '{@link com.github.fbrx.propertysl.propertySL.Property#getKey <em>Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key</em>' attribute.
   * @see #getKey()
   * @generated
   */
  void setKey(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(AbstractPropertyValue)
   * @see com.github.fbrx.propertysl.propertySL.PropertySLPackage#getProperty_Value()
   * @model containment="true"
   * @generated
   */
  AbstractPropertyValue getValue();

  /**
   * Sets the value of the '{@link com.github.fbrx.propertysl.propertySL.Property#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(AbstractPropertyValue value);

} // Property
