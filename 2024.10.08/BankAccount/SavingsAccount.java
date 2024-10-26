public class SavingsAccount extends BankAccount{
	
	public SavingsAccount(double balance){
		super(balance);
	}
	
	public void deposit(double amount){
		System.out.println("New Balance: " + (balance += amount));
	}
	
	public void withdraw(double amount){
		
		if(balance > amount){
			System.out.println("New Balance: " + (balance -= amount));
		}
		else
			System.out.println("Insufficient Balance !");
	}
}