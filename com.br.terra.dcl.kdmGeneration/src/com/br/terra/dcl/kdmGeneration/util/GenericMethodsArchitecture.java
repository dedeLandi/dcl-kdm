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
public class GenericMethodsArchitecture {

	/**
	 * @author Landi
	 * @param structureModel 
	 * @param layer
	 * @return
	 */
	public static AbstractStructureElement findArchitecturaElement(StructureModel structureModel, DCLStructureElement elementToSearch) {
	
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
	 * 
	 * @author Landi
	 * @param segment
	 * @param nameToSearch
	 * @return
	 */
	public static StructureModel getStructureModelFromKDM(Segment segment, String nameToSearch) {
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
