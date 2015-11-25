package com.indus.training.test;

import com.indus.training.cc.classes.impl.Square;

import junit.framework.TestCase;

public class TestSquare extends TestCase {
	private Square sObj;

	protected void setUp() throws Exception {
		sObj = new Square();
		super.setUp();
	}

	protected void tearDown() throws Exception {
		sObj = null;
		super.tearDown();
	}

	public void testArea() {
		double l = 5.0;

		double expectedArea = 25.0;
		sObj.setLength(l);
		sObj.area();
		double actualArea = sObj.getArea();

		assertEquals(expectedArea, actualArea, 0);
	}

	public void testPerimeter() {
		double l = 5.0;

		double expectedPerimeter = 20.0;
		sObj.setLength(l);
		sObj.perimeter();
		double actualPerimeter = sObj.getPerimeter();

		assertEquals(expectedPerimeter, actualPerimeter, 0);
	}

	public void testGetLength() {
		double l = 5.0;

		double expectedLength = 5.0;
		sObj.setLength(l);
		double actualLength = sObj.getLength();

		assertEquals(expectedLength, actualLength, 0);
	}

	public void testSetLength() {
		double l = 5.0;

		double expectedLength = 5.0;
		sObj.setLength(l);
		double actualLength = sObj.getLength();

		assertEquals(expectedLength, actualLength, 0);
	}

	public void testGetArea() {
		double l = 5.0;

		double expectedArea = 25.0;
		sObj.setLength(l);
		sObj.area();
		double actualArea = sObj.getArea();

		assertEquals(expectedArea, actualArea, 0);
	}

	public void testGetPerimeter() {
		double l = 5.0;

		double expectedPerimeter = 20.0;
		sObj.setLength(l);
		sObj.perimeter();
		double actualPerimeter = sObj.getPerimeter();

		assertEquals(expectedPerimeter, actualPerimeter, 0);
	}

}
