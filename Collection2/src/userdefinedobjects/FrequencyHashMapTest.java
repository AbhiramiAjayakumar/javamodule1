package userdefinedobjects;

import java.util.HashMap;

public class FrequencyHashMapTest {

	public static void main(String[] args) {
	String str="HELLO MY DEAR HELLO MY DEAR";
 String words[]=str.split(" ");
 //System.out.println(words.length);
 HashMap<String,Integer> testing=new HashMap<>();
 	
 for(String wors:words) {
	//System.out.println (testing.get(words));
	Integer counter=testing.get(wors);
	if(counter==null)
		testing.put(wors, 1);
	else
		testing.put(wors, counter + 1);
	}	
 System.out.println(testing);
 
 for(int i=0;i<str.length();i++)
 {
	 
 }
	}
	 
 }
    
	

