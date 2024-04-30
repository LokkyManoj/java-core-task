package com.chainsys.workout;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class RetrieveStudentDetails {
	public void retrieve(Connection con) throws SQLException {
		String query = "select *from studentInfo";
		Statement st = con.createStatement();

		ResultSet rows = st.executeQuery(query);
		ResultSetMetaData metaData = rows.getMetaData();
		int count = metaData.getColumnCount();
		while(rows.next()) {
			for(int i = 1;i<count;i++) {
				System.out.print(rows.getString(i)+" ");

			}
			System.out.println();
		}
		
	}
}
