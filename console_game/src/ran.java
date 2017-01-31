import javax.swing.*;

public class ran {

	public static void main(String[] args) {
		  JFrame frame = new JFrame("Test");
		  frame.setVisible(true);
		  frame.setSize(500,200);
		  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		  JPanel panel = new JPanel();
		  frame.add(panel);
		  JButton button = new JButton("hello agin1");
		  panel.add(button);

		  JButton button2 = new JButton("hello agin2");
		  panel.add(button2);
		}
		
	}	



