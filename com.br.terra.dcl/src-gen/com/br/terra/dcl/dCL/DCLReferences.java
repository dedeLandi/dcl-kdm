/**
 */
package com.br.terra.dcl.dCL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>References</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.br.terra.dcl.dCL.DCLReferences#getManagingSubsystem <em>Managing Subsystem</em>}</li>
 *   <li>{@link com.br.terra.dcl.dCL.DCLReferences#getKnowledge <em>Knowledge</em>}</li>
 * </ul>
 *
 * @see com.br.terra.dcl.dCL.DCLPackage#getDCLReferences()
 * @model
 * @generated
 */
public interface DCLReferences extends DCLStructureElement
{
  /**
   * Returns the value of the '<em><b>Managing Subsystem</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Managing Subsystem</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Managing Subsystem</em>' reference.
   * @see #setManagingSubsystem(DCLManagingSubsystem)
   * @see com.br.terra.dcl.dCL.DCLPackage#getDCLReferences_ManagingSubsystem()
   * @model
   * @generated
   */
  DCLManagingSubsystem getManagingSubsystem();

  /**
   * Sets the value of the '{@link com.br.terra.dcl.dCL.DCLReferences#getManagingSubsystem <em>Managing Subsystem</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Managing Subsystem</em>' reference.
   * @see #getManagingSubsystem()
   * @generated
   */
  void setManagingSubsystem(DCLManagingSubsystem value);

  /**
   * Returns the value of the '<em><b>Knowledge</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Knowledge</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Knowledge</em>' reference.
   * @see #setKnowledge(DCLKnowledge)
   * @see com.br.terra.dcl.dCL.DCLPackage#getDCLReferences_Knowledge()
   * @model
   * @generated
   */
  DCLKnowledge getKnowledge();

  /**
   * Sets the value of the '{@link com.br.terra.dcl.dCL.DCLReferences#getKnowledge <em>Knowledge</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Knowledge</em>' reference.
   * @see #getKnowledge()
   * @generated
   */
  void setKnowledge(DCLKnowledge value);

} // DCLReferences
