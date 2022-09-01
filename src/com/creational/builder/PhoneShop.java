package com.creational.builder;

public class PhoneShop {

	public static void main(String[] args) {
		PhoneBuilder pb = new PhoneBuilder();
		pb.setOs("Android");
		pb.setBattery(3000);

		//create phone with above specifications
		Phone phone = pb.getPhone();
		System.out.println(phone);
	}

}
