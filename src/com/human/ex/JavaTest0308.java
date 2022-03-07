package com.human.ex;

import java.util.Scanner;

public class JavaTest0308 {

	
	public static void main(String[] args) {
		
//		문제1)
//		int age = 156;
//		String name = "hong";
//		double height = 175.3;
//		
//		System.out.println(String.format("%d", 156));
//		System.out.println(String.format("%s", name));
//		System.out.println(String.format("%f", height));
		
//		문제2)
//		Scanner sc = new Scanner(System.in);
//		System.out.print("첫번째 정수 : ");
//		int a = sc.nextInt();
//		System.out.print("두번째 정수 : ");
//		int b = sc.nextInt();
//		
//		int i = a/b;
//		int j = a%b;
//		
//		System.out.println(String.format("몫은 %d 이고, 나머지는 %d 이다.", i, j));
				
//		문제3)
//		Scanner sc = new Scanner(System.in);
//		System.out.print("3자리 숫자를 입력하세요 : ");
//		int a = sc.nextInt();
//		int i = a/100;
//		int j = (a-(i*100))/10;
//		int k = (a-(i*100))%10;
//		System.out.println(String.format("백의 자리:%d, 십의 자리:%d, 일의 자리:%d", i, j, k));
		
//		문제4)
		System.out.println(getDistance(1,1,2,2));

		
	}
	
	static double getDistance(int x, int y, int x1, int y1){

		return Math.sqrt(Math.pow(Math.abs(x1-x), 2) + Math.pow(Math.abs(y1-y), 2));

		}

	
}
