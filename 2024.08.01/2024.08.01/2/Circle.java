//In this java program we are going to write the Circle class
public class Circle{
    private double radius;
    private String colour;
    

    //we now write the constrictors for the Circle
    // Method Overloading

    public Circle(){
        radius=1.0;
        colour="Blue";
    }
    public Circle(double r){
        radius = r;
        colour="Blue";
    }

    public Circle(double r, String c){
        radius=r;
        colour=c;
    }
    
    // the void keyword indicates that the method doesn't return any value.
    public void setRadius(double radius){
        this.radius=radius;
    }

    public void setColour(String colour){
        this.colour=colour;
    }

    public double getRadius(){
        return radius;
    }

    public String getColour(){
        return colour;
    }

    public double findArea(){
        return radius*radius*3.14;
    }

    public double findCircumference(){
        return 2*3.14*radius;
    }

}
