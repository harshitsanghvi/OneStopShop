package com.onestopshop.beans;

public class Cash {
	private int cashTendered = 0;

	public Integer getCashTendered() {
		return this.cashTendered;
	}

	public boolean setCashTendered(double cashTendered) {
		if(cashTendered < 0)
			return false;
		this.cashTendered = (int) Math.round(cashTendered);
		return true;
	}
	
}
