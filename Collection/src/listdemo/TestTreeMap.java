package listdemo;
import java.util.Map.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;


public class TestTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String,String>countryCurr=new TreeMap<>();
		countryCurr.put("USA", "Dollar");
		countryCurr.put("IND", "Rupe");
		countryCurr.put("UK", "Pound");
		
		System.out.println(countryCurr);
		System.out.println(countryCurr.get("USA"));
		countryCurr.put("IND", "Rupee");
		System.out.println(countryCurr);
		System.out.println(countryCurr.size());
		System.out.println(countryCurr.containsKey("UK"));
		System.out.println(countryCurr.containsValue("Rupee"));
		
		
		//HAshMap has 3 views
	//	1.Key view
		
		
		Set<String>keys=countryCurr.keySet();
		for(String Key:keys)
		{
			System.out.println(Key);
		}
// Value view
		Collection<String> values=countryCurr.values();
		for(String value:values)
		{
			System.out.println(value);
		//Key and value together(ENtry Set)	
			
			Set<Entry<String,String>>entries=countryCurr.entrySet();
			for(Entry<String,String> entry:entries) {
				System.out.println(entry);
			}
			
			
			
		}
		
	}

}
