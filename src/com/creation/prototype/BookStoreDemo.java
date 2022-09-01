package com.creation.prototype;

public class BookStoreDemo {

	public static void main(String[] args) {
		//demonstration of prototype design pattern
		BookStore bs1 = new BookStore();
		bs1.setShopName("A1");
		bs1.loadData();
		
		
		BookStore bs2 = (BookStore) bs1.getClone();
		bs2.setShopName("Garware");
		bs1.getBooks().remove(0);
		System.out.println(bs1);
		System.out.println(bs2);

	}

}
