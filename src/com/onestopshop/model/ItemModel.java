package com.onestopshop.model;

import com.onestopshop.beans.Item;
import com.onestopshop.dao.ItemDao;

public class ItemModel {
	
	public Item getItem(int id, Item item){
		 ItemDao objItemDao = new ItemDao();
		 return objItemDao.getItemInfo(id, item);
	}

}

