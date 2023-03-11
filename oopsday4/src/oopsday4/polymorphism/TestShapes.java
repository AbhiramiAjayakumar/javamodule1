package oopsday4.polymorphism;

public class TestShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s=new Circle(3);
		double result=s.area();
		System.out.println(result);
		
		 s=new Rectangle(5,4);
		  result=s.area();
		 System.out.println(result);
		 
		 s=new Square(3);
		  result=s.area();
		 System.out.println(result);
	}

}
