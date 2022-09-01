package com.creational.abstractfactory;

public class AbstractFactoryDemo {

	public static void main(String[] args) {
		//get shape factory
	      AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
	      
	      //get an object of Shape Rectangle
	      Shape shape1 = shapeFactory.getShape("RECTANGLE");
	      shape1.draw();
	      
	      //get an object of Shape Square 
	      Shape shape2 = shapeFactory.getShape("SQUARE");
	      shape2.draw();
	      
	      //get shape factory
	      AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
	     
	      Shape shape3 = shapeFactory1.getShape("roundedRECTANGLE");
	      //call draw method of Shape Rectangle
	      shape3.draw();
	      //get an object of Shape Square 
	      Shape shape4 = shapeFactory1.getShape("roundedSQUARE");
	      //call draw method of Shape Square
	      shape4.draw();

	}

}
