package com.covidvirrus.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectionController 
{
	public static Connection getMyConnection()
	{
		try 
		{
			try {
				//Class.forName("com.sql.jdbc.Driver");
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=12345");
		}
		 catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return null;
	}
}
