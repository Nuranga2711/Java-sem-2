abstract public class Monster{
	private String name;
	
	public Monster(String name){
		this.name = name;
	}
	
	// We don't write body for abstract methods. Because it is a template.
	abstract public String attack(); 
}