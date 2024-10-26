import java.util.Scanner;
public class ComparePlayers{
	public static void main(String args[]){
		
		Player player1 = new Player();
		Player player2 = new Player();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter player1 details:");
		player1.readPlayer();
		System.out.println();
		
		System.out.println("Enter player2 details:");
		player2.readPlayer();
		System.out.println();
		
		if(player1.equals(player2))
			System.out.println("Same player");
		else
			System.out.println("Different players");
		
	}
}