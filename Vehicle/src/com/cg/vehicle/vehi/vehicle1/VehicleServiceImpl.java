package com.cg.vehicle.vehi.vehicle1;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.cg.vehicle.vehi.CustomerBean;
import com.cg.vehicle.vehi.dao.IVehicleDaoImpl;
import com.cg.vehicle.vehi.exception.VehicleException;





public class VehicleServiceImpl implements VehicleService {
	//static IVehicleDao = new VehicleDaoImpl();
	private IVehicleDaoImpl vehidao1;
	public CustomerBean retrieveAllCars() throws VehicleException, IOException{
		IVehicleDaoImpl vehidao = new IVehicleDaoImpl();
		CustomerBean customerbean = new CustomerBean();
		
		
		
		customerbean = vehidao.ViewCar(null);
		return customerbean;
	}
	public List retrieveAllBikes() throws ClassNotFoundException, SQLException, IOException, VehicleException
	{
		vehidao1 = new IVehicleDaoImpl();
		List<CustomerBean> bikeList = null;
		IVehicleDaoImpl vehidao = null;
		bikeList = vehidao.ViewBike(null);
		return bikeList;
		
		
	}
}
		
		
		
		
