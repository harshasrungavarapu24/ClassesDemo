package com.indus.training.test;

import com.indus.training.cc.classes.ImmutableDemo;

public class TestImmutableDemo {

	public static void main(String[] args) {
		ImmutableDemo i1=new ImmutableDemo("Harsha");
		ImmutableDemo i2=i1;
		
		System.out.println(i1==i2);
		//i1.name.replace('H','a');
		System.out.println("i1:"+i1.getName());
		System.out.println("i2:"+i2.getName());
		System.out.println(i1);
		System.out.println(i2);
		
		
		String s = "some text";
		s.substring(0,4);
		System.out.println(s); // still printing "some text"
		String a = s.substring(0,4);
		System.out.println(a); // prints "some"
		a.substring(0,2);
		System.out.println(a.substring(0,2));
		System.out.println(s.replace(' ', 'a'));
		System.out.println(s);

	}

}
