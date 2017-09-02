package q1;

public class CustomerMain {
	public static void main(String[] args) {
		Customer cust = new Customer("123", "Ms Phoon");
		System.out.println("Name: " + cust.getName()); 
		//solution: change the cust.name to cust.getName(), to make use of the Accessor to get the name of the instance variable
	}
}

/*
 *The program cannot compile because the variable, name is a instance variable, so it cannot be accessed
 *by an external class. Changing the cust.name to cust.getName() 
 */
