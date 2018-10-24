/**
 */
package com.br.terra.dcl.dCL.impl;

import com.br.terra.dcl.dCL.DCLKnowledge;
import com.br.terra.dcl.dCL.DCLManagingSubsystem;
import com.br.terra.dcl.dCL.DCLPackage;
import com.br.terra.dcl.dCL.DCLReferences;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>References</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.br.terra.dcl.dCL.impl.DCLReferencesImpl#getManagingSubsystem <em>Managing Subsystem</em>}</li>
 *   <li>{@link com.br.terra.dcl.dCL.impl.DCLReferencesImpl#getKnowledge <em>Knowledge</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DCLReferencesImpl extends DCLStructureElementImpl implements DCLReferences
{
  /**
   * The cached value of the '{@link #getManagingSubsystem() <em>Managing Subsystem</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getManagingSubsystem()
   * @generated
   * @ordered
   */
  protected DCLManagingSubsystem managingSubsystem;

  /**
   * The cached value of the '{@link #getKnowledge() <em>Knowledge</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKnowledge()
   * @generated
   * @ordered
   */
  protected DCLKnowledge knowledge;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DCLReferencesImpl()
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
    return DCLPackage.Literals.DCL_REFERENCES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DCLManagingSubsystem getManagingSubsystem()
  {
    if (managingSubsystem != null && managingSubsystem.eIsProxy())
    {
      InternalEObject oldManagingSubsystem = (InternalEObject)managingSubsystem;
      managingSubsystem = (DCLManagingSubsystem)eResolveProxy(oldManagingSubsystem);
      if (managingSubsystem != oldManagingSubsystem)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DCLPackage.DCL_REFERENCES__MANAGING_SUBSYSTEM, oldManagingSubsystem, managingSubsystem));
      }
    }
    return managingSubsystem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DCLManagingSubsystem basicGetManagingSubsystem()
  {
    return managingSubsystem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setManagingSubsystem(DCLManagingSubsystem newManagingSubsystem)
  {
    DCLManagingSubsystem oldManagingSubsystem = managingSubsystem;
    managingSubsystem = newManagingSubsystem;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DCLPackage.DCL_REFERENCES__MANAGING_SUBSYSTEM, oldManagingSubsystem, managingSubsystem));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DCLKnowledge getKnowledge()
  {
    if (knowledge != null && knowledge.eIsProxy())
    {
      InternalEObject oldKnowledge = (InternalEObject)knowledge;
      knowledge = (DCLKnowledge)eResolveProxy(oldKnowledge);
      if (knowledge != oldKnowledge)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DCLPackage.DCL_REFERENCES__KNOWLEDGE, oldKnowledge, knowledge));
      }
    }
    return knowledge;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DCLKnowledge basicGetKnowledge()
  {
    return knowledge;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKnowledge(DCLKnowledge newKnowledge)
  {
    DCLKnowledge oldKnowledge = knowledge;
    knowledge = newKnowledge;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DCLPackage.DCL_REFERENCES__KNOWLEDGE, oldKnowledge, knowledge));
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
      case DCLPackage.DCL_REFERENCES__MANAGING_SUBSYSTEM:
        if (resolve) return getManagingSubsystem();
        return basicGetManagingSubsystem();
      case DCLPackage.DCL_REFERENCES__KNOWLEDGE:
        if (resolve) return getKnowledge();
        return basicGetKnowledge();
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
      case DCLPackage.DCL_REFERENCES__MANAGING_SUBSYSTEM:
        setManagingSubsystem((DCLManagingSubsystem)newValue);
        return;
      case DCLPackage.DCL_REFERENCES__KNOWLEDGE:
        setKnowledge((DCLKnowledge)newValue);
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
      case DCLPackage.DCL_REFERENCES__MANAGING_SUBSYSTEM:
        setManagingSubsystem((DCLManagingSubsystem)null);
        return;
      case DCLPackage.DCL_REFERENCES__KNOWLEDGE:
        setKnowledge((DCLKnowledge)null);
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
      case DCLPackage.DCL_REFERENCES__MANAGING_SUBSYSTEM:
        return managingSubsystem != null;
      case DCLPackage.DCL_REFERENCES__KNOWLEDGE:
        return knowledge != null;
    }
    return super.eIsSet(featureID);
  }

} //DCLReferencesImpl
