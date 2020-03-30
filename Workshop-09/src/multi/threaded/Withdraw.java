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
//		System.out.println("Acessing withdraw");
		while (size > 0) {
			synchronized(sharedAccount) {
				sharedAccount.withdraw(1);
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println(e.getMessage());
				}
				
			}
		}
	}
}
