package com.cg.vehicle.vehi.dao;


import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.cg.vehicle.vehi.CustomerBean;
import com.cg.vehicle.vehi.exception.VehicleException;

public interface IVehicleDao {
	public String addCustomer(CustomerBean db) throws VehicleException, IOException, SQLException;
	//public List<Customer> ViewCar() throws ClassNotFoundException, SQLException, IOException;
	public List<CustomerBean> ViewBike(String bikel) throws VehicleException, IOException, SQLException;
	public CustomerBean ViewCar(String carl) throws VehicleException, IOException, SQLException;
	
}
