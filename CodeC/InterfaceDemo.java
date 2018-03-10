class R
{
	static int y; // Class Variable
	int x;  // Instance Variable
	R(){
		x = 100; // To Set Instance Variables Values (Initalize)
	}
	
}
class Ryu implements IPlayer{
	int power ;
	Ryu(){
		power = DEFAULT_POWER;
	}
	
	@Override
public void jump(int acc) {	
	System.out.println("Ryu Jump Acc is "+acc);
}
	@Override
	public void incrementPower() {
		if(power<MAX_POWER) {
			power++;
		}
		System.out.println("Now Power of Ryu is "+power);
	}
}
abstract class Honda implements IPlayer{


	@Override
	public void incrementPower() {
		// TODO Auto-generated method stub
		
	}
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Honda honda = new Honda();
		Ryu ryu = new Ryu();
		ryu.jump(10);
		ryu.incrementPower();
//		System.out.println("Y is "+R.y);
//		R.y=9999;
//		R obj = new R();
//		obj.x =10000;
//		System.out.println(obj.x);
//		System.out.println("Y is "+obj.y);
//		
//		R obj2 = new R();
//		System.out.println("Y is "+obj2.y);
//		System.out.println(obj2.x);

	}

}
