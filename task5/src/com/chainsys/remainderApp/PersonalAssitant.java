package com.chainsys.remainderApp;

import java.util.Scanner;

public class PersonalAssitant {
	public void PersonalTrainer(BmiCalculation input) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Do you want Personal Remainder: ");
		String Option = scanner.next();
		if (Option.equalsIgnoreCase("yes")) {
			System.out.println("Welcome to Personal Reminder!");
			scanner.nextLine();
			System.out.println("What is your fitness goal? ");
			String fitnessGoal = scanner.nextLine();
			

			System.out.println("What are your preferred activities? ");
			String preferredActivities = scanner.nextLine();
			
			String remain = "\nHi " + input.getName() + "!" +
			                "\n Here are your personalized reminders:\n" + 
					        "Don't forget your fitness goal:"+fitnessGoal+"\n" + 
			                "Enjoy your preferred activities:"+preferredActivities;

			System.out.println(remain);
			clearScreen();
			
			System.out.println("Do you want to view your personal remainder again ? \nPlease press 1");
			int n = scanner.nextInt();
			if(n == 1) {
				System.out.println(remain);
			}
			else {
				System.exit(0);
			}
			
			scanner.close();
		}
	}
	public static void clearScreen() {  
	    System.out.print("\033[H\033[2J");  
	    System.out.flush();  
	}
}
