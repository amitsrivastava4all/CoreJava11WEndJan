class Kid{
	int height; // Instance variable
	int weight;
	static int iceCreamQuantity ;
	static {
		iceCreamQuantity = 10;
		System.out.println(" I will Call When Class is Loaded..."+iceCreamQuantity);
	}
	Kid(int height , int weight){
		this.height = height;
		this.weight = weight;
	}
}
public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kid lean = new Kid(3,12);
		Kid fat = new Kid(3,21);
		fat.weight++;
		System.out.println("Fat Kid Weight"+fat.weight);
		System.out.println("Lean Kid Weight "+lean.weight);
		System.out.println("Ice Cream Quantity is "+Kid.iceCreamQuantity);
		Kid.iceCreamQuantity = Kid.iceCreamQuantity - 5;
		System.out.println("After Consume "+Kid.iceCreamQuantity);
		//fat.iceCreamQuantity= fat.iceCreamQuantity-5;

	}

}
