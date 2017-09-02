package Qn3;

import java.util.ArrayList;

public class PayrollApp {
	public static void main(String[] args){
		ArrayList<Employees> employeesList = new ArrayList<Employees>();
		Hourly hourly = new Hourly("Phoon Lee Kien","1234567A",159);
		Hourly hourly1 = new Hourly("Winnie Pooh","126647A",170);
		Salaried salaried = new Salaried("Tan Mei Mei","120101F",13,false);
		Salaried manager = new Salaried("Lee Ke Qing","153789W",25,true);
		employeesList.add(hourly);
		employeesList.add(hourly1);
		employeesList.add(salaried);
		employeesList.add(manager);
		for(Employees i:employeesList){
			i.view();
		}
	}
}
