package com.br.terra.dcl.kdmGeneration.actions;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.gmt.modisco.omg.kdm.kdm.KdmPackage;
import org.eclipse.gmt.modisco.omg.kdm.kdm.Segment;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import com.br.terra.dcl.kdmGeneration.generators.impl.architecture.ArchitecturalGenerator;
import com.br.terra.dcl.kdmGeneration.generators.impl.restrictions.RestrictionsGenerator;
import com.br.terra.dcl.kdmGeneration.readers.ReaderDCLEditor;

public class DCL2KDM implements IObjectActionDelegate {

	private ReaderDCLEditor readerDCLEditor = null;

	public static Segment kdmSegment = null;

	/**
	 * Constructor for Action1.
	 */
	public DCL2KDM() {
		super();
	}


	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {

		try {
			this.clearObjects();

			this.loadDCLFile();

			this.generateArchitecture();

			this.generateRestrictions();

			this.saveKDMSegment();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void clearObjects() {
		this.readerDCLEditor = null;

		DCL2KDM.kdmSegment = null;
	}

	private void loadDCLFile() throws Exception {
		this.readerDCLEditor = new ReaderDCLEditor();

		if(!readerDCLEditor.readDCLEditor()){
			throw new Exception("Error! Some problem occurred during the read of the DCL file.");
		}
	}

	private void generateArchitecture() {
		ArchitecturalGenerator architecturalGenerator = new ArchitecturalGenerator(readerDCLEditor.getAllStructureElementsFromDCL());
		architecturalGenerator.generateArchitecture();
	}


	private void generateRestrictions() {
		RestrictionsGenerator restrictionsGenerator = new RestrictionsGenerator(readerDCLEditor.getAllStructureElementsFromDCL(), readerDCLEditor.getAllRestrictionsFromDCL());
		restrictionsGenerator.generateRestrictions();
	}


	private void saveKDMSegment() {
		try {
			System.out.println("Path to save the planned KDM: " + this.readerDCLEditor.getKDMFilePath() );

			KdmPackage.eINSTANCE.eClass();

			Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
			Map<String, Object> m = reg.getExtensionToFactoryMap();
			m.put("xmi", new XMIResourceFactoryImpl());

			ResourceSet resSet = new ResourceSetImpl();

			Resource resource = resSet.createResource(URI.createURI(this.readerDCLEditor.getKDMFilePath()));

			resource.getContents().add(DCL2KDM.kdmSegment);

			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {

	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {


	}

}
