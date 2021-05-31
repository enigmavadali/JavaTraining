package com.exmaple.abstraction;

public class CircleImpl implements IShape{
	int radius; 
	
	CircleImpl(int r){
		this.radius = r;
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
