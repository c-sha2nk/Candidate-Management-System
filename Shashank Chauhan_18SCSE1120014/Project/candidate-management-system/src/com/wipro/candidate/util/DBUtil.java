package com.wipro.candidate.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	public static Connection getDbConn()
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn  = DriverManager.getConnection("jdbc:postgresql://localhost:5432/piyush","postgres", "123");
			System.out.println("Success");
			return conn;
		} catch (Exception e) {
	         e.printStackTrace();
	         System.err.println(e.getClass().getName()+": "+e.getMessage());
	         System.exit(0);
	      }
		return null; 
	}
}
