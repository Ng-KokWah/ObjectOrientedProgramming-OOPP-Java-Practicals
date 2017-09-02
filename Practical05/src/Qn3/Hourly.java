package Qn3;

public class Hourly extends Employees{
	public static final double HOURLY_RATE = 10;
	public static final double EXCESS_PAID = 1.5;
	private double hourWorked;
	private double salary;
	
	public Hourly(String name, String staffId, double hourWorked){
		super(name,staffId);
		this.hourWorked = hourWorked;
	}
	
	public void setHourWorked(double hourWorked){
		this.hourWorked = hourWorked;
	}
	
	public double getHourWorked(){
		return this.hourWorked;
	}
	
	public double calSalary(){
		this.salary = HOURLY_RATE * hourWorked;
		if(hourWorked > 160)
			this.salary *= 1.5;
		return this.salary;
	}
	
	@Override
	public void view(){
		System.out.println("");
		System.out.println("Name: " + name);
		System.out.println("Staff ID: " + staffId);
		System.out.println("Hour(s) worked: " + hourWorked);
		System.out.printf("Salary: $%.2f\n",calSalary());
	}
}
