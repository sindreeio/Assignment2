/**
 */
package ecore.tests;

import ecore.EcoreFactory;
import ecore.SemesterInStudyplan;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Semester In Studyplan</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SemesterInStudyplanTest extends TestCase {

	/**
	 * The fixture for this Semester In Studyplan test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemesterInStudyplan fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SemesterInStudyplanTest.class);
	}

	/**
	 * Constructs a new Semester In Studyplan test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemesterInStudyplanTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Semester In Studyplan test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SemesterInStudyplan fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Semester In Studyplan test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemesterInStudyplan getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EcoreFactory.eINSTANCE.createSemesterInStudyplan());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //SemesterInStudyplanTest
