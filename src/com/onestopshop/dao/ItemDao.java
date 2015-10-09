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
			String SQL_QUERY = "select id, title, description, price, image from Item where id='" + id + "'";
			Query query = session.createQuery(SQL_QUERY);

			Item item = new Item();
			for (Iterator iterator = query.iterate(); iterator.hasNext();) {
				Object[] row = (Object[]) iterator.next();
				item.setId((long) row[0]);
				item.setTitle((String) row[1]);
				item.setDescription((String) row[2]);
				item.setPrice((int) row[3]);
				item.setImage((String) row[4]);
			}
			System.out.println("db: " + item.getId());
			System.out.println("parameter: " + id);
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
