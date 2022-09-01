package com.creation.prototype;

public class DemoEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee(1,"Ajit","Mumbai");
		
		Employee e2 = (Employee) e1.getClone();
		e1.setCity("Pune");
		System.out.println(e1+"\n"+e2);
	}

}
