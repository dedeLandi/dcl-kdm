package com.br.terra.dcl.kdmGeneration.actions;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.gmt.modisco.omg.kdm.code.CodeFactory;
import org.eclipse.gmt.modisco.omg.kdm.code.CodeModel;
import org.eclipse.gmt.modisco.omg.kdm.kdm.KdmFactory;
import org.eclipse.gmt.modisco.omg.kdm.kdm.KdmPackage;
import org.eclipse.gmt.modisco.omg.kdm.kdm.Segment;
import org.eclipse.gmt.modisco.omg.kdm.structure.AbstractStructureElement;
import org.eclipse.gmt.modisco.omg.kdm.structure.Component;
import org.eclipse.gmt.modisco.omg.kdm.structure.Layer;
import org.eclipse.gmt.modisco.omg.kdm.structure.StructureFactory;
import org.eclipse.gmt.modisco.omg.kdm.structure.StructureModel;
import org.eclipse.gmt.modisco.omg.kdm.structure.Subsystem;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.br.terra.dcl.DCLStandaloneSetup;
import com.br.terra.dcl.dCL.DCDecl;
import com.br.terra.dcl.dCL.DCLComponent;
import com.br.terra.dcl.dCL.DCLLayer;
import com.br.terra.dcl.dCL.DCLModule;
import com.br.terra.dcl.dCL.DCLStructureElement;
import com.br.terra.dcl.dCL.DCLSubSystem;
import com.br.terra.dcl.dCL.Model;
import com.google.inject.Injector;

import br.ufscar.kdm_manager.core.filters.validateFilter.factory.ValidateFilterJavaFactory;
import br.ufscar.kdm_manager.core.filters.validateFilter.interfaces.ValidateFilter;
import br.ufscar.kdm_manager.core.readers.modelReader.factory.KDMModelReaderJavaFactory;
import br.ufscar.kdm_manager.core.readers.structureReader.factory.KDMStructureReaderJavaFactory;

public class DCL2KDM implements IObjectActionDelegate {

	private String dclFilePath = "";
	private String kdmFilePath = "";
	private static final String STRUCTURAL_NAME = "PlannedArchitecture";
	private static final String CODE_NAME = "InstancesReferenced";

	private EList<DCLStructureElement> allStructureElementsFromDCL = null;

	private EList<DCDecl> allRestrictionsFromDCL = null;

	private Segment kdmSegment = null;

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

		this.clearObjects();

		this.createSegmentToKDM();

		this.loadDCLFile();

		this.generateArchitecture();

		this.generateRestrictions();

		this.saveKDMSegment();

	}

	private void clearObjects() {
		this.dclFilePath = "";
		this.kdmFilePath = "";

		this.allStructureElementsFromDCL = null;

		this.allRestrictionsFromDCL = null;

		this.kdmSegment = null;
	}

	private void createSegmentToKDM() {
		this.kdmSegment = KdmFactory.eINSTANCE.createSegment();
		this.kdmSegment.setName(STRUCTURAL_NAME);

		StructureModel structureModel = StructureFactory.eINSTANCE.createStructureModel();
		structureModel.setName(STRUCTURAL_NAME);

		CodeModel codeModel = CodeFactory.eINSTANCE.createCodeModel();
		codeModel.setName(CODE_NAME);

		this.kdmSegment.getModel().add(structureModel);	
		this.kdmSegment.getModel().add(codeModel);	
	}


	private void loadDCLFile() {
		IEditorPart editorPart = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();

		IEditorSite iEditorSite = editorPart.getEditorSite();

		if (iEditorSite != null) {
			ISelectionProvider selectionProvider = iEditorSite.getSelectionProvider();

			if (selectionProvider != null) {

				IFileEditorInput input = (IFileEditorInput) editorPart.getEditorInput();
				IFile dclFile = input.getFile();


				this.dclFilePath = dclFile.getRawLocationURI().toString();

				System.out.println("Path of the file DCL: " + this.dclFilePath);

				this.kdmFilePath = this.dclFilePath.replace(".dcl", ".xmi");

				Injector injector = new DCLStandaloneSetup().createInjectorAndDoEMFRegistration();

				//Andre - pega o editor aberto com o arquivo da DCL - não entendi direito o que isso faz
				XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
				resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
				Resource resource = resourceSet.getResource(URI.createURI(this.dclFilePath), true);

				//Andre - pega os dados do modelo do arquivo da DCL
				Model model = (Model) resource.getContents().get(0); 

				//Andre - pega todos os elementos estruturais escritos no arquivo da DCL
				this.allStructureElementsFromDCL = model.getStructureElements();

				this.allRestrictionsFromDCL = model.getDCDecl();
			}
		}
	}

	private void generateArchitecture() {

		this.createElementsWithoutHierarchy();

		this.createElementsWithHierarchy();

	}

	/**
	 * @author Landi
	 */
	private void createElementsWithoutHierarchy() {
		StructureModel structureModel = this.getStructureModelFromThisKDM();

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
		StructureModel structureModel = this.getStructureModelFromThisKDM();

		for (DCLStructureElement dclStructureElement : allStructureElementsFromDCL) {

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


	private void generateRestrictions() {

		this.generateHierarquicalRestrictions();

		this.generateLayerRestrictions();

		this.generateDefinedRestrictions();
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

	private void saveKDMSegment() {
		System.out.println("Path to save the planned KDM: " + this.kdmFilePath );

		KdmPackage.eINSTANCE.eClass();

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());

		ResourceSet resSet = new ResourceSetImpl();

		Resource resource = resSet.createResource(URI.createURI(this.kdmFilePath));

		resource.getContents().add(this.kdmSegment);

		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {

	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {


	}

	private StructureModel getStructureModelFromThisKDM() {
		StructureModel structureModel = null;
		ValidateFilter<?, ?> filter = ValidateFilterJavaFactory.eINSTANCE.createValidateFilterNameOfKDMFramework(STRUCTURAL_NAME);
		Map<String, List<StructureModel>> allFromSegment = KDMModelReaderJavaFactory.eINSTANCE.createKDMStructureModelReaderWithFilter(filter).getAllFromSegment(this.kdmSegment);
		for (String key : allFromSegment.keySet()) {
			if(allFromSegment.get(key).size() == 1){
				structureModel = allFromSegment.get(key).get(0);
				break;
			}
		}
		return structureModel;
	}

	private CodeModel getCodeModelFromThisKDM() {
		CodeModel codeModel = null;
		ValidateFilter<?, ?> filter = ValidateFilterJavaFactory.eINSTANCE.createValidateFilterNameOfKDMFramework(STRUCTURAL_NAME);
		Map<String, List<CodeModel>> allFromSegment = KDMModelReaderJavaFactory.eINSTANCE.createKDMCodeModelReaderWithFilter(filter).getAllFromSegment(this.kdmSegment);
		for (String key : allFromSegment.keySet()) {
			if(allFromSegment.get(key).size() == 1){
				codeModel = allFromSegment.get(key).get(0);
				break;
			}
		}
		return codeModel;
	}

}
