package com.yedam.exception;

public class Eexception {
	public static void main(String[] args) {
//		String date = null;
//				System.out.println(date.toString());
//				
//		Emaple example = null;
//			System.out.println(example.toString());
		
		//ArrayIndexOutOfBoundsException
		//배열의 범위를 벗어난 인덱스를 호출 할 때 발생
//		int[] intAry = new int[3];
		
//		intAry[0] = 1;
//		intAry[10] = 10;
		
//		for(int i= 0; i<=intAry.length;i++) {
//			System.out.println(intAry[i]);
//		}
		
		//NumberFormatException
		//숫자로 바꿀 수 없는 문자를 숫자로 바꾸려고 할 때
		String str = "123";
		int val = Integer.parseInt(str);
		System.out.println(val);
		
		//예외
		String str2 = "자바";
		val = Integer.parseInt(str2);
		System.out.println(val);
		
	}
}
