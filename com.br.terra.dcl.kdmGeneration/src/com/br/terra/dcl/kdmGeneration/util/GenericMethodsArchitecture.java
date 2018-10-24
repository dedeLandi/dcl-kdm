/**
 * @author Landi
 * 
 */
package com.br.terra.dcl.kdmGeneration.util;

import java.util.List;
import java.util.Map;

import org.eclipse.gmt.modisco.omg.kdm.kdm.Segment;
import org.eclipse.gmt.modisco.omg.kdm.structure.AbstractStructureElement;
import org.eclipse.gmt.modisco.omg.kdm.structure.Component;
import org.eclipse.gmt.modisco.omg.kdm.structure.Layer;
import org.eclipse.gmt.modisco.omg.kdm.structure.StructureModel;
import org.eclipse.gmt.modisco.omg.kdm.structure.Subsystem;

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

import br.ufscar.kdm_manager.core.filters.validateFilter.factory.KDMValidateFilterJavaFactory;
import br.ufscar.kdm_manager.core.filters.validateFilter.interfaces.KDMValidateFilter;
import br.ufscar.kdm_manager.core.readers.modelReader.factory.KDMModelReaderJavaFactory;
import br.ufscar.kdm_manager.core.readers.structureReader.factory.KDMStructureReaderJavaFactory;

/**
 * @author Landi
 *
 */
public class GenericMethodsArchitecture {

	/**
	 * @author Landi
	 * @param structureModel 
	 * @param layer
	 * @return
	 */
	public static AbstractStructureElement findArchitecturaElement(StructureModel structureModel, DCLStructureElement elementToSearch) {
	
		KDMValidateFilter<?, ?> filter = KDMValidateFilterJavaFactory.eINSTANCE.createValidateFilterNameOfKDMEntity(elementToSearch.getName());
	
		if(elementToSearch instanceof DCLLayer){
	
			List<Layer> allFrom = KDMStructureReaderJavaFactory.eINSTANCE.createKDMLayerReaderWithFilter(filter).getAllFrom(structureModel);
	
			if (allFrom.size() == 1) {//s� tem um elemento com este nome
				return allFrom.get(0);
			}else{
				if(allFrom.size() > 1){
					System.err.println("Error! In the DCL Specification has two elements with the same name (" + elementToSearch.getName() + ")");
				}
			}
	
		}else if (elementToSearch instanceof DCLSubSystem) {
			
			List<Subsystem> allFrom = KDMStructureReaderJavaFactory.eINSTANCE.createKDMSubsystemReaderWithFilter(filter).getAllFrom(structureModel);
			if (allFrom.size() == 1) {//s� tem um elemento com este nome
				return allFrom.get(0);
			}else{
				if(allFrom.size() > 1){
					System.err.println("Error! In the DCL Specification has two elements with the same name (" + elementToSearch.getName() + ")");
				}
			}
			
		} else if (elementToSearch instanceof DCLModule || 
			elementToSearch instanceof DCLComponent ||
			elementToSearch instanceof DCLManagedSubsystem ||
			elementToSearch instanceof DCLManagingSubsystem ||
			elementToSearch instanceof DCLMonitor ||
			elementToSearch instanceof DCLPlanner ||
			elementToSearch instanceof DCLAnalyzer ||
			elementToSearch instanceof DCLExecutor ||
			elementToSearch instanceof DCLSensor ||
			elementToSearch instanceof DCLActuator ||
			elementToSearch instanceof DCLKnowledge ||
			elementToSearch instanceof DCLReferences) {
	
			List<Component> allFrom = KDMStructureReaderJavaFactory.eINSTANCE.createKDMComponentReaderWithFilter(filter).getAllFrom(structureModel);
			if (allFrom.size() == 1) {//s� tem um elemento com este nome
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
	 * 
	 * @author Landi
	 * @param segment
	 * @param nameToSearch
	 * @return
	 */
	public static StructureModel getStructureModelFromKDM(Segment segment, String nameToSearch) {
		StructureModel structureModel = null;
		KDMValidateFilter<?, ?> filter = KDMValidateFilterJavaFactory.eINSTANCE.createValidateFilterNameOfKDMFramework(nameToSearch);
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
