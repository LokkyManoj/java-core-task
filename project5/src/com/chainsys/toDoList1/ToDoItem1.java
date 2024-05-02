package com.chainsys.toDoList1;

public class ToDoItem1 {
	 public int id;
	 public String userName;
	 public String password;
	    public String task;
	    public String dueDate;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getTask() {
			return task;
		}
		public void setTask(String task) {
			this.task = task;
		}
		public String getDueDate() {
			return dueDate;
		}
		public void setDueDate(String dueDate) {
			this.dueDate = dueDate;
		}
		public ToDoItem1(int id,String userName,String password, String task, String dueDate) {
			super();
			this.id = id;
			this.userName=userName;
			this.password=password;
			this.task = task;
			this.dueDate = dueDate;
		}
		public ToDoItem1() {
			
		}
		
		
		
		public String toString() {
			return "ToDoItem1 [id=" + id + ", userName=" + userName + ", password=" + password + ", task=" + task
					+ ", dueDate=" + dueDate + "]";
		}
		
	    
	    
}
