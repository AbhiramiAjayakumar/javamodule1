package paramtest;

public class Primenumber {
	
	public boolean validate(int n)
	{
	int flag=0;
	for(int i=1;i<=n;i++)
	{
		
		if(n%i==0) {
			flag++;}
	}
	if(flag==2) {
		return true;}
		else 
			return false;
	}

}
