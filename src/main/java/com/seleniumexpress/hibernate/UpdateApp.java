package com.seleniumexpress.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.seleniumexpress.models.Song;
import com.seleniumexpress.utils.HibernateUtils;

/**
 * Hello world!
 *
 */
public class UpdateApp {
	public static void main(String[] args) {

		// 1. create configuration
		// 2. create session factory
		// 3. initialize the session object

		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		Song song = new Song();
		song.setId(1);
		song.setName("rim zhim gire sawan".toUpperCase());
		song.setArtist("Kishore Kumar");
		
		session.beginTransaction();
		session.update(song);
		session.getTransaction().commit();
		
		System.out.println("song saved .. check db");
	}
}
