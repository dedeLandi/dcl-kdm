/**
 */
package com.br.terra.dcl.dCL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.br.terra.dcl.dCL.DCLFactory
 * @model kind="package"
 * @generated
 */
public interface DCLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "dCL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.br.com/terra/dcl/DCL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "dCL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DCLPackage eINSTANCE = com.br.terra.dcl.dCL.impl.DCLPackageImpl.init();

  /**
   * The meta object id for the '{@link com.br.terra.dcl.dCL.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.br.terra.dcl.dCL.impl.ModelImpl
   * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Structure Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__STRUCTURE_ELEMENTS = 0;

  /**
   * The feature id for the '<em><b>DC Decl</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__DC_DECL = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.br.terra.dcl.dCL.impl.DCLStructureElementImpl <em>Structure Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.br.terra.dcl.dCL.impl.DCLStructureElementImpl
   * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getDCLStructureElement()
   * @generated
   */
  int DCL_STRUCTURE_ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_STRUCTURE_ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Structure Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_STRUCTURE_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.br.terra.dcl.dCL.impl.DCLManagedSubsystemImpl <em>Managed Subsystem</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.br.terra.dcl.dCL.impl.DCLManagedSubsystemImpl
   * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getDCLManagedSubsystem()
   * @generated
   */
  int DCL_MANAGED_SUBSYSTEM = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_MANAGED_SUBSYSTEM__NAME = DCL_STRUCTURE_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Managed Subsystem</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_MANAGED_SUBSYSTEM__MANAGED_SUBSYSTEM = DCL_STRUCTURE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Managed Subsystem</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_MANAGED_SUBSYSTEM_FEATURE_COUNT = DCL_STRUCTURE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.br.terra.dcl.dCL.impl.DCLManagingSubsystemImpl <em>Managing Subsystem</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.br.terra.dcl.dCL.impl.DCLManagingSubsystemImpl
   * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getDCLManagingSubsystem()
   * @generated
   */
  int DCL_MANAGING_SUBSYSTEM = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_MANAGING_SUBSYSTEM__NAME = DCL_STRUCTURE_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Managing Subsystem</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_MANAGING_SUBSYSTEM__MANAGING_SUBSYSTEM = DCL_STRUCTURE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Managing Subsystem</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_MANAGING_SUBSYSTEM_FEATURE_COUNT = DCL_STRUCTURE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.br.terra.dcl.dCL.impl.DCLMonitorImpl <em>Monitor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.br.terra.dcl.dCL.impl.DCLMonitorImpl
   * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getDCLMonitor()
   * @generated
   */
  int DCL_MONITOR = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_MONITOR__NAME = DCL_STRUCTURE_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Managing Subsystem</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_MONITOR__MANAGING_SUBSYSTEM = DCL_STRUCTURE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Monitor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_MONITOR_FEATURE_COUNT = DCL_STRUCTURE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.br.terra.dcl.dCL.impl.DCLPlannerImpl <em>Planner</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.br.terra.dcl.dCL.impl.DCLPlannerImpl
   * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getDCLPlanner()
   * @generated
   */
  int DCL_PLANNER = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_PLANNER__NAME = DCL_STRUCTURE_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Managing Subsystem</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_PLANNER__MANAGING_SUBSYSTEM = DCL_STRUCTURE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Planner</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_PLANNER_FEATURE_COUNT = DCL_STRUCTURE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.br.terra.dcl.dCL.impl.DCLAnalyzerImpl <em>Analyzer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.br.terra.dcl.dCL.impl.DCLAnalyzerImpl
   * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getDCLAnalyzer()
   * @generated
   */
  int DCL_ANALYZER = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_ANALYZER__NAME = DCL_STRUCTURE_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Managing Subsystem</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_ANALYZER__MANAGING_SUBSYSTEM = DCL_STRUCTURE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Analyzer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_ANALYZER_FEATURE_COUNT = DCL_STRUCTURE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.br.terra.dcl.dCL.impl.DCLExecutorImpl <em>Executor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.br.terra.dcl.dCL.impl.DCLExecutorImpl
   * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getDCLExecutor()
   * @generated
   */
  int DCL_EXECUTOR = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_EXECUTOR__NAME = DCL_STRUCTURE_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Managing Subsystem</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_EXECUTOR__MANAGING_SUBSYSTEM = DCL_STRUCTURE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Executor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_EXECUTOR_FEATURE_COUNT = DCL_STRUCTURE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.br.terra.dcl.dCL.impl.DCLSensorImpl <em>Sensor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.br.terra.dcl.dCL.impl.DCLSensorImpl
   * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getDCLSensor()
   * @generated
   */
  int DCL_SENSOR = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_SENSOR__NAME = DCL_STRUCTURE_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Managing Subsystem</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_SENSOR__MANAGING_SUBSYSTEM = DCL_STRUCTURE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Sensor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_SENSOR_FEATURE_COUNT = DCL_STRUCTURE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.br.terra.dcl.dCL.impl.DCLActuatorImpl <em>Actuator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.br.terra.dcl.dCL.impl.DCLActuatorImpl
   * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getDCLActuator()
   * @generated
   */
  int DCL_ACTUATOR = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_ACTUATOR__NAME = DCL_STRUCTURE_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Managing Subsystem</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_ACTUATOR__MANAGING_SUBSYSTEM = DCL_STRUCTURE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Actuator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_ACTUATOR_FEATURE_COUNT = DCL_STRUCTURE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.br.terra.dcl.dCL.impl.DCLKnowledgeImpl <em>Knowledge</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.br.terra.dcl.dCL.impl.DCLKnowledgeImpl
   * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getDCLKnowledge()
   * @generated
   */
  int DCL_KNOWLEDGE = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_KNOWLEDGE__NAME = DCL_STRUCTURE_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Managing Subsystem</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_KNOWLEDGE__MANAGING_SUBSYSTEM = DCL_STRUCTURE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Knowledge</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_KNOWLEDGE_FEATURE_COUNT = DCL_STRUCTURE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.br.terra.dcl.dCL.impl.DCLReferencesImpl <em>References</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.br.terra.dcl.dCL.impl.DCLReferencesImpl
   * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getDCLReferences()
   * @generated
   */
  int DCL_REFERENCES = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_REFERENCES__NAME = DCL_STRUCTURE_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Managing Subsystem</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_REFERENCES__MANAGING_SUBSYSTEM = DCL_STRUCTURE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Knowledge</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_REFERENCES__KNOWLEDGE = DCL_STRUCTURE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>References</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_REFERENCES_FEATURE_COUNT = DCL_STRUCTURE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.br.terra.dcl.dCL.impl.DCLLayerImpl <em>Layer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.br.terra.dcl.dCL.impl.DCLLayerImpl
   * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getDCLLayer()
   * @generated
   */
  int DCL_LAYER = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_LAYER__NAME = DCL_STRUCTURE_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Level</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_LAYER__LEVEL = DCL_STRUCTURE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Layer</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_LAYER__LAYER = DCL_STRUCTURE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Sub System</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_LAYER__SUB_SYSTEM = DCL_STRUCTURE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Component</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_LAYER__COMPONENT = DCL_STRUCTURE_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Layer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_LAYER_FEATURE_COUNT = DCL_STRUCTURE_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.br.terra.dcl.dCL.impl.DCLComponentImpl <em>Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.br.terra.dcl.dCL.impl.DCLComponentImpl
   * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getDCLComponent()
   * @generated
   */
  int DCL_COMPONENT = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_COMPONENT__NAME = DCL_STRUCTURE_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Layer</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_COMPONENT__LAYER = DCL_STRUCTURE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Sub System</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_COMPONENT__SUB_SYSTEM = DCL_STRUCTURE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_COMPONENT_FEATURE_COUNT = DCL_STRUCTURE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.br.terra.dcl.dCL.impl.DCLComponentInterfaceImpl <em>Component Interface</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.br.terra.dcl.dCL.impl.DCLComponentInterfaceImpl
   * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getDCLComponentInterface()
   * @generated
   */
  int DCL_COMPONENT_INTERFACE = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_COMPONENT_INTERFACE__NAME = DCL_STRUCTURE_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Component</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_COMPONENT_INTERFACE__COMPONENT = DCL_STRUCTURE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Interface Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_COMPONENT_INTERFACE__INTERFACE_TYPE = DCL_STRUCTURE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Component Interface</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_COMPONENT_INTERFACE_FEATURE_COUNT = DCL_STRUCTURE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.br.terra.dcl.dCL.impl.InterfaceTypeImpl <em>Interface Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.br.terra.dcl.dCL.impl.InterfaceTypeImpl
   * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getInterfaceType()
   * @generated
   */
  int INTERFACE_TYPE = 15;

  /**
   * The feature id for the '<em><b>Interface Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_TYPE__INTERFACE_TYPE_NAME = 0;

  /**
   * The number of structural features of the '<em>Interface Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.br.terra.dcl.dCL.impl.DCLSubSystemImpl <em>Sub System</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.br.terra.dcl.dCL.impl.DCLSubSystemImpl
   * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getDCLSubSystem()
   * @generated
   */
  int DCL_SUB_SYSTEM = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_SUB_SYSTEM__NAME = DCL_STRUCTURE_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Sub System</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_SUB_SYSTEM__SUB_SYSTEM = DCL_STRUCTURE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Sub System</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_SUB_SYSTEM_FEATURE_COUNT = DCL_STRUCTURE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.br.terra.dcl.dCL.impl.DCLModuleImpl <em>Module</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.br.terra.dcl.dCL.impl.DCLModuleImpl
   * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getDCLModule()
   * @generated
   */
  int DCL_MODULE = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_MODULE__NAME = DCL_STRUCTURE_ELEMENT__NAME;

  /**
   * The number of structural features of the '<em>Module</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCL_MODULE_FEATURE_COUNT = DCL_STRUCTURE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.br.terra.dcl.dCL.impl.DCDeclImpl <em>DC Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.br.terra.dcl.dCL.impl.DCDeclImpl
   * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getDCDecl()
   * @generated
   */
  int DC_DECL = 18;

  /**
   * The feature id for the '<em><b>Only</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DC_DECL__ONLY = 0;

  /**
   * The feature id for the '<em><b>T</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DC_DECL__T = 1;

  /**
   * The feature id for the '<em><b>Can</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DC_DECL__CAN = 2;

  /**
   * The feature id for the '<em><b>Element Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DC_DECL__ELEMENT_TYPE = 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DC_DECL__TYPE = 4;

  /**
   * The feature id for the '<em><b>Cannot</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DC_DECL__CANNOT = 5;

  /**
   * The feature id for the '<em><b>Only2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DC_DECL__ONLY2 = 6;

  /**
   * The feature id for the '<em><b>Must</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DC_DECL__MUST = 7;

  /**
   * The feature id for the '<em><b>Entity Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DC_DECL__ENTITY_TYPE = 8;

  /**
   * The number of structural features of the '<em>DC Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DC_DECL_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link com.br.terra.dcl.dCL.impl.OnlyImpl <em>Only</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.br.terra.dcl.dCL.impl.OnlyImpl
   * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getOnly()
   * @generated
   */
  int ONLY = 19;

  /**
   * The feature id for the '<em><b>Only</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONLY__ONLY = 0;

  /**
   * The number of structural features of the '<em>Only</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONLY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.br.terra.dcl.dCL.impl.CanImpl <em>Can</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.br.terra.dcl.dCL.impl.CanImpl
   * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getCan()
   * @generated
   */
  int CAN = 20;

  /**
   * The feature id for the '<em><b>Can</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAN__CAN = 0;

  /**
   * The number of structural features of the '<em>Can</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAN_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.br.terra.dcl.dCL.impl.CannotImpl <em>Cannot</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.br.terra.dcl.dCL.impl.CannotImpl
   * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getCannot()
   * @generated
   */
  int CANNOT = 21;

  /**
   * The feature id for the '<em><b>Cannot</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CANNOT__CANNOT = 0;

  /**
   * The number of structural features of the '<em>Cannot</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CANNOT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.br.terra.dcl.dCL.impl.Only2Impl <em>Only2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.br.terra.dcl.dCL.impl.Only2Impl
   * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getOnly2()
   * @generated
   */
  int ONLY2 = 22;

  /**
   * The feature id for the '<em><b>Only2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONLY2__ONLY2 = 0;

  /**
   * The number of structural features of the '<em>Only2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONLY2_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.br.terra.dcl.dCL.impl.MustImpl <em>Must</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.br.terra.dcl.dCL.impl.MustImpl
   * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getMust()
   * @generated
   */
  int MUST = 23;

  /**
   * The feature id for the '<em><b>Must</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUST__MUST = 0;

  /**
   * The number of structural features of the '<em>Must</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.br.terra.dcl.dCL.impl.ElementTypeImpl <em>Element Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.br.terra.dcl.dCL.impl.ElementTypeImpl
   * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getElementType()
   * @generated
   */
  int ELEMENT_TYPE = 24;

  /**
   * The number of structural features of the '<em>Element Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.br.terra.dcl.dCL.impl.BasicTypeImpl <em>Basic Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.br.terra.dcl.dCL.impl.BasicTypeImpl
   * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getBasicType()
   * @generated
   */
  int BASIC_TYPE = 25;

  /**
   * The feature id for the '<em><b>Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_TYPE__TYPE_NAME = ELEMENT_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Basic Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_TYPE_FEATURE_COUNT = ELEMENT_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.br.terra.dcl.dCL.impl.EntityTypeImpl <em>Entity Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.br.terra.dcl.dCL.impl.EntityTypeImpl
   * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getEntityType()
   * @generated
   */
  int ENTITY_TYPE = 26;

  /**
   * The feature id for the '<em><b>Entity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_TYPE__ENTITY = ELEMENT_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Entity Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_TYPE_FEATURE_COUNT = ELEMENT_TYPE_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link com.br.terra.dcl.dCL.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see com.br.terra.dcl.dCL.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link com.br.terra.dcl.dCL.Model#getStructureElements <em>Structure Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Structure Elements</em>'.
   * @see com.br.terra.dcl.dCL.Model#getStructureElements()
   * @see #getModel()
   * @generated
   */
  EReference getModel_StructureElements();

  /**
   * Returns the meta object for the containment reference list '{@link com.br.terra.dcl.dCL.Model#getDCDecl <em>DC Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>DC Decl</em>'.
   * @see com.br.terra.dcl.dCL.Model#getDCDecl()
   * @see #getModel()
   * @generated
   */
  EReference getModel_DCDecl();

  /**
   * Returns the meta object for class '{@link com.br.terra.dcl.dCL.DCLStructureElement <em>Structure Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Structure Element</em>'.
   * @see com.br.terra.dcl.dCL.DCLStructureElement
   * @generated
   */
  EClass getDCLStructureElement();

  /**
   * Returns the meta object for the attribute '{@link com.br.terra.dcl.dCL.DCLStructureElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.br.terra.dcl.dCL.DCLStructureElement#getName()
   * @see #getDCLStructureElement()
   * @generated
   */
  EAttribute getDCLStructureElement_Name();

  /**
   * Returns the meta object for class '{@link com.br.terra.dcl.dCL.DCLManagedSubsystem <em>Managed Subsystem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Managed Subsystem</em>'.
   * @see com.br.terra.dcl.dCL.DCLManagedSubsystem
   * @generated
   */
  EClass getDCLManagedSubsystem();

  /**
   * Returns the meta object for the reference '{@link com.br.terra.dcl.dCL.DCLManagedSubsystem#getManagedSubsystem <em>Managed Subsystem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Managed Subsystem</em>'.
   * @see com.br.terra.dcl.dCL.DCLManagedSubsystem#getManagedSubsystem()
   * @see #getDCLManagedSubsystem()
   * @generated
   */
  EReference getDCLManagedSubsystem_ManagedSubsystem();

  /**
   * Returns the meta object for class '{@link com.br.terra.dcl.dCL.DCLManagingSubsystem <em>Managing Subsystem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Managing Subsystem</em>'.
   * @see com.br.terra.dcl.dCL.DCLManagingSubsystem
   * @generated
   */
  EClass getDCLManagingSubsystem();

  /**
   * Returns the meta object for the reference '{@link com.br.terra.dcl.dCL.DCLManagingSubsystem#getManagingSubsystem <em>Managing Subsystem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Managing Subsystem</em>'.
   * @see com.br.terra.dcl.dCL.DCLManagingSubsystem#getManagingSubsystem()
   * @see #getDCLManagingSubsystem()
   * @generated
   */
  EReference getDCLManagingSubsystem_ManagingSubsystem();

  /**
   * Returns the meta object for class '{@link com.br.terra.dcl.dCL.DCLMonitor <em>Monitor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Monitor</em>'.
   * @see com.br.terra.dcl.dCL.DCLMonitor
   * @generated
   */
  EClass getDCLMonitor();

  /**
   * Returns the meta object for the reference '{@link com.br.terra.dcl.dCL.DCLMonitor#getManagingSubsystem <em>Managing Subsystem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Managing Subsystem</em>'.
   * @see com.br.terra.dcl.dCL.DCLMonitor#getManagingSubsystem()
   * @see #getDCLMonitor()
   * @generated
   */
  EReference getDCLMonitor_ManagingSubsystem();

  /**
   * Returns the meta object for class '{@link com.br.terra.dcl.dCL.DCLPlanner <em>Planner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Planner</em>'.
   * @see com.br.terra.dcl.dCL.DCLPlanner
   * @generated
   */
  EClass getDCLPlanner();

  /**
   * Returns the meta object for the reference '{@link com.br.terra.dcl.dCL.DCLPlanner#getManagingSubsystem <em>Managing Subsystem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Managing Subsystem</em>'.
   * @see com.br.terra.dcl.dCL.DCLPlanner#getManagingSubsystem()
   * @see #getDCLPlanner()
   * @generated
   */
  EReference getDCLPlanner_ManagingSubsystem();

  /**
   * Returns the meta object for class '{@link com.br.terra.dcl.dCL.DCLAnalyzer <em>Analyzer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Analyzer</em>'.
   * @see com.br.terra.dcl.dCL.DCLAnalyzer
   * @generated
   */
  EClass getDCLAnalyzer();

  /**
   * Returns the meta object for the reference '{@link com.br.terra.dcl.dCL.DCLAnalyzer#getManagingSubsystem <em>Managing Subsystem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Managing Subsystem</em>'.
   * @see com.br.terra.dcl.dCL.DCLAnalyzer#getManagingSubsystem()
   * @see #getDCLAnalyzer()
   * @generated
   */
  EReference getDCLAnalyzer_ManagingSubsystem();

  /**
   * Returns the meta object for class '{@link com.br.terra.dcl.dCL.DCLExecutor <em>Executor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Executor</em>'.
   * @see com.br.terra.dcl.dCL.DCLExecutor
   * @generated
   */
  EClass getDCLExecutor();

  /**
   * Returns the meta object for the reference '{@link com.br.terra.dcl.dCL.DCLExecutor#getManagingSubsystem <em>Managing Subsystem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Managing Subsystem</em>'.
   * @see com.br.terra.dcl.dCL.DCLExecutor#getManagingSubsystem()
   * @see #getDCLExecutor()
   * @generated
   */
  EReference getDCLExecutor_ManagingSubsystem();

  /**
   * Returns the meta object for class '{@link com.br.terra.dcl.dCL.DCLSensor <em>Sensor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sensor</em>'.
   * @see com.br.terra.dcl.dCL.DCLSensor
   * @generated
   */
  EClass getDCLSensor();

  /**
   * Returns the meta object for the reference '{@link com.br.terra.dcl.dCL.DCLSensor#getManagingSubsystem <em>Managing Subsystem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Managing Subsystem</em>'.
   * @see com.br.terra.dcl.dCL.DCLSensor#getManagingSubsystem()
   * @see #getDCLSensor()
   * @generated
   */
  EReference getDCLSensor_ManagingSubsystem();

  /**
   * Returns the meta object for class '{@link com.br.terra.dcl.dCL.DCLActuator <em>Actuator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Actuator</em>'.
   * @see com.br.terra.dcl.dCL.DCLActuator
   * @generated
   */
  EClass getDCLActuator();

  /**
   * Returns the meta object for the reference '{@link com.br.terra.dcl.dCL.DCLActuator#getManagingSubsystem <em>Managing Subsystem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Managing Subsystem</em>'.
   * @see com.br.terra.dcl.dCL.DCLActuator#getManagingSubsystem()
   * @see #getDCLActuator()
   * @generated
   */
  EReference getDCLActuator_ManagingSubsystem();

  /**
   * Returns the meta object for class '{@link com.br.terra.dcl.dCL.DCLKnowledge <em>Knowledge</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Knowledge</em>'.
   * @see com.br.terra.dcl.dCL.DCLKnowledge
   * @generated
   */
  EClass getDCLKnowledge();

  /**
   * Returns the meta object for the reference '{@link com.br.terra.dcl.dCL.DCLKnowledge#getManagingSubsystem <em>Managing Subsystem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Managing Subsystem</em>'.
   * @see com.br.terra.dcl.dCL.DCLKnowledge#getManagingSubsystem()
   * @see #getDCLKnowledge()
   * @generated
   */
  EReference getDCLKnowledge_ManagingSubsystem();

  /**
   * Returns the meta object for class '{@link com.br.terra.dcl.dCL.DCLReferences <em>References</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>References</em>'.
   * @see com.br.terra.dcl.dCL.DCLReferences
   * @generated
   */
  EClass getDCLReferences();

  /**
   * Returns the meta object for the reference '{@link com.br.terra.dcl.dCL.DCLReferences#getManagingSubsystem <em>Managing Subsystem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Managing Subsystem</em>'.
   * @see com.br.terra.dcl.dCL.DCLReferences#getManagingSubsystem()
   * @see #getDCLReferences()
   * @generated
   */
  EReference getDCLReferences_ManagingSubsystem();

  /**
   * Returns the meta object for the reference '{@link com.br.terra.dcl.dCL.DCLReferences#getKnowledge <em>Knowledge</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Knowledge</em>'.
   * @see com.br.terra.dcl.dCL.DCLReferences#getKnowledge()
   * @see #getDCLReferences()
   * @generated
   */
  EReference getDCLReferences_Knowledge();

  /**
   * Returns the meta object for class '{@link com.br.terra.dcl.dCL.DCLLayer <em>Layer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Layer</em>'.
   * @see com.br.terra.dcl.dCL.DCLLayer
   * @generated
   */
  EClass getDCLLayer();

  /**
   * Returns the meta object for the attribute '{@link com.br.terra.dcl.dCL.DCLLayer#getLevel <em>Level</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Level</em>'.
   * @see com.br.terra.dcl.dCL.DCLLayer#getLevel()
   * @see #getDCLLayer()
   * @generated
   */
  EAttribute getDCLLayer_Level();

  /**
   * Returns the meta object for the reference '{@link com.br.terra.dcl.dCL.DCLLayer#getLayer <em>Layer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Layer</em>'.
   * @see com.br.terra.dcl.dCL.DCLLayer#getLayer()
   * @see #getDCLLayer()
   * @generated
   */
  EReference getDCLLayer_Layer();

  /**
   * Returns the meta object for the reference '{@link com.br.terra.dcl.dCL.DCLLayer#getSubSystem <em>Sub System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Sub System</em>'.
   * @see com.br.terra.dcl.dCL.DCLLayer#getSubSystem()
   * @see #getDCLLayer()
   * @generated
   */
  EReference getDCLLayer_SubSystem();

  /**
   * Returns the meta object for the reference '{@link com.br.terra.dcl.dCL.DCLLayer#getComponent <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Component</em>'.
   * @see com.br.terra.dcl.dCL.DCLLayer#getComponent()
   * @see #getDCLLayer()
   * @generated
   */
  EReference getDCLLayer_Component();

  /**
   * Returns the meta object for class '{@link com.br.terra.dcl.dCL.DCLComponent <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component</em>'.
   * @see com.br.terra.dcl.dCL.DCLComponent
   * @generated
   */
  EClass getDCLComponent();

  /**
   * Returns the meta object for the reference '{@link com.br.terra.dcl.dCL.DCLComponent#getLayer <em>Layer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Layer</em>'.
   * @see com.br.terra.dcl.dCL.DCLComponent#getLayer()
   * @see #getDCLComponent()
   * @generated
   */
  EReference getDCLComponent_Layer();

  /**
   * Returns the meta object for the reference '{@link com.br.terra.dcl.dCL.DCLComponent#getSubSystem <em>Sub System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Sub System</em>'.
   * @see com.br.terra.dcl.dCL.DCLComponent#getSubSystem()
   * @see #getDCLComponent()
   * @generated
   */
  EReference getDCLComponent_SubSystem();

  /**
   * Returns the meta object for class '{@link com.br.terra.dcl.dCL.DCLComponentInterface <em>Component Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component Interface</em>'.
   * @see com.br.terra.dcl.dCL.DCLComponentInterface
   * @generated
   */
  EClass getDCLComponentInterface();

  /**
   * Returns the meta object for the reference '{@link com.br.terra.dcl.dCL.DCLComponentInterface#getComponent <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Component</em>'.
   * @see com.br.terra.dcl.dCL.DCLComponentInterface#getComponent()
   * @see #getDCLComponentInterface()
   * @generated
   */
  EReference getDCLComponentInterface_Component();

  /**
   * Returns the meta object for the containment reference '{@link com.br.terra.dcl.dCL.DCLComponentInterface#getInterfaceType <em>Interface Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Interface Type</em>'.
   * @see com.br.terra.dcl.dCL.DCLComponentInterface#getInterfaceType()
   * @see #getDCLComponentInterface()
   * @generated
   */
  EReference getDCLComponentInterface_InterfaceType();

  /**
   * Returns the meta object for class '{@link com.br.terra.dcl.dCL.InterfaceType <em>Interface Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface Type</em>'.
   * @see com.br.terra.dcl.dCL.InterfaceType
   * @generated
   */
  EClass getInterfaceType();

  /**
   * Returns the meta object for the attribute '{@link com.br.terra.dcl.dCL.InterfaceType#getInterfaceTypeName <em>Interface Type Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Interface Type Name</em>'.
   * @see com.br.terra.dcl.dCL.InterfaceType#getInterfaceTypeName()
   * @see #getInterfaceType()
   * @generated
   */
  EAttribute getInterfaceType_InterfaceTypeName();

  /**
   * Returns the meta object for class '{@link com.br.terra.dcl.dCL.DCLSubSystem <em>Sub System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub System</em>'.
   * @see com.br.terra.dcl.dCL.DCLSubSystem
   * @generated
   */
  EClass getDCLSubSystem();

  /**
   * Returns the meta object for the reference '{@link com.br.terra.dcl.dCL.DCLSubSystem#getSubSystem <em>Sub System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Sub System</em>'.
   * @see com.br.terra.dcl.dCL.DCLSubSystem#getSubSystem()
   * @see #getDCLSubSystem()
   * @generated
   */
  EReference getDCLSubSystem_SubSystem();

  /**
   * Returns the meta object for class '{@link com.br.terra.dcl.dCL.DCLModule <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Module</em>'.
   * @see com.br.terra.dcl.dCL.DCLModule
   * @generated
   */
  EClass getDCLModule();

  /**
   * Returns the meta object for class '{@link com.br.terra.dcl.dCL.DCDecl <em>DC Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DC Decl</em>'.
   * @see com.br.terra.dcl.dCL.DCDecl
   * @generated
   */
  EClass getDCDecl();

  /**
   * Returns the meta object for the containment reference '{@link com.br.terra.dcl.dCL.DCDecl#getOnly <em>Only</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Only</em>'.
   * @see com.br.terra.dcl.dCL.DCDecl#getOnly()
   * @see #getDCDecl()
   * @generated
   */
  EReference getDCDecl_Only();

  /**
   * Returns the meta object for the reference '{@link com.br.terra.dcl.dCL.DCDecl#getT <em>T</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>T</em>'.
   * @see com.br.terra.dcl.dCL.DCDecl#getT()
   * @see #getDCDecl()
   * @generated
   */
  EReference getDCDecl_T();

  /**
   * Returns the meta object for the containment reference '{@link com.br.terra.dcl.dCL.DCDecl#getCan <em>Can</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Can</em>'.
   * @see com.br.terra.dcl.dCL.DCDecl#getCan()
   * @see #getDCDecl()
   * @generated
   */
  EReference getDCDecl_Can();

  /**
   * Returns the meta object for the containment reference '{@link com.br.terra.dcl.dCL.DCDecl#getElementType <em>Element Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Element Type</em>'.
   * @see com.br.terra.dcl.dCL.DCDecl#getElementType()
   * @see #getDCDecl()
   * @generated
   */
  EReference getDCDecl_ElementType();

  /**
   * Returns the meta object for the reference '{@link com.br.terra.dcl.dCL.DCDecl#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see com.br.terra.dcl.dCL.DCDecl#getType()
   * @see #getDCDecl()
   * @generated
   */
  EReference getDCDecl_Type();

  /**
   * Returns the meta object for the containment reference '{@link com.br.terra.dcl.dCL.DCDecl#getCannot <em>Cannot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cannot</em>'.
   * @see com.br.terra.dcl.dCL.DCDecl#getCannot()
   * @see #getDCDecl()
   * @generated
   */
  EReference getDCDecl_Cannot();

  /**
   * Returns the meta object for the containment reference '{@link com.br.terra.dcl.dCL.DCDecl#getOnly2 <em>Only2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Only2</em>'.
   * @see com.br.terra.dcl.dCL.DCDecl#getOnly2()
   * @see #getDCDecl()
   * @generated
   */
  EReference getDCDecl_Only2();

  /**
   * Returns the meta object for the containment reference '{@link com.br.terra.dcl.dCL.DCDecl#getMust <em>Must</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Must</em>'.
   * @see com.br.terra.dcl.dCL.DCDecl#getMust()
   * @see #getDCDecl()
   * @generated
   */
  EReference getDCDecl_Must();

  /**
   * Returns the meta object for the containment reference '{@link com.br.terra.dcl.dCL.DCDecl#getEntityType <em>Entity Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Entity Type</em>'.
   * @see com.br.terra.dcl.dCL.DCDecl#getEntityType()
   * @see #getDCDecl()
   * @generated
   */
  EReference getDCDecl_EntityType();

  /**
   * Returns the meta object for class '{@link com.br.terra.dcl.dCL.Only <em>Only</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Only</em>'.
   * @see com.br.terra.dcl.dCL.Only
   * @generated
   */
  EClass getOnly();

  /**
   * Returns the meta object for the attribute '{@link com.br.terra.dcl.dCL.Only#getOnly <em>Only</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Only</em>'.
   * @see com.br.terra.dcl.dCL.Only#getOnly()
   * @see #getOnly()
   * @generated
   */
  EAttribute getOnly_Only();

  /**
   * Returns the meta object for class '{@link com.br.terra.dcl.dCL.Can <em>Can</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Can</em>'.
   * @see com.br.terra.dcl.dCL.Can
   * @generated
   */
  EClass getCan();

  /**
   * Returns the meta object for the attribute '{@link com.br.terra.dcl.dCL.Can#getCan <em>Can</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Can</em>'.
   * @see com.br.terra.dcl.dCL.Can#getCan()
   * @see #getCan()
   * @generated
   */
  EAttribute getCan_Can();

  /**
   * Returns the meta object for class '{@link com.br.terra.dcl.dCL.Cannot <em>Cannot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cannot</em>'.
   * @see com.br.terra.dcl.dCL.Cannot
   * @generated
   */
  EClass getCannot();

  /**
   * Returns the meta object for the attribute '{@link com.br.terra.dcl.dCL.Cannot#getCannot <em>Cannot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cannot</em>'.
   * @see com.br.terra.dcl.dCL.Cannot#getCannot()
   * @see #getCannot()
   * @generated
   */
  EAttribute getCannot_Cannot();

  /**
   * Returns the meta object for class '{@link com.br.terra.dcl.dCL.Only2 <em>Only2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Only2</em>'.
   * @see com.br.terra.dcl.dCL.Only2
   * @generated
   */
  EClass getOnly2();

  /**
   * Returns the meta object for the attribute '{@link com.br.terra.dcl.dCL.Only2#getOnly2 <em>Only2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Only2</em>'.
   * @see com.br.terra.dcl.dCL.Only2#getOnly2()
   * @see #getOnly2()
   * @generated
   */
  EAttribute getOnly2_Only2();

  /**
   * Returns the meta object for class '{@link com.br.terra.dcl.dCL.Must <em>Must</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Must</em>'.
   * @see com.br.terra.dcl.dCL.Must
   * @generated
   */
  EClass getMust();

  /**
   * Returns the meta object for the attribute '{@link com.br.terra.dcl.dCL.Must#getMust <em>Must</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Must</em>'.
   * @see com.br.terra.dcl.dCL.Must#getMust()
   * @see #getMust()
   * @generated
   */
  EAttribute getMust_Must();

  /**
   * Returns the meta object for class '{@link com.br.terra.dcl.dCL.ElementType <em>Element Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element Type</em>'.
   * @see com.br.terra.dcl.dCL.ElementType
   * @generated
   */
  EClass getElementType();

  /**
   * Returns the meta object for class '{@link com.br.terra.dcl.dCL.BasicType <em>Basic Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Basic Type</em>'.
   * @see com.br.terra.dcl.dCL.BasicType
   * @generated
   */
  EClass getBasicType();

  /**
   * Returns the meta object for the attribute '{@link com.br.terra.dcl.dCL.BasicType#getTypeName <em>Type Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type Name</em>'.
   * @see com.br.terra.dcl.dCL.BasicType#getTypeName()
   * @see #getBasicType()
   * @generated
   */
  EAttribute getBasicType_TypeName();

  /**
   * Returns the meta object for class '{@link com.br.terra.dcl.dCL.EntityType <em>Entity Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity Type</em>'.
   * @see com.br.terra.dcl.dCL.EntityType
   * @generated
   */
  EClass getEntityType();

  /**
   * Returns the meta object for the attribute '{@link com.br.terra.dcl.dCL.EntityType#getEntity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Entity</em>'.
   * @see com.br.terra.dcl.dCL.EntityType#getEntity()
   * @see #getEntityType()
   * @generated
   */
  EAttribute getEntityType_Entity();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DCLFactory getDCLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.br.terra.dcl.dCL.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.br.terra.dcl.dCL.impl.ModelImpl
     * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Structure Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__STRUCTURE_ELEMENTS = eINSTANCE.getModel_StructureElements();

    /**
     * The meta object literal for the '<em><b>DC Decl</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__DC_DECL = eINSTANCE.getModel_DCDecl();

    /**
     * The meta object literal for the '{@link com.br.terra.dcl.dCL.impl.DCLStructureElementImpl <em>Structure Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.br.terra.dcl.dCL.impl.DCLStructureElementImpl
     * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getDCLStructureElement()
     * @generated
     */
    EClass DCL_STRUCTURE_ELEMENT = eINSTANCE.getDCLStructureElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DCL_STRUCTURE_ELEMENT__NAME = eINSTANCE.getDCLStructureElement_Name();

    /**
     * The meta object literal for the '{@link com.br.terra.dcl.dCL.impl.DCLManagedSubsystemImpl <em>Managed Subsystem</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.br.terra.dcl.dCL.impl.DCLManagedSubsystemImpl
     * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getDCLManagedSubsystem()
     * @generated
     */
    EClass DCL_MANAGED_SUBSYSTEM = eINSTANCE.getDCLManagedSubsystem();

    /**
     * The meta object literal for the '<em><b>Managed Subsystem</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DCL_MANAGED_SUBSYSTEM__MANAGED_SUBSYSTEM = eINSTANCE.getDCLManagedSubsystem_ManagedSubsystem();

    /**
     * The meta object literal for the '{@link com.br.terra.dcl.dCL.impl.DCLManagingSubsystemImpl <em>Managing Subsystem</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.br.terra.dcl.dCL.impl.DCLManagingSubsystemImpl
     * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getDCLManagingSubsystem()
     * @generated
     */
    EClass DCL_MANAGING_SUBSYSTEM = eINSTANCE.getDCLManagingSubsystem();

    /**
     * The meta object literal for the '<em><b>Managing Subsystem</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DCL_MANAGING_SUBSYSTEM__MANAGING_SUBSYSTEM = eINSTANCE.getDCLManagingSubsystem_ManagingSubsystem();

    /**
     * The meta object literal for the '{@link com.br.terra.dcl.dCL.impl.DCLMonitorImpl <em>Monitor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.br.terra.dcl.dCL.impl.DCLMonitorImpl
     * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getDCLMonitor()
     * @generated
     */
    EClass DCL_MONITOR = eINSTANCE.getDCLMonitor();

    /**
     * The meta object literal for the '<em><b>Managing Subsystem</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DCL_MONITOR__MANAGING_SUBSYSTEM = eINSTANCE.getDCLMonitor_ManagingSubsystem();

    /**
     * The meta object literal for the '{@link com.br.terra.dcl.dCL.impl.DCLPlannerImpl <em>Planner</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.br.terra.dcl.dCL.impl.DCLPlannerImpl
     * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getDCLPlanner()
     * @generated
     */
    EClass DCL_PLANNER = eINSTANCE.getDCLPlanner();

    /**
     * The meta object literal for the '<em><b>Managing Subsystem</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DCL_PLANNER__MANAGING_SUBSYSTEM = eINSTANCE.getDCLPlanner_ManagingSubsystem();

    /**
     * The meta object literal for the '{@link com.br.terra.dcl.dCL.impl.DCLAnalyzerImpl <em>Analyzer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.br.terra.dcl.dCL.impl.DCLAnalyzerImpl
     * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getDCLAnalyzer()
     * @generated
     */
    EClass DCL_ANALYZER = eINSTANCE.getDCLAnalyzer();

    /**
     * The meta object literal for the '<em><b>Managing Subsystem</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DCL_ANALYZER__MANAGING_SUBSYSTEM = eINSTANCE.getDCLAnalyzer_ManagingSubsystem();

    /**
     * The meta object literal for the '{@link com.br.terra.dcl.dCL.impl.DCLExecutorImpl <em>Executor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.br.terra.dcl.dCL.impl.DCLExecutorImpl
     * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getDCLExecutor()
     * @generated
     */
    EClass DCL_EXECUTOR = eINSTANCE.getDCLExecutor();

    /**
     * The meta object literal for the '<em><b>Managing Subsystem</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DCL_EXECUTOR__MANAGING_SUBSYSTEM = eINSTANCE.getDCLExecutor_ManagingSubsystem();

    /**
     * The meta object literal for the '{@link com.br.terra.dcl.dCL.impl.DCLSensorImpl <em>Sensor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.br.terra.dcl.dCL.impl.DCLSensorImpl
     * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getDCLSensor()
     * @generated
     */
    EClass DCL_SENSOR = eINSTANCE.getDCLSensor();

    /**
     * The meta object literal for the '<em><b>Managing Subsystem</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DCL_SENSOR__MANAGING_SUBSYSTEM = eINSTANCE.getDCLSensor_ManagingSubsystem();

    /**
     * The meta object literal for the '{@link com.br.terra.dcl.dCL.impl.DCLActuatorImpl <em>Actuator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.br.terra.dcl.dCL.impl.DCLActuatorImpl
     * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getDCLActuator()
     * @generated
     */
    EClass DCL_ACTUATOR = eINSTANCE.getDCLActuator();

    /**
     * The meta object literal for the '<em><b>Managing Subsystem</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DCL_ACTUATOR__MANAGING_SUBSYSTEM = eINSTANCE.getDCLActuator_ManagingSubsystem();

    /**
     * The meta object literal for the '{@link com.br.terra.dcl.dCL.impl.DCLKnowledgeImpl <em>Knowledge</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.br.terra.dcl.dCL.impl.DCLKnowledgeImpl
     * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getDCLKnowledge()
     * @generated
     */
    EClass DCL_KNOWLEDGE = eINSTANCE.getDCLKnowledge();

    /**
     * The meta object literal for the '<em><b>Managing Subsystem</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DCL_KNOWLEDGE__MANAGING_SUBSYSTEM = eINSTANCE.getDCLKnowledge_ManagingSubsystem();

    /**
     * The meta object literal for the '{@link com.br.terra.dcl.dCL.impl.DCLReferencesImpl <em>References</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.br.terra.dcl.dCL.impl.DCLReferencesImpl
     * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getDCLReferences()
     * @generated
     */
    EClass DCL_REFERENCES = eINSTANCE.getDCLReferences();

    /**
     * The meta object literal for the '<em><b>Managing Subsystem</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DCL_REFERENCES__MANAGING_SUBSYSTEM = eINSTANCE.getDCLReferences_ManagingSubsystem();

    /**
     * The meta object literal for the '<em><b>Knowledge</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DCL_REFERENCES__KNOWLEDGE = eINSTANCE.getDCLReferences_Knowledge();

    /**
     * The meta object literal for the '{@link com.br.terra.dcl.dCL.impl.DCLLayerImpl <em>Layer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.br.terra.dcl.dCL.impl.DCLLayerImpl
     * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getDCLLayer()
     * @generated
     */
    EClass DCL_LAYER = eINSTANCE.getDCLLayer();

    /**
     * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DCL_LAYER__LEVEL = eINSTANCE.getDCLLayer_Level();

    /**
     * The meta object literal for the '<em><b>Layer</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DCL_LAYER__LAYER = eINSTANCE.getDCLLayer_Layer();

    /**
     * The meta object literal for the '<em><b>Sub System</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DCL_LAYER__SUB_SYSTEM = eINSTANCE.getDCLLayer_SubSystem();

    /**
     * The meta object literal for the '<em><b>Component</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DCL_LAYER__COMPONENT = eINSTANCE.getDCLLayer_Component();

    /**
     * The meta object literal for the '{@link com.br.terra.dcl.dCL.impl.DCLComponentImpl <em>Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.br.terra.dcl.dCL.impl.DCLComponentImpl
     * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getDCLComponent()
     * @generated
     */
    EClass DCL_COMPONENT = eINSTANCE.getDCLComponent();

    /**
     * The meta object literal for the '<em><b>Layer</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DCL_COMPONENT__LAYER = eINSTANCE.getDCLComponent_Layer();

    /**
     * The meta object literal for the '<em><b>Sub System</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DCL_COMPONENT__SUB_SYSTEM = eINSTANCE.getDCLComponent_SubSystem();

    /**
     * The meta object literal for the '{@link com.br.terra.dcl.dCL.impl.DCLComponentInterfaceImpl <em>Component Interface</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.br.terra.dcl.dCL.impl.DCLComponentInterfaceImpl
     * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getDCLComponentInterface()
     * @generated
     */
    EClass DCL_COMPONENT_INTERFACE = eINSTANCE.getDCLComponentInterface();

    /**
     * The meta object literal for the '<em><b>Component</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DCL_COMPONENT_INTERFACE__COMPONENT = eINSTANCE.getDCLComponentInterface_Component();

    /**
     * The meta object literal for the '<em><b>Interface Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DCL_COMPONENT_INTERFACE__INTERFACE_TYPE = eINSTANCE.getDCLComponentInterface_InterfaceType();

    /**
     * The meta object literal for the '{@link com.br.terra.dcl.dCL.impl.InterfaceTypeImpl <em>Interface Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.br.terra.dcl.dCL.impl.InterfaceTypeImpl
     * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getInterfaceType()
     * @generated
     */
    EClass INTERFACE_TYPE = eINSTANCE.getInterfaceType();

    /**
     * The meta object literal for the '<em><b>Interface Type Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERFACE_TYPE__INTERFACE_TYPE_NAME = eINSTANCE.getInterfaceType_InterfaceTypeName();

    /**
     * The meta object literal for the '{@link com.br.terra.dcl.dCL.impl.DCLSubSystemImpl <em>Sub System</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.br.terra.dcl.dCL.impl.DCLSubSystemImpl
     * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getDCLSubSystem()
     * @generated
     */
    EClass DCL_SUB_SYSTEM = eINSTANCE.getDCLSubSystem();

    /**
     * The meta object literal for the '<em><b>Sub System</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DCL_SUB_SYSTEM__SUB_SYSTEM = eINSTANCE.getDCLSubSystem_SubSystem();

    /**
     * The meta object literal for the '{@link com.br.terra.dcl.dCL.impl.DCLModuleImpl <em>Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.br.terra.dcl.dCL.impl.DCLModuleImpl
     * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getDCLModule()
     * @generated
     */
    EClass DCL_MODULE = eINSTANCE.getDCLModule();

    /**
     * The meta object literal for the '{@link com.br.terra.dcl.dCL.impl.DCDeclImpl <em>DC Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.br.terra.dcl.dCL.impl.DCDeclImpl
     * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getDCDecl()
     * @generated
     */
    EClass DC_DECL = eINSTANCE.getDCDecl();

    /**
     * The meta object literal for the '<em><b>Only</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DC_DECL__ONLY = eINSTANCE.getDCDecl_Only();

    /**
     * The meta object literal for the '<em><b>T</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DC_DECL__T = eINSTANCE.getDCDecl_T();

    /**
     * The meta object literal for the '<em><b>Can</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DC_DECL__CAN = eINSTANCE.getDCDecl_Can();

    /**
     * The meta object literal for the '<em><b>Element Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DC_DECL__ELEMENT_TYPE = eINSTANCE.getDCDecl_ElementType();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DC_DECL__TYPE = eINSTANCE.getDCDecl_Type();

    /**
     * The meta object literal for the '<em><b>Cannot</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DC_DECL__CANNOT = eINSTANCE.getDCDecl_Cannot();

    /**
     * The meta object literal for the '<em><b>Only2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DC_DECL__ONLY2 = eINSTANCE.getDCDecl_Only2();

    /**
     * The meta object literal for the '<em><b>Must</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DC_DECL__MUST = eINSTANCE.getDCDecl_Must();

    /**
     * The meta object literal for the '<em><b>Entity Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DC_DECL__ENTITY_TYPE = eINSTANCE.getDCDecl_EntityType();

    /**
     * The meta object literal for the '{@link com.br.terra.dcl.dCL.impl.OnlyImpl <em>Only</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.br.terra.dcl.dCL.impl.OnlyImpl
     * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getOnly()
     * @generated
     */
    EClass ONLY = eINSTANCE.getOnly();

    /**
     * The meta object literal for the '<em><b>Only</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ONLY__ONLY = eINSTANCE.getOnly_Only();

    /**
     * The meta object literal for the '{@link com.br.terra.dcl.dCL.impl.CanImpl <em>Can</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.br.terra.dcl.dCL.impl.CanImpl
     * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getCan()
     * @generated
     */
    EClass CAN = eINSTANCE.getCan();

    /**
     * The meta object literal for the '<em><b>Can</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CAN__CAN = eINSTANCE.getCan_Can();

    /**
     * The meta object literal for the '{@link com.br.terra.dcl.dCL.impl.CannotImpl <em>Cannot</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.br.terra.dcl.dCL.impl.CannotImpl
     * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getCannot()
     * @generated
     */
    EClass CANNOT = eINSTANCE.getCannot();

    /**
     * The meta object literal for the '<em><b>Cannot</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CANNOT__CANNOT = eINSTANCE.getCannot_Cannot();

    /**
     * The meta object literal for the '{@link com.br.terra.dcl.dCL.impl.Only2Impl <em>Only2</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.br.terra.dcl.dCL.impl.Only2Impl
     * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getOnly2()
     * @generated
     */
    EClass ONLY2 = eINSTANCE.getOnly2();

    /**
     * The meta object literal for the '<em><b>Only2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ONLY2__ONLY2 = eINSTANCE.getOnly2_Only2();

    /**
     * The meta object literal for the '{@link com.br.terra.dcl.dCL.impl.MustImpl <em>Must</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.br.terra.dcl.dCL.impl.MustImpl
     * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getMust()
     * @generated
     */
    EClass MUST = eINSTANCE.getMust();

    /**
     * The meta object literal for the '<em><b>Must</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MUST__MUST = eINSTANCE.getMust_Must();

    /**
     * The meta object literal for the '{@link com.br.terra.dcl.dCL.impl.ElementTypeImpl <em>Element Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.br.terra.dcl.dCL.impl.ElementTypeImpl
     * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getElementType()
     * @generated
     */
    EClass ELEMENT_TYPE = eINSTANCE.getElementType();

    /**
     * The meta object literal for the '{@link com.br.terra.dcl.dCL.impl.BasicTypeImpl <em>Basic Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.br.terra.dcl.dCL.impl.BasicTypeImpl
     * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getBasicType()
     * @generated
     */
    EClass BASIC_TYPE = eINSTANCE.getBasicType();

    /**
     * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BASIC_TYPE__TYPE_NAME = eINSTANCE.getBasicType_TypeName();

    /**
     * The meta object literal for the '{@link com.br.terra.dcl.dCL.impl.EntityTypeImpl <em>Entity Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.br.terra.dcl.dCL.impl.EntityTypeImpl
     * @see com.br.terra.dcl.dCL.impl.DCLPackageImpl#getEntityType()
     * @generated
     */
    EClass ENTITY_TYPE = eINSTANCE.getEntityType();

    /**
     * The meta object literal for the '<em><b>Entity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY_TYPE__ENTITY = eINSTANCE.getEntityType_Entity();

  }

} //DCLPackage
