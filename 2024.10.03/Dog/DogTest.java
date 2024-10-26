public class DogTest{
	
	/*public static void poke(Dog d){
		System.out.println(" "+d+" says "+d.speak());
		System.out.println("and its average weight is "+d.avgBreedWeight());
	}*/
	
	public static void main(String arg[]){
		
		Dog dog = new Yorkshire("Spike");
		System.out.println(dog.getName()+" says "+dog.speak());
		
		Dog L1 = new Labrador("Tommy", "Black");
		Dog Y1 = new Yorkshire("Jimmy");
		
		System.out.println("Labrador make sound as "+L1.speak());
		System.out.println("Yorkshire make sound as "+Y1.speak());
		
		System.out.println("Labrador has average breed weight is "+L1.avgBreedWeight());
		System.out.println("Yorkshire has average breed weight is "+Y1.avgBreedWeight());
	}
}