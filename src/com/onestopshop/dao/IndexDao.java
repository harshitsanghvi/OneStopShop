package com.onestopshop.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.onestopshop.beans.Item;

public class IndexDao {


	public boolean getInventory(ArrayList<Item> items) {

		SessionFactory factory;
		factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			String SQL_QUERY = "select item.itemname, item.itemdesc, item.itemprice, item.itemimagepath from Item item";
			Query query = session.createQuery(SQL_QUERY);

			items = new ArrayList<Item>();
			for (Iterator iterator = query.iterate(); iterator.hasNext();) {
				Item item = (Item) iterator.next();
				items.add(item);
			}
			return true;
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
			
			}
			e.printStackTrace();
		} finally {
			session.close();
		}
		return false;

	}
}
