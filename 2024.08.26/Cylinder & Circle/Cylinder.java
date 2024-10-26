public class Cylinder extends Circle{
	private double height;
	//We did not define radius and colour here. But they are available from circle class because of extends keyword
	
	//Constructors
	public Cylinder(){
		super(); //This called to the Circle() constructor in the Circle class.
		this.height = 1.0;
	}
	
	public Cylinder(double height){
		super();  //This called to the Circle() constructor in the Circle class.
		this.height = height;
	}
	
	public Cylinder(double height, double radius){
		super(radius);  //This called to the Circle(double r) constructor in the Circle class.
		this.height = height;
	}
	
	public Cylinder(double height, double radius, String colour){
		super(radius, colour);  //This called to the Circle(double r, String c) constructor in the Circle class.
		this.height = height;
	}
	
	//get methods
	public double getHeight(){
		return height;
	}
	public double getVolume(){
		return getArea()*height;
	}
	
	//set method
	public void setHeight(double height){
		this.height = height;
	}
	
	//Method Override
	@Override
	public double getArea(){
		return 2*3.14*super.getRadius()*super.getRadius()+(2*3.14*super.getRadius()*this.height);
	}
	
	//toString method
	public String toString(){
		return ("Properties of cylinder CY1 is" +getRadius());
	}
}