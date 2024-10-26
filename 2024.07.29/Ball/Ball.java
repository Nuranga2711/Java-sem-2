public class Ball{
	// variables
	private double x;
	private double y;
	private double xStep;
	private double yStep;
	
	//constructor
	public Ball(double x, double y,double xStep, double yStep){
		this.x = x;
		this.y = y;
		this.xStep = xStep;
		this.yStep = yStep;
	}
	
	//get methods
	public double getX(){
		return x;
	}
	
	public double getY(){
		return y;
	}
	
	public double getXStep(){
		return xStep;
	}
	
	public double getYStep(){
		return yStep;
	}
	
	//set methods
	public void setX(double x){
		this.x = x;
	}
	
	public void setY(double y){
		this.y = y;
	}
		
	public void setXStep(double xStep){
		this.xStep = xStep;
	}
	
	public void setYStep(double yStep){
		this.yStep = yStep;
	}
	
	public void setXY(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public void setXYStep(double xStep, double yStep){
		this.xStep = xStep;
		this.yStep = yStep;
	}
	
	//toString method
	public String toString(){
		return ("x : " + this.x + " / y : " + this.y + " | xStep : " + this.xStep + " / yStep : " + this.yStep );
	}
	
	//moveBall method
	public Ball moveBall(){
		x += xStep;
		y += yStep;
		
		System.out.println("New location : ");
		return this;
	}
}