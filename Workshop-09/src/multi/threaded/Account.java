package multi.threaded;


public class Account {
	
	/** Fields */
	private int balance;
	private String currency;
	private int size;
	
	// Constructor
	Account(int balance, String currency, int size) {
		this.balance = balance;
		this.currency = currency;
		this.size = size;
	}
	
	/** Setters */
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	
	/** Getters */
	public int getBalance() {
		return this.balance;
	}
	
	public String getCurrency() {
		return this.currency;
	}
	
	public int size() {
		return this.size;
	}

}
