package org.xtext.example.mydsl1;

import ecore.Department;
import ecore.Programme;
import ecore.Semester;
import ecore.Specialisation;
import ecore.courseInSemester;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class HtmlMaker {
  public String generate(final Department dep) {
    StringBuilder _stringBuilder = new StringBuilder();
    return this.generate(dep, _stringBuilder).toString();
  }
  
  public CharSequence generate(final Department dep, final StringBuilder stringbuilder) {
    StringBuilder _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<html>");
      _builder.newLine();
      _builder.append("<head>");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<title></title>");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("<meta charset=\"utf-8\"/>");
      _builder.newLine();
      _builder.append("</head>");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("<style>");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("body{");
      _builder.newLine();
      _builder.append("    \t");
      _builder.append("font-family: Arial, Helvetica, sans-serif;");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("body{");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("font-family: Arial, Helvetica, sans-serif;");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("background-color: #557a95;");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("h2{");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("padding: 10px;");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("        ");
      _builder.append(".container{");
      _builder.newLine();
      _builder.append("            ");
      _builder.append("margin: auto;");
      _builder.newLine();
      _builder.append("            ");
      _builder.append("width: 50%;");
      _builder.newLine();
      _builder.append("            ");
      _builder.append("padding: 10px;");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("        ");
      _builder.append(".align-center{");
      _builder.newLine();
      _builder.append("            ");
      _builder.append("text-align: center;");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("        ");
      _builder.append(".programme-container{");
      _builder.newLine();
      _builder.append("            ");
      _builder.append("background-color: #938e94;");
      _builder.newLine();
      _builder.append("            ");
      _builder.append("-top:     30px;");
      _builder.newLine();
      _builder.append("            ");
      _builder.append("display: block;");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("        ");
      _builder.append(".space{");
      _builder.newLine();
      _builder.append("            ");
      _builder.append("height: 50px;");
      _builder.newLine();
      _builder.append("            ");
      _builder.append("background-color: #557a95;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("        ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("        ");
      _builder.append(".semester-container{");
      _builder.newLine();
      _builder.append("        \t");
      _builder.append("padding:10px;");
      _builder.newLine();
      _builder.append("        \t");
      _builder.append("background-color: #b0a295;");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("        ");
      _builder.append(".element-header{");
      _builder.newLine();
      _builder.append("            ");
      _builder.append("width: 1fr;");
      _builder.newLine();
      _builder.append("        \t");
      _builder.append("font-weight: bold;");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("        ");
      _builder.newLine();
      _builder.append("        ");
      _builder.append(".courses{");
      _builder.newLine();
      _builder.append("            ");
      _builder.append("display: grid;");
      _builder.newLine();
      _builder.append("            ");
      _builder.append("grid-template-columns: 1fr 1fr 1fr 1fr;");
      _builder.newLine();
      _builder.append("            ");
      _builder.append("border-bottom: solid;");
      _builder.newLine();
      _builder.append("            ");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("        ");
      _builder.append(".element{");
      _builder.newLine();
      _builder.append("            ");
      _builder.append("width: 1fr;");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("        ");
      _builder.append(".padding{");
      _builder.newLine();
      _builder.append("        \t");
      _builder.append("padding: 10px;");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("</style>");
      _builder.newLine();
      _builder.append("<body>");
      HtmlMaker.operator_doubleLessThan(stringbuilder, _builder);
      this.generateOutput(dep, stringbuilder);
      _xblockexpression = HtmlMaker.operator_doubleLessThan(stringbuilder, "</body></html>");
    }
    return _xblockexpression;
  }
  
  public void generateOutput(final Department dep, final StringBuilder stringBuilder) {
    StringBuilder _doubleLessThan = HtmlMaker.operator_doubleLessThan(stringBuilder, "<div class=container> <div class=align-center><h1>");
    String _name = dep.getName();
    StringBuilder _doubleLessThan_1 = HtmlMaker.operator_doubleLessThan(_doubleLessThan, _name);
    HtmlMaker.operator_doubleLessThan(_doubleLessThan_1, "</h1> </div>");
    EList<Programme> _studyprogramme = dep.getStudyprogramme();
    for (final Programme s : _studyprogramme) {
      {
        StringBuilder _doubleLessThan_2 = HtmlMaker.operator_doubleLessThan(stringBuilder, "<div class=space></div><div class=programme-container><h2>");
        String _name_1 = s.getName();
        StringBuilder _doubleLessThan_3 = HtmlMaker.operator_doubleLessThan(_doubleLessThan_2, _name_1);
        HtmlMaker.operator_doubleLessThan(_doubleLessThan_3, "</h2>");
        EList<Semester> _semesterInProgramme = s.getSemesterInProgramme();
        for (final Semester sem : _semesterInProgramme) {
          {
            StringBuilder _doubleLessThan_4 = HtmlMaker.operator_doubleLessThan(stringBuilder, "<div class=semester-container> <div > <h3> Semester nummer ");
            int _semesterNumber = sem.getSemesterNumber();
            StringBuilder _doubleLessThan_5 = HtmlMaker.operator_doubleLessThan(_doubleLessThan_4, Integer.valueOf(_semesterNumber));
            HtmlMaker.operator_doubleLessThan(_doubleLessThan_5, "</h3></div>");
            HtmlMaker.operator_doubleLessThan(stringBuilder, "<div class=courses><div class=element-header> Course Code </div>");
            HtmlMaker.operator_doubleLessThan(stringBuilder, "<div class=element-header> Name </div>");
            HtmlMaker.operator_doubleLessThan(stringBuilder, "<div class=element-header> SP </div>");
            HtmlMaker.operator_doubleLessThan(stringBuilder, "<div class=element-header> Mandatory </div></div>");
            EList<courseInSemester> _courseInSemester = sem.getCourseInSemester();
            for (final courseInSemester cis : _courseInSemester) {
              {
                StringBuilder _doubleLessThan_6 = HtmlMaker.operator_doubleLessThan(stringBuilder, "<div class=courses> <div class=element> ");
                String _courseCode = cis.getCourse().getCourseCode();
                StringBuilder _doubleLessThan_7 = HtmlMaker.operator_doubleLessThan(_doubleLessThan_6, _courseCode);
                HtmlMaker.operator_doubleLessThan(_doubleLessThan_7, "</div>");
                StringBuilder _doubleLessThan_8 = HtmlMaker.operator_doubleLessThan(stringBuilder, "<div class=element>");
                String _name_2 = cis.getCourse().getName();
                StringBuilder _doubleLessThan_9 = HtmlMaker.operator_doubleLessThan(_doubleLessThan_8, _name_2);
                HtmlMaker.operator_doubleLessThan(_doubleLessThan_9, "</div>");
                StringBuilder _doubleLessThan_10 = HtmlMaker.operator_doubleLessThan(stringBuilder, "<div class=element>");
                float _credits = cis.getCourse().getCredits();
                StringBuilder _doubleLessThan_11 = HtmlMaker.operator_doubleLessThan(_doubleLessThan_10, Float.valueOf(_credits));
                HtmlMaker.operator_doubleLessThan(_doubleLessThan_11, "</div>");
                boolean _isMandatory = cis.isMandatory();
                if (_isMandatory) {
                  HtmlMaker.operator_doubleLessThan(stringBuilder, "<div class=element> O </div> </div>");
                } else {
                  HtmlMaker.operator_doubleLessThan(stringBuilder, "<div class=element> VA </div> </div>");
                }
              }
            }
          }
        }
        HtmlMaker.operator_doubleLessThan(stringBuilder, "</div> <div class=padding><h3> Spesialiseringer</h3>");
        EList<Specialisation> _specialisations = s.getSpecialisations();
        for (final Specialisation spes : _specialisations) {
          {
            StringBuilder _doubleLessThan_4 = HtmlMaker.operator_doubleLessThan(stringBuilder, "<div>");
            String _name_2 = spes.getName();
            StringBuilder _doubleLessThan_5 = HtmlMaker.operator_doubleLessThan(_doubleLessThan_4, _name_2);
            HtmlMaker.operator_doubleLessThan(_doubleLessThan_5, "");
            EList<Semester> _semesterInSpecialisation = spes.getSemesterInSpecialisation();
            for (final Semester sem_1 : _semesterInSpecialisation) {
              {
                StringBuilder _doubleLessThan_6 = HtmlMaker.operator_doubleLessThan(stringBuilder, "<div class=semester-container> <div > <h3> Semester nummer ");
                int _semesterNumber = sem_1.getSemesterNumber();
                StringBuilder _doubleLessThan_7 = HtmlMaker.operator_doubleLessThan(_doubleLessThan_6, Integer.valueOf(_semesterNumber));
                HtmlMaker.operator_doubleLessThan(_doubleLessThan_7, "</h3></div>");
                HtmlMaker.operator_doubleLessThan(stringBuilder, "<div class=courses><div class=element-header> Course Code </div>");
                HtmlMaker.operator_doubleLessThan(stringBuilder, "<div class=element-header> Name </div>");
                HtmlMaker.operator_doubleLessThan(stringBuilder, "<div class=element-header> SP </div>");
                HtmlMaker.operator_doubleLessThan(stringBuilder, "<div class=element-header> Mandatory </div></div>");
                EList<courseInSemester> _courseInSemester = sem_1.getCourseInSemester();
                for (final courseInSemester cis : _courseInSemester) {
                  {
                    StringBuilder _doubleLessThan_8 = HtmlMaker.operator_doubleLessThan(stringBuilder, "<div class=courses> <div class=element> ");
                    String _courseCode = cis.getCourse().getCourseCode();
                    StringBuilder _doubleLessThan_9 = HtmlMaker.operator_doubleLessThan(_doubleLessThan_8, _courseCode);
                    HtmlMaker.operator_doubleLessThan(_doubleLessThan_9, "</div>");
                    StringBuilder _doubleLessThan_10 = HtmlMaker.operator_doubleLessThan(stringBuilder, "<div class=element>");
                    String _name_3 = cis.getCourse().getName();
                    StringBuilder _doubleLessThan_11 = HtmlMaker.operator_doubleLessThan(_doubleLessThan_10, _name_3);
                    HtmlMaker.operator_doubleLessThan(_doubleLessThan_11, "</div>");
                    StringBuilder _doubleLessThan_12 = HtmlMaker.operator_doubleLessThan(stringBuilder, "<div class=element>");
                    float _credits = cis.getCourse().getCredits();
                    StringBuilder _doubleLessThan_13 = HtmlMaker.operator_doubleLessThan(_doubleLessThan_12, Float.valueOf(_credits));
                    HtmlMaker.operator_doubleLessThan(_doubleLessThan_13, "</div>");
                    boolean _isMandatory = cis.isMandatory();
                    if (_isMandatory) {
                      HtmlMaker.operator_doubleLessThan(stringBuilder, "<div class=element> O </div> </div>");
                    } else {
                      HtmlMaker.operator_doubleLessThan(stringBuilder, "<div class=element> VA </div> </div>");
                    }
                  }
                }
              }
            }
            HtmlMaker.operator_doubleLessThan(stringBuilder, "</div>");
          }
        }
        HtmlMaker.operator_doubleLessThan(stringBuilder, "</div></div>");
      }
    }
    HtmlMaker.operator_doubleLessThan(stringBuilder, "</div> </div></div>");
  }
  
  public static StringBuilder operator_doubleLessThan(final StringBuilder stringBuilder, final Object o) {
    return stringBuilder.append(o);
  }
}
