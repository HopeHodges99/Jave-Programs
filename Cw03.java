import java.util.Scanner;

public class Cw03 {

	public static void main(String[] args) {
      length();
     }
     public static void length() {
	 //Enter a word
	 Scanner input = new Scanner(System.in);
	    System.out.print(" Enter a word ");
	    String word = input.next();
	    //Enter a letter
	    System.out.print(" Enter a letter ");
	    char h = input.next().charAt(0);
	    int count = count (word, h);;
	    System.out.println( " The letter " +  h + " was found this many times: " + count);
 }
     	
     
     public static int count(String str, char h) {
        	 if (str.length() == 0) {
		      return 0;
		}
		 int count = 0;
		    if (str.charAt(0) == h) {
		      count ++;
        }
		    return count + count(str.substring(1), h);
		  
}

}
