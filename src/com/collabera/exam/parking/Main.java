package com.collabera.exam.parking;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**Vehicles
				*Small 
				*Medium
				*Large

		*Parking Lot 
			* List <Parking Spot>
			* smallVehicleSpot
			* mediumVehicleSpot
			* largeVehicleSpot
			*parkVehicle()
			*unparkvehicle()

		*Parking Spot
			*smallVehicleSpot
			*mediumVehicleSpot
			*largeVehicleSpot
			*
		 */
	
		
		ParkingLot parkingLot = new ParkingLot(2,2,2);
		
		Vehicle smallVehicle = new Vehicle(VehicleType.SMALL);
		Vehicle mediumVehicle = new Vehicle(VehicleType.MEDIUM);
		Vehicle largeVehicle = new Vehicle(VehicleType.LARGE);
		
		parkingLot.parkVehicle(smallVehicle);
		
		
		parkingLot.parkVehicle(mediumVehicle);
		parkingLot.parkVehicle(mediumVehicle);
		parkingLot.unParkVehicle(mediumVehicle);
		
		parkingLot.parkVehicle(largeVehicle);
		parkingLot.parkVehicle(largeVehicle);
		parkingLot.unParkVehicle(largeVehicle);
		
		
	}
	
}
	
	


