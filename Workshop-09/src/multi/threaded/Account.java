package multi.threaded;

import java.util.LinkedList;

public class Account {
	
	/** Fields */
	LinkedList queue = new LinkedList<>();
	int balance;
	private int size;
	private String currency;
	
	// Constructor
	Account() {
		
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
	
	public int getSize() {
		return this.size;
	}
	
	// Deposit
	public synchronized void deposit(int value, String currency) throws InterruptedException {
		setBalance(0);
		this.size = value;
//		this.currency = currency;
				
		while (true) {
			while (queue.size() == value * 2) {
				wait();
			}
			queue.add(++balance);
			queue.add(currency);
			System.out.println("Deposited: " + getBalance());
//			System.out.println(queue.toString());
			notify();
			
			Thread.sleep(1000);
		}
	}
	
	// Withdraw
	public synchronized void withdraw() throws InterruptedException {
		
		while (true) {
			
			while (queue.size() == 0) {
				wait();
			}
			int temp = (int) queue.remove();
			String cur = (String) queue.remove();
			System.out.println("Withdraw: " + temp);
			notify();
			
			Thread.sleep(1000);
		}
	}

}
