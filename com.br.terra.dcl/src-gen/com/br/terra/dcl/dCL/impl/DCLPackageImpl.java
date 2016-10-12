/**
 */
package com.br.terra.dcl.dCL.impl;

import com.br.terra.dcl.dCL.BasicType;
import com.br.terra.dcl.dCL.Can;
import com.br.terra.dcl.dCL.Cannot;
import com.br.terra.dcl.dCL.DCDecl;
import com.br.terra.dcl.dCL.DCLComponent;
import com.br.terra.dcl.dCL.DCLComponentInterface;
import com.br.terra.dcl.dCL.DCLFactory;
import com.br.terra.dcl.dCL.DCLLayer;
import com.br.terra.dcl.dCL.DCLModule;
import com.br.terra.dcl.dCL.DCLPackage;
import com.br.terra.dcl.dCL.DCLStructureElement;
import com.br.terra.dcl.dCL.DCLSubSystem;
import com.br.terra.dcl.dCL.ElementType;
import com.br.terra.dcl.dCL.EntityType;
import com.br.terra.dcl.dCL.InterfaceType;
import com.br.terra.dcl.dCL.Model;
import com.br.terra.dcl.dCL.Must;
import com.br.terra.dcl.dCL.Only;
import com.br.terra.dcl.dCL.Only2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DCLPackageImpl extends EPackageImpl implements DCLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dclStructureElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dclLayerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dclComponentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dclComponentInterfaceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interfaceTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dclSubSystemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dclModuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dcDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass onlyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass canEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cannotEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass only2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mustEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass basicTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entityTypeEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.br.terra.dcl.dCL.DCLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private DCLPackageImpl()
  {
    super(eNS_URI, DCLFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link DCLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static DCLPackage init()
  {
    if (isInited) return (DCLPackage)EPackage.Registry.INSTANCE.getEPackage(DCLPackage.eNS_URI);

    // Obtain or create and register package
    DCLPackageImpl theDCLPackage = (DCLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DCLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DCLPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theDCLPackage.createPackageContents();

    // Initialize created meta-data
    theDCLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theDCLPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(DCLPackage.eNS_URI, theDCLPackage);
    return theDCLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_StructureElements()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_DCDecl()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDCLStructureElement()
  {
    return dclStructureElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDCLStructureElement_Name()
  {
    return (EAttribute)dclStructureElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDCLLayer()
  {
    return dclLayerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDCLLayer_Level()
  {
    return (EAttribute)dclLayerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDCLLayer_Layer()
  {
    return (EReference)dclLayerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDCLLayer_SubSystem()
  {
    return (EReference)dclLayerEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDCLLayer_Component()
  {
    return (EReference)dclLayerEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDCLComponent()
  {
    return dclComponentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDCLComponent_Layer()
  {
    return (EReference)dclComponentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDCLComponent_SubSystem()
  {
    return (EReference)dclComponentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDCLComponentInterface()
  {
    return dclComponentInterfaceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDCLComponentInterface_Component()
  {
    return (EReference)dclComponentInterfaceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDCLComponentInterface_InterfaceType()
  {
    return (EReference)dclComponentInterfaceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterfaceType()
  {
    return interfaceTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInterfaceType_InterfaceTypeName()
  {
    return (EAttribute)interfaceTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDCLSubSystem()
  {
    return dclSubSystemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDCLSubSystem_SubSystem()
  {
    return (EReference)dclSubSystemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDCLModule()
  {
    return dclModuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDCDecl()
  {
    return dcDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDCDecl_Only()
  {
    return (EReference)dcDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDCDecl_T()
  {
    return (EReference)dcDeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDCDecl_Can()
  {
    return (EReference)dcDeclEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDCDecl_ElementType()
  {
    return (EReference)dcDeclEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDCDecl_Type()
  {
    return (EReference)dcDeclEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDCDecl_Cannot()
  {
    return (EReference)dcDeclEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDCDecl_Only2()
  {
    return (EReference)dcDeclEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDCDecl_Must()
  {
    return (EReference)dcDeclEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDCDecl_EntityType()
  {
    return (EReference)dcDeclEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOnly()
  {
    return onlyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOnly_Only()
  {
    return (EAttribute)onlyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCan()
  {
    return canEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCan_Can()
  {
    return (EAttribute)canEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCannot()
  {
    return cannotEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCannot_Cannot()
  {
    return (EAttribute)cannotEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOnly2()
  {
    return only2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOnly2_Only2()
  {
    return (EAttribute)only2EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMust()
  {
    return mustEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMust_Must()
  {
    return (EAttribute)mustEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElementType()
  {
    return elementTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBasicType()
  {
    return basicTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBasicType_TypeName()
  {
    return (EAttribute)basicTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntityType()
  {
    return entityTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEntityType_Entity()
  {
    return (EAttribute)entityTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DCLFactory getDCLFactory()
  {
    return (DCLFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__STRUCTURE_ELEMENTS);
    createEReference(modelEClass, MODEL__DC_DECL);

    dclStructureElementEClass = createEClass(DCL_STRUCTURE_ELEMENT);
    createEAttribute(dclStructureElementEClass, DCL_STRUCTURE_ELEMENT__NAME);

    dclLayerEClass = createEClass(DCL_LAYER);
    createEAttribute(dclLayerEClass, DCL_LAYER__LEVEL);
    createEReference(dclLayerEClass, DCL_LAYER__LAYER);
    createEReference(dclLayerEClass, DCL_LAYER__SUB_SYSTEM);
    createEReference(dclLayerEClass, DCL_LAYER__COMPONENT);

    dclComponentEClass = createEClass(DCL_COMPONENT);
    createEReference(dclComponentEClass, DCL_COMPONENT__LAYER);
    createEReference(dclComponentEClass, DCL_COMPONENT__SUB_SYSTEM);

    dclComponentInterfaceEClass = createEClass(DCL_COMPONENT_INTERFACE);
    createEReference(dclComponentInterfaceEClass, DCL_COMPONENT_INTERFACE__COMPONENT);
    createEReference(dclComponentInterfaceEClass, DCL_COMPONENT_INTERFACE__INTERFACE_TYPE);

    interfaceTypeEClass = createEClass(INTERFACE_TYPE);
    createEAttribute(interfaceTypeEClass, INTERFACE_TYPE__INTERFACE_TYPE_NAME);

    dclSubSystemEClass = createEClass(DCL_SUB_SYSTEM);
    createEReference(dclSubSystemEClass, DCL_SUB_SYSTEM__SUB_SYSTEM);

    dclModuleEClass = createEClass(DCL_MODULE);

    dcDeclEClass = createEClass(DC_DECL);
    createEReference(dcDeclEClass, DC_DECL__ONLY);
    createEReference(dcDeclEClass, DC_DECL__T);
    createEReference(dcDeclEClass, DC_DECL__CAN);
    createEReference(dcDeclEClass, DC_DECL__ELEMENT_TYPE);
    createEReference(dcDeclEClass, DC_DECL__TYPE);
    createEReference(dcDeclEClass, DC_DECL__CANNOT);
    createEReference(dcDeclEClass, DC_DECL__ONLY2);
    createEReference(dcDeclEClass, DC_DECL__MUST);
    createEReference(dcDeclEClass, DC_DECL__ENTITY_TYPE);

    onlyEClass = createEClass(ONLY);
    createEAttribute(onlyEClass, ONLY__ONLY);

    canEClass = createEClass(CAN);
    createEAttribute(canEClass, CAN__CAN);

    cannotEClass = createEClass(CANNOT);
    createEAttribute(cannotEClass, CANNOT__CANNOT);

    only2EClass = createEClass(ONLY2);
    createEAttribute(only2EClass, ONLY2__ONLY2);

    mustEClass = createEClass(MUST);
    createEAttribute(mustEClass, MUST__MUST);

    elementTypeEClass = createEClass(ELEMENT_TYPE);

    basicTypeEClass = createEClass(BASIC_TYPE);
    createEAttribute(basicTypeEClass, BASIC_TYPE__TYPE_NAME);

    entityTypeEClass = createEClass(ENTITY_TYPE);
    createEAttribute(entityTypeEClass, ENTITY_TYPE__ENTITY);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    dclLayerEClass.getESuperTypes().add(this.getDCLStructureElement());
    dclComponentEClass.getESuperTypes().add(this.getDCLStructureElement());
    dclComponentInterfaceEClass.getESuperTypes().add(this.getDCLStructureElement());
    dclSubSystemEClass.getESuperTypes().add(this.getDCLStructureElement());
    dclModuleEClass.getESuperTypes().add(this.getDCLStructureElement());
    basicTypeEClass.getESuperTypes().add(this.getElementType());
    entityTypeEClass.getESuperTypes().add(this.getElementType());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_StructureElements(), this.getDCLStructureElement(), null, "structureElements", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_DCDecl(), this.getDCDecl(), null, "dCDecl", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dclStructureElementEClass, DCLStructureElement.class, "DCLStructureElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDCLStructureElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, DCLStructureElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dclLayerEClass, DCLLayer.class, "DCLLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDCLLayer_Level(), ecorePackage.getEInt(), "level", null, 0, 1, DCLLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDCLLayer_Layer(), this.getDCLStructureElement(), null, "layer", null, 0, 1, DCLLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDCLLayer_SubSystem(), this.getDCLStructureElement(), null, "subSystem", null, 0, 1, DCLLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDCLLayer_Component(), this.getDCLStructureElement(), null, "component", null, 0, 1, DCLLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dclComponentEClass, DCLComponent.class, "DCLComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDCLComponent_Layer(), this.getDCLStructureElement(), null, "layer", null, 0, 1, DCLComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDCLComponent_SubSystem(), this.getDCLStructureElement(), null, "subSystem", null, 0, 1, DCLComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dclComponentInterfaceEClass, DCLComponentInterface.class, "DCLComponentInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDCLComponentInterface_Component(), this.getDCLStructureElement(), null, "component", null, 0, 1, DCLComponentInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDCLComponentInterface_InterfaceType(), this.getInterfaceType(), null, "interfaceType", null, 0, 1, DCLComponentInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interfaceTypeEClass, InterfaceType.class, "InterfaceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInterfaceType_InterfaceTypeName(), ecorePackage.getEString(), "interfaceTypeName", null, 0, 1, InterfaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dclSubSystemEClass, DCLSubSystem.class, "DCLSubSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDCLSubSystem_SubSystem(), this.getDCLStructureElement(), null, "subSystem", null, 0, 1, DCLSubSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dclModuleEClass, DCLModule.class, "DCLModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dcDeclEClass, DCDecl.class, "DCDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDCDecl_Only(), this.getOnly(), null, "only", null, 0, 1, DCDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDCDecl_T(), this.getDCLStructureElement(), null, "t", null, 0, 1, DCDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDCDecl_Can(), this.getCan(), null, "can", null, 0, 1, DCDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDCDecl_ElementType(), this.getElementType(), null, "elementType", null, 0, 1, DCDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDCDecl_Type(), this.getDCLStructureElement(), null, "type", null, 0, 1, DCDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDCDecl_Cannot(), this.getCannot(), null, "cannot", null, 0, 1, DCDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDCDecl_Only2(), this.getOnly2(), null, "only2", null, 0, 1, DCDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDCDecl_Must(), this.getMust(), null, "must", null, 0, 1, DCDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDCDecl_EntityType(), this.getEntityType(), null, "entityType", null, 0, 1, DCDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(onlyEClass, Only.class, "Only", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOnly_Only(), ecorePackage.getEString(), "only", null, 0, 1, Only.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(canEClass, Can.class, "Can", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCan_Can(), ecorePackage.getEString(), "can", null, 0, 1, Can.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cannotEClass, Cannot.class, "Cannot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCannot_Cannot(), ecorePackage.getEString(), "cannot", null, 0, 1, Cannot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(only2EClass, Only2.class, "Only2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOnly2_Only2(), ecorePackage.getEString(), "only2", null, 0, 1, Only2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mustEClass, Must.class, "Must", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMust_Must(), ecorePackage.getEString(), "must", null, 0, 1, Must.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elementTypeEClass, ElementType.class, "ElementType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(basicTypeEClass, BasicType.class, "BasicType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBasicType_TypeName(), ecorePackage.getEString(), "typeName", null, 0, 1, BasicType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(entityTypeEClass, EntityType.class, "EntityType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEntityType_Entity(), ecorePackage.getEString(), "entity", null, 0, 1, EntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //DCLPackageImpl
