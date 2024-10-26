public class HourlyEmployee extends Employee{
	
	public HourlyEmployee(String name, String phone, double payRate){
		super(name, phone, payRate);
	}
	
	public double pay(double hoursWorked){
		return super.pay()*hoursWorked;
	}
}
