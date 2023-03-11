package oopsday1;

public class Carfactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	;
	
		Car jag=new Car();
		
		jag.color="Blue";
		jag.price=30000;
		jag.brand="Maruti Swift";
		jag.model="Dezire";
		
	  
	System.out.println(jag.color); 
	System.out.println(jag.price);
	System.out.println(jag.brand);
	System.out.println(jag.model);
	
	Car bmw=new Car();
	bmw.color="White";
	bmw.price=75000;
	bmw.model="Luxury SUV";
	
	System.out.println(bmw.color);
	System.out.println(bmw.price);
	System.out.println(bmw.model);	
	
	
	}
   
}
