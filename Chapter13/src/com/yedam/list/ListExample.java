package com.yedam.list;

import java.util.ArrayList;

import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		//List<E>
		//데이터는 String문자열을 넣을수 있는 ArrayList
		//List<String>list = new ArrayList<String>();
		List<String> list = new ArrayList<String>();
		
		//list - date add
		list.add("Java");
		list.add("JDBC");//인덱스 1데이터
		list.add("Servelt/JSP");//인덱스 2데이터
		//인덱스 2 데이터 추가, 한칸씩 밀림.
		list.add(2, "DataBase");
		list.add("iBatis");
		
		//list.size() -> list의 크기(배열로치면length)
		for(int i=0; i<list.size(); i++) {
			//list.get ->해당 인덱스 객체를 꺼내옴.
			String str= list.get(i);
			System.out.println(i+ " : " + str);
		}
		System.out.println("===============================");
		
		//해당 인덱스ㅡ이 객체 삭제
		list.remove(2);
		for(int i=0; i<list.size(); i++) {
			//list.get ->해당 인덱스 객체를 꺼내옴.
			String str= list.get(i);
			System.out.println(i+ " : " + str);
		}
		
		System.out.println("===============================");
		
		//객체를 콕 찝어서 삭제
		list.remove("JDBC");
		
		for(int i=0; i<list.size(); i++) {
			//list.get ->해당 인덱스 객체를 꺼내옴.
			String str= list.get(i);
			System.out.println(i+ " : " + str);
		}
		//리스트 객체 전부 삭제
		list.clear();
		System.out.println(list.size());
		
		
		
		
		
		
		
		

	}

}
