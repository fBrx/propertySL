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
   * Returns the value of the '<em><b>Locales</b></em>' containment reference list.
   * The list contents are of type {@link com.github.fbrx.propertysl.propertySL.DefaultableLocale}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Locales</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Locales</em>' containment reference list.
   * @see com.github.fbrx.propertysl.propertySL.PropertySLPackage#getSupportedLocales_Locales()
   * @model containment="true"
   * @generated
   */
  EList<DefaultableLocale> getLocales();

} // SupportedLocales
