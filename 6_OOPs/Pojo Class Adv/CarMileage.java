/*
Q3. Problem:
Create a POJO class Car with fields: carId, model, fuelConsumed, and distanceTravelled. Store details of 5 cars using an array of objects. Perform the following operations:
Calculate the mileage of each car (mileage = distanceTravelled / fuelConsumed).
Find the car with the best mileage.
Display cars whose mileage is above the average mileage of all cars.
Why?
 Here you apply formula-based computation + comparison + filtering, just like the employee salary example, but with a different real-world scenario.
*/
import java.util.*;
class Car{
	private int carId;
	private int fuelConsumed ;
	private int distanceTravelled;
	private String model;
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public int getFuelConsumed() {
		return fuelConsumed;
	}
	public void setFuelConsumed(int fuelConsumed) {
		this.fuelConsumed = fuelConsumed;
	}
	public int getDistanceTravelled() {
		return distanceTravelled;
	}
	public void setDistanceTravelled(int distanceTravelled) {
		this.distanceTravelled = distanceTravelled;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
}

public class CarMileage{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	Car c[] = new Car[5];
	
	for(int i=0 ; i<c.length ; i++){
		c[i] = new Car();
		System.out.println("Enter the (carId, model, fuelConsumed, and distanceTravelled):");
		c[i].setCarId(sc.nextInt());
		c[i].setModel(sc.next());
		c[i].setFuelConsumed(sc.nextInt());
		c[i].setDistanceTravelled(sc.nextInt());
	}
	
	System.out.println("\nMileage of each car:");
	double maxMil =0 , mil=0,total=0;
		int tp = 0;
	for(int i=0 ; i<c.length;i++){
		 mil = (double)c[i].getDistanceTravelled()/c[i].getFuelConsumed();
		 total = total+mil;
		System.out.println("mileage of "+(i+1)+" car:"+ mil);
		if(mil>maxMil){
			maxMil = mil;
			tp = i;
		}
		
	}
	
	System.out.println("\nCar with the best mileage is: " + c[tp].getCarId() +"  "+c[tp].getModel());
	System.out.println("Mileage is:"+ maxMil);
	double avg = total/c.length;
	System.out.println("Cars whose mileage is above the average mileage of all cars:");
	for(int i=0 ; i<c.length;i++){
		mil = (double)c[i].getDistanceTravelled()/c[i].getFuelConsumed();
		if(avg<mil){
			System.out.println("CarId: "+c[i].getCarId()+" Model: "+c[i].getModel());
		}
	}
	
	
	}
}