package com.yedam.oop;

public class Application03 {

	public static void main(String[] args) {
		Bycle bycle = new Bycle();
		
		bycle.setGas(5);
		
		boolean gasState = bycle.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다.");
			bycle.run();
		}
		
		if(bycle.isLeftGas()) {
			System.out.println("gas를 주입할 필요 없음.");
		}else {
			System.out.println("gas를 주입 해야 함");
		}
		
		
		
		
		
		
		
		Book buch = new Book("혼자 공부하는 자바", "학습서", 2400, 0001, "한빛미디어");
		
		buch.getInfo();
		
		
		//Student student = new Student("김또치", 20230201, 50,60,90);
		
		//student.getInfo();
		
		
		
		
		
		

	}

}
