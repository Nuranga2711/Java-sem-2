public class TestRectangleAndCircle{
	public static void main(String args[]){
		Rectangle R1 = new Rectangle();
		Rectangle R2 = new Rectangle(50,10);
		Rectangle R3 = new Rectangle(50,10,"Black",false);
		
		Circle C1 = new Circle();
		Circle C2 = new Circle(5);
		Circle C3 = new Circle(5,"Green",true);
		
		System.out.println(R1);
		System.out.println(R2);
		System.out.println(R3);
		System.out.println("Area of R1 = "+R1.getArea());
		
		System.out.println();
		
		System.out.println(C1);
		System.out.println(C2);
		System.out.println(C3);
		System.out.println("Perimeter of C2 = "+C2.getPerimeter());
	}
}