package q3;
import java.util.Scanner;
public class StudentApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = 0;
		System.out.println("Enter your name: ");
		String name = sc.next();
		String reply = "";
		Student stud = new Student(name, score);
		do {
			System.out.println("Enter your quiz score: ");
			score = sc.nextInt();
			System.out.println("Do you have other marks to enter? ");
			reply = sc.next();
			if(score > 0) {
				stud.addQuiz(score);
			}
			else if(score < 0) {
				System.out.println("Invalid score try again!");
			}
			
		} while(reply.equalsIgnoreCase("yes"));
		
		System.out.println("Name: "+stud.getName());
		System.out.println("Total Score: "+stud.getTotalScore());
		System.out.println("Average Score: "+stud.getAverageScore());
	}
}
