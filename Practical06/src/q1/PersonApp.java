package q1;

import java.util.ArrayList;

public class PersonApp {

	public static void main(String[] args) {
		ArrayList <Person> p = new ArrayList<Person>();
		Lecturer lect = new Lecturer("1234567A", "Phoon Lee Kien", "1234D");
		Lecturer lect2 = new Lecturer("1236568A", "Tan Koon Kong", "1357A");
		lect.setTotalTeachingHr(30);     
		
		Student stud = new Student("1231234B", "Tan Mei Mei", "120101F");
		Student stud2 = new Student("1234567A", "Simon Ong", "123456E");
		Student stud3 = new Student("1234123H", "Rowlet Tan", "112233P");
		stud.setTestMark(30);
		stud.setExamMark(100);
		stud2.setTestMark(40);
		stud2.setExamMark(90);
		stud3.setTestMark(100);
		stud3.setExamMark(100);
		
		
		p.add(lect);
		p.add(lect2);
		p.add(stud);
		p.add(stud2);
		p.add(stud3);
		
		for(Person n:p) {
			n.view();
		}
		
		System.out.println("The average mark of the 3 students is "+calAvgMark(p));
	}
	
	public static double calAvgMark(ArrayList<Person> n) {
		double avgMark = 0.0;
		double total = 0.0;
		int noOfStudent=0;
		for(Person n2:n) {
			if(n2 instanceof Student) {
				total +=((Student)n2).computeFinalMark();
				noOfStudent++;
			}
		}
		avgMark = total / noOfStudent;
		return avgMark;
	}
}
