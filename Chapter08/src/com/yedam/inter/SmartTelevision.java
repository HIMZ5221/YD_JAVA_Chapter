package com.yedam.inter;

public class SmartTelevision implements RemoteControl, Searchable{

	private int volume;
	
	
	@Override
	public void search(String url) {
		System.out.println(url + "검색한다");
		
	}

	@Override
	public void turnOn() {
		System.out.println("turn ON TV");
		
	}

	@Override
	public void turnOff() {
		System.out.println("turn OFF TV");
		
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		
	}

	
}
