package com.onestopshop.dao;

import java.util.Iterator;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.onestopshop.beans.LoginBean;

public class LoginDao {

	private int count;
	SessionFactory factory;

	public boolean checkLogin(LoginBean login) {
		factory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = null;


		try {
			tx = session.beginTransaction();
			String SQL_QUERY = "select login.uname,login.password from LoginBean as login where login.uname='"
					+ login.getUname() + "' and login.password='" + login.getPassword() + "' ";
			Query query = session.createQuery(SQL_QUERY);

			for (Iterator<?> iterator = query.iterate(); iterator.hasNext();) {
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
