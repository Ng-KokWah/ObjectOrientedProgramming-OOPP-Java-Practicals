import java.util.Scanner;
public class Qn1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String phoneNo;
		String countryCode;
		String newStr;
		String firstPart;
		String secondPart;
		
		System.out.println("Enter a phone number (e.g. +6565501645):");
		phoneNo = sc.next();
		
		if(phoneNo.length() == 11) {
			countryCode = phoneNo.substring(0 , 3);
			newStr = "("+countryCode+")";
			firstPart = phoneNo.substring(3 , 7);
			secondPart = phoneNo.substring(7, 11);
			System.out.println(newStr+" "+firstPart+" "+secondPart);
		}
		
		else {
			System.out.println("Invalid input please try again!");
		}
	}
}
