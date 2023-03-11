package listdemo;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList flowers=new ArrayList();
		flowers.add(new Integer("1"));
		flowers.add(new java.util.Date());
		flowers.add(new java.util.Scanner(System.in));
		flowers.add(new Double("10.10"));
		flowers.add("Tulips");
		flowers.add("Rose");
		flowers.add(2,"sunflower");
		flowers.add("Jasmine");
		flowers.add("hydranjia");
		flowers.add("lilli");
		
		String str=(String)flowers.get(5);
		//System.out.println((String )flowers.get(5));
		//System.out.println((String )flowers.get(3));
		Object obj=flowers.get(0);
		if(obj instanceof Integer)
		{
			Integer in=(Integer) obj;
			System.out.println(in.MIN_VALUE);
			
		}
		else if(obj instanceof Double)
		{
			Double d=(Double) obj;
			System.out.println(d.MAX_VALUE);
			
		}
		else if (obj instanceof String)
		{
			str=(String) obj;
			System.out.println(str.toUpperCase());
		}
		
		/*
		/*
		 * System.out.println(flowers); System.out.println(flowers.size());
		 * System.out.println(flowers.get(1));
		 * System.out.println(flowers.contains("lilli"));
		 * 
		 * for(Object obj :flowers) { System.out.println(obj); }
		 * flowers.remove("sunflower"); System.out.println(flowers); Iterator
		 * iter=flowers.iterator(); while(iter.hasNext()) {
		 * System.out.println(iter.next()); }
		 * 
		 * for(int i=0;i<flowers.size();i++) { System.out.println(flowers.get(i)); }
		 */
	}
	

}
