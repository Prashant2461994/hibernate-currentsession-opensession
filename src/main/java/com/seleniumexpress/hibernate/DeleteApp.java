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
public class DeleteApp {
	public static void main(String[] args) {

		// 1. create configuration
		// 2. create session factory
		// 3. initialize the session object

		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

		Session session = sessionFactory.openSession();

		Song song = session.get(Song.class, 1);

		session.beginTransaction();
		session.delete(song);
		session.getTransaction().commit();

		System.out.println("song deleted .. check db");
	}
}
