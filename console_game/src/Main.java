import java.util.Scanner;




public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to the Game \nBe prepared for the first battle");
		
		Player Sumite = new Player();
		Scanner key = new Scanner(System.in);
		System.out.println("Press A to attack");
		String key1 = key.next();
		String upper = key1.toUpperCase();
		if (upper.equals("A")) 
		{
			Game.action("Player");
		}
		key.close();
		
	//player or computer turn using method action(turn)
	
		
		

	}

}
