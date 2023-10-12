package org.tns.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) {
		 try {
			 // this lines loads a driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded Successfully....");
			
			// this line is used to establish a connection between database and java
			// connection is interface and DriverManager is class
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Kunal");
			System.out.println("Connection establish successfully...");
			
			// object of statement interface created using cn (interface object created earlier)
			// statement - used for static queries
			Statement st = cn.createStatement();
			
			// Retriving data from student table
			// Result set is an interface 
			ResultSet rs = st.executeQuery("SELECT * from student");
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));
			}
			
			rs.close();
			
			
			// Inserting data into student table
			// excuteUpdate function returns a integer value (i.e number of rows affected)
			int n=st.executeUpdate("INSERT INTO student VALUES(10,'Amaan',94)");
			if(n==1) {
				System.out.println("Record inserted succefully");
			}
			else {
				System.out.println("Duplicate entry");
			}
			
			// Deleting record from student table whose name starts with p
			int m=st.executeUpdate("DELETE FROM student WHERE sname LIKE 'a%'");
			if(m>=1) {
				System.out.println(m+" Record deleted succefully");
			}
			else {
				System.out.println("No entry");
			}
			
			// Update student percentage increased by 5
			int o=st.executeUpdate("UPDATE student SET per=per+5 WHERE per<96");
			if(o>=1) {
				System.out.println(o+" Record updated succefully");
			}
			else {
				System.out.println("No entry");
			}
			
			cn.close();
			
			} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}
