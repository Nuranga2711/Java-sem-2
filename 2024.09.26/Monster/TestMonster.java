public class TestMonster{
	public static void main(String args[])
	{
		Monster m1 = new FireMonster("r2u2");
		Monster m2 = new WaterMonster("u2r2");
		Monster m3 = new StoneMonster("r2r2");
	
		System.out.println(m1.attack());
		System.out.println(m2.attack());
		System.out.println(m3.attack());
	
		m1 = new StoneMonster("a2b2");
		System.out.println(m1.attack());
	
		// Also we can't create instance for monster. Because it is tamplate. Not a complete class !
		
		/*m3 = new Monster("b2a2");
		System.out.println(m3.attack());*/
	}
}