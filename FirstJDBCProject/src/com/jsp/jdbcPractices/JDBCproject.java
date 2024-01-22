package com.jsp.jdbcPractices;

import java.io.FileReader;
import java.util.Properties;

public class JDBCproject {
	public static void main(String[] args) {
		String con=null;
		Properties prob=new Properties();
		try {
			FileReader fread=new FileReader("JdbcConfig/Config.properties");
			prob.load(fread);
			con=prob.getProperty("connection");
			Class.forName(con);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}