package com.chainsys.dao;

import java.sql.SQLException;
import java.util.List;

import com.chainsys.model.ToDoItem1;

public interface ToDoListManager1 {
public boolean signUp(String userName, String password) throws SQLException;
	
	public boolean login(String userName, String password) throws SQLException;

	void addTask(String userName,String password,String task, String dueDate) throws SQLException;

	void deleteTask(int index) throws SQLException;

	void updateTask(int index,String newUserName,String newPassword, String newTask, String newDueDate) throws SQLException;

	List<ToDoItem1> getAllTasks() throws SQLException;
}
