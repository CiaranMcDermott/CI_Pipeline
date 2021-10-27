package CI_Pipeline;
import java.util.ArrayList;


/**
 * @author Ciaran
 *
 */
public class Student {
String name, DOB, ID, username, course;
ArrayList<Module> modules = new ArrayList<Module>();
ArrayList<Course> courses = new ArrayList<Course>();
int age;

	public Student(String name, int age, String DOB, String ID, String course) {
		this.name = name;
		this.age = age;
		this.DOB = DOB;
		this.ID = ID;		
		this.course = course;
		this.username = getUsername();
	}
	
	String getUsername(){
		return name+age; 
	}
	
	/**
	 * Accessor methods
	 */
	
	String getName() {
		return name;
	}
	
	int getAge() {
		return age;
	}
	
	String getDOB() {
		return DOB;
	}
	
	String getID() {
		return ID;
	}
	
	ArrayList<Course> getCourse() {
		return courses;
	}
	
	ArrayList<Module> getModule() {
		return modules;
	}
	
	/**
	 * Mutator methods
	 */
	
	void setName(String setName) {
		name = setName;
	}
	
	void setAge(int setAge) {
		age = setAge;
	}
	
	void setDOB(String setDOB) {
		DOB = setDOB;
	}
	
	void setID(String setID) {
		ID = setID;
	}
	
	void setUsername(String setUsername) {
		username = setUsername;
	}
	
	void addCourse(Course setCourse) {
		courses.add(setCourse);
	}
	
	void addModule(Module setModule) {
		modules.add(setModule);
	}
	
	
}