package q3;


public class StudentApp {

	public static void main(String[] args) {
		Student s = new Student ("Ms Phoon", 'F');
		System.out.println("=== First view ===");
		s.view();
		s.setMark(100);
		System.out.println("=== Second view ===");
		s.view();
	}

}
