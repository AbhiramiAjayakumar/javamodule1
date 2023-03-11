package oopsday2.atm;

public class BankTransaction2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1=new Account(101,"John Doe","savings",500);
		Account a2=new Account(102,"John Doe","savings", 800);
		Account a3=new Account(103,"John Doe","savings",700);
		Account a4=new Account(104,"John Doe","savings",900);
		Account a5=new Account(105,"John Doe","savings",400);
		
		BankOfAmerica2 boa=new BankOfAmerica2();
		boa.addAccount(a1);
		boa.addAccount(a2);
		boa.addAccount(a3);
		boa.addAccount(a4);
		boa.addAccount(a5);
		
		System.out.println(boa.balanceEnquiry(104));

		double result=boa.deposit(500, 104);
		System.out.println(result);
		
		 result= boa.withdraw(400, 104);
		System.out.println(result);



	}

}
