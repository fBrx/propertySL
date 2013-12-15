/**
 */
package com.github.fbrx.propertysl.propertySL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supported Locales</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.fbrx.propertysl.propertySL.SupportedLocales#getLocales <em>Locales</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.fbrx.propertysl.propertySL.PropertySLPackage#getSupportedLocales()
 * @model
 * @generated
 */
public interface SupportedLocales extends EObject
{
  /**
   * Returns the value of the '<em><b>Locales</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Locales</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Locales</em>' attribute list.
   * @see com.github.fbrx.propertysl.propertySL.PropertySLPackage#getSupportedLocales_Locales()
   * @model unique="false"
   * @generated
   */
  EList<String> getLocales();

} // SupportedLocales
