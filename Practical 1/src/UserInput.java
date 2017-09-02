/*
 * Modification: readDoubleBetween and readDoubleGreaterThan
 * Date of Modification: 21 oct 2016
 * Modified by: Ng Kok Wah
 */
import java.util.Scanner;

public class UserInput {
	
	static Scanner in;
	/**
	  Prompts a user to enter a value in a given range until the user
	  provides a valid input.
	  @param low the low end of the range
	  @param high the high end of the range
	  @return the value provided by the user
	*/
	public static int readValueBetween(int low, int high) {
		int input;
		
		do {
			System.out.print("Enter between " + low + " and " + high + ": ");
			input = in.nextInt();
		} while (input < low || input > high);
		
	 
		return input;
	}
	/**
	 * Reads a floating-point value from input and returns its value
	 * 
	 * @param prompt
	 *            the prompt string
	 * @return the floating point number the user enters after the prompt
	 */
	public static double readDouble(String prompt) {
		double input=0;
		
		System.out.println(prompt);
	    input=in.nextDouble();
	  
		return input;
	}
	
	public static String readString(String prompt) {
		String str="";
		System.out.println(prompt);
		str=in.next();
	 
		return str;
	}
	// Can add readString
	// Can add readDoubleBetween
	// Can add readDoubleGreaterThan
	// Can add readValueGreaterThan
	// etc...
	/*
	 * Added method readDoubleBetween
	 */
	public static double readDoubleBetween(double minValue, double maxValue) {
		double num;
		
		do {
			System.out.print("Enter between " + minValue + " and " + maxValue + ": ");
			num = in.nextInt();
		} while (num < minValue || num > maxValue);
		
	 
		return num;
	}
	/*
	 * Added method readDoubleGreaterThan
	 */
	
	public static double readDoubleGreaterThan(double num1, double num2) {
		double x = 0;
		if (num2 > num1) {
			x = num2;
		}
		else if(num1 > num2) {
			x = num1;
		}
		return x;
	}

	public static void openScanner() {
		in=new Scanner(System.in);
	}
	
	public static void closeScanner() {
		in.close();
	}
	
	
}