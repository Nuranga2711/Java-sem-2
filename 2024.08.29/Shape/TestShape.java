public class TestShape{
	public static void main(String args[]){
		Rectangle R1 = new Rectangle(50,10,"Black");
		Triangle T1 = new Triangle(5,10,"Red");
		Shape S1 = new Shape("Blue");
		
		System.out.println(R1);
		
		System.out.println();
		
		System.out.println(T1);
		
		System.out.println();
		
		System.out.println(S1.getArea());
	}
}