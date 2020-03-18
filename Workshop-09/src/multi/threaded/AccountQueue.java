package multi.threaded;

import java.util.LinkedList;

public class AccountQueue {
	
	/** fields */
	private LinkedList<Account> queue;
	
	public AccountQueue() {
		queue = new LinkedList<Account>();
	}
	
	public void deposit(Account item) {
		queue.add(item);
	}
	
	public Account withdraw() {
		Account item = queue.remove();
		return item;
	}

}
