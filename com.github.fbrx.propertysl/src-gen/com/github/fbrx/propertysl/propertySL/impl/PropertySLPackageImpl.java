/**
 */
package com.github.fbrx.propertysl.propertySL.impl;

import com.github.fbrx.propertysl.propertySL.Model;
import com.github.fbrx.propertysl.propertySL.PropertySLFactory;
import com.github.fbrx.propertysl.propertySL.PropertySLPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PropertySLPackageImpl extends EPackageImpl implements PropertySLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.github.fbrx.propertysl.propertySL.PropertySLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private PropertySLPackageImpl()
  {
    super(eNS_URI, PropertySLFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link PropertySLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static PropertySLPackage init()
  {
    if (isInited) return (PropertySLPackage)EPackage.Registry.INSTANCE.getEPackage(PropertySLPackage.eNS_URI);

    // Obtain or create and register package
    PropertySLPackageImpl thePropertySLPackage = (PropertySLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PropertySLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PropertySLPackageImpl());

    isInited = true;

    // Create package meta-data objects
    thePropertySLPackage.createPackageContents();

    // Initialize created meta-data
    thePropertySLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    thePropertySLPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(PropertySLPackage.eNS_URI, thePropertySLPackage);
    return thePropertySLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModel_Packages()
  {
    return (EAttribute)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertySLFactory getPropertySLFactory()
  {
    return (PropertySLFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEAttribute(modelEClass, MODEL__PACKAGES);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModel_Packages(), ecorePackage.getEString(), "packages", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //PropertySLPackageImpl
