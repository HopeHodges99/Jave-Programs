import java.util.Scanner;
public class Exam01 {
	public static void main(String[] args) {
	for (int i=1; i<=5; i++) {
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		if (number1 < number2) {
			int temp = number1;
			number1 = number2;
			number2 = temp;
		}
		System.out.print("What is " + number1 + " + " + number2 + "?");
		Scanner number = new Scanner(System.in);
		
		int answer = number.nextInt();
		
		if (number1 + number2 == answer)
			System.out.println("You Are Correct");
		else 
			System.out.println("You Are Incorrect");
			
		
		}
	
	System.out.println("You Are Done");
		
	}
			
				
		
			}
		
		

		// TODO Auto-generated method stub
		
	
		
	



	

	


