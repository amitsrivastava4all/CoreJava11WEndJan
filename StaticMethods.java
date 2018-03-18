import static java.util.Arrays.fill;
import java.util.Scanner;
import static java.lang.System.out;

final class W
{
	static class V3{
		
	}
	protected class V2{
		
	}
private class V
{
	
}
}
//final class Validation{
//	private Validation() {}
interface Validation{
public static boolean isBlank(String str) {
		if(str!=null && str.trim().length()>0) {
			return false;
		}
		return true;
	}
}
class Customer{
	Loans loan;
	//Loan loan = new Loan();
	Customer(Loans loan){
		this.loan = loan;
	}
}
class Loans{
	
}
public class StaticMethods {

	public static void main(String[] args) {
		Loans loan = new Loans();
		Customer ram = new Customer(loan);
		ram = null;
		
		
		// TODO Auto-generated method stub
		//Validation v = new Validation();
		int d [] =new int[10];
		fill(d, 1000);

		//Math m = new Math();
		Scanner scanner = new Scanner(System.in);
		out.println("Enter the Name");
		String name = scanner.next();
		if(Validation.isBlank(name)) {
			out.println("Name Can't be Blank");
		}
		else {
			out.println("Name is Not Blank");
		}

	}

}
