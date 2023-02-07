package com.yedam.reference;

public class Exam02 {
	public static void main(String[] args) {
	
	//new 연산자 없는 String
	
	String strVal1 = "yedam";
	String strVal2 = "yedam";
	
	
	if(strVal1 == strVal2) {
		System.out.println("strVal1과 strVal2 는 메모리 주소 같음");
	}else {
		System.out.println("strVal1과 strVal2는 메모리 주소 다름");
			
		}
	
	if(strVal1.equals(strVal2)) {
		System.out.println("strVal1과 strVal2 는 메모리 주소 같음");
	}else {
		System.out.println("strVal1과 strVal2는 메모리 주소 다름");
			
		}
	
	String strVal3 = new String("yedam");
	String strVal4 = new String("yedam");
	
	if(strVal3 == strVal4) {
		System.out.println("같은메모리");
	}else {
		System.out.println("다른 메모리");
	}
			
if(strVal3.equals(strVal4)) {
	System.out.println("데이터 같음");
}else {
	System.out.println("데이터 다름");
}
	
//new 연산자 안 쓴 String, new 연산자를 사용한 String 비교
	if(strVal1 == strVal3) {
		System.out.println("같은 메모리 주소");
	}else {
		System.out.println("다른 메모리 주소");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
