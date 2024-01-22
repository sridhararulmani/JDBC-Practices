package com.sri.JDBCProject;

public class Demo {
	public static void main(String[] args) {
		try {
			Class.forName("com.sri.JDBCProject.Tree");	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}