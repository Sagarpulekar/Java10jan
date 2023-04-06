package com.cutomMap;

import java.util.Objects;

public class Book {
	
	private int bid;
	private String bname;
	private float price;
	private Author author;
	
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Book(int bid, String bname, float price, Author author) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.price = price;
		this.author = author;
	}


	public int getBid() {
		return bid;
	}


	public void setBid(int bid) {
		this.bid = bid;
	}


	public String getBname() {
		return bname;
	}


	public void setBname(String bname) {
		this.bname = bname;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}


	public Author getAuthor() {
		return author;
	}


	public void setAuthor(Author author) {
		this.author = author;
	}


	@Override
	public int hashCode() {
		return Objects.hash(author, bid, bname, price);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && bid == other.bid && Objects.equals(bname, other.bname)
				&& Float.floatToIntBits(price) == Float.floatToIntBits(other.price);
	}


	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + ", price=" + price + ", author=" + author + "]";
	}
	
	
	

}
