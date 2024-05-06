

//package com.chainsys.remainderApp;
//
//import java.sql.SQLException;
//import java.util.List;
//
//public interface ToDoListManager1 {
//    boolean signUp(String managerUsername, String managerPassword) throws SQLException;
//
//    boolean login(String managerUsername, String managerPassword) throws SQLException;
//
//    void addTask(String managerUsername, String managerPassword,String task, String dueDate, String employeeName) throws SQLException;
//
//    List<ToDoItem1> getTasksForEmployee(String employeeName) throws SQLException;
//    
//
//    List<ToDoItem1> getAllTasks() throws SQLException;
//}
//


package com.chainsys.remainderApp;

import java.sql.SQLException;
import java.util.List;

public interface ToDoListManager1 {
    boolean signUp(String managerUsername, String managerPassword) throws SQLException;

    boolean login(String managerUsername, String managerPassword) throws SQLException;

    void addTask(ToDoItem1 todo) throws SQLException;
    void addTask1(String managerUsername, String managerPassword,int taskId, String task, String dueDate, String employeeName)throws SQLException;

    void deleteTask(int taskId) throws SQLException;

    void updateTask( int taskId, String newTask, String newDueDate, String newEmployeeName) throws SQLException;

    List<ToDoItem1> getTasksForEmployee(String employeeName) throws SQLException;

    List<ToDoItem1> getAllTasks() throws SQLException;
    void getEmployeeDetails(String managerUsername, String employeeUsername) throws SQLException;
}

