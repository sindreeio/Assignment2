import ecore.EcorePackage;
import ecore.Programme;
import ecore.Semester;
import ecore.courseInSemester;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import ecore.Department;
import ecore.Course;
import ecore.util.EcoreResourceFactoryImpl;

public class LoadResource {
	
	public static void main(String[] args) {
		ResourceSet resSet = new ResourceSetImpl();
		// relate the RaPackage identifier used in XMI files to the RaPackage instance (EPackage meta-object) 
		resSet.getPackageRegistry().put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
		// relate the XMI parser to the 'xmi' file extension
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new EcoreResourceFactoryImpl());

		Resource resource = resSet.getResource(URI.createURI(LoadResource.class.getResource("Department.xmi").toString()), true);
		Department dep = (Department) resource.getContents().get(0);
		System.out.println(dep);
		
	}

}
