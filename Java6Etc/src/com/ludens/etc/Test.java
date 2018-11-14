package com.ludens.etc;

public class Test extends Thread {
	int seq;

	public Test(int seq) {
		this.seq = seq;
	}
	
	public void run(){
		System.out.println(this.seq + "번 쓰레드가 시작되었습니다.");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(this.seq + "번 쓰레드가 끝났습니다.");
		
	}
	
	

}
