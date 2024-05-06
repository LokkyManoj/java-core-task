package todo.test;


import java.sql.SQLException;
import java.util.Scanner;

import todo.dao.ToDoListManager1;
import todo.model.ToDoItem1;
import todo.util.SimpleToDoListManager1;


public class ToDoListMain1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            ToDoListManager1 manager = new SimpleToDoListManager1();
            ToDoItem1 todo = new ToDoItem1();

            System.out.println("Welcome to ToDoList!");
            boolean exit = false;
            while (!exit) {
                System.out.println("1. Manager Registration");
                System.out.println("2. Manager Login");
                System.out.println("3. Employee Login");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        managerRegistration(scanner, manager,todo);
                        break;
                    case 2:
                        if (managerLogin(scanner, manager,todo)) {
                            managerTasks(scanner, manager,todo);
                        }
                        break;
                    case 3:
                        employeeLogin(scanner, manager);
                        break;
                    case 4:
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

//    static void managerRegistration(Scanner scanner, ToDoListManager1 manager,ToDoItem1 todo) throws SQLException {
//        System.out.println("Manager Registration:");
//        System.out.print("Enter manager username: ");
//        String managerUsername = scanner.nextLine();
//        System.out.print("Enter manager password: ");
//        String managerPassword = scanner.nextLine();
//        if (manager.signUp(managerUsername, managerPassword)) {
//            System.out.println("Sign up successful.");
//        } else {
//            System.out.println("This username already exists.");
//        }
//        todo.setManagerUsername(managerUsername);
//        todo.setManagerPassword(managerPassword);
//    }
    
    static void managerRegistration(Scanner scanner, ToDoListManager1 manager,ToDoItem1 task1) throws SQLException {
    	
    
    		System.out.println("Manager Registration:");
    		System.out.print("Enter manager username: ");
    		String managerUsername = scanner.nextLine();
    		System.out.print("Enter manager password: ");
    		String managerPassword = scanner.nextLine();
    		System.out.print("Enter employee name: ");
    		task1.setEmployeeName(scanner.nextLine());
    		//String employeeName = scanner.nextLine();
    		System.out.println("Enter Task Id:");
    		task1.setTaskId(scanner.nextInt());
    		scanner.nextLine();
    		System.out.print("Enter task for employee: ");
    		task1.setTask(scanner.nextLine());
    		System.out.print("Enter due date (YYYY-MM-DD): ");
    		//String dueDate = scanner.nextLine();
    		task1.setDueDate(scanner.nextLine());
    
    		if (manager.signUp(managerUsername, managerPassword)) {
    			manager.addTask1(managerUsername, managerPassword, task1.getTaskId(),task1.getTask(), task1.getDueDate(), task1.getEmployeeName());

    		}
    	}

    static boolean managerLogin(Scanner scanner, ToDoListManager1 manager,ToDoItem1 todo) throws SQLException {
        System.out.println("Manager Login:");
        System.out.print("Enter manager username: ");
        String managerUsername = scanner.nextLine();
        System.out.print("Enter manager password: ");
        String managerPassword = scanner.nextLine();
        todo.setManagerUsername(managerUsername);
        todo.setManagerPassword(managerPassword);
        return manager.login(managerUsername, managerPassword);
    }

    static void managerTasks(Scanner scanner, ToDoListManager1 manager,ToDoItem1 todo) throws SQLException {
        System.out.println("Manager Tasks:");
        System.out.println("1. Add Task");
        System.out.println("2. Delete Task");
        System.out.println("3. Update Task");
        System.out.println("4. Back to Main Menu");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                addTask(scanner, manager,todo);
                break;
            case 2:
                deleteTask(scanner, manager);
                break;
            case 3:
                updateTask(scanner, manager);
                break;
            case 4:
                return;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }
    }

    static void addTask(Scanner scanner, ToDoListManager1 manager,ToDoItem1 todo) throws SQLException {
    	System.out.print("Enter task id: ");
        int taskId = scanner.nextInt();
        todo.setTaskId(taskId);
        scanner.nextLine();
        System.out.print("Enter task: ");
        String task = scanner.nextLine();
        todo.setTask(task);
        System.out.print("Enter due date (YYYY-MM-DD): ");
        String dueDate = scanner.nextLine();
        todo.setDueDate(dueDate);
        System.out.print("Enter employee name: ");
        String employeeName = scanner.nextLine();
        todo.setEmployeeName(employeeName);
        manager.addTask(todo);
    }

    static void deleteTask(Scanner scanner, ToDoListManager1 manager) throws SQLException {
        System.out.print("Enter task id to delete: ");
        int taskId = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        manager.deleteTask(taskId);
    }

    static void updateTask(Scanner scanner, ToDoListManager1 manager) throws SQLException {
        System.out.print("Enter task id to update: ");
        int taskId = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Enter new task: ");
        String newTask = scanner.nextLine();
        System.out.print("Enter new due date (YYYY-MM-DD): ");
        String newDueDate = scanner.nextLine();
        System.out.print("Enter new employee name: ");
        String newEmployeeName = scanner.nextLine();
        manager.updateTask(taskId, newTask, newDueDate, newEmployeeName);
    }

    static void employeeLogin(Scanner scanner, ToDoListManager1 manager) throws SQLException {
        System.out.println("Employee Login:");
        System.out.print("Enter employee username: ");
        String employeeUsername = scanner.nextLine();
        System.out.print("Enter your Manager Name:");
        String managerUsername = scanner.nextLine();
        manager.getEmployeeDetails(managerUsername, employeeUsername);
    }
}
