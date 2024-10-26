public class ChekingAccount extends BankAccount{
	
	//private double amount; 
	
	public ChekingAccount(double balance){
		super(balance);
	}
	
	public void deposit(double amount){
		System.out.println("New Balance: " + (balance += amount));
	}
	
	public void withdraw(double amount){
		
		if(balance > amount * 1.1){
			System.out.println("New Balance: " + (balance -= amount * 1.1));
		}
		else
			System.out.println("Insufficient Balance !");
	}
}