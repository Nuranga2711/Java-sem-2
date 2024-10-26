public class TestAnimal{
	public static void main(String args[]){
		Cat C1 = new Cat("Tom");
		Cat C2 = new Cat("Garfield");
		
		Dog D1 = new Dog("Scooby");
		Dog D2 = new Dog("Lyca");
		
		System.out.println(C1);
		
		System.out.println();
		
		System.out.println(D1);
		
		System.out.println();
		
		D1.greets();
		D1.greets(D2);
		
		
		
	}
}