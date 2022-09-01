package com.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookStore implements BookStorePrototype{
	
	private String shopName;
	private List<Book> books = new ArrayList<>();
	
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	public void loadData() {
		for(int i=1;i<=10;i++) {
			Book b = new Book();
			b.setBookid(i);
			b.setBname("Books Name "+i);
			getBooks().add(b);
		}
	}
	
	@Override
	public BookStorePrototype getClone() {
		BookStore bs = new BookStore();
		bs.setShopName(shopName);
		for(Book b : books) {
			bs.getBooks().add(b);
		}
		return bs;
	}
	@Override
	public String toString() {
		return "BookStore [shopName=" + shopName + ", books=" + books + "]";
	}
	
	

}
