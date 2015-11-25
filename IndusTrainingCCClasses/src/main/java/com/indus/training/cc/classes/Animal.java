package com.indus.training.cc.classes;

public abstract class Animal {
	private String name;

	public abstract void eats();

	public Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

}
