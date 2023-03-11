package oopsday3;


public class Math2 {

	public static void main(String[] args) {
		
		MathIface obj =new MathImpl();
		int result=obj.factorial(5);
		System.out.println("factorial ="+result);
		obj.PrimeOrNot(5);
		obj.OddOrEven(5);
		result=obj.Addition(7,5);
		System.out.println("Addition ="+result);
		result=obj.Subtraction(7,5);
		System.out.println("Subtraction ="+result);
		result=obj.Multiplication(7,5);
		System.out.println("Multiplication ="+result);
		result=obj.Divison(7,5);
		System.out.println("Division ="+result);
		result=obj.Modulus(7,5);
		System.out.println("Modulus ="+result);
		
		
		
		// TODO Auto-generated method stub

	}

}
