package account2;

public class TestNewAccount {

	public static void main(String[] args) {
		NewAccount newAccount = new NewAccount("George", 1122, 1000.0);
		newAccount.setAnnualInterestRate(1.5);
		
		newAccount.deposit(30);
		newAccount.deposit(40);
		newAccount.deposit(50);
		
		newAccount.withdraw(5);
		newAccount.withdraw(4);
		newAccount.withdraw(2);
		
		System.out.println("---------------------------------------------------------------");
		System.out.println("\t\t\t---------");
		System.out.println("\t\t\t|ACCOUNT|");
		System.out.println("\t\t\t---------");
		System.out.println("\t\tName: " + newAccount.getName());
		System.out.println("\t\tID: " + newAccount.getId());
		System.out.println("\t\tThe annual interest rate: " + newAccount.getAnnualInterestRate());
		System.out.printf("\t\tBalance: $%.2f\n\n", newAccount.getBalance());
		
		System.out.println("\t\t   ---------------------");
		System.out.println("\t\t   |TRANSACRION DETAILS|");
		System.out.println("\t\t   ---------------------");
		
		// print the all transactions
		newAccount.listTransactions();
		System.out.println("---------------------------------------------------------------");
	}

}