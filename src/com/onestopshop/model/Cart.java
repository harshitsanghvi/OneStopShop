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
	
	public void removeItem(Item item){
		this.itemList.remove(item);
	}
	
	public int totalPrice(){
		int sum = 0;
		for(int i = 0; i< itemList.size();i++)
			sum = sum+ itemList.get(i).getPrice();
		return sum;
	}
}
