package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Jdbcdemo {

	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");  
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","sandhya9");
			Statement st=con.createStatement();
			st.executeUpdate("Create table Employee(eno number(3),ename varchar(15),salary number(8,2))");
			st.executeUpdate("insert into Employee values(100,'aruna',1111.99)");
			st.executeUpdate("insert into Employee values(101,'rama',9999.99)");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
}
	}

}
