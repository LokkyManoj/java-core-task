package com.chainsys.workout;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentsDetail {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> sList = new ArrayList<String>();
		
		while (true) {
			System.out.println("1.Add a Name");
			System.out.println("2.Display the Names");
			System.out.println("3.Search for the Name");
			System.out.println("4.Exit");
			System.out.println("Enter the Operation you want:");
			int num = input.nextInt();
			switch (num) {
			case 1:

				System.out.println("Enter the Name of Student:");
				sList.add(input.next());
				break;

			case 2:
				if(sList.isEmpty()) {
					System.out.println("No names added!");
				}
				else {
					for (String i : sList) {
						System.out.println("Name of the Students:");
						System.out.println(i);
					}
				}
				break;
			case 3:
				System.out.println("Enter a name you want to search:");
				String name=input.next();
				if(sList.contains(name)) {
					System.out.println(name+" is in the List");
				}
				else {
					System.out.println(name+" is not found");
				}
				break;
			case 4:
				System.out.println("Exiting Program");
				System.exit(0);

			}
		}

	}

}
