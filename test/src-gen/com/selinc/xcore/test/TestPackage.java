/**
 */
package com.selinc.xcore.test;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see com.selinc.xcore.test.TestFactory
 * @model kind="package"
 * @generated
 */
public interface TestPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "test";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "com.selinc.xcore.test";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "test";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestPackage eINSTANCE = com.selinc.xcore.test.impl.TestPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.selinc.xcore.test.impl.BobImpl <em>Bob</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.selinc.xcore.test.impl.BobImpl
	 * @see com.selinc.xcore.test.impl.TestPackageImpl#getBob()
	 * @generated
	 */
	int BOB = 0;

	/**
	 * The feature id for the '<em><b>Friend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOB__FRIEND = 0;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOB__AGE = 1;

	/**
	 * The number of structural features of the '<em>Bob</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOB_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Bob</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOB_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link com.selinc.xcore.test.Bob <em>Bob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bob</em>'.
	 * @see com.selinc.xcore.test.Bob
	 * @generated
	 */
	EClass getBob();

	/**
	 * Returns the meta object for the attribute '{@link com.selinc.xcore.test.Bob#getFriend <em>Friend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Friend</em>'.
	 * @see com.selinc.xcore.test.Bob#getFriend()
	 * @see #getBob()
	 * @generated
	 */
	EAttribute getBob_Friend();

	/**
	 * Returns the meta object for the attribute '{@link com.selinc.xcore.test.Bob#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see com.selinc.xcore.test.Bob#getAge()
	 * @see #getBob()
	 * @generated
	 */
	EAttribute getBob_Age();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TestFactory getTestFactory();

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
		 * The meta object literal for the '{@link com.selinc.xcore.test.impl.BobImpl <em>Bob</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.selinc.xcore.test.impl.BobImpl
		 * @see com.selinc.xcore.test.impl.TestPackageImpl#getBob()
		 * @generated
		 */
		EClass BOB = eINSTANCE.getBob();

		/**
		 * The meta object literal for the '<em><b>Friend</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOB__FRIEND = eINSTANCE.getBob_Friend();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOB__AGE = eINSTANCE.getBob_Age();

	}

} //TestPackage
