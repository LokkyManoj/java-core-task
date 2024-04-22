package com.chainsys.student;

import java.util.Scanner;


public class StudentManagement {

	public static void main(String[] args) {
		Validation validate =new Validation();
		StudentInfo input=new StudentInfo();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Name :");
		input.setStudentName(sc.next());
		while (!validate.numberchecker(input.studentName)) {
	        input.studentName = sc.next();
	    }
		while(!validate.validateString(input.studentName)) {
			input.studentName=sc.next();
		}

		
		
		System.out.println("Enter your Age :");
		input.setAge(sc.nextInt());
		while(!validate.inputchecker(input.age)) {
			input.age=sc.nextInt();
		}
		

		System.out.println("Enter your Department(dont use abbreviation) :");
		input.setDepartment(sc.next());
		while (!validate.numberchecker(input.department)) {
	        input.department = sc.next();
	    }
		while(!validate.validateString(input.department)) {
			input.department=sc.next();
		}
		
		System.out.println("Enter your StudentId :");
		input.setStudentId(sc.next());
		while (!validate.numberchecker(input.studentId)) {
	        input.studentId = sc.next();
	    }
		

		
		
		System.out.println("Student Name :"+input.getStudentName());
		System.out.println("Age :"+input.getAge());
		System.out.println("Department :"+input.getDepartment());
		System.out.println("Student Id :"+input.getStudentId());
		Open op=new Open();
		op.OpenElective();
		System.out.println("Enter your credits:");
		int credits=sc.nextInt();
		if(credits<10) {
System.out.println("Select only one additional course from above options:");
int option=sc.nextInt();
switch(option) {
case 1:
	System.out.println("R Programming");
	System.out.println("The credit for this course is 4");
	break;
case 2:
	System.out.println("Robotics");
	System.out.println("The credit for this course is 3");

break;
case 3:
	System.out.println("Advanced java Programming");
	System.out.println("The credit for this course is 4");

	break;
case 4:
	System.out.println("Software Testing");
	System.out.println("The credit for this course is 2");

	break;
}
System.out.println("You have selected above course");
		}
		else {
			System.out.println("You dont need additional courses!");
		}

	}

}
