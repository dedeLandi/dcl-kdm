/**
 * @author Landi
 * 
 */
package com.br.terra.dcl.kdmGeneration.generators.interfaces;

import java.util.List;

import org.eclipse.gmt.modisco.omg.kdm.structure.StructureModel;

import com.br.terra.dcl.dCL.DCDecl;

/**
 * @author Landi
 *
 */
public interface PatternRestrictionGenerator {

	/**
	 *  
	 * @author Landi
	 * @param kdmSegment 
	 * @param structureModel 
	 * @param allDCLRestrictions
	 */
	void generateRestrictions(StructureModel structureModel, List<DCDecl> allDCLRestrictions);

}