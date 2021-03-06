/**
 */
package com.br.terra.dcl.dCL.impl;

import com.br.terra.dcl.dCL.DCLPackage;
import com.br.terra.dcl.dCL.Only2;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Only2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.br.terra.dcl.dCL.impl.Only2Impl#getOnly2 <em>Only2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Only2Impl extends MinimalEObjectImpl.Container implements Only2
{
  /**
   * The default value of the '{@link #getOnly2() <em>Only2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOnly2()
   * @generated
   * @ordered
   */
  protected static final String ONLY2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOnly2() <em>Only2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOnly2()
   * @generated
   * @ordered
   */
  protected String only2 = ONLY2_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Only2Impl()
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
    return DCLPackage.Literals.ONLY2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOnly2()
  {
    return only2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOnly2(String newOnly2)
  {
    String oldOnly2 = only2;
    only2 = newOnly2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DCLPackage.ONLY2__ONLY2, oldOnly2, only2));
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
      case DCLPackage.ONLY2__ONLY2:
        return getOnly2();
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
      case DCLPackage.ONLY2__ONLY2:
        setOnly2((String)newValue);
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
      case DCLPackage.ONLY2__ONLY2:
        setOnly2(ONLY2_EDEFAULT);
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
      case DCLPackage.ONLY2__ONLY2:
        return ONLY2_EDEFAULT == null ? only2 != null : !ONLY2_EDEFAULT.equals(only2);
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
    result.append(" (only2: ");
    result.append(only2);
    result.append(')');
    return result.toString();
  }

} //Only2Impl
