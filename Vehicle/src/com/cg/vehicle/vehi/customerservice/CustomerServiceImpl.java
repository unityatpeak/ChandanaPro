package com.cg.vehicle.vehi.customerservice;


import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*import com.capgemini.donorapplication.bean.DonorBean;
import com.capgemini.donorapplication.dao.DonorDaoImpl;*/
import com.cg.vehicle.vehi.CustomerBean;
import com.cg.vehicle.vehi.dao.IVehicleDao;
import com.cg.vehicle.vehi.dao.IVehicleDaoImpl;
import com.cg.vehicle.vehi.exception.VehicleException;

public class CustomerServiceImpl implements ICustomerService{
	
	IVehicleDao daoObj = new IVehicleDaoImpl();
	@Override
	public String addCustomer(CustomerBean cust) throws VehicleException, IOException, SQLException {
		String customerSeq;
		customerSeq = daoObj.addCustomer(cust);
		
		return customerSeq;
	}

	
	

	public static void validateCustomer(CustomerBean custInfo) throws Exception{
		List<String> validationErrors = new ArrayList<String>();
		
		if(!(isValidName(custInfo.getName())))
		{
			validationErrors.add("\n  name should be in alphabets and min 5 characters long");
		}
		
		if(!(isValidAddress(custInfo.getAddress())))
		{
			validationErrors.add("\n Address should be in alphabets and min 6 characters long");
		}
		
		if(!(isValidPhoneNumber(custInfo.getPhoneNumber())))
		{
			validationErrors.add("\n Contact Number  should be  10 digits");
		}
	}

	private static boolean isValidPhoneNumber(String phoneNumber) {
		
		Pattern pat1 = Pattern.compile("^[6-9][0-9]{9}$");
		Matcher mat1 = pat1.matcher(phoneNumber);
		return mat1.matches();
	}

	private static boolean isValidAddress(String address) {
		Pattern pat1 = Pattern.compile("^[A-Za-z]{6,}$");
		Matcher mat1 = pat1.matcher(address);
		return mat1.matches();
		
	}

	private static boolean isValidName(String name) {
		{
			Pattern pat1 = Pattern.compile("^[A-Za-z]{5,}$");
			Matcher mat1 = pat1.matcher(name);
			return mat1.matches();
		} 
		
	}




	@Override
	public List<CustomerBean> ViewCar(String carl) throws VehicleException, IOException, SQLException
	 {
		try{
			List<CustomerBean> carSeq;
			carSeq = (List<CustomerBean>) daoObj.ViewCar(carl);
			
			return carSeq;
			
		}
	 catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return null;
		
	 }



	@Override
	public List<CustomerBean> ViewBike(String bikel) throws VehicleException, IOException, SQLException {
		
		/*List<Customer> bikeSeq;
		bikeSeq = (List<Customer>) daoObj.ViewCar(bikel);*/
		List<CustomerBean> bikeSeq;
		bikeSeq = (List<CustomerBean>) daoObj.ViewBike(bikel);
		return bikeSeq;
	}




	



	


}
