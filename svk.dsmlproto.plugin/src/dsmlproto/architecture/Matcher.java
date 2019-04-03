package dsmlproto.architecture;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.IElementMatcher;

public class Matcher implements IElementMatcher {
	/**
	 * A no context matcher used to register element type bindings in the extension points  
	 */
		@Override
		public boolean matches(EObject eObject) {
			return false;
		}
}
