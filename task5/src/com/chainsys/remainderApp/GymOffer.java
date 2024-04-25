package com.chainsys.remainderApp;

import java.util.Scanner;

public class GymOffer {
	public void GenderOff(BmiCalculation input) {
		Scanner option = new Scanner(System.in);
		Validation validate = new Validation();

		System.out.println("Welcome to Spartan Academy!\n\n");
		System.out.println(
				"For Mens ,Monthly 1000 only....If you Represent our gym in competition,then 100% offer will available\n\n"
						+ " \n For Women ,50% offer will available if your weight is above 70....");
//		System.out.println("Enter your Name :");
//		input.setName(option.next());
//		while (!validate.numberchecker(input.name)) {
//			input.name = option.next();
//		}
//		while (!validate.validateString(input.name)) {
//			input.name = option.next();
//		}
		System.out.println("Enter your Gender:");
		String gender = option.next();
		if (gender.equalsIgnoreCase("female")) {
			System.out.println("Enter your Weight:");
			int weigh = option.nextInt();

			if (weigh > 70) {

				System.out.println("50% offer applied");
			}
		} else if (gender.equalsIgnoreCase("male")) 
		{
			System.out.println("Do you want to participate in Competition");
			String opt = option.next();
			if (opt.equalsIgnoreCase("yes"))
			{
				System.out.println("100% offer applied");
			}
		}

	}
}
