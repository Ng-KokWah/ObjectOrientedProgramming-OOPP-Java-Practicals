package package1;
/*
 * a) The field ClassA.d is not visible, the variable d is an instance variable
 * b) d is an instance variable so it cannot be accessed by another class,
 * thus, you need to specify a accessor method to get the value of d.
 * c) To resolve this error i added a accessor method getD() and changed the ca.d 
 * to ca.getD() so that the value of the instance variable d can be accessed from this class
 */
public class ClassB {
	public static void main(String[] args){
		ClassA ca = new ClassA();
		System.out.println("a : " + ca.a);
		System.out.println("b : " + ca.b);
		System.out.println("c : " + ca.c);
		System.out.println("d : " + ca.getD());
	}
}
