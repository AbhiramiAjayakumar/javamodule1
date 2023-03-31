import java.util.ArrayList;
import java.util.Scanner;

public class Arrayl {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int money=sc.nextInt();
		System.out.println("Enter the number of person");
		int nofper=sc.nextInt();
		System.out.println("Enter the amount needed");
		ArrayList<Integer> person=new ArrayList<>();
		for(int i=0;i<nofper;i++) {
		 int moneyofperson = sc.nextInt();
		 	person.add(moneyofperson);
		}	 	
		Integer sum=0;
	for(int i=0;i<person.size();i++)
	{
		
		sum=sum+person.get(i);}
		if(sum==money) 
		{
			System.out.println(sum);
		}
		else if(sum>money) 
		{
		System.out.println("Money exceeded");
		}
	else {
			System.out.println("Money cannot be splitted");}
	
		}	
}

