
public class Student extends Person{
	private String adminNo;
	private double testMark;
	private double examMark;
	
	public Student(String name, String nric, String adminNo) {
		super(name, nric);
		this.adminNo = adminNo;
	}
	
	public void setAdminNo(String adminNo) {
		this.adminNo = adminNo;
	}
	
	public String getAdminNo() {
		return adminNo;
	}
	
	public void setTestMark(double testMark) {
		this.testMark = testMark;
	}
	
	public double getTestMark() {
		return testMark;
	}
	
	public void setExamMark(double examMark) {
		this.examMark = examMark;
	}
	
	public double getExamMark() {
		return examMark;
	}
	
	public double computeFinalMark() {
		double finalMark = (testMark*0.5)+(examMark*0.5);
		return finalMark;
	}
	
	@Override
	public void view() {
		super.view();
		System.out.println("Admin No: "+adminNo);
		System.out.println("Test Mark: "+testMark);
		System.out.println("Exam Mark: "+examMark);
		System.out.println("Final Mark: "+computeFinalMark());
	}
}
