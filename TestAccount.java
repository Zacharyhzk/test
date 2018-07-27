package account2;

public class TestAccount {

	public static void main(String[] args) {
		Account account = new Account(1122, 20000.0, 4.5);
		System.out.println ("Account ID: "+ account.getId());
		account.withdraw(2500);
		account.deposit(3000);
		System.out.printf("The balance is $%.2f\n", account.getBalance());
		System.out.printf("The monthly interest is $%.2f\n" , account.getMonthlyInterest());
		System.out.println("The date is " + account.getDateCreated());
	}

}
