package com.br.terra.dcl.kdmGeneration.generators.impl.architecture;

import org.eclipse.emf.common.util.EList;
import org.eclipse.gmt.modisco.omg.kdm.kdm.KdmFactory;
import org.eclipse.gmt.modisco.omg.kdm.structure.AbstractStructureElement;
import org.eclipse.gmt.modisco.omg.kdm.structure.StructureFactory;
import org.eclipse.gmt.modisco.omg.kdm.structure.StructureModel;

import com.br.terra.dcl.dCL.DCLActuator;
import com.br.terra.dcl.dCL.DCLAnalyzer;
import com.br.terra.dcl.dCL.DCLComponent;
import com.br.terra.dcl.dCL.DCLExecutor;
import com.br.terra.dcl.dCL.DCLKnowledge;
import com.br.terra.dcl.dCL.DCLLayer;
import com.br.terra.dcl.dCL.DCLManagedSubsystem;
import com.br.terra.dcl.dCL.DCLManagingSubsystem;
import com.br.terra.dcl.dCL.DCLModule;
import com.br.terra.dcl.dCL.DCLMonitor;
import com.br.terra.dcl.dCL.DCLPlanner;
import com.br.terra.dcl.dCL.DCLReferences;
import com.br.terra.dcl.dCL.DCLSensor;
import com.br.terra.dcl.dCL.DCLStructureElement;
import com.br.terra.dcl.dCL.DCLSubSystem;
import com.br.terra.dcl.kdmGeneration.actions.DCL2KDM;
import com.br.terra.dcl.kdmGeneration.util.GenericMethodsArchitecture;

/**
 * @author Landi
 *
 */
public class ArchitecturalGenerator {

	public static final String STRUCTURAL_NAME = "PlannedArchitecture";
	
	private EList<DCLStructureElement> allStructureElementsFromDCL = null;
	
	public ArchitecturalGenerator(EList<DCLStructureElement> allStructureElementsFromDCL) {
		this.allStructureElementsFromDCL  = allStructureElementsFromDCL;
	}
	
	public void generateArchitecture() {

		this.createSegmentToKDM();
		
		this.createElementsWithoutHierarchy();

		this.createElementsWithHierarchy();

	}
	
	private void createSegmentToKDM() {
		DCL2KDM.kdmSegment = KdmFactory.eINSTANCE.createSegment();
		DCL2KDM.kdmSegment.setName(STRUCTURAL_NAME);

		StructureModel structureModel = StructureFactory.eINSTANCE.createStructureModel();
		structureModel.setName(STRUCTURAL_NAME);

		DCL2KDM.kdmSegment.getModel().add(structureModel);	
	}
	
	/**
	 * @author Landi
	 */
	private void createElementsWithoutHierarchy() {
		StructureModel structureModel = GenericMethodsArchitecture.getStructureModelFromKDM(DCL2KDM.kdmSegment, STRUCTURAL_NAME);

		for (DCLStructureElement dclStructureElement : this.allStructureElementsFromDCL ) {
			if(dclStructureElement instanceof DCLLayer){

				if(((DCLLayer) dclStructureElement).getLayer() == null && 
						((DCLLayer) dclStructureElement).getComponent() == null &&
						((DCLLayer) dclStructureElement).getSubSystem() == null){

					structureModel.getStructureElement().add(this.dCLEntity2KDMEntity(dclStructureElement));
				}

			}else if (dclStructureElement instanceof DCLComponent) {

				if(((DCLComponent) dclStructureElement).getLayer() == null && 
						((DCLComponent) dclStructureElement).getSubSystem() == null){
					structureModel.getStructureElement().add(this.dCLEntity2KDMEntity(dclStructureElement));
				}

			} else if (dclStructureElement instanceof DCLSubSystem) {

				if(((DCLSubSystem) dclStructureElement).getSubSystem() == null){
					structureModel.getStructureElement().add(this.dCLEntity2KDMEntity(dclStructureElement));
				}

			} else if (dclStructureElement instanceof DCLModule) {
				structureModel.getStructureElement().add(this.dCLEntity2KDMEntity(dclStructureElement));
			} else if (dclStructureElement instanceof DCLManagedSubsystem) {

				if(((DCLManagedSubsystem) dclStructureElement).getManagedSubsystem() == null){
					structureModel.getStructureElement().add(this.dCLEntity2KDMEntity(dclStructureElement));
				}	

			} else if (dclStructureElement instanceof DCLManagingSubsystem) {

				if(((DCLManagingSubsystem) dclStructureElement).getManagingSubsystem() == null){
					structureModel.getStructureElement().add(this.dCLEntity2KDMEntity(dclStructureElement));
				}	

			} else if (dclStructureElement instanceof DCLMonitor) {

				if(((DCLMonitor) dclStructureElement).getManagingSubsystem() == null){
					structureModel.getStructureElement().add(this.dCLEntity2KDMEntity(dclStructureElement));
				}	

			} else if (dclStructureElement instanceof DCLPlanner) {

				if(((DCLPlanner) dclStructureElement).getManagingSubsystem() == null){
					structureModel.getStructureElement().add(this.dCLEntity2KDMEntity(dclStructureElement));
				}	

			} else if (dclStructureElement instanceof DCLAnalyzer) {

				if(((DCLAnalyzer) dclStructureElement).getManagingSubsystem() == null){
					structureModel.getStructureElement().add(this.dCLEntity2KDMEntity(dclStructureElement));
				}	

			} else if (dclStructureElement instanceof DCLExecutor) {

				if(((DCLExecutor) dclStructureElement).getManagingSubsystem() == null){
					structureModel.getStructureElement().add(this.dCLEntity2KDMEntity(dclStructureElement));
				}	

			} else if (dclStructureElement instanceof DCLSensor) {

				if(((DCLSensor) dclStructureElement).getManagingSubsystem() == null){
					structureModel.getStructureElement().add(this.dCLEntity2KDMEntity(dclStructureElement));
				}	

			} else if (dclStructureElement instanceof DCLActuator) {

				if(((DCLActuator) dclStructureElement).getManagingSubsystem() == null){
					structureModel.getStructureElement().add(this.dCLEntity2KDMEntity(dclStructureElement));
				}	

			} else if (dclStructureElement instanceof DCLKnowledge) {

				if(((DCLKnowledge) dclStructureElement).getManagingSubsystem() == null){
					structureModel.getStructureElement().add(this.dCLEntity2KDMEntity(dclStructureElement));
				}	

			} else if (dclStructureElement instanceof DCLReferences) {

				if(((DCLReferences) dclStructureElement).getManagingSubsystem() == null && 
						((DCLReferences) dclStructureElement).getKnowledge() == null){
					structureModel.getStructureElement().add(this.dCLEntity2KDMEntity(dclStructureElement));

				}	
			}
		}
	}

	/**
	 * @author Landi
	 */
	private void createElementsWithHierarchy() {
		StructureModel structureModel = GenericMethodsArchitecture.getStructureModelFromKDM(DCL2KDM.kdmSegment, STRUCTURAL_NAME);

		for (DCLStructureElement dclStructureElement : this.allStructureElementsFromDCL) {

			if(dclStructureElement instanceof DCLLayer){

				if(((DCLLayer) dclStructureElement).getLayer() != null || 
						((DCLLayer) dclStructureElement).getComponent() != null ||
						((DCLLayer) dclStructureElement).getSubSystem() != null){

					this.createElementsWithHierarchy(structureModel, dclStructureElement);
				}

			}else if (dclStructureElement instanceof DCLComponent) {

				if(((DCLComponent) dclStructureElement).getLayer() != null || 
						((DCLComponent) dclStructureElement).getSubSystem() != null){
					this.createElementsWithHierarchy(structureModel, dclStructureElement);
				}

			}else if (dclStructureElement instanceof DCLSubSystem) {

				if(((DCLSubSystem) dclStructureElement).getSubSystem() != null){
					this.createElementsWithHierarchy(structureModel, dclStructureElement);
				}
				
			}else if (dclStructureElement instanceof DCLManagedSubsystem) {

				if(((DCLManagedSubsystem) dclStructureElement).getManagedSubsystem() != null){
					this.createElementsWithHierarchy(structureModel, dclStructureElement);
				}
				
			}else if (dclStructureElement instanceof DCLManagingSubsystem) {

				if(((DCLManagingSubsystem) dclStructureElement).getManagingSubsystem() != null){
					this.createElementsWithHierarchy(structureModel, dclStructureElement);
				}
				
			}else if (dclStructureElement instanceof DCLMonitor) {
				
				if(((DCLMonitor) dclStructureElement).getManagingSubsystem() != null){
					this.createElementsWithHierarchy(structureModel, dclStructureElement);
				}

			}else if (dclStructureElement instanceof DCLPlanner) {
				
				if(((DCLPlanner) dclStructureElement).getManagingSubsystem() != null){
					this.createElementsWithHierarchy(structureModel, dclStructureElement);
				}

			}else if (dclStructureElement instanceof DCLAnalyzer) {
				
				if(((DCLAnalyzer) dclStructureElement).getManagingSubsystem() != null){
					this.createElementsWithHierarchy(structureModel, dclStructureElement);
				}

			}else if (dclStructureElement instanceof DCLExecutor) {
				
				if(((DCLExecutor) dclStructureElement).getManagingSubsystem() != null){
					this.createElementsWithHierarchy(structureModel, dclStructureElement);
				}

			}else if (dclStructureElement instanceof DCLSensor) {
				
				if(((DCLSensor) dclStructureElement).getManagingSubsystem() != null){
					this.createElementsWithHierarchy(structureModel, dclStructureElement);
				}

			}else if (dclStructureElement instanceof DCLActuator) {
				
				if(((DCLActuator) dclStructureElement).getManagingSubsystem() != null){
					this.createElementsWithHierarchy(structureModel, dclStructureElement);
				}

			}else if (dclStructureElement instanceof DCLKnowledge) {
				
				if(((DCLKnowledge) dclStructureElement).getManagingSubsystem() != null){
					this.createElementsWithHierarchy(structureModel, dclStructureElement);
				}

			}else if (dclStructureElement instanceof DCLReferences) {
				
				if(((DCLReferences) dclStructureElement).getManagingSubsystem() != null ||
						((DCLReferences) dclStructureElement).getKnowledge() != null) {
					this.createElementsWithHierarchy(structureModel, dclStructureElement);
				}

			}

		}
	}


	/**
	 * @author Landi
	 * @param structureModel
	 * @param dclStructureElement
	 */
	private void createElementsWithHierarchy(StructureModel structureModel, DCLStructureElement elementToCreate) {

		if(GenericMethodsArchitecture.findArchitecturaElement(structureModel, elementToCreate) != null){
			return;
		}
		
		if(elementToCreate instanceof DCLLayer){

			if(((DCLLayer) elementToCreate).getLayer() != null ){
				AbstractStructureElement abstractStructureElementParent = GenericMethodsArchitecture.findArchitecturaElement(structureModel, ((DCLLayer) elementToCreate).getLayer());
				if(abstractStructureElementParent == null){
					this.createElementsWithHierarchy(structureModel, ((DCLLayer) elementToCreate).getLayer());
					GenericMethodsArchitecture.findArchitecturaElement(structureModel, ((DCLLayer) elementToCreate).getLayer()).getStructureElement().add(this.dCLEntity2KDMEntity(elementToCreate));
				}else{
					abstractStructureElementParent.getStructureElement().add(this.dCLEntity2KDMEntity(elementToCreate));
				}

			}else if(((DCLLayer) elementToCreate).getComponent() != null ){
				AbstractStructureElement abstractStructureElementParent = GenericMethodsArchitecture.findArchitecturaElement(structureModel, ((DCLLayer) elementToCreate).getComponent());
				if(abstractStructureElementParent == null){
					this.createElementsWithHierarchy(structureModel, ((DCLLayer) elementToCreate).getComponent());
					GenericMethodsArchitecture.findArchitecturaElement(structureModel, ((DCLLayer) elementToCreate).getComponent()).getStructureElement().add(this.dCLEntity2KDMEntity(elementToCreate));
				}else{
					abstractStructureElementParent.getStructureElement().add(this.dCLEntity2KDMEntity(elementToCreate));
				}
			}else if(((DCLLayer) elementToCreate).getSubSystem() != null){
				AbstractStructureElement abstractStructureElementParent = GenericMethodsArchitecture.findArchitecturaElement(structureModel, ((DCLLayer) elementToCreate).getSubSystem());
				if(abstractStructureElementParent == null){
					this.createElementsWithHierarchy(structureModel, ((DCLLayer) elementToCreate).getSubSystem());
					GenericMethodsArchitecture.findArchitecturaElement(structureModel, ((DCLLayer) elementToCreate).getSubSystem()).getStructureElement().add(this.dCLEntity2KDMEntity(elementToCreate));
				}else{
					abstractStructureElementParent.getStructureElement().add(this.dCLEntity2KDMEntity(elementToCreate));
				}
			}

		}else if (elementToCreate instanceof DCLComponent) {

			if(((DCLComponent) elementToCreate).getLayer() != null){
				AbstractStructureElement abstractStructureElementParent = GenericMethodsArchitecture.findArchitecturaElement(structureModel,((DCLComponent) elementToCreate).getLayer());
				if(abstractStructureElementParent == null){
					this.createElementsWithHierarchy(structureModel, ((DCLComponent) elementToCreate).getLayer());
					GenericMethodsArchitecture.findArchitecturaElement(structureModel,((DCLComponent) elementToCreate).getLayer()).getStructureElement().add(this.dCLEntity2KDMEntity(elementToCreate));
				}else{
					abstractStructureElementParent.getStructureElement().add(this.dCLEntity2KDMEntity(elementToCreate));
				}
			}else if(((DCLComponent) elementToCreate).getSubSystem() != null){
				AbstractStructureElement abstractStructureElementParent = GenericMethodsArchitecture.findArchitecturaElement(structureModel, ((DCLComponent) elementToCreate).getSubSystem());
				if(abstractStructureElementParent == null){
					this.createElementsWithHierarchy(structureModel, ((DCLComponent) elementToCreate).getSubSystem());
					GenericMethodsArchitecture.findArchitecturaElement(structureModel, ((DCLComponent) elementToCreate).getSubSystem()).getStructureElement().add(this.dCLEntity2KDMEntity(elementToCreate));
				}else{
					abstractStructureElementParent.getStructureElement().add(this.dCLEntity2KDMEntity(elementToCreate));
				}
			}

		} else if (elementToCreate instanceof DCLSubSystem) {

			if(((DCLSubSystem) elementToCreate).getSubSystem() != null){
				AbstractStructureElement abstractStructureElementParent = GenericMethodsArchitecture.findArchitecturaElement(structureModel, ((DCLSubSystem) elementToCreate).getSubSystem());
				if(abstractStructureElementParent == null){
					this.createElementsWithHierarchy(structureModel, ((DCLSubSystem) elementToCreate).getSubSystem());
					GenericMethodsArchitecture.findArchitecturaElement(structureModel, ((DCLSubSystem) elementToCreate).getSubSystem()).getStructureElement().add(this.dCLEntity2KDMEntity(elementToCreate));
				}else{
					abstractStructureElementParent.getStructureElement().add(this.dCLEntity2KDMEntity(elementToCreate));
				}
			}
		}else if (elementToCreate instanceof DCLManagedSubsystem) {
	
			if(((DCLManagedSubsystem) elementToCreate).getManagedSubsystem() != null){
				AbstractStructureElement abstractStructureElementParent = GenericMethodsArchitecture.findArchitecturaElement(structureModel, ((DCLManagedSubsystem) elementToCreate).getManagedSubsystem());
				if(abstractStructureElementParent == null){
					this.createElementsWithHierarchy(structureModel, ((DCLManagedSubsystem) elementToCreate).getManagedSubsystem());
					GenericMethodsArchitecture.findArchitecturaElement(structureModel, ((DCLManagedSubsystem) elementToCreate).getManagedSubsystem()).getStructureElement().add(this.dCLEntity2KDMEntity(elementToCreate));
				}else{
					abstractStructureElementParent.getStructureElement().add(this.dCLEntity2KDMEntity(elementToCreate));
				}
			}
		}else if (elementToCreate instanceof DCLManagingSubsystem) {
	
			if(((DCLManagingSubsystem) elementToCreate).getManagingSubsystem() != null){
				AbstractStructureElement abstractStructureElementParent = GenericMethodsArchitecture.findArchitecturaElement(structureModel, ((DCLManagingSubsystem) elementToCreate).getManagingSubsystem());
				if(abstractStructureElementParent == null){
					this.createElementsWithHierarchy(structureModel, ((DCLManagingSubsystem) elementToCreate).getManagingSubsystem());
					GenericMethodsArchitecture.findArchitecturaElement(structureModel, ((DCLManagingSubsystem) elementToCreate).getManagingSubsystem()).getStructureElement().add(this.dCLEntity2KDMEntity(elementToCreate));
				}else{
					abstractStructureElementParent.getStructureElement().add(this.dCLEntity2KDMEntity(elementToCreate));
				}
			}
		}else if (elementToCreate instanceof DCLMonitor) {
	
			if(((DCLMonitor) elementToCreate).getManagingSubsystem() != null){
				AbstractStructureElement abstractStructureElementParent = GenericMethodsArchitecture.findArchitecturaElement(structureModel, ((DCLMonitor) elementToCreate).getManagingSubsystem());
				if(abstractStructureElementParent == null){
					this.createElementsWithHierarchy(structureModel, ((DCLMonitor) elementToCreate).getManagingSubsystem());
					GenericMethodsArchitecture.findArchitecturaElement(structureModel, ((DCLMonitor) elementToCreate).getManagingSubsystem()).getStructureElement().add(this.dCLEntity2KDMEntity(elementToCreate));
				}else{
					abstractStructureElementParent.getStructureElement().add(this.dCLEntity2KDMEntity(elementToCreate));
				}
			}
		}else if (elementToCreate instanceof DCLPlanner) {
	
			if(((DCLPlanner) elementToCreate).getManagingSubsystem() != null){
				AbstractStructureElement abstractStructureElementParent = GenericMethodsArchitecture.findArchitecturaElement(structureModel, ((DCLPlanner) elementToCreate).getManagingSubsystem());
				if(abstractStructureElementParent == null){
					this.createElementsWithHierarchy(structureModel, ((DCLPlanner) elementToCreate).getManagingSubsystem());
					GenericMethodsArchitecture.findArchitecturaElement(structureModel, ((DCLPlanner) elementToCreate).getManagingSubsystem()).getStructureElement().add(this.dCLEntity2KDMEntity(elementToCreate));
				}else{
					abstractStructureElementParent.getStructureElement().add(this.dCLEntity2KDMEntity(elementToCreate));
				}
			}
		}else if (elementToCreate instanceof DCLAnalyzer) {
	
			if(((DCLAnalyzer) elementToCreate).getManagingSubsystem() != null){
				AbstractStructureElement abstractStructureElementParent = GenericMethodsArchitecture.findArchitecturaElement(structureModel, ((DCLAnalyzer) elementToCreate).getManagingSubsystem());
				if(abstractStructureElementParent == null){
					this.createElementsWithHierarchy(structureModel, ((DCLAnalyzer) elementToCreate).getManagingSubsystem());
					GenericMethodsArchitecture.findArchitecturaElement(structureModel, ((DCLAnalyzer) elementToCreate).getManagingSubsystem()).getStructureElement().add(this.dCLEntity2KDMEntity(elementToCreate));
				}else{
					abstractStructureElementParent.getStructureElement().add(this.dCLEntity2KDMEntity(elementToCreate));
				}
			}
		}else if (elementToCreate instanceof DCLExecutor) {
	
			if(((DCLExecutor) elementToCreate).getManagingSubsystem() != null){
				AbstractStructureElement abstractStructureElementParent = GenericMethodsArchitecture.findArchitecturaElement(structureModel, ((DCLExecutor) elementToCreate).getManagingSubsystem());
				if(abstractStructureElementParent == null){
					this.createElementsWithHierarchy(structureModel, ((DCLExecutor) elementToCreate).getManagingSubsystem());
					GenericMethodsArchitecture.findArchitecturaElement(structureModel, ((DCLExecutor) elementToCreate).getManagingSubsystem()).getStructureElement().add(this.dCLEntity2KDMEntity(elementToCreate));
				}else{
					abstractStructureElementParent.getStructureElement().add(this.dCLEntity2KDMEntity(elementToCreate));
				}
			}
		}else if (elementToCreate instanceof DCLSensor) {
	
			if(((DCLSensor) elementToCreate).getManagingSubsystem() != null){
				AbstractStructureElement abstractStructureElementParent = GenericMethodsArchitecture.findArchitecturaElement(structureModel, ((DCLSensor) elementToCreate).getManagingSubsystem());
				if(abstractStructureElementParent == null){
					this.createElementsWithHierarchy(structureModel, ((DCLSensor) elementToCreate).getManagingSubsystem());
					GenericMethodsArchitecture.findArchitecturaElement(structureModel, ((DCLSensor) elementToCreate).getManagingSubsystem()).getStructureElement().add(this.dCLEntity2KDMEntity(elementToCreate));
				}else{
					abstractStructureElementParent.getStructureElement().add(this.dCLEntity2KDMEntity(elementToCreate));
				}
			}
		}else if (elementToCreate instanceof DCLActuator) {
	
			if(((DCLActuator) elementToCreate).getManagingSubsystem() != null){
				AbstractStructureElement abstractStructureElementParent = GenericMethodsArchitecture.findArchitecturaElement(structureModel, ((DCLActuator) elementToCreate).getManagingSubsystem());
				if(abstractStructureElementParent == null){
					this.createElementsWithHierarchy(structureModel, ((DCLActuator) elementToCreate).getManagingSubsystem());
					GenericMethodsArchitecture.findArchitecturaElement(structureModel, ((DCLActuator) elementToCreate).getManagingSubsystem()).getStructureElement().add(this.dCLEntity2KDMEntity(elementToCreate));
				}else{
					abstractStructureElementParent.getStructureElement().add(this.dCLEntity2KDMEntity(elementToCreate));
				}
			}
		}else if (elementToCreate instanceof DCLKnowledge) {
	
			if(((DCLKnowledge) elementToCreate).getManagingSubsystem() != null){
				AbstractStructureElement abstractStructureElementParent = GenericMethodsArchitecture.findArchitecturaElement(structureModel, ((DCLKnowledge) elementToCreate).getManagingSubsystem());
				if(abstractStructureElementParent == null){
					this.createElementsWithHierarchy(structureModel, ((DCLKnowledge) elementToCreate).getManagingSubsystem());
					GenericMethodsArchitecture.findArchitecturaElement(structureModel, ((DCLKnowledge) elementToCreate).getManagingSubsystem()).getStructureElement().add(this.dCLEntity2KDMEntity(elementToCreate));
				}else{
					abstractStructureElementParent.getStructureElement().add(this.dCLEntity2KDMEntity(elementToCreate));
				}
			}
		}else if (elementToCreate instanceof DCLReferences) {
	
			if(((DCLReferences) elementToCreate).getManagingSubsystem() != null){
				AbstractStructureElement abstractStructureElementParent = GenericMethodsArchitecture.findArchitecturaElement(structureModel, ((DCLReferences) elementToCreate).getManagingSubsystem());
				if(abstractStructureElementParent == null){
					this.createElementsWithHierarchy(structureModel, ((DCLReferences) elementToCreate).getManagingSubsystem());
					GenericMethodsArchitecture.findArchitecturaElement(structureModel, ((DCLReferences) elementToCreate).getManagingSubsystem()).getStructureElement().add(this.dCLEntity2KDMEntity(elementToCreate));
				}else{
					abstractStructureElementParent.getStructureElement().add(this.dCLEntity2KDMEntity(elementToCreate));
				}
			}else if(((DCLReferences) elementToCreate).getKnowledge() != null){
				AbstractStructureElement abstractStructureElementParent = GenericMethodsArchitecture.findArchitecturaElement(structureModel, ((DCLReferences) elementToCreate).getManagingSubsystem());
				if(abstractStructureElementParent == null){
					this.createElementsWithHierarchy(structureModel, ((DCLReferences) elementToCreate).getKnowledge());
					GenericMethodsArchitecture.findArchitecturaElement(structureModel, ((DCLReferences) elementToCreate).getKnowledge()).getStructureElement().add(this.dCLEntity2KDMEntity(elementToCreate));
				}else{
					abstractStructureElementParent.getStructureElement().add(this.dCLEntity2KDMEntity(elementToCreate));
				}
			}
		}
	}


	/**
	 * @author Landi
	 * @param dclStructureElement
	 */
	private AbstractStructureElement dCLEntity2KDMEntity(DCLStructureElement dclStructureElement) {
		AbstractStructureElement element = null;

		if(dclStructureElement instanceof DCLLayer){

			element = StructureFactory.eINSTANCE.createLayer();
			element.setName(dclStructureElement.getName());

		} else if (dclStructureElement instanceof DCLSubSystem) {

			element = StructureFactory.eINSTANCE.createSubsystem();
			element.setName(dclStructureElement.getName());

		} else if (dclStructureElement instanceof DCLModule ||
				dclStructureElement instanceof DCLComponent ||
				dclStructureElement instanceof DCLManagedSubsystem ||
				dclStructureElement instanceof DCLManagingSubsystem ||
				dclStructureElement instanceof DCLMonitor ||
				dclStructureElement instanceof DCLPlanner ||
				dclStructureElement instanceof DCLAnalyzer ||
				dclStructureElement instanceof DCLExecutor ||
				dclStructureElement instanceof DCLSensor ||
				dclStructureElement instanceof DCLActuator ||
				dclStructureElement instanceof DCLKnowledge ||
				dclStructureElement instanceof DCLReferences) {

			element = StructureFactory.eINSTANCE.createComponent();
			element.setName(dclStructureElement.getName());

		}

		return element;
	}
	
}
