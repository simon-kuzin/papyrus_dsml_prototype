/**
 */
package svk.dsmlproto.profile.dsmlproto.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

import svk.dsmlproto.profile.dsmlproto.DsmlClass;
import svk.dsmlproto.profile.dsmlproto.DsmlComponent;
import svk.dsmlproto.profile.dsmlproto.DsmlNonUML;
import svk.dsmlproto.profile.dsmlproto.DsmlprotoFactory;
import svk.dsmlproto.profile.dsmlproto.DsmlprotoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DsmlprotoPackageImpl extends EPackageImpl implements DsmlprotoPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsmlComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsmlClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsmlNonUMLEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see svk.dsmlproto.profile.dsmlproto.DsmlprotoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DsmlprotoPackageImpl() {
		super(eNS_URI, DsmlprotoFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link DsmlprotoPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DsmlprotoPackage init() {
		if (isInited) return (DsmlprotoPackage)EPackage.Registry.INSTANCE.getEPackage(DsmlprotoPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDsmlprotoPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DsmlprotoPackageImpl theDsmlprotoPackage = registeredDsmlprotoPackage instanceof DsmlprotoPackageImpl ? (DsmlprotoPackageImpl)registeredDsmlprotoPackage : new DsmlprotoPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDsmlprotoPackage.createPackageContents();

		// Initialize created meta-data
		theDsmlprotoPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDsmlprotoPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DsmlprotoPackage.eNS_URI, theDsmlprotoPackage);
		return theDsmlprotoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDsmlComponent() {
		return dsmlComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDsmlComponent_Base_Component() {
		return (EReference)dsmlComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDsmlClass() {
		return dsmlClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDsmlClass_Base_Class() {
		return (EReference)dsmlClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDsmlNonUML() {
		return dsmlNonUMLEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DsmlprotoFactory getDsmlprotoFactory() {
		return (DsmlprotoFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		dsmlComponentEClass = createEClass(DSML_COMPONENT);
		createEReference(dsmlComponentEClass, DSML_COMPONENT__BASE_COMPONENT);

		dsmlClassEClass = createEClass(DSML_CLASS);
		createEReference(dsmlClassEClass, DSML_CLASS__BASE_CLASS);

		dsmlNonUMLEClass = createEClass(DSML_NON_UML);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(dsmlComponentEClass, DsmlComponent.class, "DsmlComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDsmlComponent_Base_Component(), theUMLPackage.getComponent(), null, "base_Component", null, 0, 1, DsmlComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dsmlClassEClass, DsmlClass.class, "DsmlClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDsmlClass_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 0, 1, DsmlClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dsmlNonUMLEClass, DsmlNonUML.class, "DsmlNonUML", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //DsmlprotoPackageImpl
