package jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Select {

	public static void main(String[] args) 
	{
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","sandhya9");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select ename from employee where eno=101");
			while(rs.next())
			{
				String empname=rs.getString("ename");
				System.out.println("Employeename  "+empname );
			}
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}  

	}

}
