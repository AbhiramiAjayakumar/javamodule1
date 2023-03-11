package listdemo;

import java.util.ArrayList;

public class TestArrayList2 {

	public static void main(String[] args) {
		ArrayList<String> colors=new ArrayList<String>();
		//colors.add(new Object());
		//colors.add(new Double("10.10"));
		colors.add(null);
		
		System.out.println(colors);
		
		colors.add("Blue");
		colors.add("Green");
		
		colors.add("Yellow");
		
		colors.add("Red");
		
		colors.add("Orange");
		System.out.println(colors.size());
		
		String str=colors.get(3);
		System.out.println(str);
		

	}

}
