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
}