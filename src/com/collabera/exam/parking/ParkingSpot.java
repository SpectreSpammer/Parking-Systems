package com.collabera.exam.parking;

public class ParkingSpot {
	
	private ParkingSpotType type;
	private Vehicle vehicle;
	private Boolean vacantSpot;
	
		
		/*
		 * Constructors for Parking spot type
		 */
		public ParkingSpot(ParkingSpotType parkingSpotType) {
			this.type = parkingSpotType;
		}
		
		/*
		 * Getters and Setters
		 */
	public ParkingSpotType getType() {
		return type;
	}
	public void setType(ParkingSpotType type) {
		this.type = type;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public Boolean getVacantSpot() {
		return vacantSpot;
	}
	public void setVacantSpot(Boolean vacantSpot) {
		this.vacantSpot = vacantSpot;
	}
	
	

}
