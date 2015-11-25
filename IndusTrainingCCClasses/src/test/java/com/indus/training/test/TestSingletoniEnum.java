package com.indus.training.test;

//import com.indus.training.cc.classes.Calci;
import com.indus.training.cc.classes.SingletonEnum;

public class TestSingletoniEnum {

	public static void main(String[] args) {
		SingletonEnum calObj1=SingletonEnum.getCalciEnumInstance();
		SingletonEnum calObj2=SingletonEnum.getCalciEnumInstance();
		System.out.println(calObj1==calObj2);
		
		double expectedResult=3.0;
		double actualResult=calObj1.add(1.0, 2.0);
		System.out.println(expectedResult==actualResult);
		
		//System.out.println(calObj1.getClass().getName());
		//System.out.println(calObj2);
		
	}

}
