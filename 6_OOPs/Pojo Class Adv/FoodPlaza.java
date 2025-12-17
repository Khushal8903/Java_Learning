/*
Write a java to Create class name as Food with using data memberfid,fname,fprice, fcategory using do while and switch case.
create array of object of size 5 ,store the food details in it and perform following operations.
	
	1 : Add All Food details.
	2 : Display All Food details.
	3 : Display Bill Details :
		1 :  Bill Without Gst.
		2 : Bill With 18% Gst.
*/
import java.util.*;
class Food{
	private int fid;
	private int fprice;
	private String fname;
	private String fcategory;
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public int getFprice() {
		return fprice;
	}
	public void setFprice(int fprice) {
		this.fprice = fprice;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getFcategory() {
		return fcategory;
	}
	public void setFcategory(String fcategory) {
		this.fcategory = fcategory;
	}
	
}

public class FoodPlaza{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	
	Food f[] = new Food[5];
	
	
	do{
		System.out.println("\n1 : Add All Food details.\n"+
							"2 : Display All Food details.\n"+
							"3 : Display Bill Details :\n"+
								"\t1 :  Bill Without Gst.\n"+
								"\t2 : Bill With 18% Gst.");
								
		System.out.println("\nEnter the Choice:");
		int ch = sc.nextInt();
		switch(ch){
			case 1: System.out.println("Enter the Food Detail (fid,fname,fprice, fcategory):");
						for(int i=0 ;  i<f.length ; i++){
							f[i] = new Food();
							
							f[i].setFid(sc.nextInt());
							f[i].setFname(sc.next());
							f[i].setFprice(sc.nextInt());
							f[i].setFcategory(sc.next());
							
						}
					break;
			case 2: System.out.println("All Food Detail:");
						System.out.println("fid\tfname\tfprice\tfcategory");
						for(int i=0 ;  i<f.length ; i++){							
							System.out.println(f[i].getFid()+"\t"+f[i].getFname()+"\t"+f[i].getFprice()+"\t"+f[i].getFcategory());
							
						}
					break;
			case 3:System.out.println("Enter the Choice:");
					int c = sc.nextInt();
					switch(c){
						case 1:	int total=0;
								System.out.println("Bill Without GST\n-------------------------------------------------------");
								System.out.println("fid\tfname\tfprice\tfcategory");
									for(int i=0 ; i<f.length;i++){
										System.out.println(f[i].getFid()+"\t"+f[i].getFname()+"\t"+f[i].getFprice()+"\t"+f[i].getFcategory());
										total+=f[i].getFprice();
									}
								System.out.println("-----------------------------------------------------------");
										System.out.println("Total =" + total);
								break;
						case 2:double total1=0;
								System.out.println("Bill With GST\n-------------------------------------------------------");
								System.out.println("fid\tfname\tfprice\tfcategory");
									for(int i=0 ; i<f.length;i++){
										System.out.println(f[i].getFid()+"\t"+f[i].getFname()+"\t"+f[i].getFprice()+"\t"+f[i].getFcategory());
										total1+=f[i].getFprice();
									}
								System.out.println("-----------------------------------------------------------");
										total1 =(double)total1+(total1*18/100);
										System.out.println("Total =" + total1);
								break;
					}
					break;
			case 4:
				System.out.println("----------Thank You----------");
					return;
					
		}
	
	
	}while(true);
	
	}
}