package com.creational.abstractfactory;

public class RoundedShapeFactory extends AbstractFactory{

	@Override
	Shape getShape(String shapeType) {
		if(shapeType.equalsIgnoreCase("roundedsquare"))
			return (Shape) new RoundedSquare();
		else if(shapeType.equalsIgnoreCase("roundedrectangle"))
			return (Shape) new RoundedRectangle();
		return null;
	}

}
