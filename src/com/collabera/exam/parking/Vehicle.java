package com.collabera.exam.parking;

public class Vehicle {

	private VehicleType vehicleType;
	private ParkingSpot parkingSpot;
	
	
	//constructor for vehicle
	public Vehicle(VehicleType vehicleType) {
		
		this.vehicleType = vehicleType;
	}
	
	
	public VehicleType getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}
	public ParkingSpot getParkingSpot() {
		return parkingSpot;
	}
	public void setParkingSpot(ParkingSpot parkingSpot) {
		this.parkingSpot = parkingSpot;
	}
	
	
	
	
	
}
