package com.ust.debugging;

public class TestCode2 {
	int a;
	int b;
	int x;
	int a1[]= {2,5,7,8,5};
	int b1[]= {23,43,27,32,12};
	int x1[]= {18,19,20,21,22};
	int result;
	int result1;
	void square()
	{
		for(int i=0;i<5;i++) {
			a=a1[i];
			b=b1[i];
			x=x1[i];
			result=(a*(x*x)+(b*(x*x))+(2*a*b));
			//result1=(a1[i]*(x1[i]*x1[i])+b1[i]*(x1[i]*x1[i])+2*(a1[i]*(b1[i])));
			//System.out.println(result1);
			System.out.println(result);
		}
	}
	
	//ax2+bx2+2ab
	
	
	public static void main(String[] args) {
		new TestCode2().square();
	
	}
	

}
