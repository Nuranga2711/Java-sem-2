public class TestCircle {
    public static void main(String[] args) {
        Circle C1 = new Circle(2.0,"Blue");
        System.out.println("Radius of C1 is "+ C1.getRadius());
        System.out.println("Colour of C1 is "+ C1.getColour());
      
        Circle C2 = new Circle(2.0);
        System.out.println("Radius of C2 is "+ C2.getRadius());
        System.out.println("Colour of C2 is "+ C2.getColour());
        
        Circle C3 = new Circle(3.785,"Pink");
        System.out.println("Radius of C3 is "+ C3.getRadius());
        System.out.println("Colour of C3 is "+ C3.getColour());
    }
}
