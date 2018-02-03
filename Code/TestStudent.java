
public class TestStudent {

	public static void main(String[] args) {
		Student ram = new Student() ;
		//ram.print();  // 66.print()
//		System.out.println("Rollno "+ram.rollno);
//		System.out.println("Name "+ram.name);
//		System.out.println("Course "+ram.course);
		//ram.rollno  = -1001;
//		ram.name  = "Ram Kumar";
//		ram.course = "BCA";
		ram.takeInput(-1001, "Ram kumar", "BCA");	
		ram.print();
		System.out.println("*****************************");
//		System.out.println("Rollno "+ram.rollno);
//		System.out.println("Name "+ram.name);
//		System.out.println("Course "+ram.course);
		
		
		
		Student shyam = new Student();
		// Input Repeat
		shyam.takeInput(1002, "Shyam", "MCA");
//		shyam.rollno  = -1002;
//		shyam.name  = "";
//		shyam.course = "";
		// Output Repeat
		shyam.print();
//		System.out.println("Rollno "+shyam.rollno);
//		System.out.println("Name "+shyam.name);
//		System.out.println("Course "+shyam.course);
		
		
		int x = 100;

	}

}
