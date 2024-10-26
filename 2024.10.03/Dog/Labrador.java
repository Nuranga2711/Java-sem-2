public class Labrador extends Dog {
	
	private String colour;
	private int breedWeight = 100;

	
	public Labrador(String name, String colour){
		super(name);
		this.colour = colour;
	}
	
	public String getName(){
		return super.getName();
	}
	
	public String getColour(){
		return colour;
	}
	
	public String speak(){
		return "RRRow...!";
	}
	
	public String toString(){
		return getName();
	}
	
	@Override
	public int avgBreedWeight(){
		return breedWeight;
	}
}