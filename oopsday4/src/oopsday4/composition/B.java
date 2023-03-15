package oopsday4.composition;

public class B extends A {
	public B()
	{
		//super();
		//not allowed -> System.out.println(("from B");
				super(10,20);//for constructor chaining
	}

	public int getY() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getX() {
		// TODO Auto-generated method stub
		return 0;
	}

}
