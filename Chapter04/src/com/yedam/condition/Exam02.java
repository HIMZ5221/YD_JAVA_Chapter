package com.yedam.condition;

import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		
		
		//90이상은 A
		//89~80 B
		//79~70 C
		//69~60 D
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하쇼 >");
		
		String score = sc.nextLine();
		
		int point = Integer.parseInt(score);
		
		switch(point/10) {
		case 10:
			System.out.println("A입니다.");
			break;
		case 9:
			System.out.println("A입니다.");
			break;
		case 8:
			System.out.println("B입니다.");
			break;
		case 7:
			System.out.println("C입니다.");
			break;
			
		default:
			System.out.println("D입니다.");
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
