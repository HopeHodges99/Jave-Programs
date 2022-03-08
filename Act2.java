import java.util.HashSet;
import java.util.Scanner;

public class Act2 {

	public static void main (String[] args) 
	{ 
	    String a = l("dSSSllss"); 
	   for (int i = 0; i <a.length(); i++) {
	   for (int j = i + 1; j <a.length(); j++) {
	 //  for (int h = i +j + 2; h <a.length(); h++) {
			   
	   if (a.charAt(i)==a.charAt(j) ) {
		   System.out.println(a.charAt(j));
		   System.exit(12);
	      }
	     }
	    }
	System.out.println ("None");     	
	}
	
//}
public static String l(String s) {
	 return s.toLowerCase();
}
}