/**
 */
package com.selinc.xcore.test2;

import com.selinc.xcore.test.Bob;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Susie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.selinc.xcore.test2.Susie#getUncle <em>Uncle</em>}</li>
 *   <li>{@link com.selinc.xcore.test2.Susie#getBob <em>Bob</em>}</li>
 *   <li>{@link com.selinc.xcore.test2.Susie#getAunt <em>Aunt</em>}</li>
 * </ul>
 *
 * @see com.selinc.xcore.test2.Test2Package#getSusie()
 * @model
 * @generated
 */
public interface Susie extends EObject {
	/**
	 * Returns the value of the '<em><b>Uncle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uncle</em>' attribute.
	 * @see #setUncle(String)
	 * @see com.selinc.xcore.test2.Test2Package#getSusie_Uncle()
	 * @model unique="false"
	 * @generated
	 */
	String getUncle();

	/**
	 * Sets the value of the '{@link com.selinc.xcore.test2.Susie#getUncle <em>Uncle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uncle</em>' attribute.
	 * @see #getUncle()
	 * @generated
	 */
	void setUncle(String value);

	/**
	 * Returns the value of the '<em><b>Bob</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bob</em>' reference.
	 * @see #setBob(Bob)
	 * @see com.selinc.xcore.test2.Test2Package#getSusie_Bob()
	 * @model
	 * @generated
	 */
	Bob getBob();

	/**
	 * Sets the value of the '{@link com.selinc.xcore.test2.Susie#getBob <em>Bob</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bob</em>' reference.
	 * @see #getBob()
	 * @generated
	 */
	void setBob(Bob value);

	/**
	 * Returns the value of the '<em><b>Aunt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aunt</em>' attribute.
	 * @see #setAunt(String)
	 * @see com.selinc.xcore.test2.Test2Package#getSusie_Aunt()
	 * @model unique="false"
	 * @generated
	 */
	String getAunt();

	/**
	 * Sets the value of the '{@link com.selinc.xcore.test2.Susie#getAunt <em>Aunt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aunt</em>' attribute.
	 * @see #getAunt()
	 * @generated
	 */
	void setAunt(String value);

} // Susie
