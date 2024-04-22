package com.chainsys.oops1;

import java.util.Scanner;

public class CourseAbs {

	public static void main(String[] args) {
		Validation validate =new Validation();
		StudentsDetailsAbs input=new StudentsDetailsAbs();
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
		StudentsDetails2Abs sm=new StudentsDetails2Abs();
		sm.displayAvailableCourses();
		sm.selectCourse();
		
	}

}
