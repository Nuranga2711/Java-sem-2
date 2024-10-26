public class SalesPerson extends Manager{
	protected double commissionRate;
	
	public SalesPerson(String name, int age, String gender, double baseSalary, double bonus, double commissionRate){
		super(name, age, gender, baseSalary, bonus);
		this.commissionRate = commissionRate;
	}
	
	public void calculateSalary(){
		System.out.println("Sales Person's Salary: " + (baseSalary + (baseSalary*this.commissionRate)));
	}

	public void displayEmployeeDetails(){
		System.out.println("Sales Person's Name: " + super.name);
		System.out.println("Sales Person's Age: " + super.age);
		System.out.println("Sales Person's Gender: " + super.gender);
		System.out.println("Sales Person's Commission Rate: " + this.commissionRate);
		calculateSalary();
	}
}