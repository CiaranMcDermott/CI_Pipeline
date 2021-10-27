package CI_Pipeline;
import java.util.ArrayList;

public class Module {
	
	String moduleName, ID;
	
	ArrayList<Student> students = new ArrayList<Student>(); // Create an ArrayList object
	ArrayList<Course> courses = new ArrayList<Course>(); 	//Create List of courses
	
	public Module(String moduleName, String ID) {
		this.moduleName = moduleName;
		this.ID = ID;
	}
	
	/**
	 * Accessor methods
	 */
	
	public String getModuleName() {
		return moduleName;
	}
	
	public String getID() {
		return ID;
	}
	
	public ArrayList<Student> getStudents(){
		return students;
	}
	
	public ArrayList<Course> getCourses(){
		return courses;
	}
	
	/**
	 * Mutator methods
	 */
	
	public void setModuleName(String setModuleName) {
		moduleName = setModuleName;
	}
	
	public void setID(String setID) {
		ID = setID;
	}
	
	//When adding students to a module, the module is also added to the student
	public void addStudent(Student student) {
		students.add(student);
		student.addModule(this);
	}
	
	public void addCourse(Course course) {
		courses.add(course);
	}
}