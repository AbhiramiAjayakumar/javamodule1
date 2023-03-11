package statemachine;
import java.util.Scanner;

public class S {
public static void main(String[] args) {
	int amount;
	int hund=0;
	int fifty=0;
	int twenty=0;
	int ten=0;
	int five=0;
	int deno=0;
	
	Scanner sc=new Scanner(System.in);
			System.out.println("Enter amount");
			amount=sc.nextInt();
			System.out.println("Enter denomination");
			int denomination=sc.nextInt();
			while (amount>=100)
			{
				hund=amount/100;
				amount=amount%100;
				System.out.println("100"+"*"+hund+"="+hund*100);
				deno++;
			}
			while (amount>=50)
			{
				fifty=amount/50;
				amount=amount%50;
				System.out.println("50"+"*"+fifty+"="+fifty*50);
				deno++;
			}
			while (amount>=20)
			{
				twenty=amount/20;
				amount=amount%20;
				System.out.println("20"+"*"+twenty+"="+twenty*20);
				deno++;
			}
			while (amount>=10)
			{
				ten=amount/10;
				amount=amount%10;
				System.out.println("10"+"*"+ten+"="+ten*10);
				deno++;
			}
			while (amount>=5)
			{
				five=amount/5;
				amount=amount%5;
				System.out.println("5"+"*"+five+"="+five*5);
				deno++;
			}
			}
			/*if(deno==denomination)
			{
				System.out.println("100"+"*"+hund+"="+hund*100);
				System.out.println("50"+"*"+fifty+"="+fifty*50);
				System.out.println("20"+"*"+twenty+"="+twenty*20);
				System.out.println("10"+"*"+ten+"="+ten*10);
				System.out.println("5"+"*"+five+"="+five*5);
			}
			else if(deno!=denomination)
				System.out.println("Wrong denomination");
			}*/
}


