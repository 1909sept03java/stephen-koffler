package com.revature.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConnectionUtil {

	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			// if no SessionFactory has been created, make one
			Configuration c = new Configuration();
			// read in connection details from system environment
			// can also use a properties file like we have before
			// or hardcode (don't, but it's possible)
			c.setProperty("hibernate.connection.username", "project2");
			c.setProperty("hibernate.connection.password", "CZMASKZC");
			c.setProperty("hibernate.connection.url", "jdbc:oracle:thin:@cdb.cnvcpuuo6moo.us-east-1.rds.amazonaws.com:1521:orcl");
			c.configure(); // looks for src/main/resources/hibernate.cfg.xml for other properties
			sessionFactory = c.buildSessionFactory();
		}
		return sessionFactory;
	}

}