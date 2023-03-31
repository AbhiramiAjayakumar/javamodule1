package Singleton;

import java.util.Optional;

public class Connection {
static Connection con;
private Connection()
{
	
}
public static Connection getConnection()
{
	Optional<Connection> optional1 = Optional.ofNullable(con);
	if (optional1.isPresent()) {
		return con;
		} 
	else
		con=new Connection();
	return con;
}
}
