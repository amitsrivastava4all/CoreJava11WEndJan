abstract class Loan{
	int balance;
	abstract void roi() ;
		 
	 
	void checkBalance() {
		
	}
}
class HomeLoan extends Loan{
	void myroi() {
		System.out.println("9.5 % ROI");
	}

	@Override
	void roi() {
		// TODO Auto-generated method stub
		
	}
}
class AutoLoan extends Loan{
	void roi() {
		System.out.println("12.5 % ROI");
	}
}
abstract class A1{
	A1(){
		System.out.println("A1 Class Cons");
	}
	A1(int x){
		this();
		System.out.println("A1 param cons");
	}
}
class B2 extends A1{
	B2(){
		super(100);
		//super();
		System.out.println("B2 Class Cons");
	}
}
public class AbstractClassDemo {

	public static void main(String[] args) {
		B2 obj = new B2();
		// TODO Auto-generated method stub
		//Loan loan = new Loan();

	}

}
