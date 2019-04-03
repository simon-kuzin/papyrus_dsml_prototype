/**
 */
package svk.dsmlproto.profile.dsmlproto.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import svk.dsmlproto.profile.dsmlproto.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see svk.dsmlproto.profile.dsmlproto.DsmlprotoPackage
 * @generated
 */
public class DsmlprotoAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DsmlprotoPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DsmlprotoAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DsmlprotoPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DsmlprotoSwitch<Adapter> modelSwitch =
		new DsmlprotoSwitch<Adapter>() {
			@Override
			public Adapter caseDsmlComponent(DsmlComponent object) {
				return createDsmlComponentAdapter();
			}
			@Override
			public Adapter caseDsmlClass(DsmlClass object) {
				return createDsmlClassAdapter();
			}
			@Override
			public Adapter caseDsmlNonUML(DsmlNonUML object) {
				return createDsmlNonUMLAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link svk.dsmlproto.profile.dsmlproto.DsmlComponent <em>Dsml Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svk.dsmlproto.profile.dsmlproto.DsmlComponent
	 * @generated
	 */
	public Adapter createDsmlComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svk.dsmlproto.profile.dsmlproto.DsmlClass <em>Dsml Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svk.dsmlproto.profile.dsmlproto.DsmlClass
	 * @generated
	 */
	public Adapter createDsmlClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link svk.dsmlproto.profile.dsmlproto.DsmlNonUML <em>Dsml Non UML</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see svk.dsmlproto.profile.dsmlproto.DsmlNonUML
	 * @generated
	 */
	public Adapter createDsmlNonUMLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DsmlprotoAdapterFactory
