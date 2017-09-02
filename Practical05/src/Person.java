
public class Person {
	private String name;
	private String nric;
	
	public Person(String name, String nric) {
		this.name = name;
		this.nric = nric;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setNric(String nric) {
		this.nric = nric;
	}
	
	public String getNric() {
		return nric;
	}
	
	public void view() {
		System.out.println("Nric: "+nric);
		System.out.println("Name: "+name);
	}
}
