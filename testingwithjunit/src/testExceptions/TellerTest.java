package testExceptions;

import static org.junit.Assert.*;

import org.junit.Test;

public class TellerTest {
	
	Teller teller=new Teller();

	@Test(expected=InvalidTransactionAmount.class)
	public void testValidateNegativeAMount()
	{
		teller.validateTransaction("EUR",-100);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testValidateUnAcceptedCurrency()
	{
		teller.validateTransaction("AUSD",100);
	}
	
}
