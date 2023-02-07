package com.yedam.access;

import java.util.Scanner;

public class yedam20230202 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	//[문제1]
	//[문제1]
	//[문제1]
	//[문제1]
	//[문제1] 변수 두 개를 선언해서 10과 2.0을 대입하고 두 변수의 사칙 연산.............	
	//∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨
		int a = 10;
		double b = 2.0;
		
		System.out.println(a+(int)b);
			
		int num1 =10;
		int num2 =20;
		boolean result;
		
			
	//[문제2] ★☆★시험지참조★☆★
		
		
	//[문제3]
	//[문제3]
	//[문제3]
	//[문제3]
	//[문제3]
	//∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨
		int[] coinUnit = new int[4];
		
		int money = 2680;
		System.out.println("money=" + money);
		
		for (int i=0; i<coinUnit.length; i++) {
			if(i==0) {
				coinUnit[i] = money/500;
				money=money%500;
			}else if(i==1) {
				coinUnit[i] = money/100;
				money=money%100;
			}else if(i==2) {
				coinUnit[i] = money/50;
				money=money%50;
			}else if(i==3) {
				coinUnit[i] = money/10;
				money=money%10;
			}
		}
		System.out.println("500원 : " + coinUnit[0] + "개" + ", 100원 : " + coinUnit[1]  + "개" + ", 50원 : " + coinUnit[2]  + "개" + ", 10원 : " + coinUnit[3]  + "개");
		
	
	//[문제4]
	//[문제4]
	//[문제4]	
	//[문제4]
	//[문제4]
	//∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨
		System.out.println("구구단 입니다. 원하는 단을 입력하시오.");
		int dan1 = Integer.parseInt(sc.nextLine());
		int dan2 = dan1+1;
		
		while(dan2 > dan1) {
			System.out.println("선택한 단 은 : " + dan1 + "입니다. 곱샘할 값을 입력하시오." );
			dan2 = Integer.parseInt(sc.nextLine());
			if(dan2 > dan1) {
				System.out.println("곱셈값이 단수보다 클수 없습니다. 다시 입력하세요");
			}
		}
				for(int i=1 ; i<=dan2 ; i++) {
					System.out.println(dan1+" * "+i+" = "+dan1*i);
				}
				
				
	//[문제5]		
	//[문제5]		
	//[문제5]		
	//[문제5]		
	//[문제5]
	//∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨∨
		int size = 0;
		int[] ary = null;
		int count = 0;
		boolean butten = true;
		int high = 0;
		
		
	while(butten) {
		System.out.println("===1.주사위 크기 2.주사위 굴리기 3.결과 보기 4.가장 많이 나온 수 5.종료 ===");
		System.out.println("메뉴>");
		
		int selectNo = Integer.parseInt(sc.nextLine());
		
		
		//1번클릭
//============================================================================================		
		if(selectNo == 1) {
			size = 0;
			ary = new int[0] ;
		while(5 >size || 10 < size) {
			System.out.println("===주사위 크기를 정하십쇼. 최소크기는 5, 최대크기는 10 입니다 ===>");
			size = Integer.parseInt(sc.nextLine());
			
			if(5 <= size || 10 >= size) {
				ary = new int[size];
			}else {
				System.out.println("값을 확인하고 다시 입력하시오.");
				System.out.println("^^^^^^^^^^^^^^^^^^^^^^^");
			}
		}	
			
		
		//2번클릭
//============================================================================================		
		}else if(selectNo == 2 && ary != null) {
			
			count = 0;
			int random = 0;
			
			while(random != 5) {
				random = (int)(Math.random()*size+1);
				ary[random-1]+=1;
				count += 1;
			}
			System.out.println("5가 나올때까지 주사위를 " +count+ "번 굴렸습니다.");

		
		//3번클릭
//============================================================================================		
		}else if(selectNo == 3 && ary != null) {
			for(int i=0;i<ary.length;i++) {
				System.out.println((i+1) + "은 "+ ary[i]+ "번 나왔습니다.");
			}
			
			
		//4번클릭
//============================================================================================		
		}else if(selectNo == 4 && ary != null) {
			high = 0; 
			int count1 = 0;
			for(int i=0;i<ary.length;i++) {
				if(ary[i] >= count1) {
					high = i+1;
					count1 = ary[i];
				}
			}
			System.out.println("가장 많이 나온 수는 "+ high  + "입니다.");
			
		
		//5번클릭 종료
//============================================================================================		
		}else if(selectNo == 5) {
			System.out.println("프로그램 종료 !!");
			butten = false;
		}else {
			System.out.println(" 선택한 값이 아~~~주 이상합니다. 다시 입력하세요 ! ");
		}

	}
		
	
		
	}
	
}
