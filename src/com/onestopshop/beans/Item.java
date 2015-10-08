package com.onestopshop.beans;

import javax.persistence.Column;


public class Item {
	@Column(name = "ITEMNAME")
	private String title;
	
	private Double shippingWeight;
	
	@Column(name = "ITEMDESC")
	private String description;
	
	private OrderDetail orderDetail;
	
	@Column(name = "ITEMPRICE")
	private double price;
	
	@Column(name = "ITEMIMAGEPATH")
	private String image;
	
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
}
