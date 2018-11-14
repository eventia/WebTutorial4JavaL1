package com.ludens.string;

import java.util.ArrayList;
import java.util.HashMap;

public class MainClass {

	public static void main(String[] args) {

		// 배열
		String[] weeks = new String[7];
		weeks[0] = "월";
		weeks[1] = "화";
		weeks[2] = "수";
		weeks[3] = "목";
		weeks[4] = "금";
		weeks[5] = "토";
		weeks[6] = "일";
		
		System.out.println(weeks[3]);
		
		// 리스트
		ArrayList pitches = new ArrayList();
		pitches.add("hello");
		pitches.add("142");
		System.out.println(pitches.get(1));
		System.out.println(pitches.size());
		System.out.println(pitches.contains("142"));
		System.out.println(pitches.remove("142"));
		
		// 제너릭
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("hi");
		aList.add("LuCo");
		
		String sayhello = (String) pitches.get(0);
		String sayhi = aList.get(0);
		
		// 맵 (key : value)
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("apple", "사과");
		map.put("oragne", "오렌지");
		map.put("pen", "펜");
		
		System.out.println(map.get("pen"));
		map.containsKey("pen");
		map.remove("pen");
		map.size();
	}
}

