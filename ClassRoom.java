
public class ClassRoom {
	public static void main(String[] args ) {
		System.out.println("Hope");
		
		student Hope = new student (9,28);
		student Spencer = new student (18,28);
		Hope.method(10);
	}
}
class student{
    int hc;
private int hs;
    
 student( int c, int s) {
	   this.hc=c;
	   this.hs=s;
 }
				
void method(int x) {
	if ((x>0) && (x<=20)) {
		this.hs=x;
	System.out.println(" The new setting for Hs is " + this.hs);}
    else
	System.out.println("Input is unacceptable");
	             }

    
 
 double hsTohc() {
    	
    	return this.hs/this.hc;
   }
    
}





