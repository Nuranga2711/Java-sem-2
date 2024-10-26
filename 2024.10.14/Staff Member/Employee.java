public class Employee extends StaffMember{
	private double payRate;
	
	public Employee(String name, String phone, double payRate){
		super(name, phone);
		this.payRate = payRate;
	}
	
	public double pay(){
		return payRate;
	}
	
}