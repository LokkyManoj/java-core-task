package todo.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import todo.dao.ToDoListManager1;
import todo.model.ToDoItem1;


public class SimpleToDoListManager1 implements ToDoListManager1{
	public Connection connection;

    public SimpleToDoListManager1() throws ClassNotFoundException, SQLException {
        this.connection = ToDoListConnection1.getConnection();
    }

    public boolean signUp(String managerUsername, String managerPassword) throws SQLException {
        String checkIfExistsQuery = "SELECT task_id FROM todo4 WHERE manager_username = ?";
        try (PreparedStatement statement = connection.prepareStatement(checkIfExistsQuery)) {
            statement.setString(1, managerUsername);
            ResultSet resultSet = statement.executeQuery();
            if  (resultSet.next()) {
                System.out.println("This username already exists.");
                return false;
            } else {
            	/*System.out.println(managerUsername +" "+ managerPassword);
                String signUpQuery = "INSERT INTO todo4 (manager_username, manager_password) VALUES (?, ?)";
                try (PreparedStatement signUpStatement = connection.prepareStatement(signUpQuery)) {
                    signUpStatement.setString(1, managerUsername);
                    signUpStatement.setString(2, managerPassword);
                    signUpStatement.executeUpdate();
                    System.out.println("Sign up successful.");*/
                    return true;
                }
            }
        }
    

    
    public boolean login(String managerUsername, String managerPassword) throws SQLException {
        String loginQuery = "SELECT task_id FROM todo4 WHERE manager_username = ? AND manager_password = ?";
        try (PreparedStatement statement = connection.prepareStatement(loginQuery)) {
            statement.setString(1, managerUsername);
            statement.setString(2, managerPassword);
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

    
    public void addTask(ToDoItem1 todo) throws SQLException {
        String add = "INSERT INTO todo4 (manager_username, task_id,task, due_date, employee_name, manager_password) VALUES (?, ?, ?, ?, ?,?)";
        try (PreparedStatement statement = connection.prepareStatement(add)) {
            statement.setString(1, todo.getManagerUsername());
            statement.setInt(2, todo.getTaskId());

            statement.setString(3, todo.getTask());
            statement.setDate(4, new java.sql.Date(todo.getDueDate().getTime()));
            statement.setString(5, todo.getEmployeeName());
            statement.setString(6, todo.getManagerPassword());
            statement.executeUpdate();
            System.out.println("Task assigned successfully!");
        }
    }

    public void addTask1(String managerUsername, String managerPassword, int taskId,String task, Date dueDate, String employeeName) throws SQLException {
      String add = "INSERT INTO todo4 (manager_username, manager_password,task_id ,task, due_date, employee_name) VALUES (?, ?, ?, ?, ?,?)";
      try (PreparedStatement statement = connection.prepareStatement(add)) {
          statement.setString(1, managerUsername);
          statement.setString(2, managerPassword);
          statement.setInt(3, taskId);
          statement.setString(4, task);
          statement.setDate(5, new java.sql.Date(dueDate.getTime()));

          //statement.setString(5, dueDate);
          statement.setString(6, employeeName);
          statement.executeUpdate();
          System.out.println("Task assigned successfully!");
      }
  }
    
    
    public void deleteTask( int taskId) throws SQLException {
        String delete = "DELETE FROM todo4 WHERE task_id = ? ";
        try (PreparedStatement statement = connection.prepareStatement(delete)) {
            statement.setInt(1, taskId);
            //statement.setString(2, managerUsername);
            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Task deleted successfully!");
            } else {
                System.out.println("Task not found.");
            }
        }
    }

    
    public void updateTask( int taskId, String newTask, Date newDueDate, String newEmployeeName) throws SQLException {
    	//System.out.println(taskId);
        String update = "UPDATE todo4 SET task = ?, due_date = ?, employee_name = ? WHERE task_id = ? ";
        PreparedStatement statement = connection.prepareStatement(update); 
            statement.setString(1, newTask);
            statement.setDate(2, new java.sql.Date(newDueDate.getTime()));

          //  statement.setString(2, newDueDate);
            statement.setString(3, newEmployeeName);
            statement.setInt(4, taskId);
            
            //statement.setString(5, managerUsername);
            int rowsAffected = statement.executeUpdate();
            System.out.println("rows"+rowsAffected);
            if (rowsAffected > 0) {
                System.out.println("Task updated successfully!");
            } else {
                System.out.println("Task not found or you don't have permission to update it.");
            }
    }

    public void getEmployeeDetails(String managerUsername, String employeeName) throws SQLException {
        String find = "SELECT manager_username, task, due_date FROM todo4 WHERE employee_name = ? AND manager_username = ?";
        try (PreparedStatement statement = connection.prepareStatement(find)) {
            statement.setString(1, employeeName);
            statement.setString(2, managerUsername);
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()) {
                System.out.println("\nTasks assigned by manager " + resultSet.getString("manager_username") + ":");
                System.out.println("Task: " + resultSet.getString("task"));
                //System.out.println("Due Date: " + resultSet.getString("due_date") + "\n");
                System.out.println("Due Date: " + resultSet.getDate("due_date") + "\n");

            } 
//               else { System.out.println("No employee found");
//            }
        }
    }

    
    public List<ToDoItem1> getTasksForEmployee(String employeeName) throws SQLException {
        List<ToDoItem1> tasks = new ArrayList<>();
        String query = "SELECT task, due_date FROM todo4 WHERE employee_name = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, employeeName);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                String task = resultSet.getString("task");
                Date dueDate = resultSet.getDate("due_date");
                tasks.add(new ToDoItem1());
            }
        }
        return tasks;
    }

    
    public List<ToDoItem1> getAllTasks() throws SQLException {
        List<ToDoItem1> tasks = new ArrayList<>();
        String query = "SELECT task, due_date FROM todo4";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                String task = resultSet.getString("task");
                Date dueDate = resultSet.getDate("due_date");
                tasks.add(new ToDoItem1());
            }
        }
        return tasks;
    }
    
    
    public void isActive(String managerUsername, String taskId) throws SQLException {
        String updateIsOverQuery = "UPDATE todo4 SET is_over = ? WHERE manager_username = ? AND task_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(updateIsOverQuery)) {
            System.out.print("Is the task completed? (Enter 'over' if completed, otherwise leave blank): ");
            Scanner scanner=new Scanner(System.in);
            String status = scanner.nextLine();
            if (status.equalsIgnoreCase("Over")) {
                statement.setString(1, "Over");
            } else {
                statement.setString(2, "Not Over");
            }
            statement.setString(2, managerUsername);
            statement.setString(3, taskId);
            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Task status updated successfully!");
            } else {
                System.out.println("Task not found or you don't have permission to update it.");
            }
        }
    }
    
}
