package lsp;

public class Lspdemo {
	public void CalculateArea(Shape s)
	{
		System.out.println(s.getArea());
		
	}

	public static void main(String[] args) {
		Lspdemo lsp=new Lspdemo();
		lsp.CalculateArea(new Rectangle(1,4));
		lsp.CalculateArea(new Square(5));
		
		
	}

}
