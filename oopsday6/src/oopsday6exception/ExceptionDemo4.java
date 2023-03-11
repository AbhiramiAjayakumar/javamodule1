package oopsday6exception;
import java.sql.*;


public class ExceptionDemo4 {
	static void method() throws SQLException{
		throw new SQLException("connection failed");
	}

	public static void main(String[] args) {
		try {
			method();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	
	}

}
