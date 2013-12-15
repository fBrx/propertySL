/**
 */
package com.github.fbrx.propertysl.propertySL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Property Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.fbrx.propertysl.propertySL.ComplexPropertyValue#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.fbrx.propertysl.propertySL.PropertySLPackage#getComplexPropertyValue()
 * @model
 * @generated
 */
public interface ComplexPropertyValue extends AbstractPropertyValue
{
  /**
   * Returns the value of the '<em><b>Items</b></em>' containment reference list.
   * The list contents are of type {@link com.github.fbrx.propertysl.propertySL.ComplexPropertyValueItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Items</em>' containment reference list.
   * @see com.github.fbrx.propertysl.propertySL.PropertySLPackage#getComplexPropertyValue_Items()
   * @model containment="true"
   * @generated
   */
  EList<ComplexPropertyValueItem> getItems();

} // ComplexPropertyValue
