package com.onestopshop.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "ITEM")
public class Item {

	@Id @GeneratedValue
	@Column(name="ID", nullable = false)
	private Long id;
	
	@Column(name = "ITEMNAME")
	private String title;
	
	@Transient
	private Double shippingWeight;
	
	@Column(name = "ITEMDESC")
	private String description;
	
	@Transient
	private OrderDetail orderDetail;
	
	@Column(name = "ITEMPRICE")
	private double price;
	
	@Column(name = "ITEMIMAGEPATH")
	private String image;
	
	@Transient
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
}
