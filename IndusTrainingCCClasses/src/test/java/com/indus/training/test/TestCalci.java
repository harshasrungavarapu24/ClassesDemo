package com.indus.training.test;

import com.indus.training.cc.classes.Calci;

public class TestCalci {

	public static void main(String[] args) {
		Calci calObj1=Calci.getCalciInstance();
		Calci calObj2=Calci.getCalciInstance();
		System.out.println(calObj1==calObj2);
		System.out.println(calObj1);
		System.out.println(calObj2);

	}

}
