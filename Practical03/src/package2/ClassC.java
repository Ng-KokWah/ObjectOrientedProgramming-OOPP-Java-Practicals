package package2;
import package1.ClassA;
/*
 * a) The field ClassA.b is not visible. The field ClassA.c is not visible. The field ClassA.d is not visible.
 * This is because b is protected, c is default, d is an instance variable.
 * b) b is protected so it can only be access within the class, subclass and package. c is default variable so it
 * can only be accessed within the class and package. d is an instance variable so if you wan to access it you 
 * need to call it with a accessor method of getA()
 * c)This can all be resolved by creating an accessor method of getB(), getC(), getD() 
 */

public class ClassC {
	public static void main(String[] args) {
		ClassA ca = new ClassA();
		System.out.println("a : " + ca.a);
		System.out.println("b : " + ca.getB());
		System.out.println("c : " + ca.getC());
		System.out.println("d : " + ca.getD());
	}
}
