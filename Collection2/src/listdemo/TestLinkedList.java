package listdemo;

import java.util.LinkedList;

import java.util.Iterator;

public class TestLinkedList {

	public static void main(String[] args) {
	 LinkedList<String> list=new LinkedList<>();
	 list.add("marker");
	 list.add("Pencil");
	 list.add("Pen");
	 list.add("Sharpener");
	 
	 System.out.println(list);
	 System.out.println(list.size());
	 System.out.println(list.getFirst());
	 System.out.println(list.getLast());
	 System.out.println(list.get(2));
	 list.add(2,"sticky notes");
	 System.out.println(list);
	 
	 Iterator<String>  iter=list.descendingIterator();
	 while(iter.hasNext()) {
		 System.out.println(iter.next());
	 }
	 Iterator<String>  listiter=list.listIterator();
	 while(listiter.hasNext()) {
		 String element=listiter.next();
		 if(element.equals("Pencil"))
		 {
			 listiter.remove();
		 }
	 }
		 System.out.println(list);

	 

	}
	}

