import java.util.Random;

public class Homework3 {

	public static void main(String[] args) {
		Random random=new Random(1000);
		System.out.println("The Random Numbers Are" );
		for (int i=0; i<50; i++)
			System.out.println(random.nextInt(100));

		
	}

}
