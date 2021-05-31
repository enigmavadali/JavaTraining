package com.example.ploymorphism;

public class BankOfAmerica extends WorldBank{
	
	@Override
	public void getInterestRate() {
		System.out.println("ROI = 6%");
	}
	
	private void getTotalMoney() {
		System.out.println("$8 billion");
	}

}
