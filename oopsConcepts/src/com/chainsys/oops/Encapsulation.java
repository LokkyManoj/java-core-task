package com.chainsys.oops;

import java.util.Scanner;

public class Encapsulation {

	public static void main(String[] args) {
		Validation validate=new Validation();
		String bkName;
		int id;
		int year;
		String genre;
		int pgNo;
		GetterAndSetter input=new GetterAndSetter();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Book Name:");
		input.setBookName(bkName=sc.next());
		if(!validate.numberchecker(bkName)) {
			return;
		}
		if(!validate.isSpecialChar(bkName)) {
			return;
		}
		System.out.println("Enter a BookId:");
		input.setBookId( id =sc.nextInt());
		
		if(!validate.inputchecker(id)){
			return;
		}
		System.out.println("Enter a Book Published:");
		input.setBookPublished(year=sc.nextInt());

		if(!validate.inputchecker(year)){
			return;
		}
		System.out.println("Enter a Genre of Book:");
		input.setBookGenre(genre=sc.next());
		if(!validate.numberchecker(genre)) {
			return;
		}
		if(!validate.isSpecialChar(genre)) {
			return;
		}
		
		System.out.println("Enter a Book Page number:");
		input.setBookPgNo(pgNo=sc.nextInt());
		if(!validate.inputchecker(pgNo)){
			return;
		}
		
		System.out.println("Book Name:"+input.getBookName());
		System.out.println("Book Id:"+input.getBookId());
		System.out.println("Published Book Year:"+input.getBookPublished());
		System.out.println("Genre of Book:"+input.getBookGenre());
		System.out.println("No of Pages in Book:"+input.getBookPgNo());
		
	}

}
