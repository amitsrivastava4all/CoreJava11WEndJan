import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) throws FileNotFoundException {
		String path = "/Users/amit/Documents/JavaBatch11Wend/ISADemo/src/Demo1.java";
		File file = new File(path);
		Scanner e = new Scanner(file);
		int wCount = 0;
		while(e.hasNext()) {
			wCount++;
			String temp = e.next();
			//System.out.println("Word is "+temp);
		}
//		if(10>2) {
//		return ;
//		}
		System.out.println("Program has "+wCount);
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Line");
		String line = s.nextLine();
		System.out.println("Line is "+line);
		System.out.println("Enter the Word");
		String word = s.next();
		System.out.println("Word is "+word);
		System.out.println("Enter the Float");
		Float f = s.nextFloat();
		System.out.println("Float is "+f);
		Scanner scanner = new Scanner("Hello How are You\n I am fine\n Hi Ram");
		//System.out.println(scanner.nextLine());
		int countLine=0;
		int wordCount =0;
		while(scanner.hasNext()) {
			System.out.println("Word is "+scanner.next());
			wordCount++;
		}
		System.out.println("Total Words are "+wordCount);
//		while(scanner.hasNextLine()) {
//			countLine++;
//			System.out.println(scanner.nextLine());
//		}
		System.out.println("Total Lines are "+countLine);
		

	}

}
