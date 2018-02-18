class A
{
	int x =100;
	void show() {
		System.out.println("A Show");
	}
}
class B extends A
{
	int x =200;
	@Override
	void show() {
		System.out.println("B Show "+x+" "+super.x);
	}
}
public class OverrideRule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new B();
		obj.show();
		System.out.println(obj.x);

	}

}
