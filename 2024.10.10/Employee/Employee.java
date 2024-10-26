abstract public class Employee{
	protected String name;
	protected int age;
	protected String gender;
	
	public Employee(String name, int age, String gender){
		this.name = name;
		this.age = age; 
		this.gender = gender;
	}
	
	public abstract void calculateSalary();
	public abstract void displayEmployeeDetails();
}