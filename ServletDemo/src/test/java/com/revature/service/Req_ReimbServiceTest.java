package com.revature.service;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Req_ReimbServiceTest {
	/*In eclipse, highlight the class that has the method you want to tes
	 * (you can also test all of the methods in one test case)
	 * go file new JunitTest case. It will append Test to the class name
	 * for a new Test class. It will also have a few stubs (Before, after, ect
	 * 
	 */

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
/*
 * @Test is where you write your tests. that's basically it.
 */
	@Test
	public void testMult2Nums() {
		Req_ReimbService mn = new Req_ReimbService();
		assertEquals(0, mn.mult2Nums(10, 0));
		assertEquals(0, mn.mult2Nums(0, 10));
		assertEquals(0, mn.mult2Nums(0, 0));
		assertEquals(36, mn.mult2Nums(9, 4));
		assertEquals(35, mn.mult2Nums(7, 5));
		
	}

}
