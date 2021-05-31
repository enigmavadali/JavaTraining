package com.example.ploymorphism;

public class RunTimePoly extends Parent{
	
	// decided at runtime
	// super for parent reference
	
	@Override
	public void sample(){
		System.out.println("Child class sample");
	}
	
	private void privateMethod() {
		System.out.println("Child private");
	}

	public static void main(String []args) {
		Parent obj1 = new Parent();
		Parent obj2 = new RunTimePoly();
		RunTimePoly obj3 = new RunTimePoly();
		
		obj1.sample();
		obj2.sample();
		obj3.privateMethod();
	}


}
