
import javax.swing.*; // for the swing content
import java.awt.event.*; // for the button press event
import java.util.*;



public class Game {
	public static String textFieldValue;
	public static JFrame userPass;
	public static String health;
	public static String getturn;
	public static boolean turnV;
	public static int [] actionList;
	
	public static void main(String[] args) {
		actionList = new int[2];
		JFrame win = new JFrame("Conshot");
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		win.pack();
		win.setVisible(true);
		win.setSize(500,500);
		win.setResizable(true);
		// panel created
		JPanel panel = new JPanel();
		win.add(panel);
		
		// add components to the panel
		placeComponents(panel);
		
		// windows visible
		win.setVisible(true);

        
		
	}
		public static void placeComponents(JPanel panel){
			
			panel.setLayout(null);
			
			//Label to be created
			JLabel userLabel = new JLabel("Soldier name - ");
			userLabel.setBounds(10, 20, 80, 25);
			panel.add(userLabel);
			
			JLabel userPass = new JLabel("Current health");
			userPass.setBounds(10, 50, 90, 25);
			panel.add(userPass);
			
			JLabel damageText = new JLabel("Damage");
	        damageText.setBounds(10,80,80,25);
	        panel.add(damageText);
	        
	        JLabel userHealth = new JLabel("100");
			userHealth.setBounds(100, 50, 80, 25);
			panel.add(userHealth);
			
			JLabel damageInt = new JLabel("00");
	        damageInt.setBounds(100,80,80,25);
	        panel.add(damageInt);
	
	        JButton button = new JButton("Attack");
			button.setBounds(10,200,100,40);
			panel.add(button);
			
			JLabel turn = new JLabel("Awaiting player turn...");
			turn.setBounds(10, 110, 160, 25);
			panel.add(turn);
			

			
			JLabel compHealth = new JLabel("Enemy health");
			compHealth.setBounds(10, 140, 90, 25);
			panel.add(compHealth);
			
	        
			
			// create text field to enter username
			JTextField userText = new JTextField(20);
			userText.setBounds(100, 20, 165, 25);
			panel.add(userText);
			
	        
	        // update the panel
	        damageText.repaint();
			userText.repaint();
			turn.repaint();
			
	
			
	        
	        // action listener to text field
		userText.addActionListener(new ActionListener(){
			   public void actionPerformed(ActionEvent e){
				  textFieldValue = userText.getText();
				  gameplay();
			   }
			});
		
		
		// action listener to button
		button.addActionListener(new ActionListener(){
			   public void actionPerformed(ActionEvent e){
				   int damage= Player.attack();
				   int health = Player.health;
				   userHealth.setText(String.valueOf(health));
				   damageInt.setText(String.valueOf(damage));
				   turnV = Player.passTurn(); //false in 
				   getTurn();
				   turn.setText(getturn);
				   Computer.attack();
			   }
		});
		} // end of placeComponents method
		
        
		
		
		public static void gameplay(){
			
			System.out.println("Welcome to the game " + textFieldValue + getturn + turnV);
		
		} // end of gameplay()
		
		public static void getTurn(){
				if (turnV = true) {
					getturn = "Awaiting enemy attack...";
				}
				//else if(Computer.turn == false) {
					//getturn = "Awaiting player attack...";
				//}
				
				
			}// end of getTurn()
	
		
		
	} //end of class
	


// LOG
// next lesson learn how to make list
// add health and damage to list
// override each time
// assign list to JSpinner
		
