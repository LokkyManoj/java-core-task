package com.chainsys.oops;

public class GetterAndSetter {
String bookName;
int bookId;
int bookPublished;
String bookGenre;
int bookPgNo;
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public int getBookId() {
	return bookId;
}
public void setBookId(int bookId) {
	
	this.bookId = bookId;

}
		
	

public int getBookPublished() {
	return bookPublished;
}
public void setBookPublished(int bookPublished) {
	this.bookPublished = bookPublished;
}
public String getBookGenre() {
	return bookGenre;
}
public void setBookGenre(String bookGenre) {
	this.bookGenre = bookGenre;
}
public int getBookPgNo() {
	return bookPgNo;
}
public void setBookPgNo(int bookPgNo) {
	this.bookPgNo = bookPgNo;
}


public GetterAndSetter(String bookName, int bookId, int bookPublished, String bookGenre, int bookPgNo) {
	super();
	this.bookName = bookName;
	this.bookId = bookId;
	this.bookPublished = bookPublished;
	this.bookGenre = bookGenre;
	this.bookPgNo = bookPgNo;
}
public GetterAndSetter() {
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "GetterAndSetter [bookName=" + bookName + ", bookId=" + bookId + ", bookPublished=" + bookPublished
			+ ", bookGenre=" + bookGenre + ", bookPgNo=" + bookPgNo + "]";
}

}
