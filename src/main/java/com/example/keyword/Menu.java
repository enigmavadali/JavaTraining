package com.example.keyword;

public enum Menu {
	BURGER, FRIES, SANDWICH, COLDDRINKS;
	
	public static void main(String []args) {
		System.out.println(Menu.BURGER);
		Menu array[] = Menu.values();
		for(Menu m : array) {
			System.out.println(m);
		}
	}

}


