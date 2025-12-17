/*
Q4. Problem:
 Create a POJO class Player with fields: playerId, name, runs, and matches. Store details of 5 players using an array of objects. Perform the following operations:
Calculate the average runs per match for each player.
Find and display the player with the highest batting average.
Print the details of players whose batting average is above the team average.
Why?
 This teaches ratio calculations, finding max averages, and filtering players — same aggregation + comparison style.
 */
import java.util.*;
class Player{
	private int playerId;
	private  String name;
	private int runs;
	private int matches;
	
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getMatches() {
		return matches;
	}
	public void setMatches(int matches) {
		this.matches = matches;
	}
} 

public class PlayerAvg{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	
	Player p[] = new Player[5];
	System.out.println("Enter the 5 player info(playerId, name, runs, and matches):");
	
	for(int i=0 ; i<p.length ; i++){
		p[i] = new Player();
		p[i].setPlayerId(sc.nextInt());
		p[i].setName(sc.next());
		p[i].setRuns(sc.nextInt());
		p[i].setMatches(sc.nextInt());
		
	}
	
	System.out.println("The average runs per match for each player:");
	double hAvg = 0 , avg =0,total=0 ;
	int tp =0 ;
	for(int i=0 ; i<p.length;i++){
		 avg = (double)p[i].getRuns()/p[i].getMatches();
		 total = total+avg;
		System.out.println("Average of "+(i+1)+"Player is:"+avg);
		if(avg>hAvg){
			hAvg = avg ;
			tp=i;
		}
	}
	
	System.out.println("The player with the highest batting average:\n"+"Name: " +p[tp].getName() +" Highest Average:"+hAvg);
	
	
	System.out.println("Details of players whose batting average is above the team average:");
	for(int i=0 ; i<p.length ; i++){
		avg = (double)p[i].getRuns()/p[i].getMatches();
		if(total/p.length<avg){
			System.out.println("PlayerId: "+p[i].getPlayerId()+" Name: " + p[i].getName());
		}
	}
	
	}
}