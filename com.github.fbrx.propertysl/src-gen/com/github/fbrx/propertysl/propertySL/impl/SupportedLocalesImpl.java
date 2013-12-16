/**
 */
package com.github.fbrx.propertysl.propertySL.impl;

import com.github.fbrx.propertysl.propertySL.DefaultableLocale;
import com.github.fbrx.propertysl.propertySL.PropertySLPackage;
import com.github.fbrx.propertysl.propertySL.SupportedLocales;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Supported Locales</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.fbrx.propertysl.propertySL.impl.SupportedLocalesImpl#getLocales <em>Locales</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SupportedLocalesImpl extends MinimalEObjectImpl.Container implements SupportedLocales
{
  /**
   * The cached value of the '{@link #getLocales() <em>Locales</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocales()
   * @generated
   * @ordered
   */
  protected EList<DefaultableLocale> locales;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SupportedLocalesImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PropertySLPackage.Literals.SUPPORTED_LOCALES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DefaultableLocale> getLocales()
  {
    if (locales == null)
    {
      locales = new EObjectContainmentEList<DefaultableLocale>(DefaultableLocale.class, this, PropertySLPackage.SUPPORTED_LOCALES__LOCALES);
    }
    return locales;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PropertySLPackage.SUPPORTED_LOCALES__LOCALES:
        return ((InternalEList<?>)getLocales()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PropertySLPackage.SUPPORTED_LOCALES__LOCALES:
        return getLocales();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PropertySLPackage.SUPPORTED_LOCALES__LOCALES:
        getLocales().clear();
        getLocales().addAll((Collection<? extends DefaultableLocale>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PropertySLPackage.SUPPORTED_LOCALES__LOCALES:
        getLocales().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PropertySLPackage.SUPPORTED_LOCALES__LOCALES:
        return locales != null && !locales.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SupportedLocalesImpl
