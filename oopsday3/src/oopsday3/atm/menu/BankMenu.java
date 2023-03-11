package oopsday3.atm.menu;
import java.util.Scanner;

import oopsday3.atm.exceptions.InsufficientFundsException;
import oopsday3.atm.exceptions.NegativeAmountException;




public class BankMenu {
	BankOfAmerica2 boa=new BankOfAmerica2();


public BankMenu()
{
	Account a1=new Account(101,"John Doe","savings",500);
	Account a2=new Account(102,"John Doe","savings", 800);
	Account a3=new Account(103,"John Doe","savings",700);
	Account a4=new Account(104,"John Doe","savings",900);
	Account a5=new Account(105,"John Doe","savings",400);
	
	//BankOfAmerica2 boa=new BankOfAmerica2();
	boa.addAccount(a1);
	boa.addAccount(a2);
	boa.addAccount(a3);
	boa.addAccount(a4);
	boa.addAccount(a5);
}


public void menu() throws NegativeAmountException
{
	Scanner scanner=new Scanner(System.in);
	int choice=0;
	loop:do
	{
		System.out.println("Enter your choice 1...5");
		System.out.println("Enter your choice 1 for Display");
		System.out.println("Enter your choice 2 for Deposit");	
		System.out.println("Enter your choice 3 for Withdraw");
		System.out.println("Enter your choice 4 for BalanceEnquiry");
		System.out.println("Enter your choice 5 for Exit M E N U");
		choice=scanner.nextInt();
		switch(choice){
			case 1:{
					System.out.println("Enter actno");
					int actno=scanner.nextInt();
					boa.displayAccount(actno);
					break;
			}
			case 2: {
				System.out.println("Enter actno");
				int actno=scanner.nextInt();
				System.out.println("Enter amount to deposit");
				int amount=scanner.nextInt();
				double balance=boa.deposit(amount,actno);
				System.out.println(balance);
				break;
				}
			case 3:
			{
				System.out.println("Enter actno");
				int actno=scanner.nextInt();
				System.out.println("Enter amount to withdraw");
				int amount=scanner.nextInt();
				double balance=0;
				try {
				balance=boa.withdraw(amount,actno);}
				catch(InsufficientFundsException e) {
					e.printStackTrace();
				}
				System.out.println(balance);
				break;
				
			}
			case 4:	
			{
				System.out.println("Balance Enquiry");
				int actno=scanner.nextInt();
				double balance=boa.balanceEnquiry(actno);
				System.out.println(balance);
				break;
				
			}
			case 5: {
				break loop;
			}
		}
		}while(choice!=5);
}



}
