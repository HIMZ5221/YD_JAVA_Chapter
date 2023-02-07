package com.yedma.loop;

import java.util.Scanner;

public class WhileExample {
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		
		//i가 5보다 작을때까지 합 구하기
		while(i<=5) {
			sum = sum + i;
			i++;
		}
		
		System.out.println(sum);
		
		//짝수 구하기
		i = 0;
		while (i<=100) {
			if(i%2 ==0) {
				System.out.println(i);
			}
			i++;
		}
		
		//계산기 프로그램
		
		boolean flag = true;
		
		Scanner sc = new Scanner(System.in);
		
		while(flag) {
			//메뉴 출력
			System.out.println("=======================");
			System.out.println("1. 더하기 | 4. 종료");
			System.out.println("입력>");
			//메뉴를 선택할 때 필요한 변수
			int no = Integer.parseInt(sc.nextLine());
			
			switch(no) {
			case 1 :
				System.out.println("더하고자하는 두개의 수 입력>");
				System.out.println("첫번째 값 입력");
				int num = Integer.parseInt(sc.nextLine());
				System.out.println("두번째 값 입력");
				int num2 = Integer.parseInt(sc.nextLine());
				System.out.println(num + ","+num2+"의 결과 : "+ (num+num2));
				break;
			case 4 :
				flag = false;
				System.out.println("end of prog");
				break;
			default:
				System.out.println("잘보고 고르시오 !");
				break;
			}
			
		}
		
		
		//Up & Down(1~100) -> 랜덤값 -> 사용자가 맞추는 게임
		//사용자가 입력한 값에 대해서 비교함.
		//사용자가 입력한 값보다 크면 up
		//사용자가 입력한 값보다 작으면 down
		//사용자가 몇번만에 값을 맞추었는지 프로그램을 구현
		
		//1. 스캐너
		//2. 랜덤값 추출
//===============================================================================게임		
//		int randomNo = (int)(Math.random()*100)+1;
//		int count = 0;
//		System.out.println("UP & DOWN");
//		
//		
//		for(int z = 1; z<=5; z++){
//			count += 1;
//			System.out.println("숫자>");
//			
//			int inputNo = Integer.parseInt(sc.nextLine());
//			
//			if(randomNo>inputNo) {
//				System.out.println("Up");
//			}else
//				System.out.println("Down");
//								
//			if(randomNo == inputNo) {
//				System.out.println("정답입니다.");
//				//반복문, 조건문 강제종료 시킬 때 사용.
//				break;
//			}
//			
//			
//		}
//		
//		System.out.println(count + "번만에 맞추셨습니다.");
		
		
//=============================================================================================
//		String word = "";
//		String addWord = "";
//		flag = true;
//		while(flag) {
//			System.out.println("문자 입력>");
//			//내가 입력한 문자열 저장
//			addWord = sc.nextLine();
//			//q 외에 데이터를 입력.. 데이터를 저장
//			//문자열 + 연산
//			if(!addWord.equals("q")) {
//				word += addWord;
//			}else {
//				flag = false;
//				System.out.println("종료");
//			}
//			
//			
//			//q를 입력한다면....
//		}
//		
//		System.out.println("입력한 문자>" + word);

//=================================================================================================
		
		int max = 0;
		
		while(true) {
			System.out.println("숫자 입력(종료 99)>");
			int number = Integer.parseInt(sc.nextLine());
			
			if (number == 99) {
				System.out.println("프로그램 종료");
				break;
			}
			//최대값 구하는 로직
			//비교하고자하는 값 > 최대값 =
			if(number > max)
				max = number;
		}
		
		
		System.out.println("최대값 : "+max);
		
		
		
		
		int low = 0;
		
		
		
		while (true) {
			System.out.println("==========================");
			System.out.println("최솟값을 안내합니다");
			System.out.println("숫자 입력(종료 99)");
			int number = Integer.parseInt(sc.nextLine());
			
			if (i == 0) {
				//내가 처음으로 넣은 데이터가 최대값이며 최소값이라는 가정
			}
			
			if(number == 99) {
				System.out.println("프로그램 고장! 종료합니다.");
				System.out.println("빠지직./..");
				break;
			}
			if(number < low || low == 0) {
				low = number;
			}
			
		}
		System.out.println(low);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
