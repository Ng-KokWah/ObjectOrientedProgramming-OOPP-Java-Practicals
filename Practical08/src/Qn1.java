import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Scanner;

public class Qn1 {
	public static void main(String[] args) {
		Path pth = FileSystems.getDefault().getPath("resources", "hello.txt");
		File file = new File(pth.toUri());
		
		try (PrintWriter writer=new PrintWriter(file))
		{
			writer.println("Hello, World!");
			writer.close();
		} catch (FileNotFoundException e) {		
			e.printStackTrace();
		} 
		
		try (Scanner in=new Scanner(file))
		{
		while (in.hasNext()) {
			System.out.print(in.next()+" ");
		}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
