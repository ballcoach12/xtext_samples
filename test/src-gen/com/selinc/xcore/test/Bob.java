/**
 */
package com.selinc.xcore.test;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bob</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.selinc.xcore.test.Bob#getFriend <em>Friend</em>}</li>
 *   <li>{@link com.selinc.xcore.test.Bob#getAge <em>Age</em>}</li>
 * </ul>
 *
 * @see com.selinc.xcore.test.TestPackage#getBob()
 * @model
 * @generated
 */
public interface Bob extends EObject {
	/**
	 * Returns the value of the '<em><b>Friend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Friend</em>' attribute.
	 * @see #setFriend(String)
	 * @see com.selinc.xcore.test.TestPackage#getBob_Friend()
	 * @model unique="false"
	 * @generated
	 */
	String getFriend();

	/**
	 * Sets the value of the '{@link com.selinc.xcore.test.Bob#getFriend <em>Friend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Friend</em>' attribute.
	 * @see #getFriend()
	 * @generated
	 */
	void setFriend(String value);

	/**
	 * Returns the value of the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age</em>' attribute.
	 * @see #setAge(int)
	 * @see com.selinc.xcore.test.TestPackage#getBob_Age()
	 * @model unique="false"
	 * @generated
	 */
	int getAge();

	/**
	 * Sets the value of the '{@link com.selinc.xcore.test.Bob#getAge <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age</em>' attribute.
	 * @see #getAge()
	 * @generated
	 */
	void setAge(int value);

} // Bob
