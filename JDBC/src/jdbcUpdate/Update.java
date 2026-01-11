package jdbcUpdate;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection; 

public class Update {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		String name = "Dadu";
		String city = "Pune";

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "Pass@123");

		// ---------Update-------------//
		PreparedStatement ps1 = con.prepareStatement("update register set city=? where name=?");
		ps1.setString(1, city);
		ps1.setString(2, name);
		int i = ps1.executeUpdate();

		if (i > 0) {
			System.out.println("Success");
		} else {
			System.out.println("Error");
		}
	}

}
