package com.revature.service;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.revature.beans.Credentials;
import com.revature.beans.Employee;
import com.revature.beans.User;

public class AuthenticationServiceTest3 {
	AuthenticationService es = new AuthenticationService();
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testAuthenticateUser() {
		
        Credentials creds = new Credentials();
        creds.setUsername("ssmith");
        creds.setPassword("irule");
        
        User usr = new User(4000, "Sarah", "Smith",  1);
        assertEquals(usr, es.authenticateUser(creds));
		
	}

}
