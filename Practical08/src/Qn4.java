import java.util.InputMismatchException;
import java.util.Scanner;

public class Qn4 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		try {
		System.out.print("Enter an integer numerator: ");
		int numerator = sc.nextInt();
		System.out.print("Enter an integer denominator: ");
		int denominator = sc.nextInt();
		int result = numerator / denominator;
		System.out.printf("Result of %d / %d is %d\n",
		numerator, denominator, result);
		}catch(InputMismatchException e) {
			System.out.println("Inavlid input! Please enter a integer!");
		}catch(ArithmeticException e) {
			System.out.println("Invalid input! Please enter any numbers other than 0");
		}finally {
			System.out.println("Cleaning up resources...");
		}
	}
}
