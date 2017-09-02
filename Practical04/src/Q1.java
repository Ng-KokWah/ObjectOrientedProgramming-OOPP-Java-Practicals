import java.util.ArrayList;
import java.util.Random;
public class Q1
{
	public static void main(String[]args)
	{
		ArrayList<Integer>random=new ArrayList<Integer>();
		Random ran = new Random();
		for(int i=0;i<10;i++)
		{
			random.add(ran.nextInt(100)+1);
		}
		System.out.print("Every element at an even index: ");
		for(int i=0;i<10;i+=2)
		{
			System.out.print(random.get(i)+" ");
		}
		System.out.print("\nEvery even element: ");
		for(int i=1;i<10;i+=2)
		{
			System.out.print(random.get(i)+" ");
		}
		System.out.print("\nAll elements in reverse order: ");
		for(int i=9;i>=0;i--)
		{
			System.out.print(random.get(i)+" ");
		}
		System.out.print("\nOnly the first and last element: ");
		System.out.print(random.get(0)+" ");
		System.out.print(random.get(9));
	}
	
}
