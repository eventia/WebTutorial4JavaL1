package com.ludens.etc;

public class Pet {
	static int count = 0; 
	
	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Pet.count = count;
	}

	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Pet() {
		super();
		this.count = this.count+1;
	}
	
	

}
