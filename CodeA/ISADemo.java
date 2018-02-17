class Account{
	int accountNumber;
	double balance;
	double checkBalance() {
		System.out.println("Check Balance");
		
		return balance;
	}
	void roi() {
		System.out.println("5% ROI");
	}
}
class SavingAccount extends Account{
	void limit() {
		System.out.println("Limit of Transaction");
	}
	@Override
	void roi() {
		super.roi();
		System.out.println("ROI For SavingAccount is 4%");
	}
}
class CurrentAccount extends Account{
	@Override
	void roi() {
		System.out.println("ROI for CurrentAccount is 6%");
	}
	void odLimit() {
		System.out.println("OD Limit Current Account");
	}
}
public class ISADemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount sa = new SavingAccount();
		sa.checkBalance();
		sa.roi();
		sa.limit();

	}

}
