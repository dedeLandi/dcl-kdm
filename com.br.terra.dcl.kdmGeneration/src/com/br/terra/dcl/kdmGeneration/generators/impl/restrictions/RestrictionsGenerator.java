package com.br.terra.dcl.kdmGeneration.generators.impl.restrictions;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.gmt.modisco.omg.kdm.code.CodeFactory;
import org.eclipse.gmt.modisco.omg.kdm.code.CodeModel;
import org.eclipse.gmt.modisco.omg.kdm.structure.StructureModel;

import com.br.terra.dcl.dCL.DCDecl;
import com.br.terra.dcl.dCL.DCLStructureElement;
import com.br.terra.dcl.kdmGeneration.actions.DCL2KDM;
import com.br.terra.dcl.kdmGeneration.generators.impl.architecture.ArchitecturalGenerator;
import com.br.terra.dcl.kdmGeneration.generators.impl.restrictions.restrictionsPatterns.automatic.HierarquicalRestrictionGenerator;
import com.br.terra.dcl.kdmGeneration.generators.impl.restrictions.restrictionsPatterns.automatic.LayerRestrictionGenerator;
import com.br.terra.dcl.kdmGeneration.generators.impl.restrictions.restrictionsPatterns.manual.CanOnlyRestrictionGenerator;
import com.br.terra.dcl.kdmGeneration.generators.impl.restrictions.restrictionsPatterns.manual.CanRestrictionGenerator;
import com.br.terra.dcl.kdmGeneration.generators.impl.restrictions.restrictionsPatterns.manual.CannotRestrictionGenerator;
import com.br.terra.dcl.kdmGeneration.generators.impl.restrictions.restrictionsPatterns.manual.MustRestrictionGenerator;
import com.br.terra.dcl.kdmGeneration.generators.impl.restrictions.restrictionsPatterns.manual.OnlyCanRestrictionGenerator;
import com.br.terra.dcl.kdmGeneration.util.GenericMethodsArchitecture;
import com.br.terra.dcl.kdmGeneration.util.GenericMethodsRestrictions;

/**
 * @author Landi
 *
 */
public class RestrictionsGenerator {

	public static final String CODE_NAME = "InstancesReferenced";

	private EList<DCLStructureElement> allStructureElementsFromDCL = null;

	private EList<DCDecl> allRestrictionsFromDCL = null;


	public RestrictionsGenerator(EList<DCLStructureElement> allStructureElementsFromDCL, EList<DCDecl> allRestrictionsFromDCL) {
		this.allStructureElementsFromDCL = allStructureElementsFromDCL;
		this.allRestrictionsFromDCL = allRestrictionsFromDCL;
	}

	/**
	 * @author Landi
	 * @return
	 */
	public void generateRestrictions() {

		this.createCodeToSegment();

		this.generateHierarquicalRestrictions();

		this.generateLayerRestrictions();

		this.generateDefinedRestrictions();

	}

	private void createCodeToSegment() {
		CodeModel codeModel = CodeFactory.eINSTANCE.createCodeModel();
		codeModel.setName(CODE_NAME);

		DCL2KDM.kdmSegment.getModel().add(codeModel);	
	}

	private void generateHierarquicalRestrictions() {
		StructureModel structureModel = GenericMethodsArchitecture.getStructureModelFromKDM(DCL2KDM.kdmSegment, ArchitecturalGenerator.STRUCTURAL_NAME);

		new HierarquicalRestrictionGenerator().generateRestrictions(structureModel, allStructureElementsFromDCL);
	}

	private void generateLayerRestrictions() {
		StructureModel structureModel = GenericMethodsArchitecture.getStructureModelFromKDM(DCL2KDM.kdmSegment, ArchitecturalGenerator.STRUCTURAL_NAME);

		new LayerRestrictionGenerator().generateRestrictions(structureModel, allStructureElementsFromDCL);
	}

	private void generateDefinedRestrictions() {
		StructureModel structureModel = GenericMethodsArchitecture.getStructureModelFromKDM(DCL2KDM.kdmSegment, ArchitecturalGenerator.STRUCTURAL_NAME);
		
		List<DCDecl> allCanRestrictions = new ArrayList<DCDecl>();
		List<DCDecl> allOnlyCanRestrictions = new ArrayList<DCDecl>();
		List<DCDecl> allCanOnlyRestrictions = new ArrayList<DCDecl>();
		List<DCDecl> allCannotRestrictions = new ArrayList<DCDecl>();
		List<DCDecl> allMustRestrictions = new ArrayList<DCDecl>();
		
		for (DCDecl dcDecl : allRestrictionsFromDCL) {
			
			if(dcDecl.getOnly() == null && dcDecl.getOnly2() == null && dcDecl.getCan() != null){
				allCanRestrictions.add(dcDecl);
			}
			if(dcDecl.getOnly() != null && dcDecl.getCan() != null){
				allOnlyCanRestrictions.add(dcDecl);
			}
			if(dcDecl.getCannot() != null){
				allCannotRestrictions.add(dcDecl);
			}
			if(dcDecl.getOnly2() != null && dcDecl.getCan() != null){
				allCanOnlyRestrictions.add(dcDecl);
			}
			if(dcDecl.getMust() != null){
				allMustRestrictions.add(dcDecl);
			}
			
		}
		
		new CanRestrictionGenerator().generateRestrictions(structureModel, allCanRestrictions);
		
		new OnlyCanRestrictionGenerator().generateRestrictions(structureModel, allOnlyCanRestrictions);
		
		new CanOnlyRestrictionGenerator().generateRestrictions(structureModel, allCanOnlyRestrictions);
		
		new MustRestrictionGenerator().generateRestrictions(structureModel, allMustRestrictions);

		new CannotRestrictionGenerator().generateRestrictions(structureModel, allCannotRestrictions);
		
		GenericMethodsRestrictions.removeAggregatedRelationshipWithDensityEquals(structureModel, 0);
	}

}
