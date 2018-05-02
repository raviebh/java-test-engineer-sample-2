/**
 * 
 */
package com.att.demo.blogic.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.att.demo.blogic.LocalRepo;
import com.att.demo.model.Cart;

/**
 * 
 *
 */
public class LocalRepoTest {
	
	private LocalRepo dataRepo;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		dataRepo = LocalRepo.getInstance();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		dataRepo = null;
	}

	
	/**
	 * Test method for {@link com.att.demo.blogic.LocalRepo#getInstance()}.
	 *//*
	@Test
	public void testGetInstance() {
		fail("Not yet implemented");
	}*/

	/**
	 * Test method for {@link com.att.demo.blogic.LocalRepo#getCartById(long)}.
	 */
	@Test
	public void testGetCartById() {

		assertNull(dataRepo.getCartById(100));
		
		dataRepo.addCart(100, new Cart());
		
		assertNotNull(dataRepo.getCartById(100));
		
	}

	/**
	 * Test method for {@link com.att.demo.blogic.LocalRepo#addCart(long, com.att.demo.model.Cart)}.
	 */
	@Test
	public void testAddCart() {
		
		assertNull(dataRepo.addCart(100, new Cart()));
		assertNotNull(dataRepo.addCart(100, new Cart()));
	}

	/**
	 * Test method for {@link com.att.demo.blogic.LocalRepo#updateCart(long, com.att.demo.model.Cart)}.
	 */
	@Test
	public void testUpdateCart() {
		
		// add cart first to update
		dataRepo.addCart(100, new Cart());
		
		assertNotNull(dataRepo.updateCart(100, new Cart()));
	}

}
