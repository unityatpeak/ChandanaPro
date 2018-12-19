package com.cg.vehicle.vehi.util;

import java.io.FileInputStream;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.cg.vehicle.vehi.exception.VehicleException;

public class DBConnection {

	public static Object getInstance() {
		// TODO Auto-generated method stub
		return null;
	}

	public static Connection getConnection() throws VehicleException, IOException, SQLException  {
		try {
			FileInputStream fis = new FileInputStream("resources/DB.properties");
			Properties prop = new Properties();
			prop.load(fis);

			String u = prop.getProperty("URL");
			String user = prop.getProperty("username");
			String pass = prop.getProperty("password");
			Connection c;
			
				c = DriverManager.getConnection(u,user,pass);
			
			return c;
		} catch (Exception vehicleException) {
			// TODO: handle exception
			System.out.println(vehicleException);
			vehicleException.printStackTrace();
		
		}
		return null;
		
	}

}
