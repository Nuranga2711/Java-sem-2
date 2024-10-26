public class Yorkshire extends Dog{
	
	private int breedWeight = 75;
	
	public Yorkshire(String name){
		super(name);
	}
	
	public String getName(){
		return super.getName();
	}
	
	public String speak(){
		return "Wooff...!";
	}
	
	public String toString(){
		return getName();
	}
	
	public int avgBreedWeight(){
		return breedWeight;
	}
}