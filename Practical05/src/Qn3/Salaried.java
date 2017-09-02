package Qn3;

public class Salaried extends Employees {
	public static final double MONTHLY_SALARY = 2000;
	public static final double BONUS_ANNUALLY = 3000;
	private double salary;
	private int months;
	private boolean manager;
	
	public Salaried(String name, String staffId, int months, boolean manager){
		super(name,staffId);
		this.months = months;
		this.manager = manager;
	}
	
	public void setMonths(int months){
		this.months = months;
	}
	
	public double getMonths(){
		return this.months;
	}
	
	public void setManager(boolean manager){
		this.manager = manager;
	}
	
	public boolean getManager(){
		return this.manager;
	}
	
	public double calSalary(){
		salary = this.months * MONTHLY_SALARY;
		int noOfBonus;
		if(manager == true){
			if(this.months > 12){
				noOfBonus = months / 12;
				salary = salary + noOfBonus * BONUS_ANNUALLY;
			}
		}
		return salary;
	}
	
	@Override
	public void view(){
		System.out.println("");
		System.out.println("Name: " + name);
		System.out.println("Staff ID: " + staffId);
		System.out.printf("Monthly Salary: $%.2f\n",MONTHLY_SALARY);
		System.out.println("Manager: " + manager);
		if(manager == true)
			System.out.println("Bonus Annually: $" + BONUS_ANNUALLY);
		System.out.println("Months Worked: " + months);
		System.out.printf("Total salary: $%.2f\n", calSalary());
	}
}
