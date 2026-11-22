package com.nit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductDao {
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:FREE";
	private String username = "shankar";
	private String password = "BHAWANI";
	
	public int insertProduct(int id, String name) {
		int result = 0;
		try {
			Class.forName(driver);
			
			Connection con = DriverManager.getConnection(url, username, password);
			
			PreparedStatement pstmt = con.prepareStatement("Insert into product values(?, ?)");
			
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			
			result = pstmt.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
}
