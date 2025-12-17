/*
8. Vehicle Fuel Efficiency
Task:
 Create a Vehicle class with fields: model, mileage, and fuelCapacity.
 In the main method:
Create a Vehicle object.
Calculate how far the vehicle can travel (mileage * fuelCapacity) and print the result.
Explanation:
 This reinforces using object fields for calculations.
*/
import java.util.*;
class Vehicle{
	private int mileage;
	private int fuelCapacity;
	private String model;
	
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	public int getFuelCapacity() {
		return fuelCapacity;
	}
	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
}
public class VehicleFuelEfficiency{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	
	Vehicle v = new Vehicle();
	
	System.out.print("Enter the Model of the Vehicle:");
	String mod = sc.nextLine();
	v.setModel(mod);
	
	System.out.print("Enter the Fuel Capacity of the Vehicle:");
	int f  = sc.nextInt();
	sc.nextLine();
	v.setFuelCapacity(f);
	
	System.out.print("Enter the Milage of the Vehicle:");
	int m = sc.nextInt();
	sc.nextLine();
	v.setMileage(m);
	
	
	int dis = (v.getMileage() * v.getFuelCapacity() );
	
	System.out.print("Vehicle can Travel " + dis +"km of Distance");
	
	
	
	}
} 