package com.ludens.string;

import java.util.ArrayList;
import java.util.HashMap;

public class MainClass {

	public static void main(String[] args) {

		// �迭
		String[] weeks = new String[7];
		weeks[0] = "��";
		weeks[1] = "ȭ";
		weeks[2] = "��";
		weeks[3] = "��";
		weeks[4] = "��";
		weeks[5] = "��";
		weeks[6] = "��";
		
		System.out.println(weeks[3]);
		
		// ����Ʈ
		ArrayList pitches = new ArrayList();
		pitches.add("hello");
		pitches.add("142");
		System.out.println(pitches.get(1));
		System.out.println(pitches.size());
		System.out.println(pitches.contains("142"));
		System.out.println(pitches.remove("142"));
		
		// ���ʸ�
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("hi");
		aList.add("LuCo");
		
		String sayhello = (String) pitches.get(0);
		String sayhi = aList.get(0);
		
		// �� (key : value)
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("apple", "���");
		map.put("oragne", "������");
		map.put("pen", "��");
		
		System.out.println(map.get("pen"));
		map.containsKey("pen");
		map.remove("pen");
		map.size();
	}
}

