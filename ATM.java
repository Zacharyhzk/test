package account2;

import java.util.Scanner;

public class ATM {
	
	public static void main(String[] args) {
		Account[] accounts = new Account[10];
		
		//initial accounts
		for(int i=0; i<accounts.length; i++) {
			accounts[i] = new Account(i, 100);
		}
		
		Boolean systemStart = true;
		
		while(systemStart) {
			System.out.print("Enter an id: ");
			Scanner input = new Scanner(System.in);
			int id = input.nextInt();
				
			if(id<0 || id>9) {
				System.out.println("The id entered is in incorrectly.\n");
				continue;
			}
			else {
				while(systemStart) {
					mainMenu();
					int choice = input.nextInt();
					if(choice == 1) {
						System.out.println("The balance is " + accounts[id].getBalance());
					}
					else if(choice == 2) {
						System.out.print("Enter an amount to withdraw: ");
						double money = input.nextDouble();
						accounts[id].withdraw(money);
					}
					else if(choice == 3) {
						System.out.print("Enter an amount to deposit: ");
						double money = input.nextDouble();
						accounts[id].deposit(money);
					}
					else if(choice == 4) {
						System.out.println();
						break;
					}
					else {
						System.out.println("Please enter a valid choice4 again.");
						continue;
					}
				}
			}
		}
	}

	private static void mainMenu() {
		System.out.print("\nMain menu"+"\n1:check balance"+"\n2:withdraw"
							+"\n3:deposit"+"\n4:exit"+"\nEnter a choice: ");
	}
}
