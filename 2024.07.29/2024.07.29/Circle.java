//In this java program we are going to write the Circle class
public class Circle{
    private double radius;
    private String colour;
    

//we now write the constrictors for the Circle
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

public double getRadius(){
    return radius;
}
public String getColour(){
    return colour;
}
public double getArea(){
    return radius*radius*3.14;
}

}
