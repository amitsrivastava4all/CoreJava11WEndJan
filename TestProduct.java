
public class TestProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product mobilePhone = new Product() ;
		//int x =100;
		System.out.println(mobilePhone.id);
		System.out.println(mobilePhone.name);
		System.out.println(mobilePhone.price);
		System.out.println(mobilePhone.quantity);
		mobilePhone.id = 1001;
		mobilePhone.name = "Nokia";
		mobilePhone.price = 20000;
		mobilePhone.quantity = 1;
		
		System.out.println(mobilePhone.id);
		System.out.println(mobilePhone.name);
		System.out.println(mobilePhone.price);
		System.out.println(mobilePhone.quantity);
		
		Product ledTv = new Product();
		ledTv.id = 1002;
		ledTv.name = "Apple Tv";
		ledTv.price = 100000;
		ledTv.quantity = 1;
		
		System.out.println("Id "+ledTv.id);
		System.out.println("Name "+ledTv.name);
		System.out.println(" Price "+ledTv.price);
		System.out.println("Qt "+ledTv.quantity);
		

	}

}
