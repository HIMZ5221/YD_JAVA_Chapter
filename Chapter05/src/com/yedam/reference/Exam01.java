package com.yedam.reference;

import java.util.ArrayList;
import java.util.List;

public class Exam01 {
	public static void main(String [] args) {
		
		int intVal = 10; //dateType
		int[] array = {1,2,3}; //참조Type
		int[] array2 = {1,2,3};
		int[] array3 = null ;
		int a;
		
		System.out.println(intVal);
		System.out.println(array);
		System.out.println(array2);
		System.out.println(array[0] == array2[0]);
		
		//System.out.println(array3.length);
		//memory leak -> 메모리 누수, 메모리 부족
		List<String> temp = new ArrayList<>();
		
		while(true) {
			temp.add("abc");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
