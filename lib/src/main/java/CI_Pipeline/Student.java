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
	
	public String getUsername(){
		return name+age; 
	}
	
	/**
	 * Accessor methods
	 */
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getDOB() {
		return DOB;
	}
	
	public String getID() {
		return ID;
	}
	
	public ArrayList<Course> getCourse() {
		return courses;
	}
	
	public ArrayList<Module> getModule() {
		return modules;
	}
	
	/**
	 * Mutator methods
	 */
	
	public void setName(String setName) {
		name = setName;
	}
	
	public void setAge(int setAge) {
		age = setAge;
	}
	
	public void setDOB(String setDOB) {
		DOB = setDOB;
	}
	
	public void setID(String setID) {
		ID = setID;
	}
	
	public void setUsername(String setUsername) {
		username = setUsername;
	}
	
	public void addCourse(Course setCourse) {
		courses.add(setCourse);
	}
	
	public void addModule(Module setModule) {
		modules.add(setModule);
	}
	
	
}