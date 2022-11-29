package com.student;

import java.sql.Connection;
import java.sql.DriverManager;

public class Insert_JDBC {

	public static void main(String[] args) {
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // 1. registering
			// 2.connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/class_c2268","root","root*#");
			// 3.create statement
			java.sql.Statement stmt= con.createStatement();
			// 4.inserting data into database table
			stmt.executeUpdate("insert into studentmanage values(5,'avijit',1245654,'kolkata')");
			stmt.executeUpdate("insert into studentmanage values(2,'bobb',1245954,'kolkata')");
			stmt.executeUpdate("insert into studentmanage values(3,'jit',1245854,'kolkata')");
			stmt.executeUpdate("insert into studentmanage values(4,'avbik',1295654,'kolkata')");
			
			System.out.println("imnserted successfully.");
			// 5.closing connection
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
