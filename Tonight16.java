import java.util.Scanner;

public class Tonight16 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("Enter a word");
		String w = input.nextLine();
	    String w2 = "";
	       
	     
	     for (int i = 0; i < w.length(); i++) {
	        Boolean repeat = false;
	            for (int j = 0; j < w2.length(); j++) {
	                if (w.charAt(i) == w2.charAt(j)) {
	                    repeat = true;
	                    break; 
	                }
	            }
	            if (repeat == false) {
	                w2 = w2.concat(String.valueOf(w.charAt(i)));
	            }
	        }
	        System.out.println(w2);
	    }
	}