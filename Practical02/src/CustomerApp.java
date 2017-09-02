
public class CustomerApp {
	public static void main(String[] args) {
		Customer c1 = new Customer();
		System.out.println("== Customer object instantiated using default constructor ==");
		c1.print();
		Customer c2 = new Customer("123456", "Ms Phoon");
		System.out.println("== Customer object instantiated using non-default constructor ==");
		c2.print();
	}
}
