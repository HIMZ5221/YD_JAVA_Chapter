package com.yedma.loop;

public class ForExample {
	public static void main(String[] args) {
		//반복문
		//일정한 행동을 게속 반복
		//반복을 할 때 어떠한 규칙에 따라 행동 반복
		//규칙 찾는ㄴ게 중요.
		
		//1~5까지 누적의 합
		int sum = 0;
		
		for(int i = 1; i<=5; i++) {
			sum += i;
		}
		
		
		System.out.println(sum);
		
		
		//1~100 사이에서 짝수 구하는 반복문
		//1~100 -> 1~100까지 반복
		//1 2 3 4 5 6 7 8 9 
		//2 % 2

		for(int i = 1; i<100;i++) {
			if(i % 2 == 0) {
				System.out.println(i + "\t");
			}
		}
		
		//1~100사이의 홀수 구하는 반복문
		//1 3 5 7 9 11 13 15....................
		
		for(int i = 1; i<100;i++) {
			if(i % 2 == 1) {
				System.out.println(i + "\t");
			}
		}
		
		//1~100사이에서 2의 배수 또는 3의 배수 찾기
		for(int i = 1;i<=100; i++) {
			if(i%2 == 0 || i%3 == 0) {
				System.out.println("2 또는 3의 배수" + 2 *i);
			}
		}
		
		//중첩 for 문
		//for안에 for가 들어가는 경우
//		
		for(int i = 2; i<=9;i++) {
			//j = 1~9
			for(int j = 1; j<=9;j++) {
				System.out.println(i + "*" + j + "=" + (i*j));
					
				
			};
		};
		
		//구구단 세로 찍기
		
		for(int i = 1; i<=9; i++) {
			for(int j = 2; j<=5; j++) {
				System.out.print(j + " x " + i + " = " + (i*j)+ "\t");
			}
			System.out.println("\n");
		}
		
		//공포의 별찍기
		for(int i=1; i <= 5 ; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1; i<=5; i++) {
			String star = "";
			for(int j=5; i< j; j--) {
				star += "*";
			}
			System.out.println(star);
		}
		
		
		for(int i=1; i<=5; i++) {
			String star = "";
			for(int h=4; h>=i;h--) {
				star += " ";
			}
			for(int j=0; i> j; j++) {
				star += "*";
			}
			System.out.println(star);
		}
		
		for(int i=5; i >0; i--) {
			for(int j=1; j<=5; j++) {
				if(i>j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}
}
