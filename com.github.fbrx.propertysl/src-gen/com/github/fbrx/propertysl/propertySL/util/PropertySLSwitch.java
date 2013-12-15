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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.github.fbrx.propertysl.propertySL.PropertySLPackage
 * @generated
 */
public class PropertySLSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PropertySLPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertySLSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = PropertySLPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case PropertySLPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PropertySLPackage.PACKAGE:
      {
        com.github.fbrx.propertysl.propertySL.Package package_ = (com.github.fbrx.propertysl.propertySL.Package)theEObject;
        T result = casePackage(package_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PropertySLPackage.SUPPORTED_LOCALES:
      {
        SupportedLocales supportedLocales = (SupportedLocales)theEObject;
        T result = caseSupportedLocales(supportedLocales);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PropertySLPackage.PROPERTY:
      {
        Property property = (Property)theEObject;
        T result = caseProperty(property);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PropertySLPackage.ABSTRACT_PROPERTY_VALUE:
      {
        AbstractPropertyValue abstractPropertyValue = (AbstractPropertyValue)theEObject;
        T result = caseAbstractPropertyValue(abstractPropertyValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PropertySLPackage.SIMPLE_PROPERTY_VALUE:
      {
        SimplePropertyValue simplePropertyValue = (SimplePropertyValue)theEObject;
        T result = caseSimplePropertyValue(simplePropertyValue);
        if (result == null) result = caseAbstractPropertyValue(simplePropertyValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PropertySLPackage.COMPLEX_PROPERTY_VALUE:
      {
        ComplexPropertyValue complexPropertyValue = (ComplexPropertyValue)theEObject;
        T result = caseComplexPropertyValue(complexPropertyValue);
        if (result == null) result = caseAbstractPropertyValue(complexPropertyValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PropertySLPackage.COMPLEX_PROPERTY_VALUE_ITEM:
      {
        ComplexPropertyValueItem complexPropertyValueItem = (ComplexPropertyValueItem)theEObject;
        T result = caseComplexPropertyValueItem(complexPropertyValueItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PropertySLPackage.DEFAULT_LOCALE:
      {
        DefaultLocale defaultLocale = (DefaultLocale)theEObject;
        T result = caseDefaultLocale(defaultLocale);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Package</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackage(com.github.fbrx.propertysl.propertySL.Package object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Supported Locales</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Supported Locales</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSupportedLocales(SupportedLocales object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProperty(Property object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Property Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Property Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractPropertyValue(AbstractPropertyValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Property Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Property Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimplePropertyValue(SimplePropertyValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Complex Property Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Complex Property Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComplexPropertyValue(ComplexPropertyValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Complex Property Value Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Complex Property Value Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComplexPropertyValueItem(ComplexPropertyValueItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Default Locale</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Default Locale</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefaultLocale(DefaultLocale object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //PropertySLSwitch
