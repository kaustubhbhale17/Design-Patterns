package com.creational.factory;

public class FactoryDemo {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape s1 = shapeFactory.getShape("square");
		s1.draw();
		
		Shape s2 = shapeFactory.getShape("rectangle");
		s2.draw();
		

	}

}
