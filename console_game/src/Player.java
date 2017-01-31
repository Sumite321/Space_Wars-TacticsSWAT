import java.util.Random;


public class Player {
	public static int health = 100;
	public static int strike;
	public static boolean turn;
	public static void main(String[] args) {
	}

	
	
	public static int attack(){
		Random r = new Random();
		int chance = r.nextInt(100); // random int from 1 to 100
		if (chance>70){
			strike = r.nextInt(15)+11; // min of 11 max of 15
		}
		else{
			strike = r.nextInt(8)+1; // min of 1 max of 8
		}
		health = health - strike;
		return strike ;
	}
		
	
	// returns health after the attack
	public int getHealth(){
		return health;
	}
	
	public static boolean passTurn(){
		return turn = true;
		
	}
}

