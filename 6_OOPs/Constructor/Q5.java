/*
Q5. Problem:
 Create a class Book with fields:
bookId, title, author, and price.
Use:
A default constructor to print “Book object created”.


A parameterized constructor with bookId and title.


Another parameterized constructor with bookId, title, author, and price
 that calls the previous constructor using this() (constructor chaining).
Add a method display() to show book details.
Hint:
 Use this(bookId, title) inside the main constructor to reuse initialization logic.
Explanation:
 This question checks understanding of constructor chaining, which helps avoid code duplication inside multiple constructors.
*/
import java.util.*;
public class Q5{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Bookid: ");
	int id = sc.nextInt();
	sc.nextLine();
	System.out.println("Title of the Book: ");
	String t = sc.nextLine();
	System.out.println("Author of the Book: ");
	String a = sc.nextLine();
	System.out.println("Price of the Book: ");
	int p= sc.nextInt();
	
	Book b = new Book(id , t , a , p);
	b.display();

	
	}
}
class Book{
	int Bookid;
	String title;
	String author;
	int price;
	Book(){
		System.out.println("Book object created");
	}
	Book(int Bookid , String title, String author ,int price){
		this(Bookid , title);
		this.author=author;
		this.price=price;
	}
	
	Book(int Bookid , String title){
		this();
		this.Bookid = Bookid;
		this.title=title;
	}
	
	void display(){
		System.out.println("Bookid of the Book: "+ Bookid);
		System.out.println("Title of the Book: "+ title);
		System.out.println("Author of the Book: "+ author);
		System.out.println("Price of the Book: "+ price);
			}
}