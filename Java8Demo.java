interface DB{
	void open();
	void close();
	default void transactions() {
		System.out.println("DB Transactions....");
	}
}
interface Payment{
default void transactions() {
		System.out.println("Payment Transactions...");
	}
}
class OnlineShop implements DB, Payment{
	@Override
	public void open() {
		
	}
	@Override
	public void close() {
		
	}
	@Override
	public void transactions() {
		DB.super.transactions();
		Payment.super.transactions();
		System.out.println("Online Shop Transactions....");
	}
}
public class Java8Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
