package com.yedam.inheri;

public class Child extends Parent {

	

	//필드
	public String lastName;
	public char bloodType;
	public int age;
	public String habbit;
	
	//생성자
	
	
	//메소드
	@Override
	public void getInfo() {
		super.getInfo();
		System.out.println("내이름 : " + lastName);
		System.out.println("내이름 : " + lastName);
		System.out.println("내이름 : " + lastName);
		System.out.println("내이름 : " + lastName);
	}
	
	
	
	
	
	
	
	
	
//	public Child(String lastName, char blood, int age, String hobby) {
//		this.lastName = lastName;
//		this.blood = blood;
//		this.age = age;
//		this.hobby = hobby;
//	}
	

}
