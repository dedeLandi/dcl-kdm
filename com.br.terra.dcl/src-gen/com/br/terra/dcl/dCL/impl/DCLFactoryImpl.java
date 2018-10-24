/**
 */
package com.br.terra.dcl.dCL.impl;

import com.br.terra.dcl.dCL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DCLFactoryImpl extends EFactoryImpl implements DCLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DCLFactory init()
  {
    try
    {
      DCLFactory theDCLFactory = (DCLFactory)EPackage.Registry.INSTANCE.getEFactory(DCLPackage.eNS_URI);
      if (theDCLFactory != null)
      {
        return theDCLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DCLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DCLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case DCLPackage.MODEL: return createModel();
      case DCLPackage.DCL_STRUCTURE_ELEMENT: return createDCLStructureElement();
      case DCLPackage.DCL_MANAGED_SUBSYSTEM: return createDCLManagedSubsystem();
      case DCLPackage.DCL_MANAGING_SUBSYSTEM: return createDCLManagingSubsystem();
      case DCLPackage.DCL_MONITOR: return createDCLMonitor();
      case DCLPackage.DCL_PLANNER: return createDCLPlanner();
      case DCLPackage.DCL_ANALYZER: return createDCLAnalyzer();
      case DCLPackage.DCL_EXECUTOR: return createDCLExecutor();
      case DCLPackage.DCL_SENSOR: return createDCLSensor();
      case DCLPackage.DCL_ACTUATOR: return createDCLActuator();
      case DCLPackage.DCL_KNOWLEDGE: return createDCLKnowledge();
      case DCLPackage.DCL_REFERENCES: return createDCLReferences();
      case DCLPackage.DCL_LAYER: return createDCLLayer();
      case DCLPackage.DCL_COMPONENT: return createDCLComponent();
      case DCLPackage.DCL_COMPONENT_INTERFACE: return createDCLComponentInterface();
      case DCLPackage.INTERFACE_TYPE: return createInterfaceType();
      case DCLPackage.DCL_SUB_SYSTEM: return createDCLSubSystem();
      case DCLPackage.DCL_MODULE: return createDCLModule();
      case DCLPackage.DC_DECL: return createDCDecl();
      case DCLPackage.ONLY: return createOnly();
      case DCLPackage.CAN: return createCan();
      case DCLPackage.CANNOT: return createCannot();
      case DCLPackage.ONLY2: return createOnly2();
      case DCLPackage.MUST: return createMust();
      case DCLPackage.ELEMENT_TYPE: return createElementType();
      case DCLPackage.BASIC_TYPE: return createBasicType();
      case DCLPackage.ENTITY_TYPE: return createEntityType();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DCLStructureElement createDCLStructureElement()
  {
    DCLStructureElementImpl dclStructureElement = new DCLStructureElementImpl();
    return dclStructureElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DCLManagedSubsystem createDCLManagedSubsystem()
  {
    DCLManagedSubsystemImpl dclManagedSubsystem = new DCLManagedSubsystemImpl();
    return dclManagedSubsystem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DCLManagingSubsystem createDCLManagingSubsystem()
  {
    DCLManagingSubsystemImpl dclManagingSubsystem = new DCLManagingSubsystemImpl();
    return dclManagingSubsystem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DCLMonitor createDCLMonitor()
  {
    DCLMonitorImpl dclMonitor = new DCLMonitorImpl();
    return dclMonitor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DCLPlanner createDCLPlanner()
  {
    DCLPlannerImpl dclPlanner = new DCLPlannerImpl();
    return dclPlanner;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DCLAnalyzer createDCLAnalyzer()
  {
    DCLAnalyzerImpl dclAnalyzer = new DCLAnalyzerImpl();
    return dclAnalyzer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DCLExecutor createDCLExecutor()
  {
    DCLExecutorImpl dclExecutor = new DCLExecutorImpl();
    return dclExecutor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DCLSensor createDCLSensor()
  {
    DCLSensorImpl dclSensor = new DCLSensorImpl();
    return dclSensor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DCLActuator createDCLActuator()
  {
    DCLActuatorImpl dclActuator = new DCLActuatorImpl();
    return dclActuator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DCLKnowledge createDCLKnowledge()
  {
    DCLKnowledgeImpl dclKnowledge = new DCLKnowledgeImpl();
    return dclKnowledge;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DCLReferences createDCLReferences()
  {
    DCLReferencesImpl dclReferences = new DCLReferencesImpl();
    return dclReferences;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DCLLayer createDCLLayer()
  {
    DCLLayerImpl dclLayer = new DCLLayerImpl();
    return dclLayer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DCLComponent createDCLComponent()
  {
    DCLComponentImpl dclComponent = new DCLComponentImpl();
    return dclComponent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DCLComponentInterface createDCLComponentInterface()
  {
    DCLComponentInterfaceImpl dclComponentInterface = new DCLComponentInterfaceImpl();
    return dclComponentInterface;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfaceType createInterfaceType()
  {
    InterfaceTypeImpl interfaceType = new InterfaceTypeImpl();
    return interfaceType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DCLSubSystem createDCLSubSystem()
  {
    DCLSubSystemImpl dclSubSystem = new DCLSubSystemImpl();
    return dclSubSystem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DCLModule createDCLModule()
  {
    DCLModuleImpl dclModule = new DCLModuleImpl();
    return dclModule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DCDecl createDCDecl()
  {
    DCDeclImpl dcDecl = new DCDeclImpl();
    return dcDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Only createOnly()
  {
    OnlyImpl only = new OnlyImpl();
    return only;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Can createCan()
  {
    CanImpl can = new CanImpl();
    return can;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cannot createCannot()
  {
    CannotImpl cannot = new CannotImpl();
    return cannot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Only2 createOnly2()
  {
    Only2Impl only2 = new Only2Impl();
    return only2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Must createMust()
  {
    MustImpl must = new MustImpl();
    return must;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementType createElementType()
  {
    ElementTypeImpl elementType = new ElementTypeImpl();
    return elementType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicType createBasicType()
  {
    BasicTypeImpl basicType = new BasicTypeImpl();
    return basicType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityType createEntityType()
  {
    EntityTypeImpl entityType = new EntityTypeImpl();
    return entityType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DCLPackage getDCLPackage()
  {
    return (DCLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DCLPackage getPackage()
  {
    return DCLPackage.eINSTANCE;
  }

} //DCLFactoryImpl
