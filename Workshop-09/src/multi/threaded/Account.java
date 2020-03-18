package multi.threaded;

import java.util.LinkedList;

public class Account {
	
	/** Fields */
	LinkedList<Integer> queue = new LinkedList<>();
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
	public synchronized void deposit() throws InterruptedException {
		setBalance(0);
		
		while (true) {
			while (queue.size() == getSize()) {
				wait();
			}
			System.out.println("Deposited: " + getBalance());
			queue.add(getBalance() + 1);
			notify();
			
			Thread.sleep(10000);
		}
	}
	
	// Withdraw
	public synchronized void withdraw() throws InterruptedException {
		
		while (true) {
			
			while (queue.size() == 0) {
				wait();
			}
			int temp = queue.removeFirst();
			System.out.println("Withdraw: " + temp);
			notify();
			
			Thread.sleep(5000);
		}
	}

}
