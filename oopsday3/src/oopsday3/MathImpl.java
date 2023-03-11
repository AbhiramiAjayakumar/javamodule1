

package oopsday3;

public class MathImpl implements MathIface {
	
	private int n;
	private int n1;
	private int n2;
	public MathImpl() {
	
	}

	

	@Override
	public int factorial(int n) {
		int fact=1;
		for(int i = 1;i<=n;i++)
			fact=fact*i;
		// TODO Auto-generated method stub
		return fact;
	}

	@Override
	public void PrimeOrNot(int n) {
		int flag=0;
		for(int i=2;i<=n;i++) {
			if(n%i==0) {
				flag=1;
				break;
				}}
	 if(flag==1)	
		 System.out.println("prime");
	 else
		 System.out.println("not prime");
	}
	@Override
	public void OddOrEven(int n) {
		int flag=0;
		if(n%2==0)
			flag=1;
		if(flag==1)
		System.out.println("even");
		else
			System.out.println("odd");
			
	}

	@Override
	public int Addition(int n1, int n2) {
		// TODO Auto-generated method stub
		return n1+n2;
	}

	@Override
	public int Subtraction(int n1, int n2) {
		// TODO Auto-generated method stub
		return n1-n2;
	}

	@Override
	public int Multiplication(int n1, int n2) {
		
		return n1*n2;
	}

	@Override
	public int Divison(int n1, int n2) {
		// TODO Auto-generated method stub
		return n1/n2;
	}

	@Override
	public int Modulus(int n1,int n2) {
		return n1%n2;
		// TODO Auto-generated method stub
		
	}

	
	}

