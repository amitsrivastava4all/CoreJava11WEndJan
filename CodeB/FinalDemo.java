class Test{
	final int X; // final instance variable
	Test(){
		X = 200;
		System.out.println("Test Class Cons");
	}
	Test(int q){
		//X = 200;
		this();
	}
	void show() {
		//X = 300;
	}
}

 class Maths{
	int x;
	int y;
	final void sin() {
		System.out.println("Math Sin Operation....");
	}
	void roi() {
		// simple interest
	}
	
}
class ChildMaths extends Maths{
	int z;
//	void sin() {
//		
//	}
	void roi() {
	// Compound Interest
	}
}
class B1
{
	int x,y;
	void show(final int t) {
		//t++;
		System.out.println(t);
	}
	
}
public class FinalDemo {
	static void print(final int y) {
		System.out.println("PRINT Y is "+y);
	}
	static void show(int x){
		print(20);
		print(30);
		System.out.println("SHOW X is "+x);
		
	}
		public static void main(String[] args) {
			show(10);
			System.out.println("main...");
			//show(30);
			
			
			
			
			
			
//		final int C = 900;
//		final B1 obj2 = new B1();
//		obj2.show(100);
//		obj2.show(200);
//		//obj2 = new B();
//		obj2.x = 100;
//		obj2.y = 200;
//		obj2.x++;
//		obj2.y++;
//		
//		
//		Test obj = new Test(90);
//		// TODO Auto-generated method stub
//		final int MAX_AGE = 100;
//		System.out.println("Age is "+MAX_AGE);
		//MAX_AGE = 20;

	}

}
