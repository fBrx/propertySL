/**
 */
package com.github.fbrx.propertysl.propertySL.impl;

import com.github.fbrx.propertysl.propertySL.DefaultLocale;
import com.github.fbrx.propertysl.propertySL.Property;
import com.github.fbrx.propertysl.propertySL.PropertySLPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.fbrx.propertysl.propertySL.impl.PackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.github.fbrx.propertysl.propertySL.impl.PackageImpl#getDefaultLocale <em>Default Locale</em>}</li>
 *   <li>{@link com.github.fbrx.propertysl.propertySL.impl.PackageImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link com.github.fbrx.propertysl.propertySL.impl.PackageImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageImpl extends MinimalEObjectImpl.Container implements com.github.fbrx.propertysl.propertySL.Package
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getDefaultLocale() <em>Default Locale</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultLocale()
   * @generated
   * @ordered
   */
  protected DefaultLocale defaultLocale;

  /**
   * The cached value of the '{@link #getPackages() <em>Packages</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackages()
   * @generated
   * @ordered
   */
  protected EList<com.github.fbrx.propertysl.propertySL.Package> packages;

  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EList<Property> properties;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PackageImpl()
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
    return PropertySLPackage.Literals.PACKAGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PropertySLPackage.PACKAGE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefaultLocale getDefaultLocale()
  {
    return defaultLocale;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDefaultLocale(DefaultLocale newDefaultLocale, NotificationChain msgs)
  {
    DefaultLocale oldDefaultLocale = defaultLocale;
    defaultLocale = newDefaultLocale;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PropertySLPackage.PACKAGE__DEFAULT_LOCALE, oldDefaultLocale, newDefaultLocale);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefaultLocale(DefaultLocale newDefaultLocale)
  {
    if (newDefaultLocale != defaultLocale)
    {
      NotificationChain msgs = null;
      if (defaultLocale != null)
        msgs = ((InternalEObject)defaultLocale).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PropertySLPackage.PACKAGE__DEFAULT_LOCALE, null, msgs);
      if (newDefaultLocale != null)
        msgs = ((InternalEObject)newDefaultLocale).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PropertySLPackage.PACKAGE__DEFAULT_LOCALE, null, msgs);
      msgs = basicSetDefaultLocale(newDefaultLocale, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PropertySLPackage.PACKAGE__DEFAULT_LOCALE, newDefaultLocale, newDefaultLocale));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<com.github.fbrx.propertysl.propertySL.Package> getPackages()
  {
    if (packages == null)
    {
      packages = new EObjectContainmentEList<com.github.fbrx.propertysl.propertySL.Package>(com.github.fbrx.propertysl.propertySL.Package.class, this, PropertySLPackage.PACKAGE__PACKAGES);
    }
    return packages;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Property> getProperties()
  {
    if (properties == null)
    {
      properties = new EObjectContainmentEList<Property>(Property.class, this, PropertySLPackage.PACKAGE__PROPERTIES);
    }
    return properties;
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
      case PropertySLPackage.PACKAGE__DEFAULT_LOCALE:
        return basicSetDefaultLocale(null, msgs);
      case PropertySLPackage.PACKAGE__PACKAGES:
        return ((InternalEList<?>)getPackages()).basicRemove(otherEnd, msgs);
      case PropertySLPackage.PACKAGE__PROPERTIES:
        return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
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
      case PropertySLPackage.PACKAGE__NAME:
        return getName();
      case PropertySLPackage.PACKAGE__DEFAULT_LOCALE:
        return getDefaultLocale();
      case PropertySLPackage.PACKAGE__PACKAGES:
        return getPackages();
      case PropertySLPackage.PACKAGE__PROPERTIES:
        return getProperties();
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
      case PropertySLPackage.PACKAGE__NAME:
        setName((String)newValue);
        return;
      case PropertySLPackage.PACKAGE__DEFAULT_LOCALE:
        setDefaultLocale((DefaultLocale)newValue);
        return;
      case PropertySLPackage.PACKAGE__PACKAGES:
        getPackages().clear();
        getPackages().addAll((Collection<? extends com.github.fbrx.propertysl.propertySL.Package>)newValue);
        return;
      case PropertySLPackage.PACKAGE__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends Property>)newValue);
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
      case PropertySLPackage.PACKAGE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PropertySLPackage.PACKAGE__DEFAULT_LOCALE:
        setDefaultLocale((DefaultLocale)null);
        return;
      case PropertySLPackage.PACKAGE__PACKAGES:
        getPackages().clear();
        return;
      case PropertySLPackage.PACKAGE__PROPERTIES:
        getProperties().clear();
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
      case PropertySLPackage.PACKAGE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PropertySLPackage.PACKAGE__DEFAULT_LOCALE:
        return defaultLocale != null;
      case PropertySLPackage.PACKAGE__PACKAGES:
        return packages != null && !packages.isEmpty();
      case PropertySLPackage.PACKAGE__PROPERTIES:
        return properties != null && !properties.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //PackageImpl
