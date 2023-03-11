package listdemo;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class TestHashSet {

	public static void main(String[] args) {
		
		LinkedHashSet<String> bookSet=new LinkedHashSet<>();
		bookSet.add("Java is nutshell");
		bookSet.add("Java Complete Reference");
		bookSet.add("Thinking in Java");
		bookSet.add("Java in 21 days");
		bookSet.add("Java for dummies");
		bookSet.add("Java for Reference");
		bookSet.add(null);

		System.out.println(bookSet);
		System.out.println(bookSet.size());
		System.out.println(bookSet.contains("Java is nutshell"));
		
		bookSet.add("Thinking in Java");
		System.out.println(bookSet.size());
		
		for(String book:bookSet)
		{
			System.out.println(book);
		}
		
		Iterator<String> iter=bookSet.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}

	}

}
