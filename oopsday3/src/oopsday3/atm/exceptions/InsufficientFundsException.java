package oopsday3.atm.exceptions;

public class InsufficientFundsException extends Exception {
	public InsufficientFundsException(String msg)
	{
		super(msg);
	}

@Override
public String getMessage() {
	// TODO Auto-generated method stub
	return super.getMessage();
}
}
