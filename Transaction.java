package account2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Transaction {
	private Date dateCreated = new Date();
	private char type;
	private double amount;
	private double balance;
	private String description;
	
	public Transaction() {
		
	}
	
	public Transaction(char type, double amount, double balance,
			String description) {
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.description = description;
	}


	// Getter and Setter
	public String getDateCreated() {
		SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
	    String today = d.format(dateCreated);
	    return today;
	}
	
	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
