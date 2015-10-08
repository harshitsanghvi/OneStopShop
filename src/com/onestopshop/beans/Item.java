package com.onestopshop.beans;


public class Item {
	private Double shippingWeight;
	private String description;
	private OrderDetail orderDetail;
	private double price;
	private double weight;
	
	public double getShippingWeight() {
		return shippingWeight;
	}
	public boolean setShippingWeight(Double shippingWeight) {
		this.shippingWeight = shippingWeight;
		return true;
	}
	public String getDescription() {
		return description;
	}
	public boolean setDescription(String description) {
		this.description = description;
		return true;
	}
	public OrderDetail getOrderDetail() {
		return orderDetail;
	}
	public boolean setOrderDetail(OrderDetail orderDetail) {
		if((orderDetail instanceof OrderDetail) && orderDetail!=null)
		this.orderDetail = orderDetail;
		return true;
	}
	public Double getWeight(){
		return weight;
	}
	
	public double getPriceForquantity(){
		
		return price;
	}
}
