package Firsttest;

public class Calculator {

	
	public int power(int b,int e)
	{
		int product = 1;
		if(b==0 || e==0)
			return 0;
		
		for(int i=0;i<e;i++)
			product=product *b;	
		return product;
	}
	
	
	public int fact(int n)
	{
		int b=1;
		for(int i=1;i<=n;i++) 
		{
			b=b*i;}
			
		return b;
	}
	
	
	public int fiba(int n)
	{
		int a=0;
		int b=1;
		int c=0;
		for(int i=2;i<n;i++) 
		{
			c=a+b;
			a=b;
			b=c;
			
		}
			
		return c;
	}


}


