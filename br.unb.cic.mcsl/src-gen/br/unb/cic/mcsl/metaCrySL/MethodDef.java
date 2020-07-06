/**
 * generated by Xtext 2.22.0
 */
package br.unb.cic.mcsl.metaCrySL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.unb.cic.mcsl.metaCrySL.MethodDef#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link br.unb.cic.mcsl.metaCrySL.MethodDef#isArgs <em>Args</em>}</li>
 * </ul>
 *
 * @see br.unb.cic.mcsl.metaCrySL.MetaCrySLPackage#getMethodDef()
 * @model
 * @generated
 */
public interface MethodDef extends EObject
{
  /**
   * Returns the value of the '<em><b>Method Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method Name</em>' attribute.
   * @see #setMethodName(String)
   * @see br.unb.cic.mcsl.metaCrySL.MetaCrySLPackage#getMethodDef_MethodName()
   * @model
   * @generated
   */
  String getMethodName();

  /**
   * Sets the value of the '{@link br.unb.cic.mcsl.metaCrySL.MethodDef#getMethodName <em>Method Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method Name</em>' attribute.
   * @see #getMethodName()
   * @generated
   */
  void setMethodName(String value);

  /**
   * Returns the value of the '<em><b>Args</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' attribute.
   * @see #setArgs(boolean)
   * @see br.unb.cic.mcsl.metaCrySL.MetaCrySLPackage#getMethodDef_Args()
   * @model
   * @generated
   */
  boolean isArgs();

  /**
   * Sets the value of the '{@link br.unb.cic.mcsl.metaCrySL.MethodDef#isArgs <em>Args</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Args</em>' attribute.
   * @see #isArgs()
   * @generated
   */
  void setArgs(boolean value);

} // MethodDef
