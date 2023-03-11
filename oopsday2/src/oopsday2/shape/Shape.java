package oopsday2.shape;

public class Shape implements ShapeIface {
	private double side;
	
	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public Shape(double side) {
		super();
		this.side = side;
		
	}
	public void area() {
	   System.out.println("area is "+(side*side*side*side));
		
	}
	
	
	
}
