package oopsday4.staticTest;

public class TestStaticDemo2 {
	static int a=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticDemo2 d1 =new StaticDemo2();
		d1.method();
		
		StaticDemo2.method();
		
		System.out.println(a);
		
		
	}

}
