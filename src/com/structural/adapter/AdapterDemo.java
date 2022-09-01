package com.structural.adapter;

public class AdapterDemo {
	public static void main(String[] args) {
		OldCustomer oc = new OldCustomer();
		oc.setName("Ajit");
		oc.setAge("23");
		oc.setAddress("Gold Street,30,20021,New York");
		
		Customer c = new CustomerAdapter(oc);
		System.out.println(c.getName());
		System.out.println(c.getAge());
		System.out.println(c.getAddress().toString());
	}

}
