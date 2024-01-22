package com.jsp.jdbcPractices;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StarStudents {
	public static void createTable(Connection con) throws Exception{

	}
	public static void con() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhosr:3306/stars5","root","root");
		PreparedStatement pstmt=con.prepareStatement("create table student(sid number(100) primary key,"
				+ "sname varchar(10) not null,"
				+ "smarks number(3) not null,"
				+ "smobile number(10) check(length(smobile)=10) not null,"
				+ "sdob date not null,"
				+ "gen char(2) not null;");
	}
	public static void main(String[] args) {
		try {
			con();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}