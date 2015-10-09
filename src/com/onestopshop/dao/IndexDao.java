package com.onestopshop.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.onestopshop.beans.Item;

public class IndexDao {

	public ArrayList<Item> getInventory(ArrayList<Item> Items) {

		SessionFactory factory;
		factory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			String SQL_QUERY = "select title, description, price, image from Item";
			Query query = session.createQuery(SQL_QUERY);

			ArrayList<Item> items = new ArrayList<Item>();
			for (Iterator iterator = query.iterate(); iterator.hasNext();) {
				Object[] row = (Object[]) iterator.next();
				Item item = new Item();
				item.setTitle((String) row[0]);
				item.setDescription((String) row[1]);
				item.setPrice((int) row[2]);
				item.setImage((String) row[3]);
				items.add(item);
			}
			return items;
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
			
			}
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;

	}
}
