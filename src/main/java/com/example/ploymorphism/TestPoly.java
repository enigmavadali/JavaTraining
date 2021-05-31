package com.example.ploymorphism;

public class TestPoly {
	
	public static void main(String []args) {
		WorldBank world = new WorldBank();
		WorldBank america = new BankOfAmerica();
		WorldBank india = new BankOfIndia();
		
		BankOfIndia obj1 = new BankOfIndia();
		BankOfAmerica obj2 = new BankOfAmerica();
		
		world.getInterestRate();
		america.getInterestRate();
		india.getInterestRate();
		
//		world.getTotalMoney();
//		america.getTotalMoney();
//		india.getTotalMoney();
		
//		obj1.getTotalMoney();
//		obj2.getTotalMoney();
	}

}
