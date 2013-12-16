/**
 */
package com.github.fbrx.propertysl.propertySL.impl;

import com.github.fbrx.propertysl.propertySL.AbstractPropertyValue;
import com.github.fbrx.propertysl.propertySL.ComplexPropertyValue;
import com.github.fbrx.propertysl.propertySL.ComplexPropertyValueItem;
import com.github.fbrx.propertysl.propertySL.DefaultableLocale;
import com.github.fbrx.propertysl.propertySL.Model;
import com.github.fbrx.propertysl.propertySL.Property;
import com.github.fbrx.propertysl.propertySL.PropertySLFactory;
import com.github.fbrx.propertysl.propertySL.PropertySLPackage;
import com.github.fbrx.propertysl.propertySL.SimplePropertyValue;
import com.github.fbrx.propertysl.propertySL.SupportedLocales;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PropertySLFactoryImpl extends EFactoryImpl implements PropertySLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PropertySLFactory init()
  {
    try
    {
      PropertySLFactory thePropertySLFactory = (PropertySLFactory)EPackage.Registry.INSTANCE.getEFactory(PropertySLPackage.eNS_URI);
      if (thePropertySLFactory != null)
      {
        return thePropertySLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PropertySLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertySLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case PropertySLPackage.MODEL: return createModel();
      case PropertySLPackage.PACKAGE: return createPackage();
      case PropertySLPackage.SUPPORTED_LOCALES: return createSupportedLocales();
      case PropertySLPackage.PROPERTY: return createProperty();
      case PropertySLPackage.ABSTRACT_PROPERTY_VALUE: return createAbstractPropertyValue();
      case PropertySLPackage.SIMPLE_PROPERTY_VALUE: return createSimplePropertyValue();
      case PropertySLPackage.COMPLEX_PROPERTY_VALUE: return createComplexPropertyValue();
      case PropertySLPackage.COMPLEX_PROPERTY_VALUE_ITEM: return createComplexPropertyValueItem();
      case PropertySLPackage.DEFAULTABLE_LOCALE: return createDefaultableLocale();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public com.github.fbrx.propertysl.propertySL.Package createPackage()
  {
    PackageImpl package_ = new PackageImpl();
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SupportedLocales createSupportedLocales()
  {
    SupportedLocalesImpl supportedLocales = new SupportedLocalesImpl();
    return supportedLocales;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property createProperty()
  {
    PropertyImpl property = new PropertyImpl();
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractPropertyValue createAbstractPropertyValue()
  {
    AbstractPropertyValueImpl abstractPropertyValue = new AbstractPropertyValueImpl();
    return abstractPropertyValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimplePropertyValue createSimplePropertyValue()
  {
    SimplePropertyValueImpl simplePropertyValue = new SimplePropertyValueImpl();
    return simplePropertyValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexPropertyValue createComplexPropertyValue()
  {
    ComplexPropertyValueImpl complexPropertyValue = new ComplexPropertyValueImpl();
    return complexPropertyValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexPropertyValueItem createComplexPropertyValueItem()
  {
    ComplexPropertyValueItemImpl complexPropertyValueItem = new ComplexPropertyValueItemImpl();
    return complexPropertyValueItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefaultableLocale createDefaultableLocale()
  {
    DefaultableLocaleImpl defaultableLocale = new DefaultableLocaleImpl();
    return defaultableLocale;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertySLPackage getPropertySLPackage()
  {
    return (PropertySLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PropertySLPackage getPackage()
  {
    return PropertySLPackage.eINSTANCE;
  }

} //PropertySLFactoryImpl
