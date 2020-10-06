/**
 */
package ecore.tests;

import ecore.EcoreFactory;
import ecore.Semester;
import ecore.courseInSemester;
import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link ecore.Semester#getNumberOfCourses() <em>Number Of Courses</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class SemesterTest extends TestCase {

	/**
	 * The fixture for this Semester test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Semester fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SemesterTest.class);
	}

	/**
	 * Constructs a new Semester test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemesterTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Semester test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Semester fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Semester test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Semester getFixture() {
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
		setFixture(EcoreFactory.eINSTANCE.createSemester());
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

	/**
	 * Tests the '{@link ecore.Semester#getNumberOfCourses() <em>Number Of Courses</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.Semester#getNumberOfCourses()
	 * @generated NOT
	 */
	public void testGetNumberOfCourses() {
		courseInSemester c1 = EcoreFactory.eINSTANCE.createcourseInSemester();
		courseInSemester c2 = EcoreFactory.eINSTANCE.createcourseInSemester();
		try {
			setUp();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.fixture.getCourseInSemester().add(c1);
		this.fixture.getCourseInSemester().add(c2);
		assertEquals(2, this.fixture.getNumberOfCourses());

		
	}

} //SemesterTest
