package com.revature.service;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.revature.beans.Credentials;
import com.revature.beans.Employee;

public class AuthenticationServiceTest3 {
	AuthenticationService es = new AuthenticationService();
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		
        Credentials creds = new Credentials();
        creds.setUsername("ssmith");
        creds.setPassword("irule");
        
        Employee emp = new Employee(4000, "Sarah", "Smith", null, null,"irule", 3000, 1);
        assertEquals(emp, es.authenticateUser(creds));
		fail("Not yet implemented");
	}

}
