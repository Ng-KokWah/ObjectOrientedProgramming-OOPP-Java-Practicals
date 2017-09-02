import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Scanner;

public class Qn2 {
	public static void main(String[] args) {
		// existing file with text
		Path pth = FileSystems.getDefault().getPath("resources", "marylamb.txt");
		File inFile = new File(pth.toUri());
		
		// non-existing file or to override the file
		pth = FileSystems.getDefault().getPath("resources", "marylamb2.txt");
		File outFile = new File(pth.toUri());
		
		
		//at the same time open the file for output
		try(Scanner in = new Scanner(inFile);
				PrintWriter writer = new PrintWriter(outFile)) {
				int count = 0;
			while(in.hasNextLine()) {
				String line = in.nextLine();
				count++;
				line = "/* "+count+" */ "+line;
				writer.println(line);
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
