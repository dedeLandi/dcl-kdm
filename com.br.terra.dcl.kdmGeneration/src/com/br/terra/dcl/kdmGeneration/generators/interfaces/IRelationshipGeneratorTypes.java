/**
 * @author Landi
 * 
 */
package com.br.terra.dcl.kdmGeneration.generators.interfaces;

import java.util.List;

/**
 * @author Landi
 *
 */
public interface IRelationshipGeneratorTypes<T,Y> {
	
	List<T> getRelationships(Y... elementToAdd);
	
	List<Class<?>> getRelationshipsClass();
	
	List<String> getRelationshipsNames();

}
