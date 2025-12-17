/*
Q1. Vehicle Insurance System – Premium Calculation
Create the following class structure:
Parent class: Vehicle
 Fields: brand, model, basePrice
 Methods: calculatePremium() → returns basePrice * 0.05

Child classes:
Car → premium increases by 12% if the car has airbags, otherwise 5%
Bike → premium increases by 8% if bike has ABS, otherwise 3%

Task:
Accept details for 5 vehicles (mix of Car and Bike).
Calculate premium using overridden logic.
Display the vehicle with the highest insurance premium.

Concepts Used
Method overriding
Polymorphism
Logical conditions
Finding maximum from object array

*/

import java.util.*;


class Vehicle{
	private String brand;
	private String model;
	private int basePrice;
	
	Vehicle(String brand , String model , int basePrice){
			this.brand=brand;
			this.model=model;
			this.basePrice=basePrice;
	}
	
	public String getBrand(){
			return brand;
	}
	public int getBasePrice(){
			return basePrice;
	}
	public String getModel(){
			return model;
	}
	
	public double calculatePremium(){
		int bs = getBasePrice();
		return bs * 0.05;
	}
	
	 public String toString() {
        return brand + " " + model + " (Base Price: " + basePrice + ")";
    }
	
}

class Car extends Vehicle{
	
	private boolean airBag;
	
	Car(String brand , String model , int basePrice , boolean ar){
		
		super(brand , model , basePrice);
		this.airBag = airBag;
	}
	
	public double calculatePremium(){
		if(airBag){
			return getBasePrice()*0.12;
		}else{
			return getBasePrice()*0.05;
		}
	}
	
	
}

class Bike extends Vehicle{
	
	private boolean Abs;
	
	Bike(String brand , String model , int basePrice , boolean Abs){
		
		super(brand , model , basePrice);
		this.Abs=Abs;
	}
	
	public double calculatePremium(){
		if(Abs){
			return getBasePrice()*0.12;
		}else{
			return getBasePrice()*0.05;
		}
	}
	
}


public class  PremiumCalculation{
	public static void main(String x[]){
		
		Scanner sc = new Scanner (System.in);
		
		Vehicle v[] = new Vehicle[5];
		
		
		for(int i=0 ; i<v.length ; i++){
			
			System.out.println("Enter the type : 1.Car  2.Bike ");
			int type = sc.nextInt();
			
			System.out.println("Enter the 1. Brand, 2.Model, 3.BasePrice of the vehicle: ");
					String br = sc.next();
					String mo = sc.next();
					int bp = sc.nextInt();
					
			if(type==1){
				System.out.println("Car Having AirBag : ");
				boolean ar = sc.nextBoolean();
				
				v[i] = new Car(br , mo , bp , ar);
			}else{
				System.out.println("Bike Having Abs : ");
				boolean abs = sc.nextBoolean();
				
				v[i] = new Bike(br , mo , bp , abs);
				
			}
				
		}
		
		Vehicle maxVehicle = v[0];
		double maxPrimiunm = v[0].calculatePremium();
		
		for(int i=1 ; i<v.length ;i++){
			
			double preimium = v[i].calculatePremium();
			
			if(preimium > maxPrimiunm){
					maxVehicle = v[i];
					maxPrimiunm = preimium;
			}
			
		}
		
		System.out.println("-------------------------------------------");
		System.out.println(maxVehicle);
		System.out.println("Primium :" + maxPrimiunm);
		
		
	}
}