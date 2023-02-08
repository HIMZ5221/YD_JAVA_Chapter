package com.yedam.API;

import java.util.Random;

public class MathExample {

	public static void main(String[] args) {
		int v1 =Math.abs(-5);
		System.out.println(v1);
		double v2 = Math.abs(-3.14);
		System.out.println(v2);
		
		double v3 = Math.ceil(5.3);
		System.out.println(v3);
		double v4 = Math.ceil(-5.3);
		System.out.println(v4);
		
		double v5 = Math.floor(5.3);
		System.out.println(v5);
		double v6 = Math.floor(-5.3);
		System.out.println(v6);
		
		int v7 = Math.max(5, 9);
		System.out.println(v7);
		double v8 = Math.max(5.3, 2.5);
		System.out.println(v8);
		
		int v9 = Math.min(5, 9);
		System.out.println(v9);
		double v10 = Math.min(5.3, 2.5);
		System.out.println(v10);
		
		//Math.random()	-> 범위 지정해서 데이터 읽어
		//Random() -> seed라고 씨앗을 넣어주면 거기에 맞게끔 랜덤 데이터생성
		Random random = new Random(System.currentTimeMillis());
		System.out.println(random.nextDouble()+ "랜덤값");
		
		double v11 = Math.random();
		System.out.println(v11);
		
		double v12 = Math.rint(8.5);
		System.out.println(v12);
		double v13 = Math.rint(7.5);
		System.out.println(v13);
		
		long v14 = Math.round(5.3);
		System.out.println(v14);
		long v15 = Math.round(5.7);
		System.out.println(v15);
		
				

	}

}
