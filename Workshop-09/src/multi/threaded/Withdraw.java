package multi.threaded;

public class Withdraw extends Thread {
	private Account sharedAccount;
	private int size;
	
	// Constructor
	public Withdraw(Account sharedAccount, int[] deposit) {
		this.sharedAccount = sharedAccount;
		this.size = deposit.length;
	}
	
	
	@Override
	public void run() {
		while (size > 0) {
			System.out.println("Acessing withdraw");
			synchronized(sharedAccount) {
				sharedAccount.withdraw(1);
			}
		}
	}
}
