package com.yedam.set;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {
	Map<String, Integer> map = new HashMap<>();
	
	map.put("고길동", 85);
	map.put("김또치", 90);
	map.put("고희동", 80);
	map.put("김또치", 33);
		
	System.out.println("총 Entry 수 : " + map.size());
	
		
	}
}
