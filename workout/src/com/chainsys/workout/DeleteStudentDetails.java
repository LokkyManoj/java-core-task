package com.chainsys.workout;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteStudentDetails {
	public void delete(Connection con) throws SQLException {
		String query = "delete from studentInfo where StudentId='20cs188'";
		Statement st = con.createStatement();

		int count = st.executeUpdate(query);
		System.out.println("deleted rows= " + count);
	}

}
