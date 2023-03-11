package testlambdas;

@FunctionalInterface
interface Shape {
	double area();
	// double perimeter();//not allowed
}

interface Math {
	double power(int b, int e);
}

interface Factorial {
	int fact(int f);
}

public class Example1 {

	public static void main(String[] args) {

		/*
		 * Runnable r1=new Runnable(){
		 * 
		 * public void run() { System.out.println("from run method:"); } };
		 * 
		 * Thread t1=new Thread(r1); t1.start();
		 * 
		 * Runnable r=()-> { for(int i=1;i<5;i++) { System.out.println("In run methods"
		 * +i); } }; Thread t=new Thread(r); t.start();
		 */

		/*
		 * Shape s=()-> { return 0.0; };
		 * 
		 * double result=s.area(); System.out.println(result);
		 */

		Factorial num = (int f) -> {
			int facto = 1;
			for (int i = 1; i <= f; i++) {
				facto = facto * i;
			}
			return facto;
		};
		double result3 = num.fact(4);
		System.out.println(result3);

		// POwer

		/*
		 * Math m=(int b,int e)-> { int p=1; for(int i=0;i<e;i++) { p*=b; } return p; };
		 * double result1=m.power(2,4); System.out.println(result1);
		 */
	}
}
