package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.function.Consumer;

public class TestDay1 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add("sun");
		list.add("moon");
		list.add("jupiter");
		list.add("pluto");
		list.add("mars");
		list.add("venus");
		
		long count=list.stream().filter((str)->str.length()>3).count();
		System.out.println(count);
		
		/*
		 * int count=0; for(String str:list) { if(str.length()>3) count++; } /// for lopp iterator instead of stream
		 * System.out.println(count);
		 */
		
		
		Predicate<String> p=(String str) ->
		{
			return str.length()>3 ||str.length()<10;	//predicate using filter
		};
		long count1=list.stream().filter(p).count();
		System.out.println(count);
		
		
		
		
		Function<String,String>f=(str)->{
			return str.toUpperCase();	//function
		};
		List<String> outList1=list.stream().map(f).collect(Collectors.toList());
		System.out.println(outList1);
		
		
		
		
		List<String> outList=list.stream().map((str)->str.toUpperCase()).collect(Collectors.toList());
		System.out.println(outList);								// converting to uppercase and putting into list
	
	
		
		//foreach
		list.stream().forEach(System.out::println);
		
		Consumer<String> c=(str)->
		{
			System.out.println(str);
		};
		list.stream().forEach(c);
	
		
		//combinig all three
		list.stream().filter(p).map(f).forEach(c);
	
	
	}
	
	
	
	


}
