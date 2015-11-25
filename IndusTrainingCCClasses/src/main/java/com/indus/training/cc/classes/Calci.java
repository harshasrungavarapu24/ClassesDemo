package com.indus.training.cc.classes;

public class Calci {

	private static Calci calciObj = new Calci();

	private Calci() {

	}

	public double addition(double param1, double param2) {
		return param1 + param2;
	}

	public static Calci getCalciInstance() {
		return calciObj;
	}

}

































