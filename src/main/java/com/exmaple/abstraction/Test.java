package com.exmaple.abstraction;

public class Test {
	
	public static void main(String []args) {
		Shape rect = new Rectangle("Rectangle", 2 ,3);
		Shape circle = new Circle("Circle", 3);
		
		rect.printArea();
		rect.printSides();
		circle.printArea();
		circle.printSides();
		
		rect.printName();
		circle.printName();
	}

}
