/**
 */
package com.br.terra.dcl.dCL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.br.terra.dcl.dCL.InterfaceType#getInterfaceTypeName <em>Interface Type Name</em>}</li>
 * </ul>
 *
 * @see com.br.terra.dcl.dCL.DCLPackage#getInterfaceType()
 * @model
 * @generated
 */
public interface InterfaceType extends EObject
{
  /**
   * Returns the value of the '<em><b>Interface Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interface Type Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interface Type Name</em>' attribute.
   * @see #setInterfaceTypeName(String)
   * @see com.br.terra.dcl.dCL.DCLPackage#getInterfaceType_InterfaceTypeName()
   * @model
   * @generated
   */
  String getInterfaceTypeName();

  /**
   * Sets the value of the '{@link com.br.terra.dcl.dCL.InterfaceType#getInterfaceTypeName <em>Interface Type Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interface Type Name</em>' attribute.
   * @see #getInterfaceTypeName()
   * @generated
   */
  void setInterfaceTypeName(String value);

} // InterfaceType
