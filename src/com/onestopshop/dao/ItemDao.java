package com.onestopshop.dao;

import java.util.Iterator;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.onestopshop.beans.Item;

public class ItemDao {

	public Item getItemInfo(int id, Item Item) {

		SessionFactory factory;
		factory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			String SQL_QUERY = "select title, description, price, image from Item where id='" + id + "'";
			Query query = session.createQuery(SQL_QUERY);

			Item item = new Item();
			for (Iterator iterator = query.iterate(); iterator.hasNext();) {
				Object[] row = (Object[]) iterator.next();
				System.out.println("db: " + row[0]);
				System.out.println("parameter: " + id);
				item.setTitle((String) row[0]);
				item.setDescription((String) row[1]);
				item.setPrice((int) row[2]);
				item.setImage((String) row[3]);
			}
			return item;
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
