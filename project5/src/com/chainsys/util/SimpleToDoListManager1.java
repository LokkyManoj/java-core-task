package com.chainsys.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.chainsys.dao.ToDoListManager1;
import com.chainsys.model.ToDoItem1;

public class SimpleToDoListManager1 implements ToDoListManager1{
	private Connection connection;

	public SimpleToDoListManager1() throws ClassNotFoundException, SQLException {
		this.connection = ToDoListConnection1.getConnection();
	}

	public boolean signUp(String userName, String password) throws SQLException {
		String checkIfExistsQuery = "select id ,Task,due_date,username,password from todo where username = ?";
		try (PreparedStatement statement = connection.prepareStatement(checkIfExistsQuery)) {
			statement.setString(1, userName);
			ResultSet resultSet = statement.executeQuery();
			if (resultSet.next()) {
				System.out.println("This username already exists.");
				return false;
			} else {
//				String signUpQuery = "INSERT INTO todo (username, password) VALUES (?, ?)";
//				try (PreparedStatement signUpStatement = connection.prepareStatement(signUpQuery)) {
//					signUpStatement.setString(1, userName);
//					signUpStatement.setString(2, password);
//					signUpStatement.executeUpdate();
					System.out.println("Sign up successful.");
					return true;
				}
			}
		}
	
	
	

public boolean login(String userName, String password) throws SQLException {
    String loginQuery = "select id ,Task,due_date,username,password from todo where username = ? and password = ?";
    try (PreparedStatement statement = connection.prepareStatement(loginQuery)) {
        statement.setString(1, userName);
        statement.setString(2, password);
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            System.out.println("Login successful.");
            return true;
        } else {
            System.out.println("Invalid username or password.");
            return false;
        }
    }
}

	// Add task to database
	public void addTask(String userName, String password, String task, String dueDate) throws SQLException {
		String add = "INSERT INTO todo (username,password,task, due_date) VALUES (?, ?,?,?)";
		try (PreparedStatement statement = connection.prepareStatement(add)) {
			statement.setString(1, userName);
			statement.setString(2, password);

			statement.setString(3, task);
			statement.setString(4, dueDate);
			statement.executeUpdate();
		}
	}

	// Delete task from database by id
	public void deleteTask(int id) throws SQLException {
		String delete = "DELETE FROM todo WHERE id = ?";
		try (PreparedStatement statement = connection.prepareStatement(delete)) {
			statement.setInt(1, id);
			int rowsDeleted = statement.executeUpdate();
			if (rowsDeleted > 0) {
				System.out.println("Task deleted successfully.");
			} else {
				System.out.println("No task deleted.");
			}
		}
	}

	// Update task in database by id
	public void updateTask(int id, String newUserName, String newPassword, String newTask, String newDueDate)
			throws SQLException {
		String query = "UPDATE todo SET username=?,password=?,task = ?, due_date = ? WHERE id = ?";
		try (PreparedStatement statement = connection.prepareStatement(query)) {
			statement.setString(1, newUserName);
			statement.setString(2, newPassword);

			statement.setString(3, newTask);
			statement.setString(4, newDueDate);
			statement.setInt(5, id);
			int rowsUpdated = statement.executeUpdate();
			if (rowsUpdated > 0) {
				System.out.println("Task updated successfully.");
			} else {
				System.out.println("No task updated.");
			}
		}
	}

	// Retrieve all tasks from database
	public List<ToDoItem1> getAllTasks() throws SQLException {
		List<ToDoItem1> tasks = new ArrayList<>();
		String show = "SELECT * FROM todo";
		try (PreparedStatement statement = connection.prepareStatement(show)) {
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String userName = resultSet.getString("username");
				String password = resultSet.getString("password");

				String task = resultSet.getString("task");
				String dueDate = resultSet.getString("due_date");
				tasks.add(new ToDoItem1(id, userName, password, task, dueDate));
			}
		}
		return tasks;
	}

}
