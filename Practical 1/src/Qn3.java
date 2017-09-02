import java.util.Scanner;
public class Qn3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String grade;
		int num = 0;
		
		System.out.println("Enter a letter grade from (A to F): ");
		grade = sc.next();
		
		switch(grade.toUpperCase().charAt(0)) {
		case 'A':
			num = 4;
			break;
			
		case 'B':
			num = 3;
			break;
			
		case 'C':
			num = 2;
			break;
			
		case 'D':
			num = 1;
			break;
			
		case 'F':
			num = 0;
			break;
			
		default:
			System.out.println("Invalid input, try again");
			System.exit(0);
		}
		
		System.out.println("Your number grade is "+num);
	}
}
