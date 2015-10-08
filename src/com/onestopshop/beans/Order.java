package com.onestopshop.beans;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;



public class Order {
	private Calendar date;
	private String status;
	private Customer objCustomer;
	private Payment objPayment;
	
	List<OrderDetail> orderDetailsList = new ArrayList<>();
	
	public Order(Calendar orderDate, String orderstatus, Customer objCustomer,
			Payment objPayment, List<OrderDetail> orderDetailsList) {
		this.date = orderDate;
		this.status = orderstatus;
		this.objCustomer = objCustomer;
		this.objPayment = objPayment;
		this.orderDetailsList = orderDetailsList;
		
	}
	public Calendar getDate() {
		return date;
	}
	public void setDate(Calendar date) {
		this.date = date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Customer getNewCustomer() {
		return objCustomer;
	}
	public void setNewCustomer(Customer newCustomer) {
		this.objCustomer = newCustomer;
	}
	public Payment getPayment() {
		return objPayment;
	}
	public void setPayment(Payment payment) {
		this.objPayment = payment;
	}
	public List<OrderDetail> getOrderdetail() {
		return orderDetailsList;
	}
	public void setOrderdetail(List<OrderDetail> orderDetailsList) {
		this.orderDetailsList = orderDetailsList;
	}
	
	/**
	 * This method is to calculate the tax to be applied to the item
	 * @return 
	 */
	public double calcTax() {
		double taxPercentage = 0;
		double taxAmount = 0;
		for(OrderDetail order : orderDetailsList) {
			taxPercentage = order.getTaxStatus();
			taxAmount = (order.calcSubTotal() * taxPercentage);
		}
		return taxAmount;
	}

	/**
	 * This method is to calculate the total net amount
	 * @return 
	 */
	public double calcTotal() {
		double total = 0;
		for(OrderDetail order : orderDetailsList) {
			total += order.calcSubTotal();
		}
		return total;
	}
	
	/**
	 * This method is to calculate the total weight
	 * @return my balls
	 * 
	 */
	public double calcTotalWeight() {
		double totalWeight = 0;
		for(OrderDetail order : orderDetailsList) {
			totalWeight += order.calcWeight();
		}
		return totalWeight;
	}
}
