package com.onestopshop.model;

import java.util.ArrayList;
import java.util.List;

import com.onestopshop.beans.Item;

public class Cart {
	List<Item> itemList;
	public Cart() {
		itemList = new ArrayList<Item>();
	}
	public List<Item> getItemList() {
		return itemList;
	}
	public void setItemList(List<Item> item) {
		this.itemList = item;
	}
	
	public void addItem(Item item){
		this.itemList.add(item);
	}
	/*private int id;
	private String name;
	private float price;
	private int quantity;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	*/
	
}
