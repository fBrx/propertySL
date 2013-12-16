/**
 */
package com.github.fbrx.propertysl.propertySL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Defaultable Locale</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.fbrx.propertysl.propertySL.DefaultableLocale#isIsDefault <em>Is Default</em>}</li>
 *   <li>{@link com.github.fbrx.propertysl.propertySL.DefaultableLocale#getLang <em>Lang</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.fbrx.propertysl.propertySL.PropertySLPackage#getDefaultableLocale()
 * @model
 * @generated
 */
public interface DefaultableLocale extends EObject
{
  /**
   * Returns the value of the '<em><b>Is Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Default</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Default</em>' attribute.
   * @see #setIsDefault(boolean)
   * @see com.github.fbrx.propertysl.propertySL.PropertySLPackage#getDefaultableLocale_IsDefault()
   * @model
   * @generated
   */
  boolean isIsDefault();

  /**
   * Sets the value of the '{@link com.github.fbrx.propertysl.propertySL.DefaultableLocale#isIsDefault <em>Is Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Default</em>' attribute.
   * @see #isIsDefault()
   * @generated
   */
  void setIsDefault(boolean value);

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
   * @see com.github.fbrx.propertysl.propertySL.PropertySLPackage#getDefaultableLocale_Lang()
   * @model
   * @generated
   */
  String getLang();

  /**
   * Sets the value of the '{@link com.github.fbrx.propertysl.propertySL.DefaultableLocale#getLang <em>Lang</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lang</em>' attribute.
   * @see #getLang()
   * @generated
   */
  void setLang(String value);

} // DefaultableLocale
