package com.cruds.demo;
//utility class -doesnot extends or implements
public class VehicleServiceProvider {

	//IVehicleProvider vp=new VLRTransport();
	//IVehicleProvider vp=new SRSTransport();
	//interface and implementing class
	
	IVehicleProvider vp;//dependency injection
	public void showVehicle()
	{
		System.out.println(vp.getVehicle());
	}
	//setter injection
	public void setVp(IVehicleProvider vp) {
		this.vp = vp;
	}
	
	
}
