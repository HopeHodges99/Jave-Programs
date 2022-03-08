
public class GM_Ford {

	public static void main(String[] args) {

	PolyMorp Obj []= new PolyMorp [2];
	
; 
	Obj[0].brand = "Ford"; 
	Obj[0].type = "Truck";
	

	Obj[1]= new GM(); 
	Obj[1].brand = "GM"; 
	Obj[1].type = "SUV";
	
	for(int i=0; i<2; i++) {
		Obj[i].introduceSelf();
	}
	}

}
