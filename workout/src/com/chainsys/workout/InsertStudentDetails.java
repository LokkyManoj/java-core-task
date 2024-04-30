package com.chainsys.workout;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertStudentDetails {
	public void insert(Connection con) throws SQLException {
		String query = "insert into studentInfo values('diwakar',21,'Computer Science','20cs189')";
		Statement st = con.createStatement();

		int count = st.executeUpdate(query);
		System.out.println("inserted rows= " + count);
	}
}
