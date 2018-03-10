class TestStatic{
	static int x;
	static { x = 1000;
		System.out.println("I Will Call When Class is Loaded....");
	}
	int y;
	TestStatic(){
		y = 200;
	}
	void print() {
		display();
	}
	void display() {
		output();
	}
	void output() {
		
	}
}
public class StaticVsNonStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(TestStatic.x);
		System.out.println(TestStatic.x);
		TestStatic t = new TestStatic();
		System.out.println(t.y);
		t.print();
	}

}
