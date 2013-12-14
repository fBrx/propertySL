/**
 */
package com.github.fbrx.propertysl.propertySL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
   * The feature id for the '<em><b>Packages</b></em>' attribute list.
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
   * Returns the meta object for class '{@link com.github.fbrx.propertysl.propertySL.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see com.github.fbrx.propertysl.propertySL.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the attribute list '{@link com.github.fbrx.propertysl.propertySL.Model#getPackages <em>Packages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Packages</em>'.
   * @see com.github.fbrx.propertysl.propertySL.Model#getPackages()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_Packages();

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
     * The meta object literal for the '<em><b>Packages</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__PACKAGES = eINSTANCE.getModel_Packages();

  }

} //PropertySLPackage
