package com.chainsys.oops1;

import java.util.Scanner;

public class StudentsDetails2Abs extends OpenElectiveAbs {

	
	public void selectCourse() {
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter your credits:");
		int credits=sc1.nextInt();
		if(credits<10) {
			System.out.println("Your credits points are low.");
System.out.println("Select only one additional course from above options:");
int option=sc1.nextInt();
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


