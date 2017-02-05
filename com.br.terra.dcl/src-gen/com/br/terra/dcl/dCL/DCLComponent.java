/**
 */
package com.br.terra.dcl.dCL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.br.terra.dcl.dCL.DCLComponent#getLayer <em>Layer</em>}</li>
 *   <li>{@link com.br.terra.dcl.dCL.DCLComponent#getSubSystem <em>Sub System</em>}</li>
 * </ul>
 *
 * @see com.br.terra.dcl.dCL.DCLPackage#getDCLComponent()
 * @model
 * @generated
 */
public interface DCLComponent extends DCLStructureElement
{
  /**
   * Returns the value of the '<em><b>Layer</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Layer</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Layer</em>' reference.
   * @see #setLayer(DCLStructureElement)
   * @see com.br.terra.dcl.dCL.DCLPackage#getDCLComponent_Layer()
   * @model
   * @generated
   */
  DCLStructureElement getLayer();

  /**
   * Sets the value of the '{@link com.br.terra.dcl.dCL.DCLComponent#getLayer <em>Layer</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Layer</em>' reference.
   * @see #getLayer()
   * @generated
   */
  void setLayer(DCLStructureElement value);

  /**
   * Returns the value of the '<em><b>Sub System</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub System</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub System</em>' reference.
   * @see #setSubSystem(DCLStructureElement)
   * @see com.br.terra.dcl.dCL.DCLPackage#getDCLComponent_SubSystem()
   * @model
   * @generated
   */
  DCLStructureElement getSubSystem();

  /**
   * Sets the value of the '{@link com.br.terra.dcl.dCL.DCLComponent#getSubSystem <em>Sub System</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sub System</em>' reference.
   * @see #getSubSystem()
   * @generated
   */
  void setSubSystem(DCLStructureElement value);

} // DCLComponent
