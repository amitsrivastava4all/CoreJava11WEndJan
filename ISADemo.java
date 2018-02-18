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
		//super.roi();
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
class AccountCaller{
	void call(Account account) {
	account.checkBalance();
	account.roi();
	if(account instanceof SavingAccount) {
		SavingAccount sa = (SavingAccount) account; //Downcasting
		sa.limit();
	}
	else
	if(account instanceof CurrentAccount) {	
		CurrentAccount ca = (CurrentAccount) account;
		ca.odLimit();
	}
	}
}
public class ISADemo {

	public static void main(String[] args) {
		AccountCaller ac = new AccountCaller();
		ac.call(new SavingAccount());
		System.out.println("******************************");
		ac.call(new CurrentAccount());
		// TODO Auto-generated method stub
//		int x = (int)10.20;
//		x = (int)90.20;
//		Account sa = new SavingAccount();  // Upcasting
//		
//		sa = new CurrentAccount();
//		//SavingAccount sa = new SavingAccount();
//		sa.checkBalance();
//		sa.roi();
//		sa.limit(); // Special
//		System.out.println("**************************");
//		CurrentAccount ca= new CurrentAccount();
//		ca.checkBalance();
//		ca.roi();
//		ca.odLimit(); // Special

	}

}




