package account2;

public class SavingsAccount extends Account {
	double overDraftLimit = 0.0;
	
	public void withdraws(double money) {
		double balance = getBalance();
		
		if(balance - money < overDraftLimit) {
			System.out.println("Insufficient Funds. You cannot overdraft.");
		}
		else {
			balance = balance - money;
			setBalance(balance);
		}
	}
	
	@Override
	public String toString() {
		return "The balance is $" + getBalance();
	}
}
