package org.xtext.example.mydsl1

import ecore.Department
import ecore.Course
import ecore.courseInSemester
import ecore.Programme
import ecore.Semester
import ecore.Specialisation

class HtmlMaker {
	
	
	
	def String generate(Department dep){
		generate(dep, new StringBuilder).toString	
	}
	
	def CharSequence generate(Department dep, StringBuilder stringbuilder ){
		stringbuilder << '''
<html>
<head>
	<title></title>
	<meta charset="utf-8"/>
</head>
    <style>
    body{
    	font-family: Arial, Helvetica, sans-serif;
    }
body{
        font-family: Arial, Helvetica, sans-serif;
        background-color: #557a95;
    }
    h2{
        padding: 10px;
    }
        .container{
            margin: auto;
            width: 50%;
            padding: 10px;
        }
        .align-center{
            text-align: center;
        }
        .programme-container{
            background-color: #938e94;
            -top:     30px;
            display: block;
        }
        .space{
            height: 50px;
            background-color: #557a95;

        }
        .semester-container{
        	padding:10px;
        	background-color: #b0a295;
        }
        .element-header{
            width: 1fr;
        	font-weight: bold;
        }
        
        .courses{
            display: grid;
            grid-template-columns: 1fr 1fr 1fr 1fr;
            border-bottom: solid;
            
        }
        .element{
            width: 1fr;
        }
        .padding{
        	padding: 10px;
        }
    </style>
<body>'''
generateOutput(dep, stringbuilder)
stringbuilder <<"</body></html>"
		}
	
		def void generateOutput(Department dep, StringBuilder stringBuilder) {
		stringBuilder << "<div class=container> <div class=align-center><h1>" << dep.getName() << "</h1> </div>"
		
		for (Programme s : dep.getStudyprogramme()){
			stringBuilder << "<div class=space></div><div class=programme-container><h2>" << s.getName() << "</h2>" 
			for (Semester sem : s.getSemesterInProgramme()){
				stringBuilder << "<div class=semester-container> <div > <h3> Semester nummer " << sem.getSemesterNumber() << "</h3></div>" 
				stringBuilder << "<div class=courses><div class=element-header> Course Code </div>"
				stringBuilder << "<div class=element-header> Name </div>"
				stringBuilder << "<div class=element-header> SP </div>"
				stringBuilder << "<div class=element-header> Mandatory </div></div>"
				for (courseInSemester cis : sem.getCourseInSemester()){
					stringBuilder << "<div class=courses> <div class=element> " << cis.getCourse().getCourseCode() << "</div>"
					stringBuilder << "<div class=element>" << cis.getCourse().getName() << "</div>"
					stringBuilder << "<div class=element>" << cis.getCourse().getCredits() << "</div>"
						if (cis.isMandatory()) {
							stringBuilder << "<div class=element> O </div> </div>"
						}else{
							stringBuilder << "<div class=element> VA </div> </div>"
						}
				}
			}
			stringBuilder << "</div> <div class=padding><h3> Spesialiseringer</h3>"
			
			for (Specialisation spes : s.getSpecialisations()){
				stringBuilder << "<div>" << spes.getName() << "" 
				for (Semester sem : spes.getSemesterInSpecialisation()){
					stringBuilder << "<div class=semester-container> <div > <h3> Semester nummer " << sem.getSemesterNumber() << "</h3></div>" 
					
				stringBuilder << "<div class=courses><div class=element-header> Course Code </div>"
				stringBuilder << "<div class=element-header> Name </div>"
				stringBuilder << "<div class=element-header> SP </div>"
				stringBuilder << "<div class=element-header> Mandatory </div></div>"
					for (courseInSemester cis : sem.getCourseInSemester()){
						stringBuilder << "<div class=courses> <div class=element> " << cis.getCourse().getCourseCode() << "</div>"
						stringBuilder << "<div class=element>" << cis.getCourse().getName() << "</div>"
						stringBuilder << "<div class=element>" << cis.getCourse().getCredits() << "</div>"
						if (cis.isMandatory()) {
							stringBuilder << "<div class=element> O </div> </div>"
						}else{
							stringBuilder << "<div class=element> VA </div> </div>"
						}
					}
			}
				stringBuilder << "</div>"
			}
			stringBuilder << "</div></div>"
		}
		stringBuilder << "</div> </div></div>"
	}

		// << operator
	def static StringBuilder operator_doubleLessThan(StringBuilder stringBuilder, Object o) {
		return stringBuilder.append(o);
	}
}
	