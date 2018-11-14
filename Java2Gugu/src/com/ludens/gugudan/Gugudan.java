package com.ludens.gugudan;

public class Gugudan {
	
	private int dan;
	
	public int getDan() {
		return dan;
	}

	public void setDan(int dan) {
		this.dan = dan;
	}
	
	public Gugudan(int dan) {
		this.dan = dan;
	}

	public Gugudan() {
	}

	public void gugucalc() {
		System.out.println(dan + " X 1 = " + dan*1);
		System.out.println(dan + " X 2 = " + dan*2);
		System.out.println(dan + " X 3 = " + dan*3);
		System.out.println(dan + " X 4 = " + dan*4);
		System.out.println(dan + " X 5 = " + dan*5);
		System.out.println(dan + " X 6 = " + dan*6);
		System.out.println(dan + " X 7 = " + dan*7);
		System.out.println(dan + " X 8 = " + dan*8);
		System.out.println(dan + " X 9 = " + dan*9);
	}


}