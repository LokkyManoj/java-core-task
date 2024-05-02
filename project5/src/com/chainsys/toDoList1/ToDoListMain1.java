package com.chainsys.toDoList1;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoListMain1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
			try {
				ToDoListManager1 manager = new SimpleToDoListManager1();
				// Validation validate = new Validation();
				

				System.out.println("Welcome to Remainder App!!");
				System.out.println("Enter your UserName:");
				String userName = scanner.next();
				System.out.println("Enter your Password:");
				String password = scanner.next();
				
					boolean exit = false;
					while (!exit) {
						System.out.println("Remainder App:");
						System.out.println("1. Add Task");
						System.out.println("2. Delete Task");
						System.out.println("3. Update Task");
						System.out.println("4. Display All Tasks");
						System.out.println("5. Exit");
						System.out.print("Enter your choice: ");
						int choice = scanner.nextInt();
						scanner.nextLine();

						switch (choice) {
						case 1:
							System.out.print("Enter task: ");
							String task = scanner.nextLine();
							System.out.print("Enter due date (YYYY-MM-DD): ");
							String dueDate = scanner.nextLine();
							manager.addTask(userName, password, task, dueDate);
							break;
						case 2:
							displayTask(manager);
							System.out.print("Enter index of task to delete: ");
							int indexToDelete = scanner.nextInt();
							scanner.nextLine();
							manager.deleteTask(indexToDelete);
							break;
						case 3:
							displayTask(manager);
							System.out.print("Enter index of task to update: ");
							int indexToUpdate = scanner.nextInt();
							scanner.nextLine();
							System.out.print("Enter new task: ");
							String newTask = scanner.nextLine();
							System.out.print("Enter new due date (YYYY-MM-DD): ");
							String newDueDate = scanner.nextLine();
							manager.updateTask(indexToUpdate, userName, password, newTask, newDueDate);
							break;
						case 4:
							displayTask(manager);
							break;
						case 5:
							exit = true;
							break;
						default:
							System.out.println("Invalid choice. Please try again.");
							break;
						}
					}
					System.out.println("Exiting ToDo list application.");
					scanner.close();
				

			} catch (ClassNotFoundException | SQLException e) {
				System.err.println("Error: " + e.getMessage());
			}

		}

	

	static void displayTask(ToDoListManager1 manager) {
		try {
			List<ToDoItem1> tasks = manager.getAllTasks();
			System.out.println("All Tasks:");
			for (int i = 0; i < tasks.size(); i++) {
				System.out.println(i + ". " + tasks.get(i));
			}
		} catch (SQLException e) {
			System.err.println("Error retrieving tasks: " + e.getMessage());
		}
	}

}










