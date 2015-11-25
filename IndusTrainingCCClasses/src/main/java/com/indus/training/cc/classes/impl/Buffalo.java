package com.indus.training.cc.classes.impl;

import com.indus.training.cc.classes.Animal;

public class Buffalo extends Animal {

	private String eats;

	public Buffalo() {
		super("Buffalo");
	}

	@Override
	public void eats() {
		this.eats = "Grass";

	}

	public String getEats() {
		return eats;
	}

}
