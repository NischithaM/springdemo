package com.cruds.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cruds.demo.VehicleServiceProvider;

public class TestVehicleServiceProvider {

	public static void main(String[] args) {
		
	/*	VehicleServiceProvider vps=new VehicleServiceProvider();
		vps.showVehicle();*/
		
		
		//inversion of control
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
		VehicleServiceProvider vps=(VehicleServiceProvider) context.getBean("vehicleServiceProvider");
		vps.showVehicle();
	}

}
