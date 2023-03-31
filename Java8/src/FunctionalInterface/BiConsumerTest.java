package FunctionalInterface;

import java.util.HashMap;
import java.util.function.BiConsumer;


public class BiConsumerTest {
	public static void main(String[] args) {
		HashMap<String,String> m=new HashMap<>();
		
		m.put("ola","o");
		m.put("Hello","H");
		m.put("Chao","C");
		//m.forEach((k,v)->
				//System.out.println(k+" "+v));
		
		BiConsumer<String,String>bi=
				(k,v)->System.out.println(k+"For"+v);
		m.forEach(bi);
		
	}

}
