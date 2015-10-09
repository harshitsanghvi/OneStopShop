package com.onestopshop.model;

import com.onestopshop.beans.Item;
import com.onestopshop.dao.ItemDao;

public class ItemModel {
	
	public Item getItem(String value, Item item){
		 ItemDao objItemDao = new ItemDao();
		 return objItemDao.getItemInfo(value, item);
	}

}

