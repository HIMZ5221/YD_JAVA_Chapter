package com.yedam.access;

public class Member {
	//다음의 조건에 맞추어 Member 클래스를 작성 하세요.
	//어떠한 사이트 회원에 대한 정보를 담는 객체 생성 용도
	//아이디, 비밀번호, 이름, 나이
	//생성자는 기본생성자
	//private 사용
	//getter, setter 활용하여 정보를 읽고 저장할 수 있는 메소드
	
	//1) 나이를 입력할 때 데이터의 무결성을 지켜주기 위하여
	//	 0 보다 작은 수가 입력이 되면 0으로 나이를 변경 시켜준다.
	
	//2) 나이를 출력할때에는 입력한 값에 +1하여 출력
	
	
	//필드
	private String uId ;
	private String uPw ;
	private String uName;
	private int uAge;
	
	
	//생성자
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	//메소드
		public String getuId() {
			return uId;
		}
		public void setuId(String uId) {
			this.uId = uId;
		}
		public String getuPw() {
			return uPw;
		}
		public void setuPw(String uPw) {
			this.uPw = uPw;
		}
		public String getuName() {
			return uName;
		}
		public void setuName(String uName) {
			this.uName = uName;
		}
		public int getuAge() {
			return uAge;
		}
		public void setuAge(int uAge) {
//			if(uAge <= 0) {
//				uAge = 0;
//				return;
//			}
			
			this.uAge = (uAge < 0) ? 0 :  uAge;
			
			
		}

	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
