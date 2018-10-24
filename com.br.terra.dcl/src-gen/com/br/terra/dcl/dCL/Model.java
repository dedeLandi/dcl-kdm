/**
 */
package com.br.terra.dcl.dCL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.br.terra.dcl.dCL.Model#getStructureElements <em>Structure Elements</em>}</li>
 *   <li>{@link com.br.terra.dcl.dCL.Model#getDCDecl <em>DC Decl</em>}</li>
 * </ul>
 *
 * @see com.br.terra.dcl.dCL.DCLPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Structure Elements</b></em>' containment reference list.
   * The list contents are of type {@link com.br.terra.dcl.dCL.DCLStructureElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Structure Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Structure Elements</em>' containment reference list.
   * @see com.br.terra.dcl.dCL.DCLPackage#getModel_StructureElements()
   * @model containment="true"
   * @generated
   */
  EList<DCLStructureElement> getStructureElements();

  /**
   * Returns the value of the '<em><b>DC Decl</b></em>' containment reference list.
   * The list contents are of type {@link com.br.terra.dcl.dCL.DCDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>DC Decl</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>DC Decl</em>' containment reference list.
   * @see com.br.terra.dcl.dCL.DCLPackage#getModel_DCDecl()
   * @model containment="true"
   * @generated
   */
  EList<DCDecl> getDCDecl();

} // Model
