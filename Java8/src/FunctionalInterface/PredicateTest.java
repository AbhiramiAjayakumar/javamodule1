package FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("Kerala", "Karnataka", "Tamil Nadu", "Andhra Pradesh", "Madhya Pradesh");

Predicate<String> p=(String str)->{
	return str.length()>6;
};
for(String str:strings) {
	System.out.println(p.test(str));

	}
	
Predicate<String>n=(String str)->
{
	return "Hello".length()>5;
};
System.out.println(n.test("Hello"));

	}


public static void desiredLength(List<String>strings,Predicate<String>p)
{
	for(String str:strings)
	{	System.out.println(p.test(str));

		
	}
}
}