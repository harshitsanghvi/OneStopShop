package com.onestopshop.model;

import java.util.ArrayList;

import com.onestopshop.beans.Item;
import com.onestopshop.dao.IndexDao;

public class IndexModel {
	
	public ArrayList<Item> getItems(ArrayList<Item> items){
		IndexDao objIndexDao = new IndexDao();
		 return objIndexDao.getInventory(items);
	}
	
	

}
