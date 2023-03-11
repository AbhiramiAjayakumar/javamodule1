package oopsday4.polymorphism;

public class Circle extends Shape {
	
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public Circle() {
		super();
	}

	public double area()
	{
		return Math.PI*this.radius*this.radius;
	}
}
