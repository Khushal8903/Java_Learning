package jdbcFetchData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FetchData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
	
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "Pass@123");

		PreparedStatement ps = con.prepareStatement("select * from register");
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			
			String name1 = rs.getString("name"); 
			System.out.print("Name :" + name1);
			String Email = rs.getString("email"); 
			System.out.print("Email :" + Email);
			String pass = rs.getString("password"); 
			System.out.print("Password :" + pass);
			String gender = rs.getString("gender"); 
			System.out.print("Gender :" + gender);
			String city = rs.getString("city"); 
			System.out.print("City :" + city);
		}
		
	}

}
