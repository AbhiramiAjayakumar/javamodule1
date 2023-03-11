package userdefinedobjects;

import java.util.ArrayList;
import java.util.TreeSet;


public class TestEmpTreeSet {

	public static void main(String[] args) {
		TreeSet<Employee> empSet=new TreeSet<Employee>();
		Employee emp1=new Employee("John Doe","Male",26,101,"Research",40000);
		
		Employee emp2=new Employee("Jack Doe","Male",22,102,"Accounts",20000);
		
		Employee emp3=new Employee("Jinson Doe","Female",23,103,"Research",40000);
		
		Employee emp4=new Employee("Jomes Doe","Male",24,104,"Sales",50000);
		
		Employee emp5=new Employee("John Doe","Male",26,101,"Research",40000);
		empSet.add(emp1);
		empSet.add(emp2);
		empSet.add(emp3);
		empSet.add(emp4);
		empSet.add(emp5);
		
		System.out.println(empSet);
		
		
	}

}
