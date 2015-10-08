package com.onestopshop.beans;


public class OrderDetail {
	private Integer quantity;
	private Double taxStatus;
	private Order order;
	private Item item;
	
	
	
	public OrderDetail(Integer quantity, Double taxStatus, Order order,
			Item item) {
		super();
		this.quantity = quantity;
		this.taxStatus = taxStatus;
		this.order = order;
		this.item = item;
	}
	
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double getTaxStatus() {
		return taxStatus;
	}
	public void setTaxStatus(Double taxStatus) {
		this.taxStatus = taxStatus;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	
	/**
	 * This class calculated the sub-total of net value of each item based on the quantity
	 */
	public double calcSubTotal() {
		return (item.getPriceForquantity() * quantity);
	}
	
	/**
	 * This class calculated the total of net weight of each item based on the quantity
	 */
	public double calcWeight() {
		return (item.getShippingWeight() * quantity);
	}
}
