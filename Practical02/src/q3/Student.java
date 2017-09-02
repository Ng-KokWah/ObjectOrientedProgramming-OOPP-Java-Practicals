package q3;


import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
public class Student {
	// Attributes of Student
	private String name;
	private char gender;
	private double mark;
	private GregorianCalendar enrollmentDate;
	SimpleDateFormat format = new SimpleDateFormat("dd-MM-YYYY");
	
	// Constructor
	public Student(String name, char gender) {
		this.name = name;
		this.gender = gender;
		this.enrollmentDate = new GregorianCalendar();
	}

	// Accessor & Mutator methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public double getMark() {
		return mark;
	}

	public void setMark(double mark) {
		this.mark = mark;
	}
	
	public GregorianCalendar getEnrollmentDate() {
		return enrollmentDate;
	}

	public void setEnrollmentDate(GregorianCalendar enrollmentDate) {
		this.enrollmentDate = enrollmentDate; 
	}
	
	// User defined or service method
	public void view() {
		System.out.println("Name: " + name);
		System.out.println("Gender: " + gender);
		System.out.println("Marks: " + mark);
		System.out.println("Enrollment Date: "+format.format(enrollmentDate.getTime()));
	}


}
