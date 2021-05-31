package com.exmaple.abstraction;

public class Test2 {
	
	public static void main(String []args) {
		IShape rect = new RectangleImpl(2 ,3);
		IShape circle = new CircleImpl(3);
		
		rect.printArea();
		rect.printSides();
		circle.printArea();
		circle.printSides();
		
	}

}
