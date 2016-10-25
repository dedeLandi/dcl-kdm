/**
 * @author Landi
 * 
 */
package com.br.terra.dcl.kdmGeneration.generators.interfaces;

import java.util.List;

import org.eclipse.gmt.modisco.omg.kdm.structure.StructureModel;

/**
 * @author Landi
 *
 */
public interface PatternRestrictionGenerator<T> {

	/**
	 *  
	 * @author Landi
	 * @param kdmSegment 
	 * @param structureModel 
	 * @param allDCLRestrictions
	 */
	void generateRestrictions(StructureModel structureModel, List<T> allDCLElements);

}