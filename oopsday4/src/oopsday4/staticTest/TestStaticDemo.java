package oopsday4.staticTest;

public class TestStaticDemo {

	public static void main(String[] args) {
		/*StaticDemo d= new StaticDemo();
		StaticDemo d1=new StaticDemo();
		d.a=20;
		System.out.println(d1.a);
		d1.a++;
		System.out.println(d.a);*/
		System.out.println(StaticDemo.a);
		StaticDemo d= new StaticDemo();
		System.out.println(d.a);
		StaticDemo d1= new StaticDemo();
		System.out.println(d1.a);
		StaticDemo d2= new StaticDemo();
		System.out.println(d2.a);
		System.out.println(StaticDemo.a);
	}

}
