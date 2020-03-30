package multi.threaded;

public class Deposit extends Thread {
	private Account sharedAccount;
	private int[] balance;
	private String[] currency;
	
	// Constructor
	public Deposit(Account sharedAccount, int[] balance, String[] currency) {
		this.sharedAccount = sharedAccount;
		this.balance = balance;
		this.currency = currency;
	}
	
	
		
	@Override
	public void run() {
		int i = 0;
//		System.out.println("Accessing deposit");
		while (i >= 0 && i < balance.length) {
			synchronized(sharedAccount) {
				sharedAccount.deposit(balance[i], currency[i]);
				
				try {
					if (i < balance.length && i >= 0) i++;
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}
}
