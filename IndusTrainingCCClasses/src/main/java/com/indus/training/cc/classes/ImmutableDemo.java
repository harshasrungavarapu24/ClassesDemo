package com.indus.training.cc.classes;

public final class ImmutableDemo {
	private final String name;
	public ImmutableDemo(String s){
		this.name=s;
	}
	public String getName(){
		return this.name;
	}

}
