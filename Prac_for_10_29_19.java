package Classroom;
//public class Prac_for_10_29_19 {
	class A 
	{ 
	   void display() 
	    { 
	        System.out.println("GeeksforGeeks"); 
	    } 
	} 
	  
	class B 
	{ 
	   public static void main(String args[]) 
	      { 
	          A obj = new A(); 
	          //trying to access private method of another class 
	          obj.display(); 
	      } 
	} 

