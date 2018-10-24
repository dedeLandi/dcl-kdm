/**
 */
package com.br.terra.dcl.dCL.impl;

import com.br.terra.dcl.dCL.DCLManagedSubsystem;
import com.br.terra.dcl.dCL.DCLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Managed Subsystem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.br.terra.dcl.dCL.impl.DCLManagedSubsystemImpl#getManagedSubsystem <em>Managed Subsystem</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DCLManagedSubsystemImpl extends DCLStructureElementImpl implements DCLManagedSubsystem
{
  /**
   * The cached value of the '{@link #getManagedSubsystem() <em>Managed Subsystem</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getManagedSubsystem()
   * @generated
   * @ordered
   */
  protected DCLManagedSubsystem managedSubsystem;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DCLManagedSubsystemImpl()
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
    return DCLPackage.Literals.DCL_MANAGED_SUBSYSTEM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DCLManagedSubsystem getManagedSubsystem()
  {
    if (managedSubsystem != null && managedSubsystem.eIsProxy())
    {
      InternalEObject oldManagedSubsystem = (InternalEObject)managedSubsystem;
      managedSubsystem = (DCLManagedSubsystem)eResolveProxy(oldManagedSubsystem);
      if (managedSubsystem != oldManagedSubsystem)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DCLPackage.DCL_MANAGED_SUBSYSTEM__MANAGED_SUBSYSTEM, oldManagedSubsystem, managedSubsystem));
      }
    }
    return managedSubsystem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DCLManagedSubsystem basicGetManagedSubsystem()
  {
    return managedSubsystem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setManagedSubsystem(DCLManagedSubsystem newManagedSubsystem)
  {
    DCLManagedSubsystem oldManagedSubsystem = managedSubsystem;
    managedSubsystem = newManagedSubsystem;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DCLPackage.DCL_MANAGED_SUBSYSTEM__MANAGED_SUBSYSTEM, oldManagedSubsystem, managedSubsystem));
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
      case DCLPackage.DCL_MANAGED_SUBSYSTEM__MANAGED_SUBSYSTEM:
        if (resolve) return getManagedSubsystem();
        return basicGetManagedSubsystem();
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
      case DCLPackage.DCL_MANAGED_SUBSYSTEM__MANAGED_SUBSYSTEM:
        setManagedSubsystem((DCLManagedSubsystem)newValue);
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
      case DCLPackage.DCL_MANAGED_SUBSYSTEM__MANAGED_SUBSYSTEM:
        setManagedSubsystem((DCLManagedSubsystem)null);
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
      case DCLPackage.DCL_MANAGED_SUBSYSTEM__MANAGED_SUBSYSTEM:
        return managedSubsystem != null;
    }
    return super.eIsSet(featureID);
  }

} //DCLManagedSubsystemImpl
