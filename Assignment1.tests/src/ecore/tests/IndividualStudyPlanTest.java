/**
 */
package ecore.tests;

import ecore.EcoreFactory;
import ecore.IndividualStudyPlan;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Individual Study Plan</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IndividualStudyPlanTest extends TestCase {

	/**
	 * The fixture for this Individual Study Plan test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndividualStudyPlan fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IndividualStudyPlanTest.class);
	}

	/**
	 * Constructs a new Individual Study Plan test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndividualStudyPlanTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Individual Study Plan test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(IndividualStudyPlan fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Individual Study Plan test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndividualStudyPlan getFixture() {
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
		setFixture(EcoreFactory.eINSTANCE.createIndividualStudyPlan());
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

} //IndividualStudyPlanTest
