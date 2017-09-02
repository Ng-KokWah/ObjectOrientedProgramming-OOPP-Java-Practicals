package q1;

public class Customer {
	private String custId;
	private String name;
	
	public Customer() {
		
	}
	
	public Customer(String custId, String name) {
		this.custId = custId;
		this.name = name;
	}
	
	public void setCustId(String custId) {
		this.custId = custId;
	}
	
	public String getCustId() {
		return custId;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void print() {
		System.out.println("Customer Id: "+custId);
		System.out.println("Customer name: "+name);
	}
}
