/*
1. Library Book Management
Task:
 Create a Book class with fields: title, author, and price.
 In the main method:
Create two individual Book objects.
Compare the prices of the two books and print the title of the more expensive book.
Explanation:
 This task teaches object instantiation and accessing instance variables directly to perform comparisons.
*/
import java.util.*;
class Book{
		private String title;
		private String author;
		private int price;
		
		public void setTitle(String title){
			this.title=title;
		}
		public String getTitle(){
			return title;
		}
		
		void setAuthor(String author){
			this.author = author;
		}
		String getAuthor(){
			return author;
		}
		void setPrice(int price){
			this.price = price;
		}
		int getPrice(){
			return price;
		}
	}
	
	
public class LibraryBookManagement{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		Book b[] = new Book[2];
		for(int i=0 ; i<b.length ; i++){
			b[i] = new Book();
			System.out.println("Enter the book data in the form:( Title , Price , Author)");
			String t = sc.nextLine();
			int p = sc.nextInt();
			sc.nextLine();
			String a = sc.nextLine();
			
			b[i].setTitle(t);
			b[i].setAuthor(a);
			b[i].setPrice(p);	
		}
		
		int bid=0;
		for(int i=0 ; i<b.length-1 ; i++){
			if(b[i].getPrice() > b[i+1].getPrice() ){
				bid = i;
			}else{
				bid = i+1;
			}
		}
		System.out.println();
		System.out.println("--------------------------------------------------------------------------");
		System.out.println(b[bid].getTitle());
		
	}
}