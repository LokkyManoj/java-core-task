package com.chainsys.remainderApp;

import java.util.Scanner;

public class Muscle {
	public void MuscleSelect() {
		Scanner scanner = new Scanner(System.in);
		boolean exit= false;
		while(!exit) {
		System.out.println("Choose the muscle group you want to train:");
		System.out.println("1. Chest");
		System.out.println("2. Back");
		System.out.println("3. Legs");
		System.out.println("4. Shoulders");
		System.out.println("5. Arms");
		System.out.println("6.Exit");
		System.out.print("Enter your choice: ");
		int muscleGroup = scanner.nextInt();
		

		switch (muscleGroup) {
		case 1:
			trainChest();
			break;
		case 2:
			trainBack();
			break;
		case 3:
			trainLegs();
			break;
		case 4:
			trainShoulders();
			break;
		case 5:
			trainArms();
			break;
		case 6:
			System.out.println("You have exited from Muscle Workout");
			exit=true;
			break;
		default:
			System.out.println("Invalid choice!");
		}
}

		scanner.close();
	
	}

	public static void trainChest() {
		System.out.println("Chest Workouts:");
		System.out.println("1. Bench Press(3 sets -10 rep)");
		System.out.println("2. Dumbbell Flyes(3 sets -15 rep)");
		System.out.println("3. Push-Ups(3 sets -10 rep)");
	}

	public static void trainBack() {
		System.out.println("Back Workouts:");
		System.out.println("1. Deadlifts(1 set -2 rep)");
		System.out.println("2. Pull-Ups(3 sets -10 rep)");
		System.out.println("3. Bent-Over Rows(3 sets -8 rep)");
	}

	public static void trainLegs() {
		System.out.println("Leg Workouts:");
		System.out.println("1. Squats(3 sets -5 rep)");
		System.out.println("2. Lunges(3 sets -10 rep)");
		System.out.println("3. Leg Press(3 sets -10 rep)");
	}

	public static void trainShoulders() {
		System.out.println("Shoulder Workouts:");
		System.out.println("1. Overhead Press(2 sets -10 rep)");
		System.out.println("2. Lateral Raises(3 sets -15 rep)");
		System.out.println("3. Front Raises(3 sets -10 rep)");
	}

	public static void trainArms() {
		System.out.println("Arm Workouts:");
		System.out.println("1. Bicep Curls(3 sets -15 rep)");
		System.out.println("2. Tricep Dips(3 sets -10 rep)");
		System.out.println("3. Hammer Curls(3 sets -15 rep)");
	}
	

}

