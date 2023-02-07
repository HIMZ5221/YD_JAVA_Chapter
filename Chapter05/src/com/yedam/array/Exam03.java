package com.yedam.array;

import java.util.Scanner;

public class Exam03 {
	public static void main(String[] args) {
		//한 학생의 국영수 성적을 보관하는 배열
		
		Scanner sc = new Scanner(System.in);
		
		//배열 생성
		int[] point = new int[3];
		
		//첫번쨰 : 국어
		System.out.println("국어점수>");
		point[0] = Integer.parseInt(sc.nextLine());
		//두번쨰 : 영어
		System.out.println("국어점수>");
		point[1] = Integer.parseInt(sc.nextLine());
		//세번쨰 : 수학
		System.out.println("국어점수>");
		point[2] = Integer.parseInt(sc.nextLine());
		
		//점수의 총 합계
		
		int sum = 0;
		
		for(int i= 0;i< point.length; i++) {
			sum += point[i];
		}
		System.out.println("점수 합계다 !! = " + sum);
		
		//점수의 평균(실수)
		
		System.out.printf("너의 평균점수 이다 !!! = %5.2f \n", ((double)sum/point.length));
		
		
		//최대값 구하기
		int max = 0;
		for(int i = 0; i<point.length; i++) {
			if(point[i] > max) {
				max = point[i];
			}
		}
		
		System.out.println("최대값 : " + max);
		
		//최소값 구하기
		
		int min = point[0];
		for(int i = 0; i<point.length; i++) {
			if(point[i] < min) {
				min = point[i];
			}
		}
		
		System.out.println("최소값 : " + min);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
