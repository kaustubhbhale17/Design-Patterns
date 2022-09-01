package com.creational.singleton;

public class SingleonDemo {

	public static void main(String[] args) {
		SingletonObject sobj = SingletonObject.getInstance();
		sobj.showMessage();

	}

}
