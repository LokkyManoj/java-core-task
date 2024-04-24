package com.chainsys.remainderApp;

import java.util.regex.Pattern;

public class Validation {
	public  boolean inputchecker(int n)
	{
		while(true){
		
			if(n<0) 
			{
				System.out.println("Error!Negative number detected.Please Enter a Valid input:");
				return false;
			}
			return true;
		}
	}
		
		
		 public boolean numberchecker(String s) {
			    while (true) {
			        try {
			            Integer.parseInt(s);
			            System.out.print("Don't use numbers, please enter a valid input:");
			            return false;
			        } catch (NumberFormatException e) {
			            return true;
			        }
			    }
			}
		 public boolean inputchecker1(double n) 
		 {
			    while (true) {
			        if (n < 0) {
			            System.out.print("Error! Negative number detected. Cannot proceed. Please enter a valid amount:");
			            return false;
			        } else {
			            return true;
			        }
			    }
			}
		 public static boolean validateString(String input) {
			 while(true) {
		        String regex = "^[a-zA-Z ]+$";
		        Pattern pattern = Pattern.compile(regex);       
		        if (!pattern.matcher(input).matches()) {
		            System.out.print("Error: Input should contain only letters:");
		            return false;
		        } else {
		            return true;
		        }
		    }
			 
		 }
		 public static boolean validateString1(String input) {
			 while(true) {
		        String regex = "^[a-zA-Z0-9]+$";
		        Pattern pattern = Pattern.compile(regex);       
		        if (!pattern.matcher(input).matches()) {
		            System.out.print("Error: Input should contain only letters and numbers:");
		            return false;
		        } else {
		            return true;
		        }
		    }
		 }

		 
		 
}
