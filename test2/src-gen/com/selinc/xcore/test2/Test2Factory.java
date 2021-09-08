/**
 */
package com.selinc.xcore.test2;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.selinc.xcore.test2.Test2Package
 * @generated
 */
public interface Test2Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Test2Factory eINSTANCE = com.selinc.xcore.test2.impl.Test2FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Susie</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Susie</em>'.
	 * @generated
	 */
	Susie createSusie();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Test2Package getTest2Package();

} //Test2Factory
