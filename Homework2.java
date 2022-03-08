import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner; 
public class Homework2
{ 
  public static void main(String[] args) throws Exception 
  { 
	  try {
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Type the name of the person you are looking for:");
	  String t =sc.nextLine();
	  
	  BufferedReader br =new BufferedReader(new FileReader("/Users/hopehodges/Desktop/"+t+".txt"));
	  Scanner scanner = new Scanner(br);
	  
	  
	  
    String st; 
    while  ((st = br.readLine()) != null) 
	    System.out.println(st); 
	  System.exit(0);
	  br.close();
	  
  } 
  catch (Exception e) { 
      System.err.println(e+ "File does not exist"); 
  } 
     
	  
  } 
  }
  
	
	 
