package com.binu.vending.machine;

public enum Coin {
	
	
	PENNY(1), NICKEL(5), DIME(10), QUARTER(25);
	
	private int denomination;
	
	
	private Coin(int denomination) {
		this.denomination = denomination;
	}
	
	
	

}
