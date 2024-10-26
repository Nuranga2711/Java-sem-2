public class TestEmployee{
	public static void main(String args[]){
		
		Employee manager = new Manager("John", 40,"Male", 5000, 1000);
		Employee worker = new Worker("Mary", 25,"Female", 20, 160);
		Employee salesPerson = new SalesPerson("Bob", 45,"Male", 6000, 1500, 0.05);
		
		manager.displayEmployeeDetails();
		System.out.println();
		
		worker.displayEmployeeDetails();
		System.out.println();
		
		salesPerson.displayEmployeeDetails();
	}
}