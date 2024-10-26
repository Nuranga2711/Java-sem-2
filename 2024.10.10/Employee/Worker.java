public class Worker extends Employee{
	protected double hourlyRate;
	protected double hoursWorked;
	
	public Worker(String name, int age, String gender, double hourlyRate, double hoursWorked){
		super(name, age, gender);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}
	
	public void calculateSalary(){
		System.out.println("Worker's Salary: " + (hourlyRate*hoursWorked));
	}
	
	public void displayEmployeeDetails(){
		System.out.println("Worker's Name: " + super.name);
		System.out.println("worker's Age: " + super.age);
		System.out.println("worker's Gender: " + super.gender);
		calculateSalary();
	}
}