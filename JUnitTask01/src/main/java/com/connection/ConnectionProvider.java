package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {

	private static Connection connection = null;
	
	private ConnectionProvider() {
		
	}
	
	public static Connection getConnection() {
		
		if(connection == null) {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:FREE","SHANKAR","BHAWANI");
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		}
		
		return connection;
	}
}
