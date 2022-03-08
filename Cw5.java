
import java.util.Scanner;

public class Cw5 {
public static void main(int[] args) {
		cities();
}

	public static void cities() {
		{
		{
		int i, j;
		String temp;
		Scanner input = new Scanner(System. in );
		String cities[] = new String[10];
		     System. out .print("Enter 10 Cities ");
		     for (i=0; i<10; i++)
		{
		cities[i] = input.nextLine();
		}
 for (i=0; i<10; i++)
		{
 for (j=1; j<10; j++)
		{
		if (cities[j-1].compareTo(cities[j])>0)
		{
		temp=cities[j-1];
		cities[j-1]=cities[j];
		cities[j]=temp;
		}
		System. out .println("The Cities in Acending Order Are");
		for (i=0;i<10;i++)
		{
		System. out .println(cities[i]);
		}
		}
		}
		}
		}
		}
		}
			        