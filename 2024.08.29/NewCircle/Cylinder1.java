public class Cylinder1 extends Circle1{
	private double height;

	public Cylinder1(double height, double radius){
		super(radius);  //This called to the Circle(double r) constructor in the Circle class.
		this.height = height;
	}
	
	public double getHeight(){
		return height;
	}
	public double getVolume(){
		return super.getArea()*this.height;
	}
	
	//@Override
	public double getArea(){
		return (2*3.14*getRadius()*getRadius()+(2*3.14*getRadius()*height));
	}
	
	//@Override
	public String toString(){
		return ("Cylinder has [height of "+this.height+" and a radius of "+super.getRadius());
	}
}