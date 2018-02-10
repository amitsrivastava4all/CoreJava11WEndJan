import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {//throws IOException {
		// TODO Auto-generated method stub
//		byte b[] = new byte[4];
//		int t = System.in.read(b);
//		System.out.println(b);
//		for(byte a : b) {
//			System.out.println((char)a); 
//			
//		}
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the First Name");
		String name = scanner.next();
		System.out.println("Enter the Last Name");
		String lastName = scanner.next();
		System.out.println("Enter the Age");
		int age = scanner.nextInt();
		System.out.println("Enter the Address ");
		scanner.nextLine();
		String address = scanner.nextLine();
		System.out.println("First Name is "+name);
		System.out.println("Last Name is "+lastName);
		System.out.println("Age is "+age);
		System.out.println("Address is "+address);
		scanner.close();
		
		Scanner r = new Scanner(System.in);
		System.out.println("Enter the Salary");
		double salary = r.nextDouble();
		System.out.println("Salary is "+salary);
		r.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
