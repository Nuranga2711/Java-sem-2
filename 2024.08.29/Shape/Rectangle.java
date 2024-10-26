public class Rectangle extends Shape{
	private int length;
	private int width;
	
	public Rectangle(int length, int width, String color){
		super(color);
		this.length = length;
		this.width = width;
	}
	
	public double getArea(){
		return this.length*this.width;
	}
	
	public String toString(){
		return "This Rectangle Area is: "+getArea();
	}
}