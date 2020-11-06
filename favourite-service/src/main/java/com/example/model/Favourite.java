package com.example.model;

import java.util.Arrays;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="favourite")
public class Favourite {
	private String bookID;
	private String bookTitle;
	private String bookAuthors[];
	private String bookPublisher;
	private String bookPublishedDate;
	private String bookDescription;
	private String bookCategory;
	private String bookImage;
	private String bookLanguage;
	private String username;
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
	public String[] getBookAuthors() {
		return bookAuthors;
	}
	public void setBookAuthors(String[] bookAuthors) {
		this.bookAuthors = bookAuthors;
	}
	public String getBookPublisher() {
		return bookPublisher;
	}
	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}
	public String getBookPublishedDate() {
		return bookPublishedDate;
	}
	public void setBookPublishedDate(String bookPublishedDate) {
		this.bookPublishedDate = bookPublishedDate;
	}
	public String getBookDescription() {
		return bookDescription;
	}
	public void setBookDescription(String bookDescription) {
		this.bookDescription = bookDescription;
	}
	public String getBookCategory() {
		return bookCategory;
	}
	public void setBookCategory(String bookCategory) {
		this.bookCategory = bookCategory;
	}
	public String getBookImage() {
		return bookImage;
	}
	public void setBookImage(String bookImage) {
		this.bookImage = bookImage;
	}
	public String getBookLanguage() {
		return bookLanguage;
	}
	public void setBookLanguage(String bookLanguage) {
		this.bookLanguage = bookLanguage;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Favourite(String bookID, String bookTitle, String[] bookAuthors, String bookPublisher,
			String bookPublishedDate, String bookDescription, String bookCategory, String bookImage,
			String bookLanguage, String username) {
		super();
		this.bookID = bookID;
		this.bookTitle = bookTitle;
		this.bookAuthors = bookAuthors;
		this.bookPublisher = bookPublisher;
		this.bookPublishedDate = bookPublishedDate;
		this.bookDescription = bookDescription;
		this.bookCategory = bookCategory;
		this.bookImage = bookImage;
		this.bookLanguage = bookLanguage;
		this.username = username;
	}
	@Override
	public String toString() {
		return "Favourite [bookID=" + bookID + ", bookTitle=" + bookTitle + ", bookAuthors="
				+ Arrays.toString(bookAuthors) + ", bookPublisher=" + bookPublisher + ", bookPublishedDate="
				+ bookPublishedDate + ", bookDescription=" + bookDescription + ", bookCategory=" + bookCategory
				+ ", bookImage=" + bookImage + ", bookLanguage=" + bookLanguage + ", username=" + username + "]";
	}
	
	



}
