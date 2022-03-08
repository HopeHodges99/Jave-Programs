import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

public class Buffer {
	 public static void main(String[] args)throws Exception 
	  { 
	 
	  File file = new File("/Users/hopehodges/Desktop/John.txt"); 
	  
	  //add catch thing later on
	  BufferedReader br = new BufferedReader(new FileReader(file)); 
	  
	  String st; 
	  while ((st = br.readLine()) != null) 
	    System.out.println(st); 
	  
	  } 
	} 

