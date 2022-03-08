import java.util.Scanner;


public class Prac3 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a city");
		String city1= input.nextLine();
		System.out.println("Enter a city");
		String city2= input.nextLine();
		
		
		
		if (city2.compareTo(city1) < 0 )
		System.out.println(" The Cities in alphabetical order are" + " " + city1 + " " + city2);
		else
			System.out.println(" The Cities in alphabetical order are" + " " + city2 + " " + city1);
		
		
		
	
	
		 }
	 }


		// TODO Auto-generated method stub

	


