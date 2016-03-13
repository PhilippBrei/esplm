package org.pklose.espl.ui.handlers;

import javax.inject.Inject;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.pklose.espl.generator.IReportGenerator;

import com.google.inject.Provider;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class CreateBreReport extends AbstractHandler {
	
	@Inject
	private IReportGenerator generator;
	
	@Inject
	IResourceSetProvider resourceSetProvider;
	
	@Inject
	private Provider<EclipseResourceFileSystemAccess2> fileAccessProvider;
	/**
	 * The constructor.
	 */
	public CreateBreReport() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		
		ISelection currentSelection = HandlerUtil.getCurrentSelection(event);
		if (currentSelection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) currentSelection;
			Object firstElement = structuredSelection.getFirstElement();
			if (firstElement instanceof IFile)
			{
				IFile file = (IFile) firstElement; 
				IProject project = file.getProject();
				
				final EclipseResourceFileSystemAccess2 fsa = fileAccessProvider.get();
				
				URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
				ResourceSet rs = resourceSetProvider.get(project); 
				Resource r = rs.getResource(uri, true); 
				
				generator.createBREReport(r);
				
				MessageDialog.openInformation(
						window.getShell(),
						"org.pklose.espl.ui",
						"Report created");
			}
		}
		
		
		
		return null;
	}
}
