
 class Red_Vs_Blue_Char {

    String name;
	String color;
	String team;
	String saying;
	
	Red_Vs_Blue_Char (String n, String c, String t, String s) {
	  	  this.name = n;
	  	     this.color = c;
	  	     this.team = t;
	  	     this.saying = s;
	}
	void intro() {
		System.out.println(" My name is "+ name + ". " +  "My armor color is " + color +". " +  "My team is " + team  +  "."  +  saying );
	

	}

}
