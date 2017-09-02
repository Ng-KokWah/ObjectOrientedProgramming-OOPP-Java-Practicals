package q3;

import java.util.ArrayList;

public class InterfaceDemo {
	
	/**
	 * A static method to take in an ArrayList of Measurable and
	 * search for the top.
	 * 
	 * @param pList : ArrayList of Measurable	
	 */
	public static Measurable getTop(ArrayList<Measurable> pList){
		Measurable top = pList.get(0);
		for (Measurable s : pList){
			if (s.getMeasure() > top.getMeasure())
				top = s;
		}
		return top;
	}
	
	public static void main(String args[]){
		
	    ArrayList<Measurable> sList = new ArrayList<Measurable>();
		
		Student stud1 = new Student("1231234A", "Tan Mei Mei", "120101A");
		stud1.setTestMark(30);
		stud1.setExamMark(100);
		sList.add(stud1);
		
		Student stud2 = new Student("4455667B", "Joel Tan", "121234B");
		stud2.setTestMark(50);
		stud2.setExamMark(72);
		sList.add(stud2);
		
		Student stud3 = new Student("9412345C", "Ang Sin Chin", "120003C");
		stud3.setTestMark(50);
		stud3.setExamMark(100);
		sList.add(stud3);
		
		Measurable top = getTop(sList);
		System.out.print("Top student is " + ((Student)top).getName());
		System.out.println(" with " +((Student)top).computeFinalMark() + " marks.");
		
		for (Measurable s:sList) {
			if (s instanceof Student)
				((Student) s).view();
		}
			 
		
		// Using the same approach, add another static method to 
		// search for the lecturer who earns the highest salary.
		ArrayList<Measurable> lecList = new ArrayList<Measurable>();
		
		Lecturer lec1 = new Lecturer("1234567A", "Phoon Lee Kien", "1234A");
		lec1.setTotalTeachingHr(30);
		lecList.add(lec1);
		
		Lecturer lec2 = new Lecturer("7654321B", "Andrea Tan", "5678B");
		lec2.setTotalTeachingHr(40);
		lecList.add(lec2);
		
		Lecturer lec3 = new Lecturer("1122334C", "Aloysius Thong", "1212C");
		lec3.setTotalTeachingHr(20);
		lecList.add(lec3);
		
		Lecturer lec4 = new Lecturer("7897890D", "Lim Soo Khim", "8899D");
		lec4.setTotalTeachingHr(15);
		lecList.add(lec4);
		
		for (Measurable l:lecList) {
			if (l instanceof Lecturer)
				((Lecturer) l).view();
		}
			 
		
		Measurable topLec = getTop(lecList);
		System.out.print("Top lecturer is " + ((Lecturer)topLec).getName());
		System.out.println(" with salary of " + ((Lecturer)topLec).computeSalary());
	}	
}
