package listdemo;

import java.util.TreeSet;
import java.util.Iterator;

public class TestTreeSet {

	public static void main(String[] args) {
		
		TreeSet<String> bookSet=new TreeSet<>();
		bookSet.add("Java is nutshell");
		bookSet.add("Java Complete Reference");
		bookSet.add("Thinking in Java");
		bookSet.add("Java in 21 days");
		bookSet.add("Java for dummies");
		bookSet.add("Java for Reference");
		bookSet.add(null);// Tree set does not aloow null element.we cannot add null to tree

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
