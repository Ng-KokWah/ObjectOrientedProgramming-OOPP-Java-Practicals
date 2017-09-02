import java.util.Scanner;
public class Qn1 {
	static double salary, payRaise, newPay;
	static Scanner sc;
	public static void main(String[] args) {
		salary = readDouble("Please enter salary: ");
		payRaise = readDouble("Please enter pay raise: ");
		System.out.println("Your pay is $"+salary);
		System.out.println("Your pay raise is "+payRaise+"%");
		if(payRaise > 100) {
			newPay = salary+(salary * (double)(1+(payRaise/100)));
		}
		else if(payRaise > 0 || payRaise < 100) {
			newPay = salary+(salary * (double)(payRaise/100));
		}
		System.out.println("Your new pay is :"+newPay);
		sc.close();
	}

	public static double readDouble(String prompt) {
			sc = new Scanner(System.in);
			System.out.println(prompt);
			double number = sc.nextDouble();
			return number;
	}
}
