/**
 */
package com.br.terra.dcl.dCL.impl;

import com.br.terra.dcl.dCL.Can;
import com.br.terra.dcl.dCL.Cannot;
import com.br.terra.dcl.dCL.DCDecl;
import com.br.terra.dcl.dCL.DCLPackage;
import com.br.terra.dcl.dCL.DCLStructureElement;
import com.br.terra.dcl.dCL.ElementType;
import com.br.terra.dcl.dCL.EntityType;
import com.br.terra.dcl.dCL.Must;
import com.br.terra.dcl.dCL.Only;
import com.br.terra.dcl.dCL.Only2;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DC Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.br.terra.dcl.dCL.impl.DCDeclImpl#getOnly <em>Only</em>}</li>
 *   <li>{@link com.br.terra.dcl.dCL.impl.DCDeclImpl#getT <em>T</em>}</li>
 *   <li>{@link com.br.terra.dcl.dCL.impl.DCDeclImpl#getCan <em>Can</em>}</li>
 *   <li>{@link com.br.terra.dcl.dCL.impl.DCDeclImpl#getElementType <em>Element Type</em>}</li>
 *   <li>{@link com.br.terra.dcl.dCL.impl.DCDeclImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.br.terra.dcl.dCL.impl.DCDeclImpl#getCannot <em>Cannot</em>}</li>
 *   <li>{@link com.br.terra.dcl.dCL.impl.DCDeclImpl#getOnly2 <em>Only2</em>}</li>
 *   <li>{@link com.br.terra.dcl.dCL.impl.DCDeclImpl#getMust <em>Must</em>}</li>
 *   <li>{@link com.br.terra.dcl.dCL.impl.DCDeclImpl#getEntityType <em>Entity Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DCDeclImpl extends MinimalEObjectImpl.Container implements DCDecl
{
  /**
   * The cached value of the '{@link #getOnly() <em>Only</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOnly()
   * @generated
   * @ordered
   */
  protected Only only;

  /**
   * The cached value of the '{@link #getT() <em>T</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT()
   * @generated
   * @ordered
   */
  protected DCLStructureElement t;

  /**
   * The cached value of the '{@link #getCan() <em>Can</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCan()
   * @generated
   * @ordered
   */
  protected Can can;

  /**
   * The cached value of the '{@link #getElementType() <em>Element Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElementType()
   * @generated
   * @ordered
   */
  protected ElementType elementType;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected DCLStructureElement type;

  /**
   * The cached value of the '{@link #getCannot() <em>Cannot</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCannot()
   * @generated
   * @ordered
   */
  protected Cannot cannot;

  /**
   * The cached value of the '{@link #getOnly2() <em>Only2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOnly2()
   * @generated
   * @ordered
   */
  protected Only2 only2;

  /**
   * The cached value of the '{@link #getMust() <em>Must</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMust()
   * @generated
   * @ordered
   */
  protected Must must;

  /**
   * The cached value of the '{@link #getEntityType() <em>Entity Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntityType()
   * @generated
   * @ordered
   */
  protected EntityType entityType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DCDeclImpl()
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
    return DCLPackage.Literals.DC_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Only getOnly()
  {
    return only;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOnly(Only newOnly, NotificationChain msgs)
  {
    Only oldOnly = only;
    only = newOnly;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DCLPackage.DC_DECL__ONLY, oldOnly, newOnly);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOnly(Only newOnly)
  {
    if (newOnly != only)
    {
      NotificationChain msgs = null;
      if (only != null)
        msgs = ((InternalEObject)only).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DCLPackage.DC_DECL__ONLY, null, msgs);
      if (newOnly != null)
        msgs = ((InternalEObject)newOnly).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DCLPackage.DC_DECL__ONLY, null, msgs);
      msgs = basicSetOnly(newOnly, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DCLPackage.DC_DECL__ONLY, newOnly, newOnly));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DCLStructureElement getT()
  {
    if (t != null && t.eIsProxy())
    {
      InternalEObject oldT = (InternalEObject)t;
      t = (DCLStructureElement)eResolveProxy(oldT);
      if (t != oldT)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DCLPackage.DC_DECL__T, oldT, t));
      }
    }
    return t;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DCLStructureElement basicGetT()
  {
    return t;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT(DCLStructureElement newT)
  {
    DCLStructureElement oldT = t;
    t = newT;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DCLPackage.DC_DECL__T, oldT, t));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Can getCan()
  {
    return can;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCan(Can newCan, NotificationChain msgs)
  {
    Can oldCan = can;
    can = newCan;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DCLPackage.DC_DECL__CAN, oldCan, newCan);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCan(Can newCan)
  {
    if (newCan != can)
    {
      NotificationChain msgs = null;
      if (can != null)
        msgs = ((InternalEObject)can).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DCLPackage.DC_DECL__CAN, null, msgs);
      if (newCan != null)
        msgs = ((InternalEObject)newCan).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DCLPackage.DC_DECL__CAN, null, msgs);
      msgs = basicSetCan(newCan, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DCLPackage.DC_DECL__CAN, newCan, newCan));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementType getElementType()
  {
    return elementType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElementType(ElementType newElementType, NotificationChain msgs)
  {
    ElementType oldElementType = elementType;
    elementType = newElementType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DCLPackage.DC_DECL__ELEMENT_TYPE, oldElementType, newElementType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElementType(ElementType newElementType)
  {
    if (newElementType != elementType)
    {
      NotificationChain msgs = null;
      if (elementType != null)
        msgs = ((InternalEObject)elementType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DCLPackage.DC_DECL__ELEMENT_TYPE, null, msgs);
      if (newElementType != null)
        msgs = ((InternalEObject)newElementType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DCLPackage.DC_DECL__ELEMENT_TYPE, null, msgs);
      msgs = basicSetElementType(newElementType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DCLPackage.DC_DECL__ELEMENT_TYPE, newElementType, newElementType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DCLStructureElement getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (DCLStructureElement)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DCLPackage.DC_DECL__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DCLStructureElement basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(DCLStructureElement newType)
  {
    DCLStructureElement oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DCLPackage.DC_DECL__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cannot getCannot()
  {
    return cannot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCannot(Cannot newCannot, NotificationChain msgs)
  {
    Cannot oldCannot = cannot;
    cannot = newCannot;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DCLPackage.DC_DECL__CANNOT, oldCannot, newCannot);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCannot(Cannot newCannot)
  {
    if (newCannot != cannot)
    {
      NotificationChain msgs = null;
      if (cannot != null)
        msgs = ((InternalEObject)cannot).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DCLPackage.DC_DECL__CANNOT, null, msgs);
      if (newCannot != null)
        msgs = ((InternalEObject)newCannot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DCLPackage.DC_DECL__CANNOT, null, msgs);
      msgs = basicSetCannot(newCannot, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DCLPackage.DC_DECL__CANNOT, newCannot, newCannot));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Only2 getOnly2()
  {
    return only2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOnly2(Only2 newOnly2, NotificationChain msgs)
  {
    Only2 oldOnly2 = only2;
    only2 = newOnly2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DCLPackage.DC_DECL__ONLY2, oldOnly2, newOnly2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOnly2(Only2 newOnly2)
  {
    if (newOnly2 != only2)
    {
      NotificationChain msgs = null;
      if (only2 != null)
        msgs = ((InternalEObject)only2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DCLPackage.DC_DECL__ONLY2, null, msgs);
      if (newOnly2 != null)
        msgs = ((InternalEObject)newOnly2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DCLPackage.DC_DECL__ONLY2, null, msgs);
      msgs = basicSetOnly2(newOnly2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DCLPackage.DC_DECL__ONLY2, newOnly2, newOnly2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Must getMust()
  {
    return must;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMust(Must newMust, NotificationChain msgs)
  {
    Must oldMust = must;
    must = newMust;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DCLPackage.DC_DECL__MUST, oldMust, newMust);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMust(Must newMust)
  {
    if (newMust != must)
    {
      NotificationChain msgs = null;
      if (must != null)
        msgs = ((InternalEObject)must).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DCLPackage.DC_DECL__MUST, null, msgs);
      if (newMust != null)
        msgs = ((InternalEObject)newMust).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DCLPackage.DC_DECL__MUST, null, msgs);
      msgs = basicSetMust(newMust, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DCLPackage.DC_DECL__MUST, newMust, newMust));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityType getEntityType()
  {
    return entityType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEntityType(EntityType newEntityType, NotificationChain msgs)
  {
    EntityType oldEntityType = entityType;
    entityType = newEntityType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DCLPackage.DC_DECL__ENTITY_TYPE, oldEntityType, newEntityType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEntityType(EntityType newEntityType)
  {
    if (newEntityType != entityType)
    {
      NotificationChain msgs = null;
      if (entityType != null)
        msgs = ((InternalEObject)entityType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DCLPackage.DC_DECL__ENTITY_TYPE, null, msgs);
      if (newEntityType != null)
        msgs = ((InternalEObject)newEntityType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DCLPackage.DC_DECL__ENTITY_TYPE, null, msgs);
      msgs = basicSetEntityType(newEntityType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DCLPackage.DC_DECL__ENTITY_TYPE, newEntityType, newEntityType));
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
      case DCLPackage.DC_DECL__ONLY:
        return basicSetOnly(null, msgs);
      case DCLPackage.DC_DECL__CAN:
        return basicSetCan(null, msgs);
      case DCLPackage.DC_DECL__ELEMENT_TYPE:
        return basicSetElementType(null, msgs);
      case DCLPackage.DC_DECL__CANNOT:
        return basicSetCannot(null, msgs);
      case DCLPackage.DC_DECL__ONLY2:
        return basicSetOnly2(null, msgs);
      case DCLPackage.DC_DECL__MUST:
        return basicSetMust(null, msgs);
      case DCLPackage.DC_DECL__ENTITY_TYPE:
        return basicSetEntityType(null, msgs);
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
      case DCLPackage.DC_DECL__ONLY:
        return getOnly();
      case DCLPackage.DC_DECL__T:
        if (resolve) return getT();
        return basicGetT();
      case DCLPackage.DC_DECL__CAN:
        return getCan();
      case DCLPackage.DC_DECL__ELEMENT_TYPE:
        return getElementType();
      case DCLPackage.DC_DECL__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case DCLPackage.DC_DECL__CANNOT:
        return getCannot();
      case DCLPackage.DC_DECL__ONLY2:
        return getOnly2();
      case DCLPackage.DC_DECL__MUST:
        return getMust();
      case DCLPackage.DC_DECL__ENTITY_TYPE:
        return getEntityType();
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
      case DCLPackage.DC_DECL__ONLY:
        setOnly((Only)newValue);
        return;
      case DCLPackage.DC_DECL__T:
        setT((DCLStructureElement)newValue);
        return;
      case DCLPackage.DC_DECL__CAN:
        setCan((Can)newValue);
        return;
      case DCLPackage.DC_DECL__ELEMENT_TYPE:
        setElementType((ElementType)newValue);
        return;
      case DCLPackage.DC_DECL__TYPE:
        setType((DCLStructureElement)newValue);
        return;
      case DCLPackage.DC_DECL__CANNOT:
        setCannot((Cannot)newValue);
        return;
      case DCLPackage.DC_DECL__ONLY2:
        setOnly2((Only2)newValue);
        return;
      case DCLPackage.DC_DECL__MUST:
        setMust((Must)newValue);
        return;
      case DCLPackage.DC_DECL__ENTITY_TYPE:
        setEntityType((EntityType)newValue);
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
      case DCLPackage.DC_DECL__ONLY:
        setOnly((Only)null);
        return;
      case DCLPackage.DC_DECL__T:
        setT((DCLStructureElement)null);
        return;
      case DCLPackage.DC_DECL__CAN:
        setCan((Can)null);
        return;
      case DCLPackage.DC_DECL__ELEMENT_TYPE:
        setElementType((ElementType)null);
        return;
      case DCLPackage.DC_DECL__TYPE:
        setType((DCLStructureElement)null);
        return;
      case DCLPackage.DC_DECL__CANNOT:
        setCannot((Cannot)null);
        return;
      case DCLPackage.DC_DECL__ONLY2:
        setOnly2((Only2)null);
        return;
      case DCLPackage.DC_DECL__MUST:
        setMust((Must)null);
        return;
      case DCLPackage.DC_DECL__ENTITY_TYPE:
        setEntityType((EntityType)null);
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
      case DCLPackage.DC_DECL__ONLY:
        return only != null;
      case DCLPackage.DC_DECL__T:
        return t != null;
      case DCLPackage.DC_DECL__CAN:
        return can != null;
      case DCLPackage.DC_DECL__ELEMENT_TYPE:
        return elementType != null;
      case DCLPackage.DC_DECL__TYPE:
        return type != null;
      case DCLPackage.DC_DECL__CANNOT:
        return cannot != null;
      case DCLPackage.DC_DECL__ONLY2:
        return only2 != null;
      case DCLPackage.DC_DECL__MUST:
        return must != null;
      case DCLPackage.DC_DECL__ENTITY_TYPE:
        return entityType != null;
    }
    return super.eIsSet(featureID);
  }

} //DCDeclImpl
