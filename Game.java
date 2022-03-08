import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
public class Game {

	public static void main(String[] args) {
		//age part
				System.out.println("Have You Fed Izzy?");
				Scanner scanner = new Scanner(System.in);
					float yes=scanner.nextFloat();
					if (yes>=1) 
					{System.out.println("You May Continue");}
					else if (yes <= 0) {System.out.println("Go Feed Her");}
				
				//Completing Book Part
					System.out.println("Has She Been Walked?");
				Scanner scanner1 = new Scanner(System.in);
						float Yes=scanner1.nextFloat();
						//int Yes = 1;
						if (Yes >= 1) 
						{System.out.println("You May Continue");}
						else if (Yes <= 0) {System.out.println("Go Walk Her");}
				
				 //Paying For Book
				System.out.println("Does She Have a Blanket?");
				Scanner scanner2 = new Scanner(System.in);
						float paid=scanner.nextFloat();
						if (paid >= 1) 
						{System.out.println("Yay She Can Sleep!");}
						else if (paid <= 0) {System.out.println("Really?! Go Help Her!!!");}
						
						JFrame frame = new JFrame();
						  ImageIcon icon = new ImageIcon("Izzy.PNG.JPG");
						  JLabel label = new JLabel(icon);
						  frame.add(label);
						  frame.setDefaultCloseOperation
						         (JFrame.EXIT_ON_CLOSE);
						  frame.pack();
						  frame.setVisible(true);
			}

		

				
					
			
				
			
			
			
		}
	

	


