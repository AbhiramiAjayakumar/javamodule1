package oopsday1.setgetconstructor;



public class Carfactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			Car c= new Car();
			
			
			System.out.println(c.getColor());
			
		
			Car bmw =new Car("yellow",30000,"Toyoto","Innova");
			
			System.out.println(c.getColor());
			
			System.out.println(bmw.hashCode());
			System.out.println(Integer.toHexString(bmw.hashCode()));
			System.out.println(bmw);
		
	
			
		
			Car jag =new Car("yellow",30000,"Toyoto","Innova");
			
			System.out.println(jag.hashCode());
			System.out.println(Integer.toHexString(jag.hashCode()));
			System.out.println(jag);
		
		
		
		}
	   
	}

	
	

