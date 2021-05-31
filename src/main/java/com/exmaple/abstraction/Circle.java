package com.exmaple.abstraction;

public class Circle extends Shape{
	int radius; 
	
	Circle(String name , int radius){
		super(name);
		this.radius = radius;
	}

	@Override
	public void printArea() {
		System.out.println("Area is = " + 3.14*this.radius*this.radius);
	}
	
	@Override
	public void printSides() {
		System.out.println("No sides as this is circle");
	}
	
	

}
