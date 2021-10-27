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
	
	String getCourseName() {
		return courseName;
	}
	
	ArrayList<Module> getModules(){
		return modules;
	}
	
	ArrayList<Student> getStudents(){
		return students;
	}
	
	LocalDate getStartDate() {
		return startDate;
	}
	
	LocalDate getEndDate() {
		return endDate;
	}
	
	//Mutator methods
	void setCourseName(String setCourseName) {
		courseName = setCourseName;
	}
	
	void setModules(ArrayList<Module> setModules) {
		modules = setModules;
	}
	
	void setStudents(ArrayList<Student> setStudents) {
		students = setStudents;
	}
	
	void setStartDate(LocalDate setStartDate) {
		startDate = setStartDate;
	}
	
	void setEndDate(LocalDate setEndDate) {
		endDate = setEndDate;
	}
	
	//When adding students to a module, the module is also added to the student
	void addStudent(Student student) {
		students.add(student);
		student.addCourse(this);
	}
	
	void addModule(Module module) {
		modules.add(module);
	}

}