package com.br.terra.dcl.kdmGeneration.generators.architecture;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.gmt.modisco.omg.kdm.kdm.KdmFactory;
import org.eclipse.gmt.modisco.omg.kdm.kdm.Segment;
import org.eclipse.gmt.modisco.omg.kdm.structure.AbstractStructureElement;
import org.eclipse.gmt.modisco.omg.kdm.structure.Component;
import org.eclipse.gmt.modisco.omg.kdm.structure.Layer;
import org.eclipse.gmt.modisco.omg.kdm.structure.StructureFactory;
import org.eclipse.gmt.modisco.omg.kdm.structure.StructureModel;
import org.eclipse.gmt.modisco.omg.kdm.structure.Subsystem;

import com.br.terra.dcl.dCL.DCLComponent;
import com.br.terra.dcl.dCL.DCLLayer;
import com.br.terra.dcl.dCL.DCLModule;
import com.br.terra.dcl.dCL.DCLStructureElement;
import com.br.terra.dcl.dCL.DCLSubSystem;

import br.ufscar.kdm_manager.core.filters.validateFilter.factory.ValidateFilterJavaFactory;
import br.ufscar.kdm_manager.core.filters.validateFilter.interfaces.ValidateFilter;
import br.ufscar.kdm_manager.core.readers.modelReader.factory.KDMModelReaderJavaFactory;
import br.ufscar.kdm_manager.core.readers.structureReader.factory.KDMStructureReaderJavaFactory;

/**
 * @author Landi
 *
 */
public class ArchitecturalGenerator {

	public static final String STRUCTURAL_NAME = "PlannedArchitecture";
	
	private Segment kdmSegment = null;

	private EList<DCLStructureElement> allStructureElementsFromDCL = null;
	
	public ArchitecturalGenerator(EList<DCLStructureElement> allStructureElementsFromDCL) {
		this.allStructureElementsFromDCL  = allStructureElementsFromDCL;
	}
	
	public Segment generateArchitecture() {

		this.createSegmentToKDM();
		
		this.createElementsWithoutHierarchy();

		this.createElementsWithHierarchy();

		return this.kdmSegment;
	}
	
	private void createSegmentToKDM() {
		this.kdmSegment = KdmFactory.eINSTANCE.createSegment();
		this.kdmSegment.setName(STRUCTURAL_NAME);

		StructureModel structureModel = StructureFactory.eINSTANCE.createStructureModel();
		structureModel.setName(STRUCTURAL_NAME);

		this.kdmSegment.getModel().add(structureModel);	
	}
	
	/**
	 * @author Landi
	 */
	private void createElementsWithoutHierarchy() {
		StructureModel structureModel = this.getStructureModelFromKDM(this.kdmSegment, STRUCTURAL_NAME);

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
			}
		}
	}

	/**
	 * @author Landi
	 */
	private void createElementsWithHierarchy() {
		StructureModel structureModel = this.getStructureModelFromKDM(this.kdmSegment, STRUCTURAL_NAME);

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

			} else if (dclStructureElement instanceof DCLSubSystem) {

				if(((DCLSubSystem) dclStructureElement).getSubSystem() != null){
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

		if(this.findArchitecturaElement(structureModel, elementToCreate) != null){
			return;
		}
		
		if(elementToCreate instanceof DCLLayer){

			if(((DCLLayer) elementToCreate).getLayer() != null ){
				AbstractStructureElement abstractStructureElementParent = this.findArchitecturaElement(structureModel, ((DCLLayer) elementToCreate).getLayer());
				if(abstractStructureElementParent == null){
					this.createElementsWithHierarchy(structureModel, ((DCLLayer) elementToCreate).getLayer());
					this.findArchitecturaElement(structureModel, ((DCLLayer) elementToCreate).getLayer()).getStructureElement().add(this.dCLEntity2KDMEntity(elementToCreate));
				}else{
					abstractStructureElementParent.getStructureElement().add(this.dCLEntity2KDMEntity(elementToCreate));
				}

			}else if(((DCLLayer) elementToCreate).getComponent() != null ){
				AbstractStructureElement abstractStructureElementParent = this.findArchitecturaElement(structureModel, ((DCLLayer) elementToCreate).getComponent());
				if(abstractStructureElementParent == null){
					this.createElementsWithHierarchy(structureModel, ((DCLLayer) elementToCreate).getComponent());
					this.findArchitecturaElement(structureModel, ((DCLLayer) elementToCreate).getComponent()).getStructureElement().add(this.dCLEntity2KDMEntity(elementToCreate));
				}else{
					abstractStructureElementParent.getStructureElement().add(this.dCLEntity2KDMEntity(elementToCreate));
				}
			}else if(((DCLLayer) elementToCreate).getSubSystem() != null){
				AbstractStructureElement abstractStructureElementParent = this.findArchitecturaElement(structureModel, ((DCLLayer) elementToCreate).getSubSystem());
				if(abstractStructureElementParent == null){
					this.createElementsWithHierarchy(structureModel, ((DCLLayer) elementToCreate).getSubSystem());
					this.findArchitecturaElement(structureModel, ((DCLLayer) elementToCreate).getSubSystem()).getStructureElement().add(this.dCLEntity2KDMEntity(elementToCreate));
				}else{
					abstractStructureElementParent.getStructureElement().add(this.dCLEntity2KDMEntity(elementToCreate));
				}
			}

		}else if (elementToCreate instanceof DCLComponent) {

			if(((DCLComponent) elementToCreate).getLayer() != null){
				AbstractStructureElement abstractStructureElementParent = this.findArchitecturaElement(structureModel,((DCLComponent) elementToCreate).getLayer());
				if(abstractStructureElementParent == null){
					this.createElementsWithHierarchy(structureModel, ((DCLComponent) elementToCreate).getLayer());
					this.findArchitecturaElement(structureModel,((DCLComponent) elementToCreate).getLayer()).getStructureElement().add(this.dCLEntity2KDMEntity(elementToCreate));
				}else{
					abstractStructureElementParent.getStructureElement().add(this.dCLEntity2KDMEntity(elementToCreate));
				}
			}else if(((DCLComponent) elementToCreate).getSubSystem() != null){
				AbstractStructureElement abstractStructureElementParent = this.findArchitecturaElement(structureModel, ((DCLComponent) elementToCreate).getSubSystem());
				if(abstractStructureElementParent == null){
					this.createElementsWithHierarchy(structureModel, ((DCLComponent) elementToCreate).getSubSystem());
					this.findArchitecturaElement(structureModel, ((DCLComponent) elementToCreate).getSubSystem()).getStructureElement().add(this.dCLEntity2KDMEntity(elementToCreate));
				}else{
					abstractStructureElementParent.getStructureElement().add(this.dCLEntity2KDMEntity(elementToCreate));
				}
			}

		} else if (elementToCreate instanceof DCLSubSystem) {

			if(((DCLSubSystem) elementToCreate).getSubSystem() != null){
				AbstractStructureElement abstractStructureElementParent = this.findArchitecturaElement(structureModel, ((DCLSubSystem) elementToCreate).getSubSystem());
				if(abstractStructureElementParent == null){
					this.createElementsWithHierarchy(structureModel, ((DCLSubSystem) elementToCreate).getSubSystem());
					this.findArchitecturaElement(structureModel, ((DCLSubSystem) elementToCreate).getSubSystem()).getStructureElement().add(this.dCLEntity2KDMEntity(elementToCreate));
				}else{
					abstractStructureElementParent.getStructureElement().add(this.dCLEntity2KDMEntity(elementToCreate));
				}
			}
		}
	}


	/**
	 * @author Landi
	 * @param structureModel 
	 * @param layer
	 * @return
	 */
	private AbstractStructureElement findArchitecturaElement(StructureModel structureModel, DCLStructureElement elementToSearch) {

		ValidateFilter<?, ?> filter = ValidateFilterJavaFactory.eINSTANCE.createValidateFilterNameOfKDMEntity(elementToSearch.getName());

		if(elementToSearch instanceof DCLLayer){

			List<Layer> allFrom = KDMStructureReaderJavaFactory.eINSTANCE.createKDMLayerReaderWithFilter(filter).getAllFrom(structureModel);

			if (allFrom.size() == 1) {//só tem um elemento com este nome
				return allFrom.get(0);
			}else{
				if(allFrom.size() > 1){
					System.err.println("Error! In the DCL Specification has two elements with the same name (" + elementToSearch.getName() + ")");
				}
			}

		}else if (elementToSearch instanceof DCLComponent) {

			List<Component> allFrom = KDMStructureReaderJavaFactory.eINSTANCE.createKDMComponentReaderWithFilter(filter).getAllFrom(structureModel);
			if (allFrom.size() == 1) {//só tem um elemento com este nome
				return allFrom.get(0);
			}else{
				if(allFrom.size() > 1){
					System.err.println("Error! In the DCL Specification has two elements with the same name (" + elementToSearch.getName() + ")");
				}
			}

		} else if (elementToSearch instanceof DCLSubSystem) {
			
			List<Subsystem> allFrom = KDMStructureReaderJavaFactory.eINSTANCE.createKDMSubsystemReaderWithFilter(filter).getAllFrom(structureModel);
			if (allFrom.size() == 1) {//só tem um elemento com este nome
				return allFrom.get(0);
			}else{
				if(allFrom.size() > 1){
					System.err.println("Error! In the DCL Specification has two elements with the same name (" + elementToSearch.getName() + ")");
				}
			}
			
		} else if (elementToSearch instanceof DCLModule) {

			List<Component> allFrom = KDMStructureReaderJavaFactory.eINSTANCE.createKDMComponentReaderWithFilter(filter).getAllFrom(structureModel);
			if (allFrom.size() == 1) {//só tem um elemento com este nome
				return allFrom.get(0);
			}else{
				if(allFrom.size() > 1){
					System.err.println("Error! In the DCL Specification has two elements with the same name (" + elementToSearch.getName() + ")");
				}
			}

		} 
		return null;
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

		}else if (dclStructureElement instanceof DCLComponent) {

			element = StructureFactory.eINSTANCE.createComponent();
			element.setName(dclStructureElement.getName());

		} else if (dclStructureElement instanceof DCLSubSystem) {

			element = StructureFactory.eINSTANCE.createSubsystem();
			element.setName(dclStructureElement.getName());

		} else if (dclStructureElement instanceof DCLModule) {

			element = StructureFactory.eINSTANCE.createComponent();
			element.setName(dclStructureElement.getName());

		}

		return element;
	}

	private StructureModel getStructureModelFromKDM(Segment segment, String nameToSearch) {
		StructureModel structureModel = null;
		ValidateFilter<?, ?> filter = ValidateFilterJavaFactory.eINSTANCE.createValidateFilterNameOfKDMFramework(nameToSearch);
		Map<String, List<StructureModel>> allFromSegment = KDMModelReaderJavaFactory.eINSTANCE.createKDMStructureModelReaderWithFilter(filter).getAllFromSegment(segment);
		for (String key : allFromSegment.keySet()) {
			if(allFromSegment.get(key).size() == 1){
				structureModel = allFromSegment.get(key).get(0);
				break;
			}
		}
		return structureModel;
	}
	
}
