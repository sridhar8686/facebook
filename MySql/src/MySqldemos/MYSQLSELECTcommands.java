package MySqldemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*1)create connection
2)create statement
3)Execute statement/Query
4)store data in result-set
4)close connection*/

public class MYSQLSELECTcommands {

	public static void main(String[] args) throws SQLException {
		
//1)create connection
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","root");
		
		//2)create statement
		
		Statement stmt = con.createStatement();
		String s = "select employee_id,first_name,last_name,salary from employees where (salary>10000) desc";
		ResultSet rs = stmt.executeQuery(s);
		
		while (rs.next()) {
			
			int eid = rs.getInt("employee_id");
			String fname = rs.getString("first_name");
			String lname = rs.getString("last_name");
			int Sal= rs.getInt("salary");
			
			System.out.println(eid+"  "+fname+"  "+lname+"  "+Sal);		
					
			
		}
			con.close();
			
			System.out.println("Query is executed.......");
			
		
	
	}

}
