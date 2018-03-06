interface T1{
	int X = 100;
	void show();
}
interface T2{
	int X = 200;
	void show();
	void output();
}
interface T3 extends T1, T2{
	void print();
}
class T4{
	
}
class T5 extends T4 implements T1, T2{

	@Override
	public void output() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
}
public class InterfaceRules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
