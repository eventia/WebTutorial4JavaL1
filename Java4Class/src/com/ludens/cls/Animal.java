package com.ludens.cls;

public class Animal {
	String name;

	// set, get
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	// Constructor
	public Animal() {
	}

	public Animal(String name) {
		this.name = name;
	}
	

	// sleep
	public void sleepy() {
		System.out.println("ZzZzZzzz");
	}

}
