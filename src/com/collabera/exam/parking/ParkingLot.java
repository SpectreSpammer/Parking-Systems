package com.collabera.exam.parking;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
	List<SmallVehicle> smallVehicleList = new ArrayList<>();
	List<MediumVehicle> mediumVehicleList = new ArrayList<>();
	List<LargeVehicle> largeVehicleList = new ArrayList<>();
	
	
	int smallVehicleSpot;
	int mediumVehicleSpot;
	int largeVehicleSpot;
	
	public ParkingLot(int spSpot, int mpSpot, int lpSpot) {
		this.smallVehicleSpot = spSpot;
		this.mediumVehicleSpot = mpSpot;
		this.largeVehicleSpot = lpSpot;
	}
	
	
	
	public void parkVehicle(Vehicle vehicle) {
		System.out.println("Vehicle Park : " + vehicle.getVehicleType() + " vehicle");
		
		if(vehicle.getVehicleType().equals(VehicleType.SMALL)) {
			if(smallVehicleSpot > 0) {
				smallVehiclePark(vehicle);
		}else if ( mediumVehicleSpot > 0){
			mediumVehiclePark(vehicle);
		}else if ( largeVehicleSpot > 0) {
			largeVehiclePark(vehicle);
		}else {
			System.out.println("Full Parking for Small Vehicles");
			System.out.println("");
			  }
		}
		
		else if(vehicle.getVehicleType().equals(VehicleType.MEDIUM)){
			if(mediumVehicleSpot > 0) {
				mediumVehiclePark(vehicle);
			}else if (largeVehicleSpot > 0) {
				largeVehiclePark(vehicle);
			  }
			else {
				System.out.println("Full Parking for Medium Vehicles");
				System.out.println("");
			}
		}
		
		else if(vehicle.getVehicleType().equals(VehicleType.LARGE)){
			if(largeVehicleSpot > 0) {
				largeVehiclePark(vehicle);
			}else {
				System.out.println("Full Parking for Large Vehicle");
				System.out.println("");
				  }
		}
		
		
	}
	
	/** parking a vehicle*/
	 public void smallVehiclePark(Vehicle vehicle){
		SmallVehicle smallVehicle = new SmallVehicle(ParkingSpotType.SP);
		smallVehicle.setVacantSpot(false);
		smallVehicle.setVehicle(vehicle);
		vehicle.setParkingSpot(smallVehicle);
		
		smallVehicleList.add(smallVehicle);
		System.out.println("You have successfully parked your " + vehicle.getVehicleType() + " Vehicle");
		System.out.println("");
		smallVehicleSpot--;
	}
	 
	 public void mediumVehiclePark(Vehicle vehicle){
			MediumVehicle mediumVehicle = new MediumVehicle(ParkingSpotType.MP);
			mediumVehicle.setVacantSpot(false);
			mediumVehicle.setVehicle(vehicle);
			vehicle.setParkingSpot(mediumVehicle);
			
			mediumVehicleList.add(mediumVehicle);
			System.out.println("You have successfully parked your " + vehicle.getVehicleType() + " Vehicle");
			System.out.println("");
			mediumVehicleSpot--;
		}
	 
	 public void largeVehiclePark(Vehicle vehicle){
			LargeVehicle largeVehicle = new LargeVehicle(ParkingSpotType.LP);
			largeVehicle.setVacantSpot(false);
			largeVehicle.setVehicle(vehicle);
			vehicle.setParkingSpot(largeVehicle);
			
			largeVehicleList.add(largeVehicle);
			System.out.println("You have successfully parked your " + vehicle.getVehicleType() + " Vehicle");
			System.out.println("");
			largeVehicleSpot--;
		}
	 
	 
	 
	 /** unpark a vehicle*/ 
	 public void unParkVehicle(Vehicle vehicle) {
		 System.out.println("Unparking your " + vehicle.getVehicleType() + " vehicle");
		ParkingSpot parkingSpot = vehicle.getParkingSpot();
		parkingSpot.setVacantSpot(true);
		
		 if(vehicle.getVehicleType().equals(VehicleType.SMALL)) {
			if (smallVehicleList.remove(vehicle)) {
					System.out.println("Parking spot for small vehicle is available..");
					System.out.println("");
					smallVehicleSpot++;
			}
			else {
				System.out.println("Vacant Parking space for small vehicle");
				System.out.println("");
			}		
		 }
		 	else if (vehicle.getVehicleType().equals(VehicleType.MEDIUM)) {
		 		if (mediumVehicleList.remove(vehicle)) {
					System.out.println("Parking spot for medium vehicle is available..");
					System.out.println("");
					mediumVehicleSpot++;
			}
			else {
				System.out.println("Vacant Parking space for medium vehicle");
				System.out.println("");
			}
		}
		 	else if (vehicle.getVehicleType().equals(VehicleType.LARGE)) {
		 		if (largeVehicleList.remove(vehicle)) {
					System.out.println("Parking spot for large vehicle is available..");
					System.out.println("");
					largeVehicleSpot++;
			}
			else {
				System.out.println("Vacant Parking space for large vehicle");
				System.out.println("");
			}
		 }
	 }
	
	
	
	
	

}
