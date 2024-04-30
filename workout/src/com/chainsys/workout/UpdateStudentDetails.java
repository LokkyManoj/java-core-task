package com.chainsys.workout;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateStudentDetails {
public void update(Connection con) throws SQLException {
	String query = "update studentInfo set Student_Name='Sriraman' where StudentId='20cs188'"
			+ "";
	Statement st = con.createStatement();

	int count = st.executeUpdate(query);
	System.out.println("Updated rows= " + count);
}
}
