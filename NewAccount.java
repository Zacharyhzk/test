package account2;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class NewAccount {
	private int id = 0;
	private double balance = 0.0;
	private double annualInterestRate = 0.0;
	private Date dateCreated = new Date();
	private String name;
	protected ArrayList<Transaction> transactions = new ArrayList<Transaction>();
	
	public NewAccount() {
		
	}
	
	public NewAccount(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}
	
	public NewAccount(String name, int id, double balance) {
		this.name = name;
		this.id = id;
		this.balance = balance;
	}
	
	//Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public String getDateCreated() {
		SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
	    String today = d.format(dateCreated);
	    return today;
	}
	
	//define method getMonthlyInterestRate
	public double getMonthlyInterestRate() {
		return annualInterestRate/12;
	}
	
	public double getMonthlyInterest() {
		return balance * (annualInterestRate/1200);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName() {
		this.name = name;
	}
	
	//define method withdraw
	public void withdraw(double amount) {
		if(balance >= amount) {
			balance -= amount;
			transactions.add(new Transaction('W', amount, balance, "Successful."));
		}
		else {
			System.out.println("Insufficient Funds!");
		}
	}
	
	//define method deposit
	public void deposit(double amount) {
		balance = balance + amount;
		transactions.add(new Transaction('D', amount, balance, "Successful."));
	}
	
	// List the all transactions
	public void listTransactions() {
		for(int i=0; i<transactions.size(); i++) {
			System.out.printf("\t\t%d. Date: %s\n\t\t   Type:%c\n\t\t   Amount:$%.2f\n\t\t   Balance:$%.2f\n\t\t   Description: Successful.\n\n",
					i+1, transactions.get(i).getDateCreated(),
					transactions.get(i).getType(),transactions.get(i).getAmount(),
					transactions.get(i).getBalance(),transactions.get(i).getDescription());
		}
	}
}
