public class CW6 {

	public static void main(String[] args) {
		People p1 = new People(" Hope ", " Happy ", " A Punchbug ");
		Cars c1 = new Cars (" Volkswagon ", " Yellow ", 2007);
		People p2 = new People( "Spencer", " Enthusiastic ", "A Ford Ranger");
		Cars c2 = new Cars (" Ford ", " Green ", 1994);
		People p3 = new People( "Payne", " Cheerful ", " A SUV ");
		Cars c3 = new Cars (" Kia ", "  Red ", 2008); 
		
	p1.introduceSelf();	
	c1.introduceCar();	
	p1.carSlogan();
	System.out.println(" ");
	p2.introduceSelf();
	c2.introduceCar();
	System.out.println(" ");
	p3.introduceSelf();
	c3.introduceCar();
}
}