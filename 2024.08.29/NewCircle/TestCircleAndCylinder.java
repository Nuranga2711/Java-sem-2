public class TestCircleAndCylinder{
	public static void main(String args[]){
		
		//sub class methods are not available here
		//here we create a circle. not cylinder
		Circle1 C11 = new Cylinder1(1.11,2.22);
		
		System.out.println(C11.getRadius());
		//System.out.println(C11.getHeight());
		//System.out.println(C11.getVolume());
		
		System.out.println(C11.toString());
		System.out.println(C11.getArea());
	}
}