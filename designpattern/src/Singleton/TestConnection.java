package Singleton;

public class TestConnection {

	public static void main(String[] args) {
		Connection con1=Connection.getConnection();
		Connection con2=Connection.getConnection();
		if(con1.hashCode()==(con2.hashCode()))
		{
		System.out.println("singleton");	
		}
		else
		{
			System.out.println("no");
		}
		
		
	}

}
