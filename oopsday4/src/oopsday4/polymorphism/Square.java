package oopsday4.polymorphism;

public class Square extends Shape {
	
	private double side;

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public Square(double side) {
		super();
		this.side = side;
	}

	public Square() {
		super();
	}

	public double area()
	{
		return this.side*this.side;
	}
}
