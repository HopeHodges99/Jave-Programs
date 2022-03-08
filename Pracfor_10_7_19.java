import java.util.Scanner;

public class Pracfor_10_7_19 {

		
		public static void main(String[] args) {
			
			Scanner in = new Scanner(System.in);

	        System.out.print("Enter the number of students: ");
	        int numberOfStudents = in.nextInt();
	        int[] scores = new int[4];

	        System.out.print("Enter " + numberOfStudents + " scores: ");
	        scores[0] = in.nextInt();
	        scores[1] = in.nextInt();
	        scores[2] = in.nextInt();
	        scores[3] = in.nextInt();

	        displayGrades(scores);
	    }

	    public static void displayGrades(int[] grades) {
	        int highScore = bestGrade(grades);
	        
	        for (int i = 0; i < grades.length; i++) {
	            System.out.printf("Student %d score is %d and grade is %s%n",
	                i, grades[i], assignLetterGrade(grades[i], highScore));
	        }
	    }

	    public static char assignLetterGrade(int grade, int highScore) {

	        if (highScore - grade <= 10)
	            return 'A';
	        else if (highScore - grade > 10 && highScore - grade <= 20)
	            return 'B';
	        else if (highScore - grade > 20 && highScore - grade <= 30)
	            return 'C';
	        else if (highScore - grade > 30 && highScore - grade <= 20)
	            return 'D';
	        else 
	            return 'F';
	    }

	    public static int bestGrade(int[] grades) {
	        int highScore = grades[0];

	        for (int grade : grades) {
	            if (grade > highScore)
	                highScore = grade;
	        }

	        return highScore;
	    }
	}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			//String[] months = {"January", "February", "March" , "April", "May" , "June", "July ", "August", "September", "October", "November", "December"};
		//System.out.println("Enter a Month");
		//Scanner input = new Scanner(System.in);
		//int monthNumber = input.nextInt();
	//System.out.println("The month is " + months[monthNumber - 1]);
		
	//	}
//}
			
			
public static void Int(String[] args) {
			
			
			 Scanner in = new Scanner(System.in);

	       int[] numbers = new int[10];
	    
	        System.out.print("Enter 10 number values: ");

	        for (int i = 0; i < numbers.length; i++) {
	            numbers[i] = in.nextInt();
	        }

	        System.out.println("Numbers in reverse order");
	        for (int i = numbers.length - 1; i >= 0; i--) {
	            System.out.printf( "%d", numbers[i]);
	        }
	        
	    }


	}
	        
	    