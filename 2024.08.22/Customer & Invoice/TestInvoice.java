public class TestInvoice{
	public static void main(String args[]){
		Customer c1 = new Customer(002, "Nuranga", 10);
		Invoice i1 = new Invoice(001, 4500, c1);
		
		System.out.println(i1);
	}
}