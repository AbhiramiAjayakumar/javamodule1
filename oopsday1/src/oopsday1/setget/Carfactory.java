package oopsday1.setget;

public class Carfactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Car bmw=new Car(); 
		
		bmw.setColor("Blue");
		bmw.setPrice(3000);
		bmw.setBrand("Maruti Swift");
		bmw.setModel("Dezire");
		
		System.out.println(bmw.getColor());
		System.out.println(bmw.getPrice());
		System.out.println(bmw.getBrand());
		System.out.println(bmw.getModel());
	
	
	
	bmw.setColor("Blue");
	bmw.setPrice(3000);
	bmw.setBrand("Maruti Swift");
	bmw.setModel("Dezire");
	System.out.println(bmw.getColor());
	System.out.println(bmw.getPrice());
	System.out.println(bmw.getBrand());
	System.out.println(bmw.getModel());}
   
}
