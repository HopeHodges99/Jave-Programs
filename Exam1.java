import java.util.Scanner;
public class Exam1 {
	 public static void main(String[] args){
		 length();
	 }
		 
		 public static void length() {
		 Scanner input = new Scanner(System.in);
		    System.out.print(" Enter a word ");
		    String word = input.next();
		    System.out.print(" Enter a letter ");
		    char c = input.next().charAt(0);
		    int count = count(word, c);
		    ;
		    System.out.println(c + " Occurs " + count + " Times ");
		  }

		  public static int count(String str, char a) {
		    if (str.length() == 0) {
		      return 0;
		    }
		    int count = 0;
		    if (str.charAt(0) == a) {
		      count++;
		    }
		    return count + count(str.substring(1), a);
		  }


		}


