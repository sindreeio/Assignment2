# Assignment2

## Set up
1. Clone the repository using git
2. The project consists of three projects, Assignment1, Assignment1.tests and org.xtext.example.mydsl1 which needs to imported seperatly into eclipse.


### Assignment 1
<h1>Content</h1>
<p>
 The ecore model contains classes and their relations. The programme class has a name and multiple specialisations. The specialisation class has a name and a refrence to a programme and eventually a lower level specialisation if this is a specialisation which branches from another specialisations. The semester class has a link to a programme or specialisation, a semester number and a refrence to multiple courseInSemester. The courseInSemester class is a relation class between Semester and course and indicates if the course is mandatory or not. Course contains general info about the course and has no refrences. IndividualStudyPlan has a refrence to multiple SemesterInStudyplan which has a refrence to semester and multiple electives which represents a slot for a course in the schedule. The elective has a refrence to a course and a refrence to multiple exam attepmts. Grade is a datatype which limits the grade in a examresult to have one of six approved values.
</p>

<p>
  In ecore.util.Ecorevalidator some validations have been implemented. validateSpecialisation_n checks that otTooManyMandatoryPoints and validateProgramme_notTooManyMandatoryPoints checks that a specialisation or programme does not contain more than 30 credits in mandatory courses. validateSemesterInStudyplan_containAllMandatoryCourses checks that a semester in a studyplan contains all the mandatory courses for the studyprogramme or specialisation linked to the semester. validateSemesterInStudyplan_hasAllNeccesaryPoints checks that a semester in a studyplan contains over 30 credits. validateElective_courseInStudyPlan checks that the course in the elective is in the studyplan of the programme or specialisation that semester.
 </p>
 
 ### Assignment 2
 
 Changes to Assignment 1 project:
 -Added departmnet class for containment reasons which has containment to programme, course and individualStudy plan classes.
 -Added a more proper containment hierarchy
 -Added department.xmi
 -Added (default package) in src/ with load resource class for testing model transformations.
