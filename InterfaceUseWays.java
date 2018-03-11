interface Calc{
	public int calculate(int x, int y);
}
class CalcUse implements Calc{
	@Override
	public int calculate(int a, int b) {
		return a + b;
	}
}
public class InterfaceUseWays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc d = (a,b)->a+b;
		Calc e = (a,b)->{
			System.out.println("A is "+a+" and B is "+b);
			return a -b;
		};
		System.out.println(d.calculate(90, 10));
		int level = 2;
		if(level==2) {
//		Calc c = new Calc() {
//			@Override
//			public int calculate(int x, int y) {
//				this.print();
//				return x * y;
//			}
//			public void print() {
//				System.out.println("Print...");
//			}
//		};
		//int result =c.calculate(10, 20);
		//c.print();
		//System.out.println("Result is "+result);
		}
		
		
//		CalcUse obj = new CalcUse();
//		int result = obj.calculate(100, 200);
//		System.out.println("Result is "+result);

		
		
		
		
	}

}
