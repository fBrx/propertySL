/**
 */
package com.github.fbrx.propertysl.propertySL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Property Value Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.fbrx.propertysl.propertySL.ComplexPropertyValueItem#getLang <em>Lang</em>}</li>
 *   <li>{@link com.github.fbrx.propertysl.propertySL.ComplexPropertyValueItem#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.fbrx.propertysl.propertySL.PropertySLPackage#getComplexPropertyValueItem()
 * @model
 * @generated
 */
public interface ComplexPropertyValueItem extends EObject
{
  /**
   * Returns the value of the '<em><b>Lang</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lang</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lang</em>' attribute.
   * @see #setLang(String)
   * @see com.github.fbrx.propertysl.propertySL.PropertySLPackage#getComplexPropertyValueItem_Lang()
   * @model
   * @generated
   */
  String getLang();

  /**
   * Sets the value of the '{@link com.github.fbrx.propertysl.propertySL.ComplexPropertyValueItem#getLang <em>Lang</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lang</em>' attribute.
   * @see #getLang()
   * @generated
   */
  void setLang(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(SimplePropertyValue)
   * @see com.github.fbrx.propertysl.propertySL.PropertySLPackage#getComplexPropertyValueItem_Value()
   * @model containment="true"
   * @generated
   */
  SimplePropertyValue getValue();

  /**
   * Sets the value of the '{@link com.github.fbrx.propertysl.propertySL.ComplexPropertyValueItem#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(SimplePropertyValue value);

} // ComplexPropertyValueItem
