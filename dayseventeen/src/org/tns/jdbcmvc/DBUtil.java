// Program to establish connection with database
package org.tns.jdbcmvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;


public class DBUtil {
	static Connection cn;
	// static block
	static 
	{
			Properties prop = new Properties();
		
			try 
			{
				// reading a file which contain drier name, url, username and password
				prop.load(new FileInputStream("C:\\Users\\Kunal\\OneDrive\\Desktop\\TNS Training\\TNS Training JAVA NO5\\Eclipse Program\\dayseventeen\\src\\org\\tns\\jdbcmvc/db.properties"));
			
				// loading a driver
				Class.forName(prop.getProperty("driver_name"));
				System.out.println("Driver loaded successfully...");
				
				// establish the connection with database
				cn = DriverManager.getConnection(prop.getProperty("db_url"), prop.getProperty("db_username"), prop.getProperty("db_password"));
				System.out.println("Connection established successfully....");

			} 
			catch (IOException | ClassNotFoundException | SQLException e) 
			{
				e.printStackTrace();
			}
	}
	
	// method of return type cn
	public static Connection getCn()
	{
		return cn;
	}
	
}
