package com.indus.training.cc.classes.impl;

import com.indus.training.cc.classes.Shape;

public class Square implements Shape {

	private double length;
	private double area;
	private double perimeter;

	
	public void area() {
		this.area = length * length;

	}

	public void perimeter() {
		this.perimeter = 4 * this.length;

	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getArea() {
		return area;
	}

	

	public double getPerimeter() {
		return perimeter;
	}

	
	
	

}
