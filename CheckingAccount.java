package account2;

public class CheckingAccount extends Account {
	
	double overDraftLimit = -10000.0;
	
	public void withdraws(double amount) {
		double balance = getBalance();
		
		if(balance - amount < overDraftLimit) {
			System.out.println("You cannot overdraft.");
		}
		else {
			balance = balance - amount;
			setBalance(balance);
		}
	}
	
	@Override
	public String toString() {
		if(getBalance()  < 0) {
			return "Overdraft fee: $" + getBalance();
		}
		else {
			return "The balance is: $" + getBalance();
		}
	}
}
