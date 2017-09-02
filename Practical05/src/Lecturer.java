
public class Lecturer extends Person {
	private String staffId;
	private double totalTeachingHour;
	
	public Lecturer(String name, String nric, String staffId) {
		super(name, nric);
		this.staffId = staffId;
	}
	
	public String getStaffId() {
		return staffId;
	}
	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}
	public double getTotalTeachingHour() {
		return totalTeachingHour;
	}
	public void setTotalTeachingHour(double totalTeachingHour) {
		this.totalTeachingHour = totalTeachingHour;
	}
	
	public double computeSalary() {
		return totalTeachingHour *= 90.0;	
	}
	
	@Override
	public void view() {
		super.view();
		System.out.println("Staff Id: "+staffId);
		System.out.println("Total Teaching Hours: "+totalTeachingHour);
		System.out.println("Salary ($): "+computeSalary());
	}
}
