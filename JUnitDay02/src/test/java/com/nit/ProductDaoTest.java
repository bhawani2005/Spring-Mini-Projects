package com.nit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ProductDaoTest{
    private ProductDao dao;
    private Connection con;
    private String driver;
    private String url;
    private String username;
    private String password;
    private int id = 101;
    
    @Before
    public void setup() {
    	dao = new ProductDao();
    	driver = "oracle.jdbc.driver.OracleDriver";
    	url = "jdbc:oracle:thin:@localhost:1521:FREE";
    	username = "shankar";
    	password = "BHAWANI";
    	try {
    		Class.forName(driver);
			con = DriverManager.getConnection(url, username, password);
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
    }
    
    @Test
    public void insertTest() {
    	String deleteQuery = "delete from product where id = ?";
    	
    	try {
			PreparedStatement pstmt = con.prepareStatement(deleteQuery);
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	
    	assertEquals(dao.insertProduct(id, "shoes"), 1);
    }
    
    @Test
    public void selectTest() {
    	String selectQuery = "select name from product where id = ?";
    	
    	try {
			PreparedStatement pstmt = con.prepareStatement(selectQuery);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			
			assertTrue(rs.next());
			
			assertEquals(rs.getString(1), "shoes");
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	
    	
    }
    
    @After
    public void tearDown() {
    	dao = null;
    	driver = null;
    	url = null;
    	username = null;
    	password = null;
    	con = null;
    	id = 0;
    }
}
