/*
4. Player High Score
Task:
 Create a Player class with fields: name and score.
 In the main method:
Create two individual Player objects.
Compare their scores and print the name of the player with the higher score.
Explanation:
 This helps to understand comparing fields between objects.
*/
import java.util.*;
class Player{
	private String name;
	private int score;
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	public void setScore(int score){
		this.score = score;
	}
	public int getScore(){
		return score;
	}
}

public class PlayerHighScore{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the No. of Player:");
	int n = sc.nextInt();
	sc.nextLine();
	
	Player  p[] = new Player[n];
	for(int i = 0 ; i <p.length ; i++){
		p[i] = new Player();
		
		System.out.print("Enter the Name of the Player:");
		String s = sc.nextLine();
		p[i].setName(s);
		
		System.out.print("Enter the Score of the Player:");
		int sal = sc.nextInt();
		sc.nextLine();
		p[i].setScore(sal);
		
	}
	int maxScore = 0 ;
	for(int i=0 ; i<p.length-1;i++){
		if(p[i].getScore()>maxScore){
			maxScore = i;
		}
	}
	System.out.print("Name of the Higher Score player:\n"+p[maxScore].getName());
	
	}
}