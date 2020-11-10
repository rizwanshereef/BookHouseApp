package com.example.model;

import java.util.Arrays;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="favourite")
public class Favourite {
	private String bookID;
	private String bookTitle;
	private String bookAuthor;
	private String bookIsbn;
	private String userId;
	public Favourite(String bookID, String bookTitle, String bookAuthor, String bookIsbn, String userId) {
		super();
		this.bookID = bookID;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookIsbn = bookIsbn;
		this.userId = userId;
	}
	public Favourite() {
		super();
	}
	public String getBookID() {
		return bookID;
	}
	public void setBookID(String bookID) {
		this.bookID = bookID;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getBookIsbn() {
		return bookIsbn;
	}
	public void setBookIsbn(String bookIsbn) {
		this.bookIsbn = bookIsbn;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "Favourite [bookID=" + bookID + ", bookTitle=" + bookTitle + ", bookAuthor=" + bookAuthor + ", bookIsbn="
				+ bookIsbn + ", userId=" + userId + "]";
	}
	
	

	}
	

}
