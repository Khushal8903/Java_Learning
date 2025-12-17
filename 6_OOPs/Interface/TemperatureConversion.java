/*
Q2. Temperature Conversion – Interface for Calculation
Interface: Converter
Method:
convert(double value)

Implementing Classes:
CelsiusToFahrenheit → F = C × 9/5 + 32
FahrenheitToCelsius → C = (F – 32) × 5/9
CelsiusToKelvin → K = C + 273.15
Task:

Convert 10 values using mixed converters.
Print conversions in tabular form.
Find highest converted value.

Explanation:
Demonstrates:
Math logic in implementing classes
Common interface method
Use of interface-type array
Max value calculation
*/
import java.util.*;
interface Converter{
	public double convert(double value);
	
}

class CelsiusToFahrenheit implements Converter{
	
		public double convert(double value){
			return value*(9/5) + 32;
		}
}

class FahrenheitToCelsius implements Converter{
	
	public double convert(double value){
			return value - 32 * (5/9);
		}
}

class CelsiusToKelvin implements Converter{
	
	public double convert(double value){
			return value + 273.15;
		}
}

class TemperatureConversion{
	public static void main(String x[]){
	
	Scanner sc = new Scanner(System.in);
	
	Converter cn[] = new Converter[4];
	
	double temp[] = new double[4];
	
	for(int i=0 ; i<cn.length ; i++){
	
	System.out.println("Enter the Temperature in which type: 1.CelsiusToFahrenheit 2.FahrenheitToCelsius 3.CelsiusToKelvin");
	int type=sc.nextInt();
	
	switch(type){
		case 1:
		cn[i]=new CelsiusToFahrenheit();
		System.out.println("Enter the temperature in Celsius: ");
			double cel = sc.nextDouble();
			temp[i]=cel;
			break;
		case 2:
		cn[i]=new FahrenheitToCelsius();
		System.out.println("Enter the temperature in Fahrenheit: ");
			double fe = sc.nextDouble();
			temp[i]=fe;
			break;
		case 3:
		cn[i]=new CelsiusToKelvin();
		System.out.println("Enter the temperature in Celcius: ");
			double cel1 = sc.nextDouble();
			temp[i]=cel1;
			break;
		default:
			System.out.println("Invalid Input");
			i--;
			
		}	
	}
	
	TemperatureConversion tc = new TemperatureConversion();
	tc.display(cn, temp);
	System.out.println("---------------------------------------------------------------------------");

	System.out.println("Highest Conversion :"+ tc.highestConvertedValue(cn , temp));
	
	
	}
	
	
	public void display(Converter cn[], double value[]){
		System.out.println("Conversions in tabular form");
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("Conversion Type \t\t Input \t\t Output");
		System.out.println("---------------------------------------------------------------------------");
		for(int i=0 ; i<cn.length;i++){
		System.out.println(cn[i].getClass().getSimpleName() +"\t\t"+value[i]+"\t\t"+cn[i].convert(value[i]) );
		}
		
		}
	
	
	public double highestConvertedValue(Converter cn[],double value[]){
		double value1=0;
		for(int i=0 ; i<cn.length;i++){
			double val1 = cn[i].convert(value[i]);
			if(value1 <= val1 ){
				value1 = val1 ;
			}
		}
		return value1;
	}

}