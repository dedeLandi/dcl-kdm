/**
 */
package com.br.terra.dcl.dCL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.br.terra.dcl.dCL.EntityType#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @see com.br.terra.dcl.dCL.DCLPackage#getEntityType()
 * @model
 * @generated
 */
public interface EntityType extends ElementType
{
  /**
   * Returns the value of the '<em><b>Entity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entity</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity</em>' attribute.
   * @see #setEntity(String)
   * @see com.br.terra.dcl.dCL.DCLPackage#getEntityType_Entity()
   * @model
   * @generated
   */
  String getEntity();

  /**
   * Sets the value of the '{@link com.br.terra.dcl.dCL.EntityType#getEntity <em>Entity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entity</em>' attribute.
   * @see #getEntity()
   * @generated
   */
  void setEntity(String value);

} // EntityType
