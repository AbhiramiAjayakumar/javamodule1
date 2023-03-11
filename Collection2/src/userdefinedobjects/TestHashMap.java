package userdefinedobjects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

import java.util.Iterator;

import java.util.HashMap;

public class TestHashMap {

	public static void main(String[] args) {
		Employee emp1=new Employee("John Doe","Male",26,101,"Research",40000);
		
		Employee emp2=new Employee("Jack Doe","Male",22,102,"Accounts",20000);
		
		Employee emp3=new Employee("Jinson Doe","Female",23,103,"Research",40000);
		
		Employee emp4=new Employee("Jomes Doe","Male",24,104,"Sales",50000);
		
		Employee emp5=new Employee("John Doe","Male",26,101,"Research",40000);

		HashSet<Employee> empSet=new HashSet<Employee>();
		empSet.add(emp1);
		empSet.add(emp2);
		empSet.add(emp3);
		empSet.add(emp4);
		empSet.add(emp5);
		
		ArrayList<Employee> emplist=new ArrayList<Employee>();
		emplist.add(emp1);
		emplist.add(emp2);
		emplist.add(emp3);
		emplist.add(emp4);
		emplist.add(emp5);
		
		TreeSet<Employee> emp1Set=new TreeSet<Employee>();
		emp1Set.add(emp1);
		emp1Set.add(emp2);
		emp1Set.add(emp3);
		emp1Set.add(emp4);
		emp1Set.add(emp5);
		
		HashMap<String,Collection> dataMap=new HashMap<>();
		dataMap.put("emplist", emplist);
		dataMap.put("empSet", empSet);
		dataMap.put("emp1Set", emp1Set);
		
		
		System.out.println(dataMap);
		
		
		Collection<Employee>list=dataMap.get("empList");
		Iterator iter=list.iterator();
		while(iter.hasNext())
{
	System.out.println(iter.next());
}
		
		Collection<Employee>set=dataMap.get("empSet");
		iter=set.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
		
		Collection<Employee>tree=dataMap.get("empSet1");
		iter=tree.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		}
	}


