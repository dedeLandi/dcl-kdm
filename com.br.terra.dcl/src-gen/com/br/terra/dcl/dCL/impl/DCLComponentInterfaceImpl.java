/**
 */
package com.br.terra.dcl.dCL.impl;

import com.br.terra.dcl.dCL.DCLComponentInterface;
import com.br.terra.dcl.dCL.DCLPackage;
import com.br.terra.dcl.dCL.DCLStructureElement;
import com.br.terra.dcl.dCL.InterfaceType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.br.terra.dcl.dCL.impl.DCLComponentInterfaceImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link com.br.terra.dcl.dCL.impl.DCLComponentInterfaceImpl#getInterfaceType <em>Interface Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DCLComponentInterfaceImpl extends DCLStructureElementImpl implements DCLComponentInterface
{
  /**
   * The cached value of the '{@link #getComponent() <em>Component</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponent()
   * @generated
   * @ordered
   */
  protected DCLStructureElement component;

  /**
   * The cached value of the '{@link #getInterfaceType() <em>Interface Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterfaceType()
   * @generated
   * @ordered
   */
  protected InterfaceType interfaceType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DCLComponentInterfaceImpl()
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
    return DCLPackage.Literals.DCL_COMPONENT_INTERFACE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DCLStructureElement getComponent()
  {
    if (component != null && component.eIsProxy())
    {
      InternalEObject oldComponent = (InternalEObject)component;
      component = (DCLStructureElement)eResolveProxy(oldComponent);
      if (component != oldComponent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DCLPackage.DCL_COMPONENT_INTERFACE__COMPONENT, oldComponent, component));
      }
    }
    return component;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DCLStructureElement basicGetComponent()
  {
    return component;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComponent(DCLStructureElement newComponent)
  {
    DCLStructureElement oldComponent = component;
    component = newComponent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DCLPackage.DCL_COMPONENT_INTERFACE__COMPONENT, oldComponent, component));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfaceType getInterfaceType()
  {
    return interfaceType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInterfaceType(InterfaceType newInterfaceType, NotificationChain msgs)
  {
    InterfaceType oldInterfaceType = interfaceType;
    interfaceType = newInterfaceType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DCLPackage.DCL_COMPONENT_INTERFACE__INTERFACE_TYPE, oldInterfaceType, newInterfaceType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInterfaceType(InterfaceType newInterfaceType)
  {
    if (newInterfaceType != interfaceType)
    {
      NotificationChain msgs = null;
      if (interfaceType != null)
        msgs = ((InternalEObject)interfaceType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DCLPackage.DCL_COMPONENT_INTERFACE__INTERFACE_TYPE, null, msgs);
      if (newInterfaceType != null)
        msgs = ((InternalEObject)newInterfaceType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DCLPackage.DCL_COMPONENT_INTERFACE__INTERFACE_TYPE, null, msgs);
      msgs = basicSetInterfaceType(newInterfaceType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DCLPackage.DCL_COMPONENT_INTERFACE__INTERFACE_TYPE, newInterfaceType, newInterfaceType));
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
      case DCLPackage.DCL_COMPONENT_INTERFACE__INTERFACE_TYPE:
        return basicSetInterfaceType(null, msgs);
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
      case DCLPackage.DCL_COMPONENT_INTERFACE__COMPONENT:
        if (resolve) return getComponent();
        return basicGetComponent();
      case DCLPackage.DCL_COMPONENT_INTERFACE__INTERFACE_TYPE:
        return getInterfaceType();
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
      case DCLPackage.DCL_COMPONENT_INTERFACE__COMPONENT:
        setComponent((DCLStructureElement)newValue);
        return;
      case DCLPackage.DCL_COMPONENT_INTERFACE__INTERFACE_TYPE:
        setInterfaceType((InterfaceType)newValue);
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
      case DCLPackage.DCL_COMPONENT_INTERFACE__COMPONENT:
        setComponent((DCLStructureElement)null);
        return;
      case DCLPackage.DCL_COMPONENT_INTERFACE__INTERFACE_TYPE:
        setInterfaceType((InterfaceType)null);
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
      case DCLPackage.DCL_COMPONENT_INTERFACE__COMPONENT:
        return component != null;
      case DCLPackage.DCL_COMPONENT_INTERFACE__INTERFACE_TYPE:
        return interfaceType != null;
    }
    return super.eIsSet(featureID);
  }

} //DCLComponentInterfaceImpl
