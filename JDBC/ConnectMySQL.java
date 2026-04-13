package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class ConnectMySQL {
	public static void main(String[] args) throws Exception{
		// Created DB // Finished 
		// Create Statement / Using Driver // finished
		// Execute the Query // finished
		// Process the Query // finished
		// close the Connection
		String url="jdbc:mysql://localhost:3306/Saveetha";
		String user="root";
		String password="90432662Dk";
		
		Connection con=DriverManager.getConnection(url,user,password);
		// Insert values on Database
//		String query="insert into student values(2,'Nandhini',85)";
//		Statement st=con.createStatement();
//		int rows=st.executeUpdate(query);
//		
//		System.out.println(rows +"Rows is Affected in your Database");
		// Read the Values
//		String query="select * from student";
//		Statement st=con.createStatement();
//		ResultSet rs=st.executeQuery(query);
//		while(rs.next()) {
//			System.out.println(rs.getInt("id")+" "+
//		rs.getString("name")+" "+rs.getInt("mark"));
//		}
//		// or
//		while(rs.next()) {
//			System.out.println(rs.getInt(1)+" "+
//		rs.getString(2)+" "+rs.getInt(3));
//		}
		// Update 
//		String query="update student set mark=95 where id=2";
//		Statement st=con.createStatement();
//		int rows=st.executeUpdate(query);
//		System.out.println(rows +" Rows is Affected in your Database");
		
		// Deleter
		String query="delete from student where id=2";
		Statement st=con.createStatement();
		int rows=st.executeUpdate(query);
		System.out.println(rows +" Rows is Affected in your Database");
		
	}

}
