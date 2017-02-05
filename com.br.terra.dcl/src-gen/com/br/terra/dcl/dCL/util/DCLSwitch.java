/**
 */
package com.br.terra.dcl.dCL.util;

import com.br.terra.dcl.dCL.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.br.terra.dcl.dCL.DCLPackage
 * @generated
 */
public class DCLSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DCLPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DCLSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = DCLPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case DCLPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DCLPackage.DCL_STRUCTURE_ELEMENT:
      {
        DCLStructureElement dclStructureElement = (DCLStructureElement)theEObject;
        T result = caseDCLStructureElement(dclStructureElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DCLPackage.DCL_LAYER:
      {
        DCLLayer dclLayer = (DCLLayer)theEObject;
        T result = caseDCLLayer(dclLayer);
        if (result == null) result = caseDCLStructureElement(dclLayer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DCLPackage.DCL_COMPONENT:
      {
        DCLComponent dclComponent = (DCLComponent)theEObject;
        T result = caseDCLComponent(dclComponent);
        if (result == null) result = caseDCLStructureElement(dclComponent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DCLPackage.DCL_COMPONENT_INTERFACE:
      {
        DCLComponentInterface dclComponentInterface = (DCLComponentInterface)theEObject;
        T result = caseDCLComponentInterface(dclComponentInterface);
        if (result == null) result = caseDCLStructureElement(dclComponentInterface);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DCLPackage.INTERFACE_TYPE:
      {
        InterfaceType interfaceType = (InterfaceType)theEObject;
        T result = caseInterfaceType(interfaceType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DCLPackage.DCL_SUB_SYSTEM:
      {
        DCLSubSystem dclSubSystem = (DCLSubSystem)theEObject;
        T result = caseDCLSubSystem(dclSubSystem);
        if (result == null) result = caseDCLStructureElement(dclSubSystem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DCLPackage.DCL_MODULE:
      {
        DCLModule dclModule = (DCLModule)theEObject;
        T result = caseDCLModule(dclModule);
        if (result == null) result = caseDCLStructureElement(dclModule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DCLPackage.DC_DECL:
      {
        DCDecl dcDecl = (DCDecl)theEObject;
        T result = caseDCDecl(dcDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DCLPackage.ONLY:
      {
        Only only = (Only)theEObject;
        T result = caseOnly(only);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DCLPackage.CAN:
      {
        Can can = (Can)theEObject;
        T result = caseCan(can);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DCLPackage.CANNOT:
      {
        Cannot cannot = (Cannot)theEObject;
        T result = caseCannot(cannot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DCLPackage.ONLY2:
      {
        Only2 only2 = (Only2)theEObject;
        T result = caseOnly2(only2);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DCLPackage.MUST:
      {
        Must must = (Must)theEObject;
        T result = caseMust(must);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DCLPackage.ELEMENT_TYPE:
      {
        ElementType elementType = (ElementType)theEObject;
        T result = caseElementType(elementType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DCLPackage.BASIC_TYPE:
      {
        BasicType basicType = (BasicType)theEObject;
        T result = caseBasicType(basicType);
        if (result == null) result = caseElementType(basicType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DCLPackage.ENTITY_TYPE:
      {
        EntityType entityType = (EntityType)theEObject;
        T result = caseEntityType(entityType);
        if (result == null) result = caseElementType(entityType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Structure Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Structure Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDCLStructureElement(DCLStructureElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Layer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Layer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDCLLayer(DCLLayer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Component</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDCLComponent(DCLComponent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Component Interface</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Component Interface</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDCLComponentInterface(DCLComponentInterface object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interface Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interface Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterfaceType(InterfaceType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sub System</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sub System</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDCLSubSystem(DCLSubSystem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Module</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDCLModule(DCLModule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DC Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DC Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDCDecl(DCDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Only</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Only</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOnly(Only object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Can</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Can</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCan(Can object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cannot</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cannot</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCannot(Cannot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Only2</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Only2</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOnly2(Only2 object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Must</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Must</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMust(Must object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElementType(ElementType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Basic Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Basic Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBasicType(BasicType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entity Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntityType(EntityType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //DCLSwitch
