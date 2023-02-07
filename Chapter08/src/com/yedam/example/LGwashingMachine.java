package com.yedam.example;

public class LGwashingMachine implements WashingMachine{

	int i;
	
	@Override
	public void dryFunction() {
		System.out.println("LG 건조 버튼");
		
	}

	@Override
	public void startBtn() {
		System.out.println("빨래시작");
		
	}

	@Override
	public void pauseBtn() {
		System.out.println("LG 세탁중지!");
		
	}

	@Override
	public void stopBtn() {
		System.out.println("LG 세탁종료!");
		
	}

	@Override
	public int speedControl(int speed) {
		int nowSpeed = 0;
		switch (speed) {
		case 1:
			nowSpeed = 20;
			break;
		case 2:
			nowSpeed = 50;
			break;
		case 3:
			nowSpeed = 100;
			break;
		}
		return nowSpeed;
	}


	void point() {
		
	}

}
