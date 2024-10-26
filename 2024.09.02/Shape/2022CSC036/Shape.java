public class Shape{
	private String color = "red";
	private boolean filled = true;
	
	public Shape(){};
	
	public Shape(String color, boolean filled){
		this.color = color;
		this.filled = filled;
	}
	
	public String getColor(){
		return this.color;
	}
	public void setColor(String color){
		this.color = color;
	}
	
	//Here sice this is boolean, no need to write getFilled.
	public boolean isFilled(){
		return this.filled;
	}
	public void setFilled(boolean filled){
		this.filled = filled;
	}
	
	//Here we did not use "@Override" because this is the super/parent class.
	public String toString(){
		return "Shape[color= "+color+", Filled= "+filled+"]";
	}
}