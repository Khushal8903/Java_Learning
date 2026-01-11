package jdbcInsertion;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;                 

public class Insertion {
	 public static void main(String[] args) throws SQLException {
	        try {
	        	//------------- User Value---------------//
	        	String name1 = "Dadu";
	        	String email = "khushalpatil9108@gmail.com";
	        	String pass = "Pass@123";
	        	String gender = "male";
	        	String city = "Pune";
	        	
	        	
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            
	           Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "Pass@123");
	            
	           //PreparedStatement ps = con.prepareStatement("insert into register values('Khushal' , 'khushalpatil9108@gmail.com' , 'Pass@123' , 'male' , 'Pune' )");
	         
	           	PreparedStatement ps = ((java.sql.Connection) con).prepareStatement("insert into register values(? ,? ,? ,? ,?)");
	           	ps.setString(1, name1);
	            ps.setString(2, email);
	            ps.setString(3, pass);
	            ps.setString(4, gender);
	            ps.setString(5, city);
	           	
	           int i= ps.executeUpdate();
	           if(i>0) {
	        	   System.out.println("Success");
	           }else {
	        	   System.out.println("Fail");
	           }
	           
	           
	           // System.out.println("Driver loaded successfully");
	            
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	    }
}
