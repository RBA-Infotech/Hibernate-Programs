package com.hibernat.HibernatPrgm;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BookDetails1 {

@Id
private int bookID;
private String bookName;
private float bookPrice;


public int getBookID() {
	return bookID;
}

public void setBookID(int bookID) {
	this.bookID = bookID;
}

public String getBookName() {
	return bookName;
}

public void setBookName(String bookName) {
	this.bookName = bookName;
}

public float getBookPrice() {
	return bookPrice;
}

public void setBookPrice(float bookPrice) {
	this.bookPrice = bookPrice;
}



	
	
}
