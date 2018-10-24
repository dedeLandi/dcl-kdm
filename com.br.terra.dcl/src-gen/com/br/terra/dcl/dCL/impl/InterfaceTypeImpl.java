/**
 */
package com.br.terra.dcl.dCL.impl;

import com.br.terra.dcl.dCL.DCLPackage;
import com.br.terra.dcl.dCL.InterfaceType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.br.terra.dcl.dCL.impl.InterfaceTypeImpl#getInterfaceTypeName <em>Interface Type Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceTypeImpl extends MinimalEObjectImpl.Container implements InterfaceType
{
  /**
   * The default value of the '{@link #getInterfaceTypeName() <em>Interface Type Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterfaceTypeName()
   * @generated
   * @ordered
   */
  protected static final String INTERFACE_TYPE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInterfaceTypeName() <em>Interface Type Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterfaceTypeName()
   * @generated
   * @ordered
   */
  protected String interfaceTypeName = INTERFACE_TYPE_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InterfaceTypeImpl()
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
    return DCLPackage.Literals.INTERFACE_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInterfaceTypeName()
  {
    return interfaceTypeName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInterfaceTypeName(String newInterfaceTypeName)
  {
    String oldInterfaceTypeName = interfaceTypeName;
    interfaceTypeName = newInterfaceTypeName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DCLPackage.INTERFACE_TYPE__INTERFACE_TYPE_NAME, oldInterfaceTypeName, interfaceTypeName));
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
      case DCLPackage.INTERFACE_TYPE__INTERFACE_TYPE_NAME:
        return getInterfaceTypeName();
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
      case DCLPackage.INTERFACE_TYPE__INTERFACE_TYPE_NAME:
        setInterfaceTypeName((String)newValue);
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
      case DCLPackage.INTERFACE_TYPE__INTERFACE_TYPE_NAME:
        setInterfaceTypeName(INTERFACE_TYPE_NAME_EDEFAULT);
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
      case DCLPackage.INTERFACE_TYPE__INTERFACE_TYPE_NAME:
        return INTERFACE_TYPE_NAME_EDEFAULT == null ? interfaceTypeName != null : !INTERFACE_TYPE_NAME_EDEFAULT.equals(interfaceTypeName);
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
    result.append(" (interfaceTypeName: ");
    result.append(interfaceTypeName);
    result.append(')');
    return result.toString();
  }

} //InterfaceTypeImpl
