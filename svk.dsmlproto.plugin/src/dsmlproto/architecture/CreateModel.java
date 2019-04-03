package dsmlproto.architecture;


import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.uml.diagram.common.commands.ModelCreationCommandBase;
import org.eclipse.papyrus.uml.tools.utils.PackageUtil;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.UMLFactory;

/**
 * The Class CreateUMLModelCommand.
 */
public class CreateModel extends ModelCreationCommandBase {

	private String s;

	/**
	 * @see org.eclipse.papyrus.infra.core.extension.commands.ModelCreationCommandBase#createRootElement()
	 *
	 * @return
	 */

	@Override
	protected EObject createRootElement() {
		return UMLFactory.eINSTANCE.createModel();
	}

	/**
	 * @see org.eclipse.papyrus.infra.core.extension.commands.ModelCreationCommandBase#initializeModel(org.eclipse.emf.ecore.EObject)
	 *
	 * @param owner
	 */

	@Override
	protected void initializeModel(EObject owner) {
		super.initializeModel(owner);
		((org.eclipse.uml2.uml.Package) owner).setName(getModelName());
		Package packageOwner = (Package) owner;
		URI profileURI=URI.createURI("pathmap://DSMLPROTO_PROFILE/dsmlproto.profile.uml");//apply Sample Profile
		Profile sample = null;
		
		try 
		{
			sample = (Profile) PackageUtil.loadPackage(profileURI, owner.eResource().getResourceSet());
		}
		catch (Exception e )
		{
			s = e.getMessage();
		}
		
		if (sample != null) {
			PackageUtil.applyProfile(packageOwner, sample, false);
		}
	}

	/**
	 * Gets the model name.
	 *
	 * @return the model name
	 */
	protected String getModelName() {
		return "DSMLProtoModel";
	}
}
