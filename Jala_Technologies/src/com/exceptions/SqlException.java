package com.exceptions;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SqlException {

	public static void main(String[] args) {

		String update_query = "update employee_details set email='martinL@gmail.com' where empNum1 = 10011";
		try (Connection conn = DriverManager.getConnection("jdbc:oracle:thin:system/pass123@localhost:1521:XE")) {
			Statement statemnt1 = (Statement) conn.createStatement();
			ResultSet rs1 = null;
			statemnt1 = (Statement) conn.createStatement();
			System.out.println("Executing Update query using executeUpdate method");
			int return_rows = ((java.sql.Statement) statemnt1).executeUpdate(update_query);
			System.out.println("No. of Affected Rows = " + return_rows);
		} catch (SQLException sqe) {
			System.out.println(sqe);
		}
	}

}
