/**
 */
package com.br.terra.dcl.dCL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DC Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.br.terra.dcl.dCL.DCDecl#getOnly <em>Only</em>}</li>
 *   <li>{@link com.br.terra.dcl.dCL.DCDecl#getT <em>T</em>}</li>
 *   <li>{@link com.br.terra.dcl.dCL.DCDecl#getCan <em>Can</em>}</li>
 *   <li>{@link com.br.terra.dcl.dCL.DCDecl#getElementType <em>Element Type</em>}</li>
 *   <li>{@link com.br.terra.dcl.dCL.DCDecl#getType <em>Type</em>}</li>
 *   <li>{@link com.br.terra.dcl.dCL.DCDecl#getCannot <em>Cannot</em>}</li>
 *   <li>{@link com.br.terra.dcl.dCL.DCDecl#getOnly2 <em>Only2</em>}</li>
 *   <li>{@link com.br.terra.dcl.dCL.DCDecl#getMust <em>Must</em>}</li>
 *   <li>{@link com.br.terra.dcl.dCL.DCDecl#getEntityType <em>Entity Type</em>}</li>
 * </ul>
 *
 * @see com.br.terra.dcl.dCL.DCLPackage#getDCDecl()
 * @model
 * @generated
 */
public interface DCDecl extends EObject
{
  /**
   * Returns the value of the '<em><b>Only</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Only</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Only</em>' containment reference.
   * @see #setOnly(Only)
   * @see com.br.terra.dcl.dCL.DCLPackage#getDCDecl_Only()
   * @model containment="true"
   * @generated
   */
  Only getOnly();

  /**
   * Sets the value of the '{@link com.br.terra.dcl.dCL.DCDecl#getOnly <em>Only</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Only</em>' containment reference.
   * @see #getOnly()
   * @generated
   */
  void setOnly(Only value);

  /**
   * Returns the value of the '<em><b>T</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T</em>' reference.
   * @see #setT(DCLStructureElement)
   * @see com.br.terra.dcl.dCL.DCLPackage#getDCDecl_T()
   * @model
   * @generated
   */
  DCLStructureElement getT();

  /**
   * Sets the value of the '{@link com.br.terra.dcl.dCL.DCDecl#getT <em>T</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T</em>' reference.
   * @see #getT()
   * @generated
   */
  void setT(DCLStructureElement value);

  /**
   * Returns the value of the '<em><b>Can</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Can</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Can</em>' containment reference.
   * @see #setCan(Can)
   * @see com.br.terra.dcl.dCL.DCLPackage#getDCDecl_Can()
   * @model containment="true"
   * @generated
   */
  Can getCan();

  /**
   * Sets the value of the '{@link com.br.terra.dcl.dCL.DCDecl#getCan <em>Can</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Can</em>' containment reference.
   * @see #getCan()
   * @generated
   */
  void setCan(Can value);

  /**
   * Returns the value of the '<em><b>Element Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element Type</em>' containment reference.
   * @see #setElementType(ElementType)
   * @see com.br.terra.dcl.dCL.DCLPackage#getDCDecl_ElementType()
   * @model containment="true"
   * @generated
   */
  ElementType getElementType();

  /**
   * Sets the value of the '{@link com.br.terra.dcl.dCL.DCDecl#getElementType <em>Element Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element Type</em>' containment reference.
   * @see #getElementType()
   * @generated
   */
  void setElementType(ElementType value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(DCLStructureElement)
   * @see com.br.terra.dcl.dCL.DCLPackage#getDCDecl_Type()
   * @model
   * @generated
   */
  DCLStructureElement getType();

  /**
   * Sets the value of the '{@link com.br.terra.dcl.dCL.DCDecl#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(DCLStructureElement value);

  /**
   * Returns the value of the '<em><b>Cannot</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cannot</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cannot</em>' containment reference.
   * @see #setCannot(Cannot)
   * @see com.br.terra.dcl.dCL.DCLPackage#getDCDecl_Cannot()
   * @model containment="true"
   * @generated
   */
  Cannot getCannot();

  /**
   * Sets the value of the '{@link com.br.terra.dcl.dCL.DCDecl#getCannot <em>Cannot</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cannot</em>' containment reference.
   * @see #getCannot()
   * @generated
   */
  void setCannot(Cannot value);

  /**
   * Returns the value of the '<em><b>Only2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Only2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Only2</em>' containment reference.
   * @see #setOnly2(Only2)
   * @see com.br.terra.dcl.dCL.DCLPackage#getDCDecl_Only2()
   * @model containment="true"
   * @generated
   */
  Only2 getOnly2();

  /**
   * Sets the value of the '{@link com.br.terra.dcl.dCL.DCDecl#getOnly2 <em>Only2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Only2</em>' containment reference.
   * @see #getOnly2()
   * @generated
   */
  void setOnly2(Only2 value);

  /**
   * Returns the value of the '<em><b>Must</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Must</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Must</em>' containment reference.
   * @see #setMust(Must)
   * @see com.br.terra.dcl.dCL.DCLPackage#getDCDecl_Must()
   * @model containment="true"
   * @generated
   */
  Must getMust();

  /**
   * Sets the value of the '{@link com.br.terra.dcl.dCL.DCDecl#getMust <em>Must</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Must</em>' containment reference.
   * @see #getMust()
   * @generated
   */
  void setMust(Must value);

  /**
   * Returns the value of the '<em><b>Entity Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entity Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity Type</em>' containment reference.
   * @see #setEntityType(EntityType)
   * @see com.br.terra.dcl.dCL.DCLPackage#getDCDecl_EntityType()
   * @model containment="true"
   * @generated
   */
  EntityType getEntityType();

  /**
   * Sets the value of the '{@link com.br.terra.dcl.dCL.DCDecl#getEntityType <em>Entity Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entity Type</em>' containment reference.
   * @see #getEntityType()
   * @generated
   */
  void setEntityType(EntityType value);

} // DCDecl
