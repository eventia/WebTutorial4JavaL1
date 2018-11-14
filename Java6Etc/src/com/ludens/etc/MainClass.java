package com.ludens.etc;

public class MainClass {

	public static void main(String[] args) {


		// Exception 예외처리
		int c;
		try {
			System.out.println("hello~~");
			c = 4 / 0;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("에러발생");
			c = -1;
		} finally {
			System.out.println("프로그램이 중단되지 않고 끝까지 진행되었습니다.");
		}

		
		// thread 쓰레드
		for(int i=0; i<10; i++) {
			Thread t = new Test(i);
			t.start();
		}
		System.out.println("끝!");
		
		
//		Pet coco = new Pet();
//		Pet lu = new Pet();
//		
//		System.out.println(Pet.getCount());
//		
//		Pet luco = new Pet();
//		System.out.println(lu.getCount());
		
		
//		int c;
//		try {
//			c = 4/0;
//		} catch (Exception e) {
//			System.out.println("에러발생");
//			c = -1;
//		} finally {
//			System.out.println("프로그램이 종료되지 않고 진행되었습니다.");
//			
//		}
//		System.out.println(c);
			
	}
}
