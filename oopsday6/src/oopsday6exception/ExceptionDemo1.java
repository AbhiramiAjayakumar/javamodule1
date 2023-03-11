package oopsday6exception;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionDemo1 {

	public static void main(String[] args) { //command line arguments
	
		/*try
		{ Scanner scanner=new Scanner(System.in);
		 int a=scanner.nextInt();
		 int  b=scanner.nextInt();
		  int c=a/b;
		System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("cannot / by zero");
		}
		catch(InputMismatchException e)
		{
			System.out.println("invalid input format");
		}*/
		
		
		
		
		//ExceptionDemo 2
		
		System.out.println("Program task begins");

		try {
			int b = Integer.parseInt(args[0]);
			int a = Integer.parseInt(args[1]);
			int c = b / a;
			String name = args[2];
			int data[] = { a, b };
		}

		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}

		catch (NumberFormatException e) {
			e.printStackTrace();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Program task completed");
	



	/*	// ExceptionDemo3
		System.out.println("Program task begins");
		try
		{
			System.out.println("from try..");
			
		}
		catch(Exception e)
		{
			System.out.println("from catch...");
		}
		finally {
			System.out.println("from finally");
		}
		System.out.println("program completed task");*/

		
		
}
}
