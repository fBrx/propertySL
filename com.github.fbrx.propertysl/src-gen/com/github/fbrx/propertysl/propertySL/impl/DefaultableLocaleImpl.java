/**
 */
package com.github.fbrx.propertysl.propertySL.impl;

import com.github.fbrx.propertysl.propertySL.DefaultableLocale;
import com.github.fbrx.propertysl.propertySL.PropertySLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Defaultable Locale</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.fbrx.propertysl.propertySL.impl.DefaultableLocaleImpl#isIsDefault <em>Is Default</em>}</li>
 *   <li>{@link com.github.fbrx.propertysl.propertySL.impl.DefaultableLocaleImpl#getLang <em>Lang</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefaultableLocaleImpl extends MinimalEObjectImpl.Container implements DefaultableLocale
{
  /**
   * The default value of the '{@link #isIsDefault() <em>Is Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsDefault()
   * @generated
   * @ordered
   */
  protected static final boolean IS_DEFAULT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsDefault() <em>Is Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsDefault()
   * @generated
   * @ordered
   */
  protected boolean isDefault = IS_DEFAULT_EDEFAULT;

  /**
   * The default value of the '{@link #getLang() <em>Lang</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLang()
   * @generated
   * @ordered
   */
  protected static final String LANG_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLang() <em>Lang</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLang()
   * @generated
   * @ordered
   */
  protected String lang = LANG_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DefaultableLocaleImpl()
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
    return PropertySLPackage.Literals.DEFAULTABLE_LOCALE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsDefault()
  {
    return isDefault;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsDefault(boolean newIsDefault)
  {
    boolean oldIsDefault = isDefault;
    isDefault = newIsDefault;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PropertySLPackage.DEFAULTABLE_LOCALE__IS_DEFAULT, oldIsDefault, isDefault));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLang()
  {
    return lang;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLang(String newLang)
  {
    String oldLang = lang;
    lang = newLang;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PropertySLPackage.DEFAULTABLE_LOCALE__LANG, oldLang, lang));
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
      case PropertySLPackage.DEFAULTABLE_LOCALE__IS_DEFAULT:
        return isIsDefault();
      case PropertySLPackage.DEFAULTABLE_LOCALE__LANG:
        return getLang();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PropertySLPackage.DEFAULTABLE_LOCALE__IS_DEFAULT:
        setIsDefault((Boolean)newValue);
        return;
      case PropertySLPackage.DEFAULTABLE_LOCALE__LANG:
        setLang((String)newValue);
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
      case PropertySLPackage.DEFAULTABLE_LOCALE__IS_DEFAULT:
        setIsDefault(IS_DEFAULT_EDEFAULT);
        return;
      case PropertySLPackage.DEFAULTABLE_LOCALE__LANG:
        setLang(LANG_EDEFAULT);
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
      case PropertySLPackage.DEFAULTABLE_LOCALE__IS_DEFAULT:
        return isDefault != IS_DEFAULT_EDEFAULT;
      case PropertySLPackage.DEFAULTABLE_LOCALE__LANG:
        return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (isDefault: ");
    result.append(isDefault);
    result.append(", lang: ");
    result.append(lang);
    result.append(')');
    return result.toString();
  }

} //DefaultableLocaleImpl
