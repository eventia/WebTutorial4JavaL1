package com.ludens.etc;

public class MainClass {

	public static void main(String[] args) {


		// Exception ����ó��
		int c;
		try {
			System.out.println("hello~~");
			c = 4 / 0;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("�����߻�");
			c = -1;
		} finally {
			System.out.println("���α׷��� �ߴܵ��� �ʰ� ������ ����Ǿ����ϴ�.");
		}

		
		// thread ������
		for(int i=0; i<10; i++) {
			Thread t = new Test(i);
			t.start();
		}
		System.out.println("��!");
		
		
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
//			System.out.println("�����߻�");
//			c = -1;
//		} finally {
//			System.out.println("���α׷��� ������� �ʰ� ����Ǿ����ϴ�.");
//			
//		}
//		System.out.println(c);
			
	}
}
