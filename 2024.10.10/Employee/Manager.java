public class Manager extends Employee{
	protected double baseSalary;
	protected double bonus;
	
	public Manager(String name, int age, String gender, double baseSalary, double bonus){
		super(name,age,gender);
		this.baseSalary = baseSalary;
		this.bonus = bonus;
	}
	
	public void calculateSalary(){
		System.out.println("Manager's Salary: " + (baseSalary+bonus));
	}
	
	public void displayEmployeeDetails(){
		System.out.println("Manager's Name: " + super.name);
		System.out.println("Manager's Age: " + super.age);
		System.out.println("Manager's Gender: " + super.gender);
		calculateSalary();
	}
}