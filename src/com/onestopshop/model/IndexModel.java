package com.onestopshop.model;

import java.util.ArrayList;
import java.util.List;

import com.onestopshop.beans.Item;
import com.onestopshop.dao.IndexDao;

public class IndexModel {
	
	public boolean getItems(ArrayList<Item> items){
		IndexDao objIndexDao = new IndexDao();
		 return objIndexDao.getInventory(items);
	}

}
