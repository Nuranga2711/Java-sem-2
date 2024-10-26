public class Circle1{
    private double radius;

    public Circle1(double radius){
        this.radius = radius;
    }
	
    public double getRadius(){
        return this.radius;
    }

    public double getArea(){
        return radius*radius*3.14;
    }

    public double findCircumference() {
        return 2 * 3.14 * radius;
    }
    
    public String toString() {
        return ("Circles Radius is " + this.radius);
    }

}
