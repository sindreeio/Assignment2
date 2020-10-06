package org.xtext.example.mydsl1;

import ecore.Department;
import ecore.courseInSemester;
import ecore.EcorePackage;
import ecore.Programme;
import ecore.Semester;
import ecore.Specialisation;
import ecore.util.EcoreResourceFactoryImpl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;


public class Transform2HTML {
	
	
	public static void main(String[] args) {
		Department d = extractDepartment();

		
		String markdown = new HtmlMaker().generate(d);
		System.out.println(markdown);
		
	}
	
	public static Department extractDepartment() {
		
	ResourceSet resSet = new ResourceSetImpl();
	// relate the RaPackage identifier used in XMI files to the RaPackage instance (EPackage meta-object) 
	resSet.getPackageRegistry().put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
	// relate the XMI parser to the 'xmi' file extension
	resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new EcoreResourceFactoryImpl());

	Resource resource = resSet.getResource(URI.createURI(Transform2HTML.class.getResource("Department.xmi").toString()), true);
	Department dep = (Department) resource.getContents().get(0);
	return dep;
	
	}
}
