import java.util.Scanner;
public class Cw_03 {

	public static void main(String[] args) {
//Enter String like 1-800-flowers
		Scanner word = new Scanner(System.in); 

		System.out.print("Enter a string");
		String string = word.nextLine();
		
	for (int i = 0; i < string.length(); i++) {
	if (Character.isLetter(string.charAt(i)))
				System.out.print(getNumbers(Character.toUpperCase(string.charAt(i))));
	else
	          System.out.print(string.charAt(i));
		}
           System.out.println();
	}
	//Returns character as a number
	public static int getNumbers(char uppercaseLetter) {
		if (uppercaseLetter >= 'T')
			return 8;
		else if (uppercaseLetter >= 'Q')
			return 7;
		else if (uppercaseLetter >= 'P')
			return 6;
		else if (uppercaseLetter >= 'K')
			return 5;
		else if (uppercaseLetter >= 'G')
			return 4;
		else if (uppercaseLetter >= 'D')
			return 3;
		else if (uppercaseLetter >= 'A')
			return 2;
		else 
			return 1;
	}


	}


