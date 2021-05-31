package com.exmaple.abstraction;

public class RectangleImpl implements IShape{
	
	int length, breadth;
	
	RectangleImpl(int l, int b){
		this.length = l;
		this.breadth = b;
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
