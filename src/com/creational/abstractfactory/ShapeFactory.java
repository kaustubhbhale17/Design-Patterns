package com.creational.abstractfactory;

public class ShapeFactory extends AbstractFactory{

	//normal shape
	@Override
	Shape getShape(String shapeType) {
		if(shapeType.equalsIgnoreCase("rectangle"))
			return new Rectangle();
		else if(shapeType.equalsIgnoreCase("square"))
			return new Square();
		return null;
	}

}
