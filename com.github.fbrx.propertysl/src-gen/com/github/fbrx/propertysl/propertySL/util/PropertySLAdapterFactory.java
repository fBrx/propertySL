/**
 */
package com.github.fbrx.propertysl.propertySL.util;

import com.github.fbrx.propertysl.propertySL.AbstractPropertyValue;
import com.github.fbrx.propertysl.propertySL.ComplexPropertyValue;
import com.github.fbrx.propertysl.propertySL.ComplexPropertyValueItem;
import com.github.fbrx.propertysl.propertySL.DefaultLocale;
import com.github.fbrx.propertysl.propertySL.Model;
import com.github.fbrx.propertysl.propertySL.Property;
import com.github.fbrx.propertysl.propertySL.PropertySLPackage;
import com.github.fbrx.propertysl.propertySL.SimplePropertyValue;
import com.github.fbrx.propertysl.propertySL.SupportedLocales;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.github.fbrx.propertysl.propertySL.PropertySLPackage
 * @generated
 */
public class PropertySLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PropertySLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertySLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = PropertySLPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PropertySLSwitch<Adapter> modelSwitch =
    new PropertySLSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter casePackage(com.github.fbrx.propertysl.propertySL.Package object)
      {
        return createPackageAdapter();
      }
      @Override
      public Adapter caseSupportedLocales(SupportedLocales object)
      {
        return createSupportedLocalesAdapter();
      }
      @Override
      public Adapter caseProperty(Property object)
      {
        return createPropertyAdapter();
      }
      @Override
      public Adapter caseAbstractPropertyValue(AbstractPropertyValue object)
      {
        return createAbstractPropertyValueAdapter();
      }
      @Override
      public Adapter caseSimplePropertyValue(SimplePropertyValue object)
      {
        return createSimplePropertyValueAdapter();
      }
      @Override
      public Adapter caseComplexPropertyValue(ComplexPropertyValue object)
      {
        return createComplexPropertyValueAdapter();
      }
      @Override
      public Adapter caseComplexPropertyValueItem(ComplexPropertyValueItem object)
      {
        return createComplexPropertyValueItemAdapter();
      }
      @Override
      public Adapter caseDefaultLocale(DefaultLocale object)
      {
        return createDefaultLocaleAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link com.github.fbrx.propertysl.propertySL.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.fbrx.propertysl.propertySL.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.fbrx.propertysl.propertySL.Package <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.fbrx.propertysl.propertySL.Package
   * @generated
   */
  public Adapter createPackageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.fbrx.propertysl.propertySL.SupportedLocales <em>Supported Locales</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.fbrx.propertysl.propertySL.SupportedLocales
   * @generated
   */
  public Adapter createSupportedLocalesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.fbrx.propertysl.propertySL.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.fbrx.propertysl.propertySL.Property
   * @generated
   */
  public Adapter createPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.fbrx.propertysl.propertySL.AbstractPropertyValue <em>Abstract Property Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.fbrx.propertysl.propertySL.AbstractPropertyValue
   * @generated
   */
  public Adapter createAbstractPropertyValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.fbrx.propertysl.propertySL.SimplePropertyValue <em>Simple Property Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.fbrx.propertysl.propertySL.SimplePropertyValue
   * @generated
   */
  public Adapter createSimplePropertyValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.fbrx.propertysl.propertySL.ComplexPropertyValue <em>Complex Property Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.fbrx.propertysl.propertySL.ComplexPropertyValue
   * @generated
   */
  public Adapter createComplexPropertyValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.fbrx.propertysl.propertySL.ComplexPropertyValueItem <em>Complex Property Value Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.fbrx.propertysl.propertySL.ComplexPropertyValueItem
   * @generated
   */
  public Adapter createComplexPropertyValueItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.fbrx.propertysl.propertySL.DefaultLocale <em>Default Locale</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.fbrx.propertysl.propertySL.DefaultLocale
   * @generated
   */
  public Adapter createDefaultLocaleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //PropertySLAdapterFactory
