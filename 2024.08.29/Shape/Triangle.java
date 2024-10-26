public class Triangle extends Shape{
	private int base;
	private int height;
	
	public Triangle(int base, int height, String color){
		super(color);
		this.base = base;
		this.height = height;
	}
	
	public double getArea(){
		return this.base*this.height/2;
	}
	
	public String toString(){
		return "This Trangle Area is: "+getArea();
	}
}