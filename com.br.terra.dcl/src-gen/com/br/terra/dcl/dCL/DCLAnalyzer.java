/**
 */
package com.br.terra.dcl.dCL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analyzer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.br.terra.dcl.dCL.DCLAnalyzer#getManagingSubsystem <em>Managing Subsystem</em>}</li>
 * </ul>
 *
 * @see com.br.terra.dcl.dCL.DCLPackage#getDCLAnalyzer()
 * @model
 * @generated
 */
public interface DCLAnalyzer extends DCLStructureElement
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
   * @see com.br.terra.dcl.dCL.DCLPackage#getDCLAnalyzer_ManagingSubsystem()
   * @model
   * @generated
   */
  DCLManagingSubsystem getManagingSubsystem();

  /**
   * Sets the value of the '{@link com.br.terra.dcl.dCL.DCLAnalyzer#getManagingSubsystem <em>Managing Subsystem</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Managing Subsystem</em>' reference.
   * @see #getManagingSubsystem()
   * @generated
   */
  void setManagingSubsystem(DCLManagingSubsystem value);

} // DCLAnalyzer
