package com.yedam.inheri;

public class Application05 {
	public static void main(String[] args) {
		
		Child child = new Child();
		child.lastName = "lee"
		
		
		
		
		
		
		
		
		
		
	}
	//parent class
	//child class
	//상속 -> firstName, getInfo()
	//	  -> getInfo() => 우리 성씨는 000입니다.
	//개잉ㄴ적으로 가지는 정보
	//lastName, 혈액형, 나이, 취미
	//데이터 초기화는 원하는 방식으로
	//child -> getInfo() -> 우리 성씨는 000입니다.
	//	 					내이름 : 000
	//	 					혈액형 : 000
	VIPPerson vip = new VIPPerson();
	vip.memberInfo();
	
}
