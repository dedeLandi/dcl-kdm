/**
 */
package com.br.terra.dcl.dCL.impl;

import com.br.terra.dcl.dCL.DCLComponent;
import com.br.terra.dcl.dCL.DCLLayer;
import com.br.terra.dcl.dCL.DCLPackage;
import com.br.terra.dcl.dCL.DCLSubSystem;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.br.terra.dcl.dCL.impl.DCLLayerImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link com.br.terra.dcl.dCL.impl.DCLLayerImpl#getLayer <em>Layer</em>}</li>
 *   <li>{@link com.br.terra.dcl.dCL.impl.DCLLayerImpl#getSubSystem <em>Sub System</em>}</li>
 *   <li>{@link com.br.terra.dcl.dCL.impl.DCLLayerImpl#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DCLLayerImpl extends DCLStructureElementImpl implements DCLLayer
{
  /**
   * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLevel()
   * @generated
   * @ordered
   */
  protected static final int LEVEL_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLevel()
   * @generated
   * @ordered
   */
  protected int level = LEVEL_EDEFAULT;

  /**
   * The cached value of the '{@link #getLayer() <em>Layer</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLayer()
   * @generated
   * @ordered
   */
  protected DCLLayer layer;

  /**
   * The cached value of the '{@link #getSubSystem() <em>Sub System</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubSystem()
   * @generated
   * @ordered
   */
  protected DCLSubSystem subSystem;

  /**
   * The cached value of the '{@link #getComponent() <em>Component</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponent()
   * @generated
   * @ordered
   */
  protected DCLComponent component;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DCLLayerImpl()
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
    return DCLPackage.Literals.DCL_LAYER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getLevel()
  {
    return level;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLevel(int newLevel)
  {
    int oldLevel = level;
    level = newLevel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DCLPackage.DCL_LAYER__LEVEL, oldLevel, level));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DCLLayer getLayer()
  {
    if (layer != null && layer.eIsProxy())
    {
      InternalEObject oldLayer = (InternalEObject)layer;
      layer = (DCLLayer)eResolveProxy(oldLayer);
      if (layer != oldLayer)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DCLPackage.DCL_LAYER__LAYER, oldLayer, layer));
      }
    }
    return layer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DCLLayer basicGetLayer()
  {
    return layer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLayer(DCLLayer newLayer)
  {
    DCLLayer oldLayer = layer;
    layer = newLayer;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DCLPackage.DCL_LAYER__LAYER, oldLayer, layer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DCLSubSystem getSubSystem()
  {
    if (subSystem != null && subSystem.eIsProxy())
    {
      InternalEObject oldSubSystem = (InternalEObject)subSystem;
      subSystem = (DCLSubSystem)eResolveProxy(oldSubSystem);
      if (subSystem != oldSubSystem)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DCLPackage.DCL_LAYER__SUB_SYSTEM, oldSubSystem, subSystem));
      }
    }
    return subSystem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DCLSubSystem basicGetSubSystem()
  {
    return subSystem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubSystem(DCLSubSystem newSubSystem)
  {
    DCLSubSystem oldSubSystem = subSystem;
    subSystem = newSubSystem;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DCLPackage.DCL_LAYER__SUB_SYSTEM, oldSubSystem, subSystem));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DCLComponent getComponent()
  {
    if (component != null && component.eIsProxy())
    {
      InternalEObject oldComponent = (InternalEObject)component;
      component = (DCLComponent)eResolveProxy(oldComponent);
      if (component != oldComponent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DCLPackage.DCL_LAYER__COMPONENT, oldComponent, component));
      }
    }
    return component;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DCLComponent basicGetComponent()
  {
    return component;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComponent(DCLComponent newComponent)
  {
    DCLComponent oldComponent = component;
    component = newComponent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DCLPackage.DCL_LAYER__COMPONENT, oldComponent, component));
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
      case DCLPackage.DCL_LAYER__LEVEL:
        return getLevel();
      case DCLPackage.DCL_LAYER__LAYER:
        if (resolve) return getLayer();
        return basicGetLayer();
      case DCLPackage.DCL_LAYER__SUB_SYSTEM:
        if (resolve) return getSubSystem();
        return basicGetSubSystem();
      case DCLPackage.DCL_LAYER__COMPONENT:
        if (resolve) return getComponent();
        return basicGetComponent();
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
      case DCLPackage.DCL_LAYER__LEVEL:
        setLevel((Integer)newValue);
        return;
      case DCLPackage.DCL_LAYER__LAYER:
        setLayer((DCLLayer)newValue);
        return;
      case DCLPackage.DCL_LAYER__SUB_SYSTEM:
        setSubSystem((DCLSubSystem)newValue);
        return;
      case DCLPackage.DCL_LAYER__COMPONENT:
        setComponent((DCLComponent)newValue);
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
      case DCLPackage.DCL_LAYER__LEVEL:
        setLevel(LEVEL_EDEFAULT);
        return;
      case DCLPackage.DCL_LAYER__LAYER:
        setLayer((DCLLayer)null);
        return;
      case DCLPackage.DCL_LAYER__SUB_SYSTEM:
        setSubSystem((DCLSubSystem)null);
        return;
      case DCLPackage.DCL_LAYER__COMPONENT:
        setComponent((DCLComponent)null);
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
      case DCLPackage.DCL_LAYER__LEVEL:
        return level != LEVEL_EDEFAULT;
      case DCLPackage.DCL_LAYER__LAYER:
        return layer != null;
      case DCLPackage.DCL_LAYER__SUB_SYSTEM:
        return subSystem != null;
      case DCLPackage.DCL_LAYER__COMPONENT:
        return component != null;
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
    result.append(" (level: ");
    result.append(level);
    result.append(')');
    return result.toString();
  }

} //DCLLayerImpl
