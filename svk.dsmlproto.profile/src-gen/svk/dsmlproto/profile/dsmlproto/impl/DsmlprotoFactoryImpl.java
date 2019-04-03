/**
 */
package svk.dsmlproto.profile.dsmlproto.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import svk.dsmlproto.profile.dsmlproto.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DsmlprotoFactoryImpl extends EFactoryImpl implements DsmlprotoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DsmlprotoFactory init() {
		try {
			DsmlprotoFactory theDsmlprotoFactory = (DsmlprotoFactory)EPackage.Registry.INSTANCE.getEFactory(DsmlprotoPackage.eNS_URI);
			if (theDsmlprotoFactory != null) {
				return theDsmlprotoFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DsmlprotoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DsmlprotoFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DsmlprotoPackage.DSML_COMPONENT: return createDsmlComponent();
			case DsmlprotoPackage.DSML_CLASS: return createDsmlClass();
			case DsmlprotoPackage.DSML_NON_UML: return createDsmlNonUML();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DsmlComponent createDsmlComponent() {
		DsmlComponentImpl dsmlComponent = new DsmlComponentImpl();
		return dsmlComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DsmlClass createDsmlClass() {
		DsmlClassImpl dsmlClass = new DsmlClassImpl();
		return dsmlClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DsmlNonUML createDsmlNonUML() {
		DsmlNonUMLImpl dsmlNonUML = new DsmlNonUMLImpl();
		return dsmlNonUML;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DsmlprotoPackage getDsmlprotoPackage() {
		return (DsmlprotoPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DsmlprotoPackage getPackage() {
		return DsmlprotoPackage.eINSTANCE;
	}

} //DsmlprotoFactoryImpl
