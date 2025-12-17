/*
Q1. Create a class called Library to hold accession number,title of the book,author name,price of the book and write a menu driven program in java that implements the working of a library :
		The menu options should be: 
		1. Add Book Details.
		2. Display All Book Details.
		3. Display List of all book of given author.
		4. Display list the title of specified book.
		5. Display list count of the book in the library.
		6. Display list the books in the ascending order of accession number.
		7. Update book details by title of book.
		8. Delete book details by price.
		9. Display the price range between 100 to 500.
		10. Exit The Code.
*/

import java.util.*;

class Library {
    private int accessionNo;
    private String bookTitle;
    private String authorName;
    private int price;

    public int getAccessionNo() {
        return accessionNo;
    }

    public void setAccessionNo(int accessionNo) {
        this.accessionNo = accessionNo;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class LibraryApp01 {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);

        Library[] l = new Library[100]; 
        int n = 0; 

        int choice;
        do {
            System.out.println("\n1. Add Book Details.\n"
                    + "2. Display All Book Details.\n"
                    + "3. Display List of all book of given author.\n"
                    + "4. Display list the title of specified book.\n"
                    + "5. Display list count of the book in the library.\n"
                    + "6. Display list the books in the ascending order of accession number.\n"
                    + "7. Update book details by title of book.\n"
                    + "8. Delete book details by price.\n"
                    + "9. Display the price range between 100 to 500.\n"
                    + "10. Exit The Code.\n");

            System.out.print("Enter the Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the No. of books to add: ");
                    int addCount = sc.nextInt();
                    System.out.println("Enter Book details (accessionNo title author price): ");
                    for (int i = 0; i < addCount; i++) {
                        l[n] = new Library();
                        l[n].setAccessionNo(sc.nextInt());
                        l[n].setBookTitle(sc.next());
                        l[n].setAuthorName(sc.next());
                        l[n].setPrice(sc.nextInt());
                        n++;
                    }
                    break;

                case 2:
                    System.out.println("\nAccessionNo \t Title \t Author \t Price");
                    System.out.println("----------------------------------------------------");
                    for (int i = 0; i < n; i++) {
                        System.out.println(l[i].getAccessionNo() + "\t\t" + l[i].getBookTitle() + "\t" + l[i].getAuthorName()
                                + "\t" + l[i].getPrice());
                    }
                    break;

                case 3:
                    System.out.print("Enter the Author name: ");
                    String author = sc.next();
                    boolean f = false;
                    System.out.println("\nAccessionNo \t Title \t Author \t Price");
                    System.out.println("----------------------------------------------------");
                    for (int i = 0; i < n; i++) {
                        if (l[i].getAuthorName().equalsIgnoreCase(author)) {
                            System.out.println(l[i].getAccessionNo() + "\t\t" + l[i].getBookTitle() + "\t"
                                    + l[i].getAuthorName() + "\t" + l[i].getPrice());
                            f = true;
                        }
                    }
                    if (!f) {
                        System.out.println("No books found by this author.");
                    }
                    break;

                case 4:
                    System.out.print("Enter the Accession No: ");
                    int acc = sc.nextInt();
                    boolean f2 = false;
                    for (int i = 0; i < n; i++) {
                        if (l[i].getAccessionNo() == acc) {
                            System.out.println("Title: " + l[i].getBookTitle());
                            f2 = true;
                        }
                    }
                    if (!f2) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 5:
                    System.out.println("Total no. of books in library: " + n);
                    break;

                case 6:
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = 0; j < n - i - 1; j++) {
                            if (l[j].getAccessionNo() > l[j + 1].getAccessionNo()) {
                                Library temp = l[j];
                                l[j] = l[j + 1];
                                l[j + 1] = temp;
                            }
                        }
                    }
                    System.out.println("Books sorted by Accession Number!");
                    break;

                case 7:
                    System.out.print("Enter the Title of Book to update: ");
                    String updateTitle = sc.next();
                    boolean updated = false;
                    for (int i = 0; i < n; i++) {
                        if (l[i].getBookTitle().equalsIgnoreCase(updateTitle)) {
                            System.out.println("Enter new AccessionNo, Author, Price: ");
                            l[i].setAccessionNo(sc.nextInt());
                            l[i].setAuthorName(sc.next());
                            l[i].setPrice(sc.nextInt());
                            updated = true;
                        }
                    }
                    if (!updated) {
                        System.out.println("Book not found.");
                    } else {
                        System.out.println("Book updated successfully!");
                    }
                    break;

                case 8:
                    System.out.print("Enter the Price of Book to delete: ");
                    int delPrice = sc.nextInt();
                    boolean deleted = false;
                    for (int i = 0; i < n; i++) {
                        if (l[i].getPrice() == delPrice) {
                            
                            for (int j = i; j < n - 1; j++) {
                                l[j] = l[j + 1];
                            }
                            n--;
                            i--; 
                            deleted = true;
                        }
                    }
                    if (deleted) {
                        System.out.println("Book(s) deleted successfully!");
                    } else {
                        System.out.println("No books found with that price.");
                    }
                    break;

                case 9:
                    System.out.println("\nEnter the Min price and Max price:");
					int min = sc.nextInt();
					int max = sc.nextInt();
                    boolean f1 = false;
                    for (int i = 0; i < n; i++) {
                        if (l[i].getPrice() >= min && l[i].getPrice() <= max) {
                            System.out.println(l[i].getAccessionNo() + "\t" + l[i].getBookTitle() + "\t"
                                    + l[i].getAuthorName() + "\t" + l[i].getPrice());
                            f1 = true;
                        }
                    }
                    if (!f1) {
                        System.out.println("No books found in this price range.");
                    }
                    break;

                case 10:
                    System.out.println("-----Thank You-----");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (true);

       
    }
}
