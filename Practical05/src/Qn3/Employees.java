package Qn3;

public class Employees {
	String name;
	String staffId;
	
	public Employees(String name, String staffId){
		this.name = name;
		this.staffId = staffId;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setStaffId(String staffId){
		this.staffId = staffId;
	}
	
	public String getStaffId(){
		return this.staffId;
	}
	
	public void view(){
		System.out.println("Name: " + name);
		System.out.println("Staff ID: " + staffId);
	}
}
