package com.ludens.cls;

public class MainClass {

	public static void main(String[] args) {
		
		Animal petc = new Animal();
		
		petc.setName("Lu");
		System.out.println(petc.getName());
		
		Animal petd = new Animal("Coco");
		System.out.println(petd.getName());

		
		petc.sleepy();
		
		Cat cindy = new Cat("cindy");
		cindy.say();
		
//		System.out.println(cindy.getName());
	}
}
