
public class PersonApp {
	public static void main(String[] args) {
		Student s1 = new Student("Tan Mei Mei", "1231234B", "120101F");
		Lecturer l1 = new Lecturer("Phoon Lee Kien", "1234567A", "1234D");
		
		s1.setTestMark(30.0);
		s1.setExamMark(100.0);
		
		l1.setTotalTeachingHour(30.0);
		
		l1.view();
		System.out.print("\n");
		s1.view();
		
	}
}
