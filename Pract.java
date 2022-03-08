import java.util.Scanner;

public class Pract {
	public static void main(String[] args) {
		//age part
		System.out.println("Are You Younger Than 6");
		Scanner scanner = new Scanner(System.in);
			float age=scanner.nextFloat();
			if (age>=1) 
			{System.out.println("You May Continue");}
			else if (age < 0) {System.out.println("Can Not Continue");}
		
		//Completing Book Part
			System.out.println("Have You Compleated The Book?");
		Scanner scanner1 = new Scanner(System.in);
				float Yes=scanner1.nextFloat();
				//int Yes = 1;
				if (Yes >= 1) 
				{System.out.println("You May Continue");}
				else if (Yes <= 0) {System.out.println("Can Not Continue");}
		
		 //Paying For Book
		System.out.println("Have You Paid For The Book?");
		Scanner scanner2 = new Scanner(System.in);
				float paid=scanner.nextFloat();
				if (paid >= 1) 
				{System.out.println("You Are Done Thank You");}
				else if (paid <= 0) {System.out.println("You Are Done Thank You");}
	}

}
