import java.util.Scanner;

public class Exam {
	
	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);{
	System.out.println("Enter an intergar here");
	System.out.println("Is 5 and 6 Divisble by Your number?");
	
	//Enter an Integer
	
	int number = input.nextInt();
	
	if (number % 5 == 0 && number % 6 == 0) {;
		System.out.println(number + " Is Divisible by 5 and 6? True");}
	else
		System.out.println(number + "Is Divisible by 5 and 6? False");
	
	
	if (number % 5 == 0 || number % 6 == 0) {;
		System.out.println(number +" Is Divisible by 5 or 6? True");}
	else
		System.out.println(number + " Is Divisible by 5 or 6? False");
		

	if (number % 5 == 0 ^ number % 6 == 0) {;
		System.out.println(number +" Is Divisible by 5 or 6, but not both? True");}
	else
		System.out.println(number + " Is Divisible by 5 or 6, but not both? Fasle");
		

		// TODO Auto-generated method stub
	}
	}
	
}




