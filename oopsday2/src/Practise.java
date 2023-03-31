import java.util.Scanner;

public class Practise {

	public static void main(String[] args) {
		String ch=" ";
		String m=" ";
		char n;
		Scanner sc=new Scanner(System.in);
		String str =sc.nextLine();
		for(int i=0;i<str.length();i++)
		{ 
			if(i==0)
			{
				m=str.substring(0,1).toUpperCase();
			}
			else if(str.charAt(i)==' ') {
		     ch=str.substring(i+1,i+2).toUpperCase();
		     i++;
		     m=m+" "+ch;
		    }
			else
				m=m+str.charAt(i);
				
		}
		
	System.out.println(m);	

		
	}		
}
