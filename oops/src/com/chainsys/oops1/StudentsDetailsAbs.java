package com.chainsys.oops1;

public class StudentsDetailsAbs {
	String studentName;
	int age;
	String department;
	String studentId;
	public String getStudentName() 
	{
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName  = studentName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public StudentsDetailsAbs() {
		
		}
	public StudentsDetailsAbs(String studentName, int age, String department, String studentId) {
		super();
		this.studentName = studentName;
		this.age = age;
		this.department = department;
		this.studentId = studentId;
	}
	@Override
	public String toString() {
		return "StudentInfo [studentName=" + studentName + ", age=" + age + ", department=" + department + ", studentId="
				+ studentId + "]";
	}

}
