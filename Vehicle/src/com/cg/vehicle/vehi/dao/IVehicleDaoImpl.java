package com.cg.vehicle.vehi.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;


import com.cg.vehicle.vehi.CustomerBean;
import com.cg.vehicle.vehi.exception.VehicleException;
import com.cg.vehicle.vehi.util.DBConnection;

public class IVehicleDaoImpl implements IVehicleDao {

	@Override
	public String addCustomer(CustomerBean cust) throws VehicleException, IOException, SQLException {
		Connection con = DBConnection.getConnection();
		Statement st = null;
		PreparedStatement pst = null;
		ResultSet rs = null;

		String custId = null;
		// int queryResult = 0;

		try {

			pst = con.prepareStatement(QueryMapper.INSERT_CUSTOMER);
			pst.setString(1, cust.getName());
			pst.setString(2, cust.getAddress());
			pst.setString(3, cust.getPhoneNumber());

			pst.executeUpdate();
			st = con.createStatement();
			rs = st.executeQuery(QueryMapper.SELECT_CUST);
			while (rs.next()) {
				custId = rs.getString(1);
				System.out.println("Hi" + cust.getName());
				/*
				 * rs.getString(2); rs.getString(3); rs.getString(3);
				 */

			}

		} catch (Exception sqle) {
			sqle.printStackTrace();
		}
		con.close();
		st.close();
		pst.close();
		return custId;

	}

	@SuppressWarnings("unchecked")
	@Override
	public CustomerBean ViewCar(String carl) throws VehicleException, IOException
	 {
		try{
			Connection con = DBConnection.getConnection();
			 
			Statement st = null;
			//PreparedStatement pst = null;
			ResultSet rs = null;
			st = con.createStatement();

			rs = st.executeQuery(QueryMapper.SELECT_CAR);

			return  (CustomerBean) rs;
		}
	 catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return null;
	 }
	public List<CustomerBean> ViewBike(String bikel) throws VehicleException, IOException, SQLException {
		Connection con = DBConnection.getConnection();
		
		ResultSet resultSet = null;
		Statement st = null;
	//	PreparedStatement pst = null;
		st = con.createStatement();
		resultSet = st.executeQuery(QueryMapper.SELECT_BIKE);

		return (List<CustomerBean>) resultSet;
	}

	


	

}
