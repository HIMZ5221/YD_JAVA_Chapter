package com.yedam.oop;

public class Student {

	//정보 - 학생이름, 학번, 국어.영어.수학 점수
	//필드
	String stdName;
	int stdNo;
	int kor;
	int eng;
	int math;
		
	//기본 생성자, 모든 데이터를 초기화 생성자
	public Student() {
		
	}
	
	public Student(String stdName, int stdNo, int kor, int eng, int math) {
		this.stdName = stdName;
		this.stdNo = stdNo;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	//학생의 정보를 출력해주는 getInfo() 메소드 생성
	void getInfo() {
		System.out.println("이름 : " + stdName);
		System.out.println("학번 : " + stdNo);
		System.out.println("총점 : " + sum());
		System.out.println("평균 : " + avg());
	}
	
	int sum() {
		return kor+eng+math;
	}
	
	double avg() {
		return sum()/3;
	}
	//sum()
	/*
	 * 이름 : 김또치
	 * 학번 : 20230201
	 * 총점 : 200
	 * 평균 : 68.xx
	 */
	
	//필드
//		String studentName;
//		int studentNo;
//		int sum ;
//		double avg ;
//	
	
	//생성자
		
//		public Student(String studentName, int studentNo, int sum, double avg) {
//			this.studentName = studentName;
//			this.studentNo = studentNo;
//			this.sum = sum;
//			this.avg = avg;
//		}
//			
//		
//	//메소드
//		void getInfo() {
//			System.out.println("이름 : " + studentName);
//			System.out.println("학번 : " + studentNo);
//			System.out.println("총점 : " + sum);
//			System.out.printf("평균 : %5.2f\t" , avg );
//		}
//	
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
