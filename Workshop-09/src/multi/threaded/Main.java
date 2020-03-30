package multi.threaded;


public class Main {

	/** Create object type account 
	 * @throws InterruptedException */
	public static void main(String[] args) throws InterruptedException {
		
		final Account acc = new Account();
		
		// Withdraw
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					acc.withdraw();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		
		// Deposit
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					acc.deposit(1, "Dollar");
					acc.deposit(2, "Euros");
					acc.deposit(3, "Pounds");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		t2.start();
		t1.start();
	
	}
	
}
