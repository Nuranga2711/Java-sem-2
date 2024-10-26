import java.util.Scanner;
public class Player{
	private String name;
	private String team;
	private int jerseyNumber;
	
	public void readPlayer(){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Name: ");
		name = scan.nextLine();
		
		System.out.print("Team: ");
		team = scan.nextLine();
		
		System.out.print("Jersey number: ");
		jerseyNumber = scan.nextInt();
	}
	
	public boolean equals(Player  p){
			return this.team.equals(p.team) && this.jerseyNumber == p.jerseyNumber ;
	}
	
	/*public boolean equals(Player p1, Player p2){
		p1 = new Player();
		p2 = new Player();
		
	}*/
	
}