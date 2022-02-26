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
public class CreateApp {
	public static void main(String[] args) {

		// 1. create configuration
		// 2. create session factory
		// 3. initialize the session object
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		Session session = sessionFactory.openSession();

		Song song = new Song();
		song.setId(5);
		song.setName("kal Ho Na Ho");
		song.setArtist("Abhijit");

		session.beginTransaction();
		session.save(song);
		session.getTransaction().commit();
		session.close();

		System.out.println("song saved .. check db");
	}

	
}
