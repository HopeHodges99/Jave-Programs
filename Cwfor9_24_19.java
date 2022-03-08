import java.util.Scanner;
public class Cwfor9_24_19 {
	
	public static void main(String[] args) {
		sayHello("Hope");
		int i = 123;
		int j =8;
		int k = max(i, j);
		int h = min(i,j);
		System.out.println(" The minium of " + i + " and " + j + " is " + h);
		System.out.println(" The maxium of " + i + " and " + j + " is " + k);
		
		int result = square(5) ;
			System.out.println(result);
		}
// Name
 static void sayHello(String name) {
	System.out.println("Hello, " + name);
}
 //Max
public static int max( int num1, int num2) {
	int result;
		if (num1 > num2)
			result = num1;
		else
			result = num2;
		return result;
		
}
//Min
public static int min( int num1, int num2) {
	int result;
		if (num1 < num2)
			result = num1;
		else
			result = num2;
		return result;

	
		}
//Square
public static int square(int x) {
	return x * x;
}
	}
