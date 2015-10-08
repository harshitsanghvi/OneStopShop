package com.onestopshop.dao;

import java.util.Iterator;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class LoginDao {

	private int count;

	public boolean checkLogin(String uname, String password) {

		SessionFactory factory;
		factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			String SQL_QUERY = "select login.uname,login.password from LoginBean as login where login.uname="
					+ uname + " and login.password=" + password + " ";
			Query query = session.createQuery(SQL_QUERY);

			for (Iterator iterator = query.iterate(); iterator.hasNext();) {
				iterator.next();
				count++;
			}
			if (count == 1) {
				return true;
			}
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
