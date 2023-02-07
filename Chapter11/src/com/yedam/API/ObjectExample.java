package com.yedam.API;

import java.util.HashMap;

public class ObjectExample {
	public static void main(String[] args) {
		
		Member member = new Member("123");
		Member member2 = new Member("123");
		Member member3 = new Member("321");
		
		
		System.out.println(member.equals(member2));
		System.out.println(member.equals(member3));
		
		
		//데이터를 저장 -> 세트로 데이터를 저장
		//데이터를 찾을 Key를 가지고 hashMap에 접근하면
		//Key에 매칭되어 있는 데이터를 가지고 나오는 형태
		HashMap<Key, String> hashMap = new HashMap<>();
		
		
		hashMap.put(new Key(1), "홍길동");
		
		String value = hashMap.get(new Key(1));
		System.out.println(value);
		
		HashMap<Member, String>	hashMap02 = new HashMap<>();
		hashMap02.put(new Member("열쇠"),"김또치");
		
		String str = hashMap02.get(new Member("열쇠"));
		System.out.println(str);
	}
}
