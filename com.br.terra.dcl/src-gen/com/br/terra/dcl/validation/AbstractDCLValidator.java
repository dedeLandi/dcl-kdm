/*
 * generated by Xtext
 */
package com.br.terra.dcl.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractDCLValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(com.br.terra.dcl.dCL.DCLPackage.eINSTANCE);
		return result;
	}
}