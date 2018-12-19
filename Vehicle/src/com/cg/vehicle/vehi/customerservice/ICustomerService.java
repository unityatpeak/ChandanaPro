package com.cg.vehicle.vehi.customerservice;


import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.cg.vehicle.vehi.CustomerBean;
import com.cg.vehicle.vehi.exception.VehicleException;

public interface ICustomerService {
	public String addCustomer(CustomerBean cust) throws VehicleException, IOException, SQLException;
	//public String ViewCar();
	//public String ViewBike();
	List<CustomerBean> ViewCar(String carl) throws VehicleException, IOException, SQLException;
	List<CustomerBean> ViewBike(String bikel) throws VehicleException, IOException, SQLException;

}
