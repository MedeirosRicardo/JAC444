package multi.threaded;

import java.util.LinkedList;

public class Main {

	/** Create object type account */
	public static void main(String[] args) {
		
		LinkedList<Account> queue = new LinkedList<>();
		
		// Deposit
		public synchronized void deposit(Account item) {
			if (this.getCurrency() == item.getCurrency()) {
				queue.add(item);
				notify();
			}
			
		}
		
		// Withdraw
		public synchronized Account withdraw(Account item) {
			while(item.getBalance() > 0) {
				try {
					wait();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
			
			item = queue.remove();
			System.out.println(item.toString());
			return item;
		}
		
		
		new Thread() {
			public void run() {
				c.withdraw(c);
			}
		}.start();
		
		
		new Thread() {
			public void run() {
				c.deposit(1, "Dollar");
				c.deposit(1, "Euro");
				c.deposit(1, "Euro");
				c.deposit(1, "Pound");
				c.deposit(1, "Pound");
				c.deposit(1, "Pound");
			}
		}.start();
	}
	
}
