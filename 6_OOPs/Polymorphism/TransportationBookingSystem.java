/*
Q5. Transportation Booking System – Fare Calculation
Parent class: Transport
Fields: distance, baseFare

Child classes:
Bus
Fare = baseFare + (distance × 5)
If AC = true → add 20%
Train
Fare = baseFare + (distance × 4)
If sleeper → add 15%
Flight
Fare = baseFare + (distance × 10)
Add airport tax = ₹750
If businessClass → add 40%

Task:
Create 10 bookings.
Calculate final fare via overriding.

Print:
Total revenue
Bookings where fare > 20,000
Count bookings of each type

Concepts:
Polymorphism
Multiple child classes
Logical filtering
Summation operations
*/

import java.util.*;

class Transport{
	private int distance; 
	private int baseFare;
	
	Transport(int distance , int baseFare){
		this.distance=distance;
		this.baseFare=baseFare;
	}
	
	public int getDistance(){
		return distance;
	}
	
	public int getBaseFare(){
		return baseFare;
	}
	
	 public double getFinalFare() {
        return baseFare;
    }

    public String toString() {
        return "Distance: " + distance + "  Final Fare: " + getFinalFare();
    }
}

class Bus extends Transport{
	private boolean ac;
	Bus(int distance , int baseFare , boolean ac){
		super(distance , baseFare);
		this.ac=ac;
	}
	public double getFinalFare(){
		double fare = getBaseFare() + (getDistance() * 5);
        if (ac){
		fare += fare * 0.20;
		}
        return fare;
	}
}
class Train extends Transport{
	private boolean sleeper;
	Train(int distance , int baseFare , boolean sleeper){
			super(distance , baseFare);
			this.sleeper=sleeper;
		}
	public double getFinalFare(){
		double fare = getBaseFare() + (getDistance() * 4);
        if (sleeper){
		fare += fare * 0.15;
		}
        return fare;
	}
}
class Flight extends Transport{
	private boolean businessClass;
	Flight(int distance , int baseFare , boolean businessClass){
			super(distance , baseFare);
			this.businessClass=businessClass;
		}
	public double getFinalFare(){
		double fare = getBaseFare() + (getDistance()*10) + 750;
		if(businessClass){
			fare +=fare * 0.40;
		}
		return fare;
	}
}

public class TransportationBookingSystem{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		Transport t[] = new Transport[4];
		
		for(int i=0 ; i<t.length ; i++){
		
			System.out.println("Enter the Type of Transport: 1.Bus 2.Train 3.Flight");
			int type = sc.nextInt();
			
			System.out.println("Enter the distance and baseFare : ");
				int d = sc.nextInt();
				int bf = sc.nextInt();
				
			
			switch(type){
				case 1:	
					System.out.println("Enetr the bus type AC/NonAC(true/false):");
					boolean ty = sc.nextBoolean();
					t[i] = new Bus(d, bf ,ty );
					break;
				case 2:
					System.out.println("Enetr the train type Sleeper/Non-Sleeper(true/false):");
					boolean ty1 = sc.nextBoolean();
					t[i] = new Bus(d, bf ,ty1 );
					break;
				case 3:
					System.out.println("Enetr the flight type BusinessClass/Non-BusinessClass(true/false):");
					boolean ty2 = sc.nextBoolean();
					t[i] = new Bus(d, bf ,ty2 );
					break;
				default:
					System.out.println("Invalid Input");
					i--;
			}
		}
		
		TransportationBookingSystem tsb = new TransportationBookingSystem();
		
		System.out.println("Total Revenue :" + tsb.totalRevenue(t));
		tsb.upBooking(t);
		tsb.bookingCount(t);
	}
	
	public double totalRevenue(Transport b[]){
		double total=0;
		for(Transport k: b){
			total+=k.getFinalFare();
		}
		return total;
	}
	
	public void upBooking(Transport b[]){
		for(int i=0 ; i< b.length ; i++){
			if(b[i].getFinalFare() > 20000){
				System.out.println(b[i]);
			}
		}
	}
	
	public void bookingCount(Transport b[]){
		int bus=0 , train=0 , flight=0;
		for(Transport t : b){
			if(t instanceof Bus) bus++;
			if(t instanceof Train) train++;
			if(t instanceof Flight) flight++;
		}
		
		System.out.println("1.Bus :" + bus);
		System.out.println("2.Train :" + train);
		System.out.println("3.Flight :" + flight);
	}
	
}
