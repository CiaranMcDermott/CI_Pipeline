package CI_Pipeline;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
import org.joda.time.LocalDate;

public class JUnitTests {
	
	@Test
	//Test some Module class methods
	public void moduleTests() {
		System.out.println("\n****JUnit Test 1****");
		
		//Create module
		Module module = new Module("System on Chip", "EE451");
		
		//Create some students to add to the module
		Student student0 = new Student("Ciaran", 22, "15-02-1999", "18379421", "Electronic Engineering");
        Student student1 = new Student("Aoife", 22, "09-01-1999", "17534682", "Electronic Engineering");
        Student student2 = new Student("Sisi", 22, "04-02-1999", "16534742", "Electronic Engineering");
        Student student3 = new Student("Roshan", 21, "12-05-2000", "17348256", "Electronic Engineering");
        
        //Add students to the module
        module.addStudent(student0);
        module.addStudent(student1);
        module.addStudent(student2);
        module.addStudent(student3);
		
		//Test getModuleName method and print variable values
		System.out.println(module.getModuleName());
		
		//change module name and print again
		module.setModuleName("SOC");
		System.out.println(module.getModuleName());
		
		//Check if student objects are correct
		assertEquals(student0, module.getStudents().get(0));
		
		//Check if getModuleName() works
		assertEquals("SOC", module.getModuleName());
		
		
//		System.out.print("Students: ");
//		for(Student student: module.getStudents()) {
//			System.out.print(student.getUsername() + ", ");
//		}
	}
	
	
	@Test
	//Test some Course class methods
	public void courseTests() {
		System.out.println("\n\n****JUnit Test 2****");
		
		//Add modules to the course
		ArrayList<String> modules = new ArrayList<String>();
	    modules.add("Signals");
	    modules.add("Maths");
	    modules.add("System on Chip");
	    
	    //Add students to the module
  		ArrayList<String> students = new ArrayList<String>();
  	    students.add("Ciaran");
  	    students.add("Joe");
  	    students.add("Paddy");
  	    
  	    LocalDate startDate = LocalDate.parse("2021-09-08");
  	    LocalDate endDate = LocalDate.parse("2022-05-06");
		
		//create Course object
		Course course = new Course("Electronic Engineering", startDate, endDate);
		
		//Test getStartDate() method and print output
		System.out.println(course.getStartDate().toString());
		
		//Change start date with setStartDate() method and retrieve start date again
		LocalDate newDate = LocalDate.parse("2021-09-28");
		course.setStartDate(newDate);
		System.out.println(course.getStartDate().toString());
	}
	

	

}