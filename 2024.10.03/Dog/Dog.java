abstract public class Dog{
	private String name;
	
	public Dog(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String speak(){
		return ("Make sound BOW..WOW...!");
	}
	
	public abstract int avgBreedWeight();
	
	/*public String toString(){
		return getName();
	}*/
	
}