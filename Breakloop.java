import java.util.Scanner;

public class Breakloop {
	  public static void main(String args[]) {
			int i,j;
			 outer: for(i = 1; i <=9; i++)	{
				   
				for(j = 1; j<= 9; j++) {
					   
				if(i * j >=50){
							System.out.print(i*j); 
					break outer;
				
						}
					}	
				
				//System.exit(0);	
				}
			}
	}
