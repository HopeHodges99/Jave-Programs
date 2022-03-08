import java.util.Scanner;
public class CW02 {
	

	public static void main(String[] args) {
		for (int i=1; i<=4; i++) {
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		if (number1 < number2) {
			int temp = number1;
			number1 = number2;
			number2 = temp;
		}
		System.out.print("What is" + number1 + " +" + number2 + "?");
		Scanner number = new Scanner(System.in);
		int answer = number.nextInt();
		
		if (number1 + number2 == answer)
			System.out.println("You Are Correct Continue");
		else { 
			System.out.println("Your Answer Is Wrong");	
			
			int number3 = (int)(Math.random() * 10);
			int number4 = (int)(Math.random() * 10);
			if (number3 < number4) {
				int temp = number3;
				number3 = number4;
				number4 = temp;
			
			System.out.print("What is" + number1 + " +" + number2 + "?");
			Scanner num = new Scanner(System.in);
			int answer1 = number.nextInt();}
			
			if (number1 + number2 == answer)
				System.out.println("You Are Done");
			else { 
				System.out.println("Your Answer Is Wrong");
				
			
				
		
			}
		
		}
		}
	}
}
		
		// Basically 90% done just needs a pass

	



