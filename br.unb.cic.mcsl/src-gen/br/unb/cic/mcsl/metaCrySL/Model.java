/**
 * generated by Xtext 2.22.0
 */
package br.unb.cic.mcsl.metaCrySL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.unb.cic.mcsl.metaCrySL.Model#getMetaCrySL <em>Meta Cry SL</em>}</li>
 * </ul>
 *
 * @see br.unb.cic.mcsl.metaCrySL.MetaCrySLPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Meta Cry SL</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Meta Cry SL</em>' containment reference.
   * @see #setMetaCrySL(Spec)
   * @see br.unb.cic.mcsl.metaCrySL.MetaCrySLPackage#getModel_MetaCrySL()
   * @model containment="true"
   * @generated
   */
  Spec getMetaCrySL();

  /**
   * Sets the value of the '{@link br.unb.cic.mcsl.metaCrySL.Model#getMetaCrySL <em>Meta Cry SL</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Meta Cry SL</em>' containment reference.
   * @see #getMetaCrySL()
   * @generated
   */
  void setMetaCrySL(Spec value);

} // Model
