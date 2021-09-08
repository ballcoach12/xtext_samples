/**
 */
package com.selinc.xcore.test2;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see com.selinc.xcore.test2.Test2Factory
 * @model kind="package"
 * @generated
 */
public interface Test2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "test2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "com.selinc.xcore.test2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "test2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Test2Package eINSTANCE = com.selinc.xcore.test2.impl.Test2PackageImpl.init();

	/**
	 * The meta object id for the '{@link com.selinc.xcore.test2.impl.SusieImpl <em>Susie</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.selinc.xcore.test2.impl.SusieImpl
	 * @see com.selinc.xcore.test2.impl.Test2PackageImpl#getSusie()
	 * @generated
	 */
	int SUSIE = 0;

	/**
	 * The feature id for the '<em><b>Uncle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSIE__UNCLE = 0;

	/**
	 * The feature id for the '<em><b>Bob</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSIE__BOB = 1;

	/**
	 * The feature id for the '<em><b>Aunt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSIE__AUNT = 2;

	/**
	 * The number of structural features of the '<em>Susie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSIE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Susie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUSIE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link com.selinc.xcore.test2.Susie <em>Susie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Susie</em>'.
	 * @see com.selinc.xcore.test2.Susie
	 * @generated
	 */
	EClass getSusie();

	/**
	 * Returns the meta object for the attribute '{@link com.selinc.xcore.test2.Susie#getUncle <em>Uncle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uncle</em>'.
	 * @see com.selinc.xcore.test2.Susie#getUncle()
	 * @see #getSusie()
	 * @generated
	 */
	EAttribute getSusie_Uncle();

	/**
	 * Returns the meta object for the reference '{@link com.selinc.xcore.test2.Susie#getBob <em>Bob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bob</em>'.
	 * @see com.selinc.xcore.test2.Susie#getBob()
	 * @see #getSusie()
	 * @generated
	 */
	EReference getSusie_Bob();

	/**
	 * Returns the meta object for the attribute '{@link com.selinc.xcore.test2.Susie#getAunt <em>Aunt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aunt</em>'.
	 * @see com.selinc.xcore.test2.Susie#getAunt()
	 * @see #getSusie()
	 * @generated
	 */
	EAttribute getSusie_Aunt();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Test2Factory getTest2Factory();

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
		 * The meta object literal for the '{@link com.selinc.xcore.test2.impl.SusieImpl <em>Susie</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.selinc.xcore.test2.impl.SusieImpl
		 * @see com.selinc.xcore.test2.impl.Test2PackageImpl#getSusie()
		 * @generated
		 */
		EClass SUSIE = eINSTANCE.getSusie();

		/**
		 * The meta object literal for the '<em><b>Uncle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUSIE__UNCLE = eINSTANCE.getSusie_Uncle();

		/**
		 * The meta object literal for the '<em><b>Bob</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUSIE__BOB = eINSTANCE.getSusie_Bob();

		/**
		 * The meta object literal for the '<em><b>Aunt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUSIE__AUNT = eINSTANCE.getSusie_Aunt();

	}

} //Test2Package
