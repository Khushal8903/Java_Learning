/*
Q2. Animal Sound System – Abstract Behavior
Abstract class: Animal
Methods:
abstract String sound()
abstract String category()
Child classes:
Dog → sound: “Bark”, category: “Pet”
Lion → sound: “Roar”, category: “Wild”
Snake → sound: “Hiss”, category: “Reptile”
Task:
Store 10 animals (mixed types).
Print sound + category for each.
Count how many animals belong to category “Pet”.
Explanation:
Tests:
Abstract methods needing compulsory override
Multiple child classes
Logical counting based on return values
Runtime polymorphism
*/
import java.util.*;
abstract class Animal{
	abstract String sound();
	
	abstract String category();
}

class Dog extends Animal{
	
	String sound(){
		return "Bark";
	}
	String category(){
		return "Pet";
	}
}
class Lion extends Animal{
	
	String sound(){
		return "Roar";
	}
	String category(){
		return "Wild";
	}
}
class Snake extends Animal{
	
	String sound(){
		return "His";
	}
	String category(){
		
		return "Reptile";
	}
}

public class AnimalSoundSystem{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	
	Animal a[] = new Animal[10];
	
	for(int i=0 ; i<a.length ; i++){
		System.out.println("Enter the type of the Animal : 1.Dog 2.Lion 3.Snake");
		int type = sc.nextInt();
		
		switch(type){
			case 1:
				a[i]=new Dog();
				break;
			case 2:
				a[i]=new Lion();
				break;
			case 3:
				a[i]=new Snake();
				break;
			default:
				System.out.println("Invalid Input");
				i--;
		}
		
     }
	 
	 AnimalSoundSystem an = new AnimalSoundSystem();
	 int ct = an.printSoundCategory(a);
	 System.out.println("Animals belong to category Pet : " + ct);
	 
  }
	
	public int printSoundCategory(Animal a[]){
		int cnt=0;
		System.out.println("--------------------------------------------");
		System.out.println(" \t Category \t\t Sound ");
		System.out.println("--------------------------------------------");

		for(int i=0 ; i<a.length;i++){
				String str = a[i].category();
				String sound = a[i].sound();
			if(str.equals("Pet")){
				cnt++;
			}
		System.out.println((i+1) +"\t" +str +" \t\t "+sound);
			
		}
		return cnt;
	}
}