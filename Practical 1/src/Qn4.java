import java.util.Scanner;
public class Qn4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double [] temp = new double[12];
		String [] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		double highest = temp[0];
		String months = null;
		String highestMonth = null;
		
		for(int i=0; i<12; i++) {
			do {
				System.out.println("Please enter temperature of "+month[i]+":");
				temp[i] = sc.nextDouble();
			}while(temp[i] < 0 || temp[i] > 100);
		}
		
		for(int i=1; i<12; i++) {
			months = month[i-1];
			if(temp[i] > highest) {
				highest = temp[i];
				highestMonth = month[i-1];
			}
			System.out.println("The temperature is "+temp[i]+" degree celsius in the month "+months);
		}
			System.out.println("The month with the highest temperature is "+highestMonth);
	}
}


