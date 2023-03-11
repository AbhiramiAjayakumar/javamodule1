package oopsday1.withbusinessmethods;

public class Carfactory {

	public static void main(String[] args) {
		
		Car jag=new Car("yellow",30000,"Toyoto","Innova");
		jag.start();
		jag.changeGear(1);;
		jag.stop();
		
		Car bmw=new Car("red",30000,"Swift","131");
		bmw.start();
		bmw.changeGear(1);;
		bmw.stop();
	
	}
   
}
