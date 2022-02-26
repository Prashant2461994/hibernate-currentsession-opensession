package com.seleniumexpress.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.seleniumexpress.models.Address;
import com.seleniumexpress.models.Student;
import com.seleniumexpress.utils.HibernateUtils;

/**
 * Hello world!
 *
 */
public class StudentApp {
	public static void main(String[] args) {

		// 1. create configuration
		// 2. create session factory
		// 3. initialize the session object

		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.getTransaction();

		transaction.begin();

		Student stu = new Student();
		stu.setName("Prashant");
		stu.setMobileNo(7829442793l);

		Address address = new Address();
		address.setAddressLine1("9, Shiv Vihar Coloney");
		address.setAddressLine2("Sec-5,Vikas Nagar");
		address.setCity("Lucknow");
		address.setCountry("India");

		stu.setAddress(address);
		session.save(stu);
		transaction.commit();

	}

}
