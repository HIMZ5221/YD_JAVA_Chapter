package com.yedam.poly;

public class CastingExample {
	
		public static void method1(Parent parent) {
			
		
			if(parent instanceof Child) {
				Child child = (child) parent;
				System.out.println("Casting 성공");
			}else {
				System.out.println("Casting 실패");
			}
		}
		
		public static void method2(Parent parent) {
			if(parent instanceof Child) {
				Child child = (child) parent;
				System.out.println("Casting 성공");
			}
	
	
		public static void main(String[] args) {
			//Child 클래스로 만들어진 객체
			Parent p1 = new Child();
			
			//Child 02 로 만들어진 객체
			Parent p2 = new Child02();
			//Child02 child02 (Child02) p2;
			method2(p2);
	
	

	
	
	

	
	
	

	
	
	

	
	
	

	
	
	

	
	
	

	
	
	

	
	
		
	}
	
}
