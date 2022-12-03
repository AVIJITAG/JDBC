package com.student;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MenudrivenEg {
	
	
	Scanner sc= new Scanner(System.in);
	
	int Emp_ID,AGE,SALARY;
	String Emp_NAME,CITY;
	
// SAVING EMPLOYEE DETAILS IN DATABASE
	
	public void saveMenudriven() throws SQLException{
		
		System.out.println("ENTER ID : ");
		Emp_ID = sc.nextInt();
		
		System.out.println("ENTER NAME : ");
		Emp_NAME = sc.next();
		
		System.out.println("ENTER AGE : ");
		AGE = sc.nextInt();
		
		System.out.println("ENTER SALARY : ");
		SALARY = sc.nextInt();
		
		System.out.println("ENTER CITY : ");
		CITY = sc.next();
		
		
	Connection conn = Helper.con();
	
	PreparedStatement stmt = conn.prepareStatement("insert into menu_driven values(?,?,?,?,?)");
	
	    stmt.setInt(1, Emp_ID);
	    stmt.setString(2, Emp_NAME);
	    stmt.setInt(3, AGE);
	    stmt.setInt(4, SALARY);
	    stmt.setString(5, CITY);
        stmt.executeUpdate();	    
	  }
	
// fetching the details / display
	
	public void fetchMenudriven() throws SQLException {
		
		Connection conn = Helper.con();
		
		Statement stmt = conn.createStatement();
		
// execute query fetch data from database
	
	ResultSet rs = stmt.executeQuery("select * from class_c2268");
	
// iteration
	
	    while(rs.next()) {
	    	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+
	    " "+rs.getInt(4)+" "+rs.getString(5));
	    }
	}
	
// updating employee details in the database
	
	public void updateMenudriven() throws SQLException {

		Connection conn = Helper.con();
		
		Statement stmt = conn.createStatement();
		
		System.out.println("ENTER CITY : ");
		CITY = sc.next();
		
		stmt.executeUpdate("update menu_driven set CITY =' "+CITY+" ' where Emp_ID=  " +Emp_ID);
	}
	
//  Deleteing Details-----
	
	public void deletMenudriven() throws SQLException {
		
		Connection conn = Helper.con();
		
		Statement stmt = conn.createStatement();
		
		System.out.println("ENTER ID : ");
		Emp_ID=sc.nextInt();
		
		
   stmt.executeUpdate("Delect from menu_driven where Emp_ID = " +Emp_ID);		
		
	}

}

	
