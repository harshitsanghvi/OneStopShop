package com.onestopshop.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.onestopshop.beans.LoginBean;
import com.onestopshop.beans.RegisterBean;

public class RegisterDao {

	public boolean registerUser(String uname, String password) {

		SessionFactory factory;
		factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			int id = 0;
			tx = session.beginTransaction();
			String USERLOGIN_QUERY = "insert into LoginBean VALUES(uname,password)";
			Long user_id = (Long) session.save(USERLOGIN_QUERY);

			String ADDRESS_QUERY = "insert into AddressBean  VALUES (addressLine1, addressLine2, city, state, country, zip)";
			Long address_id = (Long) session.save(ADDRESS_QUERY);

			String USERPROFILE_QUERY = "insert into RegisterBean VALUES (firstName, lastName, userId, phone, addressId) ";
			Long userprofile_id = (Long) session.save(USERPROFILE_QUERY);

			tx.commit();

		} catch (Exception e) {

		}
		return false;
	}
}
