package com.yedam.oop;

import java.util.Scanner;

public class Homework0202 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Product list[] = null;
		int productNo = 0; 
				
				
		boolean run = true;
		
		while(run) {
			System.out.println("1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료");
			System.out.println("선택>");
			int selectNo = Integer.parseInt(sc.nextLine());
			
			switch (selectNo){
				case 1:
					System.out.println("상품 수>");
					productNo = Integer.parseInt(sc.nextLine());
					list = new Product[productNo];
					break;
				case 2:
					for(int i=0; i<list.length; i++) {
						list[i] = new Product();
						System.out.println("상품명>");
						list[i].productName = sc.nextLine();
						System.out.println("가격>");
						list[i].price = Integer.parseInt(sc.nextLine());
						System.out.println("============================");
					}
					break;
				case 3:
					System.out.println("============================");
					for(Product product : list) {
						System.out.println("상품 명 : "+ product.productName);
						System.out.println("가격 : "+product.price);
						System.out.println("============================");
					}
					break;
				case 4:
					int max = list[0].price;
					int idx = 0;
					for(int i=1; i<list.length;	i++	) {
						if(list[i].price > max && i != 0) {
							max = list[i].price;
							idx = i;
						}
					}
					
					int sum = 0;
					for (Product product : list) {
						if(product.price == max) {
							continue;
						}
						sum += product.price;
					}
					
					System.out.println("최고 가격 제품명 : " + list[idx].productName);
					System.out.println("최고 가격을 제외한 제품가격의 합 : " + sum);
					
					break;
				case 5:
					run = false;
					System.out.println("end of program");
					break;
				default:
					System.out.println("없는 메뉴 선택하였습니다. \n맞는 메뉴를 선택해주세요");
					break;

			}
		}
		

	}

}
