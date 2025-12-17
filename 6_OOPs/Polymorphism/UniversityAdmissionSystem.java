/*
Q3. University Admission System – Priority Ranking
Base class: Applicant
Fields: name, score
 Method: getRankScore() → returns score directly
 
Child classes:
SportsQuota: adds +15 to score
DefenseQuota: adds +10 to score
General: no extra
NRIQuota: +20 but fee is 3× normal

Task:
Take 12 applicants (mix of all categories).
Override getRankScore() in each child.
Sort applicants by rank score (high to low).
Print top 3 shortlisted candidates.

Concepts
Overriding
Sorting array of objects
Multiple child classes
Priority logic
*/
import java.util.*;
class Applicant{
	private String name;
	private double score;
	private int fee;
	
	Applicant(String name , double score , int fee){
		this.name = name;
		this.score=score;
		this.fee=fee;
	}
	
	public String getName(){
		return name;
	}
	
	public double getScore(){
		return score;
	}
	
	public int grtfee(){
		return fee;
	}
	
	public double getRankScore(){
		return score;
	}
	
	public String toString(){
		return name +"\t\t" + getRankScore() +"\t\t"+ fee;
	}
}

class SportsQuota extends Applicant{
	SportsQuota(String name , double score , int fee ){
		super(name , score , fee);
	}
	
	public double getRankScore(){
		return getScore()+15;
	}

}

class DefenseQuota extends Applicant{
	DefenseQuota(String name , double score , int fee ){
		super(name , score , fee);
	}
	
	public double getRankScore(){
		return getScore()+10;
	}

}

class General extends Applicant{
	General(String name , double score , int fee ){
		super(name , score , fee);
	}
	
	public double getRankScore(){
		return getScore();
	}

}

class NRI extends Applicant{
	NRI(String name , double score , int fee ){
		super(name , score , fee*3);
	}
	
	public double getRankScore(){
		return getScore()+20;
	}

}

public class UniversityAdmissionSystem{
	public static void main(String x[]){
	
	Scanner sc = new Scanner(System.in);
	
		Applicant ap[] = new Applicant[2];
		
		for(int i=0 ; i<ap.length ; i++){
			
			System.out.println("Enter the type of the Applicant: 1.SportsQuota 2.DefenseQuota 3.General 4.NRI");
			int type = sc.nextInt();
			System.out.println("Enter the Name, Score, Fees of the Applicant");
				String name =sc.next();
				double score = sc.nextDouble();
				int fee = sc.nextInt();
			switch(type){
				case 1:
					ap[i] = new SportsQuota(name , score , fee);
					break;
				case 2:
					ap[i] = new DefenseQuota(name , score , fee);
					break;
				case 3:
					ap[i] = new General(name , score , fee);
					break;
				case 4:
					ap[i] = new NRI(name , score , fee);
					break;
				default:
					System.out.println("Invalid Input");
					
			}
			
		}
		
		for(int i=0 ; i<ap.length;i++){
			for(int j=i+1 ; j<ap.length;j++){
				if(ap[i].getRankScore()<ap[j].getRankScore()){
					Applicant temp = ap[i];
					ap[i] = ap[j];
					ap[j]=temp;
				}
			}
			
		}
		
		System.out.println("---------------------------------------------------------------------");
		
		for(int i=0 ;i<3 ;i++){
			System.out.println(ap[i]);
		}
				
	}
}