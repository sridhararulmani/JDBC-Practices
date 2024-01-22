package com.jsp.PropertiesPractices1;

import java.io.FileReader;
import java.util.Properties;

public class Connector {
	public static void main(String[] args) {
		Properties prop=new Properties();
		try {
			FileReader fr=new FileReader("Configuration/Config.Properties");
			prop.load(fr);

		}
		catch (Exception e) {
			e.printStackTrace();
		}
		String un=prop.getProperty("UserName");
		String pwd=prop.getProperty("Password");
		String portNumber=prop.getProperty("port");
		int port=Integer.parseInt(portNumber);
		System.out.println(un);
		System.out.println(pwd);
		System.out.println(port);
	}
}