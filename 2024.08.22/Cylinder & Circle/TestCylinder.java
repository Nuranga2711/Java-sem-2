public class TestCylinder{
	public static void main(String args[]){
		Cylinder CY1 = new Cylinder();
		Cylinder CY2 = new Cylinder(10);
		Cylinder CY3 = new Cylinder(20,5);
		Cylinder CY4 = new Cylinder(13,4,"Black");
		
		System.out.println(CY1);
		System.out.println(CY2.getArea());
		System.out.println(CY3.getArea());
		System.out.println(CY4.getArea());
	}
}