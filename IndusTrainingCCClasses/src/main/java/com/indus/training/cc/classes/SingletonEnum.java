package com.indus.training.cc.classes;

public enum SingletonEnum {
	calObj();

	public static SingletonEnum getCalciEnumInstance() {
		return SingletonEnum.calObj;
	}

	public  double add(double param1, double param2) {
		double result=0.0;
		result=param1 + param2;
		return result;
	}
	
	
}
