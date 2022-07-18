package com.hibernat.HibernatPrgm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

//import org.hibernate.annotations.GenericGenerator;

@Entity
//@Table(name="Books")
//@GenericGenerator(name="a1", strategy="increment")
public class BookDetails_AutoIncrement {

//	@TableGenerator(name = "t1", table = "Books", initialValue = 1000)
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)    //  strategy=GenerationType.IDENTITY  generator="a1"
	private int bookId;

	@Column(name="BOOK_NAME")
	private String bookName;
	private float bookPrice; 
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
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
	@Override
	public String toString() {
		return "BookDetails [bookId=" + bookId + ", bookName=" + bookName + ", bookPrice=" + bookPrice + "]";
	}
	
	
	
}
