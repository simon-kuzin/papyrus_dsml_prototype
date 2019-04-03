/**
 */
package svk.dsmlproto.profile.dsmlproto;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dsml Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link svk.dsmlproto.profile.dsmlproto.DsmlComponent#getBase_Component <em>Base Component</em>}</li>
 * </ul>
 *
 * @see svk.dsmlproto.profile.dsmlproto.DsmlprotoPackage#getDsmlComponent()
 * @model
 * @generated
 */
public interface DsmlComponent extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Component</em>' reference.
	 * @see #setBase_Component(Component)
	 * @see svk.dsmlproto.profile.dsmlproto.DsmlprotoPackage#getDsmlComponent_Base_Component()
	 * @model ordered="false"
	 * @generated
	 */
	Component getBase_Component();

	/**
	 * Sets the value of the '{@link svk.dsmlproto.profile.dsmlproto.DsmlComponent#getBase_Component <em>Base Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Component</em>' reference.
	 * @see #getBase_Component()
	 * @generated
	 */
	void setBase_Component(Component value);

} // DsmlComponent
