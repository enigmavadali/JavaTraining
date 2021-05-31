package com.exmaple.abstraction;

public abstract class Shape {
	
	String shapeName;
	
	Shape(String name){
		this.shapeName = name;
	}
	
	public void printName() {
		System.out.println("Shape is " + this.shapeName);
	}
	
	abstract void printArea();
	abstract void printSides();

}
