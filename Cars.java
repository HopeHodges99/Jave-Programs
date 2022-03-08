public class Cars {
	String brand;
    String color;
    int year; 
    
  
   
    public Cars(String b, String c, int y) {
  	  this.brand = b;
  	     this.color = c;
  	     this.year = y;
	}
	
    void introduceCar() {
          System.out.println( " My brand of car is " + this.brand + " The color of my car is " + this.color + " The year my car was made was " + this.year);

		
	}
	void carSlogan() {
		System.out.println(" The Volkswagon Beetle is the Greatest Thing German engineering has ever produced ");
	}
  }

