package com.jsp.jdbcPractices;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class VegitableDataInsersion {
	public static void result() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stars5","root","root");
		PreparedStatement pstmt=con.prepareStatement("insert into vegitablelist values(?,?,?)");
		pstmt.setInt(1, 5);
		pstmt.setString(2, "Mango3");
		pstmt.setInt(3, 250);
		pstmt.executeUpdate();
		pstmt.close();
		con.close();
	}
	public static void main(String[] args) {	
		try {
			result();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}