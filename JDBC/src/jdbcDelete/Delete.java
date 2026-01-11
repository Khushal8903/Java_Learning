package jdbcDelete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String name = "Dadu";
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "Pass@123");

		PreparedStatement ps = con.prepareStatement("delete from register where name=?");
		ps.setString(1, name);
		int i=ps.executeUpdate();
		
		if(i>0) {
			System.out.println("Success");
		}else {
			System.out.println("Error");
		}
	}

}
