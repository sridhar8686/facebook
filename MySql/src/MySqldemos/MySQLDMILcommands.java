package MySqldemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*1)create connection
2)create statement
3)Execute statement/Query
4)close connection*/



public class MySQLDMILcommands {

	public static void main(String[] args) throws SQLException {
		
//1)create connection
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
		
		//2)create statement
		
		Statement stmt = con.createStatement();
		
		//String s = "INSERT INTO STUDENT VALUES (103,'SMITH',76)";
		//String s = "update student set sname='jhon' where sno=103";
		//String s = "delete from student where sname = 'jhon'";
		
		//)Execute statement/Query
		stmt.execute(s);
		//4)close connection
		con.close();
		System.out.println("Query is executed");
		
		
	}

}
