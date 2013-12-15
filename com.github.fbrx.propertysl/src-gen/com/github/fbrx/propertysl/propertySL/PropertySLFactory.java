/**
 */
package com.github.fbrx.propertysl.propertySL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.github.fbrx.propertysl.propertySL.PropertySLPackage
 * @generated
 */
public interface PropertySLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PropertySLFactory eINSTANCE = com.github.fbrx.propertysl.propertySL.impl.PropertySLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Package</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Package</em>'.
   * @generated
   */
  Package createPackage();

  /**
   * Returns a new object of class '<em>Supported Locales</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Supported Locales</em>'.
   * @generated
   */
  SupportedLocales createSupportedLocales();

  /**
   * Returns a new object of class '<em>Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property</em>'.
   * @generated
   */
  Property createProperty();

  /**
   * Returns a new object of class '<em>Abstract Property Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Property Value</em>'.
   * @generated
   */
  AbstractPropertyValue createAbstractPropertyValue();

  /**
   * Returns a new object of class '<em>Simple Property Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Property Value</em>'.
   * @generated
   */
  SimplePropertyValue createSimplePropertyValue();

  /**
   * Returns a new object of class '<em>Complex Property Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Complex Property Value</em>'.
   * @generated
   */
  ComplexPropertyValue createComplexPropertyValue();

  /**
   * Returns a new object of class '<em>Complex Property Value Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Complex Property Value Item</em>'.
   * @generated
   */
  ComplexPropertyValueItem createComplexPropertyValueItem();

  /**
   * Returns a new object of class '<em>Default Locale</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Default Locale</em>'.
   * @generated
   */
  DefaultLocale createDefaultLocale();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  PropertySLPackage getPropertySLPackage();

} //PropertySLFactory
