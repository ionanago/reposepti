package ejemplojdbc;
import java.sql.*;

public class ejemplojdbc {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		//new com.mysql.cj.jdbc.Driver();
		
		String uri = "jdbc://localhost:3307/libreria?&serverTimezone=UTC";
		Connection con = DriverManager.getConnection(uri,"root","admin");
		System.out.println("Connectado");
		
		

	}

}
