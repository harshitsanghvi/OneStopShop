package com.onestopshop.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.onestopshop.beans.AddressBean;
import com.onestopshop.beans.LoginBean;
import com.onestopshop.beans.RegisterBean;

public class RegisterDao {

	public boolean registerUser(RegisterBean register, AddressBean address,
			LoginBean login) {

		SessionFactory factory;
		factory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.save(login);
			Long userId = login.getId(); 
					
			session.save(address);
			Long addressId = address.getId();
			
			System.out.println(userId+addressId);
			
			register.setUserId(userId);
			register.setAddressId(addressId);
			Long userprofileId = (Long) session.save(register);

			if (userprofileId > 0) {
				tx.commit();
			}
			return true;
		} catch (Exception e) {
			if(tx != null){
				tx.rollback();
			}
			e.printStackTrace();
		} finally{
			session.close();
		}
		return false;
	}
}
