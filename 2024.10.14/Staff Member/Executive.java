public class Executive extends Employee{
	
	public Executive(String name, String phone, double payRate){
		super(name, phone, payRate);
	}
	
	public double pay(double bonus){
		return super.pay() + bonus;
	}
}