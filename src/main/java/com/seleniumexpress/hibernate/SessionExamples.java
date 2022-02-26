package com.seleniumexpress.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.seleniumexpress.models.Song;
import com.seleniumexpress.utils.HibernateUtils;

/**
 * Hello world!
 *
 */
public class SessionExamples {
	public static void main(String[] args) {

		// 1. create configuration
		// 2. create session factory
		// 3. initialize the session object
		
		/**NOTE: Session Obtained from getCurrentSession are self managed we do'nt need to  close them**/
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		Session session1 = sessionFactory.getCurrentSession();
		Session session2 = sessionFactory.getCurrentSession(); 

		if(session1==session2) {
			System.out.println("BOTH ARE SAME..");
		}
		
		
		session1.beginTransaction();
		session1.getTransaction().commit();
		session1.close(); // DONT NEED TO CLOSE session object obtained from getCurrentSession

		System.out.println("song saved .. check db");
	}

	
}
