package com.yedam.API;

public class Student {
	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}
		
		public String getStudentNum() {
			return studentNum;
	}
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return studentNum.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student compare = (Student)obj;
			if(this.studentNum == compare.studentNum) {
				return true;
			}
		}
		return super.equals(obj);
	}

	
	
	
	
	
}
