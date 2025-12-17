/*
Q2. You need to design a transport system to calculate delivery charges.
Requirements
Create an interface Transport with:
double calculateCharge(double distance, double weight)

Create abstract class Vehicle:
vehicleNo, driverName
abstract method: double fuelCost(double distance)

Create 3 child classes:
Bike
Car
Truck

Logic:
Fuel Cost
Bike → 1 liter per 40 km, price: 110/l
Car → 1 liter per 15 km
Truck → 1 liter per 6 km

Delivery Charges
Bike → 5 × distance
Car → 10 × distance
Truck → 15 × distance + (weight × 2)

Perform:
Enter vehicle type
Enter distance, weight
Calculate transport charge
Add fuel cost
Display final amount
Explanation
This question tests:
Multiple inheritance (interface + abstract class)
Different logic in each subclass
Use of child-specific cost formulas
*/
import java.util.*;
interface Transport{
	
	double calculateCharge(double distance, double weight);
}

abstract class Vehicle{
	int vehicleNo;
	String driverName;
	Vehicle(int vehicleNo , String driverName){
		this.vehicleNo = vehicleNo;
		this.driverName=driverName;
	}
	
	 abstract double fuelCost(double distance);
}


class Bike extends Vehicle implements Transport{
	Bike(int vehicleNo , String driverName){
		super(vehicleNo , driverName);
		
	}
	
	public double calculateCharge(double distance, double weight){
		return 5*distance;
	}

	
	public double fuelCost(double distance){
			double dis = distance/40;
			return dis*110;
			
	 }
}
class Car extends Vehicle implements Transport{
	Car(int vehicleNo , String driverName){
		super(vehicleNo , driverName);
		
	}
	
	public double calculateCharge(double distance, double weight){
		return 10*distance;
	}

	
	public double fuelCost(double distance){
			double dis = distance/15;
			return dis*110;
			
	 }
}
class Truck extends Vehicle implements Transport{
	Truck(int vehicleNo , String driverName){
		super(vehicleNo , driverName);
		
	}
	
	public double calculateCharge(double distance, double weight){
		return 15*distance + (weight*2);
	}

	
	public double fuelCost(double distance){
			double dis = distance/6;
			return dis*110;
			
	 }
}

public class TransportSystem{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter Vehicle Type: 1. Bike  2. Car  3. Truck");
        int type = sc.nextInt();

        System.out.println("Enter Vehicle No:");
        int vehicleNo = sc.nextInt();

        System.out.println("Enter Driver Name:");
        String driverName = sc.next();

        System.out.println("Enter Distance (km):");
        double distance = sc.nextDouble();

        System.out.println("Enter Weight (kg):");
        double weight = sc.nextDouble();
	
		Vehicle v =null;
	switch(type){
		case 1:
			 v = new Bike(vehicleNo , driverName);
			break;
		case 2:
			 v = new Car(vehicleNo , driverName);
			break;
		case 3:
			 v = new Truck(vehicleNo , driverName);
			break;
		default:
			System.out.println("Invalid Input");
	}
	Transport t = (Transport)v;
	double charge = t.calculateCharge(distance , weight);
	double fuel = v.fuelCost(distance);
	 double total = charge + fuel;

        System.out.println("------------- BILL DETAILS -------------");
        System.out.println("Vehicle No: " + v.vehicleNo);
        System.out.println("Driver Name: " + v.driverName);
        System.out.println("Delivery Charge: " + charge);
        System.out.println("Fuel Cost: " + fuel);
        System.out.println("Final Amount: " + total);
	
	}
}