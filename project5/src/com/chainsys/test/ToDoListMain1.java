package com.chainsys.test;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.chainsys.dao.ToDoListManager1;
import com.chainsys.dao.Validation;
import com.chainsys.model.ToDoItem1;
import com.chainsys.util.SimpleToDoListManager1;

public class ToDoListMain1 {

	public static void main(String[] args) {
		ToDoItem1 task1=new ToDoItem1();
		Validation validate=new Validation();
		Scanner scanner = new Scanner(System.in);
		try {
			ToDoListManager1 manager = new SimpleToDoListManager1();

			System.out.println("Welcome to Reminder App!!");
			System.out.println("1. Sign up");
			System.out.println("2. Log in");
			System.out.print("Enter your choice: ");
			int option = scanner.nextInt();
			scanner.nextLine();

			switch (option) {
			case 1:
				System.out.println("Sign Up:");
				System.out.println("Enter new username:");
				task1.setUserName(scanner.next());
				while (!validate.numberchecker(task1.userName)){
					task1.userName = scanner.next();
				}
				while (!validate.validateString(task1.userName)) {
					task1.userName = scanner.next();
				}


				//String newUserName = scanner.nextLine();
				System.out.println("Enter password:");
				task1.setPassword(scanner.next());
				while (!validate.numberchecker(task1.password)){
					task1.password = scanner.next();
				}

				//String newPassword = scanner.nextLine();
				// manager.signUp(newUserName, newPassword);
				//if (manager.signUp(newUserName, newPassword)) {
					if (manager.signUp(task1.getUserName(), task1.getPassword())) {
					boolean exit = false;
					while (!exit) {
						System.out.println("Reminder App:");
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
							 task1.setTask(scanner.nextLine());
							 while (!validate.numberchecker(task1.task)){
									task1.task = scanner.next();
								}
							System.out.print("Enter due date (YYYY-MM-DD): ");
							task1.setDueDate(scanner.nextLine());
							//String dueDate = scanner.nextLine();
							manager.addTask(task1.getUserName(), task1.getPassword(), task1.getTask(), task1.getDueDate());
							//manager.addTask(newUserName, newPassword, task1.getTask(), task1.getDueDate());

							break;
						case 2:
							System.out.print("Enter index of task to delete: ");
							int indexToDelete = scanner.nextInt();
							scanner.nextLine();
							manager.deleteTask(indexToDelete);
							break;
						case 3:
							// displayTask(manager);
							System.out.print("Enter index of task to update: ");
							int indexToUpdate = scanner.nextInt();
							scanner.nextLine();
							System.out.print("Enter new task: ");
							String newTask = scanner.nextLine();
							while (!validate.numberchecker(task1.task)){
								task1.task = scanner.next();
							}
							System.out.print("Enter new due date (YYYY-MM-DD): ");
							String newDueDate = scanner.nextLine();
							manager.updateTask(indexToUpdate, task1.getUserName(), task1.getPassword(), newTask, newDueDate);
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
					System.out.println("Exiting Reminder App.");
				}
				break;

			case 2:
				System.out.println("Log In:");
				System.out.println("Enter username:");
				task1.setUserName(scanner.next());
				while (!validate.numberchecker(task1.userName)){
					task1.userName = scanner.next();
				}
				while (!validate.validateString(task1.userName)) {
					task1.userName = scanner.next();
				}
				//String loginUserName = scanner.nextLine();
				System.out.println("Enter password:");
				task1.setPassword(scanner.next());
				
				while (!validate.validateString(task1.password)) {
					task1.password = scanner.next();
				}

				//String loginPassword = scanner.nextLine();
				//if (manager.login(loginUserName, loginPassword)) {
					if (manager.login(task1.getUserName(),task1.getPassword())) {

					boolean exit = false;
					while (!exit) {
						System.out.println("Reminder App:");
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
							task1.setTask(scanner.next());

							//String task = scanner.nextLine();
							System.out.print("Enter due date (YYYY-MM-DD): ");
							task1.setDueDate(scanner.next());

							//String dueDate = scanner.nextLine();
							//manager.addTask(loginUserName, loginPassword, task, dueDate);
							manager.addTask(task1.getUserName(), task1.getPassword(), task1.getTask(), task1.getDueDate());

							break;
						case 2:
							System.out.print("Enter index of task to delete: ");
							int indexToDelete = scanner.nextInt();
							scanner.nextLine();
							manager.deleteTask(indexToDelete);
							break;
						case 3:
							// displayTask(manager);
							System.out.print("Enter index of task to update: ");
							int indexToUpdate = scanner.nextInt();
							scanner.nextLine();
							System.out.print("Enter new task: ");
							String newTask = scanner.nextLine();
							System.out.print("Enter new due date (YYYY-MM-DD): ");
							String newDueDate = scanner.nextLine();
							manager.updateTask(indexToUpdate, task1.getUserName(), task1.getPassword(), newTask, newDueDate);
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
					System.out.println("Exiting Reminder App.");
				}
				break;
			default:
				System.out.println("Invalid option. Please try again.");
				break;
			}
			scanner.close();
		} catch (ClassNotFoundException | SQLException e) {
			System.err.println("Error: " + e.getMessage());
		}

	}

	static void displayTask(ToDoListManager1 manager) throws SQLException {
		List<ToDoItem1> tasks = manager.getAllTasks();
		System.out.println("All Tasks:");
		for (int i = 0; i < tasks.size(); i++) {
			System.out.println(i + ". " + tasks.get(i));
		}

	}

}
