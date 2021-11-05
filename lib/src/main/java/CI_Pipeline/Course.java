package CI_Pipeline;

import java.util.ArrayList;
import org.joda.time.LocalDate;

public class Course {
	ArrayList<Module> modules = new ArrayList<Module>();
	ArrayList<Student> students = new ArrayList<Student>();
	String courseName;
	LocalDate startDate, endDate = new LocalDate();
	
	public Course(String courseName,LocalDate startDate, LocalDate endDate) {
		this.courseName = courseName;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public ArrayList<Module> getModules(){
		return modules;
	}
	
	public ArrayList<Student> getStudents(){
		return students;
	}
	
	public LocalDate getStartDate() {
		return startDate;
	}
	
	public LocalDate getEndDate() {
		return endDate;
	}
	
	//Mutator methods
	public void setCourseName(String setCourseName) {
		courseName = setCourseName;
	}
	
	public void setModules(ArrayList<Module> setModules) {
		modules = setModules;
	}
	
	public void setStudents(ArrayList<Student> setStudents) {
		students = setStudents;
	}
	
	public void setStartDate(LocalDate setStartDate) {
		startDate = setStartDate;
	}
	
	public void setEndDate(LocalDate setEndDate) {
		endDate = setEndDate;
	}
	
	//When adding students to a module, the module is also added to the student
	public void addStudent(Student student) {
		students.add(student);
		student.addCourse(this);
	}
	
	public void addModule(Module module) {
		modules.add(module);
		module.addCourse(this);
	}

}