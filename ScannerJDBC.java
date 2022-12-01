package com.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ScannerJDBC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter sID:");
		String sID=sc.next();
		
		System.out.println("ENTER sNAME:");
		String sNAME= sc.next();
		
		System.out.println("Enter sPHONE:");
		String sPHONE=sc.next();
		
		System.out.println("Enter sADDRESS:");
		String sADDRESS=sc.next();
		
		
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // 1. registering
			// 2.connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/class_c2268","root","root*#");
			// 3.create statement
			     PreparedStatement stmt = con.prepareStatement("insert into studentmanage values(?,?,?,?)");
			     
			     stmt.setString(1, sID);
			     stmt.setString(2, sNAME);
			     stmt.setString(3, sPHONE);
			     stmt.setString(4, sADDRESS);
			     stmt.execute();                              // exception query
			  System.out.println("inserted succesfully");     
		}
		
		    catch (Exception e) {                             // exception handling
		    	System.out.println(e);
			     }
          sc.close();
          sc.close();
          sc.close();
	}

}