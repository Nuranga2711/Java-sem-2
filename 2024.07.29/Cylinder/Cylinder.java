public class Cylinder extends Circle{
	private double height;
	
	//Constructors
	public Cylinder(){
		super();
		this.height = 1.0;
		System.out.println("Constructed a cylinder with Cylinder()");
	}
	
	public Cylinder(double height){
		super();
		this.height = height;
	}
	
	public Cylinder(double height, double radius){
		super(radius);
		this.height = height;
	}
	
	public Cylinder(double height, double radius, String colour){
		super(radius, colour);
		this.height = height;
	}
	
	//get methods
	public double getHeight(){
		return height;
	}
	public double getVolume(){
		return gerArea()*height;
	}
	
	//set method
	public void setHeight(double height){
		this.height = height;
	}
}