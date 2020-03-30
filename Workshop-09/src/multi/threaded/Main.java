package multi.threaded;


public class Main {

	/** Create object type account 
	 * @throws InterruptedException */
	public static void main(String[] args) {
		
		int[] balance = {1, 2, 3};
		String[] currency = {"Dollar(s)", "Euro(s)", "Pound(s)"};
		Account sharedAccount = new Account(0, "");
		
		Thread deposit = new Deposit(sharedAccount, balance, currency);
		Thread withdraw = new Withdraw(sharedAccount, balance);
		
		deposit.start();
		withdraw.start();
		
		try {
			deposit.join();
			withdraw.join();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
}
