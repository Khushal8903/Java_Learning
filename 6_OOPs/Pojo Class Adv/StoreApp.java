/*
 Q2. Product Inventory Management
Create a POJO class Product with fields: id, name, category, price, quantity.
Create a Store class that holds multiple Product objects (var-args).
Implement operations:


	1.Add Product Details.
	2.Show All Product Details.
	3.Search Product Using:
		id
		name
	4.Delete Product Using:
		category
		price < 100.
	5.Update Product Using:
		id → update quantity.
		name → update price.
	6.Sort Products:
		By id ascending.
		By price descending.
	7.Display most expensive product.
	8.Display products with price range 1000–5000.
	9.Exit.
*/

import java.util.*;
class Product{
	private int id;
	private String name;
	private String category;
	private int price;
	private int quantity;
	 public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
	
	public String toString() {
	
    return id +"\t"+ name +"\t"+ category +"\t"+ price +"\t"+ quantity;
	}
}

class Store{
	Scanner sc = new Scanner(System.in);
	Product p[] ;
	
	public void addProduct(Product...np){
		// int ol = p.length;
		// int nl = ol + np.length;
		// Product temp[] = new Product[nl];
		// for(int i=0 ; i<ol ; i++){
			// temp[i] = p[i];
		// }
		// for(int i=0 ; i<nl ; i++){
			// temp[i+ol] = np[i];
		// }
		// p = temp;
		p=np;
		
	}
	 
	public void showProd(){
		System.out.println("Id\t Name\t Category\t Price\t Quantity");
		System.out.println("---------------------------------------------------");
		for(int i=0 ; i<p.length ;i++){
			System.out.println(p[i]);
		}
	}
	
	public void searchProd(){
		System.out.println("Enter the Choice: ");
		int search = sc.nextInt();
		switch(search){
			case 1:
				System.out.println("Enter the Id:");
				int id = sc.nextInt();
				boolean sf = false;
				System.out.println("Id\t Name\t Category\t Price\t Quantity");
				System.out.println("---------------------------------------------------");

				for(int i=0 ; i<p.length ; i++){
					if(id == p[i].getId()){
						System.out.println(p[i]);
						sf = true;
					}
				}
				if(!sf){
					System.out.println("Product Not Found");
				}
				break;
			case 2:
				System.out.println("Enter the name:");
				String name = sc.next();
				boolean nf = false;
				System.out.println("Id\t Name\t Category\t Price\t Quantity");
				System.out.println("---------------------------------------------------");
				for(int i=0;i<p.length;i++){
					if(name.equalsIgnoreCase(p[i].getName())){
						System.out.println(p[i]);
						nf = true;
					}
				}
				if(!nf){
					System.out.println("Product Not Found");
				}
				break;
		}
	}

	public void deleteProd(){
		System.out.println("Enter the choice:");
		int dch = sc.nextInt();
		switch(dch){
			case 1:
				System.out.println("Enter the Category:");
				String cat = sc.next();
				boolean dc = false;

				for (int i = 0; i < p.length; i++) {
					if (p[i] != null &&cat.equalsIgnoreCase(p[i].getCategory())) {
						for (int j = i; j < p.length - 1; j++) {
							p[j] = p[j + 1];
						}
						p[p.length - 1] = null; 
						dc = true;
						i--; 
						}
				}

				if (!dc) {
					System.out.println("Product not found");
				} else {
					System.out.println("Product(s) deleted successfully");
				}
				break;
			case 2:
				
				boolean pf = false;
				for(int i=0 ; i<p.length;i++){
					if(p[i].getPrice() < 100){
						for(int j=0 ;j<p.length-1;j++){
							p[j]=p[j+1];
						}
						pf=true;
						i--;
						p[p.length-1] = null;
					}
					
				}
				if (!pf) {
					System.out.println("Product not found");
				} else {
					System.out.println("Product(s) deleted successfully");
				}
				break;
		}
		
	}

	public void updateProd(){
		System.out.println("Enter the choice:");
		int uch = sc.nextInt();
		switch(uch){
			case 1:
				System.out.println("Enter the Id:");
				int idu = sc.nextInt();
				boolean up=false;
				System.out.println("Id\t Name\t Category\t Price\t Quantity");
				System.out.println("---------------------------------------------------");
				for(int i=0 ; i<p.length;i++){
					if(idu == p[i].getId()){
						System.out.println("Enter the (name, category, price, quantity) ");
						p[i].setName(sc.next());
						p[i].setCategory(sc.next());
						p[i].setPrice(sc.nextInt());
						p[i].setQuantity(sc.nextInt());
						}
						up=true;
				}
				if(!up){
					System.out.println("Product not found");
				}else{
					System.out.println("Product update Successfull!");
				}
				break;
			case 2:
				System.out.println("Enter the Name:");
				String name1 = sc.next();
				boolean fn = false;
				System.out.println("Id\t Name\t Category\t Price\t Quantity");
				System.out.println("---------------------------------------------------");
				for(int i=0 ; i<p.length;i++){
					if(name1.equalsIgnoreCase(p[i].getName())){
						System.out.println("Enter the (name, category, price, quantity) ");
						p[i].setName(sc.next());
						p[i].setCategory(sc.next());
						p[i].setPrice(sc.nextInt());
						p[i].setQuantity(sc.nextInt());
						}
						fn=true;
				}
				if(!fn){
					System.out.println("Product not found");
				}else{
					System.out.println("Product update Successfull!");
				}
				break;
		}
	}

	public void sortProd(){
		System.out.println("Enter the Choice:");
		int  sch = sc.nextInt();
		switch(sch){
			case 1:
				for(int i=0 ; i<p.length-1;i++){
					for(int j=0 ;j<p.length-1-i ;j++){
						if(p[j].getId() > p[j+1].getId()){
							Product temp = p[j];
							p[j]=p[j+1];
							p[j+1] = temp;
							
						}
					}
					
				}
				System.out.println("Products are sorted bt id ascending");
				break;
			case 2:
				for(int i=0 ; i<p.length-1;i++){
					for(int j=0 ;j<p.length-1 ;j++){
						if(p[j].getPrice() < p[j+1].getPrice()){
							Product temp = p[j];
							p[j]=p[j+1];
							p[j+1] = temp;
							
						}
					}
					
				}
				System.out.println("Products are sorted bt id ascending");
				break;
		}
		
	}

	public void expensiveProd(){
		int exp=0 , k=0;
		for(int i=0 ;i<p.length ;i++){
			if(exp <p[i].getPrice()){
				exp = p[i].getPrice();
				k=i;
			}
		}
		System.out.println("Id\t Name\t Category\t Price\t Quantity");
		System.out.println("---------------------------------------------------");
		System.out.println(p[k]);
	}
	
	public void priceRangeDisp(){
		boolean fo = false;
		System.out.println("Id\t Name\t Category\t Price\t Quantity");
		System.out.println("---------------------------------------------------");
		for(int i=0 ;i<p.length ;i++){
			if((p[i].getPrice() >= 1000 && p[i].getPrice() <= 5000)){
				System.out.println(p[i]);
				fo = true;
			}
		}
		if(!fo){
					System.out.println("Product not found");
				}
	}
}			

	
	

public class StoreApp{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	
	Store st = new Store();
	
	while(true){
	
	System.out.println("\n\n1.Add Product Details."
                    + "\n2.Show All Product Details."
                    + "\n3.Search Product By: 1.Id  2.Name."
                    + "\n4.Delete Product Using: 1.category  2.price < 100."
                    + "\n5.Update Product Using: 1.id   2.name "
                    + "\n6.Sort Products: 1.By id ascending.  2.By price descending."
                    + "\n7.Display most expensive product."
                    + "\n8.Display products with price range 1000–5000."
                    + "\n9. Exit.");
					
			
	System.out.println("Enter the Choice");
	int ch = sc.nextInt();
		switch(ch){
			case 1:
					System.out.println("Enter the no of product add:");
					int addprod=sc.nextInt();
					System.out.println("Enter the Product detail(id, name, category, price, quantity):");
					Product np[] = new Product[addprod];
					for(int i=0 ; i<addprod ;i++){
						np[i] = new Product();
						np[i].setId(sc.nextInt());
						np[i].setName(sc.next());
						np[i].setCategory(sc.next());
						np[i].setPrice(sc.nextInt());
						np[i].setQuantity(sc.nextInt());
					}
					st.addProduct(np);
					break;
			case 2:
					st.showProd();
					break;
			case 3:
				st.searchProd();
				break;
			case 4:
				st.deleteProd();
				break;
			case 5:
				st.updateProd();
				break;
			case 6:
				st.sortProd();
				break;
			case 7:
				st.expensiveProd();
				break;
			case 8:
				st.priceRangeDisp();
				break;
			case 9:
					System.out.println("-------Thank You------");
					return;
				}
					
		}
	
	}
}
