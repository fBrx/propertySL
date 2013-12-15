/**
 */
package com.github.fbrx.propertysl.propertySL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.fbrx.propertysl.propertySL.Package#getName <em>Name</em>}</li>
 *   <li>{@link com.github.fbrx.propertysl.propertySL.Package#getSupportedLocales <em>Supported Locales</em>}</li>
 *   <li>{@link com.github.fbrx.propertysl.propertySL.Package#getDefaultLocale <em>Default Locale</em>}</li>
 *   <li>{@link com.github.fbrx.propertysl.propertySL.Package#getPackages <em>Packages</em>}</li>
 *   <li>{@link com.github.fbrx.propertysl.propertySL.Package#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.fbrx.propertysl.propertySL.PropertySLPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.github.fbrx.propertysl.propertySL.PropertySLPackage#getPackage_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.github.fbrx.propertysl.propertySL.Package#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Supported Locales</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Supported Locales</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Supported Locales</em>' containment reference.
   * @see #setSupportedLocales(SupportedLocales)
   * @see com.github.fbrx.propertysl.propertySL.PropertySLPackage#getPackage_SupportedLocales()
   * @model containment="true"
   * @generated
   */
  SupportedLocales getSupportedLocales();

  /**
   * Sets the value of the '{@link com.github.fbrx.propertysl.propertySL.Package#getSupportedLocales <em>Supported Locales</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Supported Locales</em>' containment reference.
   * @see #getSupportedLocales()
   * @generated
   */
  void setSupportedLocales(SupportedLocales value);

  /**
   * Returns the value of the '<em><b>Default Locale</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Locale</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Locale</em>' containment reference.
   * @see #setDefaultLocale(DefaultLocale)
   * @see com.github.fbrx.propertysl.propertySL.PropertySLPackage#getPackage_DefaultLocale()
   * @model containment="true"
   * @generated
   */
  DefaultLocale getDefaultLocale();

  /**
   * Sets the value of the '{@link com.github.fbrx.propertysl.propertySL.Package#getDefaultLocale <em>Default Locale</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Locale</em>' containment reference.
   * @see #getDefaultLocale()
   * @generated
   */
  void setDefaultLocale(DefaultLocale value);

  /**
   * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
   * The list contents are of type {@link com.github.fbrx.propertysl.propertySL.Package}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Packages</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Packages</em>' containment reference list.
   * @see com.github.fbrx.propertysl.propertySL.PropertySLPackage#getPackage_Packages()
   * @model containment="true"
   * @generated
   */
  EList<Package> getPackages();

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link com.github.fbrx.propertysl.propertySL.Property}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see com.github.fbrx.propertysl.propertySL.PropertySLPackage#getPackage_Properties()
   * @model containment="true"
   * @generated
   */
  EList<Property> getProperties();

} // Package
