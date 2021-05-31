package com.example.ploymorphism;

public class CompileTimePoly {
	
	// done at compile time
	// better readability and method name re-usability
	
	private static final double PI = 3.1415965;
	
	public void calculateAndPrintArea(int side) {
		System.out.println("Area of square = " + side*side);
	}
	
	public void calculateAndPrintArea(double radius) {
		System.out.println("Area of circle = " + PI*radius*radius);
	}
	
	public void calculateAndPrintArea(int length, int breadth) {
		System.out.println("Area of rectangle = " + length*breadth);
	}
	
	public static void main(String []args) {
		CompileTimePoly obj = new CompileTimePoly();
		obj.calculateAndPrintArea(3);
		obj.calculateAndPrintArea(3.0);
		obj.calculateAndPrintArea(3,3);
	}

}
