package listdemo;

import java.util.ArrayDeque;
import java.util.Iterator;

public class TestArrayDeque {
	public static void main(String[] args) {
		ArrayDeque<String> queue=new ArrayDeque<>();
		queue.addLast("first");
		queue.addLast("Second");
		queue.addLast("third");
		queue.addLast("fourth");
		queue.addLast("fifth");
		
		System.out.println(queue);
		System.out.println(queue.size());
		String element=queue.peek();//getfirst
		System.out.println(element);
		queue.poll();
		System.out.println(queue);
		
		
		
		
		 Iterator<String>  iter=queue.descendingIterator();
		 while(iter.hasNext()) {
			 System.out.println(iter.next());
		 }
			/*
			 * Iterator<String> listiter=queue.queueIterator(); while(listiter.hasNext()) {
			 * element=listiter.next(); if(element.equals("Pencil")) { listiter.remove(); }
			 * } System.out.println(queue);
			 */

	}

}
