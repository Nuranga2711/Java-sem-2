public class TestCircle {
    public static void main(String[] args) {
        Circle C1 = new Circle(1.1,"Blue");
        System.out.println(C1);

        System.out.println("Radius of C1 is "+ C1.getRadius());
        System.out.println("Colour of C1 is "+ C1.getColour());
        System.out.println(); 

      
        Circle C2 = new Circle(2.2);
        System.out.println(C2);

        System.out.println("Radius of C2 is "+ C2.getRadius()); 
        System.out.println("Colour of C2 is "+ C2.getColour()); 
        System.out.println(); 
        
        Circle C3 = new Circle();
        System.out.println(C3);

        System.out.println("Radius of C3 is "+ C3.getRadius());
        System.out.println("Colour of C3 is "+ C3.getColour());

        C2.setRadius(3.3);
        C2.setColour("Green");

        System.out.println(); 
        System.out.println("New Radius of C2 is "+ C2.getRadius()); 
        System.out.println("New Colour of C2 is "+ C2.getColour()); 
    }
}
