import java.io.*; 
public class NewFile {
	public static void main(String[] args) {
	
	  
	  
	        try { 
	  
	            // Get the file 
	            File f = new File("C:\\Users\\mjasemiz\\Box Sync\\File Sync\\Desktop\\we.txt"); 
	  
	            // Create new file 
	            // if it does not exist 
	            if (f.createNewFile()) 
	                System.out.println("File created"); 
	            else
	                System.out.println("File already exists"); 
	        } 
	        catch (Exception e) { 
	            System.err.println(e); 
	        } 
	    } 
	} 

