/**
 */
package com.github.fbrx.propertysl.propertySL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.github.fbrx.propertysl.propertySL.PropertySLFactory
 * @model kind="package"
 * @generated
 */
public interface PropertySLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "propertySL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.github.com/fbrx/propertysl/PropertySL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "propertySL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PropertySLPackage eINSTANCE = com.github.fbrx.propertysl.propertySL.impl.PropertySLPackageImpl.init();

  /**
   * The meta object id for the '{@link com.github.fbrx.propertysl.propertySL.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.fbrx.propertysl.propertySL.impl.ModelImpl
   * @see com.github.fbrx.propertysl.propertySL.impl.PropertySLPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Packages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PACKAGES = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.github.fbrx.propertysl.propertySL.impl.PackageImpl <em>Package</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.fbrx.propertysl.propertySL.impl.PackageImpl
   * @see com.github.fbrx.propertysl.propertySL.impl.PropertySLPackageImpl#getPackage()
   * @generated
   */
  int PACKAGE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__NAME = 0;

  /**
   * The feature id for the '<em><b>Supported Locales</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__SUPPORTED_LOCALES = 1;

  /**
   * The feature id for the '<em><b>Packages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__PACKAGES = 2;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__PROPERTIES = 3;

  /**
   * The number of structural features of the '<em>Package</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link com.github.fbrx.propertysl.propertySL.impl.SupportedLocalesImpl <em>Supported Locales</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.fbrx.propertysl.propertySL.impl.SupportedLocalesImpl
   * @see com.github.fbrx.propertysl.propertySL.impl.PropertySLPackageImpl#getSupportedLocales()
   * @generated
   */
  int SUPPORTED_LOCALES = 2;

  /**
   * The feature id for the '<em><b>Locales</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPPORTED_LOCALES__LOCALES = 0;

  /**
   * The number of structural features of the '<em>Supported Locales</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUPPORTED_LOCALES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.github.fbrx.propertysl.propertySL.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.fbrx.propertysl.propertySL.impl.PropertyImpl
   * @see com.github.fbrx.propertysl.propertySL.impl.PropertySLPackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 3;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__KEY = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__VALUE = 1;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.github.fbrx.propertysl.propertySL.impl.AbstractPropertyValueImpl <em>Abstract Property Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.fbrx.propertysl.propertySL.impl.AbstractPropertyValueImpl
   * @see com.github.fbrx.propertysl.propertySL.impl.PropertySLPackageImpl#getAbstractPropertyValue()
   * @generated
   */
  int ABSTRACT_PROPERTY_VALUE = 4;

  /**
   * The number of structural features of the '<em>Abstract Property Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_PROPERTY_VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.github.fbrx.propertysl.propertySL.impl.SimplePropertyValueImpl <em>Simple Property Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.fbrx.propertysl.propertySL.impl.SimplePropertyValueImpl
   * @see com.github.fbrx.propertysl.propertySL.impl.PropertySLPackageImpl#getSimplePropertyValue()
   * @generated
   */
  int SIMPLE_PROPERTY_VALUE = 5;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_PROPERTY_VALUE__VALUE = ABSTRACT_PROPERTY_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Simple Property Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_PROPERTY_VALUE_FEATURE_COUNT = ABSTRACT_PROPERTY_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.github.fbrx.propertysl.propertySL.impl.ComplexPropertyValueImpl <em>Complex Property Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.fbrx.propertysl.propertySL.impl.ComplexPropertyValueImpl
   * @see com.github.fbrx.propertysl.propertySL.impl.PropertySLPackageImpl#getComplexPropertyValue()
   * @generated
   */
  int COMPLEX_PROPERTY_VALUE = 6;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_PROPERTY_VALUE__ITEMS = ABSTRACT_PROPERTY_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Complex Property Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_PROPERTY_VALUE_FEATURE_COUNT = ABSTRACT_PROPERTY_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.github.fbrx.propertysl.propertySL.impl.ComplexPropertyValueItemImpl <em>Complex Property Value Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.fbrx.propertysl.propertySL.impl.ComplexPropertyValueItemImpl
   * @see com.github.fbrx.propertysl.propertySL.impl.PropertySLPackageImpl#getComplexPropertyValueItem()
   * @generated
   */
  int COMPLEX_PROPERTY_VALUE_ITEM = 7;

  /**
   * The feature id for the '<em><b>Lang</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_PROPERTY_VALUE_ITEM__LANG = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_PROPERTY_VALUE_ITEM__VALUE = 1;

  /**
   * The number of structural features of the '<em>Complex Property Value Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_PROPERTY_VALUE_ITEM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.github.fbrx.propertysl.propertySL.impl.DefaultableLocaleImpl <em>Defaultable Locale</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.fbrx.propertysl.propertySL.impl.DefaultableLocaleImpl
   * @see com.github.fbrx.propertysl.propertySL.impl.PropertySLPackageImpl#getDefaultableLocale()
   * @generated
   */
  int DEFAULTABLE_LOCALE = 8;

  /**
   * The feature id for the '<em><b>Is Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULTABLE_LOCALE__IS_DEFAULT = 0;

  /**
   * The feature id for the '<em><b>Lang</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULTABLE_LOCALE__LANG = 1;

  /**
   * The number of structural features of the '<em>Defaultable Locale</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULTABLE_LOCALE_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link com.github.fbrx.propertysl.propertySL.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see com.github.fbrx.propertysl.propertySL.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link com.github.fbrx.propertysl.propertySL.Model#getPackages <em>Packages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Packages</em>'.
   * @see com.github.fbrx.propertysl.propertySL.Model#getPackages()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Packages();

  /**
   * Returns the meta object for class '{@link com.github.fbrx.propertysl.propertySL.Package <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package</em>'.
   * @see com.github.fbrx.propertysl.propertySL.Package
   * @generated
   */
  EClass getPackage();

  /**
   * Returns the meta object for the attribute '{@link com.github.fbrx.propertysl.propertySL.Package#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.github.fbrx.propertysl.propertySL.Package#getName()
   * @see #getPackage()
   * @generated
   */
  EAttribute getPackage_Name();

  /**
   * Returns the meta object for the containment reference '{@link com.github.fbrx.propertysl.propertySL.Package#getSupportedLocales <em>Supported Locales</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Supported Locales</em>'.
   * @see com.github.fbrx.propertysl.propertySL.Package#getSupportedLocales()
   * @see #getPackage()
   * @generated
   */
  EReference getPackage_SupportedLocales();

  /**
   * Returns the meta object for the containment reference list '{@link com.github.fbrx.propertysl.propertySL.Package#getPackages <em>Packages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Packages</em>'.
   * @see com.github.fbrx.propertysl.propertySL.Package#getPackages()
   * @see #getPackage()
   * @generated
   */
  EReference getPackage_Packages();

  /**
   * Returns the meta object for the containment reference list '{@link com.github.fbrx.propertysl.propertySL.Package#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see com.github.fbrx.propertysl.propertySL.Package#getProperties()
   * @see #getPackage()
   * @generated
   */
  EReference getPackage_Properties();

  /**
   * Returns the meta object for class '{@link com.github.fbrx.propertysl.propertySL.SupportedLocales <em>Supported Locales</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Supported Locales</em>'.
   * @see com.github.fbrx.propertysl.propertySL.SupportedLocales
   * @generated
   */
  EClass getSupportedLocales();

  /**
   * Returns the meta object for the containment reference list '{@link com.github.fbrx.propertysl.propertySL.SupportedLocales#getLocales <em>Locales</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Locales</em>'.
   * @see com.github.fbrx.propertysl.propertySL.SupportedLocales#getLocales()
   * @see #getSupportedLocales()
   * @generated
   */
  EReference getSupportedLocales_Locales();

  /**
   * Returns the meta object for class '{@link com.github.fbrx.propertysl.propertySL.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see com.github.fbrx.propertysl.propertySL.Property
   * @generated
   */
  EClass getProperty();

  /**
   * Returns the meta object for the attribute '{@link com.github.fbrx.propertysl.propertySL.Property#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see com.github.fbrx.propertysl.propertySL.Property#getKey()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Key();

  /**
   * Returns the meta object for the containment reference '{@link com.github.fbrx.propertysl.propertySL.Property#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see com.github.fbrx.propertysl.propertySL.Property#getValue()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_Value();

  /**
   * Returns the meta object for class '{@link com.github.fbrx.propertysl.propertySL.AbstractPropertyValue <em>Abstract Property Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Property Value</em>'.
   * @see com.github.fbrx.propertysl.propertySL.AbstractPropertyValue
   * @generated
   */
  EClass getAbstractPropertyValue();

  /**
   * Returns the meta object for class '{@link com.github.fbrx.propertysl.propertySL.SimplePropertyValue <em>Simple Property Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Property Value</em>'.
   * @see com.github.fbrx.propertysl.propertySL.SimplePropertyValue
   * @generated
   */
  EClass getSimplePropertyValue();

  /**
   * Returns the meta object for the attribute '{@link com.github.fbrx.propertysl.propertySL.SimplePropertyValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.github.fbrx.propertysl.propertySL.SimplePropertyValue#getValue()
   * @see #getSimplePropertyValue()
   * @generated
   */
  EAttribute getSimplePropertyValue_Value();

  /**
   * Returns the meta object for class '{@link com.github.fbrx.propertysl.propertySL.ComplexPropertyValue <em>Complex Property Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Complex Property Value</em>'.
   * @see com.github.fbrx.propertysl.propertySL.ComplexPropertyValue
   * @generated
   */
  EClass getComplexPropertyValue();

  /**
   * Returns the meta object for the containment reference list '{@link com.github.fbrx.propertysl.propertySL.ComplexPropertyValue#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Items</em>'.
   * @see com.github.fbrx.propertysl.propertySL.ComplexPropertyValue#getItems()
   * @see #getComplexPropertyValue()
   * @generated
   */
  EReference getComplexPropertyValue_Items();

  /**
   * Returns the meta object for class '{@link com.github.fbrx.propertysl.propertySL.ComplexPropertyValueItem <em>Complex Property Value Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Complex Property Value Item</em>'.
   * @see com.github.fbrx.propertysl.propertySL.ComplexPropertyValueItem
   * @generated
   */
  EClass getComplexPropertyValueItem();

  /**
   * Returns the meta object for the attribute '{@link com.github.fbrx.propertysl.propertySL.ComplexPropertyValueItem#getLang <em>Lang</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lang</em>'.
   * @see com.github.fbrx.propertysl.propertySL.ComplexPropertyValueItem#getLang()
   * @see #getComplexPropertyValueItem()
   * @generated
   */
  EAttribute getComplexPropertyValueItem_Lang();

  /**
   * Returns the meta object for the containment reference '{@link com.github.fbrx.propertysl.propertySL.ComplexPropertyValueItem#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see com.github.fbrx.propertysl.propertySL.ComplexPropertyValueItem#getValue()
   * @see #getComplexPropertyValueItem()
   * @generated
   */
  EReference getComplexPropertyValueItem_Value();

  /**
   * Returns the meta object for class '{@link com.github.fbrx.propertysl.propertySL.DefaultableLocale <em>Defaultable Locale</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Defaultable Locale</em>'.
   * @see com.github.fbrx.propertysl.propertySL.DefaultableLocale
   * @generated
   */
  EClass getDefaultableLocale();

  /**
   * Returns the meta object for the attribute '{@link com.github.fbrx.propertysl.propertySL.DefaultableLocale#isIsDefault <em>Is Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Default</em>'.
   * @see com.github.fbrx.propertysl.propertySL.DefaultableLocale#isIsDefault()
   * @see #getDefaultableLocale()
   * @generated
   */
  EAttribute getDefaultableLocale_IsDefault();

  /**
   * Returns the meta object for the attribute '{@link com.github.fbrx.propertysl.propertySL.DefaultableLocale#getLang <em>Lang</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lang</em>'.
   * @see com.github.fbrx.propertysl.propertySL.DefaultableLocale#getLang()
   * @see #getDefaultableLocale()
   * @generated
   */
  EAttribute getDefaultableLocale_Lang();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PropertySLFactory getPropertySLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.github.fbrx.propertysl.propertySL.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.fbrx.propertysl.propertySL.impl.ModelImpl
     * @see com.github.fbrx.propertysl.propertySL.impl.PropertySLPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PACKAGES = eINSTANCE.getModel_Packages();

    /**
     * The meta object literal for the '{@link com.github.fbrx.propertysl.propertySL.impl.PackageImpl <em>Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.fbrx.propertysl.propertySL.impl.PackageImpl
     * @see com.github.fbrx.propertysl.propertySL.impl.PropertySLPackageImpl#getPackage()
     * @generated
     */
    EClass PACKAGE = eINSTANCE.getPackage();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE__NAME = eINSTANCE.getPackage_Name();

    /**
     * The meta object literal for the '<em><b>Supported Locales</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE__SUPPORTED_LOCALES = eINSTANCE.getPackage_SupportedLocales();

    /**
     * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE__PACKAGES = eINSTANCE.getPackage_Packages();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE__PROPERTIES = eINSTANCE.getPackage_Properties();

    /**
     * The meta object literal for the '{@link com.github.fbrx.propertysl.propertySL.impl.SupportedLocalesImpl <em>Supported Locales</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.fbrx.propertysl.propertySL.impl.SupportedLocalesImpl
     * @see com.github.fbrx.propertysl.propertySL.impl.PropertySLPackageImpl#getSupportedLocales()
     * @generated
     */
    EClass SUPPORTED_LOCALES = eINSTANCE.getSupportedLocales();

    /**
     * The meta object literal for the '<em><b>Locales</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUPPORTED_LOCALES__LOCALES = eINSTANCE.getSupportedLocales_Locales();

    /**
     * The meta object literal for the '{@link com.github.fbrx.propertysl.propertySL.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.fbrx.propertysl.propertySL.impl.PropertyImpl
     * @see com.github.fbrx.propertysl.propertySL.impl.PropertySLPackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__KEY = eINSTANCE.getProperty_Key();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__VALUE = eINSTANCE.getProperty_Value();

    /**
     * The meta object literal for the '{@link com.github.fbrx.propertysl.propertySL.impl.AbstractPropertyValueImpl <em>Abstract Property Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.fbrx.propertysl.propertySL.impl.AbstractPropertyValueImpl
     * @see com.github.fbrx.propertysl.propertySL.impl.PropertySLPackageImpl#getAbstractPropertyValue()
     * @generated
     */
    EClass ABSTRACT_PROPERTY_VALUE = eINSTANCE.getAbstractPropertyValue();

    /**
     * The meta object literal for the '{@link com.github.fbrx.propertysl.propertySL.impl.SimplePropertyValueImpl <em>Simple Property Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.fbrx.propertysl.propertySL.impl.SimplePropertyValueImpl
     * @see com.github.fbrx.propertysl.propertySL.impl.PropertySLPackageImpl#getSimplePropertyValue()
     * @generated
     */
    EClass SIMPLE_PROPERTY_VALUE = eINSTANCE.getSimplePropertyValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_PROPERTY_VALUE__VALUE = eINSTANCE.getSimplePropertyValue_Value();

    /**
     * The meta object literal for the '{@link com.github.fbrx.propertysl.propertySL.impl.ComplexPropertyValueImpl <em>Complex Property Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.fbrx.propertysl.propertySL.impl.ComplexPropertyValueImpl
     * @see com.github.fbrx.propertysl.propertySL.impl.PropertySLPackageImpl#getComplexPropertyValue()
     * @generated
     */
    EClass COMPLEX_PROPERTY_VALUE = eINSTANCE.getComplexPropertyValue();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPLEX_PROPERTY_VALUE__ITEMS = eINSTANCE.getComplexPropertyValue_Items();

    /**
     * The meta object literal for the '{@link com.github.fbrx.propertysl.propertySL.impl.ComplexPropertyValueItemImpl <em>Complex Property Value Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.fbrx.propertysl.propertySL.impl.ComplexPropertyValueItemImpl
     * @see com.github.fbrx.propertysl.propertySL.impl.PropertySLPackageImpl#getComplexPropertyValueItem()
     * @generated
     */
    EClass COMPLEX_PROPERTY_VALUE_ITEM = eINSTANCE.getComplexPropertyValueItem();

    /**
     * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPLEX_PROPERTY_VALUE_ITEM__LANG = eINSTANCE.getComplexPropertyValueItem_Lang();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPLEX_PROPERTY_VALUE_ITEM__VALUE = eINSTANCE.getComplexPropertyValueItem_Value();

    /**
     * The meta object literal for the '{@link com.github.fbrx.propertysl.propertySL.impl.DefaultableLocaleImpl <em>Defaultable Locale</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.fbrx.propertysl.propertySL.impl.DefaultableLocaleImpl
     * @see com.github.fbrx.propertysl.propertySL.impl.PropertySLPackageImpl#getDefaultableLocale()
     * @generated
     */
    EClass DEFAULTABLE_LOCALE = eINSTANCE.getDefaultableLocale();

    /**
     * The meta object literal for the '<em><b>Is Default</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEFAULTABLE_LOCALE__IS_DEFAULT = eINSTANCE.getDefaultableLocale_IsDefault();

    /**
     * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEFAULTABLE_LOCALE__LANG = eINSTANCE.getDefaultableLocale_Lang();

  }

} //PropertySLPackage
