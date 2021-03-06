/**
 */
package ecore;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specialisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecore.Specialisation#getSpecialisationInProgramme <em>Specialisation In Programme</em>}</li>
 *   <li>{@link ecore.Specialisation#getSemesterInSpecialisation <em>Semester In Specialisation</em>}</li>
 *   <li>{@link ecore.Specialisation#getName <em>Name</em>}</li>
 *   <li>{@link ecore.Specialisation#getLowerLevelSpecialisation <em>Lower Level Specialisation</em>}</li>
 * </ul>
 *
 * @see ecore.EcorePackage#getSpecialisation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='notTooManyMandatoryPoints lowerLevelSpecialisationProgramSameAsThis'"
 *        annotation="http://eclipse.no/accelo/query/1.0 lowerLevelSpecialisationProgramSameAsThis='self.lowerLevelSpecialisation.SpecialisationInProgramme = self.SpecialisationInProgramme'"
 * @generated
 */
public interface Specialisation extends EObject {
	/**
	 * Returns the value of the '<em><b>Specialisation In Programme</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ecore.Programme#getSpecialisations <em>Specialisations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialisation In Programme</em>' container reference.
	 * @see #setSpecialisationInProgramme(Programme)
	 * @see ecore.EcorePackage#getSpecialisation_SpecialisationInProgramme()
	 * @see ecore.Programme#getSpecialisations
	 * @model opposite="Specialisations" required="true" transient="false"
	 * @generated
	 */
	Programme getSpecialisationInProgramme();

	/**
	 * Sets the value of the '{@link ecore.Specialisation#getSpecialisationInProgramme <em>Specialisation In Programme</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specialisation In Programme</em>' container reference.
	 * @see #getSpecialisationInProgramme()
	 * @generated
	 */
	void setSpecialisationInProgramme(Programme value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ecore.EcorePackage#getSpecialisation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ecore.Specialisation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Lower Level Specialisation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Level Specialisation</em>' reference.
	 * @see #setLowerLevelSpecialisation(Specialisation)
	 * @see ecore.EcorePackage#getSpecialisation_LowerLevelSpecialisation()
	 * @model
	 * @generated
	 */
	Specialisation getLowerLevelSpecialisation();

	/**
	 * Sets the value of the '{@link ecore.Specialisation#getLowerLevelSpecialisation <em>Lower Level Specialisation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Level Specialisation</em>' reference.
	 * @see #getLowerLevelSpecialisation()
	 * @generated
	 */
	void setLowerLevelSpecialisation(Specialisation value);

	/**
	 * Returns the value of the '<em><b>Semester In Specialisation</b></em>' containment reference list.
	 * The list contents are of type {@link ecore.Semester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester In Specialisation</em>' containment reference list.
	 * @see ecore.EcorePackage#getSpecialisation_SemesterInSpecialisation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Semester> getSemesterInSpecialisation();

} // Specialisation
