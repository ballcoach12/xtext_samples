/**
 */
package com.selinc.xcore.test2.impl;

import com.selinc.xcore.test.Bob;

import com.selinc.xcore.test2.Susie;
import com.selinc.xcore.test2.Test2Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Susie</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.selinc.xcore.test2.impl.SusieImpl#getUncle <em>Uncle</em>}</li>
 *   <li>{@link com.selinc.xcore.test2.impl.SusieImpl#getBob <em>Bob</em>}</li>
 *   <li>{@link com.selinc.xcore.test2.impl.SusieImpl#getAunt <em>Aunt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SusieImpl extends MinimalEObjectImpl.Container implements Susie {
	/**
	 * The default value of the '{@link #getUncle() <em>Uncle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUncle()
	 * @generated
	 * @ordered
	 */
	protected static final String UNCLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUncle() <em>Uncle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUncle()
	 * @generated
	 * @ordered
	 */
	protected String uncle = UNCLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBob() <em>Bob</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBob()
	 * @generated
	 * @ordered
	 */
	protected Bob bob;

	/**
	 * The default value of the '{@link #getAunt() <em>Aunt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAunt()
	 * @generated
	 * @ordered
	 */
	protected static final String AUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAunt() <em>Aunt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAunt()
	 * @generated
	 * @ordered
	 */
	protected String aunt = AUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SusieImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Test2Package.Literals.SUSIE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUncle() {
		return uncle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUncle(String newUncle) {
		String oldUncle = uncle;
		uncle = newUncle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Test2Package.SUSIE__UNCLE, oldUncle, uncle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bob getBob() {
		if (bob != null && bob.eIsProxy()) {
			InternalEObject oldBob = (InternalEObject)bob;
			bob = (Bob)eResolveProxy(oldBob);
			if (bob != oldBob) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Test2Package.SUSIE__BOB, oldBob, bob));
			}
		}
		return bob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bob basicGetBob() {
		return bob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBob(Bob newBob) {
		Bob oldBob = bob;
		bob = newBob;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Test2Package.SUSIE__BOB, oldBob, bob));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAunt() {
		return aunt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAunt(String newAunt) {
		String oldAunt = aunt;
		aunt = newAunt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Test2Package.SUSIE__AUNT, oldAunt, aunt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Test2Package.SUSIE__UNCLE:
				return getUncle();
			case Test2Package.SUSIE__BOB:
				if (resolve) return getBob();
				return basicGetBob();
			case Test2Package.SUSIE__AUNT:
				return getAunt();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Test2Package.SUSIE__UNCLE:
				setUncle((String)newValue);
				return;
			case Test2Package.SUSIE__BOB:
				setBob((Bob)newValue);
				return;
			case Test2Package.SUSIE__AUNT:
				setAunt((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Test2Package.SUSIE__UNCLE:
				setUncle(UNCLE_EDEFAULT);
				return;
			case Test2Package.SUSIE__BOB:
				setBob((Bob)null);
				return;
			case Test2Package.SUSIE__AUNT:
				setAunt(AUNT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Test2Package.SUSIE__UNCLE:
				return UNCLE_EDEFAULT == null ? uncle != null : !UNCLE_EDEFAULT.equals(uncle);
			case Test2Package.SUSIE__BOB:
				return bob != null;
			case Test2Package.SUSIE__AUNT:
				return AUNT_EDEFAULT == null ? aunt != null : !AUNT_EDEFAULT.equals(aunt);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (uncle: ");
		result.append(uncle);
		result.append(", aunt: ");
		result.append(aunt);
		result.append(')');
		return result.toString();
	}

} //SusieImpl
