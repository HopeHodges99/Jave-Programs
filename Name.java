import java.util.Scanner;

public class Name {
	
	public static void main(String[] args) {
		
		System.out.println("hello");
		System.out.println("please enter your name here");
		Scanner scanner = new Scanner(System.in);
		
		String name=scanner.nextLine();
		System.out.println("Welcome" + name);
		
		System.out.println("Please enter your age");
Scanner scanner1 = new Scanner(System.in);
		float age=scanner1.nextFloat();
		if (age>6) 
		
		{System.out.println("You May Continue");}
		else if (age < 6) {System.out.println("Can Not Continue");}
		
		// TODO Auto-generated method stub

	}

}
