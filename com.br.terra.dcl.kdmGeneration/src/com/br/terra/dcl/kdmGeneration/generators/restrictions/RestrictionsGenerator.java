/**
 * @author Landi
 * 
 */
package com.br.terra.dcl.kdmGeneration.generators.restrictions;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.gmt.modisco.omg.kdm.code.CodeFactory;
import org.eclipse.gmt.modisco.omg.kdm.code.CodeModel;
import org.eclipse.gmt.modisco.omg.kdm.kdm.Segment;

import com.br.terra.dcl.dCL.DCDecl;
import com.br.terra.dcl.dCL.DCLStructureElement;

import br.ufscar.kdm_manager.core.filters.validateFilter.factory.ValidateFilterJavaFactory;
import br.ufscar.kdm_manager.core.filters.validateFilter.interfaces.ValidateFilter;
import br.ufscar.kdm_manager.core.readers.modelReader.factory.KDMModelReaderJavaFactory;

/**
 * @author Landi
 *
 */
public class RestrictionsGenerator {

	private static final String CODE_NAME = "InstancesReferenced";
	
	private Segment kdmSegment = null;
	
	private EList<DCLStructureElement> allStructureElementsFromDCL = null;

	private EList<DCDecl> allRestrictionsFromDCL = null;

	
	public RestrictionsGenerator(Segment kdmSegment, EList<DCLStructureElement> allStructureElementsFromDCL, EList<DCDecl> allRestrictionsFromDCL) {
		this.kdmSegment = kdmSegment;
		this.allStructureElementsFromDCL = allStructureElementsFromDCL;
		this.allRestrictionsFromDCL = allRestrictionsFromDCL;
	}

	/**
	 * @author Landi
	 * @return
	 */
	public Segment generateRestrictions() {
		
		this.createCodeToSegment();
		
		this.generateHierarquicalRestrictions();

		this.generateLayerRestrictions();

		this.generateDefinedRestrictions();
		
		return this.kdmSegment;
	}
	
	private void createCodeToSegment() {
		CodeModel codeModel = CodeFactory.eINSTANCE.createCodeModel();
		codeModel.setName(CODE_NAME);

		this.kdmSegment.getModel().add(codeModel);	
	}
	
	private void generateDefinedRestrictions() {
		// TODO Auto-generated method stub

	}


	private void generateLayerRestrictions() {
		// TODO Auto-generated method stub

	}


	private void generateHierarquicalRestrictions() {
		// TODO Auto-generated method stub

	}
	
	private CodeModel getCodeModelFromKDM(Segment segment, String nameToSearch) {
		CodeModel codeModel = null;
		ValidateFilter<?, ?> filter = ValidateFilterJavaFactory.eINSTANCE.createValidateFilterNameOfKDMFramework(nameToSearch);
		Map<String, List<CodeModel>> allFromSegment = KDMModelReaderJavaFactory.eINSTANCE.createKDMCodeModelReaderWithFilter(filter).getAllFromSegment(segment);
		for (String key : allFromSegment.keySet()) {
			if(allFromSegment.get(key).size() == 1){
				codeModel = allFromSegment.get(key).get(0);
				break;
			}
		}
		return codeModel;
	}
}
