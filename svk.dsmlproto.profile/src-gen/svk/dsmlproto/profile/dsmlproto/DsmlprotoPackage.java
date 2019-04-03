/**
 */
package svk.dsmlproto.profile.dsmlproto;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see svk.dsmlproto.profile.dsmlproto.DsmlprotoFactory
 * @model kind="package"
 * @generated
 */
public interface DsmlprotoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dsmlproto";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://svk.dsmlproto";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dsmlproto";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DsmlprotoPackage eINSTANCE = svk.dsmlproto.profile.dsmlproto.impl.DsmlprotoPackageImpl.init();

	/**
	 * The meta object id for the '{@link svk.dsmlproto.profile.dsmlproto.impl.DsmlComponentImpl <em>Dsml Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svk.dsmlproto.profile.dsmlproto.impl.DsmlComponentImpl
	 * @see svk.dsmlproto.profile.dsmlproto.impl.DsmlprotoPackageImpl#getDsmlComponent()
	 * @generated
	 */
	int DSML_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSML_COMPONENT__BASE_COMPONENT = 0;

	/**
	 * The number of structural features of the '<em>Dsml Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSML_COMPONENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Dsml Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSML_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link svk.dsmlproto.profile.dsmlproto.impl.DsmlClassImpl <em>Dsml Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svk.dsmlproto.profile.dsmlproto.impl.DsmlClassImpl
	 * @see svk.dsmlproto.profile.dsmlproto.impl.DsmlprotoPackageImpl#getDsmlClass()
	 * @generated
	 */
	int DSML_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSML_CLASS__BASE_CLASS = 0;

	/**
	 * The number of structural features of the '<em>Dsml Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSML_CLASS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Dsml Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSML_CLASS_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link svk.dsmlproto.profile.dsmlproto.impl.DsmlNonUMLImpl <em>Dsml Non UML</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see svk.dsmlproto.profile.dsmlproto.impl.DsmlNonUMLImpl
	 * @see svk.dsmlproto.profile.dsmlproto.impl.DsmlprotoPackageImpl#getDsmlNonUML()
	 * @generated
	 */
	int DSML_NON_UML = 2;

	/**
	 * The number of structural features of the '<em>Dsml Non UML</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSML_NON_UML_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Dsml Non UML</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSML_NON_UML_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link svk.dsmlproto.profile.dsmlproto.DsmlComponent <em>Dsml Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dsml Component</em>'.
	 * @see svk.dsmlproto.profile.dsmlproto.DsmlComponent
	 * @generated
	 */
	EClass getDsmlComponent();

	/**
	 * Returns the meta object for the reference '{@link svk.dsmlproto.profile.dsmlproto.DsmlComponent#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see svk.dsmlproto.profile.dsmlproto.DsmlComponent#getBase_Component()
	 * @see #getDsmlComponent()
	 * @generated
	 */
	EReference getDsmlComponent_Base_Component();

	/**
	 * Returns the meta object for class '{@link svk.dsmlproto.profile.dsmlproto.DsmlClass <em>Dsml Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dsml Class</em>'.
	 * @see svk.dsmlproto.profile.dsmlproto.DsmlClass
	 * @generated
	 */
	EClass getDsmlClass();

	/**
	 * Returns the meta object for the reference '{@link svk.dsmlproto.profile.dsmlproto.DsmlClass#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see svk.dsmlproto.profile.dsmlproto.DsmlClass#getBase_Class()
	 * @see #getDsmlClass()
	 * @generated
	 */
	EReference getDsmlClass_Base_Class();

	/**
	 * Returns the meta object for class '{@link svk.dsmlproto.profile.dsmlproto.DsmlNonUML <em>Dsml Non UML</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dsml Non UML</em>'.
	 * @see svk.dsmlproto.profile.dsmlproto.DsmlNonUML
	 * @generated
	 */
	EClass getDsmlNonUML();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DsmlprotoFactory getDsmlprotoFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link svk.dsmlproto.profile.dsmlproto.impl.DsmlComponentImpl <em>Dsml Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svk.dsmlproto.profile.dsmlproto.impl.DsmlComponentImpl
		 * @see svk.dsmlproto.profile.dsmlproto.impl.DsmlprotoPackageImpl#getDsmlComponent()
		 * @generated
		 */
		EClass DSML_COMPONENT = eINSTANCE.getDsmlComponent();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSML_COMPONENT__BASE_COMPONENT = eINSTANCE.getDsmlComponent_Base_Component();

		/**
		 * The meta object literal for the '{@link svk.dsmlproto.profile.dsmlproto.impl.DsmlClassImpl <em>Dsml Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svk.dsmlproto.profile.dsmlproto.impl.DsmlClassImpl
		 * @see svk.dsmlproto.profile.dsmlproto.impl.DsmlprotoPackageImpl#getDsmlClass()
		 * @generated
		 */
		EClass DSML_CLASS = eINSTANCE.getDsmlClass();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSML_CLASS__BASE_CLASS = eINSTANCE.getDsmlClass_Base_Class();

		/**
		 * The meta object literal for the '{@link svk.dsmlproto.profile.dsmlproto.impl.DsmlNonUMLImpl <em>Dsml Non UML</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see svk.dsmlproto.profile.dsmlproto.impl.DsmlNonUMLImpl
		 * @see svk.dsmlproto.profile.dsmlproto.impl.DsmlprotoPackageImpl#getDsmlNonUML()
		 * @generated
		 */
		EClass DSML_NON_UML = eINSTANCE.getDsmlNonUML();

	}

} //DsmlprotoPackage
