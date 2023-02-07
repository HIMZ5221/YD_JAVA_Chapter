package com.yedam.array;

public class Exam05 {

	public static void main(String[] args) {


		int[] array = {20,50,70,100,30,10,90,80};
		
		int max = 0;
		int x = 0;
		int y = 0;
		for(int i = 0;i<array.length;i++) {
			if(array[i] > max) {
				max = array[i];
				x = i;
			}
		}
		System.out.println(x);
		
		int min = array [0];
		for(int i = 0;i<array.length;i++) {
			if(array[i] < min) {
				min = array[i];
				y = i;
			}
		}
		System.out.println(y);
		
		for(int i=0; i<array.length;i++) {
			if(array[i]==max) {
				max = array[i];
				
			}
		}
		
		
	
		
		
		
		
		
		
		
		
	}

}


