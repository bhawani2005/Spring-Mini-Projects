package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.connection.ConnectionProvider;
import com.model.Employee;

public class EmployeeDao {

	private static Connection con;

	static {
		con = ConnectionProvider.getConnection();
	}

	public static int addEmployee(Employee e) {
		int rowCount = 0;

		try {
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO employee VALUES(?,?,?,?)");

			pstmt.setInt(1, e.getEmployeeId());
			pstmt.setString(2, e.getName());
			pstmt.setString(3, e.getDepartment());
			pstmt.setDouble(4, e.getSalary());

			rowCount = pstmt.executeUpdate();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		return rowCount;
	}

	public static Employee getEmployeeById(int employeeId) {
		Employee e = new Employee();

		try {
			PreparedStatement pstmt = con
					.prepareStatement("select employeeId, name, department, salary from employee where employeeId = ?");

			pstmt.setInt(1, employeeId);

			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				e.setEmployeeId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setDepartment(rs.getString(3));
				e.setSalary(rs.getDouble(4));
			}

		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		return e;
	}

	public static int updateSalary(int employeeId, double newSalary) {
		int rowCount = 0;

		try {
			PreparedStatement pstmt = con.prepareStatement("update employee set salary = ? where employeeId = ?");

			pstmt.setDouble(1, newSalary);
			pstmt.setInt(2, employeeId);

			rowCount = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return rowCount;
	}

	public static int deleteEmployee(int employeeId) {
		int rowCount = 0;

		try {
			PreparedStatement pstmt = con.prepareStatement("delete table employee where employeeId = ?");
			
			pstmt.setInt(1, employeeId);
			
			rowCount = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rowCount;
	}
}
