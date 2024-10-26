public class Cylinder1{
	private double height;

	public Cylinder(double height, double radius){
		super(radius);  //This called to the Circle(double r) constructor in the Circle class.
		this.height = height;
	}
	
	public double getHeight(){
		return height;
	}
	public double getVolume(){
		return super.getArea()*this.height;
	}
	
	public void setHeight(double height){
		this.height = height;
	}
	
	public double getArea(){
		return 2*3.14*super.getRadius()*super.getRadius()*height);
	}
	
	@Override
	//toString method
	public String toString(){
		return ("Cylinder has [height of"+this.height+"and a radius of "+super.getRadius());
	}
}