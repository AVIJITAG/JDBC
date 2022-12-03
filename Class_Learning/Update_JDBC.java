package com.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Update_JDBC {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");    // 1. registering
			
      // 2.connection
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/class_c2268","root","root*#");
	
		// 3.create statement
		java.sql.Statement stmt=con.createStatement();
		
		// updating an existing record
		stmt.executeUpdate("update studentmanage set sADDRESS = 'west bengal' where sID=2");
		
		//delect record 
		stmt.executeUpdate("delete from studentmanage where sID+5");
		
		//execute query fetch data from database
		ResultSet rs=stmt.executeQuery("select * from studentmanage");
		
		//iteratig  through columns
		
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
			}
			con.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}

	}
