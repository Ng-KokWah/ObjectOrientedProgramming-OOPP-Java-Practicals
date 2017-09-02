import java.util.Scanner;
public class Qn5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double interest, balance, monthlyExpense;
		
		do{
		System.out.println("Enter starting account balance (S$): ");
		balance = sc.nextDouble();
		if(balance < 0) {
			System.out.println("Invalid input please try again!");
		}
		}while(balance < 0);
		
		do {
		System.out.println("Enter compound interest per month (%): ");
		interest = sc.nextDouble();
		if(interest < 0){
			System.out.println("Invalid input please try again!");
		}
		}while(interest < 0);
		
		do {
		System.out.println("Enter expense per month (S$): ");
		monthlyExpense = sc.nextDouble();
		if(monthlyExpense < 0){
			System.out.println("Invalid input please try again!");
		}
		}while(monthlyExpense < 0);
		
		int i=0;
		do {
			balance = balance + (balance * interest/100) - monthlyExpense;
			i++;
		}while(balance >= 0);
		
		System.out.println("The account will be completely depleted in "+i+" months.");
	}
}
