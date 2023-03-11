package oopsday3.atm.menu;

import oopsday3.atm.exceptions.InsufficientFundsException;
import oopsday3.atm.exceptions.NegativeAmountException;

public interface BankingIface2 {
	
	public abstract double withdraw(double amount,int acctno)throws InsufficientFundsException;
	public abstract double deposit(double amount,int acctno) throws NegativeAmountException;
    public abstract double balanceEnquiry(int actno);

}
