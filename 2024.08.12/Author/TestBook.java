public class TestBook{
	public static void main(String[] args){
		// Book 1
		Author A1 = new Author("Mahinda Prasad", "Nura@gmail.com", 'M');
		Book B1 = new Book("Senkottan", A1, 500, 10);
		
		System.out.println(B1);
		
		System.out.println();
		
		// Book 2
		Author A2 = new Author("Nuranga", "nkr@.com", 'M');
		Book B2 = new Book("Sunday", A2, 1000, 400);
		
		System.out.println(B2);
		
		System.out.println();
		
		// Get the Book 2 's Email address
		System.out.println(A2.getName() + "'s Email address : " + A2.getEmail());
		
		System.out.println();
		
		//Let's change the email of A2
		A2.setEmail("wada huttoo");
		System.out.println(A2.getName() + "'s Updated email address : " + A2.getEmail());
		
		System.out.println();
		
		System.out.println(A1);
		
		System.out.println();
		
		System.out.println(A2);
	}
}