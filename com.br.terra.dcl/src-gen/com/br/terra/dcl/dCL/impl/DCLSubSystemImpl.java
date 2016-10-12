/**
 */
package com.br.terra.dcl.dCL.impl;

import com.br.terra.dcl.dCL.DCLPackage;
import com.br.terra.dcl.dCL.DCLStructureElement;
import com.br.terra.dcl.dCL.DCLSubSystem;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.br.terra.dcl.dCL.impl.DCLSubSystemImpl#getSubSystem <em>Sub System</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DCLSubSystemImpl extends DCLStructureElementImpl implements DCLSubSystem
{
  /**
   * The cached value of the '{@link #getSubSystem() <em>Sub System</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubSystem()
   * @generated
   * @ordered
   */
  protected DCLStructureElement subSystem;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DCLSubSystemImpl()
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
    return DCLPackage.Literals.DCL_SUB_SYSTEM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DCLStructureElement getSubSystem()
  {
    if (subSystem != null && subSystem.eIsProxy())
    {
      InternalEObject oldSubSystem = (InternalEObject)subSystem;
      subSystem = (DCLStructureElement)eResolveProxy(oldSubSystem);
      if (subSystem != oldSubSystem)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DCLPackage.DCL_SUB_SYSTEM__SUB_SYSTEM, oldSubSystem, subSystem));
      }
    }
    return subSystem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DCLStructureElement basicGetSubSystem()
  {
    return subSystem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubSystem(DCLStructureElement newSubSystem)
  {
    DCLStructureElement oldSubSystem = subSystem;
    subSystem = newSubSystem;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DCLPackage.DCL_SUB_SYSTEM__SUB_SYSTEM, oldSubSystem, subSystem));
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
      case DCLPackage.DCL_SUB_SYSTEM__SUB_SYSTEM:
        if (resolve) return getSubSystem();
        return basicGetSubSystem();
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
      case DCLPackage.DCL_SUB_SYSTEM__SUB_SYSTEM:
        setSubSystem((DCLStructureElement)newValue);
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
      case DCLPackage.DCL_SUB_SYSTEM__SUB_SYSTEM:
        setSubSystem((DCLStructureElement)null);
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
      case DCLPackage.DCL_SUB_SYSTEM__SUB_SYSTEM:
        return subSystem != null;
    }
    return super.eIsSet(featureID);
  }

} //DCLSubSystemImpl
