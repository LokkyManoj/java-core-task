package com.chainsys.workout;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnection {

	public static void main(String arg[]) throws ClassNotFoundException, SQLException {
		Connection con = getConnection();
		System.out.println(con);
//		InsertStudentDetails insert1=new InsertStudentDetails();
//		insert1.insert(con);
//		UpdateStudentDetails update1=new UpdateStudentDetails();
//		update1.update(con);
//		DeleteStudentDetails delete1=new DeleteStudentDetails();
//		delete1.delete(con);
		RetrieveStudentDetails retrieve1=new RetrieveStudentDetails();
		retrieve1.retrieve(con);
	}

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "12345678");
		return con;

	}
}
