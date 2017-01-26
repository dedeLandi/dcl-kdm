/**
 */
package com.br.terra.dcl.dCL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.br.terra.dcl.dCL.DCLComponentInterface#getComponent <em>Component</em>}</li>
 *   <li>{@link com.br.terra.dcl.dCL.DCLComponentInterface#getInterfaceType <em>Interface Type</em>}</li>
 * </ul>
 *
 * @see com.br.terra.dcl.dCL.DCLPackage#getDCLComponentInterface()
 * @model
 * @generated
 */
public interface DCLComponentInterface extends DCLStructureElement
{
  /**
   * Returns the value of the '<em><b>Component</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Component</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Component</em>' reference.
   * @see #setComponent(DCLStructureElement)
   * @see com.br.terra.dcl.dCL.DCLPackage#getDCLComponentInterface_Component()
   * @model
   * @generated
   */
  DCLStructureElement getComponent();

  /**
   * Sets the value of the '{@link com.br.terra.dcl.dCL.DCLComponentInterface#getComponent <em>Component</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Component</em>' reference.
   * @see #getComponent()
   * @generated
   */
  void setComponent(DCLStructureElement value);

  /**
   * Returns the value of the '<em><b>Interface Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interface Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interface Type</em>' containment reference.
   * @see #setInterfaceType(InterfaceType)
   * @see com.br.terra.dcl.dCL.DCLPackage#getDCLComponentInterface_InterfaceType()
   * @model containment="true"
   * @generated
   */
  InterfaceType getInterfaceType();

  /**
   * Sets the value of the '{@link com.br.terra.dcl.dCL.DCLComponentInterface#getInterfaceType <em>Interface Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interface Type</em>' containment reference.
   * @see #getInterfaceType()
   * @generated
   */
  void setInterfaceType(InterfaceType value);

} // DCLComponentInterface
