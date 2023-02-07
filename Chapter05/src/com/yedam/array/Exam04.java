package com.yedam.array;

import java.util.Scanner;

public class Exam04 {
	public static void main(String[] args) {
		
		boolean run = true;
		int[] scores = new int[3] ; 
		Scanner sc= new Scanner(System.in);
		
		
		while(run) {
			System.out.println("==================================================");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("==================================================");
			System.out.println("선택>");
			
			int selectNo = Integer.parseInt(sc.nextLine());
			
			int[] studentArr ;
			
			
			if(selectNo == 1) {
				int student = Integer.parseInt(sc.nextLine());
				studentArr = new int[student];
				
			}else if(selectNo == 2) {
				System.out.println("국어 점수 입력>");
				scores[0] = Integer.parseInt(sc.nextLine());
				
				
				System.out.println("영어 점수 입력>");
				scores[1] = Integer.parseInt(sc.nextLine());
				
				
				System.out.println("수학 점수 입력>");
				scores[2] = Integer.parseInt(sc.nextLine());
				
				
			}else if(selectNo == 3) {
				for(int var : scores) {
					System.out.println(var);
				}
				
			}else if(selectNo == 4) {
				int max = 0 ;
				int sum = 0 ;
				for(int i=0;i<scores.length;i++) {
					if(scores[i]> max) {
						max = scores[i];
					}
					sum += scores[i];
				}
				System.out.println("최대값 = " + max);
				System.out.println("평균값 = "+((double)sum/(scores.length)));
				
			
				
			}else if(selectNo == 5) {
				run = false;
			}
			
		}
		System.out.println("프로그램 폭파");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
