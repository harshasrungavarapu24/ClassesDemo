package com.indus.training.test;

import com.indus.training.cc.classes.impl.Buffalo;

import junit.framework.TestCase;

public class TestBuffalo extends TestCase {

	private Buffalo bObj;

	protected void setUp() throws Exception {
		bObj = new Buffalo();
		super.setUp();
	}

	protected void tearDown() throws Exception {
		bObj = null;
		super.tearDown();
	}

	public void testEats() {
		bObj.eats();
		String expextedEats = "Grass";
		String actualEats = bObj.getEats();

		assertEquals(expextedEats, actualEats);
	}

	public void testGetEats() {
		bObj.eats();
		String expextedEats = "Grass";
		String actualEats = bObj.getEats();

		assertEquals(expextedEats, actualEats);
	}

}
