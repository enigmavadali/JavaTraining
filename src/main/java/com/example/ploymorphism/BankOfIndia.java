package com.example.ploymorphism;

public class BankOfIndia extends WorldBank{
	
	@Override
	public void getInterestRate() {
		System.out.println("ROI = 9%");
	}
	
	private void getTotalMoney() {
		System.out.println("$10 billion");
	}

}
