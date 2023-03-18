package lsp;

public class Square implements Shape {

	private int size;

	
	public Square(int size) {
	this.size=size;
}
	public int getArea()
	{
		return this.size*this.size;
	}

}


