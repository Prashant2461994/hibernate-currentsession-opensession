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
public class ReadApp {
	public static void main(String[] args) {

		// 1. create configuration
		// 2. create session factory
		// 3. initialize the session object

		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		Session session = sessionFactory.openSession();
		boolean isSessionConatinsEnity = false;
		session.beginTransaction();
		Song song = session.get(Song.class, 2);
		isSessionConatinsEnity = session.contains(song);
		System.out.println(" isSessionConatinsSongEnity ::: " + isSessionConatinsEnity);
		session.evict(song);
		// session.getTransaction().commit();
		isSessionConatinsEnity = session.contains(song);
		System.out.println(" isSessionConatinsSongEnity ::: " + isSessionConatinsEnity);

	}
}
