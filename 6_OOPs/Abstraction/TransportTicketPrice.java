/*
Q5. Transport Ticket Price – Abstract Fare System
Abstract class: Transport
Fields:
distance, baseFare
Methods:
abstract double calculateFare()
Child classes:
Bus
Fare = baseFare + distance × 4
Train
Fare = baseFare + distance × 3
If sleeper = true → add 10%
Flight
Fare = baseFare + distance × 10
Extra airport charge = ₹500
Task:
Store 7 transport bookings.
Calculate fare for each.
Show:
total revenue
highest fare
Explanation:
Covers:
Abstract method overriding
Computation logic per child class
Summing and tracking max value
Good mix of arithmetic + conditions
*/

import java.util.*;
abstract class Transport{
	int distance;
	double baseFare;
	
	Transport(int distance , double baseFare){
		this.baseFare=baseFare;
		this.distance=distance;
	}
	abstract double calculateFare();
}
class Bus extends Transport{
	
	Bus(int distance , double baseFare){
		super(distance , baseFare);
	}

	public double calculateFare(){
		return baseFare+distance*4;
	}
}
class Train extends Transport{
	boolean sleeper;
	Train(int distance , double baseFare ,boolean sleeper){
		super(distance , baseFare);
		this.sleeper=sleeper;
	}

	public double calculateFare(){
		if(sleeper){
			return (baseFare+distance*3)*0.10 + (baseFare+distance*3) ;
		}else{
			return baseFare+distance*3;
		}
	}
}class Flight extends Transport{
	
	Flight(int distance , double baseFare){
		super(distance , baseFare);
	}

	public double calculateFare(){
		return baseFare+distance*10 +500;
	}
}

class TransportTicketPrice{
	public static void main(String []x){
		Scanner sc = new Scanner(System.in);
		
		Transport t[] = new Transport[4];
		
		for(int i=0 ; i<t.length ; i++){
			System.out.println("Enter the type of transportation : 1.Bus 2.Train 3.Flight");
			int type = sc.nextInt();
			System.out.println("Enter thhe distance and basefare :");
			int distance=sc.nextInt();
			double baseFare = sc.nextDouble();

			switch(type){
				case 1:
					t[i]=new Bus(distance , baseFare);
					break;
				case 2:
					System.out.println("Enter the sleeper or not(true/false)");
					boolean sleeper = sc.nextBoolean();
					t[i]=new Train(distance , baseFare , sleeper);
					break;
				case 3:
					t[i]=new Flight(distance , baseFare);
					break;
					
			}
		}
		highFare(t);
	}
	
	public static void highFare(Transport t[]){
		double high=0;
		double total=0;
		for(int i=0 ; i<t.length ; i++){
			
			double hi = t[i].calculateFare();
			total+=hi;
			if(high <hi){
				high = hi;
			}
			
		}
		System.out.println("Highest Fare is:" + high);
		System.out.println("Total Fare is:" + total);
	}
}