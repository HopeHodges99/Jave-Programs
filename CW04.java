import java.util.Scanner; 
public class CW04 {

	public static void main(String[] args) {
		word();
		letter();
		
		//answer();
	}
	//Entering A Word
        public static void word() {
		} {
	Scanner input = new Scanner(System.in);
	System.out.println(" Enter a Word ");
	String word = input.next(); }
	
	//Entering A Letter
	 public static void letter() {
	} {
		 Scanner input1 = new Scanner(System.in);
	     System.out.println("Enter A Letter" );
		 char x = input1.next().charAt(0);
		 char count = x ;
		 System.out.println( " The letter " +  x + " was found this many times: " + count);
		}
	//Counting the Occurrence 
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

	 //The Answer
   //  public static void answer() {
    //	 Scanner input1 = null;
	//	char h = input1.next().charAt(0);
 	  //  int count = count ( null, h);;
 	    //System.out.println( " The letter " +  h + " was found this many times: " + count);

}
			
		//}

