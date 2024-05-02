package com.chainsys.remainderApp;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoFunction1 implements Todo {
	public void todoFunction()
	{
		BmiCalculation input = new BmiCalculation();
		Validation validate = new Validation();
		Scanner sc = new Scanner(System.in);
		ArrayList<String> array = new ArrayList<String>();
		array.add("manoj");
		array.add("kishor");
		array.add("vikram");
		array.add("babu");
		
		System.out.println("Are you member in spartan academy(yes/no)");
		String yesNo = sc.next();
		if (yesNo.equalsIgnoreCase("no")) 
		{
			System.out.println("Sign up in Spartan Academy");
			System.out.println("Enter your name:");
			input.setName(sc.next());
			while (!validate.numberchecker(input.name)) 
			{
				input.name = sc.next();
			}
			while (!validate.validateString(input.name)) 
			{
				input.name = sc.next();
			}
			System.out.println("Enter your mobile number:");
			String no = sc.next();
			System.out.println("You signed up successfully");
			System.out.println("Login in to spartan academy");
			System.out.println("Enter your UserName");
			input.setName(sc.next());
			while (!validate.numberchecker(input.name)) {
				input.name = sc.next();
			}
			while (!validate.validateString(input.name)) {
				input.name = sc.next();
			}
			System.out.println("Enter your mobile number:");
			String no1 = sc.next();
			if (input.name.equals(array.get(0))) {
				System.out.println("Succesfully logined!");
				GymOffer gym = new GymOffer();
				gym.GenderOff(input);
				System.out.println("Do you want to calculate your BMI:");
				String b = sc.next();
				if (b.equalsIgnoreCase("yes")) {
					System.out.println("Enter your Height in meters  :");
					input.setHeight(sc.nextDouble());
					while (!validate.inputchecker1(input.height)) {
						input.height = sc.nextInt();
					}
					System.out.println("Enter your Weight in kilograms:");
					input.setWeight(sc.nextInt());
					while (!validate.inputchecker(input.weight)) {
						input.weight = sc.nextInt();
					}

					double bmi = input.weight / (input.height * input.height);
					System.out.println("Your Body Mass Index is " + bmi);
					if (bmi < 18.5) {
						System.out.println("You are underweight.");

					} else if (bmi >= 18.5 && bmi < 25) {
						System.out.println("You are normal weight.");

					} else if (bmi >= 25 && bmi < 30) {
						System.out.println("You are overweight.");

					} else {
						System.out.println("You are obese.");

					}
				}
				System.out.println("1.Do you want to Weight Loss\n2.Do you want to Gain Weight");
				System.out.println("Enter your Plan in above plans:");
				int plan = sc.nextInt();
				boolean exit = false;
				while (!exit) {
					switch (plan) {
					case 1:
						System.out.println("Choose below options");
						System.out.println("1.Food Diet for Weight Loss\n2.Workout for Weight Loss \n 3.exit");
						int plan2 = sc.nextInt();
						while (!exit) {
							switch (plan2) {
							case 1:
								System.out.println(
										"Day 1\n1.Breakfast: whole wheat poha, boiled sprouts, some nuts, and an apple\n2.Lunch: Vegetable soup, brown rice, dal, and a dry vegetable\n3.Snack: 1-2 fruits and roasted chana\n4.Dinner: Vegetable upma, 1 egg omelette, and a small plate of salad");
								System.out
										.println("-------------------------------------------------------------------");
								System.out.println("Day 2\n1.Breakfast: Dalia or paratha, and a glass of warm milk\r\n"
										+ "\r\n"
										+ "2.Lunch: Ragi or quinoa upma, 1 bowl of yoghourt, and a dry vegetable\r\n"
										+ "\r\n" + "3.Snack: Roasted chana, boiled peanuts, and an apple\r\n" + "\r\n"
										+ "4.Dinner: Vegetable pulao, boiled vegetables with curd, and 2 egg whites");
								System.out
										.println("-------------------------------------------------------------------");

								System.out.println(
										"Day 3\n1.Breakfast: Poha or oats porridge, and a glass of warm milk\r\n"
												+ "\r\n" + "2.Lunch: Vegetable biryani, curd, and a dry vegetable\r\n"
												+ "\r\n" + "3.Snack: Baked or boiled potatoes with salad\r\n" + "\r\n"
												+ "4.Dinner: Vegetable dalia with mixed vegetable");
								System.out
										.println("-------------------------------------------------------------------");

								System.out.println("Day 4\n1.Breakfast: 2-3 whole wheat chapatis and curd\r\n" + "\r\n"
										+ "2.Lunch: Multigrain or brown rice, dal, and vegetable\r\n" + "\r\n"
										+ "3.Snack: Roasted chana and 2-3 fruits\r\n" + "\r\n"
										+ "4.Dinner: Veggies with peanut sauce and a bowl of yoghurt");
								System.out
										.println("-------------------------------------------------------------------");

								System.out.println(
										"Day 5\n1.Breakfast: Chapati made with wheat and jowar flour, and a glass of warm milk\r\n"
												+ "\r\n" + "2.Lunch: Vegetable soup, chapati, and a mixed vegetable\r\n"
												+ "\r\n" + "3.Snack: Roasted chana, some nuts, and an apple\r\n"
												+ "\r\n"
												+ "4.Dinner: Vegetable pulao, a dry vegetable and one chapati");
								System.out
										.println("-------------------------------------------------------------------");

								System.out.println(
										"Day 6\n1.Breakfast: 2-3 multigrain chapattis, and a glass of warm milk\r\n"
												+ "\r\n"
												+ "2.Lunch: Vegetable pulao, dal, curd, and a dry vegetable\r\n"
												+ "\r\n" + "3.Snack: Roasted chana and 2-3 fruits\r\n" + "\r\n"
												+ "4.Dinner: Vegetable uttapam with sambhar");
								System.out
										.println("-------------------------------------------------------------------");

								System.out.println("Day 7\n1.Breakfast: Ragi dosa, idli, and a glass of warm milk\r\n"
										+ "\r\n" + "2.Lunch: Vegetable biryani, curd, and a dry vegetable\r\n" + "\r\n"
										+ "3.Snack: Baked or boiled potatoes with a salad\r\n" + "\r\n"
										+ "4.Dinner: Masala oats and some vegetables");
								break;

							case 2:
								System.out.println(
										"Workout Plan\n1.Do Cardio Exercises\n2.Do Basic Weight Loss Workout ");
								break;

							case 3:
								System.out.println("You have exited the application ");
								exit = true;

							}

							break;
						}
						break;

					case 2:
						System.out.println("Choose below options");
						System.out.println("1.Food Diet for Weight Gain\n2.Exit");
						int plan3 = sc.nextInt();
						while (true) {
							switch (plan3) {
							case 1:
								System.out.println("1.Eat three to five meals a day. ...\r\n"
										+ "2.Track your Calories. ...\r\n" + "3.Eat enough protein. ...\r\n"
										+ "4.Eat meals with fibrous carbohydrates and healthful fats. ...\r\n"
										+ "5.Drink high-calorie smoothies or shakes. ...");
								break;

							case 2:

								System.out.println("You have exited the application ");
								exit = true;
							}
							break;

						}
					}
				}
				System.out.println("Do you want MusclesWorkout?:");
				String workout = sc.next();
				if (workout.equalsIgnoreCase("yes")) {
					Muscle muscle = new Muscle();
					muscle.MuscleSelect();
				}
				PersonalAssitant personal = new PersonalAssitant();
				personal.PersonalTrainer(input);

			}
		} else {
			System.out.println("Login in to spartan academy");

			System.out.println("Enter your UserName");
			input.setName(sc.next());
			System.out.println("Enter your mobile number:");
			String no = sc.next();
			while (!validate.numberchecker(input.name)) {
				input.name = sc.next();
			}
			if (input.name.equals(array.get(0))) {
				System.out.println("Succesfully logined!");
				GymOffer gym = new GymOffer();
				gym.GenderOff(input);

				System.out.println("Do you want to calculate your BMI:");
				String b = sc.next();
				if (b.equalsIgnoreCase("yes")) {
					System.out.println("Enter your Height in meters  :");
					input.setHeight(sc.nextDouble());
					while (!validate.inputchecker1(input.height)) {
						input.height = sc.nextInt();
					}
					System.out.println("Enter your Weight in kilograms:");
					input.setWeight(sc.nextInt());
					while (!validate.inputchecker(input.weight)) {
						input.weight = sc.nextInt();
					}

					double bmi = input.weight / (input.height * input.height);
					System.out.println("Your Body Mass Index is " + bmi);
					if (bmi < 18.5) {
						System.out.println("You are underweight.");

					} else if (bmi >= 18.5 && bmi < 25) {
						System.out.println("You are normal weight.");

					} else if (bmi >= 25 && bmi < 30) {
						System.out.println("You are overweight.");

					} else {
						System.out.println("You are obese.");

					}
				}
				System.out.println("1.Do you want to Weight Loss\n2.Do you want to Gain Weight");
				System.out.println("Enter your Plan in above plans:");
				int plan = sc.nextInt();
				boolean exit = false;
				while (!exit) {
					switch (plan) {
					case 1:
						System.out.println("Choose below options");
						System.out.println("1.Food Diet for Weight Loss\n2.Workout for Weight Loss \n 3.exit");
						int plan2 = sc.nextInt();
						while (!exit) {
							switch (plan2) {
							case 1:
								System.out.println(
										"Day 1\n1.Breakfast: whole wheat poha, boiled sprouts, some nuts, and an apple\n2.Lunch: Vegetable soup, brown rice, dal, and a dry vegetable\n3.Snack: 1-2 fruits and roasted chana\n4.Dinner: Vegetable upma, 1 egg omelette, and a small plate of salad");
								System.out
										.println("-------------------------------------------------------------------");
								System.out.println("Day 2\n1.Breakfast: Dalia or paratha, and a glass of warm milk\r\n"
										+ "\r\n"
										+ "2.Lunch: Ragi or quinoa upma, 1 bowl of yoghourt, and a dry vegetable\r\n"
										+ "\r\n" + "3.Snack: Roasted chana, boiled peanuts, and an apple\r\n" + "\r\n"
										+ "4.Dinner: Vegetable pulao, boiled vegetables with curd, and 2 egg whites");
								System.out
										.println("-------------------------------------------------------------------");

								System.out.println(
										"Day 3\n1.Breakfast: Poha or oats porridge, and a glass of warm milk\r\n"
												+ "\r\n" + "2.Lunch: Vegetable biryani, curd, and a dry vegetable\r\n"
												+ "\r\n" + "3.Snack: Baked or boiled potatoes with salad\r\n" + "\r\n"
												+ "4.Dinner: Vegetable dalia with mixed vegetable");
								System.out
										.println("-------------------------------------------------------------------");

								System.out.println("Day 4\n1.Breakfast: 2-3 whole wheat chapatis and curd\r\n" + "\r\n"
										+ "2.Lunch: Multigrain or brown rice, dal, and vegetable\r\n" + "\r\n"
										+ "3.Snack: Roasted chana and 2-3 fruits\r\n" + "\r\n"
										+ "4.Dinner: Veggies with peanut sauce and a bowl of yoghurt");
								System.out
										.println("-------------------------------------------------------------------");

								System.out.println(
										"Day 5\n1.Breakfast: Chapati made with wheat and jowar flour, and a glass of warm milk\r\n"
												+ "\r\n" + "2.Lunch: Vegetable soup, chapati, and a mixed vegetable\r\n"
												+ "\r\n" + "3.Snack: Roasted chana, some nuts, and an apple\r\n"
												+ "\r\n"
												+ "4.Dinner: Vegetable pulao, a dry vegetable and one chapati");
								System.out
										.println("-------------------------------------------------------------------");

								System.out.println(
										"Day 6\n1.Breakfast: 2-3 multigrain chapattis, and a glass of warm milk\r\n"
												+ "\r\n"
												+ "2.Lunch: Vegetable pulao, dal, curd, and a dry vegetable\r\n"
												+ "\r\n" + "3.Snack: Roasted chana and 2-3 fruits\r\n" + "\r\n"
												+ "4.Dinner: Vegetable uttapam with sambhar");
								System.out
										.println("-------------------------------------------------------------------");

								System.out.println("Day 7\n1.Breakfast: Ragi dosa, idli, and a glass of warm milk\r\n"
										+ "\r\n" + "2.Lunch: Vegetable biryani, curd, and a dry vegetable\r\n" + "\r\n"
										+ "3.Snack: Baked or boiled potatoes with a salad\r\n" + "\r\n"
										+ "4.Dinner: Masala oats and some vegetables");
								break;

							case 2:
								System.out.println(
										"Workout Plan\n1.Do Cardio Exercises\n2.Do Basic Weight Loss Workout ");
								break;

							case 3:
								System.out.println("You have exited the application ");
								exit = true;

							}

							break;
						}
						break;

					case 2:
						System.out.println("Choose below options");
						System.out.println("1.Food Diet for Weight Gain\n2.Exit");
						int plan3 = sc.nextInt();
						while (true) {
							switch (plan3) {
							case 1:
								System.out.println("1.Eat three to five meals a day. ...\r\n"
										+ "2.Track your Calories. ...\r\n" + "3.Eat enough protein. ...\r\n"
										+ "4.Eat meals with fibrous carbohydrates and healthful fats. ...\r\n"
										+ "5.Drink high-calorie smoothies or shakes. ...");
								break;

							case 2:

								System.out.println("You have exited the application ");
								exit = true;
							}
							break;

						}
					}
				}
				System.out.println("Do you want MusclesWorkout?:");
				String workout = sc.next();
				if (workout.equalsIgnoreCase("yes")) {
					Muscle muscle = new Muscle();
					muscle.MuscleSelect();
				}
				PersonalAssitant personal = new PersonalAssitant();
				personal.PersonalTrainer(input);

			} else {
				System.out.println("You are not logined.Sign Up!");
			}

		}
	}
}
