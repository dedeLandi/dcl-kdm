package com.br.terra.dcl.kdmGeneration.readers;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.br.terra.dcl.DCLStandaloneSetup;
import com.br.terra.dcl.dCL.DCDecl;
import com.br.terra.dcl.dCL.DCLStructureElement;
import com.br.terra.dcl.dCL.Model;
import com.google.inject.Injector;

/**
 * @author Landi
 *
 */
public class ReaderDCLEditor {

	private IFile dclFile = null;
	private EList<DCLStructureElement> allStructureElementsFromDCL = null;
	private EList<DCDecl> allRestrictionsFromDCL = null;
	/**
	 * 
	 */
	public ReaderDCLEditor() {
	}
	
	/**
	 * @author Landi
	 */
	public boolean readDCLEditor() {
		boolean readOK = false;

		IEditorPart editorPart = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();

		IEditorSite iEditorSite = editorPart.getEditorSite();

		if (iEditorSite != null) {
			ISelectionProvider selectionProvider = iEditorSite.getSelectionProvider();

			if (selectionProvider != null) {

				IFileEditorInput input = (IFileEditorInput) editorPart.getEditorInput();
				this.dclFile = input.getFile();


				System.out.println("Path of the file DCL: " + this.getDCLFilePath());

				Injector injector = new DCLStandaloneSetup().createInjectorAndDoEMFRegistration();

				//Andre - pega o editor aberto com o arquivo da DCL - não entendi direito o que isso faz
				XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
				resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
				Resource resource = resourceSet.getResource(URI.createURI(this.getDCLFilePath()), true);

				//Andre - pega os dados do modelo do arquivo da DCL
				Model model = (Model) resource.getContents().get(0); 

				//Andre - pega todos os elementos estruturais escritos no arquivo da DCL
				this.allStructureElementsFromDCL = model.getStructureElements();

				this.allRestrictionsFromDCL = model.getDCDecl();
				
				readOK = true;
			}
		}
		
		return readOK;
	}
	
	/**
	 * @author Landi
	 */
	public String getDCLFilePath() {
		return dclFile.getRawLocationURI().toString();
	}
	
	/**
	 * @author Landi
	 */
	public String getKDMFilePath() {
		return this.getDCLFilePath().replace(".dcl", ".xmi");
	}

	/**
	 * @return the allStructureElementsFromDCL
	 */
	public EList<DCLStructureElement> getAllStructureElementsFromDCL() {
		return allStructureElementsFromDCL;
	}

	/**
	 * @return the allRestrictionsFromDCL
	 */
	public EList<DCDecl> getAllRestrictionsFromDCL() {
		return allRestrictionsFromDCL;
	}

}
