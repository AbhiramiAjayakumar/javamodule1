package statemachine;

import java.util.Scanner;

public class StateMachine implements StateIface {

	int noofhun;
	int nooffif;
	int nooftwe;
	int nooften;
	int totalamount=0;
	int result=0;
	int result1=0;
	int flag=0;
	
	private int noof_hun=100;
	private int noof_fif=100;
	private int noof_twe=100;
	private int noof_ten=100;
	
	
public void menu()
{
	while(result<3)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total amount");
		totalamount = sc.nextInt();
		System.out.println("Enter the amount of 100 notes");
		noofhun=sc.nextInt();
		System.out.println("Enter the amount of 50 notes");
		nooffif=sc.nextInt();
		System.out.println("Enter the amount of 20 notes");
		nooftwe=sc.nextInt();
		System.out.println("Enter the amount of 10 notes");
		nooften=sc.nextInt();
		
		result=test(totalamount);
		if(result1==0)
			System.out.println("the amount withdrawn="+ totalamount +"\n the denominations are\n 100*"+ noofhun +"\n50*"+ nooffif + "\n20*" + nooftwe + "\n 10*" + nooften);
			
	}
	System.out.println("chances over");
}
			
	@Override
	public int test(int totalamount) {
		if(totalamount==((noofhun*100)+(nooffif*50)+(nooftwe*20)+(nooften*10)))
		{
			if(noofhun<=noof_hun)
			{
				noof_hun-=noofhun;
			}
			else
			{
				System.out.println("no fund for 100");
				result1++;
			}
			
			if(nooffif<=noof_fif)
			{
				noof_fif-=nooffif;
			}
			else
			{
				System.out.println("no fund for 50");
			}
			
			if(nooften<=noof_ten)
			{
				noof_ten-=nooften;
			}
			else
			{
				System.out.println("no fund for ten");
				result1++;
			}
		}
		else {
			System.out.println("wrong denomination");
			flag++;
			result1++;
		}
		
		
		
		return flag;
	}
	

}
