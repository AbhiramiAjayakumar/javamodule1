package oopsday6exception;

public class M {

	public static void main(String[] args) {
		int n=12;
		int count=1;
		for(int i=0;i<n;i++)
		{
			for(int j=i;j!=0;)
			{
				if(j%10==1)
					count++;
				j=j/10;
			}
		}
    System.out.println(count);
	}

}
