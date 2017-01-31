import java.util.Random;

public class Computer{
	private static int health = 100;
	private static int strike;
	public static boolean turn;
	public static void main(String[] args) {
		
	}
	
	
	public static int attack(){
		double chance;
		Random r = new Random();
		chance = r.nextInt(100); // random in from 1 to 100
		if (chance>70){
			strike=r.nextInt(15) + 11; // min of 11 max of 15
			//attack = System.out.println("Critical: Inflicted"+strike+"damage");
		}else{
				strike=r.nextInt(8) + 1; // min of 1 max of 8
				//attack = System.out.println("Normal Attack : "+strike);
		}
		health = health - strike;	
		return strike;
			
		} // end of attack()
	public int getHealth(){
		return health;
	
	}
	public boolean passTurn(){
		turn = true;
		return turn;
	}
		
	}	// end of class
	
	
	
	
	


