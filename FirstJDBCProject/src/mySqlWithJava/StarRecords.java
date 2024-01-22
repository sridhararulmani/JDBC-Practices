package mySqlWithJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class StarRecords {
	public static void main(String[] args) {
		String query="select * from employee.stars";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
			Statement stmt=con.createStatement();
			ResultSet no=stmt.executeQuery(query);
			System.out.println(no);
			stmt.close();
			con.close();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}