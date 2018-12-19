package com.cg.vehicle.vehi.test;


	

	import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import org.junit.After;
	import org.junit.AfterClass;
	import org.junit.Assert;
	import org.junit.Before;
	import org.junit.BeforeClass;
	import org.junit.Test;

import com.cg.vehicle.vehi.dao.IVehicleDaoImpl;
import com.cg.vehicle.vehi.exception.VehicleException;
import com.cg.vehicle.vehi.util.DBConnection;

	

	public class VehicleDaoTest {
		static IVehicleDaoImpl daotest;
		static Connection dbCon;

		@BeforeClass
		public static void initialise() {
			daotest = new IVehicleDaoImpl();
			dbCon = null;
		}

		@Before
		public void beforeEachTest() {
			System.out.println("----Starting DBConnection Test Case----\n");
		}

		/**
		 * Test case for Establishing Connection
		 * @throws SQLException 
		 * @throws IOException 
		 * 
		 * @throws DonorException
		 **/
		@Test
		public void test() throws VehicleException, IOException, SQLException {
			Connection dbCon = ((DBConnection) DBConnection.getInstance()).getConnection();
			Assert.assertNotNull(dbCon);
		}

		@After
		public void afterEachTest() {
			System.out.println("----End of DBConnection Test Case----\n");
		}

		@AfterClass
		public static void destroy() {
			System.out.println("\t----End of Tests----");
			daotest = null;
			dbCon = null;
		}

	}


