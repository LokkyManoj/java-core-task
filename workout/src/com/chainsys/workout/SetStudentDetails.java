package com.chainsys.workout;

import java.util.HashSet;

public class SetStudentDetails {

	public static void main(String[] args) {
		
		        HashSet<String> mySet = new HashSet<>();

		        mySet.add("Apple");
		        mySet.add("Banana");
		        mySet.add("Orange");

		        mySet.add("Apple");

		        System.out.println("Elements in the set: " + mySet);

		        String searchElement = "Banana";
		        if (mySet.contains(searchElement)) {
		            System.out.println(searchElement + " exists in the set.");
		        } else {
		            System.out.println(searchElement + " does not exist in the set.");
		        }

		        String removeElement = "Orange";
		        if (mySet.remove(removeElement)) {
		            System.out.println(removeElement + " has been removed from the set.");
		        } else {
		            System.out.println(removeElement + " does not exist in the set.");
		        }

		        System.out.println("Elements in the set after removal: " + mySet);
		    }
		}

	
