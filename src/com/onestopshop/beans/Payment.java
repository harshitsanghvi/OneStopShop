package com.onestopshop.beans;


public class Payment {
	private Double amount;
	private Order order;
	
	public Payment(double amount, Order order){
		this.amount = amount;
		this.order = order;
	}
	
	public double getAmount() {
		return amount;
	}
	public boolean setAmount(double amount) {
		
		if(amount < 0){	// Check to eliminate amount less than zero
			return false;
		}
		
		this.amount = amount;
		return true;
	} 
	public Order getOrder() {
		return order;
	}
	public boolean setOrder(Order order) {
		this.order = order;
		return true;
	}
}
