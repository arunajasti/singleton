package jdbcConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import java.sql.Statement;

public class Jdbc1 {

	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");  
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","sandhya9");
			
			if(con!=null)
			{
			System.out.println("Connection Establishment");	
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
}
	}
}
