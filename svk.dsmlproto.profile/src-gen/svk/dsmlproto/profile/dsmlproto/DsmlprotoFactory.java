/**
 */
package svk.dsmlproto.profile.dsmlproto;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see svk.dsmlproto.profile.dsmlproto.DsmlprotoPackage
 * @generated
 */
public interface DsmlprotoFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DsmlprotoFactory eINSTANCE = svk.dsmlproto.profile.dsmlproto.impl.DsmlprotoFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Dsml Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dsml Component</em>'.
	 * @generated
	 */
	DsmlComponent createDsmlComponent();

	/**
	 * Returns a new object of class '<em>Dsml Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dsml Class</em>'.
	 * @generated
	 */
	DsmlClass createDsmlClass();

	/**
	 * Returns a new object of class '<em>Dsml Non UML</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dsml Non UML</em>'.
	 * @generated
	 */
	DsmlNonUML createDsmlNonUML();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DsmlprotoPackage getDsmlprotoPackage();

} //DsmlprotoFactory
