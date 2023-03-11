package userdefinedobjects;

import java.util.ArrayList;


public class TestEmpArrayList {

	public static void main(String[] args) {
		ArrayList<Employee> emplist=new ArrayList<Employee>();
		Employee emp1=new Employee("John Doe","Male",26,101,"Research",40000);
		
		Employee emp2=new Employee("Jack Doe","Male",22,102,"Accounts",20000);
		
		Employee emp3=new Employee("Jinson Doe","Female",23,103,"Research",40000);
		
		Employee emp4=new Employee("Jomes Doe","Male",24,104,"Sales",50000);
		
		Employee emp5=new Employee("John Doe","Male",26,101,"Research",40000);
		emplist.add(emp1);
		emplist.add(emp2);
		emplist.add(emp3);
		emplist.add(emp4);
		emplist.add(emp5);
		
		System.out.println(emplist);
		
		
	}

}
