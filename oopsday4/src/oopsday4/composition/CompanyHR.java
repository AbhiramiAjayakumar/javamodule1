package oopsday4.composition;

public class CompanyHR {

	public static void main(String[] args) {
		Address resAdd=new Address("31","Mannath","WerlyMumbai","Mumbai",400048);
		Address commAdd = new Address("32","Antela","Bandra","Mumabai",400032);
Employee emp1=new Employee("John Doe","Male",26,101,"Research",40000,resAdd,commAdd);
System.out.println(emp1);
Employee emp2=new Employee("Jack Doe","Male",22,102,"Accounts",20000,resAdd,commAdd);
System.out.println(emp2);
Employee emp3=new Employee("Jinson Doe","Female",23,103,"Research",40000,resAdd,commAdd);
System.out.println(emp3);
Employee emp4=new Employee("Jomes Doe","Male",24,104,"Sales",50000,resAdd,commAdd);
System.out.println(emp4);
Employee emp5=new Employee("John Doe","Male",26,101,"Research",40000,resAdd,commAdd);
System.out.println(emp5);
Employee emp6=emp1;
if(emp1.equals(emp5))
{
	System.out.println("the objects are same");
}
else
	System.out.println("the objects are not same");
	}

}
