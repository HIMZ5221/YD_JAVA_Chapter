package com.yedam.example;

public class WashingExample {

	public static void main(String[] args) {
		LGwashingMachine LGws = new LGwashingMachine();
		LGws.startBtn();
		LGws.pauseBtn();
		System.out.println("세탁기 속도 : " + LGws.speedControl(3));
		LGws.startBtn();
		LGws.dryFunction();

	}

}
