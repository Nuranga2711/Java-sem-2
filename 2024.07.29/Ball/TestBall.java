public class TestBall{
	public static void main(String[] args){
		Ball B1 = new Ball(5, 10, 2, 4);
		
		System.out.println("x of Ball is : " + B1.getX());
		System.out.println("y of Ball is : " + B1.getY());
		System.out.println("xStep of Ball is : " + B1.getXStep());
		System.out.println("yStep of Ball is : " + B1.getYStep());
		
		System.out.println();
		
		System.out.println(B1);
		System.out.println(B1.moveBall());
		
		System.out.println();
		
		B1.setXY(1, 2);
		B1.setXYStep(3, 6);
		
		System.out.println(B1);
		System.out.println(B1.moveBall());
	}
}