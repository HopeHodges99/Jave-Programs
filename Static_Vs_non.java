
public class Static_Vs_non {

	public static void main(String[] args) {
		books b1=new books(250 ,"Hunger Games" , "English");
		books b2=new books(300, "Game of Thrones", "English");
              b1.intro();
              b2.intro();
		//books.intro();
              
	}
}
class books {               
	static int noPa;
	static String title;
  static  String language;
	
books (int p, String t, String l) {
	   noPa = p;
	   title = t;
	   language= l;
	

	  }
static void intro() {
	 System.out.println("I have a "+ noPa+ " Pages " +" My name is " + title + " I am writtne in " + language);
 }
         
    
	}
 
