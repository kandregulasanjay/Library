package com.store.books.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name="library_info")

public class Library {
	
	@Id
	private String bookId;	
	private  String author;
	private int rating;
	private String name;
	
	public Library() {
		
	}

	public Library(String bookId, String author, int rating, String name) {
		super();
		this.bookId = bookId;
		this.author = author;
		this.rating = rating;
		this.name = name;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Library [bookId=" + bookId + ", author=" + author + ", rating=" + rating + ", name=" + name + "]";
	}
	
	
}
