package com.yedam.API;

public class ClassExample {
public static void main(String[] args) {
	//Class 클래스 에ㅓㅅ 정보 얻기
	Class clazz = new Member.class;
	System.out.println("Class 정보 ; " + clazz);
	
	//클래스 경로 업력해서 정보 얻기
	clazz = Class.forName("comlydeam.PAI.Mem ber");
	
	clazz = member.getClass();
	System.out.println(clazz);
	
	System.out.println(clazz.getName());
	System.out.println(clazz.getSimpleName);
	System.out.println(clazz.getParkageName());
	System.out.println(clazz.getPackage().getName());
	}
}
