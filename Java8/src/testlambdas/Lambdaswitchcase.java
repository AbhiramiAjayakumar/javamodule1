package testlambdas;

public class Lambdaswitchcase {
	static double calculate(String operator,double x,double y) {
	return switch (operator)
			{
	case "+"->x+y;
	case "-"->x-y;
	case "*"->x*y;
	case "/"->
	{
		if(y==0)
		{
			throw new IllegalArgumentException("cant divide by zero");
		}
		yield x/y;
	}
	default-> throw new IllegalArgumentException("Unknown operator");
			};
}

public static void main(String[] args)
{
	
	System.out.println(calculate("*",10,20));
	System.out.println(calculate("-",10,0));
	System.out.println(calculate("+",10,30));
	System.out.println(calculate("/",30,3));
	System.out.println(calculate("/",10,0));
}
}

