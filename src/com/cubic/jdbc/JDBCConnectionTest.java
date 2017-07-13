package com.cubic.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnectionTest {

	public static void main(String[] args) throws SQLException {
		JDBCConnection jc = new JDBCConnection();
		Connection conn = null;
		try {
			conn = jc.getConnection();
			System.out.println("Connection successfull");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("Select * from customers");
			while(rs.next()) {
				  System.out.println("Customer " +  rs.getString(2)+"'s favourite item is " + " " + rs.getString(3) );
				}
			
		conn.close();
		System.out.println("Connection closed..");
		
		

	}

}
