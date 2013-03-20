package jppreti.locadora.database;

import java.sql.Connection;

public class Database {
	
	private static Connection con;
		
	private Database(){}
	
	public static Connection getConnection() {
		return con;
	}
	
}
