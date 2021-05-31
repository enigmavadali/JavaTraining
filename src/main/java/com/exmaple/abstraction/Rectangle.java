package com.exmaple.abstraction;

public class Rectangle extends Shape{
	
	int length, breadth;
	
	Rectangle(String name, int length, int breadth){
		super(name);
		this.length = length;
		this.breadth = breadth;
	}
	
	@Override
	public void printArea() {
		System.out.println("Area is = " + this.length*this.breadth);
	}
	
	@Override
	public void printSides() {
		System.out.println("Four Sides");
	}

}
