public class TestBankAccount {
	public static void main(String[] args) {
		BankAccount account = new ChekingAccount(1000.0);
		Customer customer = new Customer(account);
		
		customer.displayBalance();
		customer.deposit(500.0);
		customer.displayBalance();
		customer.withdraw(200.0);
		customer.displayBalance();
		customer.withdraw(1500.0); // Should print "Insufficient funds"
	}
}